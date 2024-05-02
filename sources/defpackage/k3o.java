package defpackage;

/* renamed from: k3o  reason: default package */
/* loaded from: classes.dex */
public final class k3o {
    public static boolean R(Object obj, clz clz) {
        int X = clz.X();
        int i = X >>> 3;
        int i2 = X & 7;
        if (i2 == 0) {
            ((f2c) obj).c((i << 3) | 0, Long.valueOf(clz.z()));
        } else if (i2 == 1) {
            ((f2c) obj).c((i << 3) | 1, Long.valueOf(clz.c()));
        } else if (i2 == 2) {
            ((f2c) obj).c((i << 3) | 2, clz.C());
        } else if (i2 == 3) {
            f2c v = f2c.v();
            int i3 = i << 3;
            int i4 = i3 | 4;
            while (clz.N() != Integer.MAX_VALUE && R(v, clz)) {
            }
            if (i4 == clz.X()) {
                v.f3282R = false;
                ((f2c) obj).c(i3 | 3, v);
            } else {
                throw new b7b("Protocol message end-group tag did not match expected tag.");
            }
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                ((f2c) obj).c((i << 3) | 5, Integer.valueOf(clz.K()));
            } else {
                int i5 = b7b.e;
                throw new p3X();
            }
        }
        return true;
    }

    public static void c(Object obj, Object obj2) {
        ((csA) obj).unknownFields = (f2c) obj2;
    }

    public static f2c v() {
        return f2c.v();
    }
}
