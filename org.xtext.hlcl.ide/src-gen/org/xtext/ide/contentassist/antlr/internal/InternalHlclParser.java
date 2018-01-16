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


    // $ANTLR start "entryRuleConsExp"
    // InternalHlcl.g:203:1: entryRuleConsExp : ruleConsExp EOF ;
    public final void entryRuleConsExp() throws RecognitionException {
        try {
            // InternalHlcl.g:204:1: ( ruleConsExp EOF )
            // InternalHlcl.g:205:1: ruleConsExp EOF
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
    // InternalHlcl.g:212:1: ruleConsExp : ( ( rule__ConsExp__Alternatives ) ) ;
    public final void ruleConsExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:216:2: ( ( ( rule__ConsExp__Alternatives ) ) )
            // InternalHlcl.g:217:2: ( ( rule__ConsExp__Alternatives ) )
            {
            // InternalHlcl.g:217:2: ( ( rule__ConsExp__Alternatives ) )
            // InternalHlcl.g:218:3: ( rule__ConsExp__Alternatives )
            {
             before(grammarAccess.getConsExpAccess().getAlternatives()); 
            // InternalHlcl.g:219:3: ( rule__ConsExp__Alternatives )
            // InternalHlcl.g:219:4: rule__ConsExp__Alternatives
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
    // InternalHlcl.g:228:1: entryRuleBooleanExp : ruleBooleanExp EOF ;
    public final void entryRuleBooleanExp() throws RecognitionException {
        try {
            // InternalHlcl.g:229:1: ( ruleBooleanExp EOF )
            // InternalHlcl.g:230:1: ruleBooleanExp EOF
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
    // InternalHlcl.g:237:1: ruleBooleanExp : ( 'Boolean expression' ) ;
    public final void ruleBooleanExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:241:2: ( ( 'Boolean expression' ) )
            // InternalHlcl.g:242:2: ( 'Boolean expression' )
            {
            // InternalHlcl.g:242:2: ( 'Boolean expression' )
            // InternalHlcl.g:243:3: 'Boolean expression'
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
    // InternalHlcl.g:253:1: entryRuleIntExp : ruleIntExp EOF ;
    public final void entryRuleIntExp() throws RecognitionException {
        try {
            // InternalHlcl.g:254:1: ( ruleIntExp EOF )
            // InternalHlcl.g:255:1: ruleIntExp EOF
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
    // InternalHlcl.g:262:1: ruleIntExp : ( 'Int expression' ) ;
    public final void ruleIntExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:266:2: ( ( 'Int expression' ) )
            // InternalHlcl.g:267:2: ( 'Int expression' )
            {
            // InternalHlcl.g:267:2: ( 'Int expression' )
            // InternalHlcl.g:268:3: 'Int expression'
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
    // InternalHlcl.g:277:1: rule__Dom__Alternatives : ( ( ruleRangeDom ) | ( ruleSetDom ) | ( ruleBoolDom ) );
    public final void rule__Dom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:281:1: ( ( ruleRangeDom ) | ( ruleSetDom ) | ( ruleBoolDom ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
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
                    // InternalHlcl.g:282:2: ( ruleRangeDom )
                    {
                    // InternalHlcl.g:282:2: ( ruleRangeDom )
                    // InternalHlcl.g:283:3: ruleRangeDom
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
                    // InternalHlcl.g:288:2: ( ruleSetDom )
                    {
                    // InternalHlcl.g:288:2: ( ruleSetDom )
                    // InternalHlcl.g:289:3: ruleSetDom
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
                    // InternalHlcl.g:294:2: ( ruleBoolDom )
                    {
                    // InternalHlcl.g:294:2: ( ruleBoolDom )
                    // InternalHlcl.g:295:3: ruleBoolDom
                    {
                     before(grammarAccess.getDomAccess().getBoolDomParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolDom();

                    state._fsp--;

                     after(grammarAccess.getDomAccess().getBoolDomParserRuleCall_2()); 

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
    // InternalHlcl.g:304:1: rule__ConsExp__Alternatives : ( ( ruleBooleanExp ) | ( ruleIntExp ) );
    public final void rule__ConsExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:308:1: ( ( ruleBooleanExp ) | ( ruleIntExp ) )
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
                    // InternalHlcl.g:309:2: ( ruleBooleanExp )
                    {
                    // InternalHlcl.g:309:2: ( ruleBooleanExp )
                    // InternalHlcl.g:310:3: ruleBooleanExp
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
                    // InternalHlcl.g:315:2: ( ruleIntExp )
                    {
                    // InternalHlcl.g:315:2: ( ruleIntExp )
                    // InternalHlcl.g:316:3: ruleIntExp
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
    // InternalHlcl.g:325:1: rule__ConstraintProgram__Group__0 : rule__ConstraintProgram__Group__0__Impl rule__ConstraintProgram__Group__1 ;
    public final void rule__ConstraintProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:329:1: ( rule__ConstraintProgram__Group__0__Impl rule__ConstraintProgram__Group__1 )
            // InternalHlcl.g:330:2: rule__ConstraintProgram__Group__0__Impl rule__ConstraintProgram__Group__1
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
    // InternalHlcl.g:337:1: rule__ConstraintProgram__Group__0__Impl : ( 'variables:' ) ;
    public final void rule__ConstraintProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:341:1: ( ( 'variables:' ) )
            // InternalHlcl.g:342:1: ( 'variables:' )
            {
            // InternalHlcl.g:342:1: ( 'variables:' )
            // InternalHlcl.g:343:2: 'variables:'
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
    // InternalHlcl.g:352:1: rule__ConstraintProgram__Group__1 : rule__ConstraintProgram__Group__1__Impl rule__ConstraintProgram__Group__2 ;
    public final void rule__ConstraintProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:356:1: ( rule__ConstraintProgram__Group__1__Impl rule__ConstraintProgram__Group__2 )
            // InternalHlcl.g:357:2: rule__ConstraintProgram__Group__1__Impl rule__ConstraintProgram__Group__2
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
    // InternalHlcl.g:364:1: rule__ConstraintProgram__Group__1__Impl : ( ( ( rule__ConstraintProgram__VarsAssignment_1 ) ) ( ( rule__ConstraintProgram__VarsAssignment_1 )* ) ) ;
    public final void rule__ConstraintProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:368:1: ( ( ( ( rule__ConstraintProgram__VarsAssignment_1 ) ) ( ( rule__ConstraintProgram__VarsAssignment_1 )* ) ) )
            // InternalHlcl.g:369:1: ( ( ( rule__ConstraintProgram__VarsAssignment_1 ) ) ( ( rule__ConstraintProgram__VarsAssignment_1 )* ) )
            {
            // InternalHlcl.g:369:1: ( ( ( rule__ConstraintProgram__VarsAssignment_1 ) ) ( ( rule__ConstraintProgram__VarsAssignment_1 )* ) )
            // InternalHlcl.g:370:2: ( ( rule__ConstraintProgram__VarsAssignment_1 ) ) ( ( rule__ConstraintProgram__VarsAssignment_1 )* )
            {
            // InternalHlcl.g:370:2: ( ( rule__ConstraintProgram__VarsAssignment_1 ) )
            // InternalHlcl.g:371:3: ( rule__ConstraintProgram__VarsAssignment_1 )
            {
             before(grammarAccess.getConstraintProgramAccess().getVarsAssignment_1()); 
            // InternalHlcl.g:372:3: ( rule__ConstraintProgram__VarsAssignment_1 )
            // InternalHlcl.g:372:4: rule__ConstraintProgram__VarsAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__ConstraintProgram__VarsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintProgramAccess().getVarsAssignment_1()); 

            }

            // InternalHlcl.g:375:2: ( ( rule__ConstraintProgram__VarsAssignment_1 )* )
            // InternalHlcl.g:376:3: ( rule__ConstraintProgram__VarsAssignment_1 )*
            {
             before(grammarAccess.getConstraintProgramAccess().getVarsAssignment_1()); 
            // InternalHlcl.g:377:3: ( rule__ConstraintProgram__VarsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalHlcl.g:377:4: rule__ConstraintProgram__VarsAssignment_1
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
    // InternalHlcl.g:386:1: rule__ConstraintProgram__Group__2 : rule__ConstraintProgram__Group__2__Impl rule__ConstraintProgram__Group__3 ;
    public final void rule__ConstraintProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:390:1: ( rule__ConstraintProgram__Group__2__Impl rule__ConstraintProgram__Group__3 )
            // InternalHlcl.g:391:2: rule__ConstraintProgram__Group__2__Impl rule__ConstraintProgram__Group__3
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
    // InternalHlcl.g:398:1: rule__ConstraintProgram__Group__2__Impl : ( 'constraints:' ) ;
    public final void rule__ConstraintProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:402:1: ( ( 'constraints:' ) )
            // InternalHlcl.g:403:1: ( 'constraints:' )
            {
            // InternalHlcl.g:403:1: ( 'constraints:' )
            // InternalHlcl.g:404:2: 'constraints:'
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
    // InternalHlcl.g:413:1: rule__ConstraintProgram__Group__3 : rule__ConstraintProgram__Group__3__Impl ;
    public final void rule__ConstraintProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:417:1: ( rule__ConstraintProgram__Group__3__Impl )
            // InternalHlcl.g:418:2: rule__ConstraintProgram__Group__3__Impl
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
    // InternalHlcl.g:424:1: rule__ConstraintProgram__Group__3__Impl : ( ( rule__ConstraintProgram__ConstraintsAssignment_3 )* ) ;
    public final void rule__ConstraintProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:428:1: ( ( ( rule__ConstraintProgram__ConstraintsAssignment_3 )* ) )
            // InternalHlcl.g:429:1: ( ( rule__ConstraintProgram__ConstraintsAssignment_3 )* )
            {
            // InternalHlcl.g:429:1: ( ( rule__ConstraintProgram__ConstraintsAssignment_3 )* )
            // InternalHlcl.g:430:2: ( rule__ConstraintProgram__ConstraintsAssignment_3 )*
            {
             before(grammarAccess.getConstraintProgramAccess().getConstraintsAssignment_3()); 
            // InternalHlcl.g:431:2: ( rule__ConstraintProgram__ConstraintsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHlcl.g:431:3: rule__ConstraintProgram__ConstraintsAssignment_3
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
    // InternalHlcl.g:440:1: rule__Variables__Group__0 : rule__Variables__Group__0__Impl rule__Variables__Group__1 ;
    public final void rule__Variables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:444:1: ( rule__Variables__Group__0__Impl rule__Variables__Group__1 )
            // InternalHlcl.g:445:2: rule__Variables__Group__0__Impl rule__Variables__Group__1
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
    // InternalHlcl.g:452:1: rule__Variables__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:456:1: ( ( 'var' ) )
            // InternalHlcl.g:457:1: ( 'var' )
            {
            // InternalHlcl.g:457:1: ( 'var' )
            // InternalHlcl.g:458:2: 'var'
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
    // InternalHlcl.g:467:1: rule__Variables__Group__1 : rule__Variables__Group__1__Impl rule__Variables__Group__2 ;
    public final void rule__Variables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:471:1: ( rule__Variables__Group__1__Impl rule__Variables__Group__2 )
            // InternalHlcl.g:472:2: rule__Variables__Group__1__Impl rule__Variables__Group__2
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
    // InternalHlcl.g:479:1: rule__Variables__Group__1__Impl : ( ( rule__Variables__NameAssignment_1 ) ) ;
    public final void rule__Variables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:483:1: ( ( ( rule__Variables__NameAssignment_1 ) ) )
            // InternalHlcl.g:484:1: ( ( rule__Variables__NameAssignment_1 ) )
            {
            // InternalHlcl.g:484:1: ( ( rule__Variables__NameAssignment_1 ) )
            // InternalHlcl.g:485:2: ( rule__Variables__NameAssignment_1 )
            {
             before(grammarAccess.getVariablesAccess().getNameAssignment_1()); 
            // InternalHlcl.g:486:2: ( rule__Variables__NameAssignment_1 )
            // InternalHlcl.g:486:3: rule__Variables__NameAssignment_1
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
    // InternalHlcl.g:494:1: rule__Variables__Group__2 : rule__Variables__Group__2__Impl rule__Variables__Group__3 ;
    public final void rule__Variables__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:498:1: ( rule__Variables__Group__2__Impl rule__Variables__Group__3 )
            // InternalHlcl.g:499:2: rule__Variables__Group__2__Impl rule__Variables__Group__3
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
    // InternalHlcl.g:506:1: rule__Variables__Group__2__Impl : ( 'domain:' ) ;
    public final void rule__Variables__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:510:1: ( ( 'domain:' ) )
            // InternalHlcl.g:511:1: ( 'domain:' )
            {
            // InternalHlcl.g:511:1: ( 'domain:' )
            // InternalHlcl.g:512:2: 'domain:'
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
    // InternalHlcl.g:521:1: rule__Variables__Group__3 : rule__Variables__Group__3__Impl ;
    public final void rule__Variables__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:525:1: ( rule__Variables__Group__3__Impl )
            // InternalHlcl.g:526:2: rule__Variables__Group__3__Impl
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
    // InternalHlcl.g:532:1: rule__Variables__Group__3__Impl : ( ( rule__Variables__DomAssignment_3 ) ) ;
    public final void rule__Variables__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:536:1: ( ( ( rule__Variables__DomAssignment_3 ) ) )
            // InternalHlcl.g:537:1: ( ( rule__Variables__DomAssignment_3 ) )
            {
            // InternalHlcl.g:537:1: ( ( rule__Variables__DomAssignment_3 ) )
            // InternalHlcl.g:538:2: ( rule__Variables__DomAssignment_3 )
            {
             before(grammarAccess.getVariablesAccess().getDomAssignment_3()); 
            // InternalHlcl.g:539:2: ( rule__Variables__DomAssignment_3 )
            // InternalHlcl.g:539:3: rule__Variables__DomAssignment_3
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
    // InternalHlcl.g:548:1: rule__RangeDom__Group__0 : rule__RangeDom__Group__0__Impl rule__RangeDom__Group__1 ;
    public final void rule__RangeDom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:552:1: ( rule__RangeDom__Group__0__Impl rule__RangeDom__Group__1 )
            // InternalHlcl.g:553:2: rule__RangeDom__Group__0__Impl rule__RangeDom__Group__1
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
    // InternalHlcl.g:560:1: rule__RangeDom__Group__0__Impl : ( () ) ;
    public final void rule__RangeDom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:564:1: ( ( () ) )
            // InternalHlcl.g:565:1: ( () )
            {
            // InternalHlcl.g:565:1: ( () )
            // InternalHlcl.g:566:2: ()
            {
             before(grammarAccess.getRangeDomAccess().getRangeDomAction_0()); 
            // InternalHlcl.g:567:2: ()
            // InternalHlcl.g:567:3: 
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
    // InternalHlcl.g:575:1: rule__RangeDom__Group__1 : rule__RangeDom__Group__1__Impl rule__RangeDom__Group__2 ;
    public final void rule__RangeDom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:579:1: ( rule__RangeDom__Group__1__Impl rule__RangeDom__Group__2 )
            // InternalHlcl.g:580:2: rule__RangeDom__Group__1__Impl rule__RangeDom__Group__2
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
    // InternalHlcl.g:587:1: rule__RangeDom__Group__1__Impl : ( ( rule__RangeDom__StartAssignment_1 ) ) ;
    public final void rule__RangeDom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:591:1: ( ( ( rule__RangeDom__StartAssignment_1 ) ) )
            // InternalHlcl.g:592:1: ( ( rule__RangeDom__StartAssignment_1 ) )
            {
            // InternalHlcl.g:592:1: ( ( rule__RangeDom__StartAssignment_1 ) )
            // InternalHlcl.g:593:2: ( rule__RangeDom__StartAssignment_1 )
            {
             before(grammarAccess.getRangeDomAccess().getStartAssignment_1()); 
            // InternalHlcl.g:594:2: ( rule__RangeDom__StartAssignment_1 )
            // InternalHlcl.g:594:3: rule__RangeDom__StartAssignment_1
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
    // InternalHlcl.g:602:1: rule__RangeDom__Group__2 : rule__RangeDom__Group__2__Impl rule__RangeDom__Group__3 ;
    public final void rule__RangeDom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:606:1: ( rule__RangeDom__Group__2__Impl rule__RangeDom__Group__3 )
            // InternalHlcl.g:607:2: rule__RangeDom__Group__2__Impl rule__RangeDom__Group__3
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
    // InternalHlcl.g:614:1: rule__RangeDom__Group__2__Impl : ( '::' ) ;
    public final void rule__RangeDom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:618:1: ( ( '::' ) )
            // InternalHlcl.g:619:1: ( '::' )
            {
            // InternalHlcl.g:619:1: ( '::' )
            // InternalHlcl.g:620:2: '::'
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
    // InternalHlcl.g:629:1: rule__RangeDom__Group__3 : rule__RangeDom__Group__3__Impl ;
    public final void rule__RangeDom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:633:1: ( rule__RangeDom__Group__3__Impl )
            // InternalHlcl.g:634:2: rule__RangeDom__Group__3__Impl
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
    // InternalHlcl.g:640:1: rule__RangeDom__Group__3__Impl : ( ( rule__RangeDom__EndAssignment_3 ) ) ;
    public final void rule__RangeDom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:644:1: ( ( ( rule__RangeDom__EndAssignment_3 ) ) )
            // InternalHlcl.g:645:1: ( ( rule__RangeDom__EndAssignment_3 ) )
            {
            // InternalHlcl.g:645:1: ( ( rule__RangeDom__EndAssignment_3 ) )
            // InternalHlcl.g:646:2: ( rule__RangeDom__EndAssignment_3 )
            {
             before(grammarAccess.getRangeDomAccess().getEndAssignment_3()); 
            // InternalHlcl.g:647:2: ( rule__RangeDom__EndAssignment_3 )
            // InternalHlcl.g:647:3: rule__RangeDom__EndAssignment_3
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
    // InternalHlcl.g:656:1: rule__SetDom__Group__0 : rule__SetDom__Group__0__Impl rule__SetDom__Group__1 ;
    public final void rule__SetDom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:660:1: ( rule__SetDom__Group__0__Impl rule__SetDom__Group__1 )
            // InternalHlcl.g:661:2: rule__SetDom__Group__0__Impl rule__SetDom__Group__1
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
    // InternalHlcl.g:668:1: rule__SetDom__Group__0__Impl : ( () ) ;
    public final void rule__SetDom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:672:1: ( ( () ) )
            // InternalHlcl.g:673:1: ( () )
            {
            // InternalHlcl.g:673:1: ( () )
            // InternalHlcl.g:674:2: ()
            {
             before(grammarAccess.getSetDomAccess().getSetDomAction_0()); 
            // InternalHlcl.g:675:2: ()
            // InternalHlcl.g:675:3: 
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
    // InternalHlcl.g:683:1: rule__SetDom__Group__1 : rule__SetDom__Group__1__Impl rule__SetDom__Group__2 ;
    public final void rule__SetDom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:687:1: ( rule__SetDom__Group__1__Impl rule__SetDom__Group__2 )
            // InternalHlcl.g:688:2: rule__SetDom__Group__1__Impl rule__SetDom__Group__2
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
    // InternalHlcl.g:695:1: rule__SetDom__Group__1__Impl : ( '[' ) ;
    public final void rule__SetDom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:699:1: ( ( '[' ) )
            // InternalHlcl.g:700:1: ( '[' )
            {
            // InternalHlcl.g:700:1: ( '[' )
            // InternalHlcl.g:701:2: '['
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
    // InternalHlcl.g:710:1: rule__SetDom__Group__2 : rule__SetDom__Group__2__Impl rule__SetDom__Group__3 ;
    public final void rule__SetDom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:714:1: ( rule__SetDom__Group__2__Impl rule__SetDom__Group__3 )
            // InternalHlcl.g:715:2: rule__SetDom__Group__2__Impl rule__SetDom__Group__3
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
    // InternalHlcl.g:722:1: rule__SetDom__Group__2__Impl : ( ( ( rule__SetDom__ListAssignment_2 ) ) ( ( rule__SetDom__ListAssignment_2 )* ) ) ;
    public final void rule__SetDom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:726:1: ( ( ( ( rule__SetDom__ListAssignment_2 ) ) ( ( rule__SetDom__ListAssignment_2 )* ) ) )
            // InternalHlcl.g:727:1: ( ( ( rule__SetDom__ListAssignment_2 ) ) ( ( rule__SetDom__ListAssignment_2 )* ) )
            {
            // InternalHlcl.g:727:1: ( ( ( rule__SetDom__ListAssignment_2 ) ) ( ( rule__SetDom__ListAssignment_2 )* ) )
            // InternalHlcl.g:728:2: ( ( rule__SetDom__ListAssignment_2 ) ) ( ( rule__SetDom__ListAssignment_2 )* )
            {
            // InternalHlcl.g:728:2: ( ( rule__SetDom__ListAssignment_2 ) )
            // InternalHlcl.g:729:3: ( rule__SetDom__ListAssignment_2 )
            {
             before(grammarAccess.getSetDomAccess().getListAssignment_2()); 
            // InternalHlcl.g:730:3: ( rule__SetDom__ListAssignment_2 )
            // InternalHlcl.g:730:4: rule__SetDom__ListAssignment_2
            {
            pushFollow(FOLLOW_15);
            rule__SetDom__ListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetDomAccess().getListAssignment_2()); 

            }

            // InternalHlcl.g:733:2: ( ( rule__SetDom__ListAssignment_2 )* )
            // InternalHlcl.g:734:3: ( rule__SetDom__ListAssignment_2 )*
            {
             before(grammarAccess.getSetDomAccess().getListAssignment_2()); 
            // InternalHlcl.g:735:3: ( rule__SetDom__ListAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHlcl.g:735:4: rule__SetDom__ListAssignment_2
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
    // InternalHlcl.g:744:1: rule__SetDom__Group__3 : rule__SetDom__Group__3__Impl ;
    public final void rule__SetDom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:748:1: ( rule__SetDom__Group__3__Impl )
            // InternalHlcl.g:749:2: rule__SetDom__Group__3__Impl
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
    // InternalHlcl.g:755:1: rule__SetDom__Group__3__Impl : ( ']' ) ;
    public final void rule__SetDom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:759:1: ( ( ']' ) )
            // InternalHlcl.g:760:1: ( ']' )
            {
            // InternalHlcl.g:760:1: ( ']' )
            // InternalHlcl.g:761:2: ']'
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


    // $ANTLR start "rule__ConstraintProgram__VarsAssignment_1"
    // InternalHlcl.g:771:1: rule__ConstraintProgram__VarsAssignment_1 : ( ruleVariables ) ;
    public final void rule__ConstraintProgram__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:775:1: ( ( ruleVariables ) )
            // InternalHlcl.g:776:2: ( ruleVariables )
            {
            // InternalHlcl.g:776:2: ( ruleVariables )
            // InternalHlcl.g:777:3: ruleVariables
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
    // InternalHlcl.g:786:1: rule__ConstraintProgram__ConstraintsAssignment_3 : ( ruleConsExp ) ;
    public final void rule__ConstraintProgram__ConstraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:790:1: ( ( ruleConsExp ) )
            // InternalHlcl.g:791:2: ( ruleConsExp )
            {
            // InternalHlcl.g:791:2: ( ruleConsExp )
            // InternalHlcl.g:792:3: ruleConsExp
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
    // InternalHlcl.g:801:1: rule__Variables__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variables__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:805:1: ( ( RULE_ID ) )
            // InternalHlcl.g:806:2: ( RULE_ID )
            {
            // InternalHlcl.g:806:2: ( RULE_ID )
            // InternalHlcl.g:807:3: RULE_ID
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
    // InternalHlcl.g:816:1: rule__Variables__DomAssignment_3 : ( ruleDom ) ;
    public final void rule__Variables__DomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:820:1: ( ( ruleDom ) )
            // InternalHlcl.g:821:2: ( ruleDom )
            {
            // InternalHlcl.g:821:2: ( ruleDom )
            // InternalHlcl.g:822:3: ruleDom
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
    // InternalHlcl.g:831:1: rule__RangeDom__StartAssignment_1 : ( RULE_INT ) ;
    public final void rule__RangeDom__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:835:1: ( ( RULE_INT ) )
            // InternalHlcl.g:836:2: ( RULE_INT )
            {
            // InternalHlcl.g:836:2: ( RULE_INT )
            // InternalHlcl.g:837:3: RULE_INT
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
    // InternalHlcl.g:846:1: rule__RangeDom__EndAssignment_3 : ( RULE_INT ) ;
    public final void rule__RangeDom__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:850:1: ( ( RULE_INT ) )
            // InternalHlcl.g:851:2: ( RULE_INT )
            {
            // InternalHlcl.g:851:2: ( RULE_INT )
            // InternalHlcl.g:852:3: RULE_INT
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
    // InternalHlcl.g:861:1: rule__SetDom__ListAssignment_2 : ( RULE_INT ) ;
    public final void rule__SetDom__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:865:1: ( ( RULE_INT ) )
            // InternalHlcl.g:866:2: ( RULE_INT )
            {
            // InternalHlcl.g:866:2: ( RULE_INT )
            // InternalHlcl.g:867:3: RULE_INT
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
    // InternalHlcl.g:876:1: rule__BoolDom__DomAssignment : ( ( 'boolDomain' ) ) ;
    public final void rule__BoolDom__DomAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:880:1: ( ( ( 'boolDomain' ) ) )
            // InternalHlcl.g:881:2: ( ( 'boolDomain' ) )
            {
            // InternalHlcl.g:881:2: ( ( 'boolDomain' ) )
            // InternalHlcl.g:882:3: ( 'boolDomain' )
            {
             before(grammarAccess.getBoolDomAccess().getDomBoolDomainKeyword_0()); 
            // InternalHlcl.g:883:3: ( 'boolDomain' )
            // InternalHlcl.g:884:4: 'boolDomain'
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

}