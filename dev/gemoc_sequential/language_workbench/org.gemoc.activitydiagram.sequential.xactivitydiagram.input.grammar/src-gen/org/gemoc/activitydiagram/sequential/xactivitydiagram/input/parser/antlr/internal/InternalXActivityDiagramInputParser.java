package org.gemoc.activitydiagram.sequential.xactivitydiagram.input.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.input.services.XActivityDiagramInputGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXActivityDiagramInputParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'='", "'true'", "'false'", "'-'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=4;
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

        public InternalXActivityDiagramInputParser(TokenStream input, XActivityDiagramInputGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Input";
       	}

       	@Override
       	protected XActivityDiagramInputGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInput"
    // InternalXActivityDiagramInput.g:64:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalXActivityDiagramInput.g:64:46: (iv_ruleInput= ruleInput EOF )
            // InternalXActivityDiagramInput.g:65:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalXActivityDiagramInput.g:71:1: ruleInput returns [EObject current=null] : ( () ( (lv_inputValues_1_0= ruleInputValue ) ) (otherlv_2= ',' ( (lv_inputValues_3_0= ruleInputValue ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_inputValues_1_0 = null;

        EObject lv_inputValues_3_0 = null;



        	enterRule();

        try {
            // InternalXActivityDiagramInput.g:77:2: ( ( () ( (lv_inputValues_1_0= ruleInputValue ) ) (otherlv_2= ',' ( (lv_inputValues_3_0= ruleInputValue ) ) )* ) )
            // InternalXActivityDiagramInput.g:78:2: ( () ( (lv_inputValues_1_0= ruleInputValue ) ) (otherlv_2= ',' ( (lv_inputValues_3_0= ruleInputValue ) ) )* )
            {
            // InternalXActivityDiagramInput.g:78:2: ( () ( (lv_inputValues_1_0= ruleInputValue ) ) (otherlv_2= ',' ( (lv_inputValues_3_0= ruleInputValue ) ) )* )
            // InternalXActivityDiagramInput.g:79:3: () ( (lv_inputValues_1_0= ruleInputValue ) ) (otherlv_2= ',' ( (lv_inputValues_3_0= ruleInputValue ) ) )*
            {
            // InternalXActivityDiagramInput.g:79:3: ()
            // InternalXActivityDiagramInput.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_0(),
            					current);
            			

            }

            // InternalXActivityDiagramInput.g:86:3: ( (lv_inputValues_1_0= ruleInputValue ) )
            // InternalXActivityDiagramInput.g:87:4: (lv_inputValues_1_0= ruleInputValue )
            {
            // InternalXActivityDiagramInput.g:87:4: (lv_inputValues_1_0= ruleInputValue )
            // InternalXActivityDiagramInput.g:88:5: lv_inputValues_1_0= ruleInputValue
            {

            					newCompositeNode(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_inputValues_1_0=ruleInputValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputRule());
            					}
            					add(
            						current,
            						"inputValues",
            						lv_inputValues_1_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.input.XActivityDiagramInput.InputValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXActivityDiagramInput.g:105:3: (otherlv_2= ',' ( (lv_inputValues_3_0= ruleInputValue ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXActivityDiagramInput.g:106:4: otherlv_2= ',' ( (lv_inputValues_3_0= ruleInputValue ) )
            	    {
            	    otherlv_2=(Token)match(input,11,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInputAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalXActivityDiagramInput.g:110:4: ( (lv_inputValues_3_0= ruleInputValue ) )
            	    // InternalXActivityDiagramInput.g:111:5: (lv_inputValues_3_0= ruleInputValue )
            	    {
            	    // InternalXActivityDiagramInput.g:111:5: (lv_inputValues_3_0= ruleInputValue )
            	    // InternalXActivityDiagramInput.g:112:6: lv_inputValues_3_0= ruleInputValue
            	    {

            	    						newCompositeNode(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_inputValues_3_0=ruleInputValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputValues",
            	    							lv_inputValues_3_0,
            	    							"org.gemoc.activitydiagram.sequential.xactivitydiagram.input.XActivityDiagramInput.InputValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleInputValue"
    // InternalXActivityDiagramInput.g:134:1: entryRuleInputValue returns [EObject current=null] : iv_ruleInputValue= ruleInputValue EOF ;
    public final EObject entryRuleInputValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputValue = null;


        try {
            // InternalXActivityDiagramInput.g:134:51: (iv_ruleInputValue= ruleInputValue EOF )
            // InternalXActivityDiagramInput.g:135:2: iv_ruleInputValue= ruleInputValue EOF
            {
             newCompositeNode(grammarAccess.getInputValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputValue=ruleInputValue();

            state._fsp--;

             current =iv_ruleInputValue; 
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
    // $ANTLR end "entryRuleInputValue"


    // $ANTLR start "ruleInputValue"
    // InternalXActivityDiagramInput.g:141:1: ruleInputValue returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleInputValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXActivityDiagramInput.g:147:2: ( ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalXActivityDiagramInput.g:148:2: ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalXActivityDiagramInput.g:148:2: ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // InternalXActivityDiagramInput.g:149:3: ( ( ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalXActivityDiagramInput.g:149:3: ( ( ruleEString ) )
            // InternalXActivityDiagramInput.g:150:4: ( ruleEString )
            {
            // InternalXActivityDiagramInput.g:150:4: ( ruleEString )
            // InternalXActivityDiagramInput.g:151:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputValueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInputValueAccess().getVariableVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_5);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getInputValueAccess().getEqualsSignKeyword_1());
            		
            // InternalXActivityDiagramInput.g:169:3: ( (lv_value_2_0= ruleValue ) )
            // InternalXActivityDiagramInput.g:170:4: (lv_value_2_0= ruleValue )
            {
            // InternalXActivityDiagramInput.g:170:4: (lv_value_2_0= ruleValue )
            // InternalXActivityDiagramInput.g:171:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getInputValueAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.input.XActivityDiagramInput.Value");
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
    // $ANTLR end "ruleInputValue"


    // $ANTLR start "entryRuleValue"
    // InternalXActivityDiagramInput.g:192:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalXActivityDiagramInput.g:192:46: (iv_ruleValue= ruleValue EOF )
            // InternalXActivityDiagramInput.g:193:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalXActivityDiagramInput.g:199:1: ruleValue returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_IntegerValue_1 = null;



        	enterRule();

        try {
            // InternalXActivityDiagramInput.g:205:2: ( (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue ) )
            // InternalXActivityDiagramInput.g:206:2: (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue )
            {
            // InternalXActivityDiagramInput.g:206:2: (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=14)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT||LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXActivityDiagramInput.g:207:3: this_BooleanValue_0= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_0=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXActivityDiagramInput.g:216:3: this_IntegerValue_1= ruleIntegerValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerValue_1=ruleIntegerValue();

                    state._fsp--;


                    			current = this_IntegerValue_1;
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalXActivityDiagramInput.g:228:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalXActivityDiagramInput.g:228:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalXActivityDiagramInput.g:229:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalXActivityDiagramInput.g:235:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalXActivityDiagramInput.g:241:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalXActivityDiagramInput.g:242:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalXActivityDiagramInput.g:242:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalXActivityDiagramInput.g:243:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalXActivityDiagramInput.g:243:3: (lv_value_0_0= ruleEBoolean )
            // InternalXActivityDiagramInput.g:244:4: lv_value_0_0= ruleEBoolean
            {

            				newCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.gemoc.activitydiagram.sequential.xactivitydiagram.input.XActivityDiagramInput.EBoolean");
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalXActivityDiagramInput.g:264:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalXActivityDiagramInput.g:264:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalXActivityDiagramInput.g:265:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
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
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalXActivityDiagramInput.g:271:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalXActivityDiagramInput.g:277:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalXActivityDiagramInput.g:278:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalXActivityDiagramInput.g:278:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalXActivityDiagramInput.g:279:3: (lv_value_0_0= ruleEInt )
            {
            // InternalXActivityDiagramInput.g:279:3: (lv_value_0_0= ruleEInt )
            // InternalXActivityDiagramInput.g:280:4: lv_value_0_0= ruleEInt
            {

            				newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.gemoc.activitydiagram.sequential.xactivitydiagram.input.XActivityDiagramInput.EInt");
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
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleEBoolean"
    // InternalXActivityDiagramInput.g:300:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalXActivityDiagramInput.g:300:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalXActivityDiagramInput.g:301:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalXActivityDiagramInput.g:307:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXActivityDiagramInput.g:313:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalXActivityDiagramInput.g:314:2: (kw= 'true' | kw= 'false' )
            {
            // InternalXActivityDiagramInput.g:314:2: (kw= 'true' | kw= 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
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
                    // InternalXActivityDiagramInput.g:315:3: kw= 'true'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXActivityDiagramInput.g:321:3: kw= 'false'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalXActivityDiagramInput.g:330:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalXActivityDiagramInput.g:330:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalXActivityDiagramInput.g:331:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalXActivityDiagramInput.g:337:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalXActivityDiagramInput.g:343:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalXActivityDiagramInput.g:344:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalXActivityDiagramInput.g:344:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalXActivityDiagramInput.g:345:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalXActivityDiagramInput.g:345:3: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXActivityDiagramInput.g:346:4: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalXActivityDiagramInput.g:363:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalXActivityDiagramInput.g:363:47: (iv_ruleEString= ruleEString EOF )
            // InternalXActivityDiagramInput.g:364:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalXActivityDiagramInput.g:370:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalXActivityDiagramInput.g:376:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalXActivityDiagramInput.g:377:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalXActivityDiagramInput.g:377:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXActivityDiagramInput.g:378:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXActivityDiagramInput.g:386:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});

}