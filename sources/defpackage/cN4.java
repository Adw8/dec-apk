package defpackage;

/* renamed from: cN4  reason: default package */
/* loaded from: classes.dex */
public final class cN4 extends mjG implements cIc {
    public final kg9 R;

    public cN4(kg9 kg9) {
        this.R = kg9;
    }

    @Override // defpackage.cIc
    public final void F(hjM hjm) {
        this.R.x(hjm);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cN4)) {
            return false;
        }
        return n3x.v(this.R, ((cN4) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }
}
