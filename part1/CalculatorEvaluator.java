import java.io.InputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class CalculatorEvaluator {

    private int lookahead;
    private final InputStream in;
    List<Integer> remaining;    // stores nums that weren't calculated during ** (term2)

    public CalculatorEvaluator(InputStream in) throws IOException
    {
        this.in = in;
        this.lookahead = in.read();
        this.remaining = new ArrayList<>();
    }

    /** utilities functions **/

    private void consume(int symbol) throws IOException, ParseError
    {
        if (lookahead != symbol)
            throw new ParseError("consume");

        lookahead = in.read();
    }

    private boolean isDigit(int c) { return '0'<=c && c<= '9';}

    private int evalDigit(int digit) {  return digit - '0';  }

    public int calculateResult(int num1, int num2, int sign) throws ParseError         //calculates a numerical expression and returns its result
    {
        if (sign == '+')
            return num1 + num2;
        else if (sign == '-')
            return num1 - num2;
        else if (sign == '*')
            return pow(num1, num2);
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
        return exp2(term(-1, -1));
    }
    
    private int exp2(int num1) throws IOException, ParseError
    {
        if (lookahead != '+' && lookahead != '-')
            return num1;

        int sign = op();
        int num2 = term(num1, sign);

        return exp2(calculateResult(num1,num2,sign));
    }

    private int term(int num1, int sign) throws IOException, ParseError
    {
        int num2 = factor(num1, sign);

        if (num1 >= '0' && num1 <= '9')
            return term2(calculateResult(num1, num2, sign));
        return  term2(num2);
    }

    private int term2(int num1) throws IOException, ParseError
    {
        if (lookahead != '*')  //when done with ** calculates every calculation that was ignored
        {
            while (!remaining.isEmpty())
            {
                int num2 = remaining.get(remaining.size()-1);
                remaining.remove(remaining.size()-1);
                num1 = calculateResult(num2, num1, '*');
            }
            return num1;
        }

        int sign = op();
        int num2 = factor(num1, sign);

        if (lookahead == '*') //if there is another ** ahead doesnt calculate result now
        {
            remaining.add(num1);   //pushes num that wasn't calculated
            return term2(num2);
        }
        return term2(calculateResult(num1, num2, sign));
    }
    
    private int factor(int num1, int sign) throws IOException, ParseError
    {   
        int num2;
        if (lookahead >= '0' && lookahead <= '9')
            num2 = start_num();
        else
        {
            if (lookahead != '(')
                throw new ParseError("factor");
            
            consume('(');
            num2 = expr();

            if (lookahead != ')')
                throw new ParseError("factor");
            consume(')');
        }

        if (num1 >= '0' && num1 <= '9')
            return calculateResult(num1, num2, sign);
        return num2;
    }
    
    private int op() throws IOException, ParseError 
    {
        if (lookahead != '+' && lookahead != '-' && lookahead != '*')
            throw new ParseError("op");
        
        int sign = lookahead;
        consume(sign);
        
        if (sign == '*') //needs 2nd *
        {
            if (lookahead != '*')
                throw new ParseError("op");
            
            consume('*');
        }
        return sign;
    }

    private int start_num() throws IOException, ParseError
    {
        int digit1 = first_digit();
        if (digit1 == 0)
            return 0;
        return moreDigits(digit1);
    }

    private int num(int number) throws IOException, ParseError
    {
        return moreDigits(number);
    }
    
    private int moreDigits(int number) throws IOException, ParseError {
        if (!isDigit(lookahead))
            return number;

        number = number*10 + digit();  //builds int

        if (!isDigit(lookahead))
            return number;
        else
            return num(number);
    }
    
    private int digit() throws IOException, ParseError
    {
        if (!isDigit(lookahead))
            throw new ParseError("digit");

        int number = lookahead;
        consume(number);

        return evalDigit(number);  //returns its int value
    }

    //1st digit of num. to throw parse error when a num starts with 0
    private int first_digit() throws IOException, ParseError
    {
        if (!isDigit(lookahead))
            throw new ParseError("first_digit");

        int number = lookahead;
        consume(number);

        return evalDigit(number);  //returns its int value
    }
    

    /** function that starts parsing **/
    public int parse() throws IOException, ParseError
    {
        int res = expr();

        if (lookahead != '\n' && lookahead != -1)
            throw new ParseError("parse");

        if (lookahead == -1)
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