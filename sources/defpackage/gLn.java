package defpackage;

/* renamed from: gLn  reason: default package */
/* loaded from: classes.dex */
public final class gLn implements gHS {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final biT f3730R = new biT(new jt1[16]);

    /* renamed from: R  reason: collision with other field name */
    public jt1 f3731R;

    public final void R(int i) {
        boolean z = false;
        if (i >= 0 && i < this.R) {
            z = true;
        }
        if (!z) {
            StringBuilder C = opT.C("Index ", i, ", size ");
            C.append(this.R);
            throw new IndexOutOfBoundsException(C.toString());
        }
    }

    public final jt1 v(int i) {
        R(i);
        jt1 jt1 = this.f3731R;
        if (jt1 != null) {
            int i2 = jt1.R;
            boolean z = false;
            if (i < jt1.v + i2 && i2 <= i) {
                z = true;
            }
            if (z) {
                return jt1;
            }
        }
        biT bit = this.f3730R;
        jt1 jt12 = (jt1) bit.f1772R[msU.x(i, bit)];
        this.f3731R = jt12;
        return jt12;
    }
}
