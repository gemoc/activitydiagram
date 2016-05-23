package org.modelexecution.operationalsemantics.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.modelexecution.operationalsemantics.services.ActivityDiagramGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivityDiagramParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'activity'", "'('", "','", "')'", "'{'", "'nodes'", "'}'", "'edges'", "'action'", "'comp'", "'in'", "'out'", "'initial'", "'final'", "'fork'", "'join'", "'merge'", "'decision'", "'='", "'int'", "'bool'", "'true'", "'false'", "'-'", "'flow'", "'from'", "'to'", "'['", "']'", "'+'", "'<'", "'<='", "'=='", "'>='", "'>'", "'!'", "'&'", "'|'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalActivityDiagramParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivityDiagramParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivityDiagramParser.tokenNames; }
    public String getGrammarFileName() { return "InternalActivityDiagram.g"; }



     	private ActivityDiagramGrammarAccess grammarAccess;
     	
        public InternalActivityDiagramParser(TokenStream input, ActivityDiagramGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Activity";	
       	}
       	
       	@Override
       	protected ActivityDiagramGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleActivity"
    // InternalActivityDiagram.g:68:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalActivityDiagram.g:69:2: (iv_ruleActivity= ruleActivity EOF )
            // InternalActivityDiagram.g:70:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalActivityDiagram.g:77:1: ruleActivity returns [EObject current=null] : ( () otherlv_1= 'activity' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_inputs_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( ( (lv_locals_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )* )? (otherlv_12= 'nodes' otherlv_13= '{' ( (lv_nodes_14_0= ruleActivityNode ) ) (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )* otherlv_17= '}' )? (otherlv_18= 'edges' otherlv_19= '{' ( (lv_edges_20_0= ruleActivityEdge ) ) (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_inputs_4_0 = null;

        EObject lv_inputs_6_0 = null;

        EObject lv_locals_9_0 = null;

        EObject lv_locals_11_0 = null;

        EObject lv_nodes_14_0 = null;

        EObject lv_nodes_16_0 = null;

        EObject lv_edges_20_0 = null;

        EObject lv_edges_22_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:80:28: ( ( () otherlv_1= 'activity' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_inputs_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( ( (lv_locals_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )* )? (otherlv_12= 'nodes' otherlv_13= '{' ( (lv_nodes_14_0= ruleActivityNode ) ) (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )* otherlv_17= '}' )? (otherlv_18= 'edges' otherlv_19= '{' ( (lv_edges_20_0= ruleActivityEdge ) ) (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalActivityDiagram.g:81:1: ( () otherlv_1= 'activity' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_inputs_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( ( (lv_locals_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )* )? (otherlv_12= 'nodes' otherlv_13= '{' ( (lv_nodes_14_0= ruleActivityNode ) ) (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )* otherlv_17= '}' )? (otherlv_18= 'edges' otherlv_19= '{' ( (lv_edges_20_0= ruleActivityEdge ) ) (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalActivityDiagram.g:81:1: ( () otherlv_1= 'activity' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_inputs_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( ( (lv_locals_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )* )? (otherlv_12= 'nodes' otherlv_13= '{' ( (lv_nodes_14_0= ruleActivityNode ) ) (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )* otherlv_17= '}' )? (otherlv_18= 'edges' otherlv_19= '{' ( (lv_edges_20_0= ruleActivityEdge ) ) (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalActivityDiagram.g:81:2: () otherlv_1= 'activity' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_inputs_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( ( (lv_locals_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )* )? (otherlv_12= 'nodes' otherlv_13= '{' ( (lv_nodes_14_0= ruleActivityNode ) ) (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )* otherlv_17= '}' )? (otherlv_18= 'edges' otherlv_19= '{' ( (lv_edges_20_0= ruleActivityEdge ) ) (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalActivityDiagram.g:81:2: ()
            // InternalActivityDiagram.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActivityAccess().getActivityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
                
            // InternalActivityDiagram.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:92:1: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:92:1: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivityDiagram.g:109:2: (otherlv_3= '(' ( (lv_inputs_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )* otherlv_7= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalActivityDiagram.g:109:4: otherlv_3= '(' ( (lv_inputs_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getLeftParenthesisKeyword_3_0());
                        
                    // InternalActivityDiagram.g:113:1: ( (lv_inputs_4_0= ruleVariable ) )
                    // InternalActivityDiagram.g:114:1: (lv_inputs_4_0= ruleVariable )
                    {
                    // InternalActivityDiagram.g:114:1: (lv_inputs_4_0= ruleVariable )
                    // InternalActivityDiagram.g:115:3: lv_inputs_4_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getInputsVariableParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_inputs_4_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"inputs",
                            		lv_inputs_4_0, 
                            		"org.modelexecution.operationalsemantics.ActivityDiagram.Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalActivityDiagram.g:131:2: (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:131:4: otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_5); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // InternalActivityDiagram.g:135:1: ( (lv_inputs_6_0= ruleVariable ) )
                    	    // InternalActivityDiagram.g:136:1: (lv_inputs_6_0= ruleVariable )
                    	    {
                    	    // InternalActivityDiagram.g:136:1: (lv_inputs_6_0= ruleVariable )
                    	    // InternalActivityDiagram.g:137:3: lv_inputs_6_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getInputsVariableParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_inputs_6_0=ruleVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"inputs",
                    	            		lv_inputs_6_0, 
                    	            		"org.modelexecution.operationalsemantics.ActivityDiagram.Variable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_8); 

                	newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalActivityDiagram.g:161:1: ( ( (lv_locals_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=30 && LA4_0<=31)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalActivityDiagram.g:161:2: ( (lv_locals_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )*
                    {
                    // InternalActivityDiagram.g:161:2: ( (lv_locals_9_0= ruleVariable ) )
                    // InternalActivityDiagram.g:162:1: (lv_locals_9_0= ruleVariable )
                    {
                    // InternalActivityDiagram.g:162:1: (lv_locals_9_0= ruleVariable )
                    // InternalActivityDiagram.g:163:3: lv_locals_9_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getLocalsVariableParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_locals_9_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"locals",
                            		lv_locals_9_0, 
                            		"org.modelexecution.operationalsemantics.ActivityDiagram.Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalActivityDiagram.g:179:2: (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:179:4: otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_5); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // InternalActivityDiagram.g:183:1: ( (lv_locals_11_0= ruleVariable ) )
                    	    // InternalActivityDiagram.g:184:1: (lv_locals_11_0= ruleVariable )
                    	    {
                    	    // InternalActivityDiagram.g:184:1: (lv_locals_11_0= ruleVariable )
                    	    // InternalActivityDiagram.g:185:3: lv_locals_11_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getLocalsVariableParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_9);
                    	    lv_locals_11_0=ruleVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"locals",
                    	            		lv_locals_11_0, 
                    	            		"org.modelexecution.operationalsemantics.ActivityDiagram.Variable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalActivityDiagram.g:201:6: (otherlv_12= 'nodes' otherlv_13= '{' ( (lv_nodes_14_0= ruleActivityNode ) ) (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )* otherlv_17= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalActivityDiagram.g:201:8: otherlv_12= 'nodes' otherlv_13= '{' ( (lv_nodes_14_0= ruleActivityNode ) ) (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getNodesKeyword_6_0());
                        
                    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_10); 

                        	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // InternalActivityDiagram.g:209:1: ( (lv_nodes_14_0= ruleActivityNode ) )
                    // InternalActivityDiagram.g:210:1: (lv_nodes_14_0= ruleActivityNode )
                    {
                    // InternalActivityDiagram.g:210:1: (lv_nodes_14_0= ruleActivityNode )
                    // InternalActivityDiagram.g:211:3: lv_nodes_14_0= ruleActivityNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getNodesActivityNodeParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_nodes_14_0=ruleActivityNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"nodes",
                            		lv_nodes_14_0, 
                            		"org.modelexecution.operationalsemantics.ActivityDiagram.ActivityNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalActivityDiagram.g:227:2: (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:227:4: otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_10); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // InternalActivityDiagram.g:231:1: ( (lv_nodes_16_0= ruleActivityNode ) )
                    	    // InternalActivityDiagram.g:232:1: (lv_nodes_16_0= ruleActivityNode )
                    	    {
                    	    // InternalActivityDiagram.g:232:1: (lv_nodes_16_0= ruleActivityNode )
                    	    // InternalActivityDiagram.g:233:3: lv_nodes_16_0= ruleActivityNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getNodesActivityNodeParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_11);
                    	    lv_nodes_16_0=ruleActivityNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodes",
                    	            		lv_nodes_16_0, 
                    	            		"org.modelexecution.operationalsemantics.ActivityDiagram.ActivityNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_12); 

                        	newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // InternalActivityDiagram.g:253:3: (otherlv_18= 'edges' otherlv_19= '{' ( (lv_edges_20_0= ruleActivityEdge ) ) (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )* otherlv_23= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalActivityDiagram.g:253:5: otherlv_18= 'edges' otherlv_19= '{' ( (lv_edges_20_0= ruleActivityEdge ) ) (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getEdgesKeyword_7_0());
                        
                    otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_13); 

                        	newLeafNode(otherlv_19, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // InternalActivityDiagram.g:261:1: ( (lv_edges_20_0= ruleActivityEdge ) )
                    // InternalActivityDiagram.g:262:1: (lv_edges_20_0= ruleActivityEdge )
                    {
                    // InternalActivityDiagram.g:262:1: (lv_edges_20_0= ruleActivityEdge )
                    // InternalActivityDiagram.g:263:3: lv_edges_20_0= ruleActivityEdge
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getEdgesActivityEdgeParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_edges_20_0=ruleActivityEdge();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"edges",
                            		lv_edges_20_0, 
                            		"org.modelexecution.operationalsemantics.ActivityDiagram.ActivityEdge");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalActivityDiagram.g:279:2: (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:279:4: otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) )
                    	    {
                    	    otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_13); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getActivityAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // InternalActivityDiagram.g:283:1: ( (lv_edges_22_0= ruleActivityEdge ) )
                    	    // InternalActivityDiagram.g:284:1: (lv_edges_22_0= ruleActivityEdge )
                    	    {
                    	    // InternalActivityDiagram.g:284:1: (lv_edges_22_0= ruleActivityEdge )
                    	    // InternalActivityDiagram.g:285:3: lv_edges_22_0= ruleActivityEdge
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getEdgesActivityEdgeParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_11);
                    	    lv_edges_22_0=ruleActivityEdge();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"edges",
                    	            		lv_edges_22_0, 
                    	            		"org.modelexecution.operationalsemantics.ActivityDiagram.ActivityEdge");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_14); 

                        	newLeafNode(otherlv_23, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,17,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_24, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleActivityNode"
    // InternalActivityDiagram.g:317:1: entryRuleActivityNode returns [EObject current=null] : iv_ruleActivityNode= ruleActivityNode EOF ;
    public final EObject entryRuleActivityNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityNode = null;


        try {
            // InternalActivityDiagram.g:318:2: (iv_ruleActivityNode= ruleActivityNode EOF )
            // InternalActivityDiagram.g:319:2: iv_ruleActivityNode= ruleActivityNode EOF
            {
             newCompositeNode(grammarAccess.getActivityNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActivityNode=ruleActivityNode();

            state._fsp--;

             current =iv_ruleActivityNode; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleActivityNode"


    // $ANTLR start "ruleActivityNode"
    // InternalActivityDiagram.g:326:1: ruleActivityNode returns [EObject current=null] : (this_OpaqueAction_0= ruleOpaqueAction | this_InitialNode_1= ruleInitialNode | this_ActivityFinalNode_2= ruleActivityFinalNode | this_ForkNode_3= ruleForkNode | this_JoinNode_4= ruleJoinNode | this_MergeNode_5= ruleMergeNode | this_DecisionNode_6= ruleDecisionNode ) ;
    public final EObject ruleActivityNode() throws RecognitionException {
        EObject current = null;

        EObject this_OpaqueAction_0 = null;

        EObject this_InitialNode_1 = null;

        EObject this_ActivityFinalNode_2 = null;

        EObject this_ForkNode_3 = null;

        EObject this_JoinNode_4 = null;

        EObject this_MergeNode_5 = null;

        EObject this_DecisionNode_6 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:329:28: ( (this_OpaqueAction_0= ruleOpaqueAction | this_InitialNode_1= ruleInitialNode | this_ActivityFinalNode_2= ruleActivityFinalNode | this_ForkNode_3= ruleForkNode | this_JoinNode_4= ruleJoinNode | this_MergeNode_5= ruleMergeNode | this_DecisionNode_6= ruleDecisionNode ) )
            // InternalActivityDiagram.g:330:1: (this_OpaqueAction_0= ruleOpaqueAction | this_InitialNode_1= ruleInitialNode | this_ActivityFinalNode_2= ruleActivityFinalNode | this_ForkNode_3= ruleForkNode | this_JoinNode_4= ruleJoinNode | this_MergeNode_5= ruleMergeNode | this_DecisionNode_6= ruleDecisionNode )
            {
            // InternalActivityDiagram.g:330:1: (this_OpaqueAction_0= ruleOpaqueAction | this_InitialNode_1= ruleInitialNode | this_ActivityFinalNode_2= ruleActivityFinalNode | this_ForkNode_3= ruleForkNode | this_JoinNode_4= ruleJoinNode | this_MergeNode_5= ruleMergeNode | this_DecisionNode_6= ruleDecisionNode )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            case 26:
                {
                alt9=5;
                }
                break;
            case 27:
                {
                alt9=6;
                }
                break;
            case 28:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalActivityDiagram.g:331:5: this_OpaqueAction_0= ruleOpaqueAction
                    {
                     
                            newCompositeNode(grammarAccess.getActivityNodeAccess().getOpaqueActionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_OpaqueAction_0=ruleOpaqueAction();

                    state._fsp--;

                     
                            current = this_OpaqueAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:341:5: this_InitialNode_1= ruleInitialNode
                    {
                     
                            newCompositeNode(grammarAccess.getActivityNodeAccess().getInitialNodeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InitialNode_1=ruleInitialNode();

                    state._fsp--;

                     
                            current = this_InitialNode_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalActivityDiagram.g:351:5: this_ActivityFinalNode_2= ruleActivityFinalNode
                    {
                     
                            newCompositeNode(grammarAccess.getActivityNodeAccess().getActivityFinalNodeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ActivityFinalNode_2=ruleActivityFinalNode();

                    state._fsp--;

                     
                            current = this_ActivityFinalNode_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalActivityDiagram.g:361:5: this_ForkNode_3= ruleForkNode
                    {
                     
                            newCompositeNode(grammarAccess.getActivityNodeAccess().getForkNodeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ForkNode_3=ruleForkNode();

                    state._fsp--;

                     
                            current = this_ForkNode_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalActivityDiagram.g:371:5: this_JoinNode_4= ruleJoinNode
                    {
                     
                            newCompositeNode(grammarAccess.getActivityNodeAccess().getJoinNodeParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_JoinNode_4=ruleJoinNode();

                    state._fsp--;

                     
                            current = this_JoinNode_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalActivityDiagram.g:381:5: this_MergeNode_5= ruleMergeNode
                    {
                     
                            newCompositeNode(grammarAccess.getActivityNodeAccess().getMergeNodeParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MergeNode_5=ruleMergeNode();

                    state._fsp--;

                     
                            current = this_MergeNode_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalActivityDiagram.g:391:5: this_DecisionNode_6= ruleDecisionNode
                    {
                     
                            newCompositeNode(grammarAccess.getActivityNodeAccess().getDecisionNodeParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DecisionNode_6=ruleDecisionNode();

                    state._fsp--;

                     
                            current = this_DecisionNode_6; 
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
    // $ANTLR end "ruleActivityNode"


    // $ANTLR start "entryRuleActivityEdge"
    // InternalActivityDiagram.g:407:1: entryRuleActivityEdge returns [EObject current=null] : iv_ruleActivityEdge= ruleActivityEdge EOF ;
    public final EObject entryRuleActivityEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityEdge = null;


        try {
            // InternalActivityDiagram.g:408:2: (iv_ruleActivityEdge= ruleActivityEdge EOF )
            // InternalActivityDiagram.g:409:2: iv_ruleActivityEdge= ruleActivityEdge EOF
            {
             newCompositeNode(grammarAccess.getActivityEdgeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActivityEdge=ruleActivityEdge();

            state._fsp--;

             current =iv_ruleActivityEdge; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleActivityEdge"


    // $ANTLR start "ruleActivityEdge"
    // InternalActivityDiagram.g:416:1: ruleActivityEdge returns [EObject current=null] : this_ControlFlow_0= ruleControlFlow ;
    public final EObject ruleActivityEdge() throws RecognitionException {
        EObject current = null;

        EObject this_ControlFlow_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:419:28: (this_ControlFlow_0= ruleControlFlow )
            // InternalActivityDiagram.g:421:5: this_ControlFlow_0= ruleControlFlow
            {
             
                    newCompositeNode(grammarAccess.getActivityEdgeAccess().getControlFlowParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_ControlFlow_0=ruleControlFlow();

            state._fsp--;

             
                    current = this_ControlFlow_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleActivityEdge"


    // $ANTLR start "entryRuleVariable"
    // InternalActivityDiagram.g:437:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalActivityDiagram.g:438:2: (iv_ruleVariable= ruleVariable EOF )
            // InternalActivityDiagram.g:439:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagram.g:446:1: ruleVariable returns [EObject current=null] : (this_IntegerVariable_0= ruleIntegerVariable | this_BooleanVariable_1= ruleBooleanVariable ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerVariable_0 = null;

        EObject this_BooleanVariable_1 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:449:28: ( (this_IntegerVariable_0= ruleIntegerVariable | this_BooleanVariable_1= ruleBooleanVariable ) )
            // InternalActivityDiagram.g:450:1: (this_IntegerVariable_0= ruleIntegerVariable | this_BooleanVariable_1= ruleBooleanVariable )
            {
            // InternalActivityDiagram.g:450:1: (this_IntegerVariable_0= ruleIntegerVariable | this_BooleanVariable_1= ruleBooleanVariable )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( (LA10_0==31) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalActivityDiagram.g:451:5: this_IntegerVariable_0= ruleIntegerVariable
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerVariable_0=ruleIntegerVariable();

                    state._fsp--;

                     
                            current = this_IntegerVariable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:461:5: this_BooleanVariable_1= ruleBooleanVariable
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanVariable_1=ruleBooleanVariable();

                    state._fsp--;

                     
                            current = this_BooleanVariable_1; 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // InternalActivityDiagram.g:477:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalActivityDiagram.g:478:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalActivityDiagram.g:479:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalActivityDiagram.g:486:1: ruleExpression returns [EObject current=null] : (this_IntegerCalculationExpression_0= ruleIntegerCalculationExpression | this_IntegerComparisonExpression_1= ruleIntegerComparisonExpression | this_BooleanUnaryExpression_2= ruleBooleanUnaryExpression | this_BooleanBinaryExpression_3= ruleBooleanBinaryExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerCalculationExpression_0 = null;

        EObject this_IntegerComparisonExpression_1 = null;

        EObject this_BooleanUnaryExpression_2 = null;

        EObject this_BooleanBinaryExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:489:28: ( (this_IntegerCalculationExpression_0= ruleIntegerCalculationExpression | this_IntegerComparisonExpression_1= ruleIntegerComparisonExpression | this_BooleanUnaryExpression_2= ruleBooleanUnaryExpression | this_BooleanBinaryExpression_3= ruleBooleanBinaryExpression ) )
            // InternalActivityDiagram.g:490:1: (this_IntegerCalculationExpression_0= ruleIntegerCalculationExpression | this_IntegerComparisonExpression_1= ruleIntegerComparisonExpression | this_BooleanUnaryExpression_2= ruleBooleanUnaryExpression | this_BooleanBinaryExpression_3= ruleBooleanBinaryExpression )
            {
            // InternalActivityDiagram.g:490:1: (this_IntegerCalculationExpression_0= ruleIntegerCalculationExpression | this_IntegerComparisonExpression_1= ruleIntegerComparisonExpression | this_BooleanUnaryExpression_2= ruleBooleanUnaryExpression | this_BooleanBinaryExpression_3= ruleBooleanBinaryExpression )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==29) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case 34:
                        case 40:
                            {
                            alt11=1;
                            }
                            break;
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                            {
                            alt11=2;
                            }
                            break;
                        case 47:
                        case 48:
                            {
                            alt11=4;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 3, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA11_2==46) ) {
                        alt11=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalActivityDiagram.g:491:5: this_IntegerCalculationExpression_0= ruleIntegerCalculationExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getIntegerCalculationExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerCalculationExpression_0=ruleIntegerCalculationExpression();

                    state._fsp--;

                     
                            current = this_IntegerCalculationExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:501:5: this_IntegerComparisonExpression_1= ruleIntegerComparisonExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getIntegerComparisonExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerComparisonExpression_1=ruleIntegerComparisonExpression();

                    state._fsp--;

                     
                            current = this_IntegerComparisonExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalActivityDiagram.g:511:5: this_BooleanUnaryExpression_2= ruleBooleanUnaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getBooleanUnaryExpressionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanUnaryExpression_2=ruleBooleanUnaryExpression();

                    state._fsp--;

                     
                            current = this_BooleanUnaryExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalActivityDiagram.g:521:5: this_BooleanBinaryExpression_3= ruleBooleanBinaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getBooleanBinaryExpressionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanBinaryExpression_3=ruleBooleanBinaryExpression();

                    state._fsp--;

                     
                            current = this_BooleanBinaryExpression_3; 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleValue"
    // InternalActivityDiagram.g:537:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalActivityDiagram.g:538:2: (iv_ruleValue= ruleValue EOF )
            // InternalActivityDiagram.g:539:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagram.g:546:1: ruleValue returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_IntegerValue_1 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:549:28: ( (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue ) )
            // InternalActivityDiagram.g:550:1: (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue )
            {
            // InternalActivityDiagram.g:550:1: (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=32 && LA12_0<=33)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT||LA12_0==34) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalActivityDiagram.g:551:5: this_BooleanValue_0= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanValue_0=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:561:5: this_IntegerValue_1= ruleIntegerValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "entryRuleEString"
    // InternalActivityDiagram.g:577:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalActivityDiagram.g:578:2: (iv_ruleEString= ruleEString EOF )
            // InternalActivityDiagram.g:579:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagram.g:586:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:589:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalActivityDiagram.g:590:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalActivityDiagram.g:590:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalActivityDiagram.g:590:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:598:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

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


    // $ANTLR start "entryRuleOpaqueAction"
    // InternalActivityDiagram.g:613:1: entryRuleOpaqueAction returns [EObject current=null] : iv_ruleOpaqueAction= ruleOpaqueAction EOF ;
    public final EObject entryRuleOpaqueAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpaqueAction = null;


        try {
            // InternalActivityDiagram.g:614:2: (iv_ruleOpaqueAction= ruleOpaqueAction EOF )
            // InternalActivityDiagram.g:615:2: iv_ruleOpaqueAction= ruleOpaqueAction EOF
            {
             newCompositeNode(grammarAccess.getOpaqueActionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOpaqueAction=ruleOpaqueAction();

            state._fsp--;

             current =iv_ruleOpaqueAction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleOpaqueAction"


    // $ANTLR start "ruleOpaqueAction"
    // InternalActivityDiagram.g:622:1: ruleOpaqueAction returns [EObject current=null] : ( () otherlv_1= 'action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'out' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )? ) ;
    public final EObject ruleOpaqueAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_expressions_5_0 = null;

        EObject lv_expressions_7_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:625:28: ( ( () otherlv_1= 'action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'out' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )? ) )
            // InternalActivityDiagram.g:626:1: ( () otherlv_1= 'action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'out' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )? )
            {
            // InternalActivityDiagram.g:626:1: ( () otherlv_1= 'action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'out' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )? )
            // InternalActivityDiagram.g:626:2: () otherlv_1= 'action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'out' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )?
            {
            // InternalActivityDiagram.g:626:2: ()
            // InternalActivityDiagram.g:627:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOpaqueActionAccess().getOpaqueActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getOpaqueActionAccess().getActionKeyword_1());
                
            // InternalActivityDiagram.g:636:1: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:637:1: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:637:1: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:638:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOpaqueActionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_15);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpaqueActionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivityDiagram.g:654:2: (otherlv_3= 'comp' otherlv_4= '{' ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) ) )* otherlv_8= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalActivityDiagram.g:654:4: otherlv_3= 'comp' otherlv_4= '{' ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_3, grammarAccess.getOpaqueActionAccess().getCompKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_16); 

                        	newLeafNode(otherlv_4, grammarAccess.getOpaqueActionAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // InternalActivityDiagram.g:662:1: ( (lv_expressions_5_0= ruleExpression ) )
                    // InternalActivityDiagram.g:663:1: (lv_expressions_5_0= ruleExpression )
                    {
                    // InternalActivityDiagram.g:663:1: (lv_expressions_5_0= ruleExpression )
                    // InternalActivityDiagram.g:664:3: lv_expressions_5_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpaqueActionAccess().getExpressionsExpressionParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_expressions_5_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpaqueActionRule());
                    	        }
                           		add(
                           			current, 
                           			"expressions",
                            		lv_expressions_5_0, 
                            		"org.modelexecution.operationalsemantics.ActivityDiagram.Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalActivityDiagram.g:680:2: (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==13) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:680:4: otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_16); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getOpaqueActionAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // InternalActivityDiagram.g:684:1: ( (lv_expressions_7_0= ruleExpression ) )
                    	    // InternalActivityDiagram.g:685:1: (lv_expressions_7_0= ruleExpression )
                    	    {
                    	    // InternalActivityDiagram.g:685:1: (lv_expressions_7_0= ruleExpression )
                    	    // InternalActivityDiagram.g:686:3: lv_expressions_7_0= ruleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOpaqueActionAccess().getExpressionsExpressionParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_11);
                    	    lv_expressions_7_0=ruleExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOpaqueActionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressions",
                    	            		lv_expressions_7_0, 
                    	            		"org.modelexecution.operationalsemantics.ActivityDiagram.Expression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17); 

                        	newLeafNode(otherlv_8, grammarAccess.getOpaqueActionAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // InternalActivityDiagram.g:706:3: (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalActivityDiagram.g:706:5: otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_18); 

                        	newLeafNode(otherlv_9, grammarAccess.getOpaqueActionAccess().getInKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_16); 

                        	newLeafNode(otherlv_10, grammarAccess.getOpaqueActionAccess().getLeftParenthesisKeyword_4_1());
                        
                    // InternalActivityDiagram.g:714:1: ( (otherlv_11= RULE_ID ) )
                    // InternalActivityDiagram.g:715:1: (otherlv_11= RULE_ID )
                    {
                    // InternalActivityDiagram.g:715:1: (otherlv_11= RULE_ID )
                    // InternalActivityDiagram.g:716:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOpaqueActionRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    		newLeafNode(otherlv_11, grammarAccess.getOpaqueActionAccess().getIncomingActivityEdgeCrossReference_4_2_0()); 
                    	

                    }


                    }

                    // InternalActivityDiagram.g:727:2: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==13) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:727:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_16); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getOpaqueActionAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // InternalActivityDiagram.g:731:1: ( (otherlv_13= RULE_ID ) )
                    	    // InternalActivityDiagram.g:732:1: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalActivityDiagram.g:732:1: (otherlv_13= RULE_ID )
                    	    // InternalActivityDiagram.g:733:3: otherlv_13= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getOpaqueActionRule());
                    	    	        }
                    	            
                    	    otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    	    		newLeafNode(otherlv_13, grammarAccess.getOpaqueActionAccess().getIncomingActivityEdgeCrossReference_4_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_19); 

                        	newLeafNode(otherlv_14, grammarAccess.getOpaqueActionAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // InternalActivityDiagram.g:748:3: (otherlv_15= 'out' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalActivityDiagram.g:748:5: otherlv_15= 'out' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_18); 

                        	newLeafNode(otherlv_15, grammarAccess.getOpaqueActionAccess().getOutKeyword_5_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_16); 

                        	newLeafNode(otherlv_16, grammarAccess.getOpaqueActionAccess().getLeftParenthesisKeyword_5_1());
                        
                    // InternalActivityDiagram.g:756:1: ( (otherlv_17= RULE_ID ) )
                    // InternalActivityDiagram.g:757:1: (otherlv_17= RULE_ID )
                    {
                    // InternalActivityDiagram.g:757:1: (otherlv_17= RULE_ID )
                    // InternalActivityDiagram.g:758:3: otherlv_17= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOpaqueActionRule());
                    	        }
                            
                    otherlv_17=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    		newLeafNode(otherlv_17, grammarAccess.getOpaqueActionAccess().getOutgoingActivityEdgeCrossReference_5_2_0()); 
                    	

                    }


                    }

                    // InternalActivityDiagram.g:769:2: (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==13) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:769:4: otherlv_18= ',' ( (otherlv_19= RULE_ID ) )
                    	    {
                    	    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_16); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getOpaqueActionAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // InternalActivityDiagram.g:773:1: ( (otherlv_19= RULE_ID ) )
                    	    // InternalActivityDiagram.g:774:1: (otherlv_19= RULE_ID )
                    	    {
                    	    // InternalActivityDiagram.g:774:1: (otherlv_19= RULE_ID )
                    	    // InternalActivityDiagram.g:775:3: otherlv_19= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getOpaqueActionRule());
                    	    	        }
                    	            
                    	    otherlv_19=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    	    		newLeafNode(otherlv_19, grammarAccess.getOpaqueActionAccess().getOutgoingActivityEdgeCrossReference_5_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_20, grammarAccess.getOpaqueActionAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

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
    // $ANTLR end "ruleOpaqueAction"


    // $ANTLR start "entryRuleInitialNode"
    // InternalActivityDiagram.g:798:1: entryRuleInitialNode returns [EObject current=null] : iv_ruleInitialNode= ruleInitialNode EOF ;
    public final EObject entryRuleInitialNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialNode = null;


        try {
            // InternalActivityDiagram.g:799:2: (iv_ruleInitialNode= ruleInitialNode EOF )
            // InternalActivityDiagram.g:800:2: iv_ruleInitialNode= ruleInitialNode EOF
            {
             newCompositeNode(grammarAccess.getInitialNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInitialNode=ruleInitialNode();

            state._fsp--;

             current =iv_ruleInitialNode; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleInitialNode"


    // $ANTLR start "ruleInitialNode"
    // InternalActivityDiagram.g:807:1: ruleInitialNode returns [EObject current=null] : ( () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) ) ;
    public final EObject ruleInitialNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:810:28: ( ( () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) ) )
            // InternalActivityDiagram.g:811:1: ( () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) )
            {
            // InternalActivityDiagram.g:811:1: ( () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) )
            // InternalActivityDiagram.g:811:2: () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )
            {
            // InternalActivityDiagram.g:811:2: ()
            // InternalActivityDiagram.g:812:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInitialNodeAccess().getInitialNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialNodeAccess().getInitialKeyword_1());
                
            // InternalActivityDiagram.g:821:1: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:822:1: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:822:1: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:823:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInitialNodeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_20);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInitialNodeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivityDiagram.g:839:2: (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )
            // InternalActivityDiagram.g:839:4: otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')'
            {
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_18); 

                	newLeafNode(otherlv_3, grammarAccess.getInitialNodeAccess().getOutKeyword_3_0());
                
            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_4, grammarAccess.getInitialNodeAccess().getLeftParenthesisKeyword_3_1());
                
            // InternalActivityDiagram.g:847:1: ( (otherlv_5= RULE_ID ) )
            // InternalActivityDiagram.g:848:1: (otherlv_5= RULE_ID )
            {
            // InternalActivityDiagram.g:848:1: (otherlv_5= RULE_ID )
            // InternalActivityDiagram.g:849:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInitialNodeRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            		newLeafNode(otherlv_5, grammarAccess.getInitialNodeAccess().getOutgoingActivityEdgeCrossReference_3_2_0()); 
            	

            }


            }

            // InternalActivityDiagram.g:860:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalActivityDiagram.g:860:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_16); 

            	        	newLeafNode(otherlv_6, grammarAccess.getInitialNodeAccess().getCommaKeyword_3_3_0());
            	        
            	    // InternalActivityDiagram.g:864:1: ( (otherlv_7= RULE_ID ) )
            	    // InternalActivityDiagram.g:865:1: (otherlv_7= RULE_ID )
            	    {
            	    // InternalActivityDiagram.g:865:1: (otherlv_7= RULE_ID )
            	    // InternalActivityDiagram.g:866:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInitialNodeRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            	    		newLeafNode(otherlv_7, grammarAccess.getInitialNodeAccess().getOutgoingActivityEdgeCrossReference_3_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getInitialNodeAccess().getRightParenthesisKeyword_3_4());
                

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
    // $ANTLR end "ruleInitialNode"


    // $ANTLR start "entryRuleActivityFinalNode"
    // InternalActivityDiagram.g:889:1: entryRuleActivityFinalNode returns [EObject current=null] : iv_ruleActivityFinalNode= ruleActivityFinalNode EOF ;
    public final EObject entryRuleActivityFinalNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityFinalNode = null;


        try {
            // InternalActivityDiagram.g:890:2: (iv_ruleActivityFinalNode= ruleActivityFinalNode EOF )
            // InternalActivityDiagram.g:891:2: iv_ruleActivityFinalNode= ruleActivityFinalNode EOF
            {
             newCompositeNode(grammarAccess.getActivityFinalNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActivityFinalNode=ruleActivityFinalNode();

            state._fsp--;

             current =iv_ruleActivityFinalNode; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleActivityFinalNode"


    // $ANTLR start "ruleActivityFinalNode"
    // InternalActivityDiagram.g:898:1: ruleActivityFinalNode returns [EObject current=null] : ( () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) ) ;
    public final EObject ruleActivityFinalNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:901:28: ( ( () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) ) )
            // InternalActivityDiagram.g:902:1: ( () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) )
            {
            // InternalActivityDiagram.g:902:1: ( () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) )
            // InternalActivityDiagram.g:902:2: () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )
            {
            // InternalActivityDiagram.g:902:2: ()
            // InternalActivityDiagram.g:903:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActivityFinalNodeAccess().getActivityFinalNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityFinalNodeAccess().getFinalKeyword_1());
                
            // InternalActivityDiagram.g:912:1: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:913:1: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:913:1: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:914:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActivityFinalNodeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityFinalNodeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivityDiagram.g:930:2: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )
            // InternalActivityDiagram.g:930:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')'
            {
            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_18); 

                	newLeafNode(otherlv_3, grammarAccess.getActivityFinalNodeAccess().getInKeyword_3_0());
                
            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_4, grammarAccess.getActivityFinalNodeAccess().getLeftParenthesisKeyword_3_1());
                
            // InternalActivityDiagram.g:938:1: ( (otherlv_5= RULE_ID ) )
            // InternalActivityDiagram.g:939:1: (otherlv_5= RULE_ID )
            {
            // InternalActivityDiagram.g:939:1: (otherlv_5= RULE_ID )
            // InternalActivityDiagram.g:940:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityFinalNodeRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            		newLeafNode(otherlv_5, grammarAccess.getActivityFinalNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0()); 
            	

            }


            }

            // InternalActivityDiagram.g:951:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==13) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalActivityDiagram.g:951:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_16); 

            	        	newLeafNode(otherlv_6, grammarAccess.getActivityFinalNodeAccess().getCommaKeyword_3_3_0());
            	        
            	    // InternalActivityDiagram.g:955:1: ( (otherlv_7= RULE_ID ) )
            	    // InternalActivityDiagram.g:956:1: (otherlv_7= RULE_ID )
            	    {
            	    // InternalActivityDiagram.g:956:1: (otherlv_7= RULE_ID )
            	    // InternalActivityDiagram.g:957:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActivityFinalNodeRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            	    		newLeafNode(otherlv_7, grammarAccess.getActivityFinalNodeAccess().getIncomingActivityEdgeCrossReference_3_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getActivityFinalNodeAccess().getRightParenthesisKeyword_3_4());
                

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
    // $ANTLR end "ruleActivityFinalNode"


    // $ANTLR start "entryRuleForkNode"
    // InternalActivityDiagram.g:980:1: entryRuleForkNode returns [EObject current=null] : iv_ruleForkNode= ruleForkNode EOF ;
    public final EObject entryRuleForkNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForkNode = null;


        try {
            // InternalActivityDiagram.g:981:2: (iv_ruleForkNode= ruleForkNode EOF )
            // InternalActivityDiagram.g:982:2: iv_ruleForkNode= ruleForkNode EOF
            {
             newCompositeNode(grammarAccess.getForkNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleForkNode=ruleForkNode();

            state._fsp--;

             current =iv_ruleForkNode; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleForkNode"


    // $ANTLR start "ruleForkNode"
    // InternalActivityDiagram.g:989:1: ruleForkNode returns [EObject current=null] : ( () otherlv_1= 'fork' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? ) ;
    public final EObject ruleForkNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:992:28: ( ( () otherlv_1= 'fork' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? ) )
            // InternalActivityDiagram.g:993:1: ( () otherlv_1= 'fork' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? )
            {
            // InternalActivityDiagram.g:993:1: ( () otherlv_1= 'fork' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? )
            // InternalActivityDiagram.g:993:2: () otherlv_1= 'fork' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
            {
            // InternalActivityDiagram.g:993:2: ()
            // InternalActivityDiagram.g:994:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getForkNodeAccess().getForkNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getForkNodeAccess().getForkKeyword_1());
                
            // InternalActivityDiagram.g:1003:1: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:1004:1: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:1004:1: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:1005:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getForkNodeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForkNodeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivityDiagram.g:1021:2: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            // InternalActivityDiagram.g:1021:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_18); 

                	newLeafNode(otherlv_3, grammarAccess.getForkNodeAccess().getInKeyword_3_0());
                
            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_4, grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_3_1());
                
            // InternalActivityDiagram.g:1029:1: ( (otherlv_5= RULE_ID ) )
            // InternalActivityDiagram.g:1030:1: (otherlv_5= RULE_ID )
            {
            // InternalActivityDiagram.g:1030:1: (otherlv_5= RULE_ID )
            // InternalActivityDiagram.g:1031:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getForkNodeRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

            		newLeafNode(otherlv_5, grammarAccess.getForkNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_19); 

                	newLeafNode(otherlv_6, grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_3_3());
                

            }

            // InternalActivityDiagram.g:1046:2: (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalActivityDiagram.g:1046:4: otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_18); 

                        	newLeafNode(otherlv_7, grammarAccess.getForkNodeAccess().getOutKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_16); 

                        	newLeafNode(otherlv_8, grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_4_1());
                        
                    // InternalActivityDiagram.g:1054:1: ( (otherlv_9= RULE_ID ) )
                    // InternalActivityDiagram.g:1055:1: (otherlv_9= RULE_ID )
                    {
                    // InternalActivityDiagram.g:1055:1: (otherlv_9= RULE_ID )
                    // InternalActivityDiagram.g:1056:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getForkNodeRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    		newLeafNode(otherlv_9, grammarAccess.getForkNodeAccess().getOutgoingActivityEdgeCrossReference_4_2_0()); 
                    	

                    }


                    }

                    // InternalActivityDiagram.g:1067:2: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==13) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:1067:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_16); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getForkNodeAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // InternalActivityDiagram.g:1071:1: ( (otherlv_11= RULE_ID ) )
                    	    // InternalActivityDiagram.g:1072:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalActivityDiagram.g:1072:1: (otherlv_11= RULE_ID )
                    	    // InternalActivityDiagram.g:1073:3: otherlv_11= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getForkNodeRule());
                    	    	        }
                    	            
                    	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    	    		newLeafNode(otherlv_11, grammarAccess.getForkNodeAccess().getOutgoingActivityEdgeCrossReference_4_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_12, grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

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
    // $ANTLR end "ruleForkNode"


    // $ANTLR start "entryRuleJoinNode"
    // InternalActivityDiagram.g:1096:1: entryRuleJoinNode returns [EObject current=null] : iv_ruleJoinNode= ruleJoinNode EOF ;
    public final EObject entryRuleJoinNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinNode = null;


        try {
            // InternalActivityDiagram.g:1097:2: (iv_ruleJoinNode= ruleJoinNode EOF )
            // InternalActivityDiagram.g:1098:2: iv_ruleJoinNode= ruleJoinNode EOF
            {
             newCompositeNode(grammarAccess.getJoinNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJoinNode=ruleJoinNode();

            state._fsp--;

             current =iv_ruleJoinNode; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleJoinNode"


    // $ANTLR start "ruleJoinNode"
    // InternalActivityDiagram.g:1105:1: ruleJoinNode returns [EObject current=null] : ( () otherlv_1= 'join' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleJoinNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:1108:28: ( ( () otherlv_1= 'join' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) ) )
            // InternalActivityDiagram.g:1109:1: ( () otherlv_1= 'join' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) )
            {
            // InternalActivityDiagram.g:1109:1: ( () otherlv_1= 'join' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) )
            // InternalActivityDiagram.g:1109:2: () otherlv_1= 'join' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )
            {
            // InternalActivityDiagram.g:1109:2: ()
            // InternalActivityDiagram.g:1110:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJoinNodeAccess().getJoinNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getJoinNodeAccess().getJoinKeyword_1());
                
            // InternalActivityDiagram.g:1119:1: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:1120:1: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:1120:1: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:1121:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getJoinNodeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_23);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinNodeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivityDiagram.g:1137:2: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalActivityDiagram.g:1137:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_18); 

                        	newLeafNode(otherlv_3, grammarAccess.getJoinNodeAccess().getInKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_16); 

                        	newLeafNode(otherlv_4, grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_3_1());
                        
                    // InternalActivityDiagram.g:1145:1: ( (otherlv_5= RULE_ID ) )
                    // InternalActivityDiagram.g:1146:1: (otherlv_5= RULE_ID )
                    {
                    // InternalActivityDiagram.g:1146:1: (otherlv_5= RULE_ID )
                    // InternalActivityDiagram.g:1147:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getJoinNodeRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    		newLeafNode(otherlv_5, grammarAccess.getJoinNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0()); 
                    	

                    }


                    }

                    // InternalActivityDiagram.g:1158:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==13) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:1158:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_16); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getJoinNodeAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // InternalActivityDiagram.g:1162:1: ( (otherlv_7= RULE_ID ) )
                    	    // InternalActivityDiagram.g:1163:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalActivityDiagram.g:1163:1: (otherlv_7= RULE_ID )
                    	    // InternalActivityDiagram.g:1164:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getJoinNodeRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getJoinNodeAccess().getIncomingActivityEdgeCrossReference_3_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_20); 

                        	newLeafNode(otherlv_8, grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_3_4());
                        

                    }
                    break;

            }

            // InternalActivityDiagram.g:1179:3: (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )
            // InternalActivityDiagram.g:1179:5: otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')'
            {
            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_18); 

                	newLeafNode(otherlv_9, grammarAccess.getJoinNodeAccess().getOutKeyword_4_0());
                
            otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_10, grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_4_1());
                
            // InternalActivityDiagram.g:1187:1: ( (otherlv_11= RULE_ID ) )
            // InternalActivityDiagram.g:1188:1: (otherlv_11= RULE_ID )
            {
            // InternalActivityDiagram.g:1188:1: (otherlv_11= RULE_ID )
            // InternalActivityDiagram.g:1189:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJoinNodeRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

            		newLeafNode(otherlv_11, grammarAccess.getJoinNodeAccess().getOutgoingActivityEdgeCrossReference_4_2_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_12, grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_4_3());
                

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
    // $ANTLR end "ruleJoinNode"


    // $ANTLR start "entryRuleMergeNode"
    // InternalActivityDiagram.g:1212:1: entryRuleMergeNode returns [EObject current=null] : iv_ruleMergeNode= ruleMergeNode EOF ;
    public final EObject entryRuleMergeNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeNode = null;


        try {
            // InternalActivityDiagram.g:1213:2: (iv_ruleMergeNode= ruleMergeNode EOF )
            // InternalActivityDiagram.g:1214:2: iv_ruleMergeNode= ruleMergeNode EOF
            {
             newCompositeNode(grammarAccess.getMergeNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMergeNode=ruleMergeNode();

            state._fsp--;

             current =iv_ruleMergeNode; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMergeNode"


    // $ANTLR start "ruleMergeNode"
    // InternalActivityDiagram.g:1221:1: ruleMergeNode returns [EObject current=null] : ( () otherlv_1= 'merge' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleMergeNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:1224:28: ( ( () otherlv_1= 'merge' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) ) )
            // InternalActivityDiagram.g:1225:1: ( () otherlv_1= 'merge' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) )
            {
            // InternalActivityDiagram.g:1225:1: ( () otherlv_1= 'merge' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) )
            // InternalActivityDiagram.g:1225:2: () otherlv_1= 'merge' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )
            {
            // InternalActivityDiagram.g:1225:2: ()
            // InternalActivityDiagram.g:1226:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMergeNodeAccess().getMergeNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getMergeNodeAccess().getMergeKeyword_1());
                
            // InternalActivityDiagram.g:1235:1: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:1236:1: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:1236:1: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:1237:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMergeNodeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_23);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMergeNodeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivityDiagram.g:1253:2: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalActivityDiagram.g:1253:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_18); 

                        	newLeafNode(otherlv_3, grammarAccess.getMergeNodeAccess().getInKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_16); 

                        	newLeafNode(otherlv_4, grammarAccess.getMergeNodeAccess().getLeftParenthesisKeyword_3_1());
                        
                    // InternalActivityDiagram.g:1261:1: ( (otherlv_5= RULE_ID ) )
                    // InternalActivityDiagram.g:1262:1: (otherlv_5= RULE_ID )
                    {
                    // InternalActivityDiagram.g:1262:1: (otherlv_5= RULE_ID )
                    // InternalActivityDiagram.g:1263:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMergeNodeRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    		newLeafNode(otherlv_5, grammarAccess.getMergeNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0()); 
                    	

                    }


                    }

                    // InternalActivityDiagram.g:1274:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==13) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:1274:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_16); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getMergeNodeAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // InternalActivityDiagram.g:1278:1: ( (otherlv_7= RULE_ID ) )
                    	    // InternalActivityDiagram.g:1279:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalActivityDiagram.g:1279:1: (otherlv_7= RULE_ID )
                    	    // InternalActivityDiagram.g:1280:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMergeNodeRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getMergeNodeAccess().getIncomingActivityEdgeCrossReference_3_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_20); 

                        	newLeafNode(otherlv_8, grammarAccess.getMergeNodeAccess().getRightParenthesisKeyword_3_4());
                        

                    }
                    break;

            }

            // InternalActivityDiagram.g:1295:3: (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )
            // InternalActivityDiagram.g:1295:5: otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')'
            {
            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_18); 

                	newLeafNode(otherlv_9, grammarAccess.getMergeNodeAccess().getOutKeyword_4_0());
                
            otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_10, grammarAccess.getMergeNodeAccess().getLeftParenthesisKeyword_4_1());
                
            // InternalActivityDiagram.g:1303:1: ( (otherlv_11= RULE_ID ) )
            // InternalActivityDiagram.g:1304:1: (otherlv_11= RULE_ID )
            {
            // InternalActivityDiagram.g:1304:1: (otherlv_11= RULE_ID )
            // InternalActivityDiagram.g:1305:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMergeNodeRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

            		newLeafNode(otherlv_11, grammarAccess.getMergeNodeAccess().getOutgoingActivityEdgeCrossReference_4_2_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_12, grammarAccess.getMergeNodeAccess().getRightParenthesisKeyword_4_3());
                

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
    // $ANTLR end "ruleMergeNode"


    // $ANTLR start "entryRuleDecisionNode"
    // InternalActivityDiagram.g:1328:1: entryRuleDecisionNode returns [EObject current=null] : iv_ruleDecisionNode= ruleDecisionNode EOF ;
    public final EObject entryRuleDecisionNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionNode = null;


        try {
            // InternalActivityDiagram.g:1329:2: (iv_ruleDecisionNode= ruleDecisionNode EOF )
            // InternalActivityDiagram.g:1330:2: iv_ruleDecisionNode= ruleDecisionNode EOF
            {
             newCompositeNode(grammarAccess.getDecisionNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecisionNode=ruleDecisionNode();

            state._fsp--;

             current =iv_ruleDecisionNode; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleDecisionNode"


    // $ANTLR start "ruleDecisionNode"
    // InternalActivityDiagram.g:1337:1: ruleDecisionNode returns [EObject current=null] : ( () otherlv_1= 'decision' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? ) ;
    public final EObject ruleDecisionNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:1340:28: ( ( () otherlv_1= 'decision' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? ) )
            // InternalActivityDiagram.g:1341:1: ( () otherlv_1= 'decision' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? )
            {
            // InternalActivityDiagram.g:1341:1: ( () otherlv_1= 'decision' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? )
            // InternalActivityDiagram.g:1341:2: () otherlv_1= 'decision' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
            {
            // InternalActivityDiagram.g:1341:2: ()
            // InternalActivityDiagram.g:1342:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDecisionNodeAccess().getDecisionNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getDecisionNodeAccess().getDecisionKeyword_1());
                
            // InternalActivityDiagram.g:1351:1: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:1352:1: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:1352:1: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:1353:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDecisionNodeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDecisionNodeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivityDiagram.g:1369:2: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            // InternalActivityDiagram.g:1369:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_18); 

                	newLeafNode(otherlv_3, grammarAccess.getDecisionNodeAccess().getInKeyword_3_0());
                
            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_4, grammarAccess.getDecisionNodeAccess().getLeftParenthesisKeyword_3_1());
                
            // InternalActivityDiagram.g:1377:1: ( (otherlv_5= RULE_ID ) )
            // InternalActivityDiagram.g:1378:1: (otherlv_5= RULE_ID )
            {
            // InternalActivityDiagram.g:1378:1: (otherlv_5= RULE_ID )
            // InternalActivityDiagram.g:1379:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecisionNodeRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

            		newLeafNode(otherlv_5, grammarAccess.getDecisionNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_19); 

                	newLeafNode(otherlv_6, grammarAccess.getDecisionNodeAccess().getRightParenthesisKeyword_3_3());
                

            }

            // InternalActivityDiagram.g:1394:2: (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalActivityDiagram.g:1394:4: otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_18); 

                        	newLeafNode(otherlv_7, grammarAccess.getDecisionNodeAccess().getOutKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_16); 

                        	newLeafNode(otherlv_8, grammarAccess.getDecisionNodeAccess().getLeftParenthesisKeyword_4_1());
                        
                    // InternalActivityDiagram.g:1402:1: ( (otherlv_9= RULE_ID ) )
                    // InternalActivityDiagram.g:1403:1: (otherlv_9= RULE_ID )
                    {
                    // InternalActivityDiagram.g:1403:1: (otherlv_9= RULE_ID )
                    // InternalActivityDiagram.g:1404:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecisionNodeRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    		newLeafNode(otherlv_9, grammarAccess.getDecisionNodeAccess().getOutgoingActivityEdgeCrossReference_4_2_0()); 
                    	

                    }


                    }

                    // InternalActivityDiagram.g:1415:2: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==13) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:1415:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_16); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getDecisionNodeAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // InternalActivityDiagram.g:1419:1: ( (otherlv_11= RULE_ID ) )
                    	    // InternalActivityDiagram.g:1420:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalActivityDiagram.g:1420:1: (otherlv_11= RULE_ID )
                    	    // InternalActivityDiagram.g:1421:3: otherlv_11= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDecisionNodeRule());
                    	    	        }
                    	            
                    	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    	    		newLeafNode(otherlv_11, grammarAccess.getDecisionNodeAccess().getOutgoingActivityEdgeCrossReference_4_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_12, grammarAccess.getDecisionNodeAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

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
    // $ANTLR end "ruleDecisionNode"


    // $ANTLR start "entryRuleIntegerCalculationExpression"
    // InternalActivityDiagram.g:1444:1: entryRuleIntegerCalculationExpression returns [EObject current=null] : iv_ruleIntegerCalculationExpression= ruleIntegerCalculationExpression EOF ;
    public final EObject entryRuleIntegerCalculationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerCalculationExpression = null;


        try {
            // InternalActivityDiagram.g:1445:2: (iv_ruleIntegerCalculationExpression= ruleIntegerCalculationExpression EOF )
            // InternalActivityDiagram.g:1446:2: iv_ruleIntegerCalculationExpression= ruleIntegerCalculationExpression EOF
            {
             newCompositeNode(grammarAccess.getIntegerCalculationExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerCalculationExpression=ruleIntegerCalculationExpression();

            state._fsp--;

             current =iv_ruleIntegerCalculationExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntegerCalculationExpression"


    // $ANTLR start "ruleIntegerCalculationExpression"
    // InternalActivityDiagram.g:1453:1: ruleIntegerCalculationExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerCalculationOperator ) ) ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleIntegerCalculationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_operator_3_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:1456:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerCalculationOperator ) ) ( (otherlv_4= RULE_ID ) ) ) )
            // InternalActivityDiagram.g:1457:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerCalculationOperator ) ) ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalActivityDiagram.g:1457:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerCalculationOperator ) ) ( (otherlv_4= RULE_ID ) ) )
            // InternalActivityDiagram.g:1457:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerCalculationOperator ) ) ( (otherlv_4= RULE_ID ) )
            {
            // InternalActivityDiagram.g:1457:2: ( (otherlv_0= RULE_ID ) )
            // InternalActivityDiagram.g:1458:1: (otherlv_0= RULE_ID )
            {
            // InternalActivityDiagram.g:1458:1: (otherlv_0= RULE_ID )
            // InternalActivityDiagram.g:1459:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerCalculationExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); 

            		newLeafNode(otherlv_0, grammarAccess.getIntegerCalculationExpressionAccess().getAssigneeIntegerVariableCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerCalculationExpressionAccess().getEqualsSignKeyword_1());
                
            // InternalActivityDiagram.g:1474:1: ( (otherlv_2= RULE_ID ) )
            // InternalActivityDiagram.g:1475:1: (otherlv_2= RULE_ID )
            {
            // InternalActivityDiagram.g:1475:1: (otherlv_2= RULE_ID )
            // InternalActivityDiagram.g:1476:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerCalculationExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); 

            		newLeafNode(otherlv_2, grammarAccess.getIntegerCalculationExpressionAccess().getOperand1IntegerVariableCrossReference_2_0()); 
            	

            }


            }

            // InternalActivityDiagram.g:1487:2: ( (lv_operator_3_0= ruleIntegerCalculationOperator ) )
            // InternalActivityDiagram.g:1488:1: (lv_operator_3_0= ruleIntegerCalculationOperator )
            {
            // InternalActivityDiagram.g:1488:1: (lv_operator_3_0= ruleIntegerCalculationOperator )
            // InternalActivityDiagram.g:1489:3: lv_operator_3_0= ruleIntegerCalculationOperator
            {
             
            	        newCompositeNode(grammarAccess.getIntegerCalculationExpressionAccess().getOperatorIntegerCalculationOperatorEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_16);
            lv_operator_3_0=ruleIntegerCalculationOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerCalculationExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_3_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.IntegerCalculationOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivityDiagram.g:1505:2: ( (otherlv_4= RULE_ID ) )
            // InternalActivityDiagram.g:1506:1: (otherlv_4= RULE_ID )
            {
            // InternalActivityDiagram.g:1506:1: (otherlv_4= RULE_ID )
            // InternalActivityDiagram.g:1507:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerCalculationExpressionRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_4, grammarAccess.getIntegerCalculationExpressionAccess().getOperand2IntegerVariableCrossReference_4_0()); 
            	

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
    // $ANTLR end "ruleIntegerCalculationExpression"


    // $ANTLR start "entryRuleIntegerComparisonExpression"
    // InternalActivityDiagram.g:1526:1: entryRuleIntegerComparisonExpression returns [EObject current=null] : iv_ruleIntegerComparisonExpression= ruleIntegerComparisonExpression EOF ;
    public final EObject entryRuleIntegerComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerComparisonExpression = null;


        try {
            // InternalActivityDiagram.g:1527:2: (iv_ruleIntegerComparisonExpression= ruleIntegerComparisonExpression EOF )
            // InternalActivityDiagram.g:1528:2: iv_ruleIntegerComparisonExpression= ruleIntegerComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getIntegerComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerComparisonExpression=ruleIntegerComparisonExpression();

            state._fsp--;

             current =iv_ruleIntegerComparisonExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntegerComparisonExpression"


    // $ANTLR start "ruleIntegerComparisonExpression"
    // InternalActivityDiagram.g:1535:1: ruleIntegerComparisonExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerComparisonOperator ) ) ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleIntegerComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_operator_3_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:1538:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerComparisonOperator ) ) ( (otherlv_4= RULE_ID ) ) ) )
            // InternalActivityDiagram.g:1539:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerComparisonOperator ) ) ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalActivityDiagram.g:1539:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerComparisonOperator ) ) ( (otherlv_4= RULE_ID ) ) )
            // InternalActivityDiagram.g:1539:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerComparisonOperator ) ) ( (otherlv_4= RULE_ID ) )
            {
            // InternalActivityDiagram.g:1539:2: ( (otherlv_0= RULE_ID ) )
            // InternalActivityDiagram.g:1540:1: (otherlv_0= RULE_ID )
            {
            // InternalActivityDiagram.g:1540:1: (otherlv_0= RULE_ID )
            // InternalActivityDiagram.g:1541:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerComparisonExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); 

            		newLeafNode(otherlv_0, grammarAccess.getIntegerComparisonExpressionAccess().getAssigneeBooleanVariableCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerComparisonExpressionAccess().getEqualsSignKeyword_1());
                
            // InternalActivityDiagram.g:1556:1: ( (otherlv_2= RULE_ID ) )
            // InternalActivityDiagram.g:1557:1: (otherlv_2= RULE_ID )
            {
            // InternalActivityDiagram.g:1557:1: (otherlv_2= RULE_ID )
            // InternalActivityDiagram.g:1558:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerComparisonExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

            		newLeafNode(otherlv_2, grammarAccess.getIntegerComparisonExpressionAccess().getOperand1IntegerVariableCrossReference_2_0()); 
            	

            }


            }

            // InternalActivityDiagram.g:1569:2: ( (lv_operator_3_0= ruleIntegerComparisonOperator ) )
            // InternalActivityDiagram.g:1570:1: (lv_operator_3_0= ruleIntegerComparisonOperator )
            {
            // InternalActivityDiagram.g:1570:1: (lv_operator_3_0= ruleIntegerComparisonOperator )
            // InternalActivityDiagram.g:1571:3: lv_operator_3_0= ruleIntegerComparisonOperator
            {
             
            	        newCompositeNode(grammarAccess.getIntegerComparisonExpressionAccess().getOperatorIntegerComparisonOperatorEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_16);
            lv_operator_3_0=ruleIntegerComparisonOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerComparisonExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_3_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.IntegerComparisonOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivityDiagram.g:1587:2: ( (otherlv_4= RULE_ID ) )
            // InternalActivityDiagram.g:1588:1: (otherlv_4= RULE_ID )
            {
            // InternalActivityDiagram.g:1588:1: (otherlv_4= RULE_ID )
            // InternalActivityDiagram.g:1589:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerComparisonExpressionRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_4, grammarAccess.getIntegerComparisonExpressionAccess().getOperand2IntegerVariableCrossReference_4_0()); 
            	

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
    // $ANTLR end "ruleIntegerComparisonExpression"


    // $ANTLR start "entryRuleBooleanUnaryExpression"
    // InternalActivityDiagram.g:1608:1: entryRuleBooleanUnaryExpression returns [EObject current=null] : iv_ruleBooleanUnaryExpression= ruleBooleanUnaryExpression EOF ;
    public final EObject entryRuleBooleanUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnaryExpression = null;


        try {
            // InternalActivityDiagram.g:1609:2: (iv_ruleBooleanUnaryExpression= ruleBooleanUnaryExpression EOF )
            // InternalActivityDiagram.g:1610:2: iv_ruleBooleanUnaryExpression= ruleBooleanUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanUnaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanUnaryExpression=ruleBooleanUnaryExpression();

            state._fsp--;

             current =iv_ruleBooleanUnaryExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanUnaryExpression"


    // $ANTLR start "ruleBooleanUnaryExpression"
    // InternalActivityDiagram.g:1617:1: ruleBooleanUnaryExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operator_2_0= ruleBooleanUnaryOperator ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleBooleanUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_2_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:1620:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operator_2_0= ruleBooleanUnaryOperator ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalActivityDiagram.g:1621:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operator_2_0= ruleBooleanUnaryOperator ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalActivityDiagram.g:1621:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operator_2_0= ruleBooleanUnaryOperator ) ) ( (otherlv_3= RULE_ID ) ) )
            // InternalActivityDiagram.g:1621:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operator_2_0= ruleBooleanUnaryOperator ) ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalActivityDiagram.g:1621:2: ( (otherlv_0= RULE_ID ) )
            // InternalActivityDiagram.g:1622:1: (otherlv_0= RULE_ID )
            {
            // InternalActivityDiagram.g:1622:1: (otherlv_0= RULE_ID )
            // InternalActivityDiagram.g:1623:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanUnaryExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); 

            		newLeafNode(otherlv_0, grammarAccess.getBooleanUnaryExpressionAccess().getAssigneeBooleanVariableCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_27); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanUnaryExpressionAccess().getEqualsSignKeyword_1());
                
            // InternalActivityDiagram.g:1638:1: ( (lv_operator_2_0= ruleBooleanUnaryOperator ) )
            // InternalActivityDiagram.g:1639:1: (lv_operator_2_0= ruleBooleanUnaryOperator )
            {
            // InternalActivityDiagram.g:1639:1: (lv_operator_2_0= ruleBooleanUnaryOperator )
            // InternalActivityDiagram.g:1640:3: lv_operator_2_0= ruleBooleanUnaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getBooleanUnaryExpressionAccess().getOperatorBooleanUnaryOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_16);
            lv_operator_2_0=ruleBooleanUnaryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanUnaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_2_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.BooleanUnaryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivityDiagram.g:1656:2: ( (otherlv_3= RULE_ID ) )
            // InternalActivityDiagram.g:1657:1: (otherlv_3= RULE_ID )
            {
            // InternalActivityDiagram.g:1657:1: (otherlv_3= RULE_ID )
            // InternalActivityDiagram.g:1658:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanUnaryExpressionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_3, grammarAccess.getBooleanUnaryExpressionAccess().getOperandBooleanVariableCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleBooleanUnaryExpression"


    // $ANTLR start "entryRuleBooleanBinaryExpression"
    // InternalActivityDiagram.g:1677:1: entryRuleBooleanBinaryExpression returns [EObject current=null] : iv_ruleBooleanBinaryExpression= ruleBooleanBinaryExpression EOF ;
    public final EObject entryRuleBooleanBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanBinaryExpression = null;


        try {
            // InternalActivityDiagram.g:1678:2: (iv_ruleBooleanBinaryExpression= ruleBooleanBinaryExpression EOF )
            // InternalActivityDiagram.g:1679:2: iv_ruleBooleanBinaryExpression= ruleBooleanBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanBinaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanBinaryExpression=ruleBooleanBinaryExpression();

            state._fsp--;

             current =iv_ruleBooleanBinaryExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanBinaryExpression"


    // $ANTLR start "ruleBooleanBinaryExpression"
    // InternalActivityDiagram.g:1686:1: ruleBooleanBinaryExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleBooleanBinaryOperator ) ) ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleBooleanBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_operator_3_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:1689:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleBooleanBinaryOperator ) ) ( (otherlv_4= RULE_ID ) ) ) )
            // InternalActivityDiagram.g:1690:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleBooleanBinaryOperator ) ) ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalActivityDiagram.g:1690:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleBooleanBinaryOperator ) ) ( (otherlv_4= RULE_ID ) ) )
            // InternalActivityDiagram.g:1690:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleBooleanBinaryOperator ) ) ( (otherlv_4= RULE_ID ) )
            {
            // InternalActivityDiagram.g:1690:2: ( (otherlv_0= RULE_ID ) )
            // InternalActivityDiagram.g:1691:1: (otherlv_0= RULE_ID )
            {
            // InternalActivityDiagram.g:1691:1: (otherlv_0= RULE_ID )
            // InternalActivityDiagram.g:1692:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanBinaryExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); 

            		newLeafNode(otherlv_0, grammarAccess.getBooleanBinaryExpressionAccess().getAssigneeBooleanVariableCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanBinaryExpressionAccess().getEqualsSignKeyword_1());
                
            // InternalActivityDiagram.g:1707:1: ( (otherlv_2= RULE_ID ) )
            // InternalActivityDiagram.g:1708:1: (otherlv_2= RULE_ID )
            {
            // InternalActivityDiagram.g:1708:1: (otherlv_2= RULE_ID )
            // InternalActivityDiagram.g:1709:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanBinaryExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); 

            		newLeafNode(otherlv_2, grammarAccess.getBooleanBinaryExpressionAccess().getOperand1BooleanVariableCrossReference_2_0()); 
            	

            }


            }

            // InternalActivityDiagram.g:1720:2: ( (lv_operator_3_0= ruleBooleanBinaryOperator ) )
            // InternalActivityDiagram.g:1721:1: (lv_operator_3_0= ruleBooleanBinaryOperator )
            {
            // InternalActivityDiagram.g:1721:1: (lv_operator_3_0= ruleBooleanBinaryOperator )
            // InternalActivityDiagram.g:1722:3: lv_operator_3_0= ruleBooleanBinaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getBooleanBinaryExpressionAccess().getOperatorBooleanBinaryOperatorEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_16);
            lv_operator_3_0=ruleBooleanBinaryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanBinaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_3_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.BooleanBinaryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivityDiagram.g:1738:2: ( (otherlv_4= RULE_ID ) )
            // InternalActivityDiagram.g:1739:1: (otherlv_4= RULE_ID )
            {
            // InternalActivityDiagram.g:1739:1: (otherlv_4= RULE_ID )
            // InternalActivityDiagram.g:1740:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanBinaryExpressionRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_4, grammarAccess.getBooleanBinaryExpressionAccess().getOperand2BooleanVariableCrossReference_4_0()); 
            	

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
    // $ANTLR end "ruleBooleanBinaryExpression"


    // $ANTLR start "entryRuleIntegerVariable"
    // InternalActivityDiagram.g:1759:1: entryRuleIntegerVariable returns [EObject current=null] : iv_ruleIntegerVariable= ruleIntegerVariable EOF ;
    public final EObject entryRuleIntegerVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerVariable = null;


        try {
            // InternalActivityDiagram.g:1760:2: (iv_ruleIntegerVariable= ruleIntegerVariable EOF )
            // InternalActivityDiagram.g:1761:2: iv_ruleIntegerVariable= ruleIntegerVariable EOF
            {
             newCompositeNode(grammarAccess.getIntegerVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerVariable=ruleIntegerVariable();

            state._fsp--;

             current =iv_ruleIntegerVariable; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntegerVariable"


    // $ANTLR start "ruleIntegerVariable"
    // InternalActivityDiagram.g:1768:1: ruleIntegerVariable returns [EObject current=null] : ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleValue ) ) )? ) ;
    public final EObject ruleIntegerVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_initialValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:1771:28: ( ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleValue ) ) )? ) )
            // InternalActivityDiagram.g:1772:1: ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleValue ) ) )? )
            {
            // InternalActivityDiagram.g:1772:1: ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleValue ) ) )? )
            // InternalActivityDiagram.g:1772:2: () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleValue ) ) )?
            {
            // InternalActivityDiagram.g:1772:2: ()
            // InternalActivityDiagram.g:1773:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerVariableAccess().getIntKeyword_1());
                
            // InternalActivityDiagram.g:1782:1: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:1783:1: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:1783:1: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:1784:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntegerVariableAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_29);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerVariableRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivityDiagram.g:1800:2: (otherlv_3= '=' ( (lv_initialValue_4_0= ruleValue ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalActivityDiagram.g:1800:4: otherlv_3= '=' ( (lv_initialValue_4_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_30); 

                        	newLeafNode(otherlv_3, grammarAccess.getIntegerVariableAccess().getEqualsSignKeyword_3_0());
                        
                    // InternalActivityDiagram.g:1804:1: ( (lv_initialValue_4_0= ruleValue ) )
                    // InternalActivityDiagram.g:1805:1: (lv_initialValue_4_0= ruleValue )
                    {
                    // InternalActivityDiagram.g:1805:1: (lv_initialValue_4_0= ruleValue )
                    // InternalActivityDiagram.g:1806:3: lv_initialValue_4_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntegerVariableAccess().getInitialValueValueParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_initialValue_4_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntegerVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"initialValue",
                            		lv_initialValue_4_0, 
                            		"org.modelexecution.operationalsemantics.ActivityDiagram.Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleIntegerVariable"


    // $ANTLR start "entryRuleBooleanVariable"
    // InternalActivityDiagram.g:1830:1: entryRuleBooleanVariable returns [EObject current=null] : iv_ruleBooleanVariable= ruleBooleanVariable EOF ;
    public final EObject entryRuleBooleanVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVariable = null;


        try {
            // InternalActivityDiagram.g:1831:2: (iv_ruleBooleanVariable= ruleBooleanVariable EOF )
            // InternalActivityDiagram.g:1832:2: iv_ruleBooleanVariable= ruleBooleanVariable EOF
            {
             newCompositeNode(grammarAccess.getBooleanVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanVariable=ruleBooleanVariable();

            state._fsp--;

             current =iv_ruleBooleanVariable; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanVariable"


    // $ANTLR start "ruleBooleanVariable"
    // InternalActivityDiagram.g:1839:1: ruleBooleanVariable returns [EObject current=null] : ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleValue ) ) )? ) ;
    public final EObject ruleBooleanVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_initialValue_4_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:1842:28: ( ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleValue ) ) )? ) )
            // InternalActivityDiagram.g:1843:1: ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleValue ) ) )? )
            {
            // InternalActivityDiagram.g:1843:1: ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleValue ) ) )? )
            // InternalActivityDiagram.g:1843:2: () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleValue ) ) )?
            {
            // InternalActivityDiagram.g:1843:2: ()
            // InternalActivityDiagram.g:1844:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanVariableAccess().getBooleanVariableAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanVariableAccess().getBoolKeyword_1());
                
            // InternalActivityDiagram.g:1853:1: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:1854:1: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:1854:1: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:1855:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBooleanVariableAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_29);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanVariableRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivityDiagram.g:1871:2: (otherlv_3= '=' ( (lv_initialValue_4_0= ruleValue ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalActivityDiagram.g:1871:4: otherlv_3= '=' ( (lv_initialValue_4_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_30); 

                        	newLeafNode(otherlv_3, grammarAccess.getBooleanVariableAccess().getEqualsSignKeyword_3_0());
                        
                    // InternalActivityDiagram.g:1875:1: ( (lv_initialValue_4_0= ruleValue ) )
                    // InternalActivityDiagram.g:1876:1: (lv_initialValue_4_0= ruleValue )
                    {
                    // InternalActivityDiagram.g:1876:1: (lv_initialValue_4_0= ruleValue )
                    // InternalActivityDiagram.g:1877:3: lv_initialValue_4_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanVariableAccess().getInitialValueValueParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_initialValue_4_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"initialValue",
                            		lv_initialValue_4_0, 
                            		"org.modelexecution.operationalsemantics.ActivityDiagram.Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleBooleanVariable"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalActivityDiagram.g:1901:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalActivityDiagram.g:1902:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalActivityDiagram.g:1903:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagram.g:1910:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:1913:28: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalActivityDiagram.g:1914:1: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalActivityDiagram.g:1914:1: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalActivityDiagram.g:1915:1: (lv_value_0_0= ruleEBoolean )
            {
            // InternalActivityDiagram.g:1915:1: (lv_value_0_0= ruleEBoolean )
            // InternalActivityDiagram.g:1916:3: lv_value_0_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.EBoolean");
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
    // InternalActivityDiagram.g:1940:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalActivityDiagram.g:1941:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalActivityDiagram.g:1942:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagram.g:1949:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:1952:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalActivityDiagram.g:1953:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalActivityDiagram.g:1953:1: ( (lv_value_0_0= ruleEInt ) )
            // InternalActivityDiagram.g:1954:1: (lv_value_0_0= ruleEInt )
            {
            // InternalActivityDiagram.g:1954:1: (lv_value_0_0= ruleEInt )
            // InternalActivityDiagram.g:1955:3: lv_value_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.EInt");
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
    // InternalActivityDiagram.g:1979:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalActivityDiagram.g:1980:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalActivityDiagram.g:1981:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagram.g:1988:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:1991:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalActivityDiagram.g:1992:1: (kw= 'true' | kw= 'false' )
            {
            // InternalActivityDiagram.g:1992:1: (kw= 'true' | kw= 'false' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            else if ( (LA32_0==33) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalActivityDiagram.g:1993:2: kw= 'true'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:2000:2: kw= 'false'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagram.g:2013:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalActivityDiagram.g:2014:2: (iv_ruleEInt= ruleEInt EOF )
            // InternalActivityDiagram.g:2015:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalActivityDiagram.g:2022:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:2025:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalActivityDiagram.g:2026:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalActivityDiagram.g:2026:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalActivityDiagram.g:2026:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalActivityDiagram.g:2026:2: (kw= '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalActivityDiagram.g:2027:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_31); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

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


    // $ANTLR start "entryRuleControlFlow"
    // InternalActivityDiagram.g:2047:1: entryRuleControlFlow returns [EObject current=null] : iv_ruleControlFlow= ruleControlFlow EOF ;
    public final EObject entryRuleControlFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlFlow = null;


        try {
            // InternalActivityDiagram.g:2048:2: (iv_ruleControlFlow= ruleControlFlow EOF )
            // InternalActivityDiagram.g:2049:2: iv_ruleControlFlow= ruleControlFlow EOF
            {
             newCompositeNode(grammarAccess.getControlFlowRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleControlFlow=ruleControlFlow();

            state._fsp--;

             current =iv_ruleControlFlow; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleControlFlow"


    // $ANTLR start "ruleControlFlow"
    // InternalActivityDiagram.g:2056:1: ruleControlFlow returns [EObject current=null] : (otherlv_0= 'flow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )? ) ;
    public final EObject ruleControlFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalActivityDiagram.g:2059:28: ( (otherlv_0= 'flow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )? ) )
            // InternalActivityDiagram.g:2060:1: (otherlv_0= 'flow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )? )
            {
            // InternalActivityDiagram.g:2060:1: (otherlv_0= 'flow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )? )
            // InternalActivityDiagram.g:2060:3: otherlv_0= 'flow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )?
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getControlFlowAccess().getFlowKeyword_0());
                
            // InternalActivityDiagram.g:2064:1: ( (lv_name_1_0= ruleEString ) )
            // InternalActivityDiagram.g:2065:1: (lv_name_1_0= ruleEString )
            {
            // InternalActivityDiagram.g:2065:1: (lv_name_1_0= ruleEString )
            // InternalActivityDiagram.g:2066:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getControlFlowAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_32);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getControlFlowRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.modelexecution.operationalsemantics.ActivityDiagram.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_2, grammarAccess.getControlFlowAccess().getFromKeyword_2());
                
            // InternalActivityDiagram.g:2086:1: ( (otherlv_3= RULE_ID ) )
            // InternalActivityDiagram.g:2087:1: (otherlv_3= RULE_ID )
            {
            // InternalActivityDiagram.g:2087:1: (otherlv_3= RULE_ID )
            // InternalActivityDiagram.g:2088:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getControlFlowRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_33); 

            		newLeafNode(otherlv_3, grammarAccess.getControlFlowAccess().getSourceActivityNodeCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_4, grammarAccess.getControlFlowAccess().getToKeyword_4());
                
            // InternalActivityDiagram.g:2103:1: ( (otherlv_5= RULE_ID ) )
            // InternalActivityDiagram.g:2104:1: (otherlv_5= RULE_ID )
            {
            // InternalActivityDiagram.g:2104:1: (otherlv_5= RULE_ID )
            // InternalActivityDiagram.g:2105:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getControlFlowRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_34); 

            		newLeafNode(otherlv_5, grammarAccess.getControlFlowAccess().getTargetActivityNodeCrossReference_5_0()); 
            	

            }


            }

            // InternalActivityDiagram.g:2116:2: (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalActivityDiagram.g:2116:4: otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_16); 

                        	newLeafNode(otherlv_6, grammarAccess.getControlFlowAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // InternalActivityDiagram.g:2120:1: ( (otherlv_7= RULE_ID ) )
                    // InternalActivityDiagram.g:2121:1: (otherlv_7= RULE_ID )
                    {
                    // InternalActivityDiagram.g:2121:1: (otherlv_7= RULE_ID )
                    // InternalActivityDiagram.g:2122:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getControlFlowRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); 

                    		newLeafNode(otherlv_7, grammarAccess.getControlFlowAccess().getGuardBooleanVariableCrossReference_6_1_0()); 
                    	

                    }


                    }

                    otherlv_8=(Token)match(input,39,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_8, grammarAccess.getControlFlowAccess().getRightSquareBracketKeyword_6_2());
                        

                    }
                    break;

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
    // $ANTLR end "ruleControlFlow"


    // $ANTLR start "ruleIntegerCalculationOperator"
    // InternalActivityDiagram.g:2145:1: ruleIntegerCalculationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleIntegerCalculationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalActivityDiagram.g:2147:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalActivityDiagram.g:2148:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalActivityDiagram.g:2148:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            else if ( (LA35_0==34) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalActivityDiagram.g:2148:2: (enumLiteral_0= '+' )
                    {
                    // InternalActivityDiagram.g:2148:2: (enumLiteral_0= '+' )
                    // InternalActivityDiagram.g:2148:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getIntegerCalculationOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIntegerCalculationOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:2154:6: (enumLiteral_1= '-' )
                    {
                    // InternalActivityDiagram.g:2154:6: (enumLiteral_1= '-' )
                    // InternalActivityDiagram.g:2154:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,34,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getIntegerCalculationOperatorAccess().getSUBRACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getIntegerCalculationOperatorAccess().getSUBRACTEnumLiteralDeclaration_1()); 
                        

                    }


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
    // $ANTLR end "ruleIntegerCalculationOperator"


    // $ANTLR start "ruleIntegerComparisonOperator"
    // InternalActivityDiagram.g:2164:1: ruleIntegerComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) ;
    public final Enumerator ruleIntegerComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalActivityDiagram.g:2166:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) )
            // InternalActivityDiagram.g:2167:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            {
            // InternalActivityDiagram.g:2167:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            int alt36=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt36=1;
                }
                break;
            case 42:
                {
                alt36=2;
                }
                break;
            case 43:
                {
                alt36=3;
                }
                break;
            case 44:
                {
                alt36=4;
                }
                break;
            case 45:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalActivityDiagram.g:2167:2: (enumLiteral_0= '<' )
                    {
                    // InternalActivityDiagram.g:2167:2: (enumLiteral_0= '<' )
                    // InternalActivityDiagram.g:2167:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getIntegerComparisonOperatorAccess().getSMALLEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIntegerComparisonOperatorAccess().getSMALLEREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:2173:6: (enumLiteral_1= '<=' )
                    {
                    // InternalActivityDiagram.g:2173:6: (enumLiteral_1= '<=' )
                    // InternalActivityDiagram.g:2173:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getIntegerComparisonOperatorAccess().getSMALLER_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getIntegerComparisonOperatorAccess().getSMALLER_EQUALSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalActivityDiagram.g:2179:6: (enumLiteral_2= '==' )
                    {
                    // InternalActivityDiagram.g:2179:6: (enumLiteral_2= '==' )
                    // InternalActivityDiagram.g:2179:8: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getIntegerComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getIntegerComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalActivityDiagram.g:2185:6: (enumLiteral_3= '>=' )
                    {
                    // InternalActivityDiagram.g:2185:6: (enumLiteral_3= '>=' )
                    // InternalActivityDiagram.g:2185:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,44,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getIntegerComparisonOperatorAccess().getGREATER_EQUALSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getIntegerComparisonOperatorAccess().getGREATER_EQUALSEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalActivityDiagram.g:2191:6: (enumLiteral_4= '>' )
                    {
                    // InternalActivityDiagram.g:2191:6: (enumLiteral_4= '>' )
                    // InternalActivityDiagram.g:2191:8: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,45,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getIntegerComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getIntegerComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_4()); 
                        

                    }


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
    // $ANTLR end "ruleIntegerComparisonOperator"


    // $ANTLR start "ruleBooleanUnaryOperator"
    // InternalActivityDiagram.g:2201:1: ruleBooleanUnaryOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleBooleanUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalActivityDiagram.g:2203:28: ( (enumLiteral_0= '!' ) )
            // InternalActivityDiagram.g:2204:1: (enumLiteral_0= '!' )
            {
            // InternalActivityDiagram.g:2204:1: (enumLiteral_0= '!' )
            // InternalActivityDiagram.g:2204:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,46,FollowSets000.FOLLOW_2); 

                    current = grammarAccess.getBooleanUnaryOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getBooleanUnaryOperatorAccess().getNOTEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleBooleanUnaryOperator"


    // $ANTLR start "ruleBooleanBinaryOperator"
    // InternalActivityDiagram.g:2214:1: ruleBooleanBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) ;
    public final Enumerator ruleBooleanBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalActivityDiagram.g:2216:28: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) )
            // InternalActivityDiagram.g:2217:1: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            {
            // InternalActivityDiagram.g:2217:1: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                alt37=1;
            }
            else if ( (LA37_0==48) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalActivityDiagram.g:2217:2: (enumLiteral_0= '&' )
                    {
                    // InternalActivityDiagram.g:2217:2: (enumLiteral_0= '&' )
                    // InternalActivityDiagram.g:2217:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,47,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getBooleanBinaryOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanBinaryOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:2223:6: (enumLiteral_1= '|' )
                    {
                    // InternalActivityDiagram.g:2223:6: (enumLiteral_1= '|' )
                    // InternalActivityDiagram.g:2223:8: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,48,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getBooleanBinaryOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBooleanBinaryOperatorAccess().getOREnumLiteralDeclaration_1()); 
                        

                    }


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
    // $ANTLR end "ruleBooleanBinaryOperator"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000C0070000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000072000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000001F880000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000700002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000600002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010400000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00003E0000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001800000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000700000040L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    }


}