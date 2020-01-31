/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AWololo extends PWololo
{
    private PBloc _bloc_;

    public AWololo()
    {
        // Constructor
    }

    public AWololo(
        @SuppressWarnings("hiding") PBloc _bloc_)
    {
        // Constructor
        setBloc(_bloc_);

    }

    @Override
    public Object clone()
    {
        return new AWololo(
            cloneNode(this._bloc_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWololo(this);
    }

    public PBloc getBloc()
    {
        return this._bloc_;
    }

    public void setBloc(PBloc node)
    {
        if(this._bloc_ != null)
        {
            this._bloc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bloc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._bloc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._bloc_ == child)
        {
            this._bloc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._bloc_ == oldChild)
        {
            setBloc((PBloc) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
