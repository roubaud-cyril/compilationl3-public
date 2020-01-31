/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class ABlocfonc extends PBlocfonc
{
    private TAl _al_;
    private PBloc2 _bloc2_;
    private PReturn _return_;
    private TAr _ar_;

    public ABlocfonc()
    {
        // Constructor
    }

    public ABlocfonc(
        @SuppressWarnings("hiding") TAl _al_,
        @SuppressWarnings("hiding") PBloc2 _bloc2_,
        @SuppressWarnings("hiding") PReturn _return_,
        @SuppressWarnings("hiding") TAr _ar_)
    {
        // Constructor
        setAl(_al_);

        setBloc2(_bloc2_);

        setReturn(_return_);

        setAr(_ar_);

    }

    @Override
    public Object clone()
    {
        return new ABlocfonc(
            cloneNode(this._al_),
            cloneNode(this._bloc2_),
            cloneNode(this._return_),
            cloneNode(this._ar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocfonc(this);
    }

    public TAl getAl()
    {
        return this._al_;
    }

    public void setAl(TAl node)
    {
        if(this._al_ != null)
        {
            this._al_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._al_ = node;
    }

    public PBloc2 getBloc2()
    {
        return this._bloc2_;
    }

    public void setBloc2(PBloc2 node)
    {
        if(this._bloc2_ != null)
        {
            this._bloc2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bloc2_ = node;
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

    public TAr getAr()
    {
        return this._ar_;
    }

    public void setAr(TAr node)
    {
        if(this._ar_ != null)
        {
            this._ar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._al_)
            + toString(this._bloc2_)
            + toString(this._return_)
            + toString(this._ar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._al_ == child)
        {
            this._al_ = null;
            return;
        }

        if(this._bloc2_ == child)
        {
            this._bloc2_ = null;
            return;
        }

        if(this._return_ == child)
        {
            this._return_ = null;
            return;
        }

        if(this._ar_ == child)
        {
            this._ar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._al_ == oldChild)
        {
            setAl((TAl) newChild);
            return;
        }

        if(this._bloc2_ == oldChild)
        {
            setBloc2((PBloc2) newChild);
            return;
        }

        if(this._return_ == oldChild)
        {
            setReturn((PReturn) newChild);
            return;
        }

        if(this._ar_ == oldChild)
        {
            setAr((TAr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
