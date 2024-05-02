package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: f0G */
/* loaded from: classes.dex */
public final class f0G {
    public final float R;

    /* renamed from: R */
    public final int f3270R;

    /* renamed from: R */
    public final long f3271R;

    /* renamed from: R */
    public ddM f3272R;

    /* renamed from: R */
    public final String f3273R;

    /* renamed from: R */
    public final ArrayList f3274R;

    /* renamed from: R */
    public final boolean f3275R;
    public final float c;
    public final float e;
    public final float v;

    /* renamed from: v */
    public boolean f3276v;

    public f0G(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
        this.f3273R = str;
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
        this.f3271R = j;
        this.f3270R = i;
        this.f3275R = z;
        ArrayList arrayList = new ArrayList();
        this.f3274R = arrayList;
        ddM ddm = new ddM(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f3272R = ddm;
        arrayList.add(ddm);
    }

    public final void O() {
        if (!(!this.f3276v)) {
            throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
        }
    }

    public final void R(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
        O();
        this.f3274R.add(new ddM(str, f, f2, f3, f4, f5, f6, f7, list, 512));
    }

    public final void X() {
        O();
        ArrayList arrayList = this.f3274R;
        ddM ddm = (ddM) arrayList.remove(arrayList.size() - 1);
        ArrayList arrayList2 = this.f3274R;
        ((ddM) arrayList2.get(arrayList2.size() - 1)).f2691v.add(new i5Q(ddm.f2689R, ddm.R, ddm.v, ddm.c, ddm.e, ddm.X, ddm.O, ddm.L, ddm.f2690R, ddm.f2691v));
    }

    public final nUO e() {
        O();
        while (this.f3274R.size() > 1) {
            X();
        }
        String str = this.f3273R;
        float f = this.R;
        float f2 = this.v;
        float f3 = this.c;
        float f4 = this.e;
        ddM ddm = this.f3272R;
        nUO nuo = new nUO(str, f, f2, f3, f4, new i5Q(ddm.f2689R, ddm.R, ddm.v, ddm.c, ddm.e, ddm.X, ddm.O, ddm.L, ddm.f2690R, ddm.f2691v), this.f3271R, this.f3270R, this.f3275R);
        this.f3276v = true;
        return nuo;
    }

    public final void v(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, a1 a1Var, a1 a1Var2, String str, List list) {
        O();
        ArrayList arrayList = this.f3274R;
        ((ddM) arrayList.get(arrayList.size() - 1)).f2691v.add(new ep9(str, list, i, a1Var, f, a1Var2, f2, f3, i2, i3, f4, f5, f6, f7));
    }

    public f0G(String str) {
        this(str, 24.0f, 24.0f, 24.0f, 24.0f, n3.O, 5, false);
    }
}
