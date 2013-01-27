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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'from'", "'!'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'extends'", "'static'", "'import'", "'extension'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'&'"
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
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=6;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_DECIMAL=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
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
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_importSection_0_0= ruleXImportSection ) )? ( (lv_greetings_1_0= ruleGreeting ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_importSection_0_0 = null;

        EObject lv_greetings_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:79:28: ( ( ( (lv_importSection_0_0= ruleXImportSection ) )? ( (lv_greetings_1_0= ruleGreeting ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:80:1: ( ( (lv_importSection_0_0= ruleXImportSection ) )? ( (lv_greetings_1_0= ruleGreeting ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:80:1: ( ( (lv_importSection_0_0= ruleXImportSection ) )? ( (lv_greetings_1_0= ruleGreeting ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:80:2: ( (lv_importSection_0_0= ruleXImportSection ) )? ( (lv_greetings_1_0= ruleGreeting ) )*
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:80:2: ( (lv_importSection_0_0= ruleXImportSection ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==65) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:81:1: (lv_importSection_0_0= ruleXImportSection )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:81:1: (lv_importSection_0_0= ruleXImportSection )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:82:3: lv_importSection_0_0= ruleXImportSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelAccess().getImportSectionXImportSectionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXImportSection_in_ruleModel131);
                    lv_importSection_0_0=ruleXImportSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelRule());
                      	        }
                             		set(
                             			current, 
                             			"importSection",
                              		lv_importSection_0_0, 
                              		"XImportSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:98:3: ( (lv_greetings_1_0= ruleGreeting ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:99:1: (lv_greetings_1_0= ruleGreeting )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:99:1: (lv_greetings_1_0= ruleGreeting )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:100:3: lv_greetings_1_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel153);
            	    lv_greetings_1_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"greetings",
            	              		lv_greetings_1_0, 
            	              		"Greeting");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:124:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:125:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:126:2: iv_ruleGreeting= ruleGreeting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreetingRule()); 
            }
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting190);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreeting; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting200); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:133:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:136:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:137:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:137:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:137:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGreeting237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:141:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:142:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:142:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:143:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting254); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGreeting271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getFromKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:163:1: ( (lv_expression_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:164:1: (lv_expression_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:164:1: (lv_expression_3_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:165:3: lv_expression_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGreetingAccess().getExpressionXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleGreeting292);
            lv_expression_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGreetingRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleGreeting304); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:193:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:194:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:195:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression340);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression350); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:202:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:205:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:207:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression396);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:223:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:224:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:225:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment430);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment440); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:232:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:235:28: ( ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:236:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:236:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==16) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||(LA4_1>=RULE_ID && LA4_1<=RULE_DECIMAL)||LA4_1==15||(LA4_1>=17 && LA4_1<=46)||(LA4_1>=48 && LA4_1<=78)) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 63:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==16) ) {
                    alt4=1;
                }
                else if ( (LA4_2==EOF||(LA4_2>=RULE_ID && LA4_2<=RULE_DECIMAL)||LA4_2==15||(LA4_2>=17 && LA4_2<=46)||(LA4_2>=48 && LA4_2<=67)||(LA4_2>=69 && LA4_2<=78)) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 64:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==16) ) {
                    alt4=1;
                }
                else if ( (LA4_3==EOF||(LA4_3>=RULE_ID && LA4_3<=RULE_DECIMAL)||LA4_3==15||(LA4_3>=17 && LA4_3<=46)||(LA4_3>=48 && LA4_3<=67)||(LA4_3>=69 && LA4_3<=78)) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 65:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==EOF||(LA4_4>=RULE_ID && LA4_4<=RULE_DECIMAL)||LA4_4==15||(LA4_4>=17 && LA4_4<=46)||(LA4_4>=48 && LA4_4<=67)||(LA4_4>=69 && LA4_4<=78)) ) {
                    alt4=2;
                }
                else if ( (LA4_4==16) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==EOF||(LA4_5>=RULE_ID && LA4_5<=RULE_DECIMAL)||LA4_5==15||(LA4_5>=17 && LA4_5<=46)||(LA4_5>=48 && LA4_5<=67)||(LA4_5>=69 && LA4_5<=78)) ) {
                    alt4=2;
                }
                else if ( (LA4_5==16) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 15:
            case 26:
            case 33:
            case 34:
            case 44:
            case 46:
            case 50:
            case 52:
            case 54:
            case 58:
            case 59:
            case 60:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt4=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:236:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:236:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:236:3: () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:236:3: ()
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:237:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:242:2: ( ( ruleFeatureCallID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:243:1: ( ruleFeatureCallID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:243:1: ( ruleFeatureCallID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:244:3: ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXAssignment498);
                    ruleFeatureCallID();

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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment514);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:265:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:266:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:266:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:267:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment534);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:284:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:284:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:285:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment564);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:293:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==17) ) {
                        int LA3_1 = input.LA(2);

                        if ( (synpred1_InternalHelloXbase()) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:293:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:293:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:293:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:298:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:298:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:298:7: ()
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:299:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:304:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:305:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:305:1: ( ruleOpMultiAssign )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:306:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment617);
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

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:319:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:320:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:320:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:321:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment640);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:345:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:346:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:347:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign680);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign691); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:354:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:357:28: (kw= '=' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:359:2: kw= '='
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleOpSingleAssign728); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:372:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:373:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:374:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign768);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign779); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:381:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:384:28: (kw= '+=' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:386:2: kw= '+='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpMultiAssign816); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:399:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:400:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:401:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression855);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression865); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:408:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:411:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:412:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:412:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:413:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression912);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:421:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred2_InternalHelloXbase()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:421:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:421:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:421:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:426:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:426:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:426:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:427:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:432:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:433:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:433:1: ( ruleOpOr )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:434:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression965);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:447:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:448:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:448:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:449:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression988);
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:473:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:474:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:475:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1027);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1038); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:482:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:485:28: (kw= '||' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:487:2: kw= '||'
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpOr1075); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:500:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:501:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:502:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1114);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1124); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:509:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:512:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:513:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:513:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:514:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1171);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:522:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred3_InternalHelloXbase()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:522:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:522:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:522:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:527:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:527:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:527:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:528:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:533:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:534:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:534:1: ( ruleOpAnd )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:535:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1224);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:548:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:549:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:549:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:550:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1247);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:574:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:575:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:576:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1286);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1297); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:583:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:586:28: (kw= '&&' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:588:2: kw= '&&'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpAnd1334); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:601:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:602:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:603:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1373);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1383); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:610:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:613:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:614:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:614:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:615:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1430);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:623:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred4_InternalHelloXbase()) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==21) ) {
                    int LA7_3 = input.LA(2);

                    if ( (synpred4_InternalHelloXbase()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:623:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:623:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:623:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:628:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:628:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:628:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:629:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:634:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:635:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:635:1: ( ruleOpEquality )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:636:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1483);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:649:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:650:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:650:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:651:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1506);
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
            	    break loop7;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:675:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:676:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:677:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1545);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1556); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:684:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:687:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:688:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:688:1: (kw= '==' | kw= '!=' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:689:2: kw= '=='
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOpEquality1594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:696:2: kw= '!='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpEquality1613); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:709:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:710:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:711:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1653);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1663); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:718:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:721:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:722:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:722:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:723:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1710);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:731:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop9:
            do {
                int alt9=3;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA9_2 = input.LA(2);

                    if ( (synpred6_InternalHelloXbase()) ) {
                        alt9=2;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA9_3 = input.LA(2);

                    if ( (synpred6_InternalHelloXbase()) ) {
                        alt9=2;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA9_4 = input.LA(2);

                    if ( (synpred5_InternalHelloXbase()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA9_5 = input.LA(2);

                    if ( (synpred6_InternalHelloXbase()) ) {
                        alt9=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA9_6 = input.LA(2);

                    if ( (synpred6_InternalHelloXbase()) ) {
                        alt9=2;
                    }


                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:731:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:731:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:731:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:731:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:731:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:733:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:733:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:733:6: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:734:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXRelationalExpression1746); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:743:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:744:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:744:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:745:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1769);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
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


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:762:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:762:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:762:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:762:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:762:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:767:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:767:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:767:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:768:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:773:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:774:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:774:1: ( ruleOpCompare )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:775:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1830);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:788:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:789:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:789:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:790:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1853);
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
            	    break loop9;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:814:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:815:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:816:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare1893);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare1904); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:823:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:826:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:827:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:827:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            case 26:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:828:2: kw= '>='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare1942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:835:2: kw= '<='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare1961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:842:2: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare1980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:849:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare1999); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:862:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:863:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:864:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2039);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2049); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:871:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:874:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:875:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:875:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:876:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2096);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:884:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:884:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:884:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:884:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:889:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:889:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:889:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:890:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:895:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:896:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:896:1: ( ruleOpOther )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:897:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2149);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:910:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:911:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:911:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:912:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2172);
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
            	    break loop11;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:936:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:937:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:938:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2211);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2222); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:945:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:948:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:949:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:949:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case 28:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            case 25:
                {
                alt14=4;
                }
                break;
            case 26:
                {
                alt14=5;
                }
                break;
            case 30:
                {
                alt14=6;
                }
                break;
            case 31:
                {
                alt14=7;
                }
                break;
            case 32:
                {
                alt14=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:950:2: kw= '->'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:957:2: kw= '..'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:964:2: kw= '=>'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:970:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:970:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:971:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2318); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:976:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==25) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==25) && (synpred8_InternalHelloXbase())) {
                            alt12=1;
                        }
                        else if ( (LA12_1==EOF||(LA12_1>=RULE_ID && LA12_1<=RULE_DECIMAL)||LA12_1==15||LA12_1==26||(LA12_1>=33 && LA12_1<=34)||LA12_1==44||LA12_1==46||LA12_1==50||LA12_1==52||LA12_1==54||(LA12_1>=58 && LA12_1<=60)||(LA12_1>=63 && LA12_1<=67)||(LA12_1>=69 && LA12_1<=76)) ) {
                            alt12=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:976:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:976:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:976:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:980:5: (kw= '>' kw= '>' )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:981:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2349); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2362); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:994:2: kw= '>'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2383); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1000:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1000:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1001:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1006:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==26) ) {
                        int LA13_1 = input.LA(2);

                        if ( (synpred9_InternalHelloXbase()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1006:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1006:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1006:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1010:5: (kw= '<' kw= '<' )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1011:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2436); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2449); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1024:2: kw= '<'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2470); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1031:2: kw= '<>'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1038:2: kw= '?:'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1045:2: kw= '<=>'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1058:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1059:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1060:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2569);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2579); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1067:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1070:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1071:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1071:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1072:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2626);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1080:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred10_InternalHelloXbase()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==34) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred10_InternalHelloXbase()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1080:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1080:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1080:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1085:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1085:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1085:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1086:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1091:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1092:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1092:1: ( ruleOpAdd )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1093:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2679);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1106:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1107:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1107:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1108:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2702);
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
            	    break loop15;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1132:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1133:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1134:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2741);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2752); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1141:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1144:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1145:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1145:1: (kw= '+' | kw= '-' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            else if ( (LA16_0==34) ) {
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1146:2: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAdd2790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1153:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAdd2809); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1166:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1167:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1168:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2849);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2859); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1175:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1178:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1179:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1179:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1180:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2906);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1188:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred11_InternalHelloXbase()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred11_InternalHelloXbase()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred11_InternalHelloXbase()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred11_InternalHelloXbase()) ) {
                        alt17=1;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1188:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1188:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1188:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1193:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1193:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1193:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1194:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1199:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1200:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1200:1: ( ruleOpMulti )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1201:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2959);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1214:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1215:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1215:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1216:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2982);
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
            	    break loop17;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1240:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1241:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1242:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3021);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3032); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1249:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1252:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1253:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1253:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt18=1;
                }
                break;
            case 36:
                {
                alt18=2;
                }
                break;
            case 37:
                {
                alt18=3;
                }
                break;
            case 38:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1254:2: kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1261:2: kw= '**'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1268:2: kw= '/'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1275:2: kw= '%'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3127); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1288:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1289:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1290:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3167);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3177); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1297:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1300:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1301:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1301:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15||(LA19_0>=33 && LA19_0<=34)) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_DECIMAL)||LA19_0==26||LA19_0==44||LA19_0==46||LA19_0==50||LA19_0==52||LA19_0==54||(LA19_0>=58 && LA19_0<=60)||(LA19_0>=63 && LA19_0<=67)||(LA19_0>=69 && LA19_0<=76)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1301:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1301:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1301:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1301:3: ()
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1302:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1307:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1308:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1308:1: ( ruleOpUnary )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1309:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3235);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1322:2: ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1323:1: (lv_operand_2_0= ruleXUnaryOperation )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1323:1: (lv_operand_2_0= ruleXUnaryOperation )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1324:3: lv_operand_2_0= ruleXUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXUnaryOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation3256);
                    lv_operand_2_0=ruleXUnaryOperation();

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
                              		"XUnaryOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1342:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3285);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1358:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1359:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1360:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3321);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3332); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1367:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1370:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1371:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1371:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt20=1;
                }
                break;
            case 34:
                {
                alt20=2;
                }
                break;
            case 33:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1372:2: kw= '!'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleOpUnary3370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1379:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary3389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1386:2: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpUnary3408); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1399:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1400:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1401:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3448);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3458); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1408:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1411:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1412:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1412:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1413:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3505);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1421:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==39) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred12_InternalHelloXbase()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1421:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1421:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1421:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1423:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1423:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1423:6: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1424:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXCastedExpression3540); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1433:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1434:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1434:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1435:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3563);
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
            	    break loop21;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1459:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1460:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1461:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3601);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3611); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1468:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1471:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1472:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1472:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1473:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3658);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1481:1: ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop29:
            do {
                int alt29=3;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (synpred13_InternalHelloXbase()) ) {
                        alt29=1;
                    }
                    else if ( (synpred14_InternalHelloXbase()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (synpred14_InternalHelloXbase()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA29_4 = input.LA(2);

                    if ( (synpred14_InternalHelloXbase()) ) {
                        alt29=2;
                    }


                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1481:2: ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1481:2: ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1481:3: ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1481:3: ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1481:4: ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1487:25: ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1487:26: () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1487:26: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1488:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall3707); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1497:1: ( ( ruleFeatureCallID ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1498:1: ( ruleFeatureCallID )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1498:1: ( ruleFeatureCallID )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1499:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall3730);
            	    ruleFeatureCallID();

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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3746);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1520:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1521:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1521:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1522:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3768);
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
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1539:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1539:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1539:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1539:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1539:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1555:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1555:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1555:8: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1556:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1561:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case 40:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1561:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall3854); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1566:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1566:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1567:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1567:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1568:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall3878); if (state.failed) return current;
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
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1582:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1582:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1583:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1583:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1584:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall3915); if (state.failed) return current;
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1597:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==26) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1597:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall3944); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1601:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1602:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1602:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1603:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3965);
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

            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1619:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==43) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1619:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall3978); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1623:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1624:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1624:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1625:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3999);
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
            	            	    break loop23;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall4013); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1645:3: ( ( ruleFeatureCallID ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1646:1: ( ruleFeatureCallID )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1646:1: ( ruleFeatureCallID )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1647:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall4038);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1660:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt27=2;
            	    alt27 = dfa27.predict(input);
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1660:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1660:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1660:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1667:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1668:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4072); if (state.failed) return current;
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

            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1681:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt26=3;
            	            alt26 = dfa26.predict(input);
            	            switch (alt26) {
            	                case 1 :
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1681:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1681:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1681:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1698:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1699:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4157);
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
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1716:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1716:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1716:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1716:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1717:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1717:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1718:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4185);
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

            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1734:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop25:
            	                    do {
            	                        int alt25=2;
            	                        int LA25_0 = input.LA(1);

            	                        if ( (LA25_0==43) ) {
            	                            alt25=1;
            	                        }


            	                        switch (alt25) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1734:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4198); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1738:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1739:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1739:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1740:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4219);
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
            	                    	    break loop25;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4236); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1760:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1760:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1763:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1764:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4271);
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
            	    break loop29;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1788:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1789:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1790:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4311);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4321); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1797:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1800:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1801:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1801:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt30=13;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1802:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4368);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1812:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4395);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1822:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4422);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1832:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4449);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1842:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4476);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1852:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4503);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1862:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4530);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1872:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4557);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1882:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4584);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1892:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4611);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1902:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4638);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1912:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4665);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1922:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4692);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1938:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1939:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1940:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4727);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4737); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1947:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1950:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1951:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1951:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt31=6;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) && (synpred18_InternalHelloXbase())) {
                alt31=1;
            }
            else if ( ((LA31_0>=70 && LA31_0<=71)) ) {
                alt31=2;
            }
            else if ( ((LA31_0>=RULE_HEX && LA31_0<=RULE_DECIMAL)) ) {
                alt31=3;
            }
            else if ( (LA31_0==72) ) {
                alt31=4;
            }
            else if ( (LA31_0==RULE_STRING) ) {
                alt31=5;
            }
            else if ( (LA31_0==73) ) {
                alt31=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1951:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1951:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1951:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4797);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1964:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4825);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1974:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4852);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1984:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4879);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1994:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4906);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2004:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4933);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2020:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2021:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2022:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure4968);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure4978); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2029:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2032:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2035:5: ( () otherlv_1= '[' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2035:6: () otherlv_1= '['
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2035:6: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2036:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2045:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2045:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2060:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2060:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2060:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID||LA33_0==29||LA33_0==44) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2060:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2060:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2061:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2061:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2062:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5111);
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

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2078:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==43) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2078:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5124); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2082:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2083:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2083:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2084:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5145);
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
                            	    break loop32;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2100:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2101:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2101:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2102:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5167); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2115:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2116:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2116:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2117:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5204);
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

            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2145:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2146:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2147:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5252);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5262); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2154:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2157:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2158:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2158:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2158:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2158:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2159:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2164:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_DECIMAL)||LA36_0==15||LA36_0==26||(LA36_0>=33 && LA36_0<=34)||LA36_0==44||LA36_0==46||LA36_0==50||LA36_0==52||LA36_0==54||(LA36_0>=58 && LA36_0<=67)||(LA36_0>=69 && LA36_0<=76)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2164:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2164:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2165:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2165:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2166:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5318);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2182:2: (otherlv_2= ';' )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==49) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2182:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXExpressionInClosure5331); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2194:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2195:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2196:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5371);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5381); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2203:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2206:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2207:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2207:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2207:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2207:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2207:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2223:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2223:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2223:7: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2224:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2229:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID||LA38_0==29||LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2229:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2229:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2230:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2230:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2231:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5489);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2247:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==43) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2247:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXShortClosure5502); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2251:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2252:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2252:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2253:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5523);
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
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2269:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2270:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2270:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2271:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,47,FOLLOW_47_in_ruleXShortClosure5545); if (state.failed) return current;
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2284:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2285:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2285:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2286:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5581);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2310:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2311:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2312:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5617);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5627); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2319:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2322:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2323:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2323:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2323:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXParenthesizedExpression5664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5686);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXParenthesizedExpression5697); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2348:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2349:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2350:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5733);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5743); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2357:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2360:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2361:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2361:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2361:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2361:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2362:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression5789); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression5801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2375:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2376:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2376:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2377:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5822);
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

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression5834); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2397:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2398:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2398:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2399:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5855);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2415:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred22_InternalHelloXbase()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2415:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2415:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2415:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression5876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2420:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2421:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2421:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2422:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5898);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2446:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2447:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2448:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5936);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5946); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2455:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2458:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2459:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2459:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2459:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2459:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2460:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression5992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2469:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_DECIMAL)||LA41_0==15||LA41_0==26||(LA41_0>=33 && LA41_0<=34)||LA41_0==46||LA41_0==50||LA41_0==52||LA41_0==54||(LA41_0>=58 && LA41_0<=60)||(LA41_0>=63 && LA41_0<=67)||(LA41_0>=69 && LA41_0<=76)) ) {
                alt41=1;
            }
            else if ( (LA41_0==44) ) {
                int LA41_2 = input.LA(2);

                if ( (LA41_2==RULE_ID) ) {
                    int LA41_3 = input.LA(3);

                    if ( ((LA41_3>=16 && LA41_3<=42)||(LA41_3>=44 && LA41_3<=46)||LA41_3==68) ) {
                        alt41=1;
                    }
                    else if ( (LA41_3==53) && (synpred24_InternalHelloXbase())) {
                        alt41=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA41_2>=RULE_STRING && LA41_2<=RULE_DECIMAL)||LA41_2==15||LA41_2==26||(LA41_2>=33 && LA41_2<=34)||LA41_2==44||LA41_2==46||LA41_2==50||LA41_2==52||LA41_2==54||(LA41_2>=58 && LA41_2<=60)||(LA41_2>=63 && LA41_2<=67)||(LA41_2>=69 && LA41_2<=76)) ) {
                    alt41=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2469:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2469:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2469:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2469:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID) ) {
                        int LA40_1 = input.LA(2);

                        if ( (LA40_1==53) && (synpred23_InternalHelloXbase())) {
                            alt40=1;
                        }
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2469:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2474:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2474:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2474:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2475:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2475:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2476:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6035);
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

                            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6047); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2496:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2497:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2497:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2498:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6071);
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


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2515:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2515:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2515:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2515:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2515:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2521:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2521:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleXSwitchExpression6115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2525:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2526:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2526:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2527:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6136);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2547:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2548:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2548:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2549:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6171);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,45,FOLLOW_45_in_ruleXSwitchExpression6183); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6197); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2573:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID||LA42_0==29||LA42_0==44||LA42_0==53||LA42_0==57) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2574:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2574:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2575:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6218);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2591:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==55) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2591:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6244); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2599:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2600:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2600:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2601:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6265);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2629:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2630:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2631:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6315);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6325); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2638:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2641:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2642:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2642:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2642:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2642:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==29||LA44_0==44) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2643:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2643:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2644:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6371);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2660:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==57) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2660:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXCasePart6385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2664:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2665:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2665:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2666:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6406);
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

            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXCasePart6420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2686:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2687:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2687:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2688:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6441);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2712:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2713:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2714:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6477);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6487); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2721:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2724:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2725:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2725:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2725:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2725:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2726:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXForLoopExpression6533); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXForLoopExpression6545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2739:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2740:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2740:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2741:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6566);
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

            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleXForLoopExpression6578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2761:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2762:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2762:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2763:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6599);
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

            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleXForLoopExpression6611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2783:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2784:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2784:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2785:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6632);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2809:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2810:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2811:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6668);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6678); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2818:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2821:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2822:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2822:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2822:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2822:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2823:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXWhileExpression6724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXWhileExpression6736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2836:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2837:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2837:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2838:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6757);
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

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXWhileExpression6769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2858:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2859:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2859:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2860:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6790);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2884:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2885:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2886:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6826);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6836); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2893:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2896:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2897:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2897:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2897:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2897:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2898:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXDoWhileExpression6882); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2907:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2908:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2908:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2909:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6903);
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

            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression6915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXDoWhileExpression6927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2933:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2934:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2934:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2935:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6948);
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

            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleXDoWhileExpression6960); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2963:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2964:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2965:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6996);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7006); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2972:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2975:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2976:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2976:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2976:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2976:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2977:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXBlockExpression7052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2986:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_DECIMAL)||LA47_0==15||LA47_0==26||(LA47_0>=33 && LA47_0<=34)||LA47_0==44||LA47_0==46||LA47_0==50||LA47_0==52||LA47_0==54||(LA47_0>=58 && LA47_0<=67)||(LA47_0>=69 && LA47_0<=76)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2986:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2986:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2987:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2987:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2988:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7074);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3004:2: (otherlv_3= ';' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==49) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3004:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXBlockExpression7087); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleXBlockExpression7103); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3020:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3021:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3022:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7139);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7149); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3029:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3032:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3033:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3033:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=61 && LA48_0<=62)) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_DECIMAL)||LA48_0==15||LA48_0==26||(LA48_0>=33 && LA48_0<=34)||LA48_0==44||LA48_0==46||LA48_0==50||LA48_0==52||LA48_0==54||(LA48_0>=58 && LA48_0<=60)||(LA48_0>=63 && LA48_0<=67)||(LA48_0>=69 && LA48_0<=76)) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3034:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7196);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3044:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7223);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3060:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3061:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3062:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7258);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7268); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3069:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3072:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3073:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3073:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3073:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3073:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3074:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3079:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==61) ) {
                alt49=1;
            }
            else if ( (LA49_0==62) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3079:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3079:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3080:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3080:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3081:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,61,FOLLOW_61_in_ruleXVariableDeclaration7321); if (state.failed) return current;
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3095:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration7352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3099:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred25_InternalHelloXbase()) ) {
                    alt50=1;
                }
                else if ( (true) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA50_0==44) && (synpred25_InternalHelloXbase())) {
                alt50=1;
            }
            else if ( (LA50_0==29) && (synpred25_InternalHelloXbase())) {
                alt50=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3099:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3099:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3099:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3107:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3107:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3107:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3108:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3108:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3109:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7400);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3125:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3126:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3126:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3127:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7421);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3144:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3144:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3145:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3145:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3146:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7450);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3162:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==16) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3162:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleXVariableDeclaration7464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3166:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3167:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3167:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3168:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7485);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3192:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3193:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3194:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7523);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7533); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3201:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3204:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3205:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3205:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3205:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3205:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_ID||LA52_1==26||LA52_1==40||LA52_1==46) ) {
                    alt52=1;
                }
            }
            else if ( (LA52_0==29||LA52_0==44) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3206:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3206:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3207:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7579);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3223:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3224:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3224:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3225:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7601);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3249:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3250:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3251:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7637);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7647); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3258:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3261:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3262:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3262:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3262:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3262:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3263:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3263:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3264:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7693);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3280:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3281:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3281:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3282:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7714);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3306:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3307:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3308:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7750);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7760); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3315:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3318:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3319:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3319:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3319:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3319:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3320:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3325:2: ( ( ruleStaticQualifier ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==68) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3326:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3326:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3327:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7817);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3340:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==26) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3340:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall7831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3344:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3345:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3345:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3346:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7852);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3362:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==43) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3362:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall7865); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3366:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3367:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3367:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3368:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7886);
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
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall7900); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3388:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3389:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3389:1: ( ruleIdOrSuper )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3390:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7925);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3403:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3403:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3403:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3403:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3410:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3411:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall7959); if (state.failed) return current;
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3424:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt57=3;
                    alt57 = dfa57.predict(input);
                    switch (alt57) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3424:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3424:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3424:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3441:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3442:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8044);
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
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3459:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3459:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3459:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3459:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3460:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3460:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3461:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8072);
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

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3477:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==43) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3477:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall8085); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3481:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3482:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3482:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3483:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8106);
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
                            	    break loop56;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3503:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3503:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3506:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3507:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8158);
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


    // $ANTLR start "entryRuleFeatureCallID"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3531:1: entryRuleFeatureCallID returns [String current=null] : iv_ruleFeatureCallID= ruleFeatureCallID EOF ;
    public final String entryRuleFeatureCallID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCallID = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3532:2: (iv_ruleFeatureCallID= ruleFeatureCallID EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3533:2: iv_ruleFeatureCallID= ruleFeatureCallID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallIDRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCallID_in_entryRuleFeatureCallID8196);
            iv_ruleFeatureCallID=ruleFeatureCallID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCallID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCallID8207); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeatureCallID"


    // $ANTLR start "ruleFeatureCallID"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3540:1: ruleFeatureCallID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCallID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3543:28: ( (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3544:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3544:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            int alt60=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt60=1;
                }
                break;
            case 63:
                {
                alt60=2;
                }
                break;
            case 64:
                {
                alt60=3;
                }
                break;
            case 65:
                {
                alt60=4;
                }
                break;
            case 66:
                {
                alt60=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3545:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureCallIDAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleFeatureCallID8254);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3557:2: kw= 'extends'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleFeatureCallID8278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtendsKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3564:2: kw= 'static'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleFeatureCallID8297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getStaticKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3571:2: kw= 'import'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleFeatureCallID8316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getImportKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3578:2: kw= 'extension'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleFeatureCallID8335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtensionKeyword_4()); 
                          
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
    // $ANTLR end "ruleFeatureCallID"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3591:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3592:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3593:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8376);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8387); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3600:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureCallID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3603:28: ( (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3604:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3604:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID||(LA61_0>=63 && LA61_0<=66)) ) {
                alt61=1;
            }
            else if ( (LA61_0==67) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3605:5: this_FeatureCallID_0= ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getFeatureCallIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper8434);
                    this_FeatureCallID_0=ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FeatureCallID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3617:2: kw= 'super'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleIdOrSuper8458); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3630:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3631:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3632:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8499);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8510); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3639:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3642:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3643:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3643:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID) ) {
                    int LA62_2 = input.LA(2);

                    if ( (LA62_2==68) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3644:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8557);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,68,FOLLOW_68_in_ruleStaticQualifier8575); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3668:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3669:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3670:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8616);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8626); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3677:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3680:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3681:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3681:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3681:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3681:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3682:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXConstructorCall8672); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3691:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3692:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3692:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3693:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8695);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3706:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3706:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3706:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3706:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall8716); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3711:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3712:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3712:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3713:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8738);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3729:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==43) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3729:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8751); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3733:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3734:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3734:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3735:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8772);
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
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall8786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3755:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3755:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3755:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3755:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall8809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3760:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt66=3;
                    alt66 = dfa66.predict(input);
                    switch (alt66) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3760:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3760:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3760:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3777:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3778:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8882);
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
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3795:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3795:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3795:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3795:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3796:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3796:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3797:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8910);
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

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3813:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==43) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3813:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8923); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3817:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3818:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3818:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3819:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8944);
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
                            	    break loop65;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall8961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3839:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3839:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3842:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3843:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8996);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3867:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3868:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3869:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9033);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9043); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3876:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3879:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3880:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3880:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3880:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3880:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3881:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3886:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==70) ) {
                alt69=1;
            }
            else if ( (LA69_0==71) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3886:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXBooleanLiteral9090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3891:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3891:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3892:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3892:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3893:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,71,FOLLOW_71_in_ruleXBooleanLiteral9114); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3914:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3915:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3916:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9164);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9174); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3923:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3926:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3927:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3927:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3927:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3927:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3928:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXNullLiteral9220); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3945:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3946:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3947:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9256);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9266); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3954:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3957:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3958:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3958:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3958:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3958:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3959:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3964:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3965:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3965:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3966:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9321);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
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
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3990:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3991:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3992:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9357);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9367); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3999:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4002:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4003:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4003:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4003:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4003:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4004:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4009:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4010:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4010:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4011:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9418); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4035:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4036:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4037:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9459);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9469); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4044:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayDimensions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4047:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4048:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4048:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4048:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4048:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4049:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTypeLiteral9515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXTypeLiteral9527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4062:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4063:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4063:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4064:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9550);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4077:2: ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==46) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4078:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4078:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4079:3: lv_arrayDimensions_4_0= ruleArrayBrackets
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getArrayDimensionsArrayBracketsParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral9571);
            	    lv_arrayDimensions_4_0=ruleArrayBrackets();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXTypeLiteralRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"arrayDimensions",
            	              		lv_arrayDimensions_4_0, 
            	              		"ArrayBrackets");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleXTypeLiteral9584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_5());
                  
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4107:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4108:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4109:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9620);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9630); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4116:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4119:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4120:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4120:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4120:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4120:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4121:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXThrowExpression9676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4130:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4131:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4131:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4132:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9697);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4156:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4157:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4158:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9733);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9743); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4165:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4168:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4169:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4169:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4169:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4169:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4170:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXReturnExpression9789); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4179:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4179:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4184:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4185:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9820);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4209:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4210:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4211:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9857);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9867); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4218:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4221:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4222:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4222:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4222:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4222:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4223:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression9913); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4232:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4233:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4233:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4234:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9934);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4250:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==78) ) {
                alt74=1;
            }
            else if ( (LA74_0==77) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4250:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4250:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4250:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4250:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==78) ) {
                            int LA72_2 = input.LA(2);

                            if ( (synpred34_InternalHelloXbase()) ) {
                                alt72=1;
                            }


                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4250:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4252:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4253:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9964);
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
                    	    if ( cnt72 >= 1 ) break loop72;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4269:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==77) ) {
                        int LA73_1 = input.LA(2);

                        if ( (synpred35_InternalHelloXbase()) ) {
                            alt73=1;
                        }
                    }
                    switch (alt73) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4269:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4269:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4269:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression9986); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4274:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4275:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4275:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4276:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10008);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4293:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4293:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4293:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4297:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4298:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4298:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4299:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10051);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4323:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4324:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4325:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10089);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10099); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4332:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4335:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4336:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4336:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4336:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4336:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4336:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleXCatchClause10144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXCatchClause10157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4345:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4346:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4346:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4347:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10178);
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

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXCatchClause10190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4367:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4368:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4368:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4369:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10211);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4393:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4394:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4395:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10248);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10259); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4402:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4405:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4406:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4406:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4407:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10306);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4417:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==40) ) {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==RULE_ID) ) {
                        int LA75_3 = input.LA(3);

                        if ( (synpred37_InternalHelloXbase()) ) {
                            alt75=1;
                        }


                    }


                }


                switch (alt75) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4417:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4417:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4417:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleQualifiedName10334); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10357);
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
            	    break loop75;
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


    // $ANTLR start "entryRuleNumber"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4444:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4448:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4449:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10411);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10422); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4459:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4463:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4464:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4464:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_HEX) ) {
                alt79=1;
            }
            else if ( ((LA79_0>=RULE_INT && LA79_0<=RULE_DECIMAL)) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4464:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4472:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4472:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4472:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4472:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==RULE_INT) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==RULE_DECIMAL) ) {
                        alt76=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4472:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10494); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4480:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10520); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4487:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==40) ) {
                        int LA78_1 = input.LA(2);

                        if ( ((LA78_1>=RULE_INT && LA78_1<=RULE_DECIMAL)) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4488:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,40,FOLLOW_40_in_ruleNumber10540); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4493:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==RULE_INT) ) {
                                alt77=1;
                            }
                            else if ( (LA77_0==RULE_DECIMAL) ) {
                                alt77=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 77, 0, input);

                                throw nvae;
                            }
                            switch (alt77) {
                                case 1 :
                                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4493:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10556); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4501:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10582); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4519:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4520:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4521:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10635);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10645); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4528:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4531:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4532:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4532:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            else if ( (LA81_0==29||LA81_0==44) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4532:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4532:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4533:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10693);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4541:1: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==46) ) {
                            int LA80_2 = input.LA(2);

                            if ( (LA80_2==48) ) {
                                int LA80_3 = input.LA(3);

                                if ( (synpred38_InternalHelloXbase()) ) {
                                    alt80=1;
                                }


                            }


                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4541:2: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4542:24: ( () ruleArrayBrackets )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4542:25: () ruleArrayBrackets
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4542:25: ()
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4543:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference10729);
                    	    ruleArrayBrackets();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4558:5: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10760);
                    this_XFunctionTypeRef_3=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_3; 
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


    // $ANTLR start "entryRuleArrayBrackets"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4574:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4575:2: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4576:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets10796);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayBrackets10807); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4583:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4586:28: ( (kw= '[' kw= ']' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4587:1: (kw= '[' kw= ']' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4587:1: (kw= '[' kw= ']' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4588:2: kw= '[' kw= ']'
            {
            kw=(Token)match(input,46,FOLLOW_46_in_ruleArrayBrackets10845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
                  
            }
            kw=(Token)match(input,48,FOLLOW_48_in_ruleArrayBrackets10858); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1()); 
                  
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
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4607:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4608:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4609:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10898);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10908); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4616:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4619:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4620:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4620:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4620:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4620:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==44) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4620:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef10946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4624:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==RULE_ID||LA83_0==29||LA83_0==44) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4624:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4624:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4625:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4625:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4626:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10968);
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

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4642:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop82:
                            do {
                                int alt82=2;
                                int LA82_0 = input.LA(1);

                                if ( (LA82_0==43) ) {
                                    alt82=1;
                                }


                                switch (alt82) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4642:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef10981); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4646:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4647:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4647:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4648:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11002);
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
                            	    break loop82;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef11018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleXFunctionTypeRef11032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4672:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4673:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4673:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4674:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11053);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4698:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4699:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4700:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11089);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11099); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4707:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4710:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4711:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4711:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4711:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4711:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4712:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4712:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4713:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11147);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4726:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4726:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4726:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4726:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleJvmParameterizedTypeReference11168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4731:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4732:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4732:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4733:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11190);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4749:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==43) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4749:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleJvmParameterizedTypeReference11203); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4753:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4754:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4754:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4755:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11224);
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
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleJvmParameterizedTypeReference11238); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4783:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4784:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4785:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11276);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11286); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4792:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4795:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4796:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4796:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID||LA87_0==29||LA87_0==44) ) {
                alt87=1;
            }
            else if ( (LA87_0==79) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4797:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11333);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4807:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11360);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4823:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4824:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4825:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11395);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11405); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4832:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4835:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4836:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4836:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4836:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4836:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4837:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleJvmWildcardTypeReference11451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4846:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt88=3;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==63) ) {
                alt88=1;
            }
            else if ( (LA88_0==67) ) {
                alt88=2;
            }
            switch (alt88) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4846:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4846:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4847:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4847:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4848:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11473);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4865:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4865:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4866:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4866:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4867:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11500);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4891:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4892:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4893:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11538);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11548); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4900:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4903:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4904:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4904:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4904:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleJvmUpperBound11585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4908:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4909:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4909:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4910:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11606);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4934:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4935:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4936:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11642);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11652); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4943:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4946:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4947:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4947:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4947:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleJvmUpperBoundAnded11689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4951:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4952:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4952:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4953:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11710);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4977:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4978:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4979:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11746);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11756); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4986:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4989:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4990:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4990:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4990:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleJvmLowerBound11793); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4994:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4995:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4995:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4996:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11814);
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5022:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5023:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5024:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard11853);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard11864); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5031:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5034:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5035:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5035:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5036:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard11911);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,40,FOLLOW_40_in_ruleQualifiedNameWithWildcard11929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,35,FOLLOW_35_in_ruleQualifiedNameWithWildcard11942); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
                  
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5066:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5067:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5068:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11983);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11994); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5075:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5078:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5079:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12033); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXImportSection"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5094:1: entryRuleXImportSection returns [EObject current=null] : iv_ruleXImportSection= ruleXImportSection EOF ;
    public final EObject entryRuleXImportSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportSection = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5095:2: (iv_ruleXImportSection= ruleXImportSection EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5096:2: iv_ruleXImportSection= ruleXImportSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportSectionRule()); 
            }
            pushFollow(FOLLOW_ruleXImportSection_in_entryRuleXImportSection12077);
            iv_ruleXImportSection=ruleXImportSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXImportSection12087); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXImportSection"


    // $ANTLR start "ruleXImportSection"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5103:1: ruleXImportSection returns [EObject current=null] : ( (lv_importDeclarations_0_0= ruleXImportDeclaration ) )+ ;
    public final EObject ruleXImportSection() throws RecognitionException {
        EObject current = null;

        EObject lv_importDeclarations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5106:28: ( ( (lv_importDeclarations_0_0= ruleXImportDeclaration ) )+ )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5107:1: ( (lv_importDeclarations_0_0= ruleXImportDeclaration ) )+
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5107:1: ( (lv_importDeclarations_0_0= ruleXImportDeclaration ) )+
            int cnt89=0;
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==65) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5108:1: (lv_importDeclarations_0_0= ruleXImportDeclaration )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5108:1: (lv_importDeclarations_0_0= ruleXImportDeclaration )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5109:3: lv_importDeclarations_0_0= ruleXImportDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXImportSectionAccess().getImportDeclarationsXImportDeclarationParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXImportDeclaration_in_ruleXImportSection12132);
            	    lv_importDeclarations_0_0=ruleXImportDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXImportSectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"importDeclarations",
            	              		lv_importDeclarations_0_0, 
            	              		"XImportDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt89 >= 1 ) break loop89;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(89, input);
                        throw eee;
                }
                cnt89++;
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
    // $ANTLR end "ruleXImportSection"


    // $ANTLR start "entryRuleXImportDeclaration"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5133:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5134:2: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5135:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration12168);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXImportDeclaration12178); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5142:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5145:28: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5146:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5146:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5146:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleXImportDeclaration12215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5150:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt91=3;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5150:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5150:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5150:3: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5150:3: ( (lv_static_1_0= 'static' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5151:1: (lv_static_1_0= 'static' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5151:1: (lv_static_1_0= 'static' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5152:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,64,FOLLOW_64_in_ruleXImportDeclaration12235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_1_0, grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5165:2: ( (lv_extension_2_0= 'extension' ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==66) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5166:1: (lv_extension_2_0= 'extension' )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5166:1: (lv_extension_2_0= 'extension' )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5167:3: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,66,FOLLOW_66_in_ruleXImportDeclaration12266); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_extension_2_0, grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              	        }
                                     		setWithLastConsumed(current, "extension", true, "extension");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5180:3: ( ( ruleQualifiedName ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5181:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5181:1: ( ruleQualifiedName )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5182:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12303);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleXImportDeclaration12315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXImportDeclarationAccess().getFullStopKeyword_1_0_3());
                          
                    }
                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleXImportDeclaration12327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXImportDeclarationAccess().getAsteriskKeyword_1_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5204:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5204:6: ( ( ruleQualifiedName ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5205:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5205:1: ( ruleQualifiedName )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5206:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12357);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5220:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5220:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5221:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5221:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5222:3: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration12384);
                    lv_importedNamespace_7_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"importedNamespace",
                              		lv_importedNamespace_7_0, 
                              		"QualifiedNameWithWildcard");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5238:3: (otherlv_8= ';' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==49) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5238:5: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,49,FOLLOW_49_in_ruleXImportDeclaration12398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
                          
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
    // $ANTLR end "ruleXImportDeclaration"

    // $ANTLR start synpred1_InternalHelloXbase
    public final void synpred1_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:293:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:293:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:293:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:293:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:293:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:294:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:294:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:295:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:295:1: ( ruleOpMultiAssign )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:296:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloXbase585);
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
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:421:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:421:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:421:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:421:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:421:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:422:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:422:2: ( ( ruleOpOr ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:423:1: ( ruleOpOr )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:423:1: ( ruleOpOr )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:424:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalHelloXbase933);
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
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:522:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:522:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:522:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:522:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:522:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:523:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:523:2: ( ( ruleOpAnd ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:524:1: ( ruleOpAnd )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:524:1: ( ruleOpAnd )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:525:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalHelloXbase1192);
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
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:623:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:623:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:623:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:623:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:623:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:624:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:624:2: ( ( ruleOpEquality ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:625:1: ( ruleOpEquality )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:625:1: ( ruleOpEquality )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:626:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalHelloXbase1451);
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
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:731:4: ( ( () 'instanceof' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:731:5: ( () 'instanceof' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:731:5: ( () 'instanceof' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:731:6: () 'instanceof'
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:731:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:732:1: 
        {
        }

        match(input,22,FOLLOW_22_in_synpred5_InternalHelloXbase1727); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalHelloXbase

    // $ANTLR start synpred6_InternalHelloXbase
    public final void synpred6_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:762:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:762:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:762:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:762:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:762:10: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:763:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:763:2: ( ( ruleOpCompare ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:764:1: ( ruleOpCompare )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:764:1: ( ruleOpCompare )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:765:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXbase1798);
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
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:884:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:884:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:884:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:884:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:884:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:885:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:885:2: ( ( ruleOpOther ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:886:1: ( ruleOpOther )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:886:1: ( ruleOpOther )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:887:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalHelloXbase2117);
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
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:976:3: ( ( '>' '>' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:976:4: ( '>' '>' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:976:4: ( '>' '>' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:977:2: '>' '>'
        {
        match(input,25,FOLLOW_25_in_synpred8_InternalHelloXbase2333); if (state.failed) return ;
        match(input,25,FOLLOW_25_in_synpred8_InternalHelloXbase2338); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalHelloXbase

    // $ANTLR start synpred9_InternalHelloXbase
    public final void synpred9_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1006:3: ( ( '<' '<' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1006:4: ( '<' '<' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1006:4: ( '<' '<' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1007:2: '<' '<'
        {
        match(input,26,FOLLOW_26_in_synpred9_InternalHelloXbase2420); if (state.failed) return ;
        match(input,26,FOLLOW_26_in_synpred9_InternalHelloXbase2425); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalHelloXbase

    // $ANTLR start synpred10_InternalHelloXbase
    public final void synpred10_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1080:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1080:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1080:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1080:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1080:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1081:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1081:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1082:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1082:1: ( ruleOpAdd )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1083:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalHelloXbase2647);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalHelloXbase

    // $ANTLR start synpred11_InternalHelloXbase
    public final void synpred11_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1188:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1188:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1188:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1188:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1188:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1189:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1189:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1190:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1190:1: ( ruleOpMulti )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1191:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalHelloXbase2927);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalHelloXbase

    // $ANTLR start synpred12_InternalHelloXbase
    public final void synpred12_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1421:3: ( ( () 'as' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1421:4: ( () 'as' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1421:4: ( () 'as' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1421:5: () 'as'
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1421:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1422:1: 
        {
        }

        match(input,39,FOLLOW_39_in_synpred12_InternalHelloXbase3521); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalHelloXbase

    // $ANTLR start synpred13_InternalHelloXbase
    public final void synpred13_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1481:4: ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1481:5: ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1481:5: ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1481:6: () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1481:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1482:1: 
        {
        }

        match(input,40,FOLLOW_40_in_synpred13_InternalHelloXbase3675); if (state.failed) return ;
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1483:1: ( ( ruleFeatureCallID ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1484:1: ( ruleFeatureCallID )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1484:1: ( ruleFeatureCallID )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1485:3: ruleFeatureCallID
        {
        pushFollow(FOLLOW_ruleFeatureCallID_in_synpred13_InternalHelloXbase3684);
        ruleFeatureCallID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloXbase3690);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHelloXbase

    // $ANTLR start synpred14_InternalHelloXbase
    public final void synpred14_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1539:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1539:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1539:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1539:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1539:10: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1540:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1540:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt93=3;
        switch ( input.LA(1) ) {
        case 40:
            {
            alt93=1;
            }
            break;
        case 41:
            {
            alt93=2;
            }
            break;
        case 42:
            {
            alt93=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 93, 0, input);

            throw nvae;
        }

        switch (alt93) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1540:4: '.'
                {
                match(input,40,FOLLOW_40_in_synpred14_InternalHelloXbase3793); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1542:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1542:6: ( ( '?.' ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1543:1: ( '?.' )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1543:1: ( '?.' )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1544:2: '?.'
                {
                match(input,41,FOLLOW_41_in_synpred14_InternalHelloXbase3807); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1549:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1549:6: ( ( '*.' ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1550:1: ( '*.' )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1550:1: ( '*.' )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1551:2: '*.'
                {
                match(input,42,FOLLOW_42_in_synpred14_InternalHelloXbase3827); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHelloXbase

    // $ANTLR start synpred15_InternalHelloXbase
    public final void synpred15_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1660:4: ( ( '(' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1661:1: ( '(' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1661:1: ( '(' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1662:2: '('
        {
        match(input,44,FOLLOW_44_in_synpred15_InternalHelloXbase4054); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHelloXbase

    // $ANTLR start synpred16_InternalHelloXbase
    public final void synpred16_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1681:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1681:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1681:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1681:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1681:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1682:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1682:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_ID||LA95_0==29||LA95_0==44) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1682:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1682:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1683:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1683:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1684:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase4106);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1686:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==43) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1686:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred16_InternalHelloXbase4113); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1687:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1688:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1688:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1689:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase4120);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop94;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1691:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1692:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1692:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1693:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred16_InternalHelloXbase4134); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHelloXbase

    // $ANTLR start synpred17_InternalHelloXbase
    public final void synpred17_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1760:4: ( ( () '[' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1760:5: ( () '[' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1760:5: ( () '[' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1760:6: () '['
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1760:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1761:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred17_InternalHelloXbase4254); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalHelloXbase

    // $ANTLR start synpred18_InternalHelloXbase
    public final void synpred18_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1951:3: ( ( () '[' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1951:4: ( () '[' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1951:4: ( () '[' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1951:5: () '['
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1951:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1952:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred18_InternalHelloXbase4778); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalHelloXbase

    // $ANTLR start synpred20_InternalHelloXbase
    public final void synpred20_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2045:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2045:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2045:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2045:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2045:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==29||LA97_0==44) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2045:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2045:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2046:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2046:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2047:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXbase5057);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2049:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==43) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2049:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred20_InternalHelloXbase5064); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2050:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2051:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2051:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2052:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXbase5071);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop96;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2054:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2055:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2055:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2056:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred20_InternalHelloXbase5085); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalHelloXbase

    // $ANTLR start synpred22_InternalHelloXbase
    public final void synpred22_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2415:4: ( 'else' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2415:6: 'else'
        {
        match(input,51,FOLLOW_51_in_synpred22_InternalHelloXbase5868); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalHelloXbase

    // $ANTLR start synpred23_InternalHelloXbase
    public final void synpred23_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2469:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2469:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2469:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2469:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2469:6: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2470:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2470:1: ( ruleValidID )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2471:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalHelloXbase6010);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,53,FOLLOW_53_in_synpred23_InternalHelloXbase6016); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalHelloXbase

    // $ANTLR start synpred24_InternalHelloXbase
    public final void synpred24_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2515:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2515:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2515:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2515:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,44,FOLLOW_44_in_synpred24_InternalHelloXbase6092); if (state.failed) return ;
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2516:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2517:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2517:1: ( ruleValidID )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2518:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalHelloXbase6099);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,53,FOLLOW_53_in_synpred24_InternalHelloXbase6105); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalHelloXbase

    // $ANTLR start synpred25_InternalHelloXbase
    public final void synpred25_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3099:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3099:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3099:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3099:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3099:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3100:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3100:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3101:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHelloXbase7370);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3103:2: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3104:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3104:1: ( ruleValidID )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3105:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalHelloXbase7379);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalHelloXbase

    // $ANTLR start synpred26_InternalHelloXbase
    public final void synpred26_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3403:4: ( ( '(' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3404:1: ( '(' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3404:1: ( '(' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3405:2: '('
        {
        match(input,44,FOLLOW_44_in_synpred26_InternalHelloXbase7941); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalHelloXbase

    // $ANTLR start synpred27_InternalHelloXbase
    public final void synpred27_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3424:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3424:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3424:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3424:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3424:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3425:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3425:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==RULE_ID||LA101_0==29||LA101_0==44) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3425:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3425:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3426:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3426:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3427:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXbase7993);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3429:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop100:
                do {
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==43) ) {
                        alt100=1;
                    }


                    switch (alt100) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3429:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred27_InternalHelloXbase8000); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3430:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3431:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3431:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3432:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXbase8007);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop100;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3434:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3435:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3435:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3436:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred27_InternalHelloXbase8021); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalHelloXbase

    // $ANTLR start synpred28_InternalHelloXbase
    public final void synpred28_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3503:4: ( ( () '[' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3503:5: ( () '[' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3503:5: ( () '[' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3503:6: () '['
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3503:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3504:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred28_InternalHelloXbase8141); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalHelloXbase

    // $ANTLR start synpred29_InternalHelloXbase
    public final void synpred29_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3706:4: ( '<' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3706:6: '<'
        {
        match(input,26,FOLLOW_26_in_synpred29_InternalHelloXbase8708); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalHelloXbase

    // $ANTLR start synpred30_InternalHelloXbase
    public final void synpred30_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3755:5: ( '(' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3755:7: '('
        {
        match(input,44,FOLLOW_44_in_synpred30_InternalHelloXbase8801); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHelloXbase

    // $ANTLR start synpred31_InternalHelloXbase
    public final void synpred31_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3760:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3760:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3760:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3760:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3760:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3761:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3761:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( (LA103_0==RULE_ID||LA103_0==29||LA103_0==44) ) {
            alt103=1;
        }
        switch (alt103) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3761:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3761:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3762:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3762:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3763:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXbase8831);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3765:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop102:
                do {
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==43) ) {
                        alt102=1;
                    }


                    switch (alt102) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3765:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred31_InternalHelloXbase8838); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3766:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3767:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3767:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3768:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXbase8845);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop102;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3770:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3771:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3771:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3772:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred31_InternalHelloXbase8859); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalHelloXbase

    // $ANTLR start synpred32_InternalHelloXbase
    public final void synpred32_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3839:4: ( ( () '[' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3839:5: ( () '[' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3839:5: ( () '[' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3839:6: () '['
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3839:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3840:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred32_InternalHelloXbase8979); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalHelloXbase

    // $ANTLR start synpred33_InternalHelloXbase
    public final void synpred33_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4179:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4180:1: ( ruleXExpression )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4180:1: ( ruleXExpression )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4181:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalHelloXbase9803);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalHelloXbase

    // $ANTLR start synpred34_InternalHelloXbase
    public final void synpred34_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4250:5: ( 'catch' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4250:7: 'catch'
        {
        match(input,78,FOLLOW_78_in_synpred34_InternalHelloXbase9948); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalHelloXbase

    // $ANTLR start synpred35_InternalHelloXbase
    public final void synpred35_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4269:5: ( 'finally' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4269:7: 'finally'
        {
        match(input,77,FOLLOW_77_in_synpred35_InternalHelloXbase9978); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalHelloXbase

    // $ANTLR start synpred37_InternalHelloXbase
    public final void synpred37_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4417:3: ( '.' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4418:2: '.'
        {
        match(input,40,FOLLOW_40_in_synpred37_InternalHelloXbase10325); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalHelloXbase

    // $ANTLR start synpred38_InternalHelloXbase
    public final void synpred38_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4541:2: ( ( () ruleArrayBrackets ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4541:3: ( () ruleArrayBrackets )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4541:3: ( () ruleArrayBrackets )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4541:4: () ruleArrayBrackets
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4541:4: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4542:1: 
        {
        }

        pushFollow(FOLLOW_ruleArrayBrackets_in_synpred38_InternalHelloXbase10708);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalHelloXbase

    // $ANTLR start synpred39_InternalHelloXbase
    public final void synpred39_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4726:4: ( '<' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4726:6: '<'
        {
        match(input,26,FOLLOW_26_in_synpred39_InternalHelloXbase11160); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalHelloXbase

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
    public final boolean synpred34_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalHelloXbase_fragment(); // can never throw exception
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
    public final boolean synpred29_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalHelloXbase_fragment(); // can never throw exception
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
    public final boolean synpred38_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalHelloXbase_fragment(); // can never throw exception
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
    public final boolean synpred17_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalHelloXbase_fragment(); // can never throw exception
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
    public final boolean synpred39_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalHelloXbase_fragment(); // can never throw exception
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


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String DFA11_eotS =
        "\13\uffff";
    static final String DFA11_eofS =
        "\1\1\12\uffff";
    static final String DFA11_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA11_maxS =
        "\1\116\1\uffff\10\0\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA11_specialS =
        "\2\uffff\1\4\1\3\1\0\1\7\1\5\1\2\1\1\1\6\1\uffff}>";
    static final String[] DFA11_transitionS = {
            "\5\1\6\uffff\1\1\1\uffff\10\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\16\1\1\uffff\24\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 884:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\105\uffff";
    static final String DFA27_eofS =
        "\1\2\104\uffff";
    static final String DFA27_minS =
        "\1\4\1\0\103\uffff";
    static final String DFA27_maxS =
        "\1\116\1\0\103\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\101\uffff\1\1";
    static final String DFA27_specialS =
        "\1\uffff\1\0\103\uffff}>";
    static final String[] DFA27_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\24\2\1\uffff\12"+
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

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1660:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\42\uffff";
    static final String DFA26_eofS =
        "\42\uffff";
    static final String DFA26_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA26_maxS =
        "\1\114\2\0\37\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA26_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\4\5\6\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3\uffff\2\5\11"+
            "\uffff\1\2\1\41\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\5\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1681:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_0==RULE_ID) ) {s = 1;}

                        else if ( (LA26_0==44) ) {s = 2;}

                        else if ( (LA26_0==29) && (synpred16_InternalHelloXbase())) {s = 3;}

                        else if ( (LA26_0==47) && (synpred16_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_DECIMAL)||LA26_0==15||LA26_0==26||(LA26_0>=33 && LA26_0<=34)||LA26_0==46||LA26_0==50||LA26_0==52||LA26_0==54||(LA26_0>=58 && LA26_0<=60)||(LA26_0>=63 && LA26_0<=67)||(LA26_0>=69 && LA26_0<=76)) ) {s = 5;}

                        else if ( (LA26_0==45) ) {s = 33;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\105\uffff";
    static final String DFA28_eofS =
        "\1\2\104\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\103\uffff";
    static final String DFA28_maxS =
        "\1\116\1\0\103\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\101\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\103\uffff}>";
    static final String[] DFA28_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\35\2\1\1\1\uffff\24\2\1\uffff\12\2",
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1760:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\16\uffff";
    static final String DFA30_eofS =
        "\16\uffff";
    static final String DFA30_minS =
        "\1\4\15\uffff";
    static final String DFA30_maxS =
        "\1\114\15\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA30_specialS =
        "\16\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\4\4\5\21\uffff\1\4\21\uffff\1\15\1\uffff\1\5\3\uffff\1\6"+
            "\1\uffff\1\3\1\uffff\1\2\3\uffff\1\7\1\10\1\11\2\uffff\5\4\1"+
            "\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
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

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1801:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA34_eotS =
        "\44\uffff";
    static final String DFA34_eofS =
        "\44\uffff";
    static final String DFA34_minS =
        "\1\4\2\0\41\uffff";
    static final String DFA34_maxS =
        "\1\114\2\0\41\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\2\1\1\2\36\uffff";
    static final String DFA34_specialS =
        "\1\0\1\1\1\2\41\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\4\5\6\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3\uffff\2\5\11"+
            "\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\12\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2045:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==RULE_ID) ) {s = 1;}

                        else if ( (LA34_0==44) ) {s = 2;}

                        else if ( (LA34_0==29) && (synpred20_InternalHelloXbase())) {s = 3;}

                        else if ( (LA34_0==47) && (synpred20_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_DECIMAL)||LA34_0==15||LA34_0==26||(LA34_0>=33 && LA34_0<=34)||LA34_0==46||LA34_0==48||LA34_0==50||LA34_0==52||LA34_0==54||(LA34_0>=58 && LA34_0<=67)||(LA34_0>=69 && LA34_0<=76)) ) {s = 5;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\105\uffff";
    static final String DFA58_eofS =
        "\1\2\104\uffff";
    static final String DFA58_minS =
        "\1\4\1\0\103\uffff";
    static final String DFA58_maxS =
        "\1\116\1\0\103\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\2\101\uffff\1\1";
    static final String DFA58_specialS =
        "\1\uffff\1\0\103\uffff}>";
    static final String[] DFA58_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\24\2\1\uffff\12"+
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

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3403:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\42\uffff";
    static final String DFA57_eofS =
        "\42\uffff";
    static final String DFA57_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA57_maxS =
        "\1\114\2\0\37\uffff";
    static final String DFA57_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA57_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\1\4\5\6\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3\uffff\2\5\11"+
            "\uffff\1\2\1\41\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\5\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "3424:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_0 = input.LA(1);

                         
                        int index57_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA57_0==RULE_ID) ) {s = 1;}

                        else if ( (LA57_0==44) ) {s = 2;}

                        else if ( (LA57_0==29) && (synpred27_InternalHelloXbase())) {s = 3;}

                        else if ( (LA57_0==47) && (synpred27_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_DECIMAL)||LA57_0==15||LA57_0==26||(LA57_0>=33 && LA57_0<=34)||LA57_0==46||LA57_0==50||LA57_0==52||LA57_0==54||(LA57_0>=58 && LA57_0<=60)||(LA57_0>=63 && LA57_0<=67)||(LA57_0>=69 && LA57_0<=76)) ) {s = 5;}

                        else if ( (LA57_0==45) ) {s = 33;}

                         
                        input.seek(index57_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_2 = input.LA(1);

                         
                        int index57_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index57_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\105\uffff";
    static final String DFA59_eofS =
        "\1\2\104\uffff";
    static final String DFA59_minS =
        "\1\4\1\0\103\uffff";
    static final String DFA59_maxS =
        "\1\116\1\0\103\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\101\uffff\1\1";
    static final String DFA59_specialS =
        "\1\uffff\1\0\103\uffff}>";
    static final String[] DFA59_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\35\2\1\1\1\uffff\24\2\1\uffff\12\2",
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

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "3503:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\105\uffff";
    static final String DFA64_eofS =
        "\1\2\104\uffff";
    static final String DFA64_minS =
        "\1\4\1\0\103\uffff";
    static final String DFA64_maxS =
        "\1\116\1\0\103\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\101\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\103\uffff}>";
    static final String[] DFA64_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\11\2\1\1\24\2\1\uffff\24\2\1\uffff"+
            "\12\2",
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
            return "3706:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
                        if ( (synpred29_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index64_1);
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
    static final String DFA67_eotS =
        "\105\uffff";
    static final String DFA67_eofS =
        "\1\2\104\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\103\uffff";
    static final String DFA67_maxS =
        "\1\116\1\0\103\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\101\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\103\uffff}>";
    static final String[] DFA67_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\24\2\1\uffff\12"+
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

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3755:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\42\uffff";
    static final String DFA66_eofS =
        "\42\uffff";
    static final String DFA66_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA66_maxS =
        "\1\114\2\0\37\uffff";
    static final String DFA66_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA66_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\1\4\5\6\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3\uffff\2\5\11"+
            "\uffff\1\2\1\41\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\5\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3760:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_0 = input.LA(1);

                         
                        int index66_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA66_0==RULE_ID) ) {s = 1;}

                        else if ( (LA66_0==44) ) {s = 2;}

                        else if ( (LA66_0==29) && (synpred31_InternalHelloXbase())) {s = 3;}

                        else if ( (LA66_0==47) && (synpred31_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA66_0>=RULE_STRING && LA66_0<=RULE_DECIMAL)||LA66_0==15||LA66_0==26||(LA66_0>=33 && LA66_0<=34)||LA66_0==46||LA66_0==50||LA66_0==52||LA66_0==54||(LA66_0>=58 && LA66_0<=60)||(LA66_0>=63 && LA66_0<=67)||(LA66_0>=69 && LA66_0<=76)) ) {s = 5;}

                        else if ( (LA66_0==45) ) {s = 33;}

                         
                        input.seek(index66_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\105\uffff";
    static final String DFA68_eofS =
        "\1\2\104\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\103\uffff";
    static final String DFA68_maxS =
        "\1\116\1\0\103\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\101\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\103\uffff}>";
    static final String[] DFA68_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\35\2\1\1\1\uffff\24\2\1\uffff\12\2",
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

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "3839:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\105\uffff";
    static final String DFA71_eofS =
        "\1\37\104\uffff";
    static final String DFA71_minS =
        "\1\4\36\0\46\uffff";
    static final String DFA71_maxS =
        "\1\116\36\0\46\uffff";
    static final String DFA71_acceptS =
        "\37\uffff\1\2\44\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\46\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\1\1\25\1\21\1\22\1\23\6\uffff\1\6\1\uffff\11\37\1\14\6\37"+
            "\1\10\1\7\11\37\1\36\1\37\1\16\1\uffff\2\37\1\27\1\37\1\13\1"+
            "\37\1\12\3\37\1\30\1\31\1\32\2\37\1\2\1\3\1\4\1\5\1\15\1\uffff"+
            "\1\11\1\17\1\20\1\24\1\26\1\33\1\34\1\35\2\37",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "4179:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_3 = input.LA(1);

                         
                        int index71_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA71_4 = input.LA(1);

                         
                        int index71_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA71_5 = input.LA(1);

                         
                        int index71_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA71_6 = input.LA(1);

                         
                        int index71_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA71_7 = input.LA(1);

                         
                        int index71_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA71_8 = input.LA(1);

                         
                        int index71_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA71_9 = input.LA(1);

                         
                        int index71_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA71_10 = input.LA(1);

                         
                        int index71_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA71_11 = input.LA(1);

                         
                        int index71_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA71_12 = input.LA(1);

                         
                        int index71_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA71_13 = input.LA(1);

                         
                        int index71_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA71_14 = input.LA(1);

                         
                        int index71_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA71_15 = input.LA(1);

                         
                        int index71_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA71_16 = input.LA(1);

                         
                        int index71_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA71_17 = input.LA(1);

                         
                        int index71_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA71_18 = input.LA(1);

                         
                        int index71_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA71_19 = input.LA(1);

                         
                        int index71_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA71_20 = input.LA(1);

                         
                        int index71_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA71_21 = input.LA(1);

                         
                        int index71_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA71_22 = input.LA(1);

                         
                        int index71_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA71_23 = input.LA(1);

                         
                        int index71_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA71_24 = input.LA(1);

                         
                        int index71_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA71_25 = input.LA(1);

                         
                        int index71_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA71_26 = input.LA(1);

                         
                        int index71_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA71_27 = input.LA(1);

                         
                        int index71_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA71_28 = input.LA(1);

                         
                        int index71_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA71_29 = input.LA(1);

                         
                        int index71_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA71_30 = input.LA(1);

                         
                        int index71_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index71_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA86_eotS =
        "\105\uffff";
    static final String DFA86_eofS =
        "\1\2\104\uffff";
    static final String DFA86_minS =
        "\1\4\1\0\103\uffff";
    static final String DFA86_maxS =
        "\1\116\1\0\103\uffff";
    static final String DFA86_acceptS =
        "\2\uffff\1\2\101\uffff\1\1";
    static final String DFA86_specialS =
        "\1\uffff\1\0\103\uffff}>";
    static final String[] DFA86_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\11\2\1\1\24\2\1\uffff\24\2\1\uffff"+
            "\12\2",
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

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "4726:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_1 = input.LA(1);

                         
                        int index86_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalHelloXbase()) ) {s = 68;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index86_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA91_eotS =
        "\7\uffff";
    static final String DFA91_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA91_minS =
        "\1\4\1\uffff\1\15\1\4\2\uffff\1\15";
    static final String DFA91_maxS =
        "\1\100\1\uffff\1\101\1\43\2\uffff\1\101";
    static final String DFA91_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA91_specialS =
        "\7\uffff}>";
    static final String[] DFA91_transitionS = {
            "\1\2\73\uffff\1\1",
            "",
            "\1\4\32\uffff\1\3\10\uffff\1\4\17\uffff\1\4",
            "\1\6\36\uffff\1\5",
            "",
            "",
            "\1\4\32\uffff\1\3\10\uffff\1\4\17\uffff\1\4"
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "5150:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImportSection_in_ruleModel131 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel153 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGreeting237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting254 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGreeting271 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleGreeting292 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGreeting304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXAssignment498 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment514 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment564 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment617 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpSingleAssign728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpMultiAssign816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression912 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression965 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression988 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpOr1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1171 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1224 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1247 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpAnd1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1430 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1483 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1506 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpEquality1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpEquality1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1710 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_22_in_ruleXRelationalExpression1746 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1769 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1830 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1853 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare1893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2096 = new BitSet(new long[]{0x00000001FE000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2149 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2172 = new BitSet(new long[]{0x00000001FE000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2318 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2349 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2405 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2436 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2626 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2679 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2702 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAdd2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAdd2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2906 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2959 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2982 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3235 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpUnary3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpUnary3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3505 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleXCastedExpression3540 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3563 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3658 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall3707 = new BitSet(new long[]{0x8000000000000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall3730 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3746 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3768 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall3854 = new BitSet(new long[]{0x8000000004000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall3878 = new BitSet(new long[]{0x8000000004000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall3915 = new BitSet(new long[]{0x8000000004000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall3944 = new BitSet(new long[]{0x0000100020000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3965 = new BitSet(new long[]{0x0000080002000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall3978 = new BitSet(new long[]{0x0000100020000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3999 = new BitSet(new long[]{0x0000080002000000L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall4013 = new BitSet(new long[]{0x8000000000000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall4038 = new BitSet(new long[]{0x0000570000000002L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4072 = new BitSet(new long[]{0x9C54F006240081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4157 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4185 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4198 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4219 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4236 = new BitSet(new long[]{0x0000470000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4271 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure4968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5038 = new BitSet(new long[]{0xFC55D006240081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5111 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5124 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5145 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5167 = new BitSet(new long[]{0xFC555006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5204 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5318 = new BitSet(new long[]{0xFC565006040081F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_49_in_ruleXExpressionInClosure5331 = new BitSet(new long[]{0xFC545006040081F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5489 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleXShortClosure5502 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5523 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleXShortClosure5545 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXParenthesizedExpression5664 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5686 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXParenthesizedExpression5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression5789 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression5801 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5822 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression5834 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5855 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression5876 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression5992 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6035 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6047 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6071 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44_in_ruleXSwitchExpression6115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6136 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6148 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6171 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXSwitchExpression6183 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6197 = new BitSet(new long[]{0x0220100020000010L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6218 = new BitSet(new long[]{0x03A0100020000010L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6232 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6244 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6265 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6371 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXCasePart6385 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6406 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXCasePart6420 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXForLoopExpression6533 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXForLoopExpression6545 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6566 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXForLoopExpression6578 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6599 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXForLoopExpression6611 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXWhileExpression6724 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXWhileExpression6736 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6757 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXWhileExpression6769 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXDoWhileExpression6882 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6903 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression6915 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXDoWhileExpression6927 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6948 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXDoWhileExpression6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXBlockExpression7052 = new BitSet(new long[]{0xFD545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7074 = new BitSet(new long[]{0xFD565006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_49_in_ruleXBlockExpression7087 = new BitSet(new long[]{0xFD545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_56_in_ruleXBlockExpression7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXVariableDeclaration7321 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration7352 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7421 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7450 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleXVariableDeclaration7464 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7817 = new BitSet(new long[]{0x8000000004000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall7831 = new BitSet(new long[]{0x0000100020000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7852 = new BitSet(new long[]{0x0000080002000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall7865 = new BitSet(new long[]{0x0000100020000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7886 = new BitSet(new long[]{0x0000080002000000L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall7900 = new BitSet(new long[]{0x8000000004000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7925 = new BitSet(new long[]{0x0000500000000002L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall7959 = new BitSet(new long[]{0x9C54F006240081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8044 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8072 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall8085 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8106 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8123 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_entryRuleFeatureCallID8196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCallID8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFeatureCallID8254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleFeatureCallID8278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleFeatureCallID8297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleFeatureCallID8316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleFeatureCallID8335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper8434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleIdOrSuper8458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStaticQualifier8575 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXConstructorCall8672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8695 = new BitSet(new long[]{0x0000500004000002L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall8716 = new BitSet(new long[]{0x0000100020000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8738 = new BitSet(new long[]{0x0000080002000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8751 = new BitSet(new long[]{0x0000100020000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8772 = new BitSet(new long[]{0x0000080002000000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall8786 = new BitSet(new long[]{0x0000500000000002L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall8809 = new BitSet(new long[]{0x9C54F006240081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8882 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8910 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8923 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8944 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall8961 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXBooleanLiteral9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXBooleanLiteral9114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXNullLiteral9220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTypeLiteral9515 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXTypeLiteral9527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9550 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral9571 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_45_in_ruleXTypeLiteral9584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXThrowExpression9676 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXReturnExpression9789 = new BitSet(new long[]{0x9C545006040081F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression9913 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9964 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression9986 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10030 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXCatchClause10144 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXCatchClause10157 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10178 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXCatchClause10190 = new BitSet(new long[]{0x9C545006040081F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10306 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleQualifiedName10334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10357 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10494 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10520 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleNumber10540 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10693 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference10729 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets10796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayBrackets10807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleArrayBrackets10845 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleArrayBrackets10858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef10946 = new BitSet(new long[]{0x0000300020000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10968 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef10981 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11002 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef11018 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXFunctionTypeRef11032 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11147 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleJvmParameterizedTypeReference11168 = new BitSet(new long[]{0x0000100020000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11190 = new BitSet(new long[]{0x0000080002000000L});
    public static final BitSet FOLLOW_43_in_ruleJvmParameterizedTypeReference11203 = new BitSet(new long[]{0x0000100020000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11224 = new BitSet(new long[]{0x0000080002000000L});
    public static final BitSet FOLLOW_25_in_ruleJvmParameterizedTypeReference11238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmWildcardTypeReference11451 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleJvmUpperBound11585 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmUpperBoundAnded11689 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleJvmLowerBound11793 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard11853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard11864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard11911 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleQualifiedNameWithWildcard11929 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleQualifiedNameWithWildcard11942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImportSection_in_entryRuleXImportSection12077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXImportSection12087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImportDeclaration_in_ruleXImportSection12132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration12168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXImportDeclaration12178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXImportDeclaration12215 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleXImportDeclaration12235 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXImportDeclaration12266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12303 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXImportDeclaration12315 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleXImportDeclaration12327 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12357 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration12384 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXImportDeclaration12398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloXbase585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHelloXbase933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHelloXbase1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHelloXbase1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred5_InternalHelloXbase1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXbase1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHelloXbase2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred8_InternalHelloXbase2333 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred8_InternalHelloXbase2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred9_InternalHelloXbase2420 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred9_InternalHelloXbase2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalHelloXbase2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalHelloXbase2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred12_InternalHelloXbase3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred13_InternalHelloXbase3675 = new BitSet(new long[]{0x8000000000000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_synpred13_InternalHelloXbase3684 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloXbase3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred14_InternalHelloXbase3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred14_InternalHelloXbase3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred14_InternalHelloXbase3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred15_InternalHelloXbase4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase4106 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred16_InternalHelloXbase4113 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase4120 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred16_InternalHelloXbase4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred17_InternalHelloXbase4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred18_InternalHelloXbase4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXbase5057 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred20_InternalHelloXbase5064 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXbase5071 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred20_InternalHelloXbase5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred22_InternalHelloXbase5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalHelloXbase6010 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred23_InternalHelloXbase6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred24_InternalHelloXbase6092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalHelloXbase6099 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred24_InternalHelloXbase6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHelloXbase7370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalHelloXbase7379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred26_InternalHelloXbase7941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXbase7993 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred27_InternalHelloXbase8000 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXbase8007 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred27_InternalHelloXbase8021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred28_InternalHelloXbase8141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred29_InternalHelloXbase8708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred30_InternalHelloXbase8801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXbase8831 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred31_InternalHelloXbase8838 = new BitSet(new long[]{0x0000100020000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXbase8845 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred31_InternalHelloXbase8859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred32_InternalHelloXbase8979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalHelloXbase9803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred34_InternalHelloXbase9948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred35_InternalHelloXbase9978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred37_InternalHelloXbase10325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_synpred38_InternalHelloXbase10708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred39_InternalHelloXbase11160 = new BitSet(new long[]{0x0000000000000002L});

}