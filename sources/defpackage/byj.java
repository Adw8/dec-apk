package defpackage;

import java.util.List;

/* renamed from: byj  reason: default package */
/* loaded from: classes.dex */
public final class byj implements ooI {
    public final int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public final List f1881R;

    /* renamed from: R  reason: collision with other field name */
    public final kQO f1882R;

    public byj(x_ x_Var, List list) {
        this.f1882R = x_Var;
        this.f1881R = list;
    }

    public final String R(boolean z) {
        kQO kqo = this.f1882R;
        Class cls = null;
        fUt fut = kqo instanceof fUt ? (fUt) kqo : null;
        if (fut != null) {
            cls = ((f2) fut).R();
        }
        String obj = cls == null ? this.f1882R.toString() : (this.R & 4) != 0 ? "kotlin.Nothing" : cls.isArray() ? n3x.v(cls, boolean[].class) ? "kotlin.BooleanArray" : n3x.v(cls, char[].class) ? "kotlin.CharArray" : n3x.v(cls, byte[].class) ? "kotlin.ByteArray" : n3x.v(cls, short[].class) ? "kotlin.ShortArray" : n3x.v(cls, int[].class) ? "kotlin.IntArray" : n3x.v(cls, float[].class) ? "kotlin.FloatArray" : n3x.v(cls, long[].class) ? "kotlin.LongArray" : n3x.v(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (!z || !cls.isPrimitive()) ? cls.getName() : pdD.t((fUt) this.f1882R).getName();
        String str = "";
        String X4 = this.f1881R.isEmpty() ? str : dF.X4(this.f1881R, ", ", "<", ">", new mox(21, this), 24);
        boolean z2 = true;
        if ((this.R & 1) == 0) {
            z2 = false;
        }
        if (z2) {
            str = "?";
        }
        return jQ.C(obj, X4, str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof byj) {
            byj byj = (byj) obj;
            if (n3x.v(this.f1882R, byj.f1882R) && n3x.v(this.f1881R, byj.f1881R) && n3x.v(null, null) && this.R == byj.R) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f1881R.hashCode();
        return Integer.valueOf(this.R).hashCode() + ((hashCode + (this.f1882R.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return R(false) + " (Kotlin reflection is not available)";
    }
}
