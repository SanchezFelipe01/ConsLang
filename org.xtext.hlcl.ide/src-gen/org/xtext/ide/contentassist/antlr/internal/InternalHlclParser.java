package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.HlclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHlclParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Boolean expression'", "'Int expression'", "'variables:'", "'constraints:'", "'var'", "'domain:'", "'::'", "'['", "']'", "'boolDomain'"
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

    	public void setGrammarAccess(HlclGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleConstraintProgram"
    // InternalHlcl.g:53:1: entryRuleConstraintProgram : ruleConstraintProgram EOF ;
    public final void entryRuleConstraintProgram() throws RecognitionException {
        try {
            // InternalHlcl.g:54:1: ( ruleConstraintProgram EOF )
            // InternalHlcl.g:55:1: ruleConstraintProgram EOF
            {
             before(grammarAccess.getConstraintProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraintProgram();

            state._fsp--;

             after(grammarAccess.getConstraintProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintProgram"


    // $ANTLR start "ruleConstraintProgram"
    // InternalHlcl.g:62:1: ruleConstraintProgram : ( ( rule__ConstraintProgram__Group__0 ) ) ;
    public final void ruleConstraintProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:66:2: ( ( ( rule__ConstraintProgram__Group__0 ) ) )
            // InternalHlcl.g:67:2: ( ( rule__ConstraintProgram__Group__0 ) )
            {
            // InternalHlcl.g:67:2: ( ( rule__ConstraintProgram__Group__0 ) )
            // InternalHlcl.g:68:3: ( rule__ConstraintProgram__Group__0 )
            {
             before(grammarAccess.getConstraintProgramAccess().getGroup()); 
            // InternalHlcl.g:69:3: ( rule__ConstraintProgram__Group__0 )
            // InternalHlcl.g:69:4: rule__ConstraintProgram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintProgram"


    // $ANTLR start "entryRuleVariables"
    // InternalHlcl.g:78:1: entryRuleVariables : ruleVariables EOF ;
    public final void entryRuleVariables() throws RecognitionException {
        try {
            // InternalHlcl.g:79:1: ( ruleVariables EOF )
            // InternalHlcl.g:80:1: ruleVariables EOF
            {
             before(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_1);
            ruleVariables();

            state._fsp--;

             after(grammarAccess.getVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // InternalHlcl.g:87:1: ruleVariables : ( ( rule__Variables__Group__0 ) ) ;
    public final void ruleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:91:2: ( ( ( rule__Variables__Group__0 ) ) )
            // InternalHlcl.g:92:2: ( ( rule__Variables__Group__0 ) )
            {
            // InternalHlcl.g:92:2: ( ( rule__Variables__Group__0 ) )
            // InternalHlcl.g:93:3: ( rule__Variables__Group__0 )
            {
             before(grammarAccess.getVariablesAccess().getGroup()); 
            // InternalHlcl.g:94:3: ( rule__Variables__Group__0 )
            // InternalHlcl.g:94:4: rule__Variables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariablesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleDom"
    // InternalHlcl.g:103:1: entryRuleDom : ruleDom EOF ;
    public final void entryRuleDom() throws RecognitionException {
        try {
            // InternalHlcl.g:104:1: ( ruleDom EOF )
            // InternalHlcl.g:105:1: ruleDom EOF
            {
             before(grammarAccess.getDomRule()); 
            pushFollow(FOLLOW_1);
            ruleDom();

            state._fsp--;

             after(grammarAccess.getDomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDom"


    // $ANTLR start "ruleDom"
    // InternalHlcl.g:112:1: ruleDom : ( ( rule__Dom__Alternatives ) ) ;
    public final void ruleDom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:116:2: ( ( ( rule__Dom__Alternatives ) ) )
            // InternalHlcl.g:117:2: ( ( rule__Dom__Alternatives ) )
            {
            // InternalHlcl.g:117:2: ( ( rule__Dom__Alternatives ) )
            // InternalHlcl.g:118:3: ( rule__Dom__Alternatives )
            {
             before(grammarAccess.getDomAccess().getAlternatives()); 
            // InternalHlcl.g:119:3: ( rule__Dom__Alternatives )
            // InternalHlcl.g:119:4: rule__Dom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Dom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDomAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDom"


    // $ANTLR start "entryRuleRangeDom"
    // InternalHlcl.g:128:1: entryRuleRangeDom : ruleRangeDom EOF ;
    public final void entryRuleRangeDom() throws RecognitionException {
        try {
            // InternalHlcl.g:129:1: ( ruleRangeDom EOF )
            // InternalHlcl.g:130:1: ruleRangeDom EOF
            {
             before(grammarAccess.getRangeDomRule()); 
            pushFollow(FOLLOW_1);
            ruleRangeDom();

            state._fsp--;

             after(grammarAccess.getRangeDomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRangeDom"


    // $ANTLR start "ruleRangeDom"
    // InternalHlcl.g:137:1: ruleRangeDom : ( ( rule__RangeDom__Group__0 ) ) ;
    public final void ruleRangeDom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:141:2: ( ( ( rule__RangeDom__Group__0 ) ) )
            // InternalHlcl.g:142:2: ( ( rule__RangeDom__Group__0 ) )
            {
            // InternalHlcl.g:142:2: ( ( rule__RangeDom__Group__0 ) )
            // InternalHlcl.g:143:3: ( rule__RangeDom__Group__0 )
            {
             before(grammarAccess.getRangeDomAccess().getGroup()); 
            // InternalHlcl.g:144:3: ( rule__RangeDom__Group__0 )
            // InternalHlcl.g:144:4: rule__RangeDom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RangeDom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeDomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRangeDom"


    // $ANTLR start "entryRuleSetDom"
    // InternalHlcl.g:153:1: entryRuleSetDom : ruleSetDom EOF ;
    public final void entryRuleSetDom() throws RecognitionException {
        try {
            // InternalHlcl.g:154:1: ( ruleSetDom EOF )
            // InternalHlcl.g:155:1: ruleSetDom EOF
            {
             before(grammarAccess.getSetDomRule()); 
            pushFollow(FOLLOW_1);
            ruleSetDom();

            state._fsp--;

             after(grammarAccess.getSetDomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetDom"


    // $ANTLR start "ruleSetDom"
    // InternalHlcl.g:162:1: ruleSetDom : ( ( rule__SetDom__Group__0 ) ) ;
    public final void ruleSetDom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:166:2: ( ( ( rule__SetDom__Group__0 ) ) )
            // InternalHlcl.g:167:2: ( ( rule__SetDom__Group__0 ) )
            {
            // InternalHlcl.g:167:2: ( ( rule__SetDom__Group__0 ) )
            // InternalHlcl.g:168:3: ( rule__SetDom__Group__0 )
            {
             before(grammarAccess.getSetDomAccess().getGroup()); 
            // InternalHlcl.g:169:3: ( rule__SetDom__Group__0 )
            // InternalHlcl.g:169:4: rule__SetDom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetDom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetDomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetDom"


    // $ANTLR start "entryRuleBoolDom"
    // InternalHlcl.g:178:1: entryRuleBoolDom : ruleBoolDom EOF ;
    public final void entryRuleBoolDom() throws RecognitionException {
        try {
            // InternalHlcl.g:179:1: ( ruleBoolDom EOF )
            // InternalHlcl.g:180:1: ruleBoolDom EOF
            {
             before(grammarAccess.getBoolDomRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolDom();

            state._fsp--;

             after(grammarAccess.getBoolDomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolDom"


    // $ANTLR start "ruleBoolDom"
    // InternalHlcl.g:187:1: ruleBoolDom : ( ( rule__BoolDom__DomAssignment ) ) ;
    public final void ruleBoolDom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:191:2: ( ( ( rule__BoolDom__DomAssignment ) ) )
            // InternalHlcl.g:192:2: ( ( rule__BoolDom__DomAssignment ) )
            {
            // InternalHlcl.g:192:2: ( ( rule__BoolDom__DomAssignment ) )
            // InternalHlcl.g:193:3: ( rule__BoolDom__DomAssignment )
            {
             before(grammarAccess.getBoolDomAccess().getDomAssignment()); 
            // InternalHlcl.g:194:3: ( rule__BoolDom__DomAssignment )
            // InternalHlcl.g:194:4: rule__BoolDom__DomAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BoolDom__DomAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBoolDomAccess().getDomAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolDom"


    // $ANTLR start "entryRuleStringDom"
    // InternalHlcl.g:203:1: entryRuleStringDom : ruleStringDom EOF ;
    public final void entryRuleStringDom() throws RecognitionException {
        try {
            // InternalHlcl.g:204:1: ( ruleStringDom EOF )
            // InternalHlcl.g:205:1: ruleStringDom EOF
            {
             before(grammarAccess.getStringDomRule()); 
            pushFollow(FOLLOW_1);
            ruleStringDom();

            state._fsp--;

             after(grammarAccess.getStringDomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringDom"


    // $ANTLR start "ruleStringDom"
    // InternalHlcl.g:212:1: ruleStringDom : ( ( rule__StringDom__Group__0 ) ) ;
    public final void ruleStringDom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:216:2: ( ( ( rule__StringDom__Group__0 ) ) )
            // InternalHlcl.g:217:2: ( ( rule__StringDom__Group__0 ) )
            {
            // InternalHlcl.g:217:2: ( ( rule__StringDom__Group__0 ) )
            // InternalHlcl.g:218:3: ( rule__StringDom__Group__0 )
            {
             before(grammarAccess.getStringDomAccess().getGroup()); 
            // InternalHlcl.g:219:3: ( rule__StringDom__Group__0 )
            // InternalHlcl.g:219:4: rule__StringDom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringDom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringDomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringDom"


    // $ANTLR start "entryRuleConsExp"
    // InternalHlcl.g:228:1: entryRuleConsExp : ruleConsExp EOF ;
    public final void entryRuleConsExp() throws RecognitionException {
        try {
            // InternalHlcl.g:229:1: ( ruleConsExp EOF )
            // InternalHlcl.g:230:1: ruleConsExp EOF
            {
             before(grammarAccess.getConsExpRule()); 
            pushFollow(FOLLOW_1);
            ruleConsExp();

            state._fsp--;

             after(grammarAccess.getConsExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConsExp"


    // $ANTLR start "ruleConsExp"
    // InternalHlcl.g:237:1: ruleConsExp : ( ( rule__ConsExp__Alternatives ) ) ;
    public final void ruleConsExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:241:2: ( ( ( rule__ConsExp__Alternatives ) ) )
            // InternalHlcl.g:242:2: ( ( rule__ConsExp__Alternatives ) )
            {
            // InternalHlcl.g:242:2: ( ( rule__ConsExp__Alternatives ) )
            // InternalHlcl.g:243:3: ( rule__ConsExp__Alternatives )
            {
             before(grammarAccess.getConsExpAccess().getAlternatives()); 
            // InternalHlcl.g:244:3: ( rule__ConsExp__Alternatives )
            // InternalHlcl.g:244:4: rule__ConsExp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConsExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConsExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConsExp"


    // $ANTLR start "entryRuleBooleanExp"
    // InternalHlcl.g:253:1: entryRuleBooleanExp : ruleBooleanExp EOF ;
    public final void entryRuleBooleanExp() throws RecognitionException {
        try {
            // InternalHlcl.g:254:1: ( ruleBooleanExp EOF )
            // InternalHlcl.g:255:1: ruleBooleanExp EOF
            {
             before(grammarAccess.getBooleanExpRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanExp();

            state._fsp--;

             after(grammarAccess.getBooleanExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanExp"


    // $ANTLR start "ruleBooleanExp"
    // InternalHlcl.g:262:1: ruleBooleanExp : ( 'Boolean expression' ) ;
    public final void ruleBooleanExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:266:2: ( ( 'Boolean expression' ) )
            // InternalHlcl.g:267:2: ( 'Boolean expression' )
            {
            // InternalHlcl.g:267:2: ( 'Boolean expression' )
            // InternalHlcl.g:268:3: 'Boolean expression'
            {
             before(grammarAccess.getBooleanExpAccess().getBooleanExpressionKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBooleanExpAccess().getBooleanExpressionKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExp"


    // $ANTLR start "entryRuleIntExp"
    // InternalHlcl.g:278:1: entryRuleIntExp : ruleIntExp EOF ;
    public final void entryRuleIntExp() throws RecognitionException {
        try {
            // InternalHlcl.g:279:1: ( ruleIntExp EOF )
            // InternalHlcl.g:280:1: ruleIntExp EOF
            {
             before(grammarAccess.getIntExpRule()); 
            pushFollow(FOLLOW_1);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getIntExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntExp"


    // $ANTLR start "ruleIntExp"
    // InternalHlcl.g:287:1: ruleIntExp : ( 'Int expression' ) ;
    public final void ruleIntExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:291:2: ( ( 'Int expression' ) )
            // InternalHlcl.g:292:2: ( 'Int expression' )
            {
            // InternalHlcl.g:292:2: ( 'Int expression' )
            // InternalHlcl.g:293:3: 'Int expression'
            {
             before(grammarAccess.getIntExpAccess().getIntExpressionKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIntExpAccess().getIntExpressionKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntExp"


    // $ANTLR start "rule__Dom__Alternatives"
    // InternalHlcl.g:302:1: rule__Dom__Alternatives : ( ( ruleRangeDom ) | ( ruleSetDom ) | ( ruleBoolDom ) | ( ruleStringDom ) );
    public final void rule__Dom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:306:1: ( ( ruleRangeDom ) | ( ruleSetDom ) | ( ruleBoolDom ) | ( ruleStringDom ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_STRING) ) {
                    alt1=4;
                }
                else if ( (LA1_2==RULE_INT) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalHlcl.g:307:2: ( ruleRangeDom )
                    {
                    // InternalHlcl.g:307:2: ( ruleRangeDom )
                    // InternalHlcl.g:308:3: ruleRangeDom
                    {
                     before(grammarAccess.getDomAccess().getRangeDomParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRangeDom();

                    state._fsp--;

                     after(grammarAccess.getDomAccess().getRangeDomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHlcl.g:313:2: ( ruleSetDom )
                    {
                    // InternalHlcl.g:313:2: ( ruleSetDom )
                    // InternalHlcl.g:314:3: ruleSetDom
                    {
                     before(grammarAccess.getDomAccess().getSetDomParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSetDom();

                    state._fsp--;

                     after(grammarAccess.getDomAccess().getSetDomParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHlcl.g:319:2: ( ruleBoolDom )
                    {
                    // InternalHlcl.g:319:2: ( ruleBoolDom )
                    // InternalHlcl.g:320:3: ruleBoolDom
                    {
                     before(grammarAccess.getDomAccess().getBoolDomParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolDom();

                    state._fsp--;

                     after(grammarAccess.getDomAccess().getBoolDomParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHlcl.g:325:2: ( ruleStringDom )
                    {
                    // InternalHlcl.g:325:2: ( ruleStringDom )
                    // InternalHlcl.g:326:3: ruleStringDom
                    {
                     before(grammarAccess.getDomAccess().getStringDomParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStringDom();

                    state._fsp--;

                     after(grammarAccess.getDomAccess().getStringDomParserRuleCall_3()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dom__Alternatives"


    // $ANTLR start "rule__ConsExp__Alternatives"
    // InternalHlcl.g:335:1: rule__ConsExp__Alternatives : ( ( ruleBooleanExp ) | ( ruleIntExp ) );
    public final void rule__ConsExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:339:1: ( ( ruleBooleanExp ) | ( ruleIntExp ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHlcl.g:340:2: ( ruleBooleanExp )
                    {
                    // InternalHlcl.g:340:2: ( ruleBooleanExp )
                    // InternalHlcl.g:341:3: ruleBooleanExp
                    {
                     before(grammarAccess.getConsExpAccess().getBooleanExpParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanExp();

                    state._fsp--;

                     after(grammarAccess.getConsExpAccess().getBooleanExpParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHlcl.g:346:2: ( ruleIntExp )
                    {
                    // InternalHlcl.g:346:2: ( ruleIntExp )
                    // InternalHlcl.g:347:3: ruleIntExp
                    {
                     before(grammarAccess.getConsExpAccess().getIntExpParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntExp();

                    state._fsp--;

                     after(grammarAccess.getConsExpAccess().getIntExpParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsExp__Alternatives"


    // $ANTLR start "rule__ConstraintProgram__Group__0"
    // InternalHlcl.g:356:1: rule__ConstraintProgram__Group__0 : rule__ConstraintProgram__Group__0__Impl rule__ConstraintProgram__Group__1 ;
    public final void rule__ConstraintProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:360:1: ( rule__ConstraintProgram__Group__0__Impl rule__ConstraintProgram__Group__1 )
            // InternalHlcl.g:361:2: rule__ConstraintProgram__Group__0__Impl rule__ConstraintProgram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConstraintProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintProgram__Group__0"


    // $ANTLR start "rule__ConstraintProgram__Group__0__Impl"
    // InternalHlcl.g:368:1: rule__ConstraintProgram__Group__0__Impl : ( 'variables:' ) ;
    public final void rule__ConstraintProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:372:1: ( ( 'variables:' ) )
            // InternalHlcl.g:373:1: ( 'variables:' )
            {
            // InternalHlcl.g:373:1: ( 'variables:' )
            // InternalHlcl.g:374:2: 'variables:'
            {
             before(grammarAccess.getConstraintProgramAccess().getVariablesKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConstraintProgramAccess().getVariablesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintProgram__Group__0__Impl"


    // $ANTLR start "rule__ConstraintProgram__Group__1"
    // InternalHlcl.g:383:1: rule__ConstraintProgram__Group__1 : rule__ConstraintProgram__Group__1__Impl rule__ConstraintProgram__Group__2 ;
    public final void rule__ConstraintProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:387:1: ( rule__ConstraintProgram__Group__1__Impl rule__ConstraintProgram__Group__2 )
            // InternalHlcl.g:388:2: rule__ConstraintProgram__Group__1__Impl rule__ConstraintProgram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ConstraintProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintProgram__Group__1"


    // $ANTLR start "rule__ConstraintProgram__Group__1__Impl"
    // InternalHlcl.g:395:1: rule__ConstraintProgram__Group__1__Impl : ( ( ( rule__ConstraintProgram__VarsAssignment_1 ) ) ( ( rule__ConstraintProgram__VarsAssignment_1 )* ) ) ;
    public final void rule__ConstraintProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:399:1: ( ( ( ( rule__ConstraintProgram__VarsAssignment_1 ) ) ( ( rule__ConstraintProgram__VarsAssignment_1 )* ) ) )
            // InternalHlcl.g:400:1: ( ( ( rule__ConstraintProgram__VarsAssignment_1 ) ) ( ( rule__ConstraintProgram__VarsAssignment_1 )* ) )
            {
            // InternalHlcl.g:400:1: ( ( ( rule__ConstraintProgram__VarsAssignment_1 ) ) ( ( rule__ConstraintProgram__VarsAssignment_1 )* ) )
            // InternalHlcl.g:401:2: ( ( rule__ConstraintProgram__VarsAssignment_1 ) ) ( ( rule__ConstraintProgram__VarsAssignment_1 )* )
            {
            // InternalHlcl.g:401:2: ( ( rule__ConstraintProgram__VarsAssignment_1 ) )
            // InternalHlcl.g:402:3: ( rule__ConstraintProgram__VarsAssignment_1 )
            {
             before(grammarAccess.getConstraintProgramAccess().getVarsAssignment_1()); 
            // InternalHlcl.g:403:3: ( rule__ConstraintProgram__VarsAssignment_1 )
            // InternalHlcl.g:403:4: rule__ConstraintProgram__VarsAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__ConstraintProgram__VarsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintProgramAccess().getVarsAssignment_1()); 

            }

            // InternalHlcl.g:406:2: ( ( rule__ConstraintProgram__VarsAssignment_1 )* )
            // InternalHlcl.g:407:3: ( rule__ConstraintProgram__VarsAssignment_1 )*
            {
             before(grammarAccess.getConstraintProgramAccess().getVarsAssignment_1()); 
            // InternalHlcl.g:408:3: ( rule__ConstraintProgram__VarsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalHlcl.g:408:4: rule__ConstraintProgram__VarsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ConstraintProgram__VarsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getConstraintProgramAccess().getVarsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintProgram__Group__1__Impl"


    // $ANTLR start "rule__ConstraintProgram__Group__2"
    // InternalHlcl.g:417:1: rule__ConstraintProgram__Group__2 : rule__ConstraintProgram__Group__2__Impl rule__ConstraintProgram__Group__3 ;
    public final void rule__ConstraintProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:421:1: ( rule__ConstraintProgram__Group__2__Impl rule__ConstraintProgram__Group__3 )
            // InternalHlcl.g:422:2: rule__ConstraintProgram__Group__2__Impl rule__ConstraintProgram__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ConstraintProgram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintProgram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintProgram__Group__2"


    // $ANTLR start "rule__ConstraintProgram__Group__2__Impl"
    // InternalHlcl.g:429:1: rule__ConstraintProgram__Group__2__Impl : ( 'constraints:' ) ;
    public final void rule__ConstraintProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:433:1: ( ( 'constraints:' ) )
            // InternalHlcl.g:434:1: ( 'constraints:' )
            {
            // InternalHlcl.g:434:1: ( 'constraints:' )
            // InternalHlcl.g:435:2: 'constraints:'
            {
             before(grammarAccess.getConstraintProgramAccess().getConstraintsKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConstraintProgramAccess().getConstraintsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintProgram__Group__2__Impl"


    // $ANTLR start "rule__ConstraintProgram__Group__3"
    // InternalHlcl.g:444:1: rule__ConstraintProgram__Group__3 : rule__ConstraintProgram__Group__3__Impl ;
    public final void rule__ConstraintProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:448:1: ( rule__ConstraintProgram__Group__3__Impl )
            // InternalHlcl.g:449:2: rule__ConstraintProgram__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintProgram__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintProgram__Group__3"


    // $ANTLR start "rule__ConstraintProgram__Group__3__Impl"
    // InternalHlcl.g:455:1: rule__ConstraintProgram__Group__3__Impl : ( ( rule__ConstraintProgram__ConstraintsAssignment_3 )* ) ;
    public final void rule__ConstraintProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:459:1: ( ( ( rule__ConstraintProgram__ConstraintsAssignment_3 )* ) )
            // InternalHlcl.g:460:1: ( ( rule__ConstraintProgram__ConstraintsAssignment_3 )* )
            {
            // InternalHlcl.g:460:1: ( ( rule__ConstraintProgram__ConstraintsAssignment_3 )* )
            // InternalHlcl.g:461:2: ( rule__ConstraintProgram__ConstraintsAssignment_3 )*
            {
             before(grammarAccess.getConstraintProgramAccess().getConstraintsAssignment_3()); 
            // InternalHlcl.g:462:2: ( rule__ConstraintProgram__ConstraintsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHlcl.g:462:3: rule__ConstraintProgram__ConstraintsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ConstraintProgram__ConstraintsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getConstraintProgramAccess().getConstraintsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintProgram__Group__3__Impl"


    // $ANTLR start "rule__Variables__Group__0"
    // InternalHlcl.g:471:1: rule__Variables__Group__0 : rule__Variables__Group__0__Impl rule__Variables__Group__1 ;
    public final void rule__Variables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:475:1: ( rule__Variables__Group__0__Impl rule__Variables__Group__1 )
            // InternalHlcl.g:476:2: rule__Variables__Group__0__Impl rule__Variables__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Variables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__0"


    // $ANTLR start "rule__Variables__Group__0__Impl"
    // InternalHlcl.g:483:1: rule__Variables__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:487:1: ( ( 'var' ) )
            // InternalHlcl.g:488:1: ( 'var' )
            {
            // InternalHlcl.g:488:1: ( 'var' )
            // InternalHlcl.g:489:2: 'var'
            {
             before(grammarAccess.getVariablesAccess().getVarKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__0__Impl"


    // $ANTLR start "rule__Variables__Group__1"
    // InternalHlcl.g:498:1: rule__Variables__Group__1 : rule__Variables__Group__1__Impl rule__Variables__Group__2 ;
    public final void rule__Variables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:502:1: ( rule__Variables__Group__1__Impl rule__Variables__Group__2 )
            // InternalHlcl.g:503:2: rule__Variables__Group__1__Impl rule__Variables__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Variables__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__1"


    // $ANTLR start "rule__Variables__Group__1__Impl"
    // InternalHlcl.g:510:1: rule__Variables__Group__1__Impl : ( ( rule__Variables__NameAssignment_1 ) ) ;
    public final void rule__Variables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:514:1: ( ( ( rule__Variables__NameAssignment_1 ) ) )
            // InternalHlcl.g:515:1: ( ( rule__Variables__NameAssignment_1 ) )
            {
            // InternalHlcl.g:515:1: ( ( rule__Variables__NameAssignment_1 ) )
            // InternalHlcl.g:516:2: ( rule__Variables__NameAssignment_1 )
            {
             before(grammarAccess.getVariablesAccess().getNameAssignment_1()); 
            // InternalHlcl.g:517:2: ( rule__Variables__NameAssignment_1 )
            // InternalHlcl.g:517:3: rule__Variables__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variables__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariablesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__1__Impl"


    // $ANTLR start "rule__Variables__Group__2"
    // InternalHlcl.g:525:1: rule__Variables__Group__2 : rule__Variables__Group__2__Impl rule__Variables__Group__3 ;
    public final void rule__Variables__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:529:1: ( rule__Variables__Group__2__Impl rule__Variables__Group__3 )
            // InternalHlcl.g:530:2: rule__Variables__Group__2__Impl rule__Variables__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Variables__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__2"


    // $ANTLR start "rule__Variables__Group__2__Impl"
    // InternalHlcl.g:537:1: rule__Variables__Group__2__Impl : ( 'domain:' ) ;
    public final void rule__Variables__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:541:1: ( ( 'domain:' ) )
            // InternalHlcl.g:542:1: ( 'domain:' )
            {
            // InternalHlcl.g:542:1: ( 'domain:' )
            // InternalHlcl.g:543:2: 'domain:'
            {
             before(grammarAccess.getVariablesAccess().getDomainKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getDomainKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__2__Impl"


    // $ANTLR start "rule__Variables__Group__3"
    // InternalHlcl.g:552:1: rule__Variables__Group__3 : rule__Variables__Group__3__Impl ;
    public final void rule__Variables__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:556:1: ( rule__Variables__Group__3__Impl )
            // InternalHlcl.g:557:2: rule__Variables__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variables__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__3"


    // $ANTLR start "rule__Variables__Group__3__Impl"
    // InternalHlcl.g:563:1: rule__Variables__Group__3__Impl : ( ( rule__Variables__DomAssignment_3 ) ) ;
    public final void rule__Variables__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:567:1: ( ( ( rule__Variables__DomAssignment_3 ) ) )
            // InternalHlcl.g:568:1: ( ( rule__Variables__DomAssignment_3 ) )
            {
            // InternalHlcl.g:568:1: ( ( rule__Variables__DomAssignment_3 ) )
            // InternalHlcl.g:569:2: ( rule__Variables__DomAssignment_3 )
            {
             before(grammarAccess.getVariablesAccess().getDomAssignment_3()); 
            // InternalHlcl.g:570:2: ( rule__Variables__DomAssignment_3 )
            // InternalHlcl.g:570:3: rule__Variables__DomAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variables__DomAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariablesAccess().getDomAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__3__Impl"


    // $ANTLR start "rule__RangeDom__Group__0"
    // InternalHlcl.g:579:1: rule__RangeDom__Group__0 : rule__RangeDom__Group__0__Impl rule__RangeDom__Group__1 ;
    public final void rule__RangeDom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:583:1: ( rule__RangeDom__Group__0__Impl rule__RangeDom__Group__1 )
            // InternalHlcl.g:584:2: rule__RangeDom__Group__0__Impl rule__RangeDom__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RangeDom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeDom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDom__Group__0"


    // $ANTLR start "rule__RangeDom__Group__0__Impl"
    // InternalHlcl.g:591:1: rule__RangeDom__Group__0__Impl : ( () ) ;
    public final void rule__RangeDom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:595:1: ( ( () ) )
            // InternalHlcl.g:596:1: ( () )
            {
            // InternalHlcl.g:596:1: ( () )
            // InternalHlcl.g:597:2: ()
            {
             before(grammarAccess.getRangeDomAccess().getRangeDomAction_0()); 
            // InternalHlcl.g:598:2: ()
            // InternalHlcl.g:598:3: 
            {
            }

             after(grammarAccess.getRangeDomAccess().getRangeDomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDom__Group__0__Impl"


    // $ANTLR start "rule__RangeDom__Group__1"
    // InternalHlcl.g:606:1: rule__RangeDom__Group__1 : rule__RangeDom__Group__1__Impl rule__RangeDom__Group__2 ;
    public final void rule__RangeDom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:610:1: ( rule__RangeDom__Group__1__Impl rule__RangeDom__Group__2 )
            // InternalHlcl.g:611:2: rule__RangeDom__Group__1__Impl rule__RangeDom__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RangeDom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeDom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDom__Group__1"


    // $ANTLR start "rule__RangeDom__Group__1__Impl"
    // InternalHlcl.g:618:1: rule__RangeDom__Group__1__Impl : ( ( rule__RangeDom__StartAssignment_1 ) ) ;
    public final void rule__RangeDom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:622:1: ( ( ( rule__RangeDom__StartAssignment_1 ) ) )
            // InternalHlcl.g:623:1: ( ( rule__RangeDom__StartAssignment_1 ) )
            {
            // InternalHlcl.g:623:1: ( ( rule__RangeDom__StartAssignment_1 ) )
            // InternalHlcl.g:624:2: ( rule__RangeDom__StartAssignment_1 )
            {
             before(grammarAccess.getRangeDomAccess().getStartAssignment_1()); 
            // InternalHlcl.g:625:2: ( rule__RangeDom__StartAssignment_1 )
            // InternalHlcl.g:625:3: rule__RangeDom__StartAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RangeDom__StartAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRangeDomAccess().getStartAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDom__Group__1__Impl"


    // $ANTLR start "rule__RangeDom__Group__2"
    // InternalHlcl.g:633:1: rule__RangeDom__Group__2 : rule__RangeDom__Group__2__Impl rule__RangeDom__Group__3 ;
    public final void rule__RangeDom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:637:1: ( rule__RangeDom__Group__2__Impl rule__RangeDom__Group__3 )
            // InternalHlcl.g:638:2: rule__RangeDom__Group__2__Impl rule__RangeDom__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RangeDom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeDom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDom__Group__2"


    // $ANTLR start "rule__RangeDom__Group__2__Impl"
    // InternalHlcl.g:645:1: rule__RangeDom__Group__2__Impl : ( '::' ) ;
    public final void rule__RangeDom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:649:1: ( ( '::' ) )
            // InternalHlcl.g:650:1: ( '::' )
            {
            // InternalHlcl.g:650:1: ( '::' )
            // InternalHlcl.g:651:2: '::'
            {
             before(grammarAccess.getRangeDomAccess().getColonColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRangeDomAccess().getColonColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDom__Group__2__Impl"


    // $ANTLR start "rule__RangeDom__Group__3"
    // InternalHlcl.g:660:1: rule__RangeDom__Group__3 : rule__RangeDom__Group__3__Impl ;
    public final void rule__RangeDom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:664:1: ( rule__RangeDom__Group__3__Impl )
            // InternalHlcl.g:665:2: rule__RangeDom__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeDom__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDom__Group__3"


    // $ANTLR start "rule__RangeDom__Group__3__Impl"
    // InternalHlcl.g:671:1: rule__RangeDom__Group__3__Impl : ( ( rule__RangeDom__EndAssignment_3 ) ) ;
    public final void rule__RangeDom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:675:1: ( ( ( rule__RangeDom__EndAssignment_3 ) ) )
            // InternalHlcl.g:676:1: ( ( rule__RangeDom__EndAssignment_3 ) )
            {
            // InternalHlcl.g:676:1: ( ( rule__RangeDom__EndAssignment_3 ) )
            // InternalHlcl.g:677:2: ( rule__RangeDom__EndAssignment_3 )
            {
             before(grammarAccess.getRangeDomAccess().getEndAssignment_3()); 
            // InternalHlcl.g:678:2: ( rule__RangeDom__EndAssignment_3 )
            // InternalHlcl.g:678:3: rule__RangeDom__EndAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RangeDom__EndAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRangeDomAccess().getEndAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDom__Group__3__Impl"


    // $ANTLR start "rule__SetDom__Group__0"
    // InternalHlcl.g:687:1: rule__SetDom__Group__0 : rule__SetDom__Group__0__Impl rule__SetDom__Group__1 ;
    public final void rule__SetDom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:691:1: ( rule__SetDom__Group__0__Impl rule__SetDom__Group__1 )
            // InternalHlcl.g:692:2: rule__SetDom__Group__0__Impl rule__SetDom__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__SetDom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetDom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDom__Group__0"


    // $ANTLR start "rule__SetDom__Group__0__Impl"
    // InternalHlcl.g:699:1: rule__SetDom__Group__0__Impl : ( () ) ;
    public final void rule__SetDom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:703:1: ( ( () ) )
            // InternalHlcl.g:704:1: ( () )
            {
            // InternalHlcl.g:704:1: ( () )
            // InternalHlcl.g:705:2: ()
            {
             before(grammarAccess.getSetDomAccess().getSetDomAction_0()); 
            // InternalHlcl.g:706:2: ()
            // InternalHlcl.g:706:3: 
            {
            }

             after(grammarAccess.getSetDomAccess().getSetDomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDom__Group__0__Impl"


    // $ANTLR start "rule__SetDom__Group__1"
    // InternalHlcl.g:714:1: rule__SetDom__Group__1 : rule__SetDom__Group__1__Impl rule__SetDom__Group__2 ;
    public final void rule__SetDom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:718:1: ( rule__SetDom__Group__1__Impl rule__SetDom__Group__2 )
            // InternalHlcl.g:719:2: rule__SetDom__Group__1__Impl rule__SetDom__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__SetDom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetDom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDom__Group__1"


    // $ANTLR start "rule__SetDom__Group__1__Impl"
    // InternalHlcl.g:726:1: rule__SetDom__Group__1__Impl : ( '[' ) ;
    public final void rule__SetDom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:730:1: ( ( '[' ) )
            // InternalHlcl.g:731:1: ( '[' )
            {
            // InternalHlcl.g:731:1: ( '[' )
            // InternalHlcl.g:732:2: '['
            {
             before(grammarAccess.getSetDomAccess().getLeftSquareBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSetDomAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDom__Group__1__Impl"


    // $ANTLR start "rule__SetDom__Group__2"
    // InternalHlcl.g:741:1: rule__SetDom__Group__2 : rule__SetDom__Group__2__Impl rule__SetDom__Group__3 ;
    public final void rule__SetDom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:745:1: ( rule__SetDom__Group__2__Impl rule__SetDom__Group__3 )
            // InternalHlcl.g:746:2: rule__SetDom__Group__2__Impl rule__SetDom__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__SetDom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetDom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDom__Group__2"


    // $ANTLR start "rule__SetDom__Group__2__Impl"
    // InternalHlcl.g:753:1: rule__SetDom__Group__2__Impl : ( ( ( rule__SetDom__ListAssignment_2 ) ) ( ( rule__SetDom__ListAssignment_2 )* ) ) ;
    public final void rule__SetDom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:757:1: ( ( ( ( rule__SetDom__ListAssignment_2 ) ) ( ( rule__SetDom__ListAssignment_2 )* ) ) )
            // InternalHlcl.g:758:1: ( ( ( rule__SetDom__ListAssignment_2 ) ) ( ( rule__SetDom__ListAssignment_2 )* ) )
            {
            // InternalHlcl.g:758:1: ( ( ( rule__SetDom__ListAssignment_2 ) ) ( ( rule__SetDom__ListAssignment_2 )* ) )
            // InternalHlcl.g:759:2: ( ( rule__SetDom__ListAssignment_2 ) ) ( ( rule__SetDom__ListAssignment_2 )* )
            {
            // InternalHlcl.g:759:2: ( ( rule__SetDom__ListAssignment_2 ) )
            // InternalHlcl.g:760:3: ( rule__SetDom__ListAssignment_2 )
            {
             before(grammarAccess.getSetDomAccess().getListAssignment_2()); 
            // InternalHlcl.g:761:3: ( rule__SetDom__ListAssignment_2 )
            // InternalHlcl.g:761:4: rule__SetDom__ListAssignment_2
            {
            pushFollow(FOLLOW_15);
            rule__SetDom__ListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetDomAccess().getListAssignment_2()); 

            }

            // InternalHlcl.g:764:2: ( ( rule__SetDom__ListAssignment_2 )* )
            // InternalHlcl.g:765:3: ( rule__SetDom__ListAssignment_2 )*
            {
             before(grammarAccess.getSetDomAccess().getListAssignment_2()); 
            // InternalHlcl.g:766:3: ( rule__SetDom__ListAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHlcl.g:766:4: rule__SetDom__ListAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SetDom__ListAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSetDomAccess().getListAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDom__Group__2__Impl"


    // $ANTLR start "rule__SetDom__Group__3"
    // InternalHlcl.g:775:1: rule__SetDom__Group__3 : rule__SetDom__Group__3__Impl ;
    public final void rule__SetDom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:779:1: ( rule__SetDom__Group__3__Impl )
            // InternalHlcl.g:780:2: rule__SetDom__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetDom__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDom__Group__3"


    // $ANTLR start "rule__SetDom__Group__3__Impl"
    // InternalHlcl.g:786:1: rule__SetDom__Group__3__Impl : ( ']' ) ;
    public final void rule__SetDom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:790:1: ( ( ']' ) )
            // InternalHlcl.g:791:1: ( ']' )
            {
            // InternalHlcl.g:791:1: ( ']' )
            // InternalHlcl.g:792:2: ']'
            {
             before(grammarAccess.getSetDomAccess().getRightSquareBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSetDomAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDom__Group__3__Impl"


    // $ANTLR start "rule__StringDom__Group__0"
    // InternalHlcl.g:802:1: rule__StringDom__Group__0 : rule__StringDom__Group__0__Impl rule__StringDom__Group__1 ;
    public final void rule__StringDom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:806:1: ( rule__StringDom__Group__0__Impl rule__StringDom__Group__1 )
            // InternalHlcl.g:807:2: rule__StringDom__Group__0__Impl rule__StringDom__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__StringDom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDom__Group__0"


    // $ANTLR start "rule__StringDom__Group__0__Impl"
    // InternalHlcl.g:814:1: rule__StringDom__Group__0__Impl : ( () ) ;
    public final void rule__StringDom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:818:1: ( ( () ) )
            // InternalHlcl.g:819:1: ( () )
            {
            // InternalHlcl.g:819:1: ( () )
            // InternalHlcl.g:820:2: ()
            {
             before(grammarAccess.getStringDomAccess().getStringDomAction_0()); 
            // InternalHlcl.g:821:2: ()
            // InternalHlcl.g:821:3: 
            {
            }

             after(grammarAccess.getStringDomAccess().getStringDomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDom__Group__0__Impl"


    // $ANTLR start "rule__StringDom__Group__1"
    // InternalHlcl.g:829:1: rule__StringDom__Group__1 : rule__StringDom__Group__1__Impl rule__StringDom__Group__2 ;
    public final void rule__StringDom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:833:1: ( rule__StringDom__Group__1__Impl rule__StringDom__Group__2 )
            // InternalHlcl.g:834:2: rule__StringDom__Group__1__Impl rule__StringDom__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__StringDom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDom__Group__1"


    // $ANTLR start "rule__StringDom__Group__1__Impl"
    // InternalHlcl.g:841:1: rule__StringDom__Group__1__Impl : ( '[' ) ;
    public final void rule__StringDom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:845:1: ( ( '[' ) )
            // InternalHlcl.g:846:1: ( '[' )
            {
            // InternalHlcl.g:846:1: ( '[' )
            // InternalHlcl.g:847:2: '['
            {
             before(grammarAccess.getStringDomAccess().getLeftSquareBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStringDomAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDom__Group__1__Impl"


    // $ANTLR start "rule__StringDom__Group__2"
    // InternalHlcl.g:856:1: rule__StringDom__Group__2 : rule__StringDom__Group__2__Impl rule__StringDom__Group__3 ;
    public final void rule__StringDom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:860:1: ( rule__StringDom__Group__2__Impl rule__StringDom__Group__3 )
            // InternalHlcl.g:861:2: rule__StringDom__Group__2__Impl rule__StringDom__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__StringDom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDom__Group__2"


    // $ANTLR start "rule__StringDom__Group__2__Impl"
    // InternalHlcl.g:868:1: rule__StringDom__Group__2__Impl : ( ( ( rule__StringDom__ListAssignment_2 ) ) ( ( rule__StringDom__ListAssignment_2 )* ) ) ;
    public final void rule__StringDom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:872:1: ( ( ( ( rule__StringDom__ListAssignment_2 ) ) ( ( rule__StringDom__ListAssignment_2 )* ) ) )
            // InternalHlcl.g:873:1: ( ( ( rule__StringDom__ListAssignment_2 ) ) ( ( rule__StringDom__ListAssignment_2 )* ) )
            {
            // InternalHlcl.g:873:1: ( ( ( rule__StringDom__ListAssignment_2 ) ) ( ( rule__StringDom__ListAssignment_2 )* ) )
            // InternalHlcl.g:874:2: ( ( rule__StringDom__ListAssignment_2 ) ) ( ( rule__StringDom__ListAssignment_2 )* )
            {
            // InternalHlcl.g:874:2: ( ( rule__StringDom__ListAssignment_2 ) )
            // InternalHlcl.g:875:3: ( rule__StringDom__ListAssignment_2 )
            {
             before(grammarAccess.getStringDomAccess().getListAssignment_2()); 
            // InternalHlcl.g:876:3: ( rule__StringDom__ListAssignment_2 )
            // InternalHlcl.g:876:4: rule__StringDom__ListAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__StringDom__ListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringDomAccess().getListAssignment_2()); 

            }

            // InternalHlcl.g:879:2: ( ( rule__StringDom__ListAssignment_2 )* )
            // InternalHlcl.g:880:3: ( rule__StringDom__ListAssignment_2 )*
            {
             before(grammarAccess.getStringDomAccess().getListAssignment_2()); 
            // InternalHlcl.g:881:3: ( rule__StringDom__ListAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalHlcl.g:881:4: rule__StringDom__ListAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__StringDom__ListAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStringDomAccess().getListAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDom__Group__2__Impl"


    // $ANTLR start "rule__StringDom__Group__3"
    // InternalHlcl.g:890:1: rule__StringDom__Group__3 : rule__StringDom__Group__3__Impl ;
    public final void rule__StringDom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:894:1: ( rule__StringDom__Group__3__Impl )
            // InternalHlcl.g:895:2: rule__StringDom__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringDom__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDom__Group__3"


    // $ANTLR start "rule__StringDom__Group__3__Impl"
    // InternalHlcl.g:901:1: rule__StringDom__Group__3__Impl : ( ']' ) ;
    public final void rule__StringDom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:905:1: ( ( ']' ) )
            // InternalHlcl.g:906:1: ( ']' )
            {
            // InternalHlcl.g:906:1: ( ']' )
            // InternalHlcl.g:907:2: ']'
            {
             before(grammarAccess.getStringDomAccess().getRightSquareBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStringDomAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDom__Group__3__Impl"


    // $ANTLR start "rule__ConstraintProgram__VarsAssignment_1"
    // InternalHlcl.g:917:1: rule__ConstraintProgram__VarsAssignment_1 : ( ruleVariables ) ;
    public final void rule__ConstraintProgram__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:921:1: ( ( ruleVariables ) )
            // InternalHlcl.g:922:2: ( ruleVariables )
            {
            // InternalHlcl.g:922:2: ( ruleVariables )
            // InternalHlcl.g:923:3: ruleVariables
            {
             before(grammarAccess.getConstraintProgramAccess().getVarsVariablesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariables();

            state._fsp--;

             after(grammarAccess.getConstraintProgramAccess().getVarsVariablesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintProgram__VarsAssignment_1"


    // $ANTLR start "rule__ConstraintProgram__ConstraintsAssignment_3"
    // InternalHlcl.g:932:1: rule__ConstraintProgram__ConstraintsAssignment_3 : ( ruleConsExp ) ;
    public final void rule__ConstraintProgram__ConstraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:936:1: ( ( ruleConsExp ) )
            // InternalHlcl.g:937:2: ( ruleConsExp )
            {
            // InternalHlcl.g:937:2: ( ruleConsExp )
            // InternalHlcl.g:938:3: ruleConsExp
            {
             before(grammarAccess.getConstraintProgramAccess().getConstraintsConsExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConsExp();

            state._fsp--;

             after(grammarAccess.getConstraintProgramAccess().getConstraintsConsExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintProgram__ConstraintsAssignment_3"


    // $ANTLR start "rule__Variables__NameAssignment_1"
    // InternalHlcl.g:947:1: rule__Variables__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variables__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:951:1: ( ( RULE_ID ) )
            // InternalHlcl.g:952:2: ( RULE_ID )
            {
            // InternalHlcl.g:952:2: ( RULE_ID )
            // InternalHlcl.g:953:3: RULE_ID
            {
             before(grammarAccess.getVariablesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__NameAssignment_1"


    // $ANTLR start "rule__Variables__DomAssignment_3"
    // InternalHlcl.g:962:1: rule__Variables__DomAssignment_3 : ( ruleDom ) ;
    public final void rule__Variables__DomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:966:1: ( ( ruleDom ) )
            // InternalHlcl.g:967:2: ( ruleDom )
            {
            // InternalHlcl.g:967:2: ( ruleDom )
            // InternalHlcl.g:968:3: ruleDom
            {
             before(grammarAccess.getVariablesAccess().getDomDomParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDom();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().getDomDomParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__DomAssignment_3"


    // $ANTLR start "rule__RangeDom__StartAssignment_1"
    // InternalHlcl.g:977:1: rule__RangeDom__StartAssignment_1 : ( RULE_INT ) ;
    public final void rule__RangeDom__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:981:1: ( ( RULE_INT ) )
            // InternalHlcl.g:982:2: ( RULE_INT )
            {
            // InternalHlcl.g:982:2: ( RULE_INT )
            // InternalHlcl.g:983:3: RULE_INT
            {
             before(grammarAccess.getRangeDomAccess().getStartINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeDomAccess().getStartINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDom__StartAssignment_1"


    // $ANTLR start "rule__RangeDom__EndAssignment_3"
    // InternalHlcl.g:992:1: rule__RangeDom__EndAssignment_3 : ( RULE_INT ) ;
    public final void rule__RangeDom__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:996:1: ( ( RULE_INT ) )
            // InternalHlcl.g:997:2: ( RULE_INT )
            {
            // InternalHlcl.g:997:2: ( RULE_INT )
            // InternalHlcl.g:998:3: RULE_INT
            {
             before(grammarAccess.getRangeDomAccess().getEndINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeDomAccess().getEndINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeDom__EndAssignment_3"


    // $ANTLR start "rule__SetDom__ListAssignment_2"
    // InternalHlcl.g:1007:1: rule__SetDom__ListAssignment_2 : ( RULE_INT ) ;
    public final void rule__SetDom__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:1011:1: ( ( RULE_INT ) )
            // InternalHlcl.g:1012:2: ( RULE_INT )
            {
            // InternalHlcl.g:1012:2: ( RULE_INT )
            // InternalHlcl.g:1013:3: RULE_INT
            {
             before(grammarAccess.getSetDomAccess().getListINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSetDomAccess().getListINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetDom__ListAssignment_2"


    // $ANTLR start "rule__BoolDom__DomAssignment"
    // InternalHlcl.g:1022:1: rule__BoolDom__DomAssignment : ( ( 'boolDomain' ) ) ;
    public final void rule__BoolDom__DomAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:1026:1: ( ( ( 'boolDomain' ) ) )
            // InternalHlcl.g:1027:2: ( ( 'boolDomain' ) )
            {
            // InternalHlcl.g:1027:2: ( ( 'boolDomain' ) )
            // InternalHlcl.g:1028:3: ( 'boolDomain' )
            {
             before(grammarAccess.getBoolDomAccess().getDomBoolDomainKeyword_0()); 
            // InternalHlcl.g:1029:3: ( 'boolDomain' )
            // InternalHlcl.g:1030:4: 'boolDomain'
            {
             before(grammarAccess.getBoolDomAccess().getDomBoolDomainKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBoolDomAccess().getDomBoolDomainKeyword_0()); 

            }

             after(grammarAccess.getBoolDomAccess().getDomBoolDomainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolDom__DomAssignment"


    // $ANTLR start "rule__StringDom__ListAssignment_2"
    // InternalHlcl.g:1041:1: rule__StringDom__ListAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringDom__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:1045:1: ( ( RULE_STRING ) )
            // InternalHlcl.g:1046:2: ( RULE_STRING )
            {
            // InternalHlcl.g:1046:2: ( RULE_STRING )
            // InternalHlcl.g:1047:3: RULE_STRING
            {
             before(grammarAccess.getStringDomAccess().getListSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringDomAccess().getListSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDom__ListAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000140020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000042L});

}