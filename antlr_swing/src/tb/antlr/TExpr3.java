// $ANTLR 3.4 /home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g 2019-03-12 10:46:44

package tb.antlr;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class TExpr3 extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIV", "ID", "INT", "LP", "MINUS", "MUL", "NL", "PLUS", "PODST", "RP", "VAR", "WS"
    };

    public static final int EOF=-1;
    public static final int DIV=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int LP=7;
    public static final int MINUS=8;
    public static final int MUL=9;
    public static final int NL=10;
    public static final int PLUS=11;
    public static final int PODST=12;
    public static final int RP=13;
    public static final int VAR=14;
    public static final int WS=15;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public TExpr3(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TExpr3(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("TExpr3Templates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return TExpr3.tokenNames; }
    public String getGrammarFileName() { return "/home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g"; }


    public static class prog_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "prog"
    // /home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g:15:1: prog : (e+= expr )* -> template(name=$e) \"<name;separator=\" aaa!!! \">\";
    public final TExpr3.prog_return prog() throws RecognitionException {
        TExpr3.prog_return retval = new TExpr3.prog_return();
        retval.start = input.LT(1);


        List list_e=null;
        RuleReturnScope e = null;
        try {
            // /home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g:15:9: ( (e+= expr )* -> template(name=$e) \"<name;separator=\" aaa!!! \">\")
            // /home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g:15:11: (e+= expr )*
            {
            // /home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g:15:12: (e+= expr )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DIV||LA1_0==INT||(LA1_0 >= MINUS && LA1_0 <= MUL)||(LA1_0 >= PLUS && LA1_0 <= PODST)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g:15:12: e+= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_prog48);
            	    e=expr();

            	    state._fsp--;

            	    if (list_e==null) list_e=new ArrayList();
            	    list_e.add(e.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // TEMPLATE REWRITE
            // 15:20: -> template(name=$e) \"<name;separator=\" aaa!!! \">\"
            {
                retval.st = new StringTemplate(templateLib, "<name;separator=\" aaa!!! \">",new STAttrMap().put("name", list_e));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class expr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "expr"
    // /home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g:17:1: expr : ( ^( PLUS e1= expr e2= expr ) -> dodaj(p1=$e1.stp2=$e2.st)| ^( MINUS e1= expr e2= expr ) | ^( MUL e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( PODST i1= ID e2= expr ) | INT -> int(i=$INT.text));
    public final TExpr3.expr_return expr() throws RecognitionException {
        TExpr3.expr_return retval = new TExpr3.expr_return();
        retval.start = input.LT(1);


        CommonTree i1=null;
        CommonTree INT1=null;
        TExpr3.expr_return e1 =null;

        TExpr3.expr_return e2 =null;


        try {
            // /home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g:17:9: ( ^( PLUS e1= expr e2= expr ) -> dodaj(p1=$e1.stp2=$e2.st)| ^( MINUS e1= expr e2= expr ) | ^( MUL e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( PODST i1= ID e2= expr ) | INT -> int(i=$INT.text))
            int alt2=6;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt2=1;
                }
                break;
            case MINUS:
                {
                alt2=2;
                }
                break;
            case MUL:
                {
                alt2=3;
                }
                break;
            case DIV:
                {
                alt2=4;
                }
                break;
            case PODST:
                {
                alt2=5;
                }
                break;
            case INT:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g:17:11: ^( PLUS e1= expr e2= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr72); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr77);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr81);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 17:36: -> dodaj(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("dodaj",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // /home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g:18:11: ^( MINUS e1= expr e2= expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr108); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr112);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr116);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // /home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g:19:11: ^( MUL e1= expr e2= expr )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expr131); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr137);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr141);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 4 :
                    // /home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g:20:11: ^( DIV e1= expr e2= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr156); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr162);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr166);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 5 :
                    // /home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g:21:11: ^( PODST i1= ID e2= expr )
                    {
                    match(input,PODST,FOLLOW_PODST_in_expr181); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr185); 

                    pushFollow(FOLLOW_expr_in_expr191);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 6 :
                    // /home/uml/eclipse-workspace/229046/antlr_swing/antlr_swing/src/tb/antlr/TExpr3.g:22:11: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr205); 

                    // TEMPLATE REWRITE
                    // 22:36: -> int(i=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("int",new STAttrMap().put("i", (INT1!=null?INT1.getText():null)));
                    }



                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_prog48 = new BitSet(new long[]{0x0000000000001B52L});
    public static final BitSet FOLLOW_PLUS_in_expr72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr77 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr81 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr112 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expr131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr137 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr162 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PODST_in_expr181 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr185 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr191 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr205 = new BitSet(new long[]{0x0000000000000002L});

}