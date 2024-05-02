package defpackage;

/* renamed from: buZ  reason: default package */
/* loaded from: classes.dex */
public final class buZ implements jM {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long f1849R;

    /* renamed from: R  reason: collision with other field name */
    public final jXh f1850R;

    public buZ(jXh jxh, int i, long j) {
        this.f1850R = jxh;
        this.R = i;
        this.f1849R = j;
    }

    @Override // defpackage.jM
    public final iHW c(oHg ohg) {
        return new bAR(this.f1850R.O(ohg), this.R, this.f1849R);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof buZ) {
            buZ buz = (buZ) obj;
            if (n3x.v(buz.f1850R, this.f1850R) && buz.R == this.R) {
                if (buz.f1849R == this.f1849R) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int I = jQ.I(this.R);
        return Long.hashCode(this.f1849R) + ((I + (this.f1850R.hashCode() * 31)) * 31);
    }
}
