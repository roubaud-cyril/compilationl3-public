import c3a.*;
import sa.*;

import ts.*;


public class Sa2c3a extends SaDepthFirstVisitor<C3aOperand> {

    private C3a c3a;
    private Ts table;
    private Ts tableCourante;

    public Sa2c3a(SaNode root, Ts table){
        this.c3a = new C3a();
        this.table = table;
        root.accept(this);
    }

    public C3a getC3a() {
        return c3a;
    }

    private TsItemVar getVar(String scope){
        if(this.tableCourante.getVar(scope) != null) return this.tableCourante.getVar(scope);
        else return this.table.getVar(scope);
    }

    @Override
    public C3aOperand visit(SaProg node) {
        node.getFonctions().accept(this);
        return null;//null?
    }

    @Override
    public C3aOperand visit(SaExpInt node) {
        int value = node.getVal();
        return new C3aConstant(value);
    }

    @Override
    public C3aOperand visit(SaExpVar node) {
        return node.getVar().accept(this);
    }

    @Override
    public C3aOperand visit(SaInstEcriture node) {
        SaExp argument = node.getArg();
        C3aInst write = new C3aInstWrite(argument.accept(this),"");
        c3a.ajouteInst(write);
        return null;
    }

    @Override
    public C3aOperand visit(SaInstTantQue node) {
        C3aLabel JumpTest = c3a.newAutoLabel();
        C3aLabel JumpNext = c3a.newAutoLabel();

        c3a.addLabelToNextInst(JumpTest);
        C3aOperand codeTest = node.getTest().accept(this);
        C3aInst JumpEqual = new C3aInstJumpIfEqual(codeTest,c3a.False,JumpNext,"");
        c3a.ajouteInst(JumpEqual);
        node.getFaire().accept(this);

        c3a.ajouteInst(new C3aInstJump(JumpTest,""));
        c3a.addLabelToNextInst(JumpNext);
        return null;
    }



    @Override
    public C3aOperand visit(SaDecFonc node){
        TsItemFct function = table.getFct(node.getNom());
        C3aInst begin = new C3aInstFBegin(function,"entree fonction");
        c3a.ajouteInst(begin);

        this.tableCourante = this.table.getTableLocale(node.getNom());
        if(node.getCorps() != null) node.getCorps().accept(this);

        C3aInst end = new C3aInstFEnd("");
        c3a.ajouteInst(end);
        return null;
    }

    @Override
    public C3aOperand visit(SaInstAffect node) {
        SaVar lhs = node.getLhs();
        SaExp rhs = node.getRhs();

        C3aInst instAffect = new C3aInstAffect(rhs.accept(this), lhs.accept(this), "");
        c3a.ajouteInst(instAffect);
        return null;
    }

    @Override
    public C3aOperand visit(SaVarSimple node) { return new C3aVar(getVar(node.getNom()),null); }

    @Override
    public C3aOperand visit(SaAppel node) {//fregrthsfgsv
        if(node.getArguments() != null){
            node.getArguments().accept(this);
        }
        C3aFunction function = new C3aFunction(table.getFct(node.getNom()));
        C3aOperand result = c3a.newTemp();
        C3aInstCall call = new C3aInstCall(function, result, "");
        c3a.ajouteInst(call);
        return result;
    }

    @Override
    public C3aOperand visit(SaExpAppel node) {
        return node.getVal().accept(this);
    }

    @Override
    public C3aOperand visit(SaExpAdd node) {
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aTemp result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstAdd(op1,op2,result,""));
        return result;
    }

    @Override
    public C3aOperand visit(SaExpSub node) {
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aTemp result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstSub(op1,op2,result,""));
        return result;
    }

    @Override
    public C3aOperand visit(SaExpMult node) {
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aTemp result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstMult(op1,op2,result,""));
        return result;
    }

    @Override
    public C3aOperand visit(SaExpDiv node) {
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        C3aTemp result = c3a.newTemp();
        c3a.ajouteInst(new C3aInstDiv(op1,op2,result,""));
        return result;
    }

    @Override
    public C3aOperand visit(SaExpInf node) {
        C3aTemp temp = c3a.newTemp();
        C3aLabel l0 = c3a.newAutoLabel();
        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);
        c3a.ajouteInst(new C3aInstAffect(c3a.True,temp,""));
        c3a.ajouteInst(new C3aInstJumpIfLess(op1,op2,l0,""));
        c3a.ajouteInst(new C3aInstAffect(c3a.False,temp,"") );
        c3a.addLabelToNextInst(l0);
        return temp;
    }

    @Override
    public C3aOperand visit(SaExpEqual node) {
        C3aTemp temp = c3a.newTemp();
        C3aLabel l0 = c3a.newAutoLabel();

        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);

        c3a.ajouteInst(new C3aInstAffect(c3a.True,temp,""));
        c3a.ajouteInst(new C3aInstJumpIfEqual(op1,op2,l0,""));
        c3a.ajouteInst(new C3aInstAffect(c3a.False,temp,"") );
        c3a.addLabelToNextInst(l0);
        return temp;
    }

    @Override
    public C3aOperand visit(SaExpAnd node) {
        C3aTemp temp = c3a.newTemp();

        C3aLabel l0 = c3a.newAutoLabel();
        C3aLabel l1 = c3a.newAutoLabel();

        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);

        c3a.ajouteInst(new C3aInstJumpIfEqual(op1,c3a.False,l1,""));
        c3a.ajouteInst(new C3aInstJumpIfEqual(op2,c3a.False,l1,""));
        c3a.ajouteInst(new C3aInstAffect(c3a.True,temp,""));
        c3a.ajouteInst(new C3aInstJump(l0,""));
        c3a.addLabelToNextInst(l1);
        c3a.ajouteInst(new C3aInstAffect(c3a.False,temp,""));
        c3a.addLabelToNextInst(l0);
        return temp;
    }

    @Override
    public C3aOperand visit(SaExpOr node) {
        C3aTemp t0 = c3a.newTemp();
        C3aLabel FailJump = c3a.newAutoLabel();
        C3aLabel SuccessJump = c3a.newAutoLabel();

        C3aOperand op1 = node.getOp1().accept(this);
        C3aOperand op2 = node.getOp2().accept(this);

        C3aInst testOp1 = new C3aInstJumpIfNotEqual(op1,c3a.False,SuccessJump,"");
        C3aInst testOp2 = new C3aInstJumpIfNotEqual(op2,c3a.False,SuccessJump,"");

        c3a.ajouteInst(testOp1);//si different de faux alors jump
        c3a.ajouteInst(testOp2);

        c3a.ajouteInst(new C3aInstAffect(c3a.False,t0,""));
        c3a.ajouteInst(new C3aInstJump(FailJump,""));
        c3a.addLabelToNextInst(SuccessJump);
        c3a.ajouteInst(new C3aInstAffect(c3a.True,t0,""));
        c3a.addLabelToNextInst(FailJump);
        return t0;
    }

    @Override
    public C3aOperand visit(SaExpNot node) {
        C3aTemp t0 = c3a.newTemp();
        C3aLabel l0 = c3a.newAutoLabel();
        C3aOperand op1  = node.getOp1().accept(this);

        c3a.ajouteInst(new C3aInstAffect(c3a.True,t0,""));
        c3a.ajouteInst(new C3aInstJumpIfEqual(op1, c3a.False,l0,""));
        c3a.ajouteInst(new C3aInstAffect(c3a.False,t0,""));
        c3a.addLabelToNextInst(l0);
        return t0;
    }

    @Override
    public C3aOperand visit(SaExpLire node) {
        C3aOperand argument = node.accept(this);
        c3a.ajouteInst(new C3aInstRead(argument,""));
        return null;
    }

    @Override
    public C3aOperand visit(SaInstSi node) {
        C3aLabel sinon = c3a.newAutoLabel();
        C3aLabel fin = c3a.newAutoLabel();

        SaInst instSinon = node.getSinon();
        if (instSinon == null) {
            C3aInst JumpEqual = new C3aInstJumpIfEqual(node.getTest().accept(this), c3a.False, fin, "");
            c3a.ajouteInst(JumpEqual);
            node.getAlors().accept(this);
        } else {
            C3aInst JumpEqual = new C3aInstJumpIfEqual(node.getTest().accept(this), c3a.False, sinon, "");
            c3a.ajouteInst(JumpEqual);
            node.getAlors().accept(this);
            C3aInst JumpFin = new C3aInstJump(fin, "");
            c3a.ajouteInst(JumpFin);
            c3a.addLabelToNextInst(sinon);
            instSinon.accept(this);
        }

        c3a.addLabelToNextInst(fin);
        return null;
    }

    @Override
    public C3aOperand visit(SaInstRetour node) {
        C3aOperand ReturnValue = node.getVal().accept(this);
        c3a.ajouteInst(new C3aInstReturn(ReturnValue,""));
        return null;
    }

    @Override
    public C3aOperand visit(SaLExp node) {
        C3aOperand argument = node.getTete().accept(this);
        c3a.ajouteInst(new C3aInstParam(argument,""));
        if(node.getQueue() != null)
            node.getQueue().accept(this);
        return null;
    }

    @Override
    public C3aOperand visit(SaVarIndicee node) {
        TsItemVar var = this.getVar(node.getNom());
        return new C3aVar(var,node.getIndice().accept(this));
    }
}