import sa.*;
import sc.analysis.DepthFirstAdapter;
import sc.node.*;

public class Sc2sa extends DepthFirstAdapter {
    private SaNode returnValue;
    public SaNode getRoot() {
        return returnValue;
    }



    @Override
    public void caseALdecfoncrecListedecfonc(ALdecfoncrecListedecfonc node) {
        SaDec tete = null;
        node.getDecfonc().apply(this);
        tete = (SaDec)returnValue;
        node.getListedecfonc().apply(this);
        SaLDec queue = (SaLDec)returnValue;
        returnValue = new SaLDec(tete,queue);
    }

    @Override
    public void caseAFinalListeexp(AFinalListeexp node) {
        this.returnValue = null;
    }

    @Override
    public void caseALdecfoncfinalListedecfonc(ALdecfoncfinalListedecfonc node) {
        this.returnValue = null;
    }

    @Override
    public void caseAInstrDecfonc(AInstrDecfonc node) {
        String nom = null;
        SaLDec param = null;
        SaInst corps = null;
        nom = node.getIdentif().getText();

        node.getInstrbloc().apply(this);
        corps = (SaInst)returnValue;
        node.getListeparam().apply(this);
        param = (SaLDec)returnValue;
        returnValue = new SaDecFonc(nom,param,null,corps);
    }

    @Override
    public void caseADecvarinstrDecfonc(ADecvarinstrDecfonc node) {
        String nom = null;
        SaLDec param = null;
        SaInst corps = null;
        SaLDec vars = null;

        node.getOptdecvar().apply(this);
        vars = (SaLDec)this.returnValue;

        nom = node.getIdentif().getText();

        node.getInstrbloc().apply(this);
        corps = (SaInst)returnValue;
        node.getListeparam().apply(this);
        param = (SaLDec)returnValue;
        returnValue = new SaDecFonc(nom,param, vars,corps);
    }

    @Override
    public void caseAInstrbloc(AInstrbloc node) {
        super.caseAInstrbloc(node);
    }

    @Override
    public void caseASansparamListeparam(ASansparamListeparam node) {
        super.caseASansparamListeparam(node);
    }

    @Override
    public void caseAAvecparamListeparam(AAvecparamListeparam node) {
        super.caseAAvecparamListeparam(node);
    }


    @Override
    public void caseADecvarldecfoncProgramme(ADecvarldecfoncProgramme node) {

        SaLDec variable = null;
        SaLDec fonction = null;


            node.getOptdecvar().apply(this);
            variable = (SaLDec)this.returnValue;


            node.getListedecfonc().apply(this);
            fonction = (SaLDec)this.returnValue;

        this.returnValue = new SaProg(variable,fonction);
    }

    @Override
    public void caseALdecfoncProgramme(ALdecfoncProgramme node) {
         node.getListedecfonc().apply(this);
        SaLDec fonctions = (SaLDec)this.returnValue;
        this.returnValue = new SaProg(null,fonctions);
    }

    @Override
    public void caseAInstraffectInstr(AInstraffectInstr node) {
        super.caseAInstraffectInstr(node);
    }

    @Override
    public void caseAInstrblocInstr(AInstrblocInstr node) {
        super.caseAInstrblocInstr(node);
    }

    @Override
    public void caseAInstrsiInstr(AInstrsiInstr node) {
        super.caseAInstrsiInstr(node);
    }

    @Override
    public void caseAInstrtantqueInstr(AInstrtantqueInstr node) {
        super.caseAInstrtantqueInstr(node);
    }

    @Override
    public void caseAInstrappelInstr(AInstrappelInstr node) {
        super.caseAInstrappelInstr(node);
    }

    @Override
    public void caseAInstrretourInstr(AInstrretourInstr node) {
        super.caseAInstrretourInstr(node);
    }

    @Override
    public void caseAInstrecritureInstr(AInstrecritureInstr node) {
        super.caseAInstrecritureInstr(node);
    }

    @Override
    public void caseAInstrvideInstr(AInstrvideInstr node) {
        this.returnValue = null;
    }

    @Override
    public void caseAOptdecvar(AOptdecvar node) {
        super.caseAOptdecvar(node);
    }

    @Override
    public void caseADecvarListedecvar(ADecvarListedecvar node) {
        SaDec tete = null;
        node.getDecvar().apply(this);
        tete = (SaDec)this.returnValue;
        this.returnValue = new SaLDec(tete,null);
    }

    @Override
    public void caseADecvarldecvarListedecvar(ADecvarldecvarListedecvar node) {
        SaDec tete = null;
        SaLDec queue = null;

            node.getDecvar().apply(this);
            tete = (SaDec)this.returnValue;

            node.getListedecvarbis().apply(this);
            queue = (SaLDec)this.returnValue;

        this.returnValue = new SaLDec(tete,queue);
    }


    @Override
    public void caseADecvarldecvarListedecvarbis(ADecvarldecvarListedecvarbis node) {
        SaDec tete = null;
        node.getDecvar().apply(this);
        tete = (SaDec)returnValue;
        SaLDec queue = null;
        node.getListedecvarbis().apply(this);
        queue = (SaLDec) returnValue;
        returnValue = new SaLDec(tete,queue);

    }

    @Override
    public void caseADecvarListedecvarbis(ADecvarListedecvarbis node) {
        SaDec tete = null;
        node.getDecvar().apply(this);
        tete = (SaDec)returnValue;
        returnValue = new SaLDec(tete,null);
    }

    @Override
    public void caseARecursifListeexpbis(ARecursifListeexpbis node) {
        SaExp tete = null;
        node.getExp().apply(this);
        tete = (SaExp)returnValue;
        node.getListeexpbis().apply(this);
        SaLExp queue = null;
        queue = (SaLExp) this.returnValue;
        returnValue = new SaLExp(tete,queue);
    }

    @Override
    public void caseAFinalListeexpbis(AFinalListeexpbis node) {
        returnValue = null;
    }

    @Override
    public void caseALinstrecListeinst(ALinstrecListeinst node) {
        SaInst tete = null;
        SaLInst queue = null;

            node.getInstr().apply(this);
            tete = (SaInst)this.returnValue;



            node.getListeinst().apply(this);
            queue = (SaLInst)this.returnValue;

        this.returnValue = new SaLInst(tete,queue);
    }

    @Override
    public void caseAVartabVar(AVartabVar node) {
        SaExp indice = null;
        node.getExp().apply(this);
        indice = (SaExp) returnValue;
        String nom = node.getIdentif().getText();
        returnValue = new SaVarIndicee(nom,indice);
    }

    @Override
    public void caseAExp1Exp(AExp1Exp node) {
        super.caseAExp1Exp(node);
    }

    @Override
    public void caseAExp2Exp1(AExp2Exp1 node) {
        super.caseAExp2Exp1(node);
    }

    @Override
    public void caseAExp3Exp2(AExp3Exp2 node) {
        super.caseAExp3Exp2(node);
    }

    @Override
    public void caseAExp4Exp3(AExp4Exp3 node) {
        super.caseAExp4Exp3(node);
    }

    @Override
    public void caseAExp5Exp4(AExp5Exp4 node) {
        super.caseAExp5Exp4(node);
    }

    @Override
    public void caseAExp6Exp5(AExp6Exp5 node) {
        super.caseAExp6Exp5(node);
    }

    @Override
    public void caseAParenthesesExp6(AParenthesesExp6 node) {
        super.caseAParenthesesExp6(node);
    }

    @Override
    public void caseARecursifListeexp(ARecursifListeexp node) {
        SaExp tete = null;
        node.getExp().apply(this);
        tete = (SaExp)this.returnValue;
        node.getListeexpbis().apply(this);
        SaLExp queue = null;
        queue = (SaLExp) this.returnValue;
        returnValue = new SaLExp(tete,queue);
    }


    @Override
    public void caseALinstfinalListeinst(ALinstfinalListeinst node) {
        returnValue = null;
    }

    @Override
    public void inAInstraffect(AInstraffect node) {
        super.inAInstraffect(node);
    }

    @Override
    public void caseAOuExp(AOuExp node) {
        SaExp op1= null;
        SaExp op2= null;

            node.getExp().apply(this);
            op1 = (SaExp)this.returnValue;

        node.getExp1().apply(this);
            op2 = (SaExp)this.returnValue;

        this.returnValue = new SaExpOr(op1,op2);
    }

    @Override
    public void caseAEtExp1(AEtExp1 node) {
        SaExp op1 = null;
        SaExp op2 = null;

            node.getExp1().apply(this);
            op1 = (SaExp)this.returnValue;


            node.getExp2().apply(this);
            op2 = (SaExp)this.returnValue;

        this.returnValue = new SaExpAdd(op1,op2);
    }

    @Override
    public void caseAInfExp2(AInfExp2 node) {
        SaExp op1 = null;
        SaExp op2 = null;

            node.getExp2().apply(this);
            op1 = (SaExp)this.returnValue;


            node.getExp3().apply(this);
            op2 = (SaExp)this.returnValue;

        this.returnValue = new SaExpInf(op1,op2);
    }

    @Override
    public void caseAEgalExp2(AEgalExp2 node) {
        SaExp op1 = null;
        SaExp op2 = null;

            node.getExp2().apply(this);
            op1 = (SaExp)this.returnValue;

            node.getExp3().apply(this);
            op2 = (SaExp)this.returnValue;

        this.returnValue = new SaExpEqual(op1,op2);
    }

    @Override
    public void caseAPlusExp3(APlusExp3 node) {
        SaExp op1 = null;
        SaExp op2 = null;

            node.getExp3().apply(this);
            op1 = (SaExp)this.returnValue;

            node.getExp4().apply(this);
            op2 = (SaExp)this.returnValue;

        this.returnValue = new SaExpAdd(op1,op2);
    }

    @Override
    public void caseAMoinsExp3(AMoinsExp3 node) {
        SaExp op1 = null;
        SaExp op2 = null;

            node.getExp3().apply(this);
            op1 = (SaExp)this.returnValue;

            node.getExp4().apply(this);
            op2 = (SaExp)this.returnValue;

        this.returnValue = new SaExpSub(op1,op2);
    }

    @Override
    public void caseAFoisExp4(AFoisExp4 node) {
        SaExp op1 = null;
        SaExp op2 = null;

            node.getExp4().apply(this);
            op1 = (SaExp)this.returnValue;

            node.getExp5().apply(this);
            op2 = (SaExp)this.returnValue;

        this.returnValue = new SaExpMult(op1,op2);
    }

    @Override
    public void caseADiviseExp4(ADiviseExp4 node) {
        SaExp op1 = null;
        SaExp op2 = null;

            node.getExp4().apply(this);
            op1 = (SaExp)this.returnValue;



            node.getExp5().apply(this);
            op2 = (SaExp)this.returnValue;

        this.returnValue = new SaExpDiv(op1,op2);
    }

    @Override
    public void caseANonExp5(ANonExp5 node) {
        SaExp op1 = null;

            node.getExp5().apply(this);
            op1 = (SaExp)this.returnValue;

        this.returnValue = new SaExpNot(op1);
    }

    @Override
    public void caseAVarExp6(AVarExp6 node) {
        super.caseAVarExp6(node);
    }

    @Override
    public void caseALireExp6(ALireExp6 node) {
        super.caseALireExp6(node);
    }

    @Override
    public void caseAAppelfctExp6(AAppelfctExp6 node) {
        super.caseAAppelfctExp6(node);
    }

    @Override
    public void caseANombreExp6(ANombreExp6 node) {
        int a = 0;

            a = Integer.parseInt(node.getNombre().getText());

        returnValue = new SaExpInt(a);
    }

    @Override
    public void caseAInstraffect(AInstraffect node) {
        SaVar rhs = null;
        SaExp lhs = null;
        node.getVar().apply(this);
        rhs = (SaVar)this.returnValue;
        node.getExp().apply(this);
        lhs = (SaExp) this.returnValue;
        this.returnValue = new SaInstAffect(rhs,lhs);
    }

    @Override
    public void caseAInstrtantque(AInstrtantque node) {
        SaExp condition = null;
        SaInstBloc instrs = null;
        node.getExp().apply(this);
        condition = (SaExp)this.returnValue;
        node.getInstrbloc().apply(this);
        instrs = (SaInstBloc) this.returnValue;
        this.returnValue = new SaInstTantQue(condition,instrs);
    }

    @Override
    public void caseAInstrretour(AInstrretour node) {
        SaExp val = null;
        node.getExp().apply(this);
        val = (SaExp) this.returnValue;
        this.returnValue = new SaInstRetour(val);
    }


    @Override
    public void caseAInstrecriture(AInstrecriture node) {
        SaExp val = null;
        node.getExp().apply(this);
        val = (SaExp) this.returnValue;
        this.returnValue = new SaInstEcriture(val);
    }

    @Override
    public void caseAInstrappel(AInstrappel node) {
        super.caseAInstrappel(node);
    }

    @Override
    public void caseAInstrvide(AInstrvide node) {
        this.returnValue = null;
    }

    @Override
    public void caseAInstrsinon(AInstrsinon node) {
        super.caseAInstrsinon(node);
    }

    @Override
    public void caseAAvecsinonInstrsi(AAvecsinonInstrsi node) {
        SaExp test = null;
        SaInst alors = null;
        SaInst sinon = null;
        node.getExp().apply(this);
        test = (SaExp)this.returnValue;
        node.getInstrbloc().apply(this);
        alors = (SaInst)this.returnValue;
        node.getInstrsinon().apply(this);
        sinon = (SaInst) this.returnValue;
        this.returnValue = new SaInstSi(test,alors,sinon);
    }

    @Override
    public void caseASanssinonInstrsi(ASanssinonInstrsi node) {
        SaExp test = null;
        SaInst alors = null;
        node.getExp().apply(this);
        test = (SaExp)this.returnValue;
        node.getInstrbloc().apply(this);
        alors = (SaInst)this.returnValue;
        this.returnValue = new SaInstSi(test,alors,null);
    }

    @Override
    public void caseAAppelfct(AAppelfct node) {
        String name = null;
        name = node.getIdentif().getText();
        SaLExp wololo = null;
        node.getListeexp().apply(this);
        wololo = (SaLExp) returnValue;
        returnValue = new SaAppel(name,wololo);
    }

    @Override
    public void caseAVarsimpleVar(AVarsimpleVar node) {
       String nom = node.getIdentif().getText();
       this.returnValue = new SaVarSimple(nom);
    }

    @Override
    public void caseADecvarentierDecvar(ADecvarentierDecvar node) {
        String wololo = null;

        wololo = node.getIdentif().getText();

        returnValue = new SaDecVar(wololo);
    }

    @Override
    public void caseADecvartableauDecvar(ADecvartableauDecvar node) {
        String wololo = null;
        int taille;

           wololo =  node.getIdentif().getText();

           taille = Integer.parseInt(node.getNombre().getText());

        returnValue = new SaDecTab(wololo,taille);
    }
}
