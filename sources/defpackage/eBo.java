package defpackage;

import java.io.InputStream;

/* renamed from: eBo  reason: default package */
/* loaded from: classes.dex */
public final class eBo extends zr {
    public final boolean R;

    public eBo(int i, int i2, boolean z, mAv mav) {
        super(i, i2, mav);
        this.R = z;
    }

    @Override // defpackage.zr, defpackage.fXm
    public final O P() {
        mAv mav = super.R;
        int i = this.e;
        int i2 = this.X;
        if (this.R) {
            return Vz.n(i, i2, mav.Z());
        }
        oU oUVar = new oU(4, i, i2, new nP9(((gWT) ((InputStream) mav.f5962R)).c()), 2);
        return i != 64 ? oUVar : new k61(oUVar);
    }
}
