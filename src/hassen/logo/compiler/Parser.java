
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Apr 16 14:31:23 CEST 2018
//----------------------------------------------------

package hassen.logo.compiler;

import hassen.logo.factory.LogoFactory;
import hassen.ast.Node;
import hassen.ast.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Apr 16 14:31:23 CEST 2018
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\052\000\002\002\003\000\002\002\004\000\002\003" +
    "\002\000\002\003\004\000\002\004\004\000\002\004\003" +
    "\000\002\006\002\000\002\006\006\000\002\006\003\000" +
    "\002\006\004\000\002\006\004\000\002\006\004\000\002" +
    "\006\004\000\002\006\004\000\002\006\004\000\002\006" +
    "\006\000\002\006\004\000\002\006\004\000\002\006\005" +
    "\000\002\006\004\000\002\006\006\000\002\006\005\000" +
    "\002\005\002\000\002\005\005\000\002\011\002\000\002" +
    "\011\003\000\002\010\005\000\002\010\005\000\002\010" +
    "\005\000\002\010\005\000\002\010\005\000\002\010\004" +
    "\000\002\010\004\000\002\010\003\000\002\010\003\000" +
    "\002\007\007\000\002\007\003\000\002\013\002\000\002" +
    "\013\003\000\002\012\003\000\002\012\005\000\002\015" +
    "\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\115\000\044\002\uffff\005\uffff\006\uffff\007\uffff\010" +
    "\uffff\011\uffff\012\uffff\013\uffff\014\uffff\015\uffff\016\uffff" +
    "\017\uffff\022\uffff\027\uffff\030\uffff\037\uffff\041\uffff\001" +
    "\002\000\004\002\117\001\002\000\044\002\001\005\020" +
    "\006\010\007\012\010\016\011\025\012\021\013\022\014" +
    "\007\015\013\016\027\017\024\022\014\027\017\030\ufffb" +
    "\037\026\041\011\001\002\000\004\030\116\001\002\000" +
    "\006\020\114\021\115\001\002\000\014\004\032\005\030" +
    "\023\033\024\031\033\034\001\002\000\004\005\106\001" +
    "\002\000\004\030\ufff9\001\002\000\014\004\032\005\030" +
    "\023\033\024\031\033\034\001\002\000\004\005\075\001" +
    "\002\000\044\002\ufffc\005\ufffc\006\ufffc\007\ufffc\010\ufffc" +
    "\011\ufffc\012\ufffc\013\ufffc\014\ufffc\015\ufffc\016\ufffc\017" +
    "\ufffc\022\ufffc\027\ufffc\030\ufffc\037\ufffc\041\ufffc\001\002" +
    "\000\016\004\032\005\030\023\033\024\031\030\uffe9\033" +
    "\034\001\002\000\014\004\032\005\030\023\033\024\031" +
    "\033\034\001\002\000\004\032\064\001\002\000\016\004" +
    "\032\005\030\023\033\024\031\030\uffe9\033\034\001\002" +
    "\000\016\004\032\005\030\023\033\024\031\030\uffe9\033" +
    "\034\001\002\000\044\002\ufffe\005\ufffe\006\ufffe\007\ufffe" +
    "\010\ufffe\011\ufffe\012\ufffe\013\ufffe\014\ufffe\015\ufffe\016" +
    "\ufffe\017\ufffe\022\ufffe\027\ufffe\030\ufffe\037\ufffe\041\ufffe" +
    "\001\002\000\014\004\032\005\030\023\033\024\031\033" +
    "\034\001\002\000\016\004\032\005\030\023\033\024\031" +
    "\030\uffe9\033\034\001\002\000\014\004\032\005\030\023" +
    "\033\024\031\033\034\001\002\000\016\004\032\005\030" +
    "\023\033\024\031\030\uffe9\033\034\001\002\000\056\005" +
    "\uffdf\006\uffdf\007\uffdf\010\uffdf\011\uffdf\012\uffdf\013\uffdf" +
    "\014\uffdf\015\uffdf\016\uffdf\017\uffdf\022\uffdf\023\uffdf\024" +
    "\uffdf\025\uffdf\026\uffdf\027\uffdf\030\uffdf\031\uffdf\034\uffdf" +
    "\037\uffdf\040\uffdf\001\002\000\014\004\032\005\030\023" +
    "\033\024\031\033\034\001\002\000\056\005\uffe0\006\uffe0" +
    "\007\uffe0\010\uffe0\011\uffe0\012\uffe0\013\uffe0\014\uffe0\015" +
    "\uffe0\016\uffe0\017\uffe0\022\uffe0\023\uffe0\024\uffe0\025\uffe0" +
    "\026\uffe0\027\uffe0\030\uffe0\031\uffe0\034\uffe0\037\uffe0\040" +
    "\uffe0\001\002\000\014\004\032\005\030\023\033\024\031" +
    "\033\034\001\002\000\014\004\032\005\030\023\033\024" +
    "\031\033\034\001\002\000\004\030\ufff1\001\002\000\014" +
    "\023\041\024\037\025\040\026\042\030\uffe8\001\002\000" +
    "\014\004\032\005\030\023\033\024\031\033\034\001\002" +
    "\000\014\004\032\005\030\023\033\024\031\033\034\001" +
    "\002\000\014\004\032\005\030\023\033\024\031\033\034" +
    "\001\002\000\014\004\032\005\030\023\033\024\031\033" +
    "\034\001\002\000\056\005\uffe3\006\uffe3\007\uffe3\010\uffe3" +
    "\011\uffe3\012\uffe3\013\uffe3\014\uffe3\015\uffe3\016\uffe3\017" +
    "\uffe3\022\uffe3\023\uffe3\024\uffe3\025\uffe3\026\uffe3\027\uffe3" +
    "\030\uffe3\031\uffe3\034\uffe3\037\uffe3\040\uffe3\001\002\000" +
    "\056\005\uffe6\006\uffe6\007\uffe6\010\uffe6\011\uffe6\012\uffe6" +
    "\013\uffe6\014\uffe6\015\uffe6\016\uffe6\017\uffe6\022\uffe6\023" +
    "\uffe6\024\uffe6\025\040\026\042\027\uffe6\030\uffe6\031\uffe6" +
    "\034\uffe6\037\uffe6\040\uffe6\001\002\000\056\005\uffe4\006" +
    "\uffe4\007\uffe4\010\uffe4\011\uffe4\012\uffe4\013\uffe4\014\uffe4" +
    "\015\uffe4\016\uffe4\017\uffe4\022\uffe4\023\uffe4\024\uffe4\025" +
    "\uffe4\026\uffe4\027\uffe4\030\uffe4\031\uffe4\034\uffe4\037\uffe4" +
    "\040\uffe4\001\002\000\056\005\uffe5\006\uffe5\007\uffe5\010" +
    "\uffe5\011\uffe5\012\uffe5\013\uffe5\014\uffe5\015\uffe5\016\uffe5" +
    "\017\uffe5\022\uffe5\023\uffe5\024\uffe5\025\040\026\042\027" +
    "\uffe5\030\uffe5\031\uffe5\034\uffe5\037\uffe5\040\uffe5\001\002" +
    "\000\014\023\041\024\037\025\040\026\042\034\050\001" +
    "\002\000\056\005\uffe7\006\uffe7\007\uffe7\010\uffe7\011\uffe7" +
    "\012\uffe7\013\uffe7\014\uffe7\015\uffe7\016\uffe7\017\uffe7\022" +
    "\uffe7\023\uffe7\024\uffe7\025\uffe7\026\uffe7\027\uffe7\030\uffe7" +
    "\031\uffe7\034\uffe7\037\uffe7\040\uffe7\001\002\000\056\005" +
    "\uffe2\006\uffe2\007\uffe2\010\uffe2\011\uffe2\012\uffe2\013\uffe2" +
    "\014\uffe2\015\uffe2\016\uffe2\017\uffe2\022\uffe2\023\uffe2\024" +
    "\uffe2\025\uffe2\026\uffe2\027\uffe2\030\uffe2\031\uffe2\034\uffe2" +
    "\037\uffe2\040\uffe2\001\002\000\056\005\uffe1\006\uffe1\007" +
    "\uffe1\010\uffe1\011\uffe1\012\uffe1\013\uffe1\014\uffe1\015\uffe1" +
    "\016\uffe1\017\uffe1\022\uffe1\023\uffe1\024\uffe1\025\uffe1\026" +
    "\uffe1\027\uffe1\030\uffe1\031\uffe1\034\uffe1\037\uffe1\040\uffe1" +
    "\001\002\000\052\005\uffeb\006\uffeb\007\uffeb\010\uffeb\011" +
    "\uffeb\012\uffeb\013\uffeb\014\uffeb\015\uffeb\016\uffeb\017\uffeb" +
    "\022\uffeb\023\041\024\037\025\040\026\042\027\uffeb\030" +
    "\uffeb\037\uffeb\040\uffeb\001\002\000\042\005\020\006\010" +
    "\007\012\010\016\011\025\012\021\013\022\014\007\015" +
    "\013\016\027\017\024\022\014\027\017\030\ufffb\037\026" +
    "\040\056\001\002\000\004\030\057\001\002\000\004\030" +
    "\uffed\001\002\000\042\005\uffea\006\uffea\007\uffea\010\uffea" +
    "\011\uffea\012\uffea\013\uffea\014\uffea\015\uffea\016\uffea\017" +
    "\uffea\022\uffea\027\uffea\030\uffea\037\uffea\040\uffea\001\002" +
    "\000\004\030\ufff7\001\002\000\014\023\041\024\037\025" +
    "\040\026\042\030\ufff0\001\002\000\004\030\ufff5\001\002" +
    "\000\004\030\ufff6\001\002\000\014\004\032\005\030\023" +
    "\033\024\031\033\034\001\002\000\014\023\041\024\037" +
    "\025\040\026\042\030\uffef\001\002\000\004\030\uffee\001" +
    "\002\000\016\023\041\024\037\025\040\026\042\030\uffdd" +
    "\031\070\001\002\000\014\004\032\005\030\023\033\024" +
    "\031\033\034\001\002\000\014\023\041\024\037\025\040" +
    "\026\042\031\072\001\002\000\014\004\032\005\030\023" +
    "\033\024\031\033\034\001\002\000\014\023\041\024\037" +
    "\025\040\026\042\030\uffde\001\002\000\004\030\ufff8\001" +
    "\002\000\016\004\032\005\030\023\033\024\031\030\uffdc" +
    "\033\034\001\002\000\016\023\041\024\037\025\040\026" +
    "\042\030\uffda\031\uffda\001\002\000\004\030\uffec\001\002" +
    "\000\006\030\uffdb\031\101\001\002\000\014\004\032\005" +
    "\030\023\033\024\031\033\034\001\002\000\016\023\041" +
    "\024\037\025\040\026\042\030\uffd9\031\uffd9\001\002\000" +
    "\014\023\041\024\037\025\040\026\042\031\104\001\002" +
    "\000\014\004\032\005\030\023\033\024\031\033\034\001" +
    "\002\000\014\023\041\024\037\025\040\026\042\030\ufff2" +
    "\001\002\000\042\005\uffeb\006\uffeb\007\uffeb\010\uffeb\011" +
    "\uffeb\012\uffeb\013\uffeb\014\uffeb\015\uffeb\016\uffeb\017\uffeb" +
    "\022\uffeb\027\uffeb\030\uffeb\037\uffeb\040\uffeb\001\002\000" +
    "\042\005\020\006\010\007\012\010\016\011\025\012\021" +
    "\013\022\014\007\015\013\016\027\017\024\022\014\027" +
    "\017\030\ufffb\037\026\040\110\001\002\000\044\002\uffd8" +
    "\005\uffd8\006\uffd8\007\uffd8\010\uffd8\011\uffd8\012\uffd8\013" +
    "\uffd8\014\uffd8\015\uffd8\016\uffd8\017\uffd8\022\uffd8\027\uffd8" +
    "\030\uffd8\037\uffd8\041\uffd8\001\002\000\014\023\041\024" +
    "\037\025\040\026\042\031\112\001\002\000\014\004\032" +
    "\005\030\023\033\024\031\033\034\001\002\000\014\023" +
    "\041\024\037\025\040\026\042\030\ufffa\001\002\000\004" +
    "\030\ufff3\001\002\000\004\030\ufff4\001\002\000\044\002" +
    "\ufffd\005\ufffd\006\ufffd\007\ufffd\010\ufffd\011\ufffd\012\ufffd" +
    "\013\ufffd\014\ufffd\015\ufffd\016\ufffd\017\ufffd\022\ufffd\027" +
    "\ufffd\030\ufffd\037\ufffd\041\ufffd\001\002\000\004\002\000" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\115\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\010\004\022\006\005\015\014\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\010\110\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\102\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\010\035\011" +
    "\073\001\001\000\006\007\065\010\066\001\001\000\002" +
    "\001\001\000\006\010\035\011\062\001\001\000\006\010" +
    "\035\011\061\001\001\000\002\001\001\000\004\010\060" +
    "\001\001\000\006\010\035\011\057\001\001\000\004\010" +
    "\052\001\001\000\006\010\035\011\034\001\001\000\002" +
    "\001\001\000\004\010\051\001\001\000\002\001\001\000" +
    "\004\010\050\001\001\000\004\010\046\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\010\045\001\001\000" +
    "\004\010\044\001\001\000\004\010\043\001\001\000\004" +
    "\010\042\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\005" +
    "\053\001\001\000\004\006\054\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\064\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\070\001\001\000\002\001\001" +
    "\000\004\010\072\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\010\075\012\077\013\076\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\010" +
    "\101\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\104\001\001\000\002\001\001\000\004\005\106\001" +
    "\001\000\004\006\054\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\010\112\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP_actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP_actions();
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
    return action_obj.CUP_do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public void report_error(String message, Object info) {
        StringBuffer m = new StringBuffer("Error");
		m.append (info.toString());
        m.append(" : "+message);
        System.err.println(m.toString());
    }
   
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }
    
	private LogoContext context;
    public void setContext (LogoContext context) {
    	this.context = context;
    }

    public LogoContext getContext () {
		return context;
    }

	public LogoFactory getFactory () {
		return getContext().getFactory();
	}



/** Cup generated class to encapsulate user supplied action code.*/
class CUP_actions {

  /** Constructor */

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP_do_action(
    int                        CUP_act_num,
    java_cup.runtime.lr_parser CUP_parser,
    java.util.Stack            CUP_stack,
    int                        CUP_top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP_result;

      /* select the action based on the action number */
      switch (CUP_act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // Declaration ::= DEFINE ID Instructions END 
            {
              Node RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Node l = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 RESULT = getFactory().createTurtleFunction(n);
RESULT = setCode(l); 
              CUP_result = getSymbolFactory().newSymbol("Declaration",11, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // params ::= params SEP expr 
            {
              Node RESULT =null;
		Node l = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Node i = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = l;if(i!= null) l.getChildren().add(i); 
              CUP_result = getSymbolFactory().newSymbol("params",8, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // params ::= expr 
            {
              Node RESULT =null;
		Node i = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createNodeBloc(); if(i!= null) RESULT.getChildren().add(i);
              CUP_result = getSymbolFactory().newSymbol("params",8, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // params_opt ::= params 
            {
              Node RESULT =null;
		Node l = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = l; 
              CUP_result = getSymbolFactory().newSymbol("params_opt",9, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // params_opt ::= 
            {
              Node RESULT =null;
		 RESULT = null; 
              CUP_result = getSymbolFactory().newSymbol("params_opt",9, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // color ::= expr 
            {
              Node RESULT =null;
		Node v = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = v; 
              CUP_result = getSymbolFactory().newSymbol("color",5, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // color ::= expr SEP expr SEP expr 
            {
              Node RESULT =null;
		Node r = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-4)).value;
		Node g = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Node b = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = 
getFactory().createNodeAdd (
	getFactory().createNodeAdd (
		getFactory().createNodeMult (r, getFactory().createNodeConstantReal(65536)),
		getFactory().createNodeMult (g, getFactory().createNodeConstantReal(256)))
		,b); 
              CUP_result = getSymbolFactory().newSymbol("color",5, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // expr ::= ID 
            {
              Node RESULT =null;
		String id = (String)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createNodeVariable (id); 
              CUP_result = getSymbolFactory().newSymbol("expr",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // expr ::= NUMBER 
            {
              Node RESULT =null;
		Double n = (Double)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createNodeConstantReal (n.doubleValue()); 
              CUP_result = getSymbolFactory().newSymbol("expr",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // expr ::= SUB expr 
            {
              Node RESULT =null;
		Node e = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createNodeMinus (e); 
              CUP_result = getSymbolFactory().newSymbol("expr",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // expr ::= ADD expr 
            {
              Node RESULT =null;
		Node e = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createNodePlus (e); 
              CUP_result = getSymbolFactory().newSymbol("expr",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // expr ::= expr DIV expr 
            {
              Node RESULT =null;
		Node e1 = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Node e2 = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createNodeDiv (e1, e2); 
              CUP_result = getSymbolFactory().newSymbol("expr",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // expr ::= expr MULT expr 
            {
              Node RESULT =null;
		Node e1 = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Node e2 = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createNodeMult (e1, e2); 
              CUP_result = getSymbolFactory().newSymbol("expr",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // expr ::= expr SUB expr 
            {
              Node RESULT =null;
		Node e1 = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Node e2 = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createNodeSub (e1, e2); 
              CUP_result = getSymbolFactory().newSymbol("expr",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // expr ::= expr ADD expr 
            {
              Node RESULT =null;
		Node e1 = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Node e2 = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createNodeAdd (e1, e2); 
              CUP_result = getSymbolFactory().newSymbol("expr",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expr ::= OPEN_PARENTHESIS expr CLOSE_PARENTHESIS 
            {
              Node RESULT =null;
		Node e = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 RESULT = e; 
              CUP_result = getSymbolFactory().newSymbol("expr",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expropt ::= expr 
            {
              Node RESULT =null;
		Node v = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = v; 
              CUP_result = getSymbolFactory().newSymbol("expropt",7, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expropt ::= 
            {
              Node RESULT =null;
		 RESULT = getFactory().createNodeConstantReal (1.0); 
              CUP_result = getSymbolFactory().newSymbol("expropt",7, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Instructions ::= Instructions Instruction TERM 
            {
              Node RESULT =null;
		Node l = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Node i = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 RESULT = l;if(i!= null) l.getChildren().add(i); 
              CUP_result = getSymbolFactory().newSymbol("Instructions",3, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Instructions ::= 
            {
              Node RESULT =null;
		 RESULT = getFactory().createNodeBloc(); 
              CUP_result = getSymbolFactory().newSymbol("Instructions",3, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Instruction ::= CALL ID params_opt 
            {
              Node RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		Node l = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createTurtleCall (n,l); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Instruction ::= REPEAT expr Instructions END 
            {
              Node RESULT =null;
		Node c = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Node l = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 RESULT = getFactory().createTurtleLoop (c, l); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Instruction ::= INK color 
            {
              Node RESULT =null;
		Node c = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createTurtleInk (c); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Instruction ::= ID SET expr 
            {
              Node RESULT =null;
		String id = (String)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Node v = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createTurtleSet (id, v); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Instruction ::= TURN expr 
            {
              Node RESULT =null;
		Node a = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createTurtleTurn (a); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Instruction ::= MOVE expropt 
            {
              Node RESULT =null;
		Node d = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createTurtleMove (d); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Instruction ::= GOTO expr SEP expr 
            {
              Node RESULT =null;
		Node x = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Node y = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createTurtleGo (x, y); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Instruction ::= PEN ON 
            {
              Node RESULT =null;
		 RESULT = getFactory().createTurtleOn (); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Instruction ::= PEN OFF 
            {
              Node RESULT =null;
		 RESULT = getFactory().createTurtleOff (); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Instruction ::= LEFT expropt 
            {
              Node RESULT =null;
		Node p = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createTurtleLeft (p); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Instruction ::= RIGHT expropt 
            {
              Node RESULT =null;
		Node p = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createTurtleRight (p); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Instruction ::= DOWN expropt 
            {
              Node RESULT =null;
		Node p = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createTurtleDown (p); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Instruction ::= UP expropt 
            {
              Node RESULT =null;
		Node p = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createTurtleUp (p); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Instruction ::= HOME 
            {
              Node RESULT =null;
		 RESULT = getFactory().createTurtleHome (); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Instruction ::= FRAME expr SEP expr 
            {
              Node RESULT =null;
		Node x = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Node y = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getFactory().createTurtleFrame (x, y); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Instruction ::= 
            {
              Node RESULT =null;
		 RESULT = null; 
              CUP_result = getSymbolFactory().newSymbol("Instruction",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Definition ::= Declaration 
            {
              Object RESULT =null;
		Node dc = (Node)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		if(dc!=null) getContext().addLocalSymbol(dc); 
              CUP_result = getSymbolFactory().newSymbol("Definition",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Definition ::= Instruction TERM 
            {
              Object RESULT =null;
		Node inst = (Node)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
			if (inst != null) getContext().addGlobalInstruction(inst); 
              CUP_result = getSymbolFactory().newSymbol("Definition",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Definitions ::= Definitions Definition 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Definitions",1, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Definitions ::= 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Definitions",1, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Commandes EOF 
            {
              Object RESULT =null;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		RESULT = start_val;
              CUP_result = getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP_parser.done_parsing();
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Commandes ::= Definitions 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Commandes",0, RESULT);
            }
          return CUP_result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

}
