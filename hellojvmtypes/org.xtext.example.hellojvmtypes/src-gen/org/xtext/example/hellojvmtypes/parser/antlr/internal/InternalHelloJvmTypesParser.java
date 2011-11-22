package org.xtext.example.hellojvmtypes.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.hellojvmtypes.services.HelloJvmTypesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHelloJvmTypesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'Hello'", "'from'", "','", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
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


        public InternalHelloJvmTypesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHelloJvmTypesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHelloJvmTypesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g"; }



     	private HelloJvmTypesGrammarAccess grammarAccess;
     	
        public InternalHelloJvmTypesParser(TokenStream input, HelloJvmTypesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected HelloJvmTypesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_greetings_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )* ) )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )* )
            {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )* )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )*
            {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:98:3: ( (lv_greetings_1_0= ruleGreeting ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:99:1: (lv_greetings_1_0= ruleGreeting )
            	    {
            	    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:99:1: (lv_greetings_1_0= ruleGreeting )
            	    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:100:3: lv_greetings_1_0= ruleGreeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel153);
            	    lv_greetings_1_0=ruleGreeting();

            	    state._fsp--;


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:126:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport190);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport237); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport258);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:167:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:168:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:169:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard295);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard306); 

            }

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
    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:176:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:179:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:181:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard353);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:191:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:192:2: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildcard372); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:205:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:206:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:207:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName415);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName426); 

            }

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
    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:214:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:217:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:218:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:218:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:218:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName466); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:225:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:226:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedName485); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName500); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:246:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:247:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:248:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting547);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting557); 

            }

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
    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:255:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:258:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= '!' ) )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:259:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= '!' )
            {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:259:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= '!' )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:259:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= '!'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleGreeting594); 

                	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:263:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:264:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:264:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:265:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting611); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleGreeting628); 

                	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getFromKeyword_2());
                
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:285:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:286:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:286:1: ( ruleQualifiedName )
            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:287:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGreetingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGreetingAccess().getJavaTypesJvmTypeCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGreeting651);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:300:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:300:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleGreeting664); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGreetingAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:304:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:305:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:305:1: ( ruleQualifiedName )
            	    // ../org.xtext.example.hellojvmtypes/src-gen/org/xtext/example/hellojvmtypes/parser/antlr/internal/InternalHelloJvmTypes.g:306:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGreetingRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGreetingAccess().getJavaTypesJvmTypeCrossReference_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleGreeting687);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleGreeting701); 

                	newLeafNode(otherlv_6, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_5());
                

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel153 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard353 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildcard372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName466 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName500 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGreeting594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting611 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGreeting628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGreeting651 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleGreeting664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGreeting687 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleGreeting701 = new BitSet(new long[]{0x0000000000000002L});

}