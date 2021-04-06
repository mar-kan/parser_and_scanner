
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141202 (SVN rev 60)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141202 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\002\004\000\002\002\004\000\002\012" +
    "\004\000\002\012\002\000\002\011\003\000\002\004\005" +
    "\000\002\004\002\000\002\003\005\000\002\003\003\000" +
    "\002\003\003\000\002\003\005\000\002\003\003\000\002" +
    "\003\003\000\002\005\005\000\002\005\005\000\002\006" +
    "\011\000\002\007\011\000\002\007\002\000\002\014\006" +
    "\000\002\013\003\000\002\013\005\000\002\013\002\000" +
    "\002\010\003\000\002\010\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\055\000\014\002\ufff0\010\ufff0\012\ufff0\020\ufff0\021" +
    "\004\001\002\000\004\012\052\001\002\000\014\002\ufffb" +
    "\010\ufffb\012\ufffb\020\ufffb\021\ufffb\001\002\000\004\002" +
    "\007\001\002\000\004\002\000\001\002\000\004\002\001" +
    "\001\002\000\014\002\ufffd\010\013\012\021\020\012\021" +
    "\014\001\002\000\020\004\uffea\005\uffea\006\uffea\007\uffea" +
    "\011\uffea\013\uffea\017\uffea\001\002\000\004\012\043\001" +
    "\002\000\020\004\uffeb\005\uffeb\006\uffeb\007\uffeb\011\uffeb" +
    "\012\034\013\uffeb\001\002\000\016\004\ufff6\005\ufff6\006" +
    "\ufff6\007\ufff6\011\ufff6\013\ufff6\001\002\000\016\004\ufff8" +
    "\005\ufff8\006\ufff8\007\ufff8\011\ufff8\013\ufff8\001\002\000" +
    "\012\004\033\005\025\006\026\007\027\001\002\000\016" +
    "\004\ufff5\005\ufff5\006\ufff5\007\ufff5\011\ufff5\013\ufff5\001" +
    "\002\000\012\010\013\012\021\020\012\021\014\001\002" +
    "\000\016\004\ufff9\005\ufff9\006\ufff9\007\ufff9\011\ufff9\013" +
    "\ufff9\001\002\000\012\005\025\006\026\007\027\013\024" +
    "\001\002\000\016\004\ufff7\005\ufff7\006\ufff7\007\ufff7\011" +
    "\ufff7\013\ufff7\001\002\000\012\010\013\012\021\020\012" +
    "\021\014\001\002\000\012\010\013\012\021\020\012\021" +
    "\014\001\002\000\012\010\013\012\021\020\012\021\014" +
    "\001\002\000\016\004\ufff3\005\ufff3\006\ufff3\007\ufff3\011" +
    "\ufff3\013\ufff3\001\002\000\016\004\ufff4\005\ufff4\006\ufff4" +
    "\007\ufff4\011\ufff4\013\ufff4\001\002\000\016\004\ufffa\005" +
    "\ufffa\006\ufffa\007\ufffa\011\ufffa\013\ufffa\001\002\000\016" +
    "\002\ufffc\010\ufffc\012\ufffc\015\ufffc\020\ufffc\021\ufffc\001" +
    "\002\000\012\013\uffec\017\uffec\020\012\021\035\001\002" +
    "\000\006\013\uffeb\017\uffeb\001\002\000\006\013\041\017" +
    "\040\001\002\000\006\013\uffee\017\uffee\001\002\000\006" +
    "\020\012\021\035\001\002\000\016\004\uffef\005\uffef\006" +
    "\uffef\007\uffef\011\uffef\013\uffef\001\002\000\006\013\uffed" +
    "\017\uffed\001\002\000\012\010\013\012\021\020\012\021" +
    "\014\001\002\000\010\005\025\006\026\007\027\001\002" +
    "\000\012\005\ufff9\006\ufff9\007\ufff9\013\046\001\002\000" +
    "\012\010\013\012\021\020\012\021\014\001\002\000\012" +
    "\005\025\006\026\007\027\011\050\001\002\000\012\010" +
    "\013\012\021\020\012\021\014\001\002\000\016\004\ufff2" +
    "\005\025\006\026\007\027\011\ufff2\013\ufff2\001\002\000" +
    "\012\013\uffec\017\uffec\020\012\021\035\001\002\000\006" +
    "\013\054\017\040\001\002\000\004\014\055\001\002\000" +
    "\014\010\ufffb\012\ufffb\015\ufffb\020\ufffb\021\ufffb\001\002" +
    "\000\014\010\013\012\021\015\057\020\012\021\014\001" +
    "\002\000\014\002\ufff1\010\ufff1\012\ufff1\020\ufff1\021\ufff1" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\055\000\006\002\005\007\004\001\001\000\002\001" +
    "\001\000\006\004\010\011\007\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\014\003\016\005" +
    "\021\006\015\010\017\014\014\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\003\022\005\021\006\015\010\017\014\014\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\003\031\005\021\006\015\010\017\014\014\001\001\000" +
    "\014\003\030\005\021\006\015\010\017\014\014\001\001" +
    "\000\014\003\027\005\021\006\015\010\017\014\014\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\010\036\013\035\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\041\001\001\000\002\001\001\000\002\001\001\000" +
    "\014\003\043\005\044\006\015\010\017\014\014\001\001" +
    "\000\002\001\001\000\002\001\001\000\014\003\046\005" +
    "\021\006\015\010\017\014\014\001\001\000\002\001\001" +
    "\000\014\003\050\005\021\006\015\010\017\014\014\001" +
    "\001\000\002\001\001\000\006\010\036\013\052\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\055\001" +
    "\001\000\014\003\016\005\021\006\015\010\017\014\014" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return s.next_token(); 
    }


    // Connect this parser to a scanner!
    Scanner s;
    Parser(Scanner s){ this.s=s; }

    void print(String s)
    {
        System.out.println(s);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // start_prog ::= funct_decl main_prog 
            {
              Object RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int mainleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int mainright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String main = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                  print("\n\npublic class Main {");
                  print(String.format("\t%s\n\t%s\n}", main, f));
                  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("start_prog",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= start_prog EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // funct_list ::= funct_list funct_decl 
            {
              String RESULT =null;
		int restleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int restright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String rest = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = String.format("%s\n\t%s\n", rest, d);   
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("funct_list",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // funct_list ::= 
            {
              String RESULT =null;
		 RESULT = "";                                     
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("funct_list",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // main_prog ::= expr_list 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
			    RESULT = String.format("public static void main(String[] args) {\n%s\t\n\t}\n", e);
			    
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("main_prog",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr_list ::= expr_list expr SEMI 
            {
              String RESULT =null;
		int restleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int restright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String rest = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = String.format("%s\t\t%s;\n", rest, e);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_list",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr_list ::= 
            {
              String RESULT =null;
		 RESULT = "";                                     
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr_list",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr CONCAT expr 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = String.format("%s + %s", e1, e2);       
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= logic_expr 
            {
              String RESULT =null;
		int leleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int leright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String le = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = String.format("%s", le);                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= if_expr 
            {
              String RESULT =null;
		int ieleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int ieright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String ie = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = String.format("%s", ie);                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= LPAREN expr RPAREN 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = String.format("(%s)", e);               
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= funct_call 
            {
              String RESULT =null;
		int fcleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fcright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String fc = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = String.format("%s", fc);                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= value 
            {
              String RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = String.format("%s", v);                 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // logic_expr ::= expr PREFIX expr 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = String.format("%s.is-prefix-of(%s)", e1, e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("logic_expr",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // logic_expr ::= expr SUFFIX expr 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = String.format("%s.is-suffix-of(%s)", e1, e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("logic_expr",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // if_expr ::= IF LPAREN logic_expr RPAREN expr ELSE expr 
            {
              String RESULT =null;
		int leleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int leright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		String le = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = String.format("if (%s)\n\t\t\t%s;\n\t\t else\n\t\t\t%s", le, e1, e2);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("if_expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // funct_decl ::= ID LPAREN argu_list RPAREN LBRACKET expr_list RBRACKET 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int argsleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int argsright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		String args = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
                RESULT = String.format("public static String %s(%s) {\n%s\n\t}", id, args, e);
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("funct_decl",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // funct_decl ::= 
            {
              String RESULT =null;
		 RESULT = String.format(""); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("funct_decl",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // funct_call ::= ID LPAREN argu_list RPAREN 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int argsleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int argsright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String args = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
                RESULT = String.format("System.out.println(%s(%s))", id, args);
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("funct_call",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // argu_list ::= value 
            {
              String RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = String.format("%s", v);                 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("argu_list",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // argu_list ::= argu_list COMMA value 
            {
              String RESULT =null;
		int restleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int restright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String rest = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = String.format("%s, %s", rest, v);       
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("argu_list",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // argu_list ::= 
            {
              String RESULT =null;
		 RESULT = "";                                     
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("argu_list",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // value ::= ID 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = String.format("%s", id);                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // value ::= STRING_LITERAL 
            {
              String RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = String.format("\"%s\"", s);             
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
