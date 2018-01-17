package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.HlclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHlclParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'variables:'", "'constraints:'", "'var'", "'domain:'", "'::'", "'['", "']'", "'boolDomain'", "'Boolean expression'", "'Int expression'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalHlclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHlclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHlclParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHlcl.g"; }



     	private HlclGrammarAccess grammarAccess;

        public InternalHlclParser(TokenStream input, HlclGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ConstraintProgram";
       	}

       	@Override
       	protected HlclGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConstraintProgram"
    // InternalHlcl.g:64:1: entryRuleConstraintProgram returns [EObject current=null] : iv_ruleConstraintProgram= ruleConstraintProgram EOF ;
    public final EObject entryRuleConstraintProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintProgram = null;


        try {
            // InternalHlcl.g:64:58: (iv_ruleConstraintProgram= ruleConstraintProgram EOF )
            // InternalHlcl.g:65:2: iv_ruleConstraintProgram= ruleConstraintProgram EOF
            {
             newCompositeNode(grammarAccess.getConstraintProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintProgram=ruleConstraintProgram();

            state._fsp--;

             current =iv_ruleConstraintProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintProgram"


    // $ANTLR start "ruleConstraintProgram"
    // InternalHlcl.g:71:1: ruleConstraintProgram returns [EObject current=null] : (otherlv_0= 'variables:' ( (lv_vars_1_0= ruleVariables ) )+ otherlv_2= 'constraints:' ( (lv_constraints_3_0= ruleConsExp ) )* ) ;
    public final EObject ruleConstraintProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_vars_1_0 = null;

        AntlrDatatypeRuleToken lv_constraints_3_0 = null;



        	enterRule();

        try {
            // InternalHlcl.g:77:2: ( (otherlv_0= 'variables:' ( (lv_vars_1_0= ruleVariables ) )+ otherlv_2= 'constraints:' ( (lv_constraints_3_0= ruleConsExp ) )* ) )
            // InternalHlcl.g:78:2: (otherlv_0= 'variables:' ( (lv_vars_1_0= ruleVariables ) )+ otherlv_2= 'constraints:' ( (lv_constraints_3_0= ruleConsExp ) )* )
            {
            // InternalHlcl.g:78:2: (otherlv_0= 'variables:' ( (lv_vars_1_0= ruleVariables ) )+ otherlv_2= 'constraints:' ( (lv_constraints_3_0= ruleConsExp ) )* )
            // InternalHlcl.g:79:3: otherlv_0= 'variables:' ( (lv_vars_1_0= ruleVariables ) )+ otherlv_2= 'constraints:' ( (lv_constraints_3_0= ruleConsExp ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintProgramAccess().getVariablesKeyword_0());
            		
            // InternalHlcl.g:83:3: ( (lv_vars_1_0= ruleVariables ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHlcl.g:84:4: (lv_vars_1_0= ruleVariables )
            	    {
            	    // InternalHlcl.g:84:4: (lv_vars_1_0= ruleVariables )
            	    // InternalHlcl.g:85:5: lv_vars_1_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintProgramAccess().getVarsVariablesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_vars_1_0=ruleVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstraintProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vars",
            	    						lv_vars_1_0,
            	    						"org.xtext.Hlcl.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintProgramAccess().getConstraintsKeyword_2());
            		
            // InternalHlcl.g:106:3: ( (lv_constraints_3_0= ruleConsExp ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalHlcl.g:107:4: (lv_constraints_3_0= ruleConsExp )
            	    {
            	    // InternalHlcl.g:107:4: (lv_constraints_3_0= ruleConsExp )
            	    // InternalHlcl.g:108:5: lv_constraints_3_0= ruleConsExp
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintProgramAccess().getConstraintsConsExpParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_constraints_3_0=ruleConsExp();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstraintProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_3_0,
            	    						"org.xtext.Hlcl.ConsExp");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintProgram"


    // $ANTLR start "entryRuleVariables"
    // InternalHlcl.g:129:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalHlcl.g:129:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalHlcl.g:130:2: iv_ruleVariables= ruleVariables EOF
            {
             newCompositeNode(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariables=ruleVariables();

            state._fsp--;

             current =iv_ruleVariables; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // InternalHlcl.g:136:1: ruleVariables returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain:' ( (lv_dom_3_0= ruleDom ) ) ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_dom_3_0 = null;



        	enterRule();

        try {
            // InternalHlcl.g:142:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain:' ( (lv_dom_3_0= ruleDom ) ) ) )
            // InternalHlcl.g:143:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain:' ( (lv_dom_3_0= ruleDom ) ) )
            {
            // InternalHlcl.g:143:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain:' ( (lv_dom_3_0= ruleDom ) ) )
            // InternalHlcl.g:144:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain:' ( (lv_dom_3_0= ruleDom ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getVariablesAccess().getVarKeyword_0());
            		
            // InternalHlcl.g:148:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHlcl.g:149:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHlcl.g:149:4: (lv_name_1_0= RULE_ID )
            // InternalHlcl.g:150:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariablesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariablesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getVariablesAccess().getDomainKeyword_2());
            		
            // InternalHlcl.g:170:3: ( (lv_dom_3_0= ruleDom ) )
            // InternalHlcl.g:171:4: (lv_dom_3_0= ruleDom )
            {
            // InternalHlcl.g:171:4: (lv_dom_3_0= ruleDom )
            // InternalHlcl.g:172:5: lv_dom_3_0= ruleDom
            {

            					newCompositeNode(grammarAccess.getVariablesAccess().getDomDomParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_dom_3_0=ruleDom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariablesRule());
            					}
            					set(
            						current,
            						"dom",
            						lv_dom_3_0,
            						"org.xtext.Hlcl.Dom");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleDom"
    // InternalHlcl.g:193:1: entryRuleDom returns [EObject current=null] : iv_ruleDom= ruleDom EOF ;
    public final EObject entryRuleDom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDom = null;


        try {
            // InternalHlcl.g:193:44: (iv_ruleDom= ruleDom EOF )
            // InternalHlcl.g:194:2: iv_ruleDom= ruleDom EOF
            {
             newCompositeNode(grammarAccess.getDomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDom=ruleDom();

            state._fsp--;

             current =iv_ruleDom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDom"


    // $ANTLR start "ruleDom"
    // InternalHlcl.g:200:1: ruleDom returns [EObject current=null] : (this_RangeDom_0= ruleRangeDom | this_SetDom_1= ruleSetDom | this_BoolDom_2= ruleBoolDom | this_StringDom_3= ruleStringDom ) ;
    public final EObject ruleDom() throws RecognitionException {
        EObject current = null;

        EObject this_RangeDom_0 = null;

        EObject this_SetDom_1 = null;

        EObject this_BoolDom_2 = null;

        EObject this_StringDom_3 = null;



        	enterRule();

        try {
            // InternalHlcl.g:206:2: ( (this_RangeDom_0= ruleRangeDom | this_SetDom_1= ruleSetDom | this_BoolDom_2= ruleBoolDom | this_StringDom_3= ruleStringDom ) )
            // InternalHlcl.g:207:2: (this_RangeDom_0= ruleRangeDom | this_SetDom_1= ruleSetDom | this_BoolDom_2= ruleBoolDom | this_StringDom_3= ruleStringDom )
            {
            // InternalHlcl.g:207:2: (this_RangeDom_0= ruleRangeDom | this_SetDom_1= ruleSetDom | this_BoolDom_2= ruleBoolDom | this_StringDom_3= ruleStringDom )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_INT) ) {
                    alt3=2;
                }
                else if ( (LA3_2==RULE_STRING) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalHlcl.g:208:3: this_RangeDom_0= ruleRangeDom
                    {

                    			newCompositeNode(grammarAccess.getDomAccess().getRangeDomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RangeDom_0=ruleRangeDom();

                    state._fsp--;


                    			current = this_RangeDom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHlcl.g:217:3: this_SetDom_1= ruleSetDom
                    {

                    			newCompositeNode(grammarAccess.getDomAccess().getSetDomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetDom_1=ruleSetDom();

                    state._fsp--;


                    			current = this_SetDom_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHlcl.g:226:3: this_BoolDom_2= ruleBoolDom
                    {

                    			newCompositeNode(grammarAccess.getDomAccess().getBoolDomParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolDom_2=ruleBoolDom();

                    state._fsp--;


                    			current = this_BoolDom_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalHlcl.g:235:3: this_StringDom_3= ruleStringDom
                    {

                    			newCompositeNode(grammarAccess.getDomAccess().getStringDomParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringDom_3=ruleStringDom();

                    state._fsp--;


                    			current = this_StringDom_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDom"


    // $ANTLR start "entryRuleRangeDom"
    // InternalHlcl.g:247:1: entryRuleRangeDom returns [EObject current=null] : iv_ruleRangeDom= ruleRangeDom EOF ;
    public final EObject entryRuleRangeDom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeDom = null;


        try {
            // InternalHlcl.g:247:49: (iv_ruleRangeDom= ruleRangeDom EOF )
            // InternalHlcl.g:248:2: iv_ruleRangeDom= ruleRangeDom EOF
            {
             newCompositeNode(grammarAccess.getRangeDomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRangeDom=ruleRangeDom();

            state._fsp--;

             current =iv_ruleRangeDom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRangeDom"


    // $ANTLR start "ruleRangeDom"
    // InternalHlcl.g:254:1: ruleRangeDom returns [EObject current=null] : ( () ( (lv_start_1_0= RULE_INT ) ) otherlv_2= '::' ( (lv_end_3_0= RULE_INT ) ) ) ;
    public final EObject ruleRangeDom() throws RecognitionException {
        EObject current = null;

        Token lv_start_1_0=null;
        Token otherlv_2=null;
        Token lv_end_3_0=null;


        	enterRule();

        try {
            // InternalHlcl.g:260:2: ( ( () ( (lv_start_1_0= RULE_INT ) ) otherlv_2= '::' ( (lv_end_3_0= RULE_INT ) ) ) )
            // InternalHlcl.g:261:2: ( () ( (lv_start_1_0= RULE_INT ) ) otherlv_2= '::' ( (lv_end_3_0= RULE_INT ) ) )
            {
            // InternalHlcl.g:261:2: ( () ( (lv_start_1_0= RULE_INT ) ) otherlv_2= '::' ( (lv_end_3_0= RULE_INT ) ) )
            // InternalHlcl.g:262:3: () ( (lv_start_1_0= RULE_INT ) ) otherlv_2= '::' ( (lv_end_3_0= RULE_INT ) )
            {
            // InternalHlcl.g:262:3: ()
            // InternalHlcl.g:263:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangeDomAccess().getRangeDomAction_0(),
            					current);
            			

            }

            // InternalHlcl.g:269:3: ( (lv_start_1_0= RULE_INT ) )
            // InternalHlcl.g:270:4: (lv_start_1_0= RULE_INT )
            {
            // InternalHlcl.g:270:4: (lv_start_1_0= RULE_INT )
            // InternalHlcl.g:271:5: lv_start_1_0= RULE_INT
            {
            lv_start_1_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_start_1_0, grammarAccess.getRangeDomAccess().getStartINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeDomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRangeDomAccess().getColonColonKeyword_2());
            		
            // InternalHlcl.g:291:3: ( (lv_end_3_0= RULE_INT ) )
            // InternalHlcl.g:292:4: (lv_end_3_0= RULE_INT )
            {
            // InternalHlcl.g:292:4: (lv_end_3_0= RULE_INT )
            // InternalHlcl.g:293:5: lv_end_3_0= RULE_INT
            {
            lv_end_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_end_3_0, grammarAccess.getRangeDomAccess().getEndINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeDomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRangeDom"


    // $ANTLR start "entryRuleSetDom"
    // InternalHlcl.g:313:1: entryRuleSetDom returns [EObject current=null] : iv_ruleSetDom= ruleSetDom EOF ;
    public final EObject entryRuleSetDom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetDom = null;


        try {
            // InternalHlcl.g:313:47: (iv_ruleSetDom= ruleSetDom EOF )
            // InternalHlcl.g:314:2: iv_ruleSetDom= ruleSetDom EOF
            {
             newCompositeNode(grammarAccess.getSetDomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetDom=ruleSetDom();

            state._fsp--;

             current =iv_ruleSetDom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetDom"


    // $ANTLR start "ruleSetDom"
    // InternalHlcl.g:320:1: ruleSetDom returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_list_2_0= RULE_INT ) )+ otherlv_3= ']' ) ;
    public final EObject ruleSetDom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_list_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalHlcl.g:326:2: ( ( () otherlv_1= '[' ( (lv_list_2_0= RULE_INT ) )+ otherlv_3= ']' ) )
            // InternalHlcl.g:327:2: ( () otherlv_1= '[' ( (lv_list_2_0= RULE_INT ) )+ otherlv_3= ']' )
            {
            // InternalHlcl.g:327:2: ( () otherlv_1= '[' ( (lv_list_2_0= RULE_INT ) )+ otherlv_3= ']' )
            // InternalHlcl.g:328:3: () otherlv_1= '[' ( (lv_list_2_0= RULE_INT ) )+ otherlv_3= ']'
            {
            // InternalHlcl.g:328:3: ()
            // InternalHlcl.g:329:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetDomAccess().getSetDomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSetDomAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalHlcl.g:339:3: ( (lv_list_2_0= RULE_INT ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHlcl.g:340:4: (lv_list_2_0= RULE_INT )
            	    {
            	    // InternalHlcl.g:340:4: (lv_list_2_0= RULE_INT )
            	    // InternalHlcl.g:341:5: lv_list_2_0= RULE_INT
            	    {
            	    lv_list_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            	    					newLeafNode(lv_list_2_0, grammarAccess.getSetDomAccess().getListINTTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getSetDomRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"list",
            	    						lv_list_2_0,
            	    						"org.eclipse.xtext.common.Terminals.INT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSetDomAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetDom"


    // $ANTLR start "entryRuleBoolDom"
    // InternalHlcl.g:365:1: entryRuleBoolDom returns [EObject current=null] : iv_ruleBoolDom= ruleBoolDom EOF ;
    public final EObject entryRuleBoolDom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolDom = null;


        try {
            // InternalHlcl.g:365:48: (iv_ruleBoolDom= ruleBoolDom EOF )
            // InternalHlcl.g:366:2: iv_ruleBoolDom= ruleBoolDom EOF
            {
             newCompositeNode(grammarAccess.getBoolDomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolDom=ruleBoolDom();

            state._fsp--;

             current =iv_ruleBoolDom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolDom"


    // $ANTLR start "ruleBoolDom"
    // InternalHlcl.g:372:1: ruleBoolDom returns [EObject current=null] : ( (lv_dom_0_0= 'boolDomain' ) ) ;
    public final EObject ruleBoolDom() throws RecognitionException {
        EObject current = null;

        Token lv_dom_0_0=null;


        	enterRule();

        try {
            // InternalHlcl.g:378:2: ( ( (lv_dom_0_0= 'boolDomain' ) ) )
            // InternalHlcl.g:379:2: ( (lv_dom_0_0= 'boolDomain' ) )
            {
            // InternalHlcl.g:379:2: ( (lv_dom_0_0= 'boolDomain' ) )
            // InternalHlcl.g:380:3: (lv_dom_0_0= 'boolDomain' )
            {
            // InternalHlcl.g:380:3: (lv_dom_0_0= 'boolDomain' )
            // InternalHlcl.g:381:4: lv_dom_0_0= 'boolDomain'
            {
            lv_dom_0_0=(Token)match(input,18,FOLLOW_2); 

            				newLeafNode(lv_dom_0_0, grammarAccess.getBoolDomAccess().getDomBoolDomainKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBoolDomRule());
            				}
            				setWithLastConsumed(current, "dom", lv_dom_0_0, "boolDomain");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolDom"


    // $ANTLR start "entryRuleStringDom"
    // InternalHlcl.g:396:1: entryRuleStringDom returns [EObject current=null] : iv_ruleStringDom= ruleStringDom EOF ;
    public final EObject entryRuleStringDom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringDom = null;


        try {
            // InternalHlcl.g:396:50: (iv_ruleStringDom= ruleStringDom EOF )
            // InternalHlcl.g:397:2: iv_ruleStringDom= ruleStringDom EOF
            {
             newCompositeNode(grammarAccess.getStringDomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringDom=ruleStringDom();

            state._fsp--;

             current =iv_ruleStringDom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringDom"


    // $ANTLR start "ruleStringDom"
    // InternalHlcl.g:403:1: ruleStringDom returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_list_2_0= RULE_STRING ) )+ otherlv_3= ']' ) ;
    public final EObject ruleStringDom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_list_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalHlcl.g:409:2: ( ( () otherlv_1= '[' ( (lv_list_2_0= RULE_STRING ) )+ otherlv_3= ']' ) )
            // InternalHlcl.g:410:2: ( () otherlv_1= '[' ( (lv_list_2_0= RULE_STRING ) )+ otherlv_3= ']' )
            {
            // InternalHlcl.g:410:2: ( () otherlv_1= '[' ( (lv_list_2_0= RULE_STRING ) )+ otherlv_3= ']' )
            // InternalHlcl.g:411:3: () otherlv_1= '[' ( (lv_list_2_0= RULE_STRING ) )+ otherlv_3= ']'
            {
            // InternalHlcl.g:411:3: ()
            // InternalHlcl.g:412:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringDomAccess().getStringDomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getStringDomAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalHlcl.g:422:3: ( (lv_list_2_0= RULE_STRING ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHlcl.g:423:4: (lv_list_2_0= RULE_STRING )
            	    {
            	    // InternalHlcl.g:423:4: (lv_list_2_0= RULE_STRING )
            	    // InternalHlcl.g:424:5: lv_list_2_0= RULE_STRING
            	    {
            	    lv_list_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    					newLeafNode(lv_list_2_0, grammarAccess.getStringDomAccess().getListSTRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getStringDomRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"list",
            	    						lv_list_2_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStringDomAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringDom"


    // $ANTLR start "entryRuleConsExp"
    // InternalHlcl.g:448:1: entryRuleConsExp returns [String current=null] : iv_ruleConsExp= ruleConsExp EOF ;
    public final String entryRuleConsExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConsExp = null;


        try {
            // InternalHlcl.g:448:47: (iv_ruleConsExp= ruleConsExp EOF )
            // InternalHlcl.g:449:2: iv_ruleConsExp= ruleConsExp EOF
            {
             newCompositeNode(grammarAccess.getConsExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConsExp=ruleConsExp();

            state._fsp--;

             current =iv_ruleConsExp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConsExp"


    // $ANTLR start "ruleConsExp"
    // InternalHlcl.g:455:1: ruleConsExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BooleanExp_0= ruleBooleanExp | this_IntExp_1= ruleIntExp ) ;
    public final AntlrDatatypeRuleToken ruleConsExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BooleanExp_0 = null;

        AntlrDatatypeRuleToken this_IntExp_1 = null;



        	enterRule();

        try {
            // InternalHlcl.g:461:2: ( (this_BooleanExp_0= ruleBooleanExp | this_IntExp_1= ruleIntExp ) )
            // InternalHlcl.g:462:2: (this_BooleanExp_0= ruleBooleanExp | this_IntExp_1= ruleIntExp )
            {
            // InternalHlcl.g:462:2: (this_BooleanExp_0= ruleBooleanExp | this_IntExp_1= ruleIntExp )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalHlcl.g:463:3: this_BooleanExp_0= ruleBooleanExp
                    {

                    			newCompositeNode(grammarAccess.getConsExpAccess().getBooleanExpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanExp_0=ruleBooleanExp();

                    state._fsp--;


                    			current.merge(this_BooleanExp_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHlcl.g:474:3: this_IntExp_1= ruleIntExp
                    {

                    			newCompositeNode(grammarAccess.getConsExpAccess().getIntExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntExp_1=ruleIntExp();

                    state._fsp--;


                    			current.merge(this_IntExp_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConsExp"


    // $ANTLR start "entryRuleBooleanExp"
    // InternalHlcl.g:488:1: entryRuleBooleanExp returns [String current=null] : iv_ruleBooleanExp= ruleBooleanExp EOF ;
    public final String entryRuleBooleanExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanExp = null;


        try {
            // InternalHlcl.g:488:50: (iv_ruleBooleanExp= ruleBooleanExp EOF )
            // InternalHlcl.g:489:2: iv_ruleBooleanExp= ruleBooleanExp EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExp=ruleBooleanExp();

            state._fsp--;

             current =iv_ruleBooleanExp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExp"


    // $ANTLR start "ruleBooleanExp"
    // InternalHlcl.g:495:1: ruleBooleanExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean expression' ;
    public final AntlrDatatypeRuleToken ruleBooleanExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlcl.g:501:2: (kw= 'Boolean expression' )
            // InternalHlcl.g:502:2: kw= 'Boolean expression'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBooleanExpAccess().getBooleanExpressionKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExp"


    // $ANTLR start "entryRuleIntExp"
    // InternalHlcl.g:510:1: entryRuleIntExp returns [String current=null] : iv_ruleIntExp= ruleIntExp EOF ;
    public final String entryRuleIntExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntExp = null;


        try {
            // InternalHlcl.g:510:46: (iv_ruleIntExp= ruleIntExp EOF )
            // InternalHlcl.g:511:2: iv_ruleIntExp= ruleIntExp EOF
            {
             newCompositeNode(grammarAccess.getIntExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntExp=ruleIntExp();

            state._fsp--;

             current =iv_ruleIntExp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntExp"


    // $ANTLR start "ruleIntExp"
    // InternalHlcl.g:517:1: ruleIntExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Int expression' ;
    public final AntlrDatatypeRuleToken ruleIntExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlcl.g:523:2: (kw= 'Int expression' )
            // InternalHlcl.g:524:2: kw= 'Int expression'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getIntExpAccess().getIntExpressionKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntExp"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000050020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020040L});

}