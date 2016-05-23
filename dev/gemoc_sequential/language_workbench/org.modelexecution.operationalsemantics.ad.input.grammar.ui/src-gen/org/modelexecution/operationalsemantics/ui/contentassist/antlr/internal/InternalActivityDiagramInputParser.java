package org.modelexecution.operationalsemantics.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.modelexecution.operationalsemantics.services.ActivityDiagramInputGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivityDiagramInputParser extends AbstractInternalContentAssistParser {
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
    // InternalActivityDiagramInput.g:60:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:61:1: ( ruleInput EOF )
            // InternalActivityDiagramInput.g:62:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagramInput.g:69:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:73:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalActivityDiagramInput.g:74:1: ( ( rule__Input__Group__0 ) )
            {
            // InternalActivityDiagramInput.g:74:1: ( ( rule__Input__Group__0 ) )
            // InternalActivityDiagramInput.g:75:1: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalActivityDiagramInput.g:76:1: ( rule__Input__Group__0 )
            // InternalActivityDiagramInput.g:76:2: rule__Input__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:88:1: entryRuleInputValue : ruleInputValue EOF ;
    public final void entryRuleInputValue() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:89:1: ( ruleInputValue EOF )
            // InternalActivityDiagramInput.g:90:1: ruleInputValue EOF
            {
             before(grammarAccess.getInputValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInputValue();

            state._fsp--;

             after(grammarAccess.getInputValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagramInput.g:97:1: ruleInputValue : ( ( rule__InputValue__Group__0 ) ) ;
    public final void ruleInputValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:101:2: ( ( ( rule__InputValue__Group__0 ) ) )
            // InternalActivityDiagramInput.g:102:1: ( ( rule__InputValue__Group__0 ) )
            {
            // InternalActivityDiagramInput.g:102:1: ( ( rule__InputValue__Group__0 ) )
            // InternalActivityDiagramInput.g:103:1: ( rule__InputValue__Group__0 )
            {
             before(grammarAccess.getInputValueAccess().getGroup()); 
            // InternalActivityDiagramInput.g:104:1: ( rule__InputValue__Group__0 )
            // InternalActivityDiagramInput.g:104:2: rule__InputValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:116:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:117:1: ( ruleValue EOF )
            // InternalActivityDiagramInput.g:118:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagramInput.g:125:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:129:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalActivityDiagramInput.g:130:1: ( ( rule__Value__Alternatives ) )
            {
            // InternalActivityDiagramInput.g:130:1: ( ( rule__Value__Alternatives ) )
            // InternalActivityDiagramInput.g:131:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalActivityDiagramInput.g:132:1: ( rule__Value__Alternatives )
            // InternalActivityDiagramInput.g:132:2: rule__Value__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:144:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:145:1: ( ruleBooleanValue EOF )
            // InternalActivityDiagramInput.g:146:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagramInput.g:153:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:157:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalActivityDiagramInput.g:158:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalActivityDiagramInput.g:158:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalActivityDiagramInput.g:159:1: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalActivityDiagramInput.g:160:1: ( rule__BooleanValue__ValueAssignment )
            // InternalActivityDiagramInput.g:160:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:172:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:173:1: ( ruleIntegerValue EOF )
            // InternalActivityDiagramInput.g:174:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagramInput.g:181:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:185:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // InternalActivityDiagramInput.g:186:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // InternalActivityDiagramInput.g:186:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // InternalActivityDiagramInput.g:187:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // InternalActivityDiagramInput.g:188:1: ( rule__IntegerValue__ValueAssignment )
            // InternalActivityDiagramInput.g:188:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:200:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:201:1: ( ruleEBoolean EOF )
            // InternalActivityDiagramInput.g:202:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagramInput.g:209:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:213:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalActivityDiagramInput.g:214:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalActivityDiagramInput.g:214:1: ( ( rule__EBoolean__Alternatives ) )
            // InternalActivityDiagramInput.g:215:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalActivityDiagramInput.g:216:1: ( rule__EBoolean__Alternatives )
            // InternalActivityDiagramInput.g:216:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:229:1: ( ruleEInt EOF )
            // InternalActivityDiagramInput.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagramInput.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalActivityDiagramInput.g:242:1: ( ( rule__EInt__Group__0 ) )
            {
            // InternalActivityDiagramInput.g:242:1: ( ( rule__EInt__Group__0 ) )
            // InternalActivityDiagramInput.g:243:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalActivityDiagramInput.g:244:1: ( rule__EInt__Group__0 )
            // InternalActivityDiagramInput.g:244:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:256:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalActivityDiagramInput.g:257:1: ( ruleEString EOF )
            // InternalActivityDiagramInput.g:258:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagramInput.g:265:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:269:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalActivityDiagramInput.g:270:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalActivityDiagramInput.g:270:1: ( ( rule__EString__Alternatives ) )
            // InternalActivityDiagramInput.g:271:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalActivityDiagramInput.g:272:1: ( rule__EString__Alternatives )
            // InternalActivityDiagramInput.g:272:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:284:1: rule__Value__Alternatives : ( ( ruleBooleanValue ) | ( ruleIntegerValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:288:1: ( ( ruleBooleanValue ) | ( ruleIntegerValue ) )
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
                    // InternalActivityDiagramInput.g:289:1: ( ruleBooleanValue )
                    {
                    // InternalActivityDiagramInput.g:289:1: ( ruleBooleanValue )
                    // InternalActivityDiagramInput.g:290:1: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityDiagramInput.g:295:6: ( ruleIntegerValue )
                    {
                    // InternalActivityDiagramInput.g:295:6: ( ruleIntegerValue )
                    // InternalActivityDiagramInput.g:296:1: ruleIntegerValue
                    {
                     before(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:306:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:310:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalActivityDiagramInput.g:311:1: ( 'true' )
                    {
                    // InternalActivityDiagramInput.g:311:1: ( 'true' )
                    // InternalActivityDiagramInput.g:312:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityDiagramInput.g:319:6: ( 'false' )
                    {
                    // InternalActivityDiagramInput.g:319:6: ( 'false' )
                    // InternalActivityDiagramInput.g:320:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FollowSets000.FOLLOW_2); 
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
    // InternalActivityDiagramInput.g:332:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:336:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalActivityDiagramInput.g:337:1: ( RULE_STRING )
                    {
                    // InternalActivityDiagramInput.g:337:1: ( RULE_STRING )
                    // InternalActivityDiagramInput.g:338:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityDiagramInput.g:343:6: ( RULE_ID )
                    {
                    // InternalActivityDiagramInput.g:343:6: ( RULE_ID )
                    // InternalActivityDiagramInput.g:344:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
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
    // InternalActivityDiagramInput.g:356:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:360:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalActivityDiagramInput.g:361:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:368:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:372:1: ( ( () ) )
            // InternalActivityDiagramInput.g:373:1: ( () )
            {
            // InternalActivityDiagramInput.g:373:1: ( () )
            // InternalActivityDiagramInput.g:374:1: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalActivityDiagramInput.g:375:1: ()
            // InternalActivityDiagramInput.g:377:1: 
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
    // InternalActivityDiagramInput.g:387:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:391:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalActivityDiagramInput.g:392:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:399:1: rule__Input__Group__1__Impl : ( ( rule__Input__InputValuesAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:403:1: ( ( ( rule__Input__InputValuesAssignment_1 ) ) )
            // InternalActivityDiagramInput.g:404:1: ( ( rule__Input__InputValuesAssignment_1 ) )
            {
            // InternalActivityDiagramInput.g:404:1: ( ( rule__Input__InputValuesAssignment_1 ) )
            // InternalActivityDiagramInput.g:405:1: ( rule__Input__InputValuesAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getInputValuesAssignment_1()); 
            // InternalActivityDiagramInput.g:406:1: ( rule__Input__InputValuesAssignment_1 )
            // InternalActivityDiagramInput.g:406:2: rule__Input__InputValuesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:416:1: rule__Input__Group__2 : rule__Input__Group__2__Impl ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:420:1: ( rule__Input__Group__2__Impl )
            // InternalActivityDiagramInput.g:421:2: rule__Input__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:427:1: rule__Input__Group__2__Impl : ( ( rule__Input__Group_2__0 )* ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:431:1: ( ( ( rule__Input__Group_2__0 )* ) )
            // InternalActivityDiagramInput.g:432:1: ( ( rule__Input__Group_2__0 )* )
            {
            // InternalActivityDiagramInput.g:432:1: ( ( rule__Input__Group_2__0 )* )
            // InternalActivityDiagramInput.g:433:1: ( rule__Input__Group_2__0 )*
            {
             before(grammarAccess.getInputAccess().getGroup_2()); 
            // InternalActivityDiagramInput.g:434:1: ( rule__Input__Group_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalActivityDiagramInput.g:434:2: rule__Input__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalActivityDiagramInput.g:450:1: rule__Input__Group_2__0 : rule__Input__Group_2__0__Impl rule__Input__Group_2__1 ;
    public final void rule__Input__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:454:1: ( rule__Input__Group_2__0__Impl rule__Input__Group_2__1 )
            // InternalActivityDiagramInput.g:455:2: rule__Input__Group_2__0__Impl rule__Input__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Input__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:462:1: rule__Input__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Input__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:466:1: ( ( ',' ) )
            // InternalActivityDiagramInput.g:467:1: ( ',' )
            {
            // InternalActivityDiagramInput.g:467:1: ( ',' )
            // InternalActivityDiagramInput.g:468:1: ','
            {
             before(grammarAccess.getInputAccess().getCommaKeyword_2_0()); 
            match(input,13,FollowSets000.FOLLOW_2); 
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
    // InternalActivityDiagramInput.g:481:1: rule__Input__Group_2__1 : rule__Input__Group_2__1__Impl ;
    public final void rule__Input__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:485:1: ( rule__Input__Group_2__1__Impl )
            // InternalActivityDiagramInput.g:486:2: rule__Input__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:492:1: rule__Input__Group_2__1__Impl : ( ( rule__Input__InputValuesAssignment_2_1 ) ) ;
    public final void rule__Input__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:496:1: ( ( ( rule__Input__InputValuesAssignment_2_1 ) ) )
            // InternalActivityDiagramInput.g:497:1: ( ( rule__Input__InputValuesAssignment_2_1 ) )
            {
            // InternalActivityDiagramInput.g:497:1: ( ( rule__Input__InputValuesAssignment_2_1 ) )
            // InternalActivityDiagramInput.g:498:1: ( rule__Input__InputValuesAssignment_2_1 )
            {
             before(grammarAccess.getInputAccess().getInputValuesAssignment_2_1()); 
            // InternalActivityDiagramInput.g:499:1: ( rule__Input__InputValuesAssignment_2_1 )
            // InternalActivityDiagramInput.g:499:2: rule__Input__InputValuesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:513:1: rule__InputValue__Group__0 : rule__InputValue__Group__0__Impl rule__InputValue__Group__1 ;
    public final void rule__InputValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:517:1: ( rule__InputValue__Group__0__Impl rule__InputValue__Group__1 )
            // InternalActivityDiagramInput.g:518:2: rule__InputValue__Group__0__Impl rule__InputValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__InputValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:525:1: rule__InputValue__Group__0__Impl : ( ( rule__InputValue__VariableAssignment_0 ) ) ;
    public final void rule__InputValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:529:1: ( ( ( rule__InputValue__VariableAssignment_0 ) ) )
            // InternalActivityDiagramInput.g:530:1: ( ( rule__InputValue__VariableAssignment_0 ) )
            {
            // InternalActivityDiagramInput.g:530:1: ( ( rule__InputValue__VariableAssignment_0 ) )
            // InternalActivityDiagramInput.g:531:1: ( rule__InputValue__VariableAssignment_0 )
            {
             before(grammarAccess.getInputValueAccess().getVariableAssignment_0()); 
            // InternalActivityDiagramInput.g:532:1: ( rule__InputValue__VariableAssignment_0 )
            // InternalActivityDiagramInput.g:532:2: rule__InputValue__VariableAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:542:1: rule__InputValue__Group__1 : rule__InputValue__Group__1__Impl rule__InputValue__Group__2 ;
    public final void rule__InputValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:546:1: ( rule__InputValue__Group__1__Impl rule__InputValue__Group__2 )
            // InternalActivityDiagramInput.g:547:2: rule__InputValue__Group__1__Impl rule__InputValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__InputValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:554:1: rule__InputValue__Group__1__Impl : ( '=' ) ;
    public final void rule__InputValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:558:1: ( ( '=' ) )
            // InternalActivityDiagramInput.g:559:1: ( '=' )
            {
            // InternalActivityDiagramInput.g:559:1: ( '=' )
            // InternalActivityDiagramInput.g:560:1: '='
            {
             before(grammarAccess.getInputValueAccess().getEqualsSignKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_2); 
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
    // InternalActivityDiagramInput.g:573:1: rule__InputValue__Group__2 : rule__InputValue__Group__2__Impl ;
    public final void rule__InputValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:577:1: ( rule__InputValue__Group__2__Impl )
            // InternalActivityDiagramInput.g:578:2: rule__InputValue__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:584:1: rule__InputValue__Group__2__Impl : ( ( rule__InputValue__ValueAssignment_2 ) ) ;
    public final void rule__InputValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:588:1: ( ( ( rule__InputValue__ValueAssignment_2 ) ) )
            // InternalActivityDiagramInput.g:589:1: ( ( rule__InputValue__ValueAssignment_2 ) )
            {
            // InternalActivityDiagramInput.g:589:1: ( ( rule__InputValue__ValueAssignment_2 ) )
            // InternalActivityDiagramInput.g:590:1: ( rule__InputValue__ValueAssignment_2 )
            {
             before(grammarAccess.getInputValueAccess().getValueAssignment_2()); 
            // InternalActivityDiagramInput.g:591:1: ( rule__InputValue__ValueAssignment_2 )
            // InternalActivityDiagramInput.g:591:2: rule__InputValue__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:607:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:611:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalActivityDiagramInput.g:612:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:619:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:623:1: ( ( ( '-' )? ) )
            // InternalActivityDiagramInput.g:624:1: ( ( '-' )? )
            {
            // InternalActivityDiagramInput.g:624:1: ( ( '-' )? )
            // InternalActivityDiagramInput.g:625:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalActivityDiagramInput.g:626:1: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalActivityDiagramInput.g:627:2: '-'
                    {
                    match(input,15,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagramInput.g:638:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:642:1: ( rule__EInt__Group__1__Impl )
            // InternalActivityDiagramInput.g:643:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:649:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:653:1: ( ( RULE_INT ) )
            // InternalActivityDiagramInput.g:654:1: ( RULE_INT )
            {
            // InternalActivityDiagramInput.g:654:1: ( RULE_INT )
            // InternalActivityDiagramInput.g:655:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_2); 
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
    // InternalActivityDiagramInput.g:671:1: rule__Input__InputValuesAssignment_1 : ( ruleInputValue ) ;
    public final void rule__Input__InputValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:675:1: ( ( ruleInputValue ) )
            // InternalActivityDiagramInput.g:676:1: ( ruleInputValue )
            {
            // InternalActivityDiagramInput.g:676:1: ( ruleInputValue )
            // InternalActivityDiagramInput.g:677:1: ruleInputValue
            {
             before(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:686:1: rule__Input__InputValuesAssignment_2_1 : ( ruleInputValue ) ;
    public final void rule__Input__InputValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:690:1: ( ( ruleInputValue ) )
            // InternalActivityDiagramInput.g:691:1: ( ruleInputValue )
            {
            // InternalActivityDiagramInput.g:691:1: ( ruleInputValue )
            // InternalActivityDiagramInput.g:692:1: ruleInputValue
            {
             before(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:701:1: rule__InputValue__VariableAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__InputValue__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:705:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramInput.g:706:1: ( ( ruleEString ) )
            {
            // InternalActivityDiagramInput.g:706:1: ( ( ruleEString ) )
            // InternalActivityDiagramInput.g:707:1: ( ruleEString )
            {
             before(grammarAccess.getInputValueAccess().getVariableVariableCrossReference_0_0()); 
            // InternalActivityDiagramInput.g:708:1: ( ruleEString )
            // InternalActivityDiagramInput.g:709:1: ruleEString
            {
             before(grammarAccess.getInputValueAccess().getVariableVariableEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:720:1: rule__InputValue__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__InputValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:724:1: ( ( ruleValue ) )
            // InternalActivityDiagramInput.g:725:1: ( ruleValue )
            {
            // InternalActivityDiagramInput.g:725:1: ( ruleValue )
            // InternalActivityDiagramInput.g:726:1: ruleValue
            {
             before(grammarAccess.getInputValueAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:735:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:739:1: ( ( ruleEBoolean ) )
            // InternalActivityDiagramInput.g:740:1: ( ruleEBoolean )
            {
            // InternalActivityDiagramInput.g:740:1: ( ruleEBoolean )
            // InternalActivityDiagramInput.g:741:1: ruleEBoolean
            {
             before(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalActivityDiagramInput.g:750:1: rule__IntegerValue__ValueAssignment : ( ruleEInt ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivityDiagramInput.g:754:1: ( ( ruleEInt ) )
            // InternalActivityDiagramInput.g:755:1: ( ruleEInt )
            {
            // InternalActivityDiagramInput.g:755:1: ( ruleEInt )
            // InternalActivityDiagramInput.g:756:1: ruleEInt
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009840L});
    }


}