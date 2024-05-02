package defpackage;

/* renamed from: kMB  reason: default package */
/* loaded from: classes.dex */
public final class kMB {
    public static final /* synthetic */ int v = 0;
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final ooI f5275R;

    static {
        new kMB(0, null);
    }

    public kMB(int i, byj byj) {
        String str;
        this.R = i;
        this.f5275R = byj;
        if (!((i == 0) != (byj == null) ? false : true)) {
            if (i == 0) {
                str = "Star projection must have no type specified.";
            } else {
                StringBuilder U = opT.U("The projection variance ");
                U.append(opT.g(i));
                U.append(" requires type to be specified.");
                str = U.toString();
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kMB)) {
            return false;
        }
        kMB kmb = (kMB) obj;
        return this.R == kmb.R && n3x.v(this.f5275R, kmb.f5275R);
    }

    public final int hashCode() {
        int i = this.R;
        int i2 = 0;
        int I = (i == 0 ? 0 : jQ.I(i)) * 31;
        ooI ooi = this.f5275R;
        if (ooi != null) {
            i2 = ooi.hashCode();
        }
        return I + i2;
    }

    public final String toString() {
        int i = this.R;
        int i2 = i == 0 ? -1 : iqv.R[jQ.I(i)];
        if (i2 == -1) {
            return "*";
        }
        if (i2 == 1) {
            return String.valueOf(this.f5275R);
        }
        if (i2 == 2) {
            StringBuilder U = opT.U("in ");
            U.append(this.f5275R);
            return U.toString();
        } else if (i2 == 3) {
            StringBuilder U2 = opT.U("out ");
            U2.append(this.f5275R);
            return U2.toString();
        } else {
            throw new j8f((Object) null);
        }
    }
}
