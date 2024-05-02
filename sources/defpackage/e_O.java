package defpackage;

import sun.misc.Unsafe;

/* renamed from: e_O  reason: default package */
/* loaded from: classes.dex */
public final class e_O extends fPg {
    public final /* synthetic */ int R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e_O(Unsafe unsafe, int i) {
        super(unsafe);
        this.R = i;
    }

    @Override // defpackage.fPg
    public final void C(Object obj, long j, double d) {
        switch (this.R) {
            case 0:
                j(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                j(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fPg
    public final void H(Object obj, long j, boolean z) {
        switch (this.R) {
            case 0:
                if (hU3.c) {
                    hU3.t(obj, j, z ? (byte) 1 : 0);
                    return;
                } else {
                    hU3.i(obj, j, z ? (byte) 1 : 0);
                    return;
                }
            default:
                if (hU3.c) {
                    hU3.t(obj, j, z ? (byte) 1 : 0);
                    return;
                } else {
                    hU3.i(obj, j, z ? (byte) 1 : 0);
                    return;
                }
        }
    }

    @Override // defpackage.fPg
    public final void N(Object obj, long j, float f) {
        switch (this.R) {
            case 0:
                P(Float.floatToIntBits(f), j, obj);
                return;
            default:
                P(Float.floatToIntBits(f), j, obj);
                return;
        }
    }

    @Override // defpackage.fPg
    public final float O(long j, Object obj) {
        switch (this.R) {
            case 0:
                return Float.intBitsToFloat(L(j, obj));
            default:
                return Float.intBitsToFloat(L(j, obj));
        }
    }

    @Override // defpackage.fPg
    public final void U(Object obj, long j, byte b) {
        switch (this.R) {
            case 0:
                if (hU3.c) {
                    hU3.t(obj, j, b);
                    return;
                } else {
                    hU3.i(obj, j, b);
                    return;
                }
            default:
                if (hU3.c) {
                    hU3.t(obj, j, b);
                    return;
                } else {
                    hU3.i(obj, j, b);
                    return;
                }
        }
    }

    @Override // defpackage.fPg
    public final double X(long j, Object obj) {
        switch (this.R) {
            case 0:
                return Double.longBitsToDouble(Z(j, obj));
            default:
                return Double.longBitsToDouble(Z(j, obj));
        }
    }

    @Override // defpackage.fPg
    public final boolean c(long j, Object obj) {
        switch (this.R) {
            case 0:
                if (hU3.c) {
                    if (hU3.m(j, obj) != 0) {
                        return true;
                    }
                } else if (hU3.x(j, obj) != 0) {
                    return true;
                }
                return false;
            default:
                if (hU3.c) {
                    if (hU3.m(j, obj) != 0) {
                        return true;
                    }
                } else if (hU3.x(j, obj) != 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.fPg
    public final byte e(long j, Object obj) {
        switch (this.R) {
            case 0:
                return hU3.c ? hU3.m(j, obj) : hU3.x(j, obj);
            default:
                return hU3.c ? hU3.m(j, obj) : hU3.x(j, obj);
        }
    }

    @Override // defpackage.fPg
    public final boolean t() {
        return false;
    }
}
