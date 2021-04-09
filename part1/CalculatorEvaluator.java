import java.io.InputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class CalculatorEvaluator {

    private int lookaheadToken;
    private InputStream in;
    List<Integer> remaining;    // stores nums that weren't calculated during ** (term2)

    public CalculatorEvaluator(InputStream in) throws IOException
    {
        this.in = in;
        this.lookaheadToken = in.read();
        this.remaining = new ArrayList<>();
    }

    /** utilites functions **/

    private void consume(int symbol) throws IOException, ParseError
    {
        if (lookaheadToken != symbol)
            throw new ParseError("consume");

        lookaheadToken = in.read();
    }

    private int evalDigit(int digit) {  return digit - '0';  }

    public int calculateResult(int num, int num2, int sign) throws IOException, ParseError         //calculates a numerical expression and returns its result
    {
        if (sign == '+')
            return num + num2;
        else if (sign == '-')
            return num - num2;
        else if (sign == '*')
            return pow(num, num2);
        else
            throw new ParseError("calculateResult");
    }

    private static int pow(int base, int exponent) //piazza function for power
    {
        if (exponent < 0)
            return 0;
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;

        if (exponent % 2 == 0) //even exp -> b ^ exp = (b^2)^(exp/2)
            return pow(base * base, exponent/2);
        else                   //odd exp -> b ^ exp = b * (b^2)^(exp/2)
            return base * pow(base * base, exponent/2);
    }
    

    /** non-terminal functions **/
    
    private int expr() throws IOException, ParseError
    {
        int rv = term(-1, -1);
        return exp2(rv);
    }
    
    private int exp2(int num) throws IOException, ParseError
    {
        if (lookaheadToken != '+' && lookaheadToken != '-')
            return num;

        int sign = op();
        int num2 = term(num, sign);

        return exp2(calculateResult(num,num2,sign));
    }

    private int term(int num, int sign) throws IOException, ParseError
    {
        int num2 = factor(num, sign);

        if (num >= '0' && num <= '9')
            return term2(calculateResult(num, num2, sign));
        return  term2(num2);
    }

    private int term2(int num) throws IOException, ParseError
    {
        if (lookaheadToken != '*')  //when done with ** calculates every calculation that was ignored
        {
            while (!remaining.isEmpty())
            {
                int num1 = remaining.get(remaining.size()-1);
                remaining.remove(remaining.size()-1);
                num = calculateResult(num1, num, '*');
            }
            return num;
        }

        int sign = op();
        int num2 = factor(num, sign);

        if (lookaheadToken == '*') //if there is another ** ahead doesnt calculate result now
        {
            remaining.add(num);   //pushes num that wasn't calculated
            return term2(num2);
        }
        return term2(calculateResult(num, num2, sign));
    }
    
    private int factor(int num, int sign) throws IOException, ParseError
    {   
        int num2;
        if (lookaheadToken >= '0' && lookaheadToken <= '9')
            num2 = num();
        else
        {
            if (lookaheadToken != '(')
                throw new ParseError("factor");
            
            consume('(');
            num2 = expr();

            if (lookaheadToken != ')')
                throw new ParseError("factor");
            consume(')');
        }

        if (num >= '0' && num <= '9')
            return calculateResult(num, num2, sign);
        return num2;
    }
    
    private int op() throws IOException, ParseError 
    {
        if (lookaheadToken != '+' && lookaheadToken != '-' && lookaheadToken != '*')
            throw new ParseError("op");
        
        int sign = lookaheadToken;
        consume(sign);
        
        if (sign == '*') //needs 2nd *
        {
            if (lookaheadToken != '*')
                throw new ParseError("op");
            
            consume('*');
        }
        return sign;
    }
    
    private int num() throws IOException, ParseError
    {
        int num = first_digit();
        return moreDigits(num);
    }
    
    private int moreDigits(int num) throws IOException, ParseError {
        if (lookaheadToken < '0' || lookaheadToken > '9')
            return num;

        num = num*10 + digit();  //builds int

        if (lookaheadToken < '0' || lookaheadToken > '9')
            return num;
        else
            return moreDigits(num);
    }
    
    private int digit() throws IOException, ParseError
    {
        if (lookaheadToken < '0' || lookaheadToken > '9')
            throw new ParseError("digit");

        int num = lookaheadToken;
        consume(num);

        return evalDigit(num);  //returns its int value
    }

    //1st digit of int. to throw parse error when a num starts with 0
    private int first_digit() throws IOException, ParseError
    {
        if (lookaheadToken <= '0' || lookaheadToken > '9')
            throw new ParseError("first_digit");

        int num = lookaheadToken;
        consume(num);

        return evalDigit(num);  //returns its int value
    }
    

    /** function that starts parsing **/
    public int parse() throws IOException, ParseError
    {
        int res = expr();

        if (lookaheadToken != '\n' && lookaheadToken != -1)
            throw new ParseError("parse");

        if (lookaheadToken == -1)
            System.out.println();

        return res;
    }

    /** main **/
    public static void main(String[] args)
    {
        try
        {
            CalculatorEvaluator parser = new CalculatorEvaluator(System.in);
            System.out.println(parser.parse());
        }
        catch (IOException | ParseError e)
        {
            System.err.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}