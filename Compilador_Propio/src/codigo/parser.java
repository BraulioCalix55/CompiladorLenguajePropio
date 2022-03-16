
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Mar 16 13:36:41 CST 2022
//----------------------------------------------------

package codigo;

import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Mar 16 13:36:41 CST 2022
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\044\000\002\002\004\000\002\002\006\000\002\022" +
    "\002\000\002\010\005\000\002\010\004\000\002\010\004" +
    "\000\002\010\004\000\002\010\004\000\002\010\004\000" +
    "\002\010\002\000\002\023\002\000\002\012\012\000\002" +
    "\024\002\000\002\021\007\000\002\021\006\000\002\021" +
    "\006\000\002\021\006\000\002\025\002\000\002\013\014" +
    "\000\002\026\002\000\002\011\007\000\002\016\003\000" +
    "\002\016\005\000\002\016\002\000\002\027\002\000\002" +
    "\003\012\000\002\014\005\000\002\014\005\000\002\014" +
    "\003\000\002\015\005\000\002\017\003\000\002\017\003" +
    "\000\002\007\003\000\002\007\003\000\002\007\003\000" +
    "\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\122\000\004\010\004\001\002\000\004\021\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\022\014\ufff7\016\uffe9\022\ufff8\033\ufff0\046\uffff\047" +
    "\uffff\050\uffff\052\uffee\001\002\000\022\014\ufff7\016\uffe9" +
    "\022\ufff8\033\ufff0\046\uffff\047\uffff\050\uffff\052\uffee\001" +
    "\002\000\004\016\115\001\002\000\004\052\106\001\002" +
    "\000\004\033\075\001\002\000\022\014\ufff7\016\uffe9\022" +
    "\ufff8\033\ufff0\046\uffff\047\uffff\050\uffff\052\uffee\001\002" +
    "\000\004\014\047\001\002\000\010\046\ufff5\047\030\050" +
    "\032\001\002\000\022\014\ufff7\016\uffe9\022\ufff8\033\ufff0" +
    "\046\uffff\047\uffff\050\uffff\052\uffee\001\002\000\022\014" +
    "\ufff7\016\uffe9\022\ufff8\033\ufff0\046\uffff\047\uffff\050\uffff" +
    "\052\uffee\001\002\000\022\014\ufff7\016\uffe9\022\ufff8\033" +
    "\ufff0\046\uffff\047\uffff\050\uffff\052\uffee\001\002\000\004" +
    "\022\023\001\002\000\004\002\000\001\002\000\004\022" +
    "\ufff9\001\002\000\004\022\ufffa\001\002\000\004\022\ufffc" +
    "\001\002\000\004\046\043\001\002\000\004\052\040\001" +
    "\002\000\022\014\ufff7\016\uffe9\022\ufff8\033\ufff0\046\uffff" +
    "\047\uffff\050\uffff\052\uffee\001\002\000\004\052\033\001" +
    "\002\000\004\051\034\001\002\000\006\044\035\045\036" +
    "\001\002\000\022\014\ufff2\016\ufff2\022\ufff2\033\ufff2\046" +
    "\ufff2\047\ufff2\050\ufff2\052\ufff2\001\002\000\022\014\ufff3" +
    "\016\ufff3\022\ufff3\033\ufff3\046\ufff3\047\ufff3\050\ufff3\052" +
    "\ufff3\001\002\000\004\022\ufffe\001\002\000\004\051\041" +
    "\001\002\000\004\043\042\001\002\000\022\014\ufff1\016" +
    "\ufff1\022\ufff1\033\ufff1\046\ufff1\047\ufff1\050\ufff1\052\ufff1" +
    "\001\002\000\004\052\044\001\002\000\004\051\045\001" +
    "\002\000\004\013\046\001\002\000\022\014\ufff4\016\ufff4" +
    "\022\ufff4\033\ufff4\046\ufff4\047\ufff4\050\ufff4\052\ufff4\001" +
    "\002\000\004\017\050\001\002\000\012\013\052\044\054" +
    "\045\057\052\056\001\002\000\010\011\070\020\uffe5\025" +
    "\071\001\002\000\016\006\uffe1\007\uffe1\011\uffe1\020\uffe1" +
    "\025\uffe1\027\uffe1\001\002\000\004\020\064\001\002\000" +
    "\016\006\uffdf\007\uffdf\011\uffdf\020\uffdf\025\uffdf\027\uffdf" +
    "\001\002\000\006\007\060\027\062\001\002\000\016\006" +
    "\uffde\007\uffde\011\uffde\020\uffde\025\uffde\027\uffde\001\002" +
    "\000\016\006\uffe0\007\uffe0\011\uffe0\020\uffe0\025\uffe0\027" +
    "\uffe0\001\002\000\012\013\uffe2\044\uffe2\045\uffe2\052\uffe2" +
    "\001\002\000\012\013\052\044\054\045\057\052\056\001" +
    "\002\000\012\013\uffe3\044\uffe3\045\uffe3\052\uffe3\001\002" +
    "\000\010\011\uffe4\020\uffe4\025\uffe4\001\002\000\004\021" +
    "\065\001\002\000\022\014\ufff7\016\uffe9\022\ufff8\033\ufff0" +
    "\046\uffff\047\uffff\050\uffff\052\uffee\001\002\000\004\022" +
    "\067\001\002\000\022\014\ufff6\016\ufff6\022\ufff6\033\ufff6" +
    "\046\ufff6\047\ufff6\050\ufff6\052\ufff6\001\002\000\012\013" +
    "\052\044\054\045\057\052\056\001\002\000\012\013\052" +
    "\044\054\045\057\052\056\001\002\000\004\020\uffe7\001" +
    "\002\000\004\020\uffe6\001\002\000\004\022\ufffd\001\002" +
    "\000\004\017\076\001\002\000\004\013\077\001\002\000" +
    "\004\036\100\001\002\000\004\013\101\001\002\000\004" +
    "\020\102\001\002\000\004\021\103\001\002\000\022\014" +
    "\ufff7\016\uffe9\022\ufff8\033\ufff0\046\uffff\047\uffff\050\uffff" +
    "\052\uffee\001\002\000\004\022\105\001\002\000\022\014" +
    "\uffef\016\uffef\022\uffef\033\uffef\046\uffef\047\uffef\050\uffef" +
    "\052\uffef\001\002\000\004\017\107\001\002\000\014\013" +
    "\052\020\uffea\044\054\045\057\052\056\001\002\000\006" +
    "\006\113\020\uffec\001\002\000\004\020\112\001\002\000" +
    "\022\014\uffed\016\uffed\022\uffed\033\uffed\046\uffed\047\uffed" +
    "\050\uffed\052\uffed\001\002\000\014\013\052\020\uffea\044" +
    "\054\045\057\052\056\001\002\000\004\020\uffeb\001\002" +
    "\000\004\017\116\001\002\000\012\013\052\044\054\045" +
    "\057\052\056\001\002\000\004\020\120\001\002\000\004" +
    "\021\121\001\002\000\022\014\ufff7\016\uffe9\022\ufff8\033" +
    "\ufff0\046\uffff\047\uffff\050\uffff\052\uffee\001\002\000\004" +
    "\022\123\001\002\000\022\014\uffe8\016\uffe8\022\uffe8\033" +
    "\uffe8\046\uffe8\047\uffe8\050\uffe8\052\uffe8\001\002\000\004" +
    "\022\ufffb\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\122\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\030\003\007\004\020" +
    "\010\021\011\017\012\016\013\013\022\015\023\014\025" +
    "\012\026\011\027\010\001\001\000\030\003\007\004\020" +
    "\010\123\011\017\012\016\013\013\022\015\023\014\025" +
    "\012\026\011\027\010\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\030\003\007\004\020\010" +
    "\073\011\017\012\016\013\013\022\015\023\014\025\012" +
    "\026\011\027\010\001\001\000\002\001\001\000\006\021" +
    "\030\024\026\001\001\000\030\003\007\004\020\010\025" +
    "\011\017\012\016\013\013\022\015\023\014\025\012\026" +
    "\011\027\010\001\001\000\030\003\007\004\020\010\024" +
    "\011\017\012\016\013\013\022\015\023\014\025\012\026" +
    "\011\027\010\001\001\000\030\003\007\004\020\010\023" +
    "\011\017\012\016\013\013\022\015\023\014\025\012\026" +
    "\011\027\010\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\030\003\007\004\020" +
    "\010\036\011\017\012\016\013\013\022\015\023\014\025" +
    "\012\026\011\027\010\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\007\054\014\052\015\050\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\017\060\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\062\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\030\003\007\004" +
    "\020\010\065\011\017\012\016\013\013\022\015\023\014" +
    "\025\012\026\011\027\010\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\007\054\014\072\015\050\001\001" +
    "\000\010\007\054\014\071\015\050\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\030\003\007\004\020" +
    "\010\103\011\017\012\016\013\013\022\015\023\014\025" +
    "\012\026\011\027\010\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\007\107\016\110\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\007\107\016\113\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\007\054\014\116\015\050\001\001" +
    "\000\002\001\001\000\002\001\001\000\030\003\007\004" +
    "\020\010\121\011\017\012\016\013\013\022\015\023\014" +
    "\025\012\026\011\027\010\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



private Symbol s;
    public void syntax_error(Symbol s){
        this.s = s;
    }
    public Symbol getS(){
        return this.s;
}


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // VALOR ::= TKN_ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VALOR",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // VALOR ::= TKN_FALSE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VALOR",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // VALOR ::= TKN_TRUE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VALOR",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // VALOR ::= TKN_DIGITO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VALOR",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // OPCONDICION ::= TKN_IGUAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OPCONDICION",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // OPCONDICION ::= TKN_OPREL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OPCONDICION",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // CONDICIONP ::= VALOR OPCONDICION VALOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONDICIONP",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // CONDICION ::= CONDICIONP 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONDICION",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // CONDICION ::= CONDICIONP TKN_OR CONDICION 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONDICION",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // CONDICION ::= CONDICIONP TKN_AND CONDICION 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONDICION",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // WHILE ::= NT$5 TKN_WHILE TKN_PARENTESISI CONDICION TKN_PARENTESISD TKN_LLAVEIZ STATEMENTS TKN_LLAVEDER 
            {
              Object RESULT =null;
              // propagate RESULT from NT$5
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int wleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int wright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Object w = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("WHILE",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // NT$5 ::= 
            {
              Object RESULT =null;
                System.out.println("DENTRO DE WHILE"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$5",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // LISTA_ARGS ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA_ARGS",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // LISTA_ARGS ::= VALOR TKN_COMA LISTA_ARGS 
            {
              Object RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA_ARGS",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // LISTA_ARGS ::= VALOR 
            {
              Object RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA_ARGS",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // LLAMADO ::= NT$4 TKN_ID TKN_PARENTESISI LISTA_ARGS TKN_PARENTESISD 
            {
              Object RESULT =null;
              // propagate RESULT from NT$4
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LLAMADO",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // NT$4 ::= 
            {
              Object RESULT =null;
                System.out.println("DENTRO DE LLAMADO");

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$4",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // FOR ::= NT$3 TKN_FOR TKN_PARENTESISI TKN_DIGITO TKN_DOSPUNTOS TKN_DIGITO TKN_PARENTESISD TKN_LLAVEIZ STATEMENTS TKN_LLAVEDER 
            {
              Object RESULT =null;
              // propagate RESULT from NT$3
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-9)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FOR",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // NT$3 ::= 
            {
              Object RESULT =null;
                System.out.println("DENTRO DE FOR"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$3",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLARACION ::= TKN_CHAR TKN_ID TKN_ASIGNACCION TKN_LETRA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DECLARACION",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // DECLARACION ::= TKN_BOOLEAN TKN_ID TKN_ASIGNACCION TKN_FALSE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DECLARACION",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // DECLARACION ::= TKN_BOOLEAN TKN_ID TKN_ASIGNACCION TKN_TRUE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DECLARACION",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // DECLARACION ::= NT$2 TKN_INT TKN_ID TKN_ASIGNACCION TKN_DIGITO 
            {
              Object RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DECLARACION",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // NT$2 ::= 
            {
              Object RESULT =null;
                System.out.println("DENTRO DE DECLARACION");

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$2",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // IF ::= NT$1 TKN_IF TKN_PARENTESISI CONDICION TKN_PARENTESISD TKN_LLAVEIZ STATEMENTS TKN_LLAVEDER 
            {
              Object RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("IF",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // NT$1 ::= 
            {
              Object RESULT =null;
                System.out.println("DENTRO DE IF");

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // STATEMENTS ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STATEMENTS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // STATEMENTS ::= FUNCION STATEMENTS 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STATEMENTS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // STATEMENTS ::= LLAMADO STATEMENTS 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STATEMENTS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // STATEMENTS ::= WHILE STATEMENTS 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STATEMENTS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // STATEMENTS ::= IF STATEMENTS 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STATEMENTS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // STATEMENTS ::= FOR STATEMENTS 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STATEMENTS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // STATEMENTS ::= NT$0 DECLARACION STATEMENTS 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STATEMENTS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // NT$0 ::= 
            {
              Object RESULT =null;
                System.out.println("DENTRO DE statements");

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= TKN_MAIN TKN_LLAVEIZ STATEMENTS TKN_LLAVEDER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

