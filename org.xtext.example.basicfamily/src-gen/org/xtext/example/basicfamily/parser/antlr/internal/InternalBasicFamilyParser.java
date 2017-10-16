package org.xtext.example.basicfamily.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.basicfamily.services.BasicFamilyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBasicFamilyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Family'", "'{'", "'members'", "','", "'}'", "'Woman'", "'parents'", "'('", "')'", "'children'", "'mother'", "'father'", "'Man'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBasicFamilyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBasicFamilyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBasicFamilyParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBasicFamily.g"; }



     	private BasicFamilyGrammarAccess grammarAccess;

        public InternalBasicFamilyParser(TokenStream input, BasicFamilyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Family";
       	}

       	@Override
       	protected BasicFamilyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFamily"
    // InternalBasicFamily.g:64:1: entryRuleFamily returns [EObject current=null] : iv_ruleFamily= ruleFamily EOF ;
    public final EObject entryRuleFamily() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFamily = null;


        try {
            // InternalBasicFamily.g:64:47: (iv_ruleFamily= ruleFamily EOF )
            // InternalBasicFamily.g:65:2: iv_ruleFamily= ruleFamily EOF
            {
             newCompositeNode(grammarAccess.getFamilyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFamily=ruleFamily();

            state._fsp--;

             current =iv_ruleFamily; 
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
    // $ANTLR end "entryRuleFamily"


    // $ANTLR start "ruleFamily"
    // InternalBasicFamily.g:71:1: ruleFamily returns [EObject current=null] : ( () otherlv_1= 'Family' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'members' otherlv_5= '{' ( (lv_members_6_0= rulePerson ) ) (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleFamily() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_members_6_0 = null;

        EObject lv_members_8_0 = null;



        	enterRule();

        try {
            // InternalBasicFamily.g:77:2: ( ( () otherlv_1= 'Family' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'members' otherlv_5= '{' ( (lv_members_6_0= rulePerson ) ) (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalBasicFamily.g:78:2: ( () otherlv_1= 'Family' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'members' otherlv_5= '{' ( (lv_members_6_0= rulePerson ) ) (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalBasicFamily.g:78:2: ( () otherlv_1= 'Family' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'members' otherlv_5= '{' ( (lv_members_6_0= rulePerson ) ) (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalBasicFamily.g:79:3: () otherlv_1= 'Family' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'members' otherlv_5= '{' ( (lv_members_6_0= rulePerson ) ) (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalBasicFamily.g:79:3: ()
            // InternalBasicFamily.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFamilyAccess().getFamilyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFamilyAccess().getFamilyKeyword_1());
            		
            // InternalBasicFamily.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBasicFamily.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalBasicFamily.g:91:4: (lv_name_2_0= ruleEString )
            // InternalBasicFamily.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFamilyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFamilyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.basicfamily.BasicFamily.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFamilyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBasicFamily.g:113:3: (otherlv_4= 'members' otherlv_5= '{' ( (lv_members_6_0= rulePerson ) ) (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBasicFamily.g:114:4: otherlv_4= 'members' otherlv_5= '{' ( (lv_members_6_0= rulePerson ) ) (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getFamilyAccess().getMembersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getFamilyAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalBasicFamily.g:122:4: ( (lv_members_6_0= rulePerson ) )
                    // InternalBasicFamily.g:123:5: (lv_members_6_0= rulePerson )
                    {
                    // InternalBasicFamily.g:123:5: (lv_members_6_0= rulePerson )
                    // InternalBasicFamily.g:124:6: lv_members_6_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getFamilyAccess().getMembersPersonParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_members_6_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFamilyRule());
                    						}
                    						add(
                    							current,
                    							"members",
                    							lv_members_6_0,
                    							"org.xtext.example.basicfamily.BasicFamily.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBasicFamily.g:141:4: (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBasicFamily.g:142:5: otherlv_7= ',' ( (lv_members_8_0= rulePerson ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFamilyAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBasicFamily.g:146:5: ( (lv_members_8_0= rulePerson ) )
                    	    // InternalBasicFamily.g:147:6: (lv_members_8_0= rulePerson )
                    	    {
                    	    // InternalBasicFamily.g:147:6: (lv_members_8_0= rulePerson )
                    	    // InternalBasicFamily.g:148:7: lv_members_8_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getFamilyAccess().getMembersPersonParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_members_8_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFamilyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_8_0,
                    	    								"org.xtext.example.basicfamily.BasicFamily.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getFamilyAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFamilyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleFamily"


    // $ANTLR start "entryRulePerson"
    // InternalBasicFamily.g:179:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalBasicFamily.g:179:47: (iv_rulePerson= rulePerson EOF )
            // InternalBasicFamily.g:180:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalBasicFamily.g:186:1: rulePerson returns [EObject current=null] : (this_Man_0= ruleMan | this_Woman_1= ruleWoman ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        EObject this_Man_0 = null;

        EObject this_Woman_1 = null;



        	enterRule();

        try {
            // InternalBasicFamily.g:192:2: ( (this_Man_0= ruleMan | this_Woman_1= ruleWoman ) )
            // InternalBasicFamily.g:193:2: (this_Man_0= ruleMan | this_Woman_1= ruleWoman )
            {
            // InternalBasicFamily.g:193:2: (this_Man_0= ruleMan | this_Woman_1= ruleWoman )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBasicFamily.g:194:3: this_Man_0= ruleMan
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getManParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Man_0=ruleMan();

                    state._fsp--;


                    			current = this_Man_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBasicFamily.g:203:3: this_Woman_1= ruleWoman
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getWomanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Woman_1=ruleWoman();

                    state._fsp--;


                    			current = this_Woman_1;
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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleEString"
    // InternalBasicFamily.g:215:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBasicFamily.g:215:47: (iv_ruleEString= ruleEString EOF )
            // InternalBasicFamily.g:216:2: iv_ruleEString= ruleEString EOF
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
    // InternalBasicFamily.g:222:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBasicFamily.g:228:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBasicFamily.g:229:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBasicFamily.g:229:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBasicFamily.g:230:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBasicFamily.g:238:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleWoman"
    // InternalBasicFamily.g:249:1: entryRuleWoman returns [EObject current=null] : iv_ruleWoman= ruleWoman EOF ;
    public final EObject entryRuleWoman() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWoman = null;


        try {
            // InternalBasicFamily.g:249:46: (iv_ruleWoman= ruleWoman EOF )
            // InternalBasicFamily.g:250:2: iv_ruleWoman= ruleWoman EOF
            {
             newCompositeNode(grammarAccess.getWomanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWoman=ruleWoman();

            state._fsp--;

             current =iv_ruleWoman; 
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
    // $ANTLR end "entryRuleWoman"


    // $ANTLR start "ruleWoman"
    // InternalBasicFamily.g:256:1: ruleWoman returns [EObject current=null] : ( () otherlv_1= 'Woman' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleWoman() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBasicFamily.g:262:2: ( ( () otherlv_1= 'Woman' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' ) )
            // InternalBasicFamily.g:263:2: ( () otherlv_1= 'Woman' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' )
            {
            // InternalBasicFamily.g:263:2: ( () otherlv_1= 'Woman' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' )
            // InternalBasicFamily.g:264:3: () otherlv_1= 'Woman' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}'
            {
            // InternalBasicFamily.g:264:3: ()
            // InternalBasicFamily.g:265:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWomanAccess().getWomanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWomanAccess().getWomanKeyword_1());
            		
            // InternalBasicFamily.g:275:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBasicFamily.g:276:4: (lv_name_2_0= ruleEString )
            {
            // InternalBasicFamily.g:276:4: (lv_name_2_0= ruleEString )
            // InternalBasicFamily.g:277:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWomanAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWomanRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.basicfamily.BasicFamily.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getWomanAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBasicFamily.g:298:3: (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBasicFamily.g:299:4: otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getWomanAccess().getParentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getWomanAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalBasicFamily.g:307:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:308:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:308:5: ( ruleEString )
                    // InternalBasicFamily.g:309:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWomanRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWomanAccess().getParentsPersonCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBasicFamily.g:323:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBasicFamily.g:324:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getWomanAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBasicFamily.g:328:5: ( ( ruleEString ) )
                    	    // InternalBasicFamily.g:329:6: ( ruleEString )
                    	    {
                    	    // InternalBasicFamily.g:329:6: ( ruleEString )
                    	    // InternalBasicFamily.g:330:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWomanRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWomanAccess().getParentsPersonCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

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

                    otherlv_9=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getWomanAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalBasicFamily.g:350:3: (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBasicFamily.g:351:4: otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getWomanAccess().getChildrenKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getWomanAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBasicFamily.g:359:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:360:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:360:5: ( ruleEString )
                    // InternalBasicFamily.g:361:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWomanRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWomanAccess().getChildrenPersonCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBasicFamily.g:375:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBasicFamily.g:376:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getWomanAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBasicFamily.g:380:5: ( ( ruleEString ) )
                    	    // InternalBasicFamily.g:381:6: ( ruleEString )
                    	    {
                    	    // InternalBasicFamily.g:381:6: ( ruleEString )
                    	    // InternalBasicFamily.g:382:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWomanRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWomanAccess().getChildrenPersonCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getWomanAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBasicFamily.g:402:3: (otherlv_16= 'mother' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBasicFamily.g:403:4: otherlv_16= 'mother' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getWomanAccess().getMotherKeyword_6_0());
                    			
                    // InternalBasicFamily.g:407:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:408:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:408:5: ( ruleEString )
                    // InternalBasicFamily.g:409:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWomanRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWomanAccess().getMotherWomanCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBasicFamily.g:424:3: (otherlv_18= 'father' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBasicFamily.g:425:4: otherlv_18= 'father' ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getWomanAccess().getFatherKeyword_7_0());
                    			
                    // InternalBasicFamily.g:429:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:430:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:430:5: ( ruleEString )
                    // InternalBasicFamily.g:431:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWomanRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWomanAccess().getFatherManCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getWomanAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleWoman"


    // $ANTLR start "entryRuleMan"
    // InternalBasicFamily.g:454:1: entryRuleMan returns [EObject current=null] : iv_ruleMan= ruleMan EOF ;
    public final EObject entryRuleMan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMan = null;


        try {
            // InternalBasicFamily.g:454:44: (iv_ruleMan= ruleMan EOF )
            // InternalBasicFamily.g:455:2: iv_ruleMan= ruleMan EOF
            {
             newCompositeNode(grammarAccess.getManRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMan=ruleMan();

            state._fsp--;

             current =iv_ruleMan; 
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
    // $ANTLR end "entryRuleMan"


    // $ANTLR start "ruleMan"
    // InternalBasicFamily.g:461:1: ruleMan returns [EObject current=null] : ( () otherlv_1= 'Man' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleMan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBasicFamily.g:467:2: ( ( () otherlv_1= 'Man' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' ) )
            // InternalBasicFamily.g:468:2: ( () otherlv_1= 'Man' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' )
            {
            // InternalBasicFamily.g:468:2: ( () otherlv_1= 'Man' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' )
            // InternalBasicFamily.g:469:3: () otherlv_1= 'Man' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}'
            {
            // InternalBasicFamily.g:469:3: ()
            // InternalBasicFamily.g:470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getManAccess().getManAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getManAccess().getManKeyword_1());
            		
            // InternalBasicFamily.g:480:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBasicFamily.g:481:4: (lv_name_2_0= ruleEString )
            {
            // InternalBasicFamily.g:481:4: (lv_name_2_0= ruleEString )
            // InternalBasicFamily.g:482:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getManAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.basicfamily.BasicFamily.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getManAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBasicFamily.g:503:3: (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBasicFamily.g:504:4: otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getManAccess().getParentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getManAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalBasicFamily.g:512:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:513:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:513:5: ( ruleEString )
                    // InternalBasicFamily.g:514:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManAccess().getParentsPersonCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBasicFamily.g:528:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBasicFamily.g:529:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getManAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBasicFamily.g:533:5: ( ( ruleEString ) )
                    	    // InternalBasicFamily.g:534:6: ( ruleEString )
                    	    {
                    	    // InternalBasicFamily.g:534:6: ( ruleEString )
                    	    // InternalBasicFamily.g:535:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getManRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getManAccess().getParentsPersonCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getManAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalBasicFamily.g:555:3: (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBasicFamily.g:556:4: otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getManAccess().getChildrenKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getManAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBasicFamily.g:564:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:565:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:565:5: ( ruleEString )
                    // InternalBasicFamily.g:566:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManAccess().getChildrenPersonCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBasicFamily.g:580:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBasicFamily.g:581:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getManAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBasicFamily.g:585:5: ( ( ruleEString ) )
                    	    // InternalBasicFamily.g:586:6: ( ruleEString )
                    	    {
                    	    // InternalBasicFamily.g:586:6: ( ruleEString )
                    	    // InternalBasicFamily.g:587:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getManRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getManAccess().getChildrenPersonCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getManAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBasicFamily.g:607:3: (otherlv_16= 'mother' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBasicFamily.g:608:4: otherlv_16= 'mother' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getManAccess().getMotherKeyword_6_0());
                    			
                    // InternalBasicFamily.g:612:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:613:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:613:5: ( ruleEString )
                    // InternalBasicFamily.g:614:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManAccess().getMotherWomanCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBasicFamily.g:629:3: (otherlv_18= 'father' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBasicFamily.g:630:4: otherlv_18= 'father' ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getManAccess().getFatherKeyword_7_0());
                    			
                    // InternalBasicFamily.g:634:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:635:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:635:5: ( ruleEString )
                    // InternalBasicFamily.g:636:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManAccess().getFatherManCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getManAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleMan"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000728000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000708000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000608000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000408000L});

}