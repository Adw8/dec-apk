package defpackage;

/* renamed from: aX  reason: default package */
/* loaded from: classes.dex */
public final class aX implements bRW {
    public final int R;

    public aX(int i) {
        this.R = i;
    }

    @Override // defpackage.bRW
    public final lIe R(lIe lie) {
        int i = this.R;
        return (i == 0 || i == Integer.MAX_VALUE) ? lie : new lIe(caw.x(lie.f5651e + i, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aX) && this.R == ((aX) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        return jQ.P(opT.U("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.R, ')');
    }
}
