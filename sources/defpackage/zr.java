package defpackage;

import java.io.IOException;

/* renamed from: zr  reason: default package */
/* loaded from: classes.dex */
public class zr implements b, fXm {
    public final mAv R;
    public final int X;
    public final int e;

    public zr(int i, int i2, mAv mav) {
        this.e = i;
        this.X = i2;
        this.R = mav;
    }

    @Override // defpackage.fXm
    public O P() {
        return this.R.O(this.e, this.X);
    }

    @Override // defpackage.b
    public final O v() {
        try {
            return P();
        } catch (IOException e) {
            throw new _(e.getMessage());
        }
    }
}
