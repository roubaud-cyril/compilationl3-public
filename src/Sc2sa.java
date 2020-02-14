import sa.*;
import sc.analysis.DepthFirstAdapter;
import sc.node.*;

public class Sc2sa extends DepthFirstAdapter {
    private SaNode returnValue;

    @Override
    public void caseADecvarldecfoncProgramme(ADecvarldecfoncProgramme node) {

        SaLDec variable = null;
        SaLDec fonction = null;

        if(node.getOptdecvar() != null)
        {
            node.getOptdecvar().apply(this);
            variable = (SaLDec)this.returnValue;
        }
        if(node.getListedecfonc() != null)
        {
            node.getListedecfonc().apply(this);
            fonction = (SaLDec)this.returnValue;
        }
        this.returnValue = new SaProg(variable,fonction);
    }

    @Override
    public void caseAOptdecvar(AOptdecvar node) {
        super.caseAOptdecvar(node);
    }

    @Override
    public void caseADecvarListedecvar(ADecvarListedecvar node) {
        super.caseADecvarListedecvar(node);
    }

    @Override
    public void caseADecvarldecvarListedecvar(ADecvarldecvarListedecvar node) {
        SaDec tete = null;
        SaLDec queue = null;
        if(node.getDecvar() != null)
        {
            node.getDecvar().apply(this);
            tete = (SaDec)this.returnValue;
        }
        if(node.getListedecvarbis() != null)
        {
            node.getListedecvarbis().apply(this);
            queue = (SaLDec)this.returnValue;
        }
        this.returnValue = new SaLDec(tete,queue);
    }

    @Override
    public void caseADecvarldecvarListedecvarbis(ADecvarldecvarListedecvarbis node) {
        super.caseADecvarldecvarListedecvarbis(node);
    }

    @Override
    public void caseADecvarListedecvarbis(ADecvarListedecvarbis node) {
        super.caseADecvarListedecvarbis(node);
    }

    @Override
    public void caseARecursifListeexpbis(ARecursifListeexpbis node) {
        super.caseARecursifListeexpbis(node);
    }

    @Override
    public void caseAFinalListeexpbis(AFinalListeexpbis node) {
        super.caseAFinalListeexpbis(node);
    }

    @Override
    public void caseALinstrecListeinst(ALinstrecListeinst node) {
        SaInst tete = null;
        SaLInst queue = null;
        if(node.getInstr() != null)
        {
            node.getInstr().apply(this);
            tete = (SaInst)this.returnValue;
        }
        if(node.getListeinst() != null)
        {
            node.getListeinst().apply(this);
            queue = (SaLInst)this.returnValue;
        }
        this.returnValue = new SaLInst(tete,queue);
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
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
            op1 = (SaExp)this.returnValue;
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
            op2 = (SaExp)this.returnValue;
        }
        this.returnValue = new SaExpOr(op1,op2);
    }

    @Override
    public void caseAEtExp1(AEtExp1 node) {
        SaExp op1 = null;
        SaExp op2 = null;
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
            op1 = (SaExp)this.returnValue;
        }
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
            op2 = (SaExp)this.returnValue;
        }
        this.returnValue = new SaExpAdd(op1,op2);
    }

    @Override
    public void caseAInfExp2(AInfExp2 node) {
        SaExp op1 = null;
        SaExp op2 = null;
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
            op1 = (SaExp)this.returnValue;
        }
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
            op2 = (SaExp)this.returnValue;
        }
        this.returnValue = new SaExpInf(op1,op2);
    }

    @Override
    public void caseAEgalExp2(AEgalExp2 node) {
        SaExp op1 = null;
        SaExp op2 = null;
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
            op1 = (SaExp)this.returnValue;
        }

        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
            op2 = (SaExp)this.returnValue;
        }
        this.returnValue = new SaExpEqual(op1,op2);
    }

    @Override
    public void caseAPlusExp3(APlusExp3 node) {
        SaExp op1 = null;
        SaExp op2 = null;
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
            op1 = (SaExp)this.returnValue;
        }
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
            op2 = (SaExp)this.returnValue;
        }
        this.returnValue = new SaExpAdd(op1,op2);
    }

    @Override
    public void caseAMoinsExp3(AMoinsExp3 node) {
        SaExp op1 = null;
        SaExp op2 = null;
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
            op1 = (SaExp)this.returnValue;
        }
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
            op2 = (SaExp)this.returnValue;
        }
        this.returnValue = new SaExpSub(op1,op2);
    }

    @Override
    public void caseAFoisExp4(AFoisExp4 node) {
        SaExp op1 = null;
        SaExp op2 = null;
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
            op1 = (SaExp)this.returnValue;
        }

        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
            op2 = (SaExp)this.returnValue;
        }
        this.returnValue = new SaExpMult(op1,op2);
    }

    @Override
    public void caseADiviseExp4(ADiviseExp4 node) {
        SaExp op1 = null;
        SaExp op2 = null;
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
            op1 = (SaExp)this.returnValue;
        }

        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
            op2 = (SaExp)this.returnValue;
        }
        this.returnValue = new SaExpDiv(op1,op2);
    }

    @Override
    public void caseANonExp5(ANonExp5 node) {
        SaExp op1 = null;
        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
            op1 = (SaExp)this.returnValue;
        }
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
        if(node.getNombre() != null)
        {
            a = node.getNombre().getLine();
        }
        returnValue = new SaExpInt(a);
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
    public void caseADecvarentierDecvar(ADecvarentierDecvar node) {
        String wololo = null;
        if(node.getIdentif() != null)
        {
            wololo = node.getIdentif().getText();
        }
        returnValue = new SaVarSimple(wololo);
    }

    @Override
    public void caseADecvartableauDecvar(ADecvartableauDecvar node) {
        String wololo = null;
        SaExp indice = null;
        if(node.getIdentif() != null)
        {
           wololo =  node.getIdentif().getText();
        }
        if(node.getNombre() != null)
        {
            node.getNombre().apply(this);
            indice = (SaExp)returnValue;
        }
        returnValue = new SaVarIndicee(wololo,indice);
    }
}
