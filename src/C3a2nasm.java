import c3a.*;
import nasm.Nasm;
import nasm.NasmAdd;
import nasm.NasmMov;
import nasm.NasmOperand;
import ts.Ts;
import ts.TsItemFct;

public class C3a2nasm implements C3aVisitor<NasmOperand> {
    private C3a c3a;
    private Nasm nasm;
    private Ts tableGlobale;
    private TsItemFct currentFct;

    @Override
    public NasmOperand visit(C3aInstAdd inst) {
        NasmOperand label = (inst.label != null) ?
                inst.label.accept(this) :
                null;
        NasmOperand oper1 = inst.op1.accept(this);
        NasmOperand oper2 = inst.op2.accept(this);
        NasmOperand dest = inst.result.accept(this);
        nasm.ajouteInst(new NasmMov(label, dest, oper1, ""));
        nasm.ajouteInst(new NasmAdd(null, dest, oper2, ""));
        return null;
    }

    @Override
    public NasmOperand visit(C3aInstCall inst) {
        NasmOperand label = (inst.label != null) ?
                inst.label.accept(this) :
                null;
        NasmOperand resultat = inst.result.accept(this);
        NasmOperand op1 = inst.op1.accept(this);

        return null;
    }

    @Override
    public NasmOperand visit(C3aInstFBegin inst) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aInst inst) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aInstJumpIfLess inst) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aInstMult inst) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aInstRead inst) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aInstSub inst) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aInstAffect inst) {
        NasmOperand label = (inst.label != null) ?
                inst.label.accept(this) :
                null;

        NasmOperand op1 = inst.op1.accept(this);
        NasmOperand result = inst.result.accept(this);

        nasm.ajouteInst(new NasmMov(label,result,op1,"Affect"));

        return null;
    }

    @Override
    public NasmOperand visit(C3aInstDiv inst) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aInstFEnd inst) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aInstJumpIfEqual inst) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aInstJumpIfNotEqual inst) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aInstJump inst) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aInstParam inst) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aInstReturn inst) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aInstWrite inst) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aConstant oper) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aLabel oper) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aTemp oper) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aVar oper) {
        return null;
    }

    @Override
    public NasmOperand visit(C3aFunction oper) {
        return null;
    }
}
