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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'in'", "'..'", "'['", "','", "']'", "'Boolean expression'", "'Int expression'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
        	return "Model";
       	}

       	@Override
       	protected HlclGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalHlcl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalHlcl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalHlcl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalHlcl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVariables ) )+ ( (lv_constraints_1_0= ruleConsExp ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_vars_0_0 = null;

        AntlrDatatypeRuleToken lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalHlcl.g:77:2: ( ( ( (lv_vars_0_0= ruleVariables ) )+ ( (lv_constraints_1_0= ruleConsExp ) )+ ) )
            // InternalHlcl.g:78:2: ( ( (lv_vars_0_0= ruleVariables ) )+ ( (lv_constraints_1_0= ruleConsExp ) )+ )
            {
            // InternalHlcl.g:78:2: ( ( (lv_vars_0_0= ruleVariables ) )+ ( (lv_constraints_1_0= ruleConsExp ) )+ )
            // InternalHlcl.g:79:3: ( (lv_vars_0_0= ruleVariables ) )+ ( (lv_constraints_1_0= ruleConsExp ) )+
            {
            // InternalHlcl.g:79:3: ( (lv_vars_0_0= ruleVariables ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHlcl.g:80:4: (lv_vars_0_0= ruleVariables )
            	    {
            	    // InternalHlcl.g:80:4: (lv_vars_0_0= ruleVariables )
            	    // InternalHlcl.g:81:5: lv_vars_0_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getVarsVariablesParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_vars_0_0=ruleVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vars",
            	    						lv_vars_0_0,
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

            // InternalHlcl.g:98:3: ( (lv_constraints_1_0= ruleConsExp ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=17 && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalHlcl.g:99:4: (lv_constraints_1_0= ruleConsExp )
            	    {
            	    // InternalHlcl.g:99:4: (lv_constraints_1_0= ruleConsExp )
            	    // InternalHlcl.g:100:5: lv_constraints_1_0= ruleConsExp
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getConstraintsConsExpParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_constraints_1_0=ruleConsExp();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_1_0,
            	    						"org.xtext.Hlcl.ConsExp");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVariables"
    // InternalHlcl.g:121:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalHlcl.g:121:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalHlcl.g:122:2: iv_ruleVariables= ruleVariables EOF
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
    // InternalHlcl.g:128:1: ruleVariables returns [EObject current=null] : ( (lv_vars_0_0= ruleVariable ) ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        EObject lv_vars_0_0 = null;



        	enterRule();

        try {
            // InternalHlcl.g:134:2: ( ( (lv_vars_0_0= ruleVariable ) ) )
            // InternalHlcl.g:135:2: ( (lv_vars_0_0= ruleVariable ) )
            {
            // InternalHlcl.g:135:2: ( (lv_vars_0_0= ruleVariable ) )
            // InternalHlcl.g:136:3: (lv_vars_0_0= ruleVariable )
            {
            // InternalHlcl.g:136:3: (lv_vars_0_0= ruleVariable )
            // InternalHlcl.g:137:4: lv_vars_0_0= ruleVariable
            {

            				newCompositeNode(grammarAccess.getVariablesAccess().getVarsVariableParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_vars_0_0=ruleVariable();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getVariablesRule());
            				}
            				add(
            					current,
            					"vars",
            					lv_vars_0_0,
            					"org.xtext.Hlcl.Variable");
            				afterParserOrEnumRuleCall();
            			

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


    // $ANTLR start "entryRuleVariable"
    // InternalHlcl.g:157:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalHlcl.g:157:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalHlcl.g:158:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalHlcl.g:164:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_dom_3_0= ruleDomain ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_dom_3_0 = null;



        	enterRule();

        try {
            // InternalHlcl.g:170:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_dom_3_0= ruleDomain ) ) ) )
            // InternalHlcl.g:171:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_dom_3_0= ruleDomain ) ) )
            {
            // InternalHlcl.g:171:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_dom_3_0= ruleDomain ) ) )
            // InternalHlcl.g:172:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_dom_3_0= ruleDomain ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalHlcl.g:176:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHlcl.g:177:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHlcl.g:177:4: (lv_name_1_0= RULE_ID )
            // InternalHlcl.g:178:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getInKeyword_2());
            		
            // InternalHlcl.g:198:3: ( (lv_dom_3_0= ruleDomain ) )
            // InternalHlcl.g:199:4: (lv_dom_3_0= ruleDomain )
            {
            // InternalHlcl.g:199:4: (lv_dom_3_0= ruleDomain )
            // InternalHlcl.g:200:5: lv_dom_3_0= ruleDomain
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getDomDomainParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_dom_3_0=ruleDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"dom",
            						lv_dom_3_0,
            						"org.xtext.Hlcl.Domain");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleDomain"
    // InternalHlcl.g:221:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalHlcl.g:221:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalHlcl.g:222:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalHlcl.g:228:1: ruleDomain returns [EObject current=null] : ( ( (lv_dom_0_1= ruleRangeDomain | lv_dom_0_2= ruleSetDomain ) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        EObject lv_dom_0_1 = null;

        EObject lv_dom_0_2 = null;



        	enterRule();

        try {
            // InternalHlcl.g:234:2: ( ( ( (lv_dom_0_1= ruleRangeDomain | lv_dom_0_2= ruleSetDomain ) ) ) )
            // InternalHlcl.g:235:2: ( ( (lv_dom_0_1= ruleRangeDomain | lv_dom_0_2= ruleSetDomain ) ) )
            {
            // InternalHlcl.g:235:2: ( ( (lv_dom_0_1= ruleRangeDomain | lv_dom_0_2= ruleSetDomain ) ) )
            // InternalHlcl.g:236:3: ( (lv_dom_0_1= ruleRangeDomain | lv_dom_0_2= ruleSetDomain ) )
            {
            // InternalHlcl.g:236:3: ( (lv_dom_0_1= ruleRangeDomain | lv_dom_0_2= ruleSetDomain ) )
            // InternalHlcl.g:237:4: (lv_dom_0_1= ruleRangeDomain | lv_dom_0_2= ruleSetDomain )
            {
            // InternalHlcl.g:237:4: (lv_dom_0_1= ruleRangeDomain | lv_dom_0_2= ruleSetDomain )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHlcl.g:238:5: lv_dom_0_1= ruleRangeDomain
                    {

                    					newCompositeNode(grammarAccess.getDomainAccess().getDomRangeDomainParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dom_0_1=ruleRangeDomain();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDomainRule());
                    					}
                    					set(
                    						current,
                    						"dom",
                    						lv_dom_0_1,
                    						"org.xtext.Hlcl.RangeDomain");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalHlcl.g:254:5: lv_dom_0_2= ruleSetDomain
                    {

                    					newCompositeNode(grammarAccess.getDomainAccess().getDomSetDomainParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dom_0_2=ruleSetDomain();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDomainRule());
                    					}
                    					set(
                    						current,
                    						"dom",
                    						lv_dom_0_2,
                    						"org.xtext.Hlcl.SetDomain");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleRangeDomain"
    // InternalHlcl.g:275:1: entryRuleRangeDomain returns [EObject current=null] : iv_ruleRangeDomain= ruleRangeDomain EOF ;
    public final EObject entryRuleRangeDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeDomain = null;


        try {
            // InternalHlcl.g:275:52: (iv_ruleRangeDomain= ruleRangeDomain EOF )
            // InternalHlcl.g:276:2: iv_ruleRangeDomain= ruleRangeDomain EOF
            {
             newCompositeNode(grammarAccess.getRangeDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRangeDomain=ruleRangeDomain();

            state._fsp--;

             current =iv_ruleRangeDomain; 
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
    // $ANTLR end "entryRuleRangeDomain"


    // $ANTLR start "ruleRangeDomain"
    // InternalHlcl.g:282:1: ruleRangeDomain returns [EObject current=null] : ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) ) ;
    public final EObject ruleRangeDomain() throws RecognitionException {
        EObject current = null;

        Token lv_start_0_0=null;
        Token otherlv_1=null;
        Token lv_end_2_0=null;


        	enterRule();

        try {
            // InternalHlcl.g:288:2: ( ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) ) )
            // InternalHlcl.g:289:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )
            {
            // InternalHlcl.g:289:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )
            // InternalHlcl.g:290:3: ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) )
            {
            // InternalHlcl.g:290:3: ( (lv_start_0_0= RULE_INT ) )
            // InternalHlcl.g:291:4: (lv_start_0_0= RULE_INT )
            {
            // InternalHlcl.g:291:4: (lv_start_0_0= RULE_INT )
            // InternalHlcl.g:292:5: lv_start_0_0= RULE_INT
            {
            lv_start_0_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_start_0_0, grammarAccess.getRangeDomainAccess().getStartINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeDomainAccess().getFullStopFullStopKeyword_1());
            		
            // InternalHlcl.g:312:3: ( (lv_end_2_0= RULE_INT ) )
            // InternalHlcl.g:313:4: (lv_end_2_0= RULE_INT )
            {
            // InternalHlcl.g:313:4: (lv_end_2_0= RULE_INT )
            // InternalHlcl.g:314:5: lv_end_2_0= RULE_INT
            {
            lv_end_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_end_2_0, grammarAccess.getRangeDomainAccess().getEndINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_2_0,
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
    // $ANTLR end "ruleRangeDomain"


    // $ANTLR start "entryRuleSetDomain"
    // InternalHlcl.g:334:1: entryRuleSetDomain returns [EObject current=null] : iv_ruleSetDomain= ruleSetDomain EOF ;
    public final EObject entryRuleSetDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetDomain = null;


        try {
            // InternalHlcl.g:334:50: (iv_ruleSetDomain= ruleSetDomain EOF )
            // InternalHlcl.g:335:2: iv_ruleSetDomain= ruleSetDomain EOF
            {
             newCompositeNode(grammarAccess.getSetDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetDomain=ruleSetDomain();

            state._fsp--;

             current =iv_ruleSetDomain; 
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
    // $ANTLR end "entryRuleSetDomain"


    // $ANTLR start "ruleSetDomain"
    // InternalHlcl.g:341:1: ruleSetDomain returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_list_1_0= RULE_INT ) ) (otherlv_2= ',' this_INT_3= RULE_INT )+ ) otherlv_4= ']' ) ;
    public final EObject ruleSetDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token this_INT_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalHlcl.g:347:2: ( (otherlv_0= '[' ( ( (lv_list_1_0= RULE_INT ) ) (otherlv_2= ',' this_INT_3= RULE_INT )+ ) otherlv_4= ']' ) )
            // InternalHlcl.g:348:2: (otherlv_0= '[' ( ( (lv_list_1_0= RULE_INT ) ) (otherlv_2= ',' this_INT_3= RULE_INT )+ ) otherlv_4= ']' )
            {
            // InternalHlcl.g:348:2: (otherlv_0= '[' ( ( (lv_list_1_0= RULE_INT ) ) (otherlv_2= ',' this_INT_3= RULE_INT )+ ) otherlv_4= ']' )
            // InternalHlcl.g:349:3: otherlv_0= '[' ( ( (lv_list_1_0= RULE_INT ) ) (otherlv_2= ',' this_INT_3= RULE_INT )+ ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSetDomainAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalHlcl.g:353:3: ( ( (lv_list_1_0= RULE_INT ) ) (otherlv_2= ',' this_INT_3= RULE_INT )+ )
            // InternalHlcl.g:354:4: ( (lv_list_1_0= RULE_INT ) ) (otherlv_2= ',' this_INT_3= RULE_INT )+
            {
            // InternalHlcl.g:354:4: ( (lv_list_1_0= RULE_INT ) )
            // InternalHlcl.g:355:5: (lv_list_1_0= RULE_INT )
            {
            // InternalHlcl.g:355:5: (lv_list_1_0= RULE_INT )
            // InternalHlcl.g:356:6: lv_list_1_0= RULE_INT
            {
            lv_list_1_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            						newLeafNode(lv_list_1_0, grammarAccess.getSetDomainAccess().getListINTTerminalRuleCall_1_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getSetDomainRule());
            						}
            						setWithLastConsumed(
            							current,
            							"list",
            							lv_list_1_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }

            // InternalHlcl.g:372:4: (otherlv_2= ',' this_INT_3= RULE_INT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHlcl.g:373:5: otherlv_2= ',' this_INT_3= RULE_INT
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_9); 

            	    					newLeafNode(otherlv_2, grammarAccess.getSetDomainAccess().getCommaKeyword_1_1_0());
            	    				
            	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_11); 

            	    					newLeafNode(this_INT_3, grammarAccess.getSetDomainAccess().getINTTerminalRuleCall_1_1_1());
            	    				

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


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSetDomainAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleSetDomain"


    // $ANTLR start "entryRuleConsExp"
    // InternalHlcl.g:391:1: entryRuleConsExp returns [String current=null] : iv_ruleConsExp= ruleConsExp EOF ;
    public final String entryRuleConsExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConsExp = null;


        try {
            // InternalHlcl.g:391:47: (iv_ruleConsExp= ruleConsExp EOF )
            // InternalHlcl.g:392:2: iv_ruleConsExp= ruleConsExp EOF
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
    // InternalHlcl.g:398:1: ruleConsExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BooleanExp_0= ruleBooleanExp | this_IntExp_1= ruleIntExp ) ;
    public final AntlrDatatypeRuleToken ruleConsExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BooleanExp_0 = null;

        AntlrDatatypeRuleToken this_IntExp_1 = null;



        	enterRule();

        try {
            // InternalHlcl.g:404:2: ( (this_BooleanExp_0= ruleBooleanExp | this_IntExp_1= ruleIntExp ) )
            // InternalHlcl.g:405:2: (this_BooleanExp_0= ruleBooleanExp | this_IntExp_1= ruleIntExp )
            {
            // InternalHlcl.g:405:2: (this_BooleanExp_0= ruleBooleanExp | this_IntExp_1= ruleIntExp )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalHlcl.g:406:3: this_BooleanExp_0= ruleBooleanExp
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
                    // InternalHlcl.g:417:3: this_IntExp_1= ruleIntExp
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
    // InternalHlcl.g:431:1: entryRuleBooleanExp returns [String current=null] : iv_ruleBooleanExp= ruleBooleanExp EOF ;
    public final String entryRuleBooleanExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanExp = null;


        try {
            // InternalHlcl.g:431:50: (iv_ruleBooleanExp= ruleBooleanExp EOF )
            // InternalHlcl.g:432:2: iv_ruleBooleanExp= ruleBooleanExp EOF
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
    // InternalHlcl.g:438:1: ruleBooleanExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean expression' ;
    public final AntlrDatatypeRuleToken ruleBooleanExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlcl.g:444:2: (kw= 'Boolean expression' )
            // InternalHlcl.g:445:2: kw= 'Boolean expression'
            {
            kw=(Token)match(input,17,FOLLOW_2); 

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
    // InternalHlcl.g:453:1: entryRuleIntExp returns [String current=null] : iv_ruleIntExp= ruleIntExp EOF ;
    public final String entryRuleIntExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntExp = null;


        try {
            // InternalHlcl.g:453:46: (iv_ruleIntExp= ruleIntExp EOF )
            // InternalHlcl.g:454:2: iv_ruleIntExp= ruleIntExp EOF
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
    // InternalHlcl.g:460:1: ruleIntExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Int expression' ;
    public final AntlrDatatypeRuleToken ruleIntExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlcl.g:466:2: (kw= 'Int expression' )
            // InternalHlcl.g:467:2: kw= 'Int expression'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000060800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000018000L});

}