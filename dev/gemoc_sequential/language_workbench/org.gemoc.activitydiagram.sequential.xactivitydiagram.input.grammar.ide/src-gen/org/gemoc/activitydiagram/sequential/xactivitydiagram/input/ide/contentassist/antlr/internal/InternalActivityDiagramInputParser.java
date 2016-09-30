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
import org.gemoc.activitydiagram.sequential.xactivitydiagram.input.services.ActivityDiagramInputGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivityDiagramInputParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'='", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalActivityDiagramInputParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivityDiagramInputParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivityDiagramInputParser.tokenNames; }
    public String getGrammarFileName() { return "InternalActivityDiagramInput.g"; }


    	private ActivityDiagramInputGrammarAccess grammarAccess;

    	public void setGrammarAccess(ActivityDiagramInputGrammarAccess grammarAccess) {
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
    // InternalActivityDiagramInput.g:53:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:54:1: ( ruleInput EOF )
            // InternalActivityDiagramInput.g:55:1: ruleInput EOF
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
    // InternalActivityDiagramInput.g:62:1: ruleInput : ( ( rule__Input__InputValuesAssignment ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:66:2: ( ( ( rule__Input__InputValuesAssignment ) ) )
            // InternalActivityDiagramInput.g:67:2: ( ( rule__Input__InputValuesAssignment ) )
            {
            // InternalActivityDiagramInput.g:67:2: ( ( rule__Input__InputValuesAssignment ) )
            // InternalActivityDiagramInput.g:68:3: ( rule__Input__InputValuesAssignment )
            {
             before(grammarAccess.getInputAccess().getInputValuesAssignment()); 
            // InternalActivityDiagramInput.g:69:3: ( rule__Input__InputValuesAssignment )
            // InternalActivityDiagramInput.g:69:4: rule__Input__InputValuesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Input__InputValuesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getInputValuesAssignment()); 

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
    // InternalActivityDiagramInput.g:78:1: entryRuleInputValue : ruleInputValue EOF ;
    public final void entryRuleInputValue() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:79:1: ( ruleInputValue EOF )
            // InternalActivityDiagramInput.g:80:1: ruleInputValue EOF
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
    // InternalActivityDiagramInput.g:87:1: ruleInputValue : ( ( rule__InputValue__Group__0 ) ) ;
    public final void ruleInputValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:91:2: ( ( ( rule__InputValue__Group__0 ) ) )
            // InternalActivityDiagramInput.g:92:2: ( ( rule__InputValue__Group__0 ) )
            {
            // InternalActivityDiagramInput.g:92:2: ( ( rule__InputValue__Group__0 ) )
            // InternalActivityDiagramInput.g:93:3: ( rule__InputValue__Group__0 )
            {
             before(grammarAccess.getInputValueAccess().getGroup()); 
            // InternalActivityDiagramInput.g:94:3: ( rule__InputValue__Group__0 )
            // InternalActivityDiagramInput.g:94:4: rule__InputValue__Group__0
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
    // InternalActivityDiagramInput.g:103:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:104:1: ( ruleValue EOF )
            // InternalActivityDiagramInput.g:105:1: ruleValue EOF
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
    // InternalActivityDiagramInput.g:112:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:116:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalActivityDiagramInput.g:117:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalActivityDiagramInput.g:117:2: ( ( rule__Value__Alternatives ) )
            // InternalActivityDiagramInput.g:118:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalActivityDiagramInput.g:119:3: ( rule__Value__Alternatives )
            // InternalActivityDiagramInput.g:119:4: rule__Value__Alternatives
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
    // InternalActivityDiagramInput.g:128:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:129:1: ( ruleBooleanValue EOF )
            // InternalActivityDiagramInput.g:130:1: ruleBooleanValue EOF
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
    // InternalActivityDiagramInput.g:137:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:141:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalActivityDiagramInput.g:142:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalActivityDiagramInput.g:142:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalActivityDiagramInput.g:143:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalActivityDiagramInput.g:144:3: ( rule__BooleanValue__ValueAssignment )
            // InternalActivityDiagramInput.g:144:4: rule__BooleanValue__ValueAssignment
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
    // InternalActivityDiagramInput.g:153:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:154:1: ( ruleIntegerValue EOF )
            // InternalActivityDiagramInput.g:155:1: ruleIntegerValue EOF
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
    // InternalActivityDiagramInput.g:162:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:166:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // InternalActivityDiagramInput.g:167:2: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // InternalActivityDiagramInput.g:167:2: ( ( rule__IntegerValue__ValueAssignment ) )
            // InternalActivityDiagramInput.g:168:3: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // InternalActivityDiagramInput.g:169:3: ( rule__IntegerValue__ValueAssignment )
            // InternalActivityDiagramInput.g:169:4: rule__IntegerValue__ValueAssignment
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
    // InternalActivityDiagramInput.g:178:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:179:1: ( ruleEBoolean EOF )
            // InternalActivityDiagramInput.g:180:1: ruleEBoolean EOF
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
    // InternalActivityDiagramInput.g:187:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:191:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalActivityDiagramInput.g:192:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalActivityDiagramInput.g:192:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalActivityDiagramInput.g:193:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalActivityDiagramInput.g:194:3: ( rule__EBoolean__Alternatives )
            // InternalActivityDiagramInput.g:194:4: rule__EBoolean__Alternatives
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
    // InternalActivityDiagramInput.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:204:1: ( ruleEInt EOF )
            // InternalActivityDiagramInput.g:205:1: ruleEInt EOF
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
    // InternalActivityDiagramInput.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalActivityDiagramInput.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalActivityDiagramInput.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalActivityDiagramInput.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalActivityDiagramInput.g:219:3: ( rule__EInt__Group__0 )
            // InternalActivityDiagramInput.g:219:4: rule__EInt__Group__0
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
    // InternalActivityDiagramInput.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:229:1: ( ruleEString EOF )
            // InternalActivityDiagramInput.g:230:1: ruleEString EOF
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
    // InternalActivityDiagramInput.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalActivityDiagramInput.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalActivityDiagramInput.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalActivityDiagramInput.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalActivityDiagramInput.g:244:3: ( rule__EString__Alternatives )
            // InternalActivityDiagramInput.g:244:4: rule__EString__Alternatives
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
    // InternalActivityDiagramInput.g:252:1: rule__Value__Alternatives : ( ( ruleBooleanValue ) | ( ruleIntegerValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:256:1: ( ( ruleBooleanValue ) | ( ruleIntegerValue ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_INT||LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalActivityDiagramInput.g:257:2: ( ruleBooleanValue )
                    {
                    // InternalActivityDiagramInput.g:257:2: ( ruleBooleanValue )
                    // InternalActivityDiagramInput.g:258:3: ruleBooleanValue
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
                    // InternalActivityDiagramInput.g:263:2: ( ruleIntegerValue )
                    {
                    // InternalActivityDiagramInput.g:263:2: ( ruleIntegerValue )
                    // InternalActivityDiagramInput.g:264:3: ruleIntegerValue
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
    // InternalActivityDiagramInput.g:273:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:277:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalActivityDiagramInput.g:278:2: ( 'true' )
                    {
                    // InternalActivityDiagramInput.g:278:2: ( 'true' )
                    // InternalActivityDiagramInput.g:279:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityDiagramInput.g:284:2: ( 'false' )
                    {
                    // InternalActivityDiagramInput.g:284:2: ( 'false' )
                    // InternalActivityDiagramInput.g:285:3: 'false'
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
    // InternalActivityDiagramInput.g:294:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:298:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalActivityDiagramInput.g:299:2: ( RULE_STRING )
                    {
                    // InternalActivityDiagramInput.g:299:2: ( RULE_STRING )
                    // InternalActivityDiagramInput.g:300:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityDiagramInput.g:305:2: ( RULE_ID )
                    {
                    // InternalActivityDiagramInput.g:305:2: ( RULE_ID )
                    // InternalActivityDiagramInput.g:306:3: RULE_ID
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


    // $ANTLR start "rule__InputValue__Group__0"
    // InternalActivityDiagramInput.g:315:1: rule__InputValue__Group__0 : rule__InputValue__Group__0__Impl rule__InputValue__Group__1 ;
    public final void rule__InputValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:319:1: ( rule__InputValue__Group__0__Impl rule__InputValue__Group__1 )
            // InternalActivityDiagramInput.g:320:2: rule__InputValue__Group__0__Impl rule__InputValue__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalActivityDiagramInput.g:327:1: rule__InputValue__Group__0__Impl : ( ( rule__InputValue__VariableAssignment_0 ) ) ;
    public final void rule__InputValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:331:1: ( ( ( rule__InputValue__VariableAssignment_0 ) ) )
            // InternalActivityDiagramInput.g:332:1: ( ( rule__InputValue__VariableAssignment_0 ) )
            {
            // InternalActivityDiagramInput.g:332:1: ( ( rule__InputValue__VariableAssignment_0 ) )
            // InternalActivityDiagramInput.g:333:2: ( rule__InputValue__VariableAssignment_0 )
            {
             before(grammarAccess.getInputValueAccess().getVariableAssignment_0()); 
            // InternalActivityDiagramInput.g:334:2: ( rule__InputValue__VariableAssignment_0 )
            // InternalActivityDiagramInput.g:334:3: rule__InputValue__VariableAssignment_0
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
    // InternalActivityDiagramInput.g:342:1: rule__InputValue__Group__1 : rule__InputValue__Group__1__Impl rule__InputValue__Group__2 ;
    public final void rule__InputValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:346:1: ( rule__InputValue__Group__1__Impl rule__InputValue__Group__2 )
            // InternalActivityDiagramInput.g:347:2: rule__InputValue__Group__1__Impl rule__InputValue__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalActivityDiagramInput.g:354:1: rule__InputValue__Group__1__Impl : ( '=' ) ;
    public final void rule__InputValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:358:1: ( ( '=' ) )
            // InternalActivityDiagramInput.g:359:1: ( '=' )
            {
            // InternalActivityDiagramInput.g:359:1: ( '=' )
            // InternalActivityDiagramInput.g:360:2: '='
            {
             before(grammarAccess.getInputValueAccess().getEqualsSignKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalActivityDiagramInput.g:369:1: rule__InputValue__Group__2 : rule__InputValue__Group__2__Impl ;
    public final void rule__InputValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:373:1: ( rule__InputValue__Group__2__Impl )
            // InternalActivityDiagramInput.g:374:2: rule__InputValue__Group__2__Impl
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
    // InternalActivityDiagramInput.g:380:1: rule__InputValue__Group__2__Impl : ( ( rule__InputValue__ValueAssignment_2 ) ) ;
    public final void rule__InputValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:384:1: ( ( ( rule__InputValue__ValueAssignment_2 ) ) )
            // InternalActivityDiagramInput.g:385:1: ( ( rule__InputValue__ValueAssignment_2 ) )
            {
            // InternalActivityDiagramInput.g:385:1: ( ( rule__InputValue__ValueAssignment_2 ) )
            // InternalActivityDiagramInput.g:386:2: ( rule__InputValue__ValueAssignment_2 )
            {
             before(grammarAccess.getInputValueAccess().getValueAssignment_2()); 
            // InternalActivityDiagramInput.g:387:2: ( rule__InputValue__ValueAssignment_2 )
            // InternalActivityDiagramInput.g:387:3: rule__InputValue__ValueAssignment_2
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
    // InternalActivityDiagramInput.g:396:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:400:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalActivityDiagramInput.g:401:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalActivityDiagramInput.g:408:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:412:1: ( ( ( '-' )? ) )
            // InternalActivityDiagramInput.g:413:1: ( ( '-' )? )
            {
            // InternalActivityDiagramInput.g:413:1: ( ( '-' )? )
            // InternalActivityDiagramInput.g:414:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalActivityDiagramInput.g:415:2: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalActivityDiagramInput.g:415:3: '-'
                    {
                    match(input,14,FOLLOW_2); 

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
    // InternalActivityDiagramInput.g:423:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:427:1: ( rule__EInt__Group__1__Impl )
            // InternalActivityDiagramInput.g:428:2: rule__EInt__Group__1__Impl
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
    // InternalActivityDiagramInput.g:434:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:438:1: ( ( RULE_INT ) )
            // InternalActivityDiagramInput.g:439:1: ( RULE_INT )
            {
            // InternalActivityDiagramInput.g:439:1: ( RULE_INT )
            // InternalActivityDiagramInput.g:440:2: RULE_INT
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


    // $ANTLR start "rule__Input__InputValuesAssignment"
    // InternalActivityDiagramInput.g:450:1: rule__Input__InputValuesAssignment : ( ruleInputValue ) ;
    public final void rule__Input__InputValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:454:1: ( ( ruleInputValue ) )
            // InternalActivityDiagramInput.g:455:2: ( ruleInputValue )
            {
            // InternalActivityDiagramInput.g:455:2: ( ruleInputValue )
            // InternalActivityDiagramInput.g:456:3: ruleInputValue
            {
             before(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInputValue();

            state._fsp--;

             after(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_0()); 

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
    // $ANTLR end "rule__Input__InputValuesAssignment"


    // $ANTLR start "rule__InputValue__VariableAssignment_0"
    // InternalActivityDiagramInput.g:465:1: rule__InputValue__VariableAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__InputValue__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:469:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramInput.g:470:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramInput.g:470:2: ( ( ruleEString ) )
            // InternalActivityDiagramInput.g:471:3: ( ruleEString )
            {
             before(grammarAccess.getInputValueAccess().getVariableVariableCrossReference_0_0()); 
            // InternalActivityDiagramInput.g:472:3: ( ruleEString )
            // InternalActivityDiagramInput.g:473:4: ruleEString
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
    // InternalActivityDiagramInput.g:484:1: rule__InputValue__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__InputValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:488:1: ( ( ruleValue ) )
            // InternalActivityDiagramInput.g:489:2: ( ruleValue )
            {
            // InternalActivityDiagramInput.g:489:2: ( ruleValue )
            // InternalActivityDiagramInput.g:490:3: ruleValue
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
    // InternalActivityDiagramInput.g:499:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:503:1: ( ( ruleEBoolean ) )
            // InternalActivityDiagramInput.g:504:2: ( ruleEBoolean )
            {
            // InternalActivityDiagramInput.g:504:2: ( ruleEBoolean )
            // InternalActivityDiagramInput.g:505:3: ruleEBoolean
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
    // InternalActivityDiagramInput.g:514:1: rule__IntegerValue__ValueAssignment : ( ruleEInt ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramInput.g:518:1: ( ( ruleEInt ) )
            // InternalActivityDiagramInput.g:519:2: ( ruleEInt )
            {
            // InternalActivityDiagramInput.g:519:2: ( ruleEInt )
            // InternalActivityDiagramInput.g:520:3: ruleEInt
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005840L});

}