/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.analysis;

import java.util.*;
import sc.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgramme(AProgramme node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgrammesuite(AProgrammesuite node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListedefonction(AListedefonction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASuitelistefuncListedefonction2(ASuitelistefuncListedefonction2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVideListedefonction2(AVideListedefonction2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefonction(ADefonction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASuitedeclarfuncDefonction2(ASuitedeclarfuncDefonction2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASuitefonctionDefonction2(ASuitefonctionDefonction2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADefonction3(ADefonction3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocfonc(ABlocfonc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleVar(ASimpleVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeriveVar(ADeriveVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleDeclarvar(ASimpleDeclarvar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeriveDeclarvar(ADeriveDeclarvar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListevarListedeclarvar(AListevarListedeclarvar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVideListedeclarvar(AVideListedeclarvar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASuitelistevarListdeclarvar2(ASuitelistevarListdeclarvar2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVideListdeclarvar2(AVideListdeclarvar2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInstruvide(AInstruvide node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAffectation(AAffectation node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuExpr(AOuExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpr1Expr(AExpr1Expr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEtExpr1(AEtExpr1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpr2Expr1(AExpr2Expr1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEgalExpr2(AEgalExpr2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInfExpr2(AInfExpr2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpr3Expr2(AExpr3Expr2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusExpr3(APlusExpr3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMoinsExpr3(AMoinsExpr3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpr4Expr3(AExpr4Expr3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFoisExpr4(AFoisExpr4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADiviseExpr4(ADiviseExpr4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpr5Expr4(AExpr5Expr4 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANonExpr5(ANonExpr5 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpr6Expr5(AExpr6Expr5 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenthesageExpr6(AParenthesageExpr6 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANombreExpr6(ANombreExpr6 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdentifExpr6(AIdentifExpr6 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALireExpr6(ALireExpr6 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAppelfunctionExpr6(AAppelfunctionExpr6 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInstfuncInstr(AInstfuncInstr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAffInstr(AAffInstr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnInstr(AReturnInstr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEcrireInstr(AEcrireInstr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFonctionparamAppelf(AFonctionparamAppelf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInstructfonction(AInstructfonction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturn(AReturn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWrite(AWrite node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParamListexpr(AParamListexpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVideListexpr(AVideListexpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASuiteparamListexpr2(ASuiteparamListexpr2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVideListexpr2(AVideListexpr2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASiKeyword(ASiKeyword node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATantqueKeyword(ATantqueKeyword node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASiIf(ASiIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASisinonIf(ASisinonIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocsinon(ABlocsinon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABloc(ABloc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASuitexprBloc2(ASuitexprBloc2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAKeywordBloc2(AKeywordBloc2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVideBloc2(AVideBloc2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhile(AWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEspaces(TEspaces node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentaire(TCommentaire node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPointVirgule(TPointVirgule node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgule(TVirgule node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMoins(TMoins node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFois(TFois node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivise(TDivise node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLp(TLp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRp(TRp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCr(TCr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCl(TCl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAl(TAl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAr(TAr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEgal(TEgal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInf(TInf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSup(TSup node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEt(TEt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNon(TNon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSi(TSi node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAlors(TAlors node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSinon(TSinon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTantque(TTantque node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaire(TFaire node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntier(TEntier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRetour(TRetour node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLire(TLire node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEcrire(TEcrire node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentif(TIdentif node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNombre(TNombre node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
