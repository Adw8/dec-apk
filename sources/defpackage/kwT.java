package defpackage;

/* renamed from: kwT  reason: default package */
/* loaded from: classes.dex */
public abstract class kwT {
    public static final o3h R = new o3h(120, me6.R, 2);
    public static final o3h c;
    public static final o3h v;

    static {
        g_J g_j = new g_J(0.4f, 0.6f);
        v = new o3h(150, g_j, 2);
        c = new o3h(120, g_j, 2);
    }

    public static final Object R(_6 _6, float f, nto nto, nto nto2, aOO aoo) {
        o3h o3h;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        if (nto2 == null) {
            if (nto != null) {
                if (nto instanceof oDO) {
                    o3h = v;
                } else if (nto instanceof c03) {
                    o3h = v;
                } else if (nto instanceof a07) {
                    o3h = c;
                } else if (nto instanceof k4G) {
                    o3h = v;
                }
            }
            o3h = null;
        } else if (nto2 instanceof oDO) {
            o3h = R;
        } else if (nto2 instanceof c03) {
            o3h = R;
        } else if (nto2 instanceof a07) {
            o3h = R;
        } else {
            if (nto2 instanceof k4G) {
                o3h = R;
            }
            o3h = null;
        }
        if (o3h != null) {
            Object R2 = _6.R(_6, new hoI(f), o3h, aoo);
            return R2 == bgr ? R2 : o8s.R;
        }
        Object e = _6.e(new hoI(f), aoo);
        return e == bgr ? e : o8s.R;
    }
}
