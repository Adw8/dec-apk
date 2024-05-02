package defpackage;

import java.util.Map;

/* renamed from: nf2  reason: default package */
/* loaded from: classes.dex */
public abstract class nf2 {

    /* renamed from: R  reason: collision with other field name */
    public static final oHg f6498R;

    /* renamed from: R  reason: collision with other field name */
    public static final oST f6499R = l6.n(Float.valueOf(1.0f));
    public static final ipq R = o02.y(400.0f, null, 5);
    public static final ipq v = o02.y(400.0f, new dU5(cU5.v(1, 1)), 1);
    public static final ipq c = o02.y(400.0f, new ltH(iTI.R(1, 1)), 1);

    static {
        a0 a0Var = a0.c;
        a0 a0Var2 = a0.e;
        oHg ohg = kYZ.R;
        f6498R = new oHg(a0Var, a0Var2);
        int i = dU5.R;
        Map map = lVA.R;
    }

    public static kIU R(o3h o3h, vV vVVar, int i) {
        boolean z = true;
        nKE nke = o3h;
        if ((i & 1) != 0) {
            Map map = lVA.R;
            nke = o02.y(400.0f, new ltH(iTI.R(1, 1)), 1);
        }
        if ((i & 2) != 0) {
            vVVar = dq.f2886c;
        }
        if ((i & 4) == 0) {
            z = false;
        }
        return new kIU(new cE3(null, new jo(nke, n3x.v(vVVar, dq.f2881R) ? dq.e : n3x.v(vVVar, dq.f2886c) ? dq.O : dq.X, new kmL(0, (i & 8) != 0 ? a0.X : null), z), 11));
    }

    public static h4f c(o3h o3h, int i) {
        nKE nke = o3h;
        if ((i & 1) != 0) {
            nke = o02.y(400.0f, null, 5);
        }
        return new h4f(new cE3(new a80(0.0f, nke), null, 14));
    }

    public static h4f e(o3h o3h, vV vVVar, int i) {
        boolean z = true;
        nKE nke = o3h;
        if ((i & 1) != 0) {
            Map map = lVA.R;
            nke = o02.y(400.0f, new ltH(iTI.R(1, 1)), 1);
        }
        if ((i & 2) != 0) {
            vVVar = dq.f2886c;
        }
        if ((i & 4) == 0) {
            z = false;
        }
        return new h4f(new cE3(null, new jo(nke, n3x.v(vVVar, dq.f2881R) ? dq.e : n3x.v(vVVar, dq.f2886c) ? dq.O : dq.X, new kmL(2, (i & 8) != 0 ? a0.L : null), z), 11));
    }

    public static kIU v(o3h o3h, int i) {
        nKE nke = o3h;
        if ((i & 1) != 0) {
            nke = o02.y(400.0f, null, 5);
        }
        return new kIU(new cE3(new a80(0.0f, nke), null, 14));
    }
}
