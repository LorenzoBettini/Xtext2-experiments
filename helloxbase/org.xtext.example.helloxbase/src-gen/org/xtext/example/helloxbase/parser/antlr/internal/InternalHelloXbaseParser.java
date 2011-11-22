package org.xtext.example.helloxbase.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.helloxbase.services.HelloXbaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalHelloXbaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'from'", "'!'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalHelloXbaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHelloXbaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHelloXbaseParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g"; }



     	private HelloXbaseGrammarAccess grammarAccess;
     	
        public InternalHelloXbaseParser(TokenStream input, HelloXbaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected HelloXbaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:76:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:79:28: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:82:3: lv_greetings_0_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel130);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"greetings",
            	              		lv_greetings_0_0, 
            	              		"Greeting");
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:106:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:107:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:108:2: iv_ruleGreeting= ruleGreeting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreetingRule()); 
            }
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting166);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreeting; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting176); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:115:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:118:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '!' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:119:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '!' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:119:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '!' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:119:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) otherlv_4= '!'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleGreeting213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGreetingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGreeting247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getFromKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:145:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:146:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:146:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:147:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGreetingRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGreetingAccess().getJavaTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGreeting270);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleGreeting282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:172:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:173:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:174:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression318);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression328); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:181:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:184:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:186:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression374);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:202:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:203:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:204:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment408);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment418); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:211:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:214:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:215:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:215:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=RULE_ID && LA3_1<=RULE_STRING)||LA3_1==13||(LA3_1>=15 && LA3_1<=40)||(LA3_1>=42 && LA3_1<=69)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==14) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_STRING)||LA3_0==13||LA3_0==24||(LA3_0>=27 && LA3_0<=28)||LA3_0==38||LA3_0==40||LA3_0==44||LA3_0==46||LA3_0==48||(LA3_0>=52 && LA3_0<=54)||LA3_0==57||(LA3_0>=59 && LA3_0<=66)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:215:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:215:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:215:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:215:3: ()
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:216:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:221:2: ( ( ruleValidID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:222:1: ( ruleValidID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:222:1: ( ruleValidID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:223:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment476);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment492);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:244:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:245:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:245:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:246:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment512);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:263:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:263:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:264:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment542);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:272:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==15) ) {
                        int LA2_1 = input.LA(2);

                        if ( (synpred1_InternalHelloXbase()) ) {
                            alt2=1;
                        }
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:272:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:272:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:272:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:277:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:277:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:277:7: ()
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:278:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:283:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:284:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:284:1: ( ruleOpMultiAssign )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:285:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment595);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:298:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:299:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:299:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:300:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment618);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:324:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:325:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:326:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign658);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign669); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:333:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:336:28: (kw= '=' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:338:2: kw= '='
            {
            kw=(Token)match(input,14,FOLLOW_14_in_ruleOpSingleAssign706); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:351:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:352:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:353:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign746);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign757); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:360:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:363:28: (kw= '+=' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:365:2: kw= '+='
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleOpMultiAssign794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:378:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:379:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:380:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression833);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression843); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:387:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:390:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:391:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:391:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:392:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression890);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:400:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    int LA4_2 = input.LA(2);

                    if ( (synpred2_InternalHelloXbase()) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:400:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:400:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:400:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:405:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:405:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:405:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:406:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:411:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:412:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:412:1: ( ruleOpOr )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:413:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression943);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:426:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:427:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:427:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:428:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression966);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:452:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:453:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:454:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1005);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1016); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:461:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:464:28: (kw= '||' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:466:2: kw= '||'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleOpOr1053); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:479:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:480:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:481:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1092);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1102); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:488:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:491:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:492:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:492:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:493:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1149);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:501:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred3_InternalHelloXbase()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:501:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:501:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:501:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:506:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:506:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:506:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:507:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:512:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:513:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:513:1: ( ruleOpAnd )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:514:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1202);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:527:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:528:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:528:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:529:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1225);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:553:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:554:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:555:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1264);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1275); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:562:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:565:28: (kw= '&&' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:567:2: kw= '&&'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpAnd1312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:580:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:581:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:582:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1351);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1361); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:589:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:592:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:593:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:593:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:594:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1408);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:602:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred4_InternalHelloXbase()) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==19) ) {
                    int LA6_3 = input.LA(2);

                    if ( (synpred4_InternalHelloXbase()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:602:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:602:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:602:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:607:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:607:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:607:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:608:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:613:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:614:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:614:1: ( ruleOpEquality )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:615:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1461);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:628:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:629:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:629:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:630:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1484);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:654:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:655:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:656:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1523);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1534); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:663:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:666:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:667:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:667:1: (kw= '==' | kw= '!=' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:668:2: kw= '=='
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleOpEquality1572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:675:2: kw= '!='
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleOpEquality1591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:688:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:689:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:690:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1631);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1641); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:697:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:700:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:701:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:701:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:702:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1688);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:710:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop8:
            do {
                int alt8=3;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    int LA8_2 = input.LA(2);

                    if ( (synpred5_InternalHelloXbase()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA8_3 = input.LA(2);

                    if ( (synpred6_InternalHelloXbase()) ) {
                        alt8=2;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA8_4 = input.LA(2);

                    if ( (synpred6_InternalHelloXbase()) ) {
                        alt8=2;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA8_5 = input.LA(2);

                    if ( (synpred6_InternalHelloXbase()) ) {
                        alt8=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA8_6 = input.LA(2);

                    if ( (synpred6_InternalHelloXbase()) ) {
                        alt8=2;
                    }


                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:710:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:710:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:710:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:710:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:710:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:712:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:712:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:712:6: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:713:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXRelationalExpression1724); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:722:3: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:723:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:723:1: ( ruleQualifiedName )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:724:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression1749);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:738:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:738:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:738:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:738:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:738:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:743:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:743:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:743:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:744:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:749:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:750:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:750:1: ( ruleOpCompare )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:751:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1810);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:764:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:765:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:765:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:766:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1833);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:790:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:791:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:792:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare1873);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare1884); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:799:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:802:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:803:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:803:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            case 24:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:804:2: kw= '>='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpCompare1922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:811:2: kw= '<='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpCompare1941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:818:2: kw= '>'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare1960); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:825:2: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare1979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:838:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:839:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:840:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2019);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2029); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:847:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:850:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:851:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:851:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:852:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2076);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:860:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred7_InternalHelloXbase()) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==26) ) {
                    int LA10_3 = input.LA(2);

                    if ( (synpred7_InternalHelloXbase()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:860:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:860:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:860:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:865:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:865:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:865:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:866:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:871:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:872:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:872:1: ( ruleOpOther )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:873:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2129);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:886:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:887:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:887:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:888:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2152);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:912:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:913:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:914:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2191);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2202); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:921:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:924:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:925:1: (kw= '->' | kw= '..' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:925:1: (kw= '->' | kw= '..' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:926:2: kw= '->'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:933:2: kw= '..'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:946:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:947:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:948:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2299);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2309); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:955:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:958:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:959:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:959:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:960:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2356);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:968:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred8_InternalHelloXbase()) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==28) ) {
                    int LA12_3 = input.LA(2);

                    if ( (synpred8_InternalHelloXbase()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:968:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:968:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:968:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:973:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:973:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:973:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:974:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:979:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:980:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:980:1: ( ruleOpAdd )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:981:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2409);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:994:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:995:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:995:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:996:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2432);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1020:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1021:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1022:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2471);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2482); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1029:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1032:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1033:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1033:1: (kw= '+' | kw= '-' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1034:2: kw= '+'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpAdd2520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1041:2: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpAdd2539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1054:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1055:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1056:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2579);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2589); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1063:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1066:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1067:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1067:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1068:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2636);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1076:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred9_InternalHelloXbase()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred9_InternalHelloXbase()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (synpred9_InternalHelloXbase()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA14_5 = input.LA(2);

                    if ( (synpred9_InternalHelloXbase()) ) {
                        alt14=1;
                    }


                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1076:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1076:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1076:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1081:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1081:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1081:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1082:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1087:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1088:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1088:1: ( ruleOpMulti )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1089:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2689);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1102:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1103:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1103:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1104:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2712);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1128:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1129:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1130:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti2751);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti2762); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1137:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1140:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1141:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1141:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1142:2: kw= '*'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpMulti2800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1149:2: kw= '**'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpMulti2819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1156:2: kw= '/'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpMulti2838); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1163:2: kw= '%'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpMulti2857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1176:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1177:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1178:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation2897);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation2907); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1185:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1188:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1189:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1189:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13||(LA16_0>=27 && LA16_0<=28)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==24||LA16_0==38||LA16_0==40||LA16_0==44||LA16_0==46||LA16_0==48||(LA16_0>=52 && LA16_0<=54)||LA16_0==57||(LA16_0>=59 && LA16_0<=66)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1189:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1189:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1189:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1189:3: ()
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1190:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1195:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1196:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1196:1: ( ruleOpUnary )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1197:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation2965);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1210:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1211:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1211:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1212:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation2986);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1230:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3015);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1246:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1247:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1248:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3051);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3062); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1255:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1258:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1259:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1259:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt17=1;
                }
                break;
            case 28:
                {
                alt17=2;
                }
                break;
            case 27:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1260:2: kw= '!'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleOpUnary3100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1267:2: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpUnary3119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1274:2: kw= '+'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpUnary3138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1287:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1288:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1289:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3178);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3188); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1296:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1299:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1300:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1300:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1301:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3235);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1309:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred10_InternalHelloXbase()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1309:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1309:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1309:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1311:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1311:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1311:6: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1312:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleXCastedExpression3270); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1321:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1322:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1322:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1323:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3293);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1347:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1348:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1349:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3331);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3341); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1356:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1359:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1360:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1360:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1361:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3388);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1369:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop26:
            do {
                int alt26=3;
                switch ( input.LA(1) ) {
                case 34:
                    {
                    int LA26_2 = input.LA(2);

                    if ( (synpred11_InternalHelloXbase()) ) {
                        alt26=1;
                    }
                    else if ( (synpred12_InternalHelloXbase()) ) {
                        alt26=2;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA26_3 = input.LA(2);

                    if ( (synpred12_InternalHelloXbase()) ) {
                        alt26=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA26_4 = input.LA(2);

                    if ( (synpred12_InternalHelloXbase()) ) {
                        alt26=2;
                    }


                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1369:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1369:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1369:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1369:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1369:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1375:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1375:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1375:26: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1376:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleXMemberFeatureCall3437); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1385:1: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1386:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1386:1: ( ruleValidID )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1387:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3460);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3476);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1408:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1409:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1409:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1410:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3498);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1427:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1427:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1427:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1427:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1427:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1443:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1443:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1443:8: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1444:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1449:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1449:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleXMemberFeatureCall3584); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1454:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1454:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1455:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1455:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1456:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,35,FOLLOW_35_in_ruleXMemberFeatureCall3608); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1470:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1470:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1471:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1471:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1472:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall3645); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1485:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==24) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1485:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall3674); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1489:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1490:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1490:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1491:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3695);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1507:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop20:
            	            do {
            	                int alt20=2;
            	                int LA20_0 = input.LA(1);

            	                if ( (LA20_0==37) ) {
            	                    alt20=1;
            	                }


            	                switch (alt20) {
            	            	case 1 :
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1507:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall3708); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1511:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1512:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1512:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1513:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3729);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop20;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleXMemberFeatureCall3743); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1533:3: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1534:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1534:1: ( ruleValidID )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1535:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3768);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1548:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt24=2;
            	    alt24 = dfa24.predict(input);
            	    switch (alt24) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1548:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1548:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1548:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1555:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1556:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall3802); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1569:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt23=3;
            	            alt23 = dfa23.predict(input);
            	            switch (alt23) {
            	                case 1 :
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1569:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1569:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1569:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1586:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1587:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall3887);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1604:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1604:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1604:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1604:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1605:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1605:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1606:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall3915);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1622:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop22:
            	                    do {
            	                        int alt22=2;
            	                        int LA22_0 = input.LA(1);

            	                        if ( (LA22_0==37) ) {
            	                            alt22=1;
            	                        }


            	                        switch (alt22) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1622:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall3928); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1626:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1627:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1627:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1628:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall3949);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop22;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall3966); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1648:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt25=2;
            	    alt25 = dfa25.predict(input);
            	    switch (alt25) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1648:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1653:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1654:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall3999);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1678:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1679:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1680:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4039);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4049); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1687:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1690:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1691:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1691:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt27=13;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt27=1;
                }
                break;
            case 48:
                {
                alt27=2;
                }
                break;
            case 46:
                {
                alt27=3;
                }
                break;
            case RULE_ID:
            case 24:
            case 57:
                {
                alt27=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 40:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt27=5;
                }
                break;
            case 44:
                {
                alt27=6;
                }
                break;
            case 52:
                {
                alt27=7;
                }
                break;
            case 53:
                {
                alt27=8;
                }
                break;
            case 54:
                {
                alt27=9;
                }
                break;
            case 64:
                {
                alt27=10;
                }
                break;
            case 65:
                {
                alt27=11;
                }
                break;
            case 66:
                {
                alt27=12;
                }
                break;
            case 38:
                {
                alt27=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1692:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4096);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1702:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4123);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1712:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4150);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1722:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4177);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1732:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4204);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1742:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4231);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1752:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4258);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1762:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4285);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1772:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4312);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1782:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4339);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1792:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4366);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1802:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4393);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1812:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4420);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1828:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1829:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1830:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4455);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4465); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1837:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1840:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1841:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1841:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt28=1;
                }
                break;
            case 60:
            case 61:
                {
                alt28=2;
                }
                break;
            case RULE_INT:
                {
                alt28=3;
                }
                break;
            case 62:
                {
                alt28=4;
                }
                break;
            case RULE_STRING:
                {
                alt28=5;
                }
                break;
            case 63:
                {
                alt28=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1842:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4512);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1852:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4539);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1862:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral4566);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1872:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4593);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1882:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4620);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1892:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4647);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1908:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1909:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1910:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure4682);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure4692); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1917:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1920:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1921:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1921:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1921:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1921:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1922:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleXClosure4738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1931:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1931:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1946:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1946:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1946:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_ID||LA30_0==38||LA30_0==69) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1946:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1946:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1947:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1947:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1948:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure4809);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1964:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==37) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1964:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleXClosure4822); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1968:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1969:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1969:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1970:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure4843);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop29;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1986:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1987:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1987:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1988:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,41,FOLLOW_41_in_ruleXClosure4865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_2_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2001:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2002:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2002:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2003:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure4902);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleXClosure4914); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2031:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2032:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure4950);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure4960); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2040:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2043:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2044:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2044:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2044:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2044:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2045:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2050:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)||LA33_0==13||LA33_0==24||(LA33_0>=27 && LA33_0<=28)||LA33_0==38||LA33_0==40||LA33_0==44||LA33_0==46||LA33_0==48||(LA33_0>=52 && LA33_0<=57)||(LA33_0>=59 && LA33_0<=66)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2050:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2050:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2051:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2051:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2052:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5016);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2068:2: (otherlv_2= ';' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==43) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2068:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXExpressionInClosure5029); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2080:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2081:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2082:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5069);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5079); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2089:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2092:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2093:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2093:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2093:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2093:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2093:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2109:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2109:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2109:7: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2110:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2115:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||LA35_0==38||LA35_0==69) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2115:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2115:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2116:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2116:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2117:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5187);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2133:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==37) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2133:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXShortClosure5200); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2137:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2138:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2138:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2139:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5221);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2155:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2156:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2156:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2157:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,41,FOLLOW_41_in_ruleXShortClosure5243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2170:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2171:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2171:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2172:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5279);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2196:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2197:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2198:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5315);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5325); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2205:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2208:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2209:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2209:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2209:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleXParenthesizedExpression5362); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5384);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXParenthesizedExpression5395); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2234:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2235:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2236:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5431);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5441); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2243:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2246:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2247:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2247:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2247:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2247:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2248:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression5487); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXIfExpression5499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2261:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2262:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2262:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2263:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5520);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXIfExpression5532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2283:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2284:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2284:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2285:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5553);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2301:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==45) ) {
                int LA36_1 = input.LA(2);

                if ( (synpred18_InternalHelloXbase()) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2301:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2301:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2301:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression5574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2306:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2307:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2307:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2308:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5596);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2332:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2333:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2334:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5634);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5644); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2341:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2344:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2345:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2345:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2345:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2345:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2346:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXSwitchExpression5690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2355:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==47) && (synpred19_InternalHelloXbase())) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2355:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2360:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2360:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2360:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2361:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2361:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2362:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression5731);
                    lv_localVarName_2_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression5743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2382:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2383:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2383:1: (lv_switch_4_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2384:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression5767);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression5779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2404:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==38||LA38_0==47||LA38_0==51||LA38_0==69) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2405:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2405:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2406:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression5800);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2422:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2422:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression5814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression5826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2430:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2431:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2431:1: (lv_default_9_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2432:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression5847);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression5861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2460:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2461:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2462:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart5897);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart5907); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2469:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2472:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2473:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2473:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2473:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2473:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==38||LA40_0==69) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2474:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2474:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2475:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart5953);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2491:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==51) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2491:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXCasePart5967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2495:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2496:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2496:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2497:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart5988);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXCasePart6002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2517:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2518:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2518:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2519:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6023);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2543:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2544:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2545:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6059);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6069); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2552:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2555:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2556:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2556:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2556:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2556:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2557:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXForLoopExpression6115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXForLoopExpression6127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2570:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2571:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2571:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2572:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6148);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXForLoopExpression6160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2592:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2593:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2593:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2594:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6181);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleXForLoopExpression6193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2614:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2615:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2615:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2616:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6214);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2640:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2641:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2642:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6250);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6260); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2649:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2652:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2653:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2653:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2653:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2653:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2654:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXWhileExpression6306); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXWhileExpression6318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2667:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2668:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2668:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2669:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6339);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXWhileExpression6351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2689:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2690:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2690:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2691:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6372);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2715:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2716:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2717:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6408);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6418); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2724:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2727:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2728:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2728:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2728:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2728:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2729:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXDoWhileExpression6464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2738:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2739:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2739:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2740:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6485);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXDoWhileExpression6497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleXDoWhileExpression6509); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2764:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2765:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2765:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2766:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6530);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleXDoWhileExpression6542); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2794:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2795:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2796:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6578);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6588); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2803:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2806:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2807:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2807:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2807:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2807:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2808:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXBlockExpression6634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2817:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_STRING)||LA43_0==13||LA43_0==24||(LA43_0>=27 && LA43_0<=28)||LA43_0==38||LA43_0==40||LA43_0==44||LA43_0==46||LA43_0==48||(LA43_0>=52 && LA43_0<=57)||(LA43_0>=59 && LA43_0<=66)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2817:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2817:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2818:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2818:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2819:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6656);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2835:2: (otherlv_3= ';' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==43) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2835:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleXBlockExpression6669); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXBlockExpression6685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2851:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2852:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2853:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6721);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6731); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2860:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2863:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2864:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2864:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=55 && LA44_0<=56)) ) {
                alt44=1;
            }
            else if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_STRING)||LA44_0==13||LA44_0==24||(LA44_0>=27 && LA44_0<=28)||LA44_0==38||LA44_0==40||LA44_0==44||LA44_0==46||LA44_0==48||(LA44_0>=52 && LA44_0<=54)||LA44_0==57||(LA44_0>=59 && LA44_0<=66)) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2865:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6778);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2875:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6805);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2891:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2892:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2893:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration6840);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration6850); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2900:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2903:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2904:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2904:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2904:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2904:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2905:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2910:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==55) ) {
                alt45=1;
            }
            else if ( (LA45_0==56) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2910:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2910:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2911:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2911:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2912:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,55,FOLLOW_55_in_ruleXVariableDeclaration6903); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2926:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleXVariableDeclaration6934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2930:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred20_InternalHelloXbase()) ) {
                    alt46=1;
                }
                else if ( (true) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA46_0==38) && (synpred20_InternalHelloXbase())) {
                alt46=1;
            }
            else if ( (LA46_0==69) && (synpred20_InternalHelloXbase())) {
                alt46=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2930:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2930:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2930:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2938:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2938:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2938:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2939:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2939:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2940:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration6982);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2956:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2957:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2957:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2958:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7003);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2975:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2975:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2976:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2976:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2977:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7032);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2993:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==14) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2993:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleXVariableDeclaration7046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2997:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2998:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2998:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2999:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7067);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3023:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3024:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3025:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7105);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7115); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3032:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3035:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3036:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3036:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3036:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3036:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==RULE_ID||LA48_1==24||LA48_1==34||LA48_1==40) ) {
                    alt48=1;
                }
            }
            else if ( (LA48_0==38||LA48_0==69) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3037:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3037:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3038:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7161);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3054:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3055:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3055:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3056:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7183);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3080:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3081:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3082:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7219);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7229); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3089:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3092:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3093:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3093:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3093:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3093:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3094:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3094:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3095:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7275);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3111:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3112:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3112:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3113:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7296);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3137:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3138:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3139:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7332);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7342); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3146:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3149:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3150:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3150:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3150:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3150:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3151:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3156:2: ( ( ruleStaticQualifier ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==58) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3157:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3157:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3158:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7399);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3171:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==24) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3171:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall7413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3175:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3176:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3176:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3177:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7434);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3193:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==37) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3193:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleXFeatureCall7447); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3197:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3198:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3198:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3199:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7468);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXFeatureCall7482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3219:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3220:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3220:1: ( ruleIdOrSuper )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3221:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7507);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3234:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3234:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3234:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3234:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3241:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3242:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,38,FOLLOW_38_in_ruleXFeatureCall7541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3255:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt53=3;
                    alt53 = dfa53.predict(input);
                    switch (alt53) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3255:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3255:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3255:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3272:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3273:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7626);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3290:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3290:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3290:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3290:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3291:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3291:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3292:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7654);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3308:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==37) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3308:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleXFeatureCall7667); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3312:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3313:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3313:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3314:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7688);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall7705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3334:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3334:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3339:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3340:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall7738);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3364:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3365:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3366:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7776);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper7787); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3373:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3376:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3377:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3377:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            else if ( (LA56_0==57) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3378:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper7834);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3390:2: kw= 'super'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleIdOrSuper7858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3403:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3404:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3405:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier7899);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier7910); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3412:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3415:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3416:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3416:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    int LA57_2 = input.LA(2);

                    if ( (LA57_2==58) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3417:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier7957);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,58,FOLLOW_58_in_ruleStaticQualifier7975); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3441:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3442:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3443:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8016);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8026); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3450:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3453:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3454:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3454:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3454:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3454:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3455:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXConstructorCall8072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3464:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3465:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3465:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3466:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8095);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3479:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==24) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3479:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall8108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3483:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3484:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3484:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3485:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8129);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3501:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==37) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3501:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleXConstructorCall8142); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3505:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3506:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3506:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3507:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8163);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleXConstructorCall8177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleXConstructorCall8191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3531:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt61=3;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3531:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3531:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3531:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3548:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3549:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8263);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3566:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3566:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3566:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3566:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3567:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3567:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3568:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8291);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3584:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==37) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3584:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleXConstructorCall8304); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3588:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3589:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3589:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3590:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8325);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall8342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3610:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3610:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3615:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3616:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8373);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3640:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3641:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3642:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8410);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8420); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3649:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3652:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3653:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3653:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3653:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3653:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3654:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3659:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==60) ) {
                alt63=1;
            }
            else if ( (LA63_0==61) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3659:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXBooleanLiteral8467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3664:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3664:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3665:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3665:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3666:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,61,FOLLOW_61_in_ruleXBooleanLiteral8491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3687:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3688:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3689:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8541);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8551); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3696:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3699:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3700:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3700:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3700:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3700:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3701:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXNullLiteral8597); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3718:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3719:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3720:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8633);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8643); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3727:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3730:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3731:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3731:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3731:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3731:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3732:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3737:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3738:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3738:1: (lv_value_1_0= RULE_INT )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3739:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3763:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3764:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3765:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8735);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8745); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3772:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3775:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3776:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3776:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3776:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3776:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3777:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3782:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3783:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3783:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3784:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral8796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3808:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3809:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3810:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8837);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral8847); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3817:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3820:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3821:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3821:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3821:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3821:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3822:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXTypeLiteral8893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXTypeLiteral8905); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3835:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3836:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3836:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3837:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8928);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXTypeLiteral8940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3862:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3863:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3864:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8976);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression8986); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3871:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3874:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3875:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3875:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3875:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3875:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3876:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXThrowExpression9032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3885:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3886:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3886:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3887:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9053);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3911:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3912:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3913:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9089);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9099); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3920:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3923:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3924:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3924:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3924:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3924:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3925:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXReturnExpression9145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3934:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3934:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3939:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3940:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9176);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3964:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3965:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3966:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9213);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9223); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3973:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3976:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3977:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3977:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3977:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3977:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3978:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXTryCatchFinallyExpression9269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3987:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3988:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3988:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3989:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9290);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4005:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==68) ) {
                alt67=1;
            }
            else if ( (LA67_0==67) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4005:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4005:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4005:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4005:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==68) ) {
                            int LA65_2 = input.LA(2);

                            if ( (synpred27_InternalHelloXbase()) ) {
                                alt65=1;
                            }


                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4005:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4007:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4008:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9320);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4024:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==67) ) {
                        int LA66_1 = input.LA(2);

                        if ( (synpred28_InternalHelloXbase()) ) {
                            alt66=1;
                        }
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4024:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4024:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4024:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,67,FOLLOW_67_in_ruleXTryCatchFinallyExpression9342); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4029:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4030:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4030:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4031:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9364);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4048:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4048:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4048:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_67_in_ruleXTryCatchFinallyExpression9386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4052:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4053:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4053:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4054:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9407);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4078:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4079:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4080:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9445);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9455); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4087:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4090:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4091:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4091:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4091:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4091:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4091:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleXCatchClause9500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleXCatchClause9513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4100:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4101:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4101:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4102:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9534);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleXCatchClause9546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4122:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4123:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4123:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4124:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9567);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4148:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4149:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4150:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9604);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9615); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4157:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4160:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4161:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4161:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4162:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9662);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4172:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==34) ) {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==RULE_ID) ) {
                        int LA68_3 = input.LA(3);

                        if ( (synpred30_InternalHelloXbase()) ) {
                            alt68=1;
                        }


                    }


                }


                switch (alt68) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4172:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4172:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4172:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleQualifiedName9690); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9713);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4199:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4200:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4201:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9760);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference9770); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4208:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4211:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4212:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4212:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                alt70=1;
            }
            else if ( (LA70_0==38||LA70_0==69) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4212:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4212:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4213:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9818);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4221:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==40) ) {
                            int LA69_2 = input.LA(2);

                            if ( (LA69_2==42) ) {
                                int LA69_3 = input.LA(3);

                                if ( (synpred31_InternalHelloXbase()) ) {
                                    alt69=1;
                                }


                            }


                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4221:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4224:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4224:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4224:6: ()
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4225:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleJvmTypeReference9856); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleJvmTypeReference9868); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4240:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9900);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4256:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4257:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4258:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9935);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef9945); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4265:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4268:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4269:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4269:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4269:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4269:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==38) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4269:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleXFunctionTypeRef9983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4273:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4274:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4274:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4275:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10004);
                    lv_paramTypes_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                      	        }
                             		add(
                             			current, 
                             			"paramTypes",
                              		lv_paramTypes_1_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4291:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==37) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4291:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXFunctionTypeRef10017); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4295:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4296:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4296:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4297:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10038);
                    	    lv_paramTypes_3_0=ruleJvmTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"paramTypes",
                    	              		lv_paramTypes_3_0, 
                    	              		"JvmTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXFunctionTypeRef10052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,69,FOLLOW_69_in_ruleXFunctionTypeRef10066); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4321:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4322:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4322:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4323:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10087);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4347:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4348:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4349:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10123);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10133); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4356:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4359:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4360:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4360:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4360:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4360:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4361:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4361:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4362:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10181);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4375:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4375:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4375:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4375:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleJvmParameterizedTypeReference10202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4380:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4381:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4381:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4382:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10224);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4398:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==37) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4398:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleJvmParameterizedTypeReference10237); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4402:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4403:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4403:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4404:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10258);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleJvmParameterizedTypeReference10272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4432:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4433:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4434:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10310);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10320); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4441:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4444:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4445:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4445:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID||LA75_0==38||LA75_0==69) ) {
                alt75=1;
            }
            else if ( (LA75_0==70) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4446:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10367);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4456:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10394);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4472:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4473:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4474:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10429);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10439); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4481:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4484:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4485:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4485:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4485:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4485:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4486:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleJvmWildcardTypeReference10485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4495:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt76=3;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==71) ) {
                alt76=1;
            }
            else if ( (LA76_0==57) ) {
                alt76=2;
            }
            switch (alt76) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4495:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4495:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4496:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4496:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4497:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10507);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4514:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4514:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4515:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4515:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4516:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10534);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4540:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4541:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4542:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10572);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound10582); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4549:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4552:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4553:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4553:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4553:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleJvmUpperBound10619); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4557:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4558:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4558:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4559:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10640);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4583:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4584:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4585:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10676);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10686); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4592:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4595:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4596:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4596:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4596:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleJvmUpperBoundAnded10723); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4600:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4601:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4601:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4602:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10744);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4626:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4627:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4628:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10780);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound10790); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4635:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4638:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4639:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4639:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4639:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleJvmLowerBound10827); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4643:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4644:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4644:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4645:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10848);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4671:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4672:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4673:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID10887);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID10898); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4680:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4683:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4684:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID10937); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalHelloXbase
    public final void synpred1_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:272:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:272:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:272:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:272:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:272:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:273:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:273:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:274:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:274:1: ( ruleOpMultiAssign )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:275:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloXbase563);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalHelloXbase

    // $ANTLR start synpred2_InternalHelloXbase
    public final void synpred2_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:400:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:400:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:400:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:400:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:400:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:401:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:401:2: ( ( ruleOpOr ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:402:1: ( ruleOpOr )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:402:1: ( ruleOpOr )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:403:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalHelloXbase911);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalHelloXbase

    // $ANTLR start synpred3_InternalHelloXbase
    public final void synpred3_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:501:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:501:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:501:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:501:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:501:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:502:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:502:2: ( ( ruleOpAnd ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:503:1: ( ruleOpAnd )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:503:1: ( ruleOpAnd )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:504:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalHelloXbase1170);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalHelloXbase

    // $ANTLR start synpred4_InternalHelloXbase
    public final void synpred4_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:602:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:602:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:602:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:602:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:602:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:603:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:603:2: ( ( ruleOpEquality ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:604:1: ( ruleOpEquality )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:604:1: ( ruleOpEquality )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:605:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalHelloXbase1429);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalHelloXbase

    // $ANTLR start synpred5_InternalHelloXbase
    public final void synpred5_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:710:4: ( ( () 'instanceof' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:710:5: ( () 'instanceof' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:710:5: ( () 'instanceof' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:710:6: () 'instanceof'
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:710:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:711:1: 
        {
        }

        match(input,20,FOLLOW_20_in_synpred5_InternalHelloXbase1705); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalHelloXbase

    // $ANTLR start synpred6_InternalHelloXbase
    public final void synpred6_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:738:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:738:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:738:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:738:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:738:10: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:739:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:739:2: ( ( ruleOpCompare ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:740:1: ( ruleOpCompare )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:740:1: ( ruleOpCompare )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:741:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXbase1778);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalHelloXbase

    // $ANTLR start synpred7_InternalHelloXbase
    public final void synpred7_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:860:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:860:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:860:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:860:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:860:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:861:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:861:2: ( ( ruleOpOther ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:862:1: ( ruleOpOther )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:862:1: ( ruleOpOther )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:863:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalHelloXbase2097);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalHelloXbase

    // $ANTLR start synpred8_InternalHelloXbase
    public final void synpred8_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:968:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:968:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:968:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:968:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:968:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:969:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:969:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:970:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:970:1: ( ruleOpAdd )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:971:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalHelloXbase2377);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalHelloXbase

    // $ANTLR start synpred9_InternalHelloXbase
    public final void synpred9_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1076:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1076:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1076:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1076:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1076:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1077:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1077:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1078:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1078:1: ( ruleOpMulti )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1079:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalHelloXbase2657);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalHelloXbase

    // $ANTLR start synpred10_InternalHelloXbase
    public final void synpred10_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1309:3: ( ( () 'as' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1309:4: ( () 'as' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1309:4: ( () 'as' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1309:5: () 'as'
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1309:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1310:1: 
        {
        }

        match(input,33,FOLLOW_33_in_synpred10_InternalHelloXbase3251); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalHelloXbase

    // $ANTLR start synpred11_InternalHelloXbase
    public final void synpred11_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1369:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1369:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1369:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1369:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1369:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1370:1: 
        {
        }

        match(input,34,FOLLOW_34_in_synpred11_InternalHelloXbase3405); if (state.failed) return ;
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1371:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1372:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1372:1: ( ruleValidID )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1373:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalHelloXbase3414);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalHelloXbase3420);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalHelloXbase

    // $ANTLR start synpred12_InternalHelloXbase
    public final void synpred12_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1427:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1427:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1427:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1427:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1427:10: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1428:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1428:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt77=3;
        switch ( input.LA(1) ) {
        case 34:
            {
            alt77=1;
            }
            break;
        case 35:
            {
            alt77=2;
            }
            break;
        case 36:
            {
            alt77=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 77, 0, input);

            throw nvae;
        }

        switch (alt77) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1428:4: '.'
                {
                match(input,34,FOLLOW_34_in_synpred12_InternalHelloXbase3523); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1430:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1430:6: ( ( '?.' ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1431:1: ( '?.' )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1431:1: ( '?.' )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1432:2: '?.'
                {
                match(input,35,FOLLOW_35_in_synpred12_InternalHelloXbase3537); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1437:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1437:6: ( ( '*.' ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1438:1: ( '*.' )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1438:1: ( '*.' )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1439:2: '*.'
                {
                match(input,36,FOLLOW_36_in_synpred12_InternalHelloXbase3557); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalHelloXbase

    // $ANTLR start synpred13_InternalHelloXbase
    public final void synpred13_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1548:4: ( ( '(' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1549:1: ( '(' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1549:1: ( '(' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1550:2: '('
        {
        match(input,38,FOLLOW_38_in_synpred13_InternalHelloXbase3784); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHelloXbase

    // $ANTLR start synpred14_InternalHelloXbase
    public final void synpred14_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1569:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1569:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1569:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1569:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1569:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1570:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1570:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt79=2;
        int LA79_0 = input.LA(1);

        if ( (LA79_0==RULE_ID||LA79_0==38||LA79_0==69) ) {
            alt79=1;
        }
        switch (alt79) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1570:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1570:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1571:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1571:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1572:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXbase3836);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1574:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop78:
                do {
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==37) ) {
                        alt78=1;
                    }


                    switch (alt78) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1574:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,37,FOLLOW_37_in_synpred14_InternalHelloXbase3843); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1575:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1576:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1576:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1577:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXbase3850);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop78;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1579:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1580:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1580:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1581:2: '|'
        {
        match(input,41,FOLLOW_41_in_synpred14_InternalHelloXbase3864); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHelloXbase

    // $ANTLR start synpred15_InternalHelloXbase
    public final void synpred15_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1648:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1649:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1649:1: ( ruleXClosure )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1650:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalHelloXbase3982);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHelloXbase

    // $ANTLR start synpred16_InternalHelloXbase
    public final void synpred16_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1931:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1931:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1931:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1931:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1931:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==RULE_ID||LA81_0==38||LA81_0==69) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1931:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1931:5: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1932:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1932:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1933:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase4755);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1935:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop80:
                do {
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==37) ) {
                        alt80=1;
                    }


                    switch (alt80) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1935:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,37,FOLLOW_37_in_synpred16_InternalHelloXbase4762); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1936:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1937:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1937:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1938:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase4769);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop80;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1940:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1941:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1941:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1942:2: '|'
        {
        match(input,41,FOLLOW_41_in_synpred16_InternalHelloXbase4783); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHelloXbase

    // $ANTLR start synpred18_InternalHelloXbase
    public final void synpred18_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2301:4: ( 'else' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2301:6: 'else'
        {
        match(input,45,FOLLOW_45_in_synpred18_InternalHelloXbase5566); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalHelloXbase

    // $ANTLR start synpred19_InternalHelloXbase
    public final void synpred19_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2355:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2355:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2355:3: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2355:4: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2355:4: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2356:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2356:1: ( ruleValidID )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2357:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalHelloXbase5706);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,47,FOLLOW_47_in_synpred19_InternalHelloXbase5712); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalHelloXbase

    // $ANTLR start synpred20_InternalHelloXbase
    public final void synpred20_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2930:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2930:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2930:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2930:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2930:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2931:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2931:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2932:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalHelloXbase6952);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2934:2: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2935:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2935:1: ( ruleValidID )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2936:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalHelloXbase6961);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalHelloXbase

    // $ANTLR start synpred21_InternalHelloXbase
    public final void synpred21_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3234:4: ( ( '(' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3235:1: ( '(' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3235:1: ( '(' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3236:2: '('
        {
        match(input,38,FOLLOW_38_in_synpred21_InternalHelloXbase7523); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalHelloXbase

    // $ANTLR start synpred22_InternalHelloXbase
    public final void synpred22_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3255:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3255:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3255:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3255:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3255:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3256:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3256:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt85=2;
        int LA85_0 = input.LA(1);

        if ( (LA85_0==RULE_ID||LA85_0==38||LA85_0==69) ) {
            alt85=1;
        }
        switch (alt85) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3256:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3256:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3257:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3257:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3258:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalHelloXbase7575);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3260:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop84:
                do {
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==37) ) {
                        alt84=1;
                    }


                    switch (alt84) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3260:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,37,FOLLOW_37_in_synpred22_InternalHelloXbase7582); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3261:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3262:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3262:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3263:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalHelloXbase7589);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop84;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3265:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3266:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3266:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3267:2: '|'
        {
        match(input,41,FOLLOW_41_in_synpred22_InternalHelloXbase7603); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalHelloXbase

    // $ANTLR start synpred23_InternalHelloXbase
    public final void synpred23_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3334:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3335:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3335:1: ( ruleXClosure )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3336:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalHelloXbase7721);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalHelloXbase

    // $ANTLR start synpred24_InternalHelloXbase
    public final void synpred24_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3531:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3531:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3531:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3531:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3531:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3532:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3532:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt87=2;
        int LA87_0 = input.LA(1);

        if ( (LA87_0==RULE_ID||LA87_0==38||LA87_0==69) ) {
            alt87=1;
        }
        switch (alt87) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3532:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3532:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3533:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3533:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3534:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalHelloXbase8212);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3536:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop86:
                do {
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==37) ) {
                        alt86=1;
                    }


                    switch (alt86) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3536:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,37,FOLLOW_37_in_synpred24_InternalHelloXbase8219); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3537:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3538:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3538:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3539:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalHelloXbase8226);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop86;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3541:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3542:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3542:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3543:2: '|'
        {
        match(input,41,FOLLOW_41_in_synpred24_InternalHelloXbase8240); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalHelloXbase

    // $ANTLR start synpred25_InternalHelloXbase
    public final void synpred25_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3610:2: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3611:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3611:1: ( ruleXClosure )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3612:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred25_InternalHelloXbase8356);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalHelloXbase

    // $ANTLR start synpred26_InternalHelloXbase
    public final void synpred26_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3934:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3935:1: ( ruleXExpression )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3935:1: ( ruleXExpression )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3936:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred26_InternalHelloXbase9159);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalHelloXbase

    // $ANTLR start synpred27_InternalHelloXbase
    public final void synpred27_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4005:5: ( 'catch' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4005:7: 'catch'
        {
        match(input,68,FOLLOW_68_in_synpred27_InternalHelloXbase9304); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalHelloXbase

    // $ANTLR start synpred28_InternalHelloXbase
    public final void synpred28_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4024:5: ( 'finally' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4024:7: 'finally'
        {
        match(input,67,FOLLOW_67_in_synpred28_InternalHelloXbase9334); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalHelloXbase

    // $ANTLR start synpred30_InternalHelloXbase
    public final void synpred30_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4172:3: ( '.' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4173:2: '.'
        {
        match(input,34,FOLLOW_34_in_synpred30_InternalHelloXbase9681); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHelloXbase

    // $ANTLR start synpred31_InternalHelloXbase
    public final void synpred31_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4221:2: ( ( () '[' ']' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4221:3: ( () '[' ']' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4221:3: ( () '[' ']' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4221:4: () '[' ']'
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4221:4: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4222:1: 
        {
        }

        match(input,40,FOLLOW_40_in_synpred31_InternalHelloXbase9833); if (state.failed) return ;
        match(input,42,FOLLOW_42_in_synpred31_InternalHelloXbase9837); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalHelloXbase

    // $ANTLR start synpred32_InternalHelloXbase
    public final void synpred32_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4375:4: ( '<' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4375:6: '<'
        {
        match(input,24,FOLLOW_24_in_synpred32_InternalHelloXbase10194); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalHelloXbase

    // Delegated rules

    public final boolean synpred10_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA74 dfa74 = new DFA74(this);
    static final String DFA24_eotS =
        "\74\uffff";
    static final String DFA24_eofS =
        "\1\2\73\uffff";
    static final String DFA24_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA24_maxS =
        "\1\105\1\0\72\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA24_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA24_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\27\2\1\1\2\2\1\uffff\20\2\1\uffff\13"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1548:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\34\uffff";
    static final String DFA23_eofS =
        "\34\uffff";
    static final String DFA23_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA23_maxS =
        "\1\105\2\0\31\uffff";
    static final String DFA23_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA23_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\2\5\6\uffff\1\5\12\uffff\1\5\2\uffff\2\5\11\uffff\1\2\1"+
            "\33\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1569:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA23_0==RULE_ID) ) {s = 1;}

                        else if ( (LA23_0==38) ) {s = 2;}

                        else if ( (LA23_0==69) && (synpred14_InternalHelloXbase())) {s = 3;}

                        else if ( (LA23_0==41) && (synpred14_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA23_0>=RULE_INT && LA23_0<=RULE_STRING)||LA23_0==13||LA23_0==24||(LA23_0>=27 && LA23_0<=28)||LA23_0==40||LA23_0==44||LA23_0==46||LA23_0==48||(LA23_0>=52 && LA23_0<=54)||LA23_0==57||(LA23_0>=59 && LA23_0<=66)) ) {s = 5;}

                        else if ( (LA23_0==39) ) {s = 27;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_2 = input.LA(1);

                         
                        int index23_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index23_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\74\uffff";
    static final String DFA25_eofS =
        "\1\2\73\uffff";
    static final String DFA25_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA25_maxS =
        "\1\105\1\0\72\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA25_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA25_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1648:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\36\uffff";
    static final String DFA31_eofS =
        "\36\uffff";
    static final String DFA31_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA31_maxS =
        "\1\105\2\0\33\uffff";
    static final String DFA31_acceptS =
        "\3\uffff\2\1\1\2\30\uffff";
    static final String DFA31_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\2\5\6\uffff\1\5\12\uffff\1\5\2\uffff\2\5\11\uffff\1\2\1"+
            "\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\6\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1931:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_0 = input.LA(1);

                         
                        int index31_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_0==RULE_ID) ) {s = 1;}

                        else if ( (LA31_0==38) ) {s = 2;}

                        else if ( (LA31_0==69) && (synpred16_InternalHelloXbase())) {s = 3;}

                        else if ( (LA31_0==41) && (synpred16_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA31_0>=RULE_INT && LA31_0<=RULE_STRING)||LA31_0==13||LA31_0==24||(LA31_0>=27 && LA31_0<=28)||LA31_0==40||LA31_0==42||LA31_0==44||LA31_0==46||LA31_0==48||(LA31_0>=52 && LA31_0<=57)||(LA31_0>=59 && LA31_0<=66)) ) {s = 5;}

                         
                        input.seek(index31_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\74\uffff";
    static final String DFA54_eofS =
        "\1\2\73\uffff";
    static final String DFA54_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA54_maxS =
        "\1\105\1\0\72\uffff";
    static final String DFA54_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA54_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA54_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\27\2\1\1\2\2\1\uffff\20\2\1\uffff\13"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "3234:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\34\uffff";
    static final String DFA53_eofS =
        "\34\uffff";
    static final String DFA53_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA53_maxS =
        "\1\105\2\0\31\uffff";
    static final String DFA53_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA53_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1\2\5\6\uffff\1\5\12\uffff\1\5\2\uffff\2\5\11\uffff\1\2\1"+
            "\33\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "3255:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==RULE_ID) ) {s = 1;}

                        else if ( (LA53_0==38) ) {s = 2;}

                        else if ( (LA53_0==69) && (synpred22_InternalHelloXbase())) {s = 3;}

                        else if ( (LA53_0==41) && (synpred22_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA53_0>=RULE_INT && LA53_0<=RULE_STRING)||LA53_0==13||LA53_0==24||(LA53_0>=27 && LA53_0<=28)||LA53_0==40||LA53_0==44||LA53_0==46||LA53_0==48||(LA53_0>=52 && LA53_0<=54)||LA53_0==57||(LA53_0>=59 && LA53_0<=66)) ) {s = 5;}

                        else if ( (LA53_0==39) ) {s = 27;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_1 = input.LA(1);

                         
                        int index53_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index53_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_2 = input.LA(1);

                         
                        int index53_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index53_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\74\uffff";
    static final String DFA55_eofS =
        "\1\2\73\uffff";
    static final String DFA55_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA55_maxS =
        "\1\105\1\0\72\uffff";
    static final String DFA55_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA55_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA55_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "3334:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\34\uffff";
    static final String DFA61_eofS =
        "\34\uffff";
    static final String DFA61_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA61_maxS =
        "\1\105\2\0\31\uffff";
    static final String DFA61_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA61_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\1\2\5\6\uffff\1\5\12\uffff\1\5\2\uffff\2\5\11\uffff\1\2\1"+
            "\33\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "3531:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_0==RULE_ID) ) {s = 1;}

                        else if ( (LA61_0==38) ) {s = 2;}

                        else if ( (LA61_0==69) && (synpred24_InternalHelloXbase())) {s = 3;}

                        else if ( (LA61_0==41) && (synpred24_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA61_0>=RULE_INT && LA61_0<=RULE_STRING)||LA61_0==13||LA61_0==24||(LA61_0>=27 && LA61_0<=28)||LA61_0==40||LA61_0==44||LA61_0==46||LA61_0==48||(LA61_0>=52 && LA61_0<=54)||LA61_0==57||(LA61_0>=59 && LA61_0<=66)) ) {s = 5;}

                        else if ( (LA61_0==39) ) {s = 27;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\74\uffff";
    static final String DFA62_eofS =
        "\1\2\73\uffff";
    static final String DFA62_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA62_maxS =
        "\1\105\1\0\72\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA62_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "3610:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\74\uffff";
    static final String DFA64_eofS =
        "\1\31\73\uffff";
    static final String DFA64_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA64_maxS =
        "\1\105\30\0\43\uffff";
    static final String DFA64_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\1\15\1\17\6\uffff\1\2\1\uffff\11\31\1\10\2\31\1\4\1\3\11"+
            "\31\1\30\1\31\1\12\1\uffff\2\31\1\21\1\31\1\7\1\31\1\6\3\31"+
            "\1\22\1\23\1\24\2\31\1\11\1\uffff\1\5\1\13\1\14\1\16\1\20\1"+
            "\25\1\26\1\27\3\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3934:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_3 = input.LA(1);

                         
                        int index64_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA64_4 = input.LA(1);

                         
                        int index64_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA64_5 = input.LA(1);

                         
                        int index64_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA64_6 = input.LA(1);

                         
                        int index64_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA64_7 = input.LA(1);

                         
                        int index64_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA64_8 = input.LA(1);

                         
                        int index64_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA64_9 = input.LA(1);

                         
                        int index64_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA64_10 = input.LA(1);

                         
                        int index64_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA64_11 = input.LA(1);

                         
                        int index64_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA64_12 = input.LA(1);

                         
                        int index64_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA64_13 = input.LA(1);

                         
                        int index64_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA64_14 = input.LA(1);

                         
                        int index64_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA64_15 = input.LA(1);

                         
                        int index64_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA64_16 = input.LA(1);

                         
                        int index64_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA64_17 = input.LA(1);

                         
                        int index64_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA64_18 = input.LA(1);

                         
                        int index64_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA64_19 = input.LA(1);

                         
                        int index64_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA64_20 = input.LA(1);

                         
                        int index64_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA64_21 = input.LA(1);

                         
                        int index64_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA64_22 = input.LA(1);

                         
                        int index64_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA64_23 = input.LA(1);

                         
                        int index64_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA64_24 = input.LA(1);

                         
                        int index64_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index64_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\74\uffff";
    static final String DFA74_eofS =
        "\1\2\73\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA74_maxS =
        "\1\105\1\0\72\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA74_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\11\2\1\1\20\2\1\uffff\20\2\1\uffff"+
            "\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "4375:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGreeting213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGreeting247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGreeting270 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGreeting282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment476 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment492 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment542 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment595 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpSingleAssign706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpMultiAssign794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression890 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression943 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression966 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpOr1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1149 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1202 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1225 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpAnd1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1408 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1461 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1484 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpEquality1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpEquality1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1688 = new BitSet(new long[]{0x0000000001F00002L});
    public static final BitSet FOLLOW_20_in_ruleXRelationalExpression1724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression1749 = new BitSet(new long[]{0x0000000001F00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1810 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1833 = new BitSet(new long[]{0x0000000001F00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare1873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpCompare1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpCompare1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2076 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2129 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2152 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2356 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2409 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2432 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpAdd2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpAdd2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2636 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2689 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2712 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti2751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpMulti2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpMulti2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpMulti2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpMulti2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation2897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation2965 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleOpUnary3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpUnary3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpUnary3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3235 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleXCastedExpression3270 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3293 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3388 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_34_in_ruleXMemberFeatureCall3437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3460 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3476 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3498 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_34_in_ruleXMemberFeatureCall3584 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_35_in_ruleXMemberFeatureCall3608 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall3645 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall3674 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3695 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall3708 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3729 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_23_in_ruleXMemberFeatureCall3743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3768 = new BitSet(new long[]{0x0000015C00000002L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall3802 = new BitSet(new long[]{0xFA7153C019002070L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall3887 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall3915 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall3928 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall3949 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall3966 = new BitSet(new long[]{0x0000011C00000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall3999 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure4682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXClosure4738 = new BitSet(new long[]{0xFBF1574019002070L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure4809 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_ruleXClosure4822 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure4843 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_ruleXClosure4865 = new BitSet(new long[]{0xFBF1554019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure4902 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXClosure4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure4950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5016 = new BitSet(new long[]{0xFBF1594019002072L,0x0000000000000007L});
    public static final BitSet FOLLOW_43_in_ruleXExpressionInClosure5029 = new BitSet(new long[]{0xFBF1514019002072L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5187 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_ruleXShortClosure5200 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5221 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_ruleXShortClosure5243 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXParenthesizedExpression5362 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5384 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXParenthesizedExpression5395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression5487 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXIfExpression5499 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5520 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXIfExpression5532 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5553 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression5574 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXSwitchExpression5690 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression5731 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression5743 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression5767 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression5779 = new BitSet(new long[]{0x0008804000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression5800 = new BitSet(new long[]{0x000E804000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression5814 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression5826 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression5847 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart5897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart5907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart5953 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_ruleXCasePart5967 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart5988 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXCasePart6002 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXForLoopExpression6115 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXForLoopExpression6127 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6148 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXForLoopExpression6160 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6181 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXForLoopExpression6193 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXWhileExpression6306 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXWhileExpression6318 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6339 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXWhileExpression6351 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXDoWhileExpression6464 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6485 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXDoWhileExpression6497 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXDoWhileExpression6509 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6530 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXDoWhileExpression6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXBlockExpression6634 = new BitSet(new long[]{0xFBF5514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6656 = new BitSet(new long[]{0xFBF5594019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_43_in_ruleXBlockExpression6669 = new BitSet(new long[]{0xFBF5514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_50_in_ruleXBlockExpression6685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration6840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration6850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXVariableDeclaration6903 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_56_in_ruleXVariableDeclaration6934 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration6982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7003 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7032 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleXVariableDeclaration7046 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7399 = new BitSet(new long[]{0x0200000001000010L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall7413 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7434 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_37_in_ruleXFeatureCall7447 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7468 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_23_in_ruleXFeatureCall7482 = new BitSet(new long[]{0x0200000001000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7507 = new BitSet(new long[]{0x0000014000000002L});
    public static final BitSet FOLLOW_38_in_ruleXFeatureCall7541 = new BitSet(new long[]{0xFA7153C019002070L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7626 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7654 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_ruleXFeatureCall7667 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7688 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall7705 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall7738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper7834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleIdOrSuper7858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier7899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier7910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier7957 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleStaticQualifier7975 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXConstructorCall8072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8095 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall8108 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8129 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_37_in_ruleXConstructorCall8142 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8163 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_23_in_ruleXConstructorCall8177 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXConstructorCall8191 = new BitSet(new long[]{0xFA7153C019002070L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8263 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8291 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_ruleXConstructorCall8304 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8325 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall8342 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXBooleanLiteral8467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXBooleanLiteral8491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXNullLiteral8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral8847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXTypeLiteral8893 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXTypeLiteral8905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8928 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXTypeLiteral8940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression8986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXThrowExpression9032 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXReturnExpression9145 = new BitSet(new long[]{0xFA71514019002072L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXTryCatchFinallyExpression9269 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9320 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleXTryCatchFinallyExpression9342 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTryCatchFinallyExpression9386 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXCatchClause9500 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXCatchClause9513 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9534 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXCatchClause9546 = new BitSet(new long[]{0xFA71514019002070L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9662 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleQualifiedName9690 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9713 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference9770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9818 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleJvmTypeReference9856 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleJvmTypeReference9868 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef9945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXFunctionTypeRef9983 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10004 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_37_in_ruleXFunctionTypeRef10017 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10038 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFunctionTypeRef10052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleXFunctionTypeRef10066 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10181 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleJvmParameterizedTypeReference10202 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10224 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_37_in_ruleJvmParameterizedTypeReference10237 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10258 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_23_in_ruleJvmParameterizedTypeReference10272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleJvmWildcardTypeReference10485 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound10582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleJvmUpperBound10619 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleJvmUpperBoundAnded10723 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound10790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleJvmLowerBound10827 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID10887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID10898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID10937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloXbase563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHelloXbase911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHelloXbase1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHelloXbase1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred5_InternalHelloXbase1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXbase1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHelloXbase2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalHelloXbase2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalHelloXbase2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred10_InternalHelloXbase3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred11_InternalHelloXbase3405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalHelloXbase3414 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalHelloXbase3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred12_InternalHelloXbase3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred12_InternalHelloXbase3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred12_InternalHelloXbase3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred13_InternalHelloXbase3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXbase3836 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_synpred14_InternalHelloXbase3843 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXbase3850 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_synpred14_InternalHelloXbase3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalHelloXbase3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase4755 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_synpred16_InternalHelloXbase4762 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase4769 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_synpred16_InternalHelloXbase4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred18_InternalHelloXbase5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalHelloXbase5706 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_synpred19_InternalHelloXbase5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalHelloXbase6952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalHelloXbase6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred21_InternalHelloXbase7523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalHelloXbase7575 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_synpred22_InternalHelloXbase7582 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalHelloXbase7589 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_synpred22_InternalHelloXbase7603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalHelloXbase7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalHelloXbase8212 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_37_in_synpred24_InternalHelloXbase8219 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalHelloXbase8226 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_41_in_synpred24_InternalHelloXbase8240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred25_InternalHelloXbase8356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred26_InternalHelloXbase9159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_synpred27_InternalHelloXbase9304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_synpred28_InternalHelloXbase9334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred30_InternalHelloXbase9681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred31_InternalHelloXbase9833 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred31_InternalHelloXbase9837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred32_InternalHelloXbase10194 = new BitSet(new long[]{0x0000000000000002L});

}