package defpackage;

/* renamed from: kIU  reason: default package */
/* loaded from: classes.dex */
public final class kIU {
    public final cE3 R;

    public kIU(cE3 ce3) {
        this.R = ce3;
    }

    /* renamed from: R */
    public final boolean equals(Object obj) {
        return (obj instanceof kIU) && n3x.v(((kIU) obj).R, this.R);
    }

    public final kIU c(kIU kiu) {
        a80 a80 = this.R.R;
        if (a80 == null) {
            a80 = kiu.R.R;
        }
        kiu.R.getClass();
        jo joVar = this.R.f2019R;
        if (joVar == null) {
            joVar = kiu.R.f2019R;
        }
        kiu.R.getClass();
        return new kIU(new cE3(a80, joVar));
    }

    /* renamed from: v */
    public final int hashCode() {
        return this.R.hashCode();
    }
}
