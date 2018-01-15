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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Boolean expression'", "'Int expression'", "'var'", "'in'", "'..'", "'['", "']'", "','"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
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



    // $ANTLR start "entryRuleModel"
    // InternalHlcl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalHlcl.g:54:1: ( ruleModel EOF )
            // InternalHlcl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalHlcl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalHlcl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalHlcl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalHlcl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalHlcl.g:69:3: ( rule__Model__Group__0 )
            // InternalHlcl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


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
    // InternalHlcl.g:87:1: ruleVariables : ( ( rule__Variables__VarsAssignment ) ) ;
    public final void ruleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:91:2: ( ( ( rule__Variables__VarsAssignment ) ) )
            // InternalHlcl.g:92:2: ( ( rule__Variables__VarsAssignment ) )
            {
            // InternalHlcl.g:92:2: ( ( rule__Variables__VarsAssignment ) )
            // InternalHlcl.g:93:3: ( rule__Variables__VarsAssignment )
            {
             before(grammarAccess.getVariablesAccess().getVarsAssignment()); 
            // InternalHlcl.g:94:3: ( rule__Variables__VarsAssignment )
            // InternalHlcl.g:94:4: rule__Variables__VarsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variables__VarsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariablesAccess().getVarsAssignment()); 

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


    // $ANTLR start "entryRuleVariable"
    // InternalHlcl.g:103:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalHlcl.g:104:1: ( ruleVariable EOF )
            // InternalHlcl.g:105:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalHlcl.g:112:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:116:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalHlcl.g:117:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalHlcl.g:117:2: ( ( rule__Variable__Group__0 ) )
            // InternalHlcl.g:118:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalHlcl.g:119:3: ( rule__Variable__Group__0 )
            // InternalHlcl.g:119:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleDomain"
    // InternalHlcl.g:128:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalHlcl.g:129:1: ( ruleDomain EOF )
            // InternalHlcl.g:130:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalHlcl.g:137:1: ruleDomain : ( ( rule__Domain__DomAssignment ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:141:2: ( ( ( rule__Domain__DomAssignment ) ) )
            // InternalHlcl.g:142:2: ( ( rule__Domain__DomAssignment ) )
            {
            // InternalHlcl.g:142:2: ( ( rule__Domain__DomAssignment ) )
            // InternalHlcl.g:143:3: ( rule__Domain__DomAssignment )
            {
             before(grammarAccess.getDomainAccess().getDomAssignment()); 
            // InternalHlcl.g:144:3: ( rule__Domain__DomAssignment )
            // InternalHlcl.g:144:4: rule__Domain__DomAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Domain__DomAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getDomAssignment()); 

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleRangeDomain"
    // InternalHlcl.g:153:1: entryRuleRangeDomain : ruleRangeDomain EOF ;
    public final void entryRuleRangeDomain() throws RecognitionException {
        try {
            // InternalHlcl.g:154:1: ( ruleRangeDomain EOF )
            // InternalHlcl.g:155:1: ruleRangeDomain EOF
            {
             before(grammarAccess.getRangeDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleRangeDomain();

            state._fsp--;

             after(grammarAccess.getRangeDomainRule()); 
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
    // $ANTLR end "entryRuleRangeDomain"


    // $ANTLR start "ruleRangeDomain"
    // InternalHlcl.g:162:1: ruleRangeDomain : ( ( rule__RangeDomain__Group__0 ) ) ;
    public final void ruleRangeDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:166:2: ( ( ( rule__RangeDomain__Group__0 ) ) )
            // InternalHlcl.g:167:2: ( ( rule__RangeDomain__Group__0 ) )
            {
            // InternalHlcl.g:167:2: ( ( rule__RangeDomain__Group__0 ) )
            // InternalHlcl.g:168:3: ( rule__RangeDomain__Group__0 )
            {
             before(grammarAccess.getRangeDomainAccess().getGroup()); 
            // InternalHlcl.g:169:3: ( rule__RangeDomain__Group__0 )
            // InternalHlcl.g:169:4: rule__RangeDomain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RangeDomain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeDomainAccess().getGroup()); 

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
    // $ANTLR end "ruleRangeDomain"


    // $ANTLR start "entryRuleSetDomain"
    // InternalHlcl.g:178:1: entryRuleSetDomain : ruleSetDomain EOF ;
    public final void entryRuleSetDomain() throws RecognitionException {
        try {
            // InternalHlcl.g:179:1: ( ruleSetDomain EOF )
            // InternalHlcl.g:180:1: ruleSetDomain EOF
            {
             before(grammarAccess.getSetDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleSetDomain();

            state._fsp--;

             after(grammarAccess.getSetDomainRule()); 
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
    // $ANTLR end "entryRuleSetDomain"


    // $ANTLR start "ruleSetDomain"
    // InternalHlcl.g:187:1: ruleSetDomain : ( ( rule__SetDomain__Group__0 ) ) ;
    public final void ruleSetDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:191:2: ( ( ( rule__SetDomain__Group__0 ) ) )
            // InternalHlcl.g:192:2: ( ( rule__SetDomain__Group__0 ) )
            {
            // InternalHlcl.g:192:2: ( ( rule__SetDomain__Group__0 ) )
            // InternalHlcl.g:193:3: ( rule__SetDomain__Group__0 )
            {
             before(grammarAccess.getSetDomainAccess().getGroup()); 
            // InternalHlcl.g:194:3: ( rule__SetDomain__Group__0 )
            // InternalHlcl.g:194:4: rule__SetDomain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetDomain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetDomainAccess().getGroup()); 

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
    // $ANTLR end "ruleSetDomain"


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


    // $ANTLR start "rule__Domain__DomAlternatives_0"
    // InternalHlcl.g:277:1: rule__Domain__DomAlternatives_0 : ( ( ruleRangeDomain ) | ( ruleSetDomain ) );
    public final void rule__Domain__DomAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:281:1: ( ( ruleRangeDomain ) | ( ruleSetDomain ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalHlcl.g:282:2: ( ruleRangeDomain )
                    {
                    // InternalHlcl.g:282:2: ( ruleRangeDomain )
                    // InternalHlcl.g:283:3: ruleRangeDomain
                    {
                     before(grammarAccess.getDomainAccess().getDomRangeDomainParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRangeDomain();

                    state._fsp--;

                     after(grammarAccess.getDomainAccess().getDomRangeDomainParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHlcl.g:288:2: ( ruleSetDomain )
                    {
                    // InternalHlcl.g:288:2: ( ruleSetDomain )
                    // InternalHlcl.g:289:3: ruleSetDomain
                    {
                     before(grammarAccess.getDomainAccess().getDomSetDomainParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSetDomain();

                    state._fsp--;

                     after(grammarAccess.getDomainAccess().getDomSetDomainParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Domain__DomAlternatives_0"


    // $ANTLR start "rule__ConsExp__Alternatives"
    // InternalHlcl.g:298:1: rule__ConsExp__Alternatives : ( ( ruleBooleanExp ) | ( ruleIntExp ) );
    public final void rule__ConsExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:302:1: ( ( ruleBooleanExp ) | ( ruleIntExp ) )
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
                    // InternalHlcl.g:303:2: ( ruleBooleanExp )
                    {
                    // InternalHlcl.g:303:2: ( ruleBooleanExp )
                    // InternalHlcl.g:304:3: ruleBooleanExp
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
                    // InternalHlcl.g:309:2: ( ruleIntExp )
                    {
                    // InternalHlcl.g:309:2: ( ruleIntExp )
                    // InternalHlcl.g:310:3: ruleIntExp
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalHlcl.g:319:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:323:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalHlcl.g:324:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalHlcl.g:331:1: rule__Model__Group__0__Impl : ( ( ( rule__Model__VarsAssignment_0 ) ) ( ( rule__Model__VarsAssignment_0 )* ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:335:1: ( ( ( ( rule__Model__VarsAssignment_0 ) ) ( ( rule__Model__VarsAssignment_0 )* ) ) )
            // InternalHlcl.g:336:1: ( ( ( rule__Model__VarsAssignment_0 ) ) ( ( rule__Model__VarsAssignment_0 )* ) )
            {
            // InternalHlcl.g:336:1: ( ( ( rule__Model__VarsAssignment_0 ) ) ( ( rule__Model__VarsAssignment_0 )* ) )
            // InternalHlcl.g:337:2: ( ( rule__Model__VarsAssignment_0 ) ) ( ( rule__Model__VarsAssignment_0 )* )
            {
            // InternalHlcl.g:337:2: ( ( rule__Model__VarsAssignment_0 ) )
            // InternalHlcl.g:338:3: ( rule__Model__VarsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_0()); 
            // InternalHlcl.g:339:3: ( rule__Model__VarsAssignment_0 )
            // InternalHlcl.g:339:4: rule__Model__VarsAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__Model__VarsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getVarsAssignment_0()); 

            }

            // InternalHlcl.g:342:2: ( ( rule__Model__VarsAssignment_0 )* )
            // InternalHlcl.g:343:3: ( rule__Model__VarsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_0()); 
            // InternalHlcl.g:344:3: ( rule__Model__VarsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalHlcl.g:344:4: rule__Model__VarsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__VarsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVarsAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalHlcl.g:353:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:357:1: ( rule__Model__Group__1__Impl )
            // InternalHlcl.g:358:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalHlcl.g:364:1: rule__Model__Group__1__Impl : ( ( ( rule__Model__ConstraintsAssignment_1 ) ) ( ( rule__Model__ConstraintsAssignment_1 )* ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:368:1: ( ( ( ( rule__Model__ConstraintsAssignment_1 ) ) ( ( rule__Model__ConstraintsAssignment_1 )* ) ) )
            // InternalHlcl.g:369:1: ( ( ( rule__Model__ConstraintsAssignment_1 ) ) ( ( rule__Model__ConstraintsAssignment_1 )* ) )
            {
            // InternalHlcl.g:369:1: ( ( ( rule__Model__ConstraintsAssignment_1 ) ) ( ( rule__Model__ConstraintsAssignment_1 )* ) )
            // InternalHlcl.g:370:2: ( ( rule__Model__ConstraintsAssignment_1 ) ) ( ( rule__Model__ConstraintsAssignment_1 )* )
            {
            // InternalHlcl.g:370:2: ( ( rule__Model__ConstraintsAssignment_1 ) )
            // InternalHlcl.g:371:3: ( rule__Model__ConstraintsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_1()); 
            // InternalHlcl.g:372:3: ( rule__Model__ConstraintsAssignment_1 )
            // InternalHlcl.g:372:4: rule__Model__ConstraintsAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__Model__ConstraintsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConstraintsAssignment_1()); 

            }

            // InternalHlcl.g:375:2: ( ( rule__Model__ConstraintsAssignment_1 )* )
            // InternalHlcl.g:376:3: ( rule__Model__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getConstraintsAssignment_1()); 
            // InternalHlcl.g:377:3: ( rule__Model__ConstraintsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHlcl.g:377:4: rule__Model__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getConstraintsAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalHlcl.g:387:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:391:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalHlcl.g:392:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalHlcl.g:399:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:403:1: ( ( 'var' ) )
            // InternalHlcl.g:404:1: ( 'var' )
            {
            // InternalHlcl.g:404:1: ( 'var' )
            // InternalHlcl.g:405:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalHlcl.g:414:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:418:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalHlcl.g:419:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalHlcl.g:426:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:430:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalHlcl.g:431:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalHlcl.g:431:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalHlcl.g:432:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalHlcl.g:433:2: ( rule__Variable__NameAssignment_1 )
            // InternalHlcl.g:433:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalHlcl.g:441:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:445:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalHlcl.g:446:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

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
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalHlcl.g:453:1: rule__Variable__Group__2__Impl : ( 'in' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:457:1: ( ( 'in' ) )
            // InternalHlcl.g:458:1: ( 'in' )
            {
            // InternalHlcl.g:458:1: ( 'in' )
            // InternalHlcl.g:459:2: 'in'
            {
             before(grammarAccess.getVariableAccess().getInKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getInKeyword_2()); 

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
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalHlcl.g:468:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:472:1: ( rule__Variable__Group__3__Impl )
            // InternalHlcl.g:473:2: rule__Variable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__3__Impl();

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
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalHlcl.g:479:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__DomAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:483:1: ( ( ( rule__Variable__DomAssignment_3 ) ) )
            // InternalHlcl.g:484:1: ( ( rule__Variable__DomAssignment_3 ) )
            {
            // InternalHlcl.g:484:1: ( ( rule__Variable__DomAssignment_3 ) )
            // InternalHlcl.g:485:2: ( rule__Variable__DomAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getDomAssignment_3()); 
            // InternalHlcl.g:486:2: ( rule__Variable__DomAssignment_3 )
            // InternalHlcl.g:486:3: rule__Variable__DomAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__DomAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getDomAssignment_3()); 

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
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__RangeDomain__Group__0"
    // InternalHlcl.g:495:1: rule__RangeDomain__Group__0 : rule__RangeDomain__Group__0__Impl rule__RangeDomain__Group__1 ;
    public final void rule__RangeDomain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:499:1: ( rule__RangeDomain__Group__0__Impl rule__RangeDomain__Group__1 )
            // InternalHlcl.g:500:2: rule__RangeDomain__Group__0__Impl rule__RangeDomain__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RangeDomain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeDomain__Group__1();

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
    // $ANTLR end "rule__RangeDomain__Group__0"


    // $ANTLR start "rule__RangeDomain__Group__0__Impl"
    // InternalHlcl.g:507:1: rule__RangeDomain__Group__0__Impl : ( ( rule__RangeDomain__StartAssignment_0 ) ) ;
    public final void rule__RangeDomain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:511:1: ( ( ( rule__RangeDomain__StartAssignment_0 ) ) )
            // InternalHlcl.g:512:1: ( ( rule__RangeDomain__StartAssignment_0 ) )
            {
            // InternalHlcl.g:512:1: ( ( rule__RangeDomain__StartAssignment_0 ) )
            // InternalHlcl.g:513:2: ( rule__RangeDomain__StartAssignment_0 )
            {
             before(grammarAccess.getRangeDomainAccess().getStartAssignment_0()); 
            // InternalHlcl.g:514:2: ( rule__RangeDomain__StartAssignment_0 )
            // InternalHlcl.g:514:3: rule__RangeDomain__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RangeDomain__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRangeDomainAccess().getStartAssignment_0()); 

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
    // $ANTLR end "rule__RangeDomain__Group__0__Impl"


    // $ANTLR start "rule__RangeDomain__Group__1"
    // InternalHlcl.g:522:1: rule__RangeDomain__Group__1 : rule__RangeDomain__Group__1__Impl rule__RangeDomain__Group__2 ;
    public final void rule__RangeDomain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:526:1: ( rule__RangeDomain__Group__1__Impl rule__RangeDomain__Group__2 )
            // InternalHlcl.g:527:2: rule__RangeDomain__Group__1__Impl rule__RangeDomain__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__RangeDomain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeDomain__Group__2();

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
    // $ANTLR end "rule__RangeDomain__Group__1"


    // $ANTLR start "rule__RangeDomain__Group__1__Impl"
    // InternalHlcl.g:534:1: rule__RangeDomain__Group__1__Impl : ( '..' ) ;
    public final void rule__RangeDomain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:538:1: ( ( '..' ) )
            // InternalHlcl.g:539:1: ( '..' )
            {
            // InternalHlcl.g:539:1: ( '..' )
            // InternalHlcl.g:540:2: '..'
            {
             before(grammarAccess.getRangeDomainAccess().getFullStopFullStopKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRangeDomainAccess().getFullStopFullStopKeyword_1()); 

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
    // $ANTLR end "rule__RangeDomain__Group__1__Impl"


    // $ANTLR start "rule__RangeDomain__Group__2"
    // InternalHlcl.g:549:1: rule__RangeDomain__Group__2 : rule__RangeDomain__Group__2__Impl ;
    public final void rule__RangeDomain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:553:1: ( rule__RangeDomain__Group__2__Impl )
            // InternalHlcl.g:554:2: rule__RangeDomain__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeDomain__Group__2__Impl();

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
    // $ANTLR end "rule__RangeDomain__Group__2"


    // $ANTLR start "rule__RangeDomain__Group__2__Impl"
    // InternalHlcl.g:560:1: rule__RangeDomain__Group__2__Impl : ( ( rule__RangeDomain__EndAssignment_2 ) ) ;
    public final void rule__RangeDomain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:564:1: ( ( ( rule__RangeDomain__EndAssignment_2 ) ) )
            // InternalHlcl.g:565:1: ( ( rule__RangeDomain__EndAssignment_2 ) )
            {
            // InternalHlcl.g:565:1: ( ( rule__RangeDomain__EndAssignment_2 ) )
            // InternalHlcl.g:566:2: ( rule__RangeDomain__EndAssignment_2 )
            {
             before(grammarAccess.getRangeDomainAccess().getEndAssignment_2()); 
            // InternalHlcl.g:567:2: ( rule__RangeDomain__EndAssignment_2 )
            // InternalHlcl.g:567:3: rule__RangeDomain__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RangeDomain__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRangeDomainAccess().getEndAssignment_2()); 

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
    // $ANTLR end "rule__RangeDomain__Group__2__Impl"


    // $ANTLR start "rule__SetDomain__Group__0"
    // InternalHlcl.g:576:1: rule__SetDomain__Group__0 : rule__SetDomain__Group__0__Impl rule__SetDomain__Group__1 ;
    public final void rule__SetDomain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:580:1: ( rule__SetDomain__Group__0__Impl rule__SetDomain__Group__1 )
            // InternalHlcl.g:581:2: rule__SetDomain__Group__0__Impl rule__SetDomain__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SetDomain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetDomain__Group__1();

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
    // $ANTLR end "rule__SetDomain__Group__0"


    // $ANTLR start "rule__SetDomain__Group__0__Impl"
    // InternalHlcl.g:588:1: rule__SetDomain__Group__0__Impl : ( '[' ) ;
    public final void rule__SetDomain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:592:1: ( ( '[' ) )
            // InternalHlcl.g:593:1: ( '[' )
            {
            // InternalHlcl.g:593:1: ( '[' )
            // InternalHlcl.g:594:2: '['
            {
             before(grammarAccess.getSetDomainAccess().getLeftSquareBracketKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSetDomainAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__SetDomain__Group__0__Impl"


    // $ANTLR start "rule__SetDomain__Group__1"
    // InternalHlcl.g:603:1: rule__SetDomain__Group__1 : rule__SetDomain__Group__1__Impl rule__SetDomain__Group__2 ;
    public final void rule__SetDomain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:607:1: ( rule__SetDomain__Group__1__Impl rule__SetDomain__Group__2 )
            // InternalHlcl.g:608:2: rule__SetDomain__Group__1__Impl rule__SetDomain__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__SetDomain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetDomain__Group__2();

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
    // $ANTLR end "rule__SetDomain__Group__1"


    // $ANTLR start "rule__SetDomain__Group__1__Impl"
    // InternalHlcl.g:615:1: rule__SetDomain__Group__1__Impl : ( ( rule__SetDomain__Group_1__0 ) ) ;
    public final void rule__SetDomain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:619:1: ( ( ( rule__SetDomain__Group_1__0 ) ) )
            // InternalHlcl.g:620:1: ( ( rule__SetDomain__Group_1__0 ) )
            {
            // InternalHlcl.g:620:1: ( ( rule__SetDomain__Group_1__0 ) )
            // InternalHlcl.g:621:2: ( rule__SetDomain__Group_1__0 )
            {
             before(grammarAccess.getSetDomainAccess().getGroup_1()); 
            // InternalHlcl.g:622:2: ( rule__SetDomain__Group_1__0 )
            // InternalHlcl.g:622:3: rule__SetDomain__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__SetDomain__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSetDomainAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SetDomain__Group__1__Impl"


    // $ANTLR start "rule__SetDomain__Group__2"
    // InternalHlcl.g:630:1: rule__SetDomain__Group__2 : rule__SetDomain__Group__2__Impl ;
    public final void rule__SetDomain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:634:1: ( rule__SetDomain__Group__2__Impl )
            // InternalHlcl.g:635:2: rule__SetDomain__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetDomain__Group__2__Impl();

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
    // $ANTLR end "rule__SetDomain__Group__2"


    // $ANTLR start "rule__SetDomain__Group__2__Impl"
    // InternalHlcl.g:641:1: rule__SetDomain__Group__2__Impl : ( ']' ) ;
    public final void rule__SetDomain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:645:1: ( ( ']' ) )
            // InternalHlcl.g:646:1: ( ']' )
            {
            // InternalHlcl.g:646:1: ( ']' )
            // InternalHlcl.g:647:2: ']'
            {
             before(grammarAccess.getSetDomainAccess().getRightSquareBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSetDomainAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__SetDomain__Group__2__Impl"


    // $ANTLR start "rule__SetDomain__Group_1__0"
    // InternalHlcl.g:657:1: rule__SetDomain__Group_1__0 : rule__SetDomain__Group_1__0__Impl rule__SetDomain__Group_1__1 ;
    public final void rule__SetDomain__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:661:1: ( rule__SetDomain__Group_1__0__Impl rule__SetDomain__Group_1__1 )
            // InternalHlcl.g:662:2: rule__SetDomain__Group_1__0__Impl rule__SetDomain__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__SetDomain__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetDomain__Group_1__1();

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
    // $ANTLR end "rule__SetDomain__Group_1__0"


    // $ANTLR start "rule__SetDomain__Group_1__0__Impl"
    // InternalHlcl.g:669:1: rule__SetDomain__Group_1__0__Impl : ( ( rule__SetDomain__ListAssignment_1_0 ) ) ;
    public final void rule__SetDomain__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:673:1: ( ( ( rule__SetDomain__ListAssignment_1_0 ) ) )
            // InternalHlcl.g:674:1: ( ( rule__SetDomain__ListAssignment_1_0 ) )
            {
            // InternalHlcl.g:674:1: ( ( rule__SetDomain__ListAssignment_1_0 ) )
            // InternalHlcl.g:675:2: ( rule__SetDomain__ListAssignment_1_0 )
            {
             before(grammarAccess.getSetDomainAccess().getListAssignment_1_0()); 
            // InternalHlcl.g:676:2: ( rule__SetDomain__ListAssignment_1_0 )
            // InternalHlcl.g:676:3: rule__SetDomain__ListAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SetDomain__ListAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSetDomainAccess().getListAssignment_1_0()); 

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
    // $ANTLR end "rule__SetDomain__Group_1__0__Impl"


    // $ANTLR start "rule__SetDomain__Group_1__1"
    // InternalHlcl.g:684:1: rule__SetDomain__Group_1__1 : rule__SetDomain__Group_1__1__Impl ;
    public final void rule__SetDomain__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:688:1: ( rule__SetDomain__Group_1__1__Impl )
            // InternalHlcl.g:689:2: rule__SetDomain__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetDomain__Group_1__1__Impl();

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
    // $ANTLR end "rule__SetDomain__Group_1__1"


    // $ANTLR start "rule__SetDomain__Group_1__1__Impl"
    // InternalHlcl.g:695:1: rule__SetDomain__Group_1__1__Impl : ( ( ( rule__SetDomain__Group_1_1__0 ) ) ( ( rule__SetDomain__Group_1_1__0 )* ) ) ;
    public final void rule__SetDomain__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:699:1: ( ( ( ( rule__SetDomain__Group_1_1__0 ) ) ( ( rule__SetDomain__Group_1_1__0 )* ) ) )
            // InternalHlcl.g:700:1: ( ( ( rule__SetDomain__Group_1_1__0 ) ) ( ( rule__SetDomain__Group_1_1__0 )* ) )
            {
            // InternalHlcl.g:700:1: ( ( ( rule__SetDomain__Group_1_1__0 ) ) ( ( rule__SetDomain__Group_1_1__0 )* ) )
            // InternalHlcl.g:701:2: ( ( rule__SetDomain__Group_1_1__0 ) ) ( ( rule__SetDomain__Group_1_1__0 )* )
            {
            // InternalHlcl.g:701:2: ( ( rule__SetDomain__Group_1_1__0 ) )
            // InternalHlcl.g:702:3: ( rule__SetDomain__Group_1_1__0 )
            {
             before(grammarAccess.getSetDomainAccess().getGroup_1_1()); 
            // InternalHlcl.g:703:3: ( rule__SetDomain__Group_1_1__0 )
            // InternalHlcl.g:703:4: rule__SetDomain__Group_1_1__0
            {
            pushFollow(FOLLOW_13);
            rule__SetDomain__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSetDomainAccess().getGroup_1_1()); 

            }

            // InternalHlcl.g:706:2: ( ( rule__SetDomain__Group_1_1__0 )* )
            // InternalHlcl.g:707:3: ( rule__SetDomain__Group_1_1__0 )*
            {
             before(grammarAccess.getSetDomainAccess().getGroup_1_1()); 
            // InternalHlcl.g:708:3: ( rule__SetDomain__Group_1_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHlcl.g:708:4: rule__SetDomain__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SetDomain__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSetDomainAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__SetDomain__Group_1__1__Impl"


    // $ANTLR start "rule__SetDomain__Group_1_1__0"
    // InternalHlcl.g:718:1: rule__SetDomain__Group_1_1__0 : rule__SetDomain__Group_1_1__0__Impl rule__SetDomain__Group_1_1__1 ;
    public final void rule__SetDomain__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:722:1: ( rule__SetDomain__Group_1_1__0__Impl rule__SetDomain__Group_1_1__1 )
            // InternalHlcl.g:723:2: rule__SetDomain__Group_1_1__0__Impl rule__SetDomain__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__SetDomain__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetDomain__Group_1_1__1();

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
    // $ANTLR end "rule__SetDomain__Group_1_1__0"


    // $ANTLR start "rule__SetDomain__Group_1_1__0__Impl"
    // InternalHlcl.g:730:1: rule__SetDomain__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__SetDomain__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:734:1: ( ( ',' ) )
            // InternalHlcl.g:735:1: ( ',' )
            {
            // InternalHlcl.g:735:1: ( ',' )
            // InternalHlcl.g:736:2: ','
            {
             before(grammarAccess.getSetDomainAccess().getCommaKeyword_1_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSetDomainAccess().getCommaKeyword_1_1_0()); 

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
    // $ANTLR end "rule__SetDomain__Group_1_1__0__Impl"


    // $ANTLR start "rule__SetDomain__Group_1_1__1"
    // InternalHlcl.g:745:1: rule__SetDomain__Group_1_1__1 : rule__SetDomain__Group_1_1__1__Impl ;
    public final void rule__SetDomain__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:749:1: ( rule__SetDomain__Group_1_1__1__Impl )
            // InternalHlcl.g:750:2: rule__SetDomain__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetDomain__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__SetDomain__Group_1_1__1"


    // $ANTLR start "rule__SetDomain__Group_1_1__1__Impl"
    // InternalHlcl.g:756:1: rule__SetDomain__Group_1_1__1__Impl : ( RULE_INT ) ;
    public final void rule__SetDomain__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:760:1: ( ( RULE_INT ) )
            // InternalHlcl.g:761:1: ( RULE_INT )
            {
            // InternalHlcl.g:761:1: ( RULE_INT )
            // InternalHlcl.g:762:2: RULE_INT
            {
             before(grammarAccess.getSetDomainAccess().getINTTerminalRuleCall_1_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSetDomainAccess().getINTTerminalRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__SetDomain__Group_1_1__1__Impl"


    // $ANTLR start "rule__Model__VarsAssignment_0"
    // InternalHlcl.g:772:1: rule__Model__VarsAssignment_0 : ( ruleVariables ) ;
    public final void rule__Model__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:776:1: ( ( ruleVariables ) )
            // InternalHlcl.g:777:2: ( ruleVariables )
            {
            // InternalHlcl.g:777:2: ( ruleVariables )
            // InternalHlcl.g:778:3: ruleVariables
            {
             before(grammarAccess.getModelAccess().getVarsVariablesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariables();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVarsVariablesParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__VarsAssignment_0"


    // $ANTLR start "rule__Model__ConstraintsAssignment_1"
    // InternalHlcl.g:787:1: rule__Model__ConstraintsAssignment_1 : ( ruleConsExp ) ;
    public final void rule__Model__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:791:1: ( ( ruleConsExp ) )
            // InternalHlcl.g:792:2: ( ruleConsExp )
            {
            // InternalHlcl.g:792:2: ( ruleConsExp )
            // InternalHlcl.g:793:3: ruleConsExp
            {
             before(grammarAccess.getModelAccess().getConstraintsConsExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConsExp();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConstraintsConsExpParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__ConstraintsAssignment_1"


    // $ANTLR start "rule__Variables__VarsAssignment"
    // InternalHlcl.g:802:1: rule__Variables__VarsAssignment : ( ruleVariable ) ;
    public final void rule__Variables__VarsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:806:1: ( ( ruleVariable ) )
            // InternalHlcl.g:807:2: ( ruleVariable )
            {
            // InternalHlcl.g:807:2: ( ruleVariable )
            // InternalHlcl.g:808:3: ruleVariable
            {
             before(grammarAccess.getVariablesAccess().getVarsVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().getVarsVariableParserRuleCall_0()); 

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
    // $ANTLR end "rule__Variables__VarsAssignment"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalHlcl.g:817:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:821:1: ( ( RULE_ID ) )
            // InternalHlcl.g:822:2: ( RULE_ID )
            {
            // InternalHlcl.g:822:2: ( RULE_ID )
            // InternalHlcl.g:823:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Variable__DomAssignment_3"
    // InternalHlcl.g:832:1: rule__Variable__DomAssignment_3 : ( ruleDomain ) ;
    public final void rule__Variable__DomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:836:1: ( ( ruleDomain ) )
            // InternalHlcl.g:837:2: ( ruleDomain )
            {
            // InternalHlcl.g:837:2: ( ruleDomain )
            // InternalHlcl.g:838:3: ruleDomain
            {
             before(grammarAccess.getVariableAccess().getDomDomainParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getDomDomainParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Variable__DomAssignment_3"


    // $ANTLR start "rule__Domain__DomAssignment"
    // InternalHlcl.g:847:1: rule__Domain__DomAssignment : ( ( rule__Domain__DomAlternatives_0 ) ) ;
    public final void rule__Domain__DomAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:851:1: ( ( ( rule__Domain__DomAlternatives_0 ) ) )
            // InternalHlcl.g:852:2: ( ( rule__Domain__DomAlternatives_0 ) )
            {
            // InternalHlcl.g:852:2: ( ( rule__Domain__DomAlternatives_0 ) )
            // InternalHlcl.g:853:3: ( rule__Domain__DomAlternatives_0 )
            {
             before(grammarAccess.getDomainAccess().getDomAlternatives_0()); 
            // InternalHlcl.g:854:3: ( rule__Domain__DomAlternatives_0 )
            // InternalHlcl.g:854:4: rule__Domain__DomAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Domain__DomAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getDomAlternatives_0()); 

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
    // $ANTLR end "rule__Domain__DomAssignment"


    // $ANTLR start "rule__RangeDomain__StartAssignment_0"
    // InternalHlcl.g:862:1: rule__RangeDomain__StartAssignment_0 : ( RULE_INT ) ;
    public final void rule__RangeDomain__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:866:1: ( ( RULE_INT ) )
            // InternalHlcl.g:867:2: ( RULE_INT )
            {
            // InternalHlcl.g:867:2: ( RULE_INT )
            // InternalHlcl.g:868:3: RULE_INT
            {
             before(grammarAccess.getRangeDomainAccess().getStartINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeDomainAccess().getStartINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__RangeDomain__StartAssignment_0"


    // $ANTLR start "rule__RangeDomain__EndAssignment_2"
    // InternalHlcl.g:877:1: rule__RangeDomain__EndAssignment_2 : ( RULE_INT ) ;
    public final void rule__RangeDomain__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:881:1: ( ( RULE_INT ) )
            // InternalHlcl.g:882:2: ( RULE_INT )
            {
            // InternalHlcl.g:882:2: ( RULE_INT )
            // InternalHlcl.g:883:3: RULE_INT
            {
             before(grammarAccess.getRangeDomainAccess().getEndINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeDomainAccess().getEndINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RangeDomain__EndAssignment_2"


    // $ANTLR start "rule__SetDomain__ListAssignment_1_0"
    // InternalHlcl.g:892:1: rule__SetDomain__ListAssignment_1_0 : ( RULE_INT ) ;
    public final void rule__SetDomain__ListAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHlcl.g:896:1: ( ( RULE_INT ) )
            // InternalHlcl.g:897:2: ( RULE_INT )
            {
            // InternalHlcl.g:897:2: ( RULE_INT )
            // InternalHlcl.g:898:3: RULE_INT
            {
             before(grammarAccess.getSetDomainAccess().getListINTTerminalRuleCall_1_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSetDomainAccess().getListINTTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__SetDomain__ListAssignment_1_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});

}