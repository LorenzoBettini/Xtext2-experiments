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

@SuppressWarnings("all")
public class InternalHelloXbaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'from'", "'!'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

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
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel130);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting166);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting176); 

            }

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
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleGreeting213); 

                	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGreeting247); 

                	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getFromKeyword_2());
                
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:145:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:146:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:146:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:147:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGreetingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGreetingAccess().getJavaTypeJvmTypeCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGreeting270);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleGreeting282); 

                	newLeafNode(otherlv_4, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_4());
                

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:172:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:173:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:174:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName319);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName330); 

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:181:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:184:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:185:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:185:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:185:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName370); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:192:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:193:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName389); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName404); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

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
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName370 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName404 = new BitSet(new long[]{0x0000000000004002L});

}