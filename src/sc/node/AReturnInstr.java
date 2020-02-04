/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AReturnInstr extends PInstr
{
    private PReturn _return_;

    public AReturnInstr()
    {
        // Constructor
    }

    public AReturnInstr(
        @SuppressWarnings("hiding") PReturn _return_)
    {
        // Constructor
        setReturn(_return_);

    }

    @Override
    public Object clone()
    {
        return new AReturnInstr(
            cloneNode(this._return_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReturnInstr(this);
    }

    public PReturn getReturn()
    {
        return this._return_;
    }

    public void setReturn(PReturn node)
    {
        if(this._return_ != null)
        {
            this._return_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._return_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._return_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._return_ == child)
        {
            this._return_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._return_ == oldChild)
        {
            setReturn((PReturn) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
