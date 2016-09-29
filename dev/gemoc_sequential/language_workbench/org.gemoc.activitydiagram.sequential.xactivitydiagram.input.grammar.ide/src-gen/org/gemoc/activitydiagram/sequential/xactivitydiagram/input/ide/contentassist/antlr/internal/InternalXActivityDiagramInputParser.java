package org.gemoc.activitydiagram.sequential.xactivitydiagram.input.ide.contentassist.antlr.internal;

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
import org.gemoc.activitydiagram.sequential.xactivitydiagram.input.services.XActivityDiagramInputGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXActivityDiagramInputParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "','", "'='", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalXActivityDiagramInputParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXActivityDiagramInputParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXActivityDiagramInputParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXActivityDiagramInput.g"; }


    	private XActivityDiagramInputGrammarAccess grammarAccess;

    	public void setGrammarAccess(XActivityDiagramInputGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleInput"
    // InternalXActivityDiagramInput.g:53:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalXActivityDiagramInput.g:54:1: ( ruleInput EOF )
            // InternalXActivityDiagramInput.g:55:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalXActivityDiagramInput.g:62:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:66:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalXActivityDiagramInput.g:67:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalXActivityDiagramInput.g:67:2: ( ( rule__Input__Group__0 ) )
            // InternalXActivityDiagramInput.g:68:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalXActivityDiagramInput.g:69:3: ( rule__Input__Group__0 )
            // InternalXActivityDiagramInput.g:69:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleInputValue"
    // InternalXActivityDiagramInput.g:78:1: entryRuleInputValue : ruleInputValue EOF ;
    public final void entryRuleInputValue() throws RecognitionException {
        try {
            // InternalXActivityDiagramInput.g:79:1: ( ruleInputValue EOF )
            // InternalXActivityDiagramInput.g:80:1: ruleInputValue EOF
            {
             before(grammarAccess.getInputValueRule()); 
            pushFollow(FOLLOW_1);
            ruleInputValue();

            state._fsp--;

             after(grammarAccess.getInputValueRule()); 
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
    // $ANTLR end "entryRuleInputValue"


    // $ANTLR start "ruleInputValue"
    // InternalXActivityDiagramInput.g:87:1: ruleInputValue : ( ( rule__InputValue__Group__0 ) ) ;
    public final void ruleInputValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:91:2: ( ( ( rule__InputValue__Group__0 ) ) )
            // InternalXActivityDiagramInput.g:92:2: ( ( rule__InputValue__Group__0 ) )
            {
            // InternalXActivityDiagramInput.g:92:2: ( ( rule__InputValue__Group__0 ) )
            // InternalXActivityDiagramInput.g:93:3: ( rule__InputValue__Group__0 )
            {
             before(grammarAccess.getInputValueAccess().getGroup()); 
            // InternalXActivityDiagramInput.g:94:3: ( rule__InputValue__Group__0 )
            // InternalXActivityDiagramInput.g:94:4: rule__InputValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputValueAccess().getGroup()); 

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
    // $ANTLR end "ruleInputValue"


    // $ANTLR start "entryRuleValue"
    // InternalXActivityDiagramInput.g:103:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalXActivityDiagramInput.g:104:1: ( ruleValue EOF )
            // InternalXActivityDiagramInput.g:105:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalXActivityDiagramInput.g:112:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:116:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalXActivityDiagramInput.g:117:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalXActivityDiagramInput.g:117:2: ( ( rule__Value__Alternatives ) )
            // InternalXActivityDiagramInput.g:118:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalXActivityDiagramInput.g:119:3: ( rule__Value__Alternatives )
            // InternalXActivityDiagramInput.g:119:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalXActivityDiagramInput.g:128:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalXActivityDiagramInput.g:129:1: ( ruleBooleanValue EOF )
            // InternalXActivityDiagramInput.g:130:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalXActivityDiagramInput.g:137:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:141:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalXActivityDiagramInput.g:142:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalXActivityDiagramInput.g:142:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalXActivityDiagramInput.g:143:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalXActivityDiagramInput.g:144:3: ( rule__BooleanValue__ValueAssignment )
            // InternalXActivityDiagramInput.g:144:4: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalXActivityDiagramInput.g:153:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalXActivityDiagramInput.g:154:1: ( ruleIntegerValue EOF )
            // InternalXActivityDiagramInput.g:155:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
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
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalXActivityDiagramInput.g:162:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:166:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // InternalXActivityDiagramInput.g:167:2: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // InternalXActivityDiagramInput.g:167:2: ( ( rule__IntegerValue__ValueAssignment ) )
            // InternalXActivityDiagramInput.g:168:3: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // InternalXActivityDiagramInput.g:169:3: ( rule__IntegerValue__ValueAssignment )
            // InternalXActivityDiagramInput.g:169:4: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleEBoolean"
    // InternalXActivityDiagramInput.g:178:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalXActivityDiagramInput.g:179:1: ( ruleEBoolean EOF )
            // InternalXActivityDiagramInput.g:180:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalXActivityDiagramInput.g:187:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:191:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalXActivityDiagramInput.g:192:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalXActivityDiagramInput.g:192:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalXActivityDiagramInput.g:193:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalXActivityDiagramInput.g:194:3: ( rule__EBoolean__Alternatives )
            // InternalXActivityDiagramInput.g:194:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalXActivityDiagramInput.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalXActivityDiagramInput.g:204:1: ( ruleEInt EOF )
            // InternalXActivityDiagramInput.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalXActivityDiagramInput.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalXActivityDiagramInput.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalXActivityDiagramInput.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalXActivityDiagramInput.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalXActivityDiagramInput.g:219:3: ( rule__EInt__Group__0 )
            // InternalXActivityDiagramInput.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalXActivityDiagramInput.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalXActivityDiagramInput.g:229:1: ( ruleEString EOF )
            // InternalXActivityDiagramInput.g:230:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalXActivityDiagramInput.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalXActivityDiagramInput.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalXActivityDiagramInput.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalXActivityDiagramInput.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalXActivityDiagramInput.g:244:3: ( rule__EString__Alternatives )
            // InternalXActivityDiagramInput.g:244:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalXActivityDiagramInput.g:252:1: rule__Value__Alternatives : ( ( ruleBooleanValue ) | ( ruleIntegerValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:256:1: ( ( ruleBooleanValue ) | ( ruleIntegerValue ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_INT||LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalXActivityDiagramInput.g:257:2: ( ruleBooleanValue )
                    {
                    // InternalXActivityDiagramInput.g:257:2: ( ruleBooleanValue )
                    // InternalXActivityDiagramInput.g:258:3: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXActivityDiagramInput.g:263:2: ( ruleIntegerValue )
                    {
                    // InternalXActivityDiagramInput.g:263:2: ( ruleIntegerValue )
                    // InternalXActivityDiagramInput.g:264:3: ruleIntegerValue
                    {
                     before(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalXActivityDiagramInput.g:273:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:277:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalXActivityDiagramInput.g:278:2: ( 'true' )
                    {
                    // InternalXActivityDiagramInput.g:278:2: ( 'true' )
                    // InternalXActivityDiagramInput.g:279:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXActivityDiagramInput.g:284:2: ( 'false' )
                    {
                    // InternalXActivityDiagramInput.g:284:2: ( 'false' )
                    // InternalXActivityDiagramInput.g:285:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalXActivityDiagramInput.g:294:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:298:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXActivityDiagramInput.g:299:2: ( RULE_STRING )
                    {
                    // InternalXActivityDiagramInput.g:299:2: ( RULE_STRING )
                    // InternalXActivityDiagramInput.g:300:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXActivityDiagramInput.g:305:2: ( RULE_ID )
                    {
                    // InternalXActivityDiagramInput.g:305:2: ( RULE_ID )
                    // InternalXActivityDiagramInput.g:306:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Input__Group__0"
    // InternalXActivityDiagramInput.g:315:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:319:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalXActivityDiagramInput.g:320:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

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
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalXActivityDiagramInput.g:327:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:331:1: ( ( () ) )
            // InternalXActivityDiagramInput.g:332:1: ( () )
            {
            // InternalXActivityDiagramInput.g:332:1: ( () )
            // InternalXActivityDiagramInput.g:333:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalXActivityDiagramInput.g:334:2: ()
            // InternalXActivityDiagramInput.g:334:3: 
            {
            }

             after(grammarAccess.getInputAccess().getInputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalXActivityDiagramInput.g:342:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:346:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalXActivityDiagramInput.g:347:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

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
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalXActivityDiagramInput.g:354:1: rule__Input__Group__1__Impl : ( ( rule__Input__InputValuesAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:358:1: ( ( ( rule__Input__InputValuesAssignment_1 ) ) )
            // InternalXActivityDiagramInput.g:359:1: ( ( rule__Input__InputValuesAssignment_1 ) )
            {
            // InternalXActivityDiagramInput.g:359:1: ( ( rule__Input__InputValuesAssignment_1 ) )
            // InternalXActivityDiagramInput.g:360:2: ( rule__Input__InputValuesAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getInputValuesAssignment_1()); 
            // InternalXActivityDiagramInput.g:361:2: ( rule__Input__InputValuesAssignment_1 )
            // InternalXActivityDiagramInput.g:361:3: rule__Input__InputValuesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__InputValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getInputValuesAssignment_1()); 

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
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalXActivityDiagramInput.g:369:1: rule__Input__Group__2 : rule__Input__Group__2__Impl ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:373:1: ( rule__Input__Group__2__Impl )
            // InternalXActivityDiagramInput.g:374:2: rule__Input__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__2__Impl();

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
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalXActivityDiagramInput.g:380:1: rule__Input__Group__2__Impl : ( ( rule__Input__Group_2__0 )* ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:384:1: ( ( ( rule__Input__Group_2__0 )* ) )
            // InternalXActivityDiagramInput.g:385:1: ( ( rule__Input__Group_2__0 )* )
            {
            // InternalXActivityDiagramInput.g:385:1: ( ( rule__Input__Group_2__0 )* )
            // InternalXActivityDiagramInput.g:386:2: ( rule__Input__Group_2__0 )*
            {
             before(grammarAccess.getInputAccess().getGroup_2()); 
            // InternalXActivityDiagramInput.g:387:2: ( rule__Input__Group_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXActivityDiagramInput.g:387:3: rule__Input__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Input__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group_2__0"
    // InternalXActivityDiagramInput.g:396:1: rule__Input__Group_2__0 : rule__Input__Group_2__0__Impl rule__Input__Group_2__1 ;
    public final void rule__Input__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:400:1: ( rule__Input__Group_2__0__Impl rule__Input__Group_2__1 )
            // InternalXActivityDiagramInput.g:401:2: rule__Input__Group_2__0__Impl rule__Input__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Input__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_2__1();

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
    // $ANTLR end "rule__Input__Group_2__0"


    // $ANTLR start "rule__Input__Group_2__0__Impl"
    // InternalXActivityDiagramInput.g:408:1: rule__Input__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Input__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:412:1: ( ( ',' ) )
            // InternalXActivityDiagramInput.g:413:1: ( ',' )
            {
            // InternalXActivityDiagramInput.g:413:1: ( ',' )
            // InternalXActivityDiagramInput.g:414:2: ','
            {
             before(grammarAccess.getInputAccess().getCommaKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Input__Group_2__0__Impl"


    // $ANTLR start "rule__Input__Group_2__1"
    // InternalXActivityDiagramInput.g:423:1: rule__Input__Group_2__1 : rule__Input__Group_2__1__Impl ;
    public final void rule__Input__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:427:1: ( rule__Input__Group_2__1__Impl )
            // InternalXActivityDiagramInput.g:428:2: rule__Input__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group_2__1__Impl();

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
    // $ANTLR end "rule__Input__Group_2__1"


    // $ANTLR start "rule__Input__Group_2__1__Impl"
    // InternalXActivityDiagramInput.g:434:1: rule__Input__Group_2__1__Impl : ( ( rule__Input__InputValuesAssignment_2_1 ) ) ;
    public final void rule__Input__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:438:1: ( ( ( rule__Input__InputValuesAssignment_2_1 ) ) )
            // InternalXActivityDiagramInput.g:439:1: ( ( rule__Input__InputValuesAssignment_2_1 ) )
            {
            // InternalXActivityDiagramInput.g:439:1: ( ( rule__Input__InputValuesAssignment_2_1 ) )
            // InternalXActivityDiagramInput.g:440:2: ( rule__Input__InputValuesAssignment_2_1 )
            {
             before(grammarAccess.getInputAccess().getInputValuesAssignment_2_1()); 
            // InternalXActivityDiagramInput.g:441:2: ( rule__Input__InputValuesAssignment_2_1 )
            // InternalXActivityDiagramInput.g:441:3: rule__Input__InputValuesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__InputValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getInputValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__Input__Group_2__1__Impl"


    // $ANTLR start "rule__InputValue__Group__0"
    // InternalXActivityDiagramInput.g:450:1: rule__InputValue__Group__0 : rule__InputValue__Group__0__Impl rule__InputValue__Group__1 ;
    public final void rule__InputValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:454:1: ( rule__InputValue__Group__0__Impl rule__InputValue__Group__1 )
            // InternalXActivityDiagramInput.g:455:2: rule__InputValue__Group__0__Impl rule__InputValue__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__InputValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputValue__Group__1();

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
    // $ANTLR end "rule__InputValue__Group__0"


    // $ANTLR start "rule__InputValue__Group__0__Impl"
    // InternalXActivityDiagramInput.g:462:1: rule__InputValue__Group__0__Impl : ( ( rule__InputValue__VariableAssignment_0 ) ) ;
    public final void rule__InputValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:466:1: ( ( ( rule__InputValue__VariableAssignment_0 ) ) )
            // InternalXActivityDiagramInput.g:467:1: ( ( rule__InputValue__VariableAssignment_0 ) )
            {
            // InternalXActivityDiagramInput.g:467:1: ( ( rule__InputValue__VariableAssignment_0 ) )
            // InternalXActivityDiagramInput.g:468:2: ( rule__InputValue__VariableAssignment_0 )
            {
             before(grammarAccess.getInputValueAccess().getVariableAssignment_0()); 
            // InternalXActivityDiagramInput.g:469:2: ( rule__InputValue__VariableAssignment_0 )
            // InternalXActivityDiagramInput.g:469:3: rule__InputValue__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InputValue__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInputValueAccess().getVariableAssignment_0()); 

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
    // $ANTLR end "rule__InputValue__Group__0__Impl"


    // $ANTLR start "rule__InputValue__Group__1"
    // InternalXActivityDiagramInput.g:477:1: rule__InputValue__Group__1 : rule__InputValue__Group__1__Impl rule__InputValue__Group__2 ;
    public final void rule__InputValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:481:1: ( rule__InputValue__Group__1__Impl rule__InputValue__Group__2 )
            // InternalXActivityDiagramInput.g:482:2: rule__InputValue__Group__1__Impl rule__InputValue__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__InputValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputValue__Group__2();

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
    // $ANTLR end "rule__InputValue__Group__1"


    // $ANTLR start "rule__InputValue__Group__1__Impl"
    // InternalXActivityDiagramInput.g:489:1: rule__InputValue__Group__1__Impl : ( '=' ) ;
    public final void rule__InputValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:493:1: ( ( '=' ) )
            // InternalXActivityDiagramInput.g:494:1: ( '=' )
            {
            // InternalXActivityDiagramInput.g:494:1: ( '=' )
            // InternalXActivityDiagramInput.g:495:2: '='
            {
             before(grammarAccess.getInputValueAccess().getEqualsSignKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInputValueAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__InputValue__Group__1__Impl"


    // $ANTLR start "rule__InputValue__Group__2"
    // InternalXActivityDiagramInput.g:504:1: rule__InputValue__Group__2 : rule__InputValue__Group__2__Impl ;
    public final void rule__InputValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:508:1: ( rule__InputValue__Group__2__Impl )
            // InternalXActivityDiagramInput.g:509:2: rule__InputValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputValue__Group__2__Impl();

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
    // $ANTLR end "rule__InputValue__Group__2"


    // $ANTLR start "rule__InputValue__Group__2__Impl"
    // InternalXActivityDiagramInput.g:515:1: rule__InputValue__Group__2__Impl : ( ( rule__InputValue__ValueAssignment_2 ) ) ;
    public final void rule__InputValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:519:1: ( ( ( rule__InputValue__ValueAssignment_2 ) ) )
            // InternalXActivityDiagramInput.g:520:1: ( ( rule__InputValue__ValueAssignment_2 ) )
            {
            // InternalXActivityDiagramInput.g:520:1: ( ( rule__InputValue__ValueAssignment_2 ) )
            // InternalXActivityDiagramInput.g:521:2: ( rule__InputValue__ValueAssignment_2 )
            {
             before(grammarAccess.getInputValueAccess().getValueAssignment_2()); 
            // InternalXActivityDiagramInput.g:522:2: ( rule__InputValue__ValueAssignment_2 )
            // InternalXActivityDiagramInput.g:522:3: rule__InputValue__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InputValue__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputValueAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__InputValue__Group__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalXActivityDiagramInput.g:531:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:535:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalXActivityDiagramInput.g:536:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalXActivityDiagramInput.g:543:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:547:1: ( ( ( '-' )? ) )
            // InternalXActivityDiagramInput.g:548:1: ( ( '-' )? )
            {
            // InternalXActivityDiagramInput.g:548:1: ( ( '-' )? )
            // InternalXActivityDiagramInput.g:549:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalXActivityDiagramInput.g:550:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXActivityDiagramInput.g:550:3: '-'
                    {
                    match(input,15,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalXActivityDiagramInput.g:558:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:562:1: ( rule__EInt__Group__1__Impl )
            // InternalXActivityDiagramInput.g:563:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalXActivityDiagramInput.g:569:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:573:1: ( ( RULE_INT ) )
            // InternalXActivityDiagramInput.g:574:1: ( RULE_INT )
            {
            // InternalXActivityDiagramInput.g:574:1: ( RULE_INT )
            // InternalXActivityDiagramInput.g:575:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Input__InputValuesAssignment_1"
    // InternalXActivityDiagramInput.g:585:1: rule__Input__InputValuesAssignment_1 : ( ruleInputValue ) ;
    public final void rule__Input__InputValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:589:1: ( ( ruleInputValue ) )
            // InternalXActivityDiagramInput.g:590:2: ( ruleInputValue )
            {
            // InternalXActivityDiagramInput.g:590:2: ( ruleInputValue )
            // InternalXActivityDiagramInput.g:591:3: ruleInputValue
            {
             before(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputValue();

            state._fsp--;

             after(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Input__InputValuesAssignment_1"


    // $ANTLR start "rule__Input__InputValuesAssignment_2_1"
    // InternalXActivityDiagramInput.g:600:1: rule__Input__InputValuesAssignment_2_1 : ( ruleInputValue ) ;
    public final void rule__Input__InputValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:604:1: ( ( ruleInputValue ) )
            // InternalXActivityDiagramInput.g:605:2: ( ruleInputValue )
            {
            // InternalXActivityDiagramInput.g:605:2: ( ruleInputValue )
            // InternalXActivityDiagramInput.g:606:3: ruleInputValue
            {
             before(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputValue();

            state._fsp--;

             after(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Input__InputValuesAssignment_2_1"


    // $ANTLR start "rule__InputValue__VariableAssignment_0"
    // InternalXActivityDiagramInput.g:615:1: rule__InputValue__VariableAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__InputValue__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:619:1: ( ( ( ruleEString ) ) )
            // InternalXActivityDiagramInput.g:620:2: ( ( ruleEString ) )
            {
            // InternalXActivityDiagramInput.g:620:2: ( ( ruleEString ) )
            // InternalXActivityDiagramInput.g:621:3: ( ruleEString )
            {
             before(grammarAccess.getInputValueAccess().getVariableVariableCrossReference_0_0()); 
            // InternalXActivityDiagramInput.g:622:3: ( ruleEString )
            // InternalXActivityDiagramInput.g:623:4: ruleEString
            {
             before(grammarAccess.getInputValueAccess().getVariableVariableEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputValueAccess().getVariableVariableEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getInputValueAccess().getVariableVariableCrossReference_0_0()); 

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
    // $ANTLR end "rule__InputValue__VariableAssignment_0"


    // $ANTLR start "rule__InputValue__ValueAssignment_2"
    // InternalXActivityDiagramInput.g:634:1: rule__InputValue__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__InputValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:638:1: ( ( ruleValue ) )
            // InternalXActivityDiagramInput.g:639:2: ( ruleValue )
            {
            // InternalXActivityDiagramInput.g:639:2: ( ruleValue )
            // InternalXActivityDiagramInput.g:640:3: ruleValue
            {
             before(grammarAccess.getInputValueAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getInputValueAccess().getValueValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__InputValue__ValueAssignment_2"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // InternalXActivityDiagramInput.g:649:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:653:1: ( ( ruleEBoolean ) )
            // InternalXActivityDiagramInput.g:654:2: ( ruleEBoolean )
            {
            // InternalXActivityDiagramInput.g:654:2: ( ruleEBoolean )
            // InternalXActivityDiagramInput.g:655:3: ruleEBoolean
            {
             before(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 

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
    // $ANTLR end "rule__BooleanValue__ValueAssignment"


    // $ANTLR start "rule__IntegerValue__ValueAssignment"
    // InternalXActivityDiagramInput.g:664:1: rule__IntegerValue__ValueAssignment : ( ruleEInt ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXActivityDiagramInput.g:668:1: ( ( ruleEInt ) )
            // InternalXActivityDiagramInput.g:669:2: ( ruleEInt )
            {
            // InternalXActivityDiagramInput.g:669:2: ( ruleEInt )
            // InternalXActivityDiagramInput.g:670:3: ruleEInt
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0()); 

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
    // $ANTLR end "rule__IntegerValue__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009840L});

}