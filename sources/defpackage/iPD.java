package defpackage;

/* renamed from: iPD  reason: default package */
/* loaded from: classes.dex */
public final class iPD implements jXh {
    public final int R;

    public iPD(int i) {
        this.R = i;
    }

    @Override // defpackage.jXh
    /* renamed from: O */
    public final giw c(oHg ohg) {
        return new kfk(this.R);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof iPD) && ((iPD) obj).R == this.R;
    }

    public final int hashCode() {
        return this.R;
    }
}
