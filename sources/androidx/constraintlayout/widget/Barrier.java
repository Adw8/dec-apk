package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Barrier extends nYC {
    public int O;
    public int X;
    public xP v;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // defpackage.nYC
    public final void X(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gvP.v);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    ((nYC) this).f6427R = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    super.v = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.v = new xP();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, gvP.v);
            int indexCount2 = obtainStyledAttributes2.getIndexCount();
            for (int i2 = 0; i2 < indexCount2; i2++) {
                int index2 = obtainStyledAttributes2.getIndex(i2);
                if (index2 == 26) {
                    setType(obtainStyledAttributes2.getInt(index2, 0));
                } else if (index2 == 25) {
                    this.v.Z = obtainStyledAttributes2.getBoolean(index2, true);
                } else if (index2 == 27) {
                    this.v.n = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                }
            }
            obtainStyledAttributes2.recycle();
        }
        ((nYC) this).f6429R = this.v;
        O();
    }

    public boolean getAllowsGoneWidget() {
        return this.v.Z;
    }

    public int getMargin() {
        return this.v.n;
    }

    public int getType() {
        return this.X;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.v.Z = z;
    }

    public void setDpMargin(int i) {
        this.v.n = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.v.n = i;
    }

    public void setType(int i) {
        this.X = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
