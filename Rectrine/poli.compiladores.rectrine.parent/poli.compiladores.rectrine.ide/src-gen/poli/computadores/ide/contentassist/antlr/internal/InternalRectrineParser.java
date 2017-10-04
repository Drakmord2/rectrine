package poli.computadores.ide.contentassist.antlr.internal;

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
import poli.computadores.services.RectrineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRectrineParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TIPO", "RULE_MULT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'{'", "'}'", "':'", "'->'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_MULT=6;
    public static final int T__17=17;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_TIPO=5;

    // delegates
    // delegators


        public InternalRectrineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRectrineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRectrineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRectrine.g"; }


    	private RectrineGrammarAccess grammarAccess;

    	public void setGrammarAccess(RectrineGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalRectrine.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalRectrine.g:54:1: ( ruleProgram EOF )
            // InternalRectrine.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalRectrine.g:62:1: ruleProgram : ( ( rule__Program__EntidadesAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:66:2: ( ( ( rule__Program__EntidadesAssignment )* ) )
            // InternalRectrine.g:67:2: ( ( rule__Program__EntidadesAssignment )* )
            {
            // InternalRectrine.g:67:2: ( ( rule__Program__EntidadesAssignment )* )
            // InternalRectrine.g:68:3: ( rule__Program__EntidadesAssignment )*
            {
             before(grammarAccess.getProgramAccess().getEntidadesAssignment()); 
            // InternalRectrine.g:69:3: ( rule__Program__EntidadesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRectrine.g:69:4: rule__Program__EntidadesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__EntidadesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getEntidadesAssignment()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleEntidade"
    // InternalRectrine.g:78:1: entryRuleEntidade : ruleEntidade EOF ;
    public final void entryRuleEntidade() throws RecognitionException {
        try {
            // InternalRectrine.g:79:1: ( ruleEntidade EOF )
            // InternalRectrine.g:80:1: ruleEntidade EOF
            {
             before(grammarAccess.getEntidadeRule()); 
            pushFollow(FOLLOW_1);
            ruleEntidade();

            state._fsp--;

             after(grammarAccess.getEntidadeRule()); 
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
    // $ANTLR end "entryRuleEntidade"


    // $ANTLR start "ruleEntidade"
    // InternalRectrine.g:87:1: ruleEntidade : ( ( rule__Entidade__Group__0 ) ) ;
    public final void ruleEntidade() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:91:2: ( ( ( rule__Entidade__Group__0 ) ) )
            // InternalRectrine.g:92:2: ( ( rule__Entidade__Group__0 ) )
            {
            // InternalRectrine.g:92:2: ( ( rule__Entidade__Group__0 ) )
            // InternalRectrine.g:93:3: ( rule__Entidade__Group__0 )
            {
             before(grammarAccess.getEntidadeAccess().getGroup()); 
            // InternalRectrine.g:94:3: ( rule__Entidade__Group__0 )
            // InternalRectrine.g:94:4: rule__Entidade__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entidade__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntidadeAccess().getGroup()); 

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
    // $ANTLR end "ruleEntidade"


    // $ANTLR start "entryRuleCampo"
    // InternalRectrine.g:103:1: entryRuleCampo : ruleCampo EOF ;
    public final void entryRuleCampo() throws RecognitionException {
        try {
            // InternalRectrine.g:104:1: ( ruleCampo EOF )
            // InternalRectrine.g:105:1: ruleCampo EOF
            {
             before(grammarAccess.getCampoRule()); 
            pushFollow(FOLLOW_1);
            ruleCampo();

            state._fsp--;

             after(grammarAccess.getCampoRule()); 
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
    // $ANTLR end "entryRuleCampo"


    // $ANTLR start "ruleCampo"
    // InternalRectrine.g:112:1: ruleCampo : ( ( rule__Campo__Group__0 ) ) ;
    public final void ruleCampo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:116:2: ( ( ( rule__Campo__Group__0 ) ) )
            // InternalRectrine.g:117:2: ( ( rule__Campo__Group__0 ) )
            {
            // InternalRectrine.g:117:2: ( ( rule__Campo__Group__0 ) )
            // InternalRectrine.g:118:3: ( rule__Campo__Group__0 )
            {
             before(grammarAccess.getCampoAccess().getGroup()); 
            // InternalRectrine.g:119:3: ( rule__Campo__Group__0 )
            // InternalRectrine.g:119:4: rule__Campo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Campo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCampoAccess().getGroup()); 

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
    // $ANTLR end "ruleCampo"


    // $ANTLR start "entryRuleLigacao"
    // InternalRectrine.g:128:1: entryRuleLigacao : ruleLigacao EOF ;
    public final void entryRuleLigacao() throws RecognitionException {
        try {
            // InternalRectrine.g:129:1: ( ruleLigacao EOF )
            // InternalRectrine.g:130:1: ruleLigacao EOF
            {
             before(grammarAccess.getLigacaoRule()); 
            pushFollow(FOLLOW_1);
            ruleLigacao();

            state._fsp--;

             after(grammarAccess.getLigacaoRule()); 
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
    // $ANTLR end "entryRuleLigacao"


    // $ANTLR start "ruleLigacao"
    // InternalRectrine.g:137:1: ruleLigacao : ( ( rule__Ligacao__Group__0 ) ) ;
    public final void ruleLigacao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:141:2: ( ( ( rule__Ligacao__Group__0 ) ) )
            // InternalRectrine.g:142:2: ( ( rule__Ligacao__Group__0 ) )
            {
            // InternalRectrine.g:142:2: ( ( rule__Ligacao__Group__0 ) )
            // InternalRectrine.g:143:3: ( rule__Ligacao__Group__0 )
            {
             before(grammarAccess.getLigacaoAccess().getGroup()); 
            // InternalRectrine.g:144:3: ( rule__Ligacao__Group__0 )
            // InternalRectrine.g:144:4: rule__Ligacao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ligacao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLigacaoAccess().getGroup()); 

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
    // $ANTLR end "ruleLigacao"


    // $ANTLR start "rule__Campo__Alternatives_2"
    // InternalRectrine.g:152:1: rule__Campo__Alternatives_2 : ( ( ( rule__Campo__TipoAssignment_2_0 ) ) | ( ( rule__Campo__RelAssignment_2_1 ) ) );
    public final void rule__Campo__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:156:1: ( ( ( rule__Campo__TipoAssignment_2_0 ) ) | ( ( rule__Campo__RelAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_TIPO) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRectrine.g:157:2: ( ( rule__Campo__TipoAssignment_2_0 ) )
                    {
                    // InternalRectrine.g:157:2: ( ( rule__Campo__TipoAssignment_2_0 ) )
                    // InternalRectrine.g:158:3: ( rule__Campo__TipoAssignment_2_0 )
                    {
                     before(grammarAccess.getCampoAccess().getTipoAssignment_2_0()); 
                    // InternalRectrine.g:159:3: ( rule__Campo__TipoAssignment_2_0 )
                    // InternalRectrine.g:159:4: rule__Campo__TipoAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Campo__TipoAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCampoAccess().getTipoAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRectrine.g:163:2: ( ( rule__Campo__RelAssignment_2_1 ) )
                    {
                    // InternalRectrine.g:163:2: ( ( rule__Campo__RelAssignment_2_1 ) )
                    // InternalRectrine.g:164:3: ( rule__Campo__RelAssignment_2_1 )
                    {
                     before(grammarAccess.getCampoAccess().getRelAssignment_2_1()); 
                    // InternalRectrine.g:165:3: ( rule__Campo__RelAssignment_2_1 )
                    // InternalRectrine.g:165:4: rule__Campo__RelAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Campo__RelAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCampoAccess().getRelAssignment_2_1()); 

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
    // $ANTLR end "rule__Campo__Alternatives_2"


    // $ANTLR start "rule__Entidade__Group__0"
    // InternalRectrine.g:173:1: rule__Entidade__Group__0 : rule__Entidade__Group__0__Impl rule__Entidade__Group__1 ;
    public final void rule__Entidade__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:177:1: ( rule__Entidade__Group__0__Impl rule__Entidade__Group__1 )
            // InternalRectrine.g:178:2: rule__Entidade__Group__0__Impl rule__Entidade__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entidade__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidade__Group__1();

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
    // $ANTLR end "rule__Entidade__Group__0"


    // $ANTLR start "rule__Entidade__Group__0__Impl"
    // InternalRectrine.g:185:1: rule__Entidade__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entidade__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:189:1: ( ( 'entity' ) )
            // InternalRectrine.g:190:1: ( 'entity' )
            {
            // InternalRectrine.g:190:1: ( 'entity' )
            // InternalRectrine.g:191:2: 'entity'
            {
             before(grammarAccess.getEntidadeAccess().getEntityKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntidadeAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entidade__Group__0__Impl"


    // $ANTLR start "rule__Entidade__Group__1"
    // InternalRectrine.g:200:1: rule__Entidade__Group__1 : rule__Entidade__Group__1__Impl rule__Entidade__Group__2 ;
    public final void rule__Entidade__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:204:1: ( rule__Entidade__Group__1__Impl rule__Entidade__Group__2 )
            // InternalRectrine.g:205:2: rule__Entidade__Group__1__Impl rule__Entidade__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entidade__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidade__Group__2();

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
    // $ANTLR end "rule__Entidade__Group__1"


    // $ANTLR start "rule__Entidade__Group__1__Impl"
    // InternalRectrine.g:212:1: rule__Entidade__Group__1__Impl : ( ( rule__Entidade__NameAssignment_1 ) ) ;
    public final void rule__Entidade__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:216:1: ( ( ( rule__Entidade__NameAssignment_1 ) ) )
            // InternalRectrine.g:217:1: ( ( rule__Entidade__NameAssignment_1 ) )
            {
            // InternalRectrine.g:217:1: ( ( rule__Entidade__NameAssignment_1 ) )
            // InternalRectrine.g:218:2: ( rule__Entidade__NameAssignment_1 )
            {
             before(grammarAccess.getEntidadeAccess().getNameAssignment_1()); 
            // InternalRectrine.g:219:2: ( rule__Entidade__NameAssignment_1 )
            // InternalRectrine.g:219:3: rule__Entidade__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entidade__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntidadeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entidade__Group__1__Impl"


    // $ANTLR start "rule__Entidade__Group__2"
    // InternalRectrine.g:227:1: rule__Entidade__Group__2 : rule__Entidade__Group__2__Impl rule__Entidade__Group__3 ;
    public final void rule__Entidade__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:231:1: ( rule__Entidade__Group__2__Impl rule__Entidade__Group__3 )
            // InternalRectrine.g:232:2: rule__Entidade__Group__2__Impl rule__Entidade__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Entidade__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidade__Group__3();

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
    // $ANTLR end "rule__Entidade__Group__2"


    // $ANTLR start "rule__Entidade__Group__2__Impl"
    // InternalRectrine.g:239:1: rule__Entidade__Group__2__Impl : ( '{' ) ;
    public final void rule__Entidade__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:243:1: ( ( '{' ) )
            // InternalRectrine.g:244:1: ( '{' )
            {
            // InternalRectrine.g:244:1: ( '{' )
            // InternalRectrine.g:245:2: '{'
            {
             before(grammarAccess.getEntidadeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntidadeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Entidade__Group__2__Impl"


    // $ANTLR start "rule__Entidade__Group__3"
    // InternalRectrine.g:254:1: rule__Entidade__Group__3 : rule__Entidade__Group__3__Impl rule__Entidade__Group__4 ;
    public final void rule__Entidade__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:258:1: ( rule__Entidade__Group__3__Impl rule__Entidade__Group__4 )
            // InternalRectrine.g:259:2: rule__Entidade__Group__3__Impl rule__Entidade__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Entidade__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidade__Group__4();

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
    // $ANTLR end "rule__Entidade__Group__3"


    // $ANTLR start "rule__Entidade__Group__3__Impl"
    // InternalRectrine.g:266:1: rule__Entidade__Group__3__Impl : ( ( rule__Entidade__CamposAssignment_3 )* ) ;
    public final void rule__Entidade__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:270:1: ( ( ( rule__Entidade__CamposAssignment_3 )* ) )
            // InternalRectrine.g:271:1: ( ( rule__Entidade__CamposAssignment_3 )* )
            {
            // InternalRectrine.g:271:1: ( ( rule__Entidade__CamposAssignment_3 )* )
            // InternalRectrine.g:272:2: ( rule__Entidade__CamposAssignment_3 )*
            {
             before(grammarAccess.getEntidadeAccess().getCamposAssignment_3()); 
            // InternalRectrine.g:273:2: ( rule__Entidade__CamposAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRectrine.g:273:3: rule__Entidade__CamposAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entidade__CamposAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEntidadeAccess().getCamposAssignment_3()); 

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
    // $ANTLR end "rule__Entidade__Group__3__Impl"


    // $ANTLR start "rule__Entidade__Group__4"
    // InternalRectrine.g:281:1: rule__Entidade__Group__4 : rule__Entidade__Group__4__Impl ;
    public final void rule__Entidade__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:285:1: ( rule__Entidade__Group__4__Impl )
            // InternalRectrine.g:286:2: rule__Entidade__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidade__Group__4__Impl();

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
    // $ANTLR end "rule__Entidade__Group__4"


    // $ANTLR start "rule__Entidade__Group__4__Impl"
    // InternalRectrine.g:292:1: rule__Entidade__Group__4__Impl : ( '}' ) ;
    public final void rule__Entidade__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:296:1: ( ( '}' ) )
            // InternalRectrine.g:297:1: ( '}' )
            {
            // InternalRectrine.g:297:1: ( '}' )
            // InternalRectrine.g:298:2: '}'
            {
             before(grammarAccess.getEntidadeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntidadeAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entidade__Group__4__Impl"


    // $ANTLR start "rule__Campo__Group__0"
    // InternalRectrine.g:308:1: rule__Campo__Group__0 : rule__Campo__Group__0__Impl rule__Campo__Group__1 ;
    public final void rule__Campo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:312:1: ( rule__Campo__Group__0__Impl rule__Campo__Group__1 )
            // InternalRectrine.g:313:2: rule__Campo__Group__0__Impl rule__Campo__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Campo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campo__Group__1();

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
    // $ANTLR end "rule__Campo__Group__0"


    // $ANTLR start "rule__Campo__Group__0__Impl"
    // InternalRectrine.g:320:1: rule__Campo__Group__0__Impl : ( ( rule__Campo__NameAssignment_0 ) ) ;
    public final void rule__Campo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:324:1: ( ( ( rule__Campo__NameAssignment_0 ) ) )
            // InternalRectrine.g:325:1: ( ( rule__Campo__NameAssignment_0 ) )
            {
            // InternalRectrine.g:325:1: ( ( rule__Campo__NameAssignment_0 ) )
            // InternalRectrine.g:326:2: ( rule__Campo__NameAssignment_0 )
            {
             before(grammarAccess.getCampoAccess().getNameAssignment_0()); 
            // InternalRectrine.g:327:2: ( rule__Campo__NameAssignment_0 )
            // InternalRectrine.g:327:3: rule__Campo__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Campo__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCampoAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Campo__Group__0__Impl"


    // $ANTLR start "rule__Campo__Group__1"
    // InternalRectrine.g:335:1: rule__Campo__Group__1 : rule__Campo__Group__1__Impl rule__Campo__Group__2 ;
    public final void rule__Campo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:339:1: ( rule__Campo__Group__1__Impl rule__Campo__Group__2 )
            // InternalRectrine.g:340:2: rule__Campo__Group__1__Impl rule__Campo__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Campo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campo__Group__2();

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
    // $ANTLR end "rule__Campo__Group__1"


    // $ANTLR start "rule__Campo__Group__1__Impl"
    // InternalRectrine.g:347:1: rule__Campo__Group__1__Impl : ( ':' ) ;
    public final void rule__Campo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:351:1: ( ( ':' ) )
            // InternalRectrine.g:352:1: ( ':' )
            {
            // InternalRectrine.g:352:1: ( ':' )
            // InternalRectrine.g:353:2: ':'
            {
             before(grammarAccess.getCampoAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCampoAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Campo__Group__1__Impl"


    // $ANTLR start "rule__Campo__Group__2"
    // InternalRectrine.g:362:1: rule__Campo__Group__2 : rule__Campo__Group__2__Impl ;
    public final void rule__Campo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:366:1: ( rule__Campo__Group__2__Impl )
            // InternalRectrine.g:367:2: rule__Campo__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Campo__Group__2__Impl();

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
    // $ANTLR end "rule__Campo__Group__2"


    // $ANTLR start "rule__Campo__Group__2__Impl"
    // InternalRectrine.g:373:1: rule__Campo__Group__2__Impl : ( ( rule__Campo__Alternatives_2 ) ) ;
    public final void rule__Campo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:377:1: ( ( ( rule__Campo__Alternatives_2 ) ) )
            // InternalRectrine.g:378:1: ( ( rule__Campo__Alternatives_2 ) )
            {
            // InternalRectrine.g:378:1: ( ( rule__Campo__Alternatives_2 ) )
            // InternalRectrine.g:379:2: ( rule__Campo__Alternatives_2 )
            {
             before(grammarAccess.getCampoAccess().getAlternatives_2()); 
            // InternalRectrine.g:380:2: ( rule__Campo__Alternatives_2 )
            // InternalRectrine.g:380:3: rule__Campo__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Campo__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCampoAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Campo__Group__2__Impl"


    // $ANTLR start "rule__Ligacao__Group__0"
    // InternalRectrine.g:389:1: rule__Ligacao__Group__0 : rule__Ligacao__Group__0__Impl rule__Ligacao__Group__1 ;
    public final void rule__Ligacao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:393:1: ( rule__Ligacao__Group__0__Impl rule__Ligacao__Group__1 )
            // InternalRectrine.g:394:2: rule__Ligacao__Group__0__Impl rule__Ligacao__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Ligacao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligacao__Group__1();

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
    // $ANTLR end "rule__Ligacao__Group__0"


    // $ANTLR start "rule__Ligacao__Group__0__Impl"
    // InternalRectrine.g:401:1: rule__Ligacao__Group__0__Impl : ( ( rule__Ligacao__Ent1Assignment_0 ) ) ;
    public final void rule__Ligacao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:405:1: ( ( ( rule__Ligacao__Ent1Assignment_0 ) ) )
            // InternalRectrine.g:406:1: ( ( rule__Ligacao__Ent1Assignment_0 ) )
            {
            // InternalRectrine.g:406:1: ( ( rule__Ligacao__Ent1Assignment_0 ) )
            // InternalRectrine.g:407:2: ( rule__Ligacao__Ent1Assignment_0 )
            {
             before(grammarAccess.getLigacaoAccess().getEnt1Assignment_0()); 
            // InternalRectrine.g:408:2: ( rule__Ligacao__Ent1Assignment_0 )
            // InternalRectrine.g:408:3: rule__Ligacao__Ent1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ligacao__Ent1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLigacaoAccess().getEnt1Assignment_0()); 

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
    // $ANTLR end "rule__Ligacao__Group__0__Impl"


    // $ANTLR start "rule__Ligacao__Group__1"
    // InternalRectrine.g:416:1: rule__Ligacao__Group__1 : rule__Ligacao__Group__1__Impl rule__Ligacao__Group__2 ;
    public final void rule__Ligacao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:420:1: ( rule__Ligacao__Group__1__Impl rule__Ligacao__Group__2 )
            // InternalRectrine.g:421:2: rule__Ligacao__Group__1__Impl rule__Ligacao__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Ligacao__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligacao__Group__2();

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
    // $ANTLR end "rule__Ligacao__Group__1"


    // $ANTLR start "rule__Ligacao__Group__1__Impl"
    // InternalRectrine.g:428:1: rule__Ligacao__Group__1__Impl : ( ( rule__Ligacao__Mul1Assignment_1 ) ) ;
    public final void rule__Ligacao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:432:1: ( ( ( rule__Ligacao__Mul1Assignment_1 ) ) )
            // InternalRectrine.g:433:1: ( ( rule__Ligacao__Mul1Assignment_1 ) )
            {
            // InternalRectrine.g:433:1: ( ( rule__Ligacao__Mul1Assignment_1 ) )
            // InternalRectrine.g:434:2: ( rule__Ligacao__Mul1Assignment_1 )
            {
             before(grammarAccess.getLigacaoAccess().getMul1Assignment_1()); 
            // InternalRectrine.g:435:2: ( rule__Ligacao__Mul1Assignment_1 )
            // InternalRectrine.g:435:3: rule__Ligacao__Mul1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ligacao__Mul1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLigacaoAccess().getMul1Assignment_1()); 

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
    // $ANTLR end "rule__Ligacao__Group__1__Impl"


    // $ANTLR start "rule__Ligacao__Group__2"
    // InternalRectrine.g:443:1: rule__Ligacao__Group__2 : rule__Ligacao__Group__2__Impl rule__Ligacao__Group__3 ;
    public final void rule__Ligacao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:447:1: ( rule__Ligacao__Group__2__Impl rule__Ligacao__Group__3 )
            // InternalRectrine.g:448:2: rule__Ligacao__Group__2__Impl rule__Ligacao__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Ligacao__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligacao__Group__3();

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
    // $ANTLR end "rule__Ligacao__Group__2"


    // $ANTLR start "rule__Ligacao__Group__2__Impl"
    // InternalRectrine.g:455:1: rule__Ligacao__Group__2__Impl : ( '->' ) ;
    public final void rule__Ligacao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:459:1: ( ( '->' ) )
            // InternalRectrine.g:460:1: ( '->' )
            {
            // InternalRectrine.g:460:1: ( '->' )
            // InternalRectrine.g:461:2: '->'
            {
             before(grammarAccess.getLigacaoAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLigacaoAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Ligacao__Group__2__Impl"


    // $ANTLR start "rule__Ligacao__Group__3"
    // InternalRectrine.g:470:1: rule__Ligacao__Group__3 : rule__Ligacao__Group__3__Impl rule__Ligacao__Group__4 ;
    public final void rule__Ligacao__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:474:1: ( rule__Ligacao__Group__3__Impl rule__Ligacao__Group__4 )
            // InternalRectrine.g:475:2: rule__Ligacao__Group__3__Impl rule__Ligacao__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Ligacao__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligacao__Group__4();

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
    // $ANTLR end "rule__Ligacao__Group__3"


    // $ANTLR start "rule__Ligacao__Group__3__Impl"
    // InternalRectrine.g:482:1: rule__Ligacao__Group__3__Impl : ( ( rule__Ligacao__Mul2Assignment_3 ) ) ;
    public final void rule__Ligacao__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:486:1: ( ( ( rule__Ligacao__Mul2Assignment_3 ) ) )
            // InternalRectrine.g:487:1: ( ( rule__Ligacao__Mul2Assignment_3 ) )
            {
            // InternalRectrine.g:487:1: ( ( rule__Ligacao__Mul2Assignment_3 ) )
            // InternalRectrine.g:488:2: ( rule__Ligacao__Mul2Assignment_3 )
            {
             before(grammarAccess.getLigacaoAccess().getMul2Assignment_3()); 
            // InternalRectrine.g:489:2: ( rule__Ligacao__Mul2Assignment_3 )
            // InternalRectrine.g:489:3: rule__Ligacao__Mul2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ligacao__Mul2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLigacaoAccess().getMul2Assignment_3()); 

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
    // $ANTLR end "rule__Ligacao__Group__3__Impl"


    // $ANTLR start "rule__Ligacao__Group__4"
    // InternalRectrine.g:497:1: rule__Ligacao__Group__4 : rule__Ligacao__Group__4__Impl ;
    public final void rule__Ligacao__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:501:1: ( rule__Ligacao__Group__4__Impl )
            // InternalRectrine.g:502:2: rule__Ligacao__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ligacao__Group__4__Impl();

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
    // $ANTLR end "rule__Ligacao__Group__4"


    // $ANTLR start "rule__Ligacao__Group__4__Impl"
    // InternalRectrine.g:508:1: rule__Ligacao__Group__4__Impl : ( ( rule__Ligacao__Ent2Assignment_4 ) ) ;
    public final void rule__Ligacao__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:512:1: ( ( ( rule__Ligacao__Ent2Assignment_4 ) ) )
            // InternalRectrine.g:513:1: ( ( rule__Ligacao__Ent2Assignment_4 ) )
            {
            // InternalRectrine.g:513:1: ( ( rule__Ligacao__Ent2Assignment_4 ) )
            // InternalRectrine.g:514:2: ( rule__Ligacao__Ent2Assignment_4 )
            {
             before(grammarAccess.getLigacaoAccess().getEnt2Assignment_4()); 
            // InternalRectrine.g:515:2: ( rule__Ligacao__Ent2Assignment_4 )
            // InternalRectrine.g:515:3: rule__Ligacao__Ent2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Ligacao__Ent2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLigacaoAccess().getEnt2Assignment_4()); 

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
    // $ANTLR end "rule__Ligacao__Group__4__Impl"


    // $ANTLR start "rule__Program__EntidadesAssignment"
    // InternalRectrine.g:524:1: rule__Program__EntidadesAssignment : ( ruleEntidade ) ;
    public final void rule__Program__EntidadesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:528:1: ( ( ruleEntidade ) )
            // InternalRectrine.g:529:2: ( ruleEntidade )
            {
            // InternalRectrine.g:529:2: ( ruleEntidade )
            // InternalRectrine.g:530:3: ruleEntidade
            {
             before(grammarAccess.getProgramAccess().getEntidadesEntidadeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidade();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getEntidadesEntidadeParserRuleCall_0()); 

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
    // $ANTLR end "rule__Program__EntidadesAssignment"


    // $ANTLR start "rule__Entidade__NameAssignment_1"
    // InternalRectrine.g:539:1: rule__Entidade__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entidade__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:543:1: ( ( RULE_ID ) )
            // InternalRectrine.g:544:2: ( RULE_ID )
            {
            // InternalRectrine.g:544:2: ( RULE_ID )
            // InternalRectrine.g:545:3: RULE_ID
            {
             before(grammarAccess.getEntidadeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntidadeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entidade__NameAssignment_1"


    // $ANTLR start "rule__Entidade__CamposAssignment_3"
    // InternalRectrine.g:554:1: rule__Entidade__CamposAssignment_3 : ( ruleCampo ) ;
    public final void rule__Entidade__CamposAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:558:1: ( ( ruleCampo ) )
            // InternalRectrine.g:559:2: ( ruleCampo )
            {
            // InternalRectrine.g:559:2: ( ruleCampo )
            // InternalRectrine.g:560:3: ruleCampo
            {
             before(grammarAccess.getEntidadeAccess().getCamposCampoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCampo();

            state._fsp--;

             after(grammarAccess.getEntidadeAccess().getCamposCampoParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entidade__CamposAssignment_3"


    // $ANTLR start "rule__Campo__NameAssignment_0"
    // InternalRectrine.g:569:1: rule__Campo__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Campo__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:573:1: ( ( RULE_ID ) )
            // InternalRectrine.g:574:2: ( RULE_ID )
            {
            // InternalRectrine.g:574:2: ( RULE_ID )
            // InternalRectrine.g:575:3: RULE_ID
            {
             before(grammarAccess.getCampoAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCampoAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Campo__NameAssignment_0"


    // $ANTLR start "rule__Campo__TipoAssignment_2_0"
    // InternalRectrine.g:584:1: rule__Campo__TipoAssignment_2_0 : ( RULE_TIPO ) ;
    public final void rule__Campo__TipoAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:588:1: ( ( RULE_TIPO ) )
            // InternalRectrine.g:589:2: ( RULE_TIPO )
            {
            // InternalRectrine.g:589:2: ( RULE_TIPO )
            // InternalRectrine.g:590:3: RULE_TIPO
            {
             before(grammarAccess.getCampoAccess().getTipoTIPOTerminalRuleCall_2_0_0()); 
            match(input,RULE_TIPO,FOLLOW_2); 
             after(grammarAccess.getCampoAccess().getTipoTIPOTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Campo__TipoAssignment_2_0"


    // $ANTLR start "rule__Campo__RelAssignment_2_1"
    // InternalRectrine.g:599:1: rule__Campo__RelAssignment_2_1 : ( ruleLigacao ) ;
    public final void rule__Campo__RelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:603:1: ( ( ruleLigacao ) )
            // InternalRectrine.g:604:2: ( ruleLigacao )
            {
            // InternalRectrine.g:604:2: ( ruleLigacao )
            // InternalRectrine.g:605:3: ruleLigacao
            {
             before(grammarAccess.getCampoAccess().getRelLigacaoParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLigacao();

            state._fsp--;

             after(grammarAccess.getCampoAccess().getRelLigacaoParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Campo__RelAssignment_2_1"


    // $ANTLR start "rule__Ligacao__Ent1Assignment_0"
    // InternalRectrine.g:614:1: rule__Ligacao__Ent1Assignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Ligacao__Ent1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:618:1: ( ( ( RULE_ID ) ) )
            // InternalRectrine.g:619:2: ( ( RULE_ID ) )
            {
            // InternalRectrine.g:619:2: ( ( RULE_ID ) )
            // InternalRectrine.g:620:3: ( RULE_ID )
            {
             before(grammarAccess.getLigacaoAccess().getEnt1EntidadeCrossReference_0_0()); 
            // InternalRectrine.g:621:3: ( RULE_ID )
            // InternalRectrine.g:622:4: RULE_ID
            {
             before(grammarAccess.getLigacaoAccess().getEnt1EntidadeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLigacaoAccess().getEnt1EntidadeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLigacaoAccess().getEnt1EntidadeCrossReference_0_0()); 

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
    // $ANTLR end "rule__Ligacao__Ent1Assignment_0"


    // $ANTLR start "rule__Ligacao__Mul1Assignment_1"
    // InternalRectrine.g:633:1: rule__Ligacao__Mul1Assignment_1 : ( RULE_MULT ) ;
    public final void rule__Ligacao__Mul1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:637:1: ( ( RULE_MULT ) )
            // InternalRectrine.g:638:2: ( RULE_MULT )
            {
            // InternalRectrine.g:638:2: ( RULE_MULT )
            // InternalRectrine.g:639:3: RULE_MULT
            {
             before(grammarAccess.getLigacaoAccess().getMul1MULTTerminalRuleCall_1_0()); 
            match(input,RULE_MULT,FOLLOW_2); 
             after(grammarAccess.getLigacaoAccess().getMul1MULTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Ligacao__Mul1Assignment_1"


    // $ANTLR start "rule__Ligacao__Mul2Assignment_3"
    // InternalRectrine.g:648:1: rule__Ligacao__Mul2Assignment_3 : ( RULE_MULT ) ;
    public final void rule__Ligacao__Mul2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:652:1: ( ( RULE_MULT ) )
            // InternalRectrine.g:653:2: ( RULE_MULT )
            {
            // InternalRectrine.g:653:2: ( RULE_MULT )
            // InternalRectrine.g:654:3: RULE_MULT
            {
             before(grammarAccess.getLigacaoAccess().getMul2MULTTerminalRuleCall_3_0()); 
            match(input,RULE_MULT,FOLLOW_2); 
             after(grammarAccess.getLigacaoAccess().getMul2MULTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Ligacao__Mul2Assignment_3"


    // $ANTLR start "rule__Ligacao__Ent2Assignment_4"
    // InternalRectrine.g:663:1: rule__Ligacao__Ent2Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Ligacao__Ent2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRectrine.g:667:1: ( ( ( RULE_ID ) ) )
            // InternalRectrine.g:668:2: ( ( RULE_ID ) )
            {
            // InternalRectrine.g:668:2: ( ( RULE_ID ) )
            // InternalRectrine.g:669:3: ( RULE_ID )
            {
             before(grammarAccess.getLigacaoAccess().getEnt2EntidadeCrossReference_4_0()); 
            // InternalRectrine.g:670:3: ( RULE_ID )
            // InternalRectrine.g:671:4: RULE_ID
            {
             before(grammarAccess.getLigacaoAccess().getEnt2EntidadeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLigacaoAccess().getEnt2EntidadeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getLigacaoAccess().getEnt2EntidadeCrossReference_4_0()); 

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
    // $ANTLR end "rule__Ligacao__Ent2Assignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});

}