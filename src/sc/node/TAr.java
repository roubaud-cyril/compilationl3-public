/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class TAr extends Token
{
    public TAr()
    {
        super.setText("}");
    }

    public TAr(int line, int pos)
    {
        super.setText("}");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAr(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAr(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAr text.");
    }
}
