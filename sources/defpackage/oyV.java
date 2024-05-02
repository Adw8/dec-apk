package defpackage;

import java.util.ArrayList;

/* renamed from: oyV  reason: default package */
/* loaded from: classes.dex */
public final class oyV {
    public static final nhj R;

    /* renamed from: R  reason: collision with other field name */
    public static final oyV f7045R = new oyV();

    static {
        float f = jyF.R;
        float f2 = (float) 0;
        R = new nhj(f, f2, f, f2);
    }

    public final void R(boolean z, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1803742020);
        if ((i & 14) == 0) {
            i2 = (jr_.L(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !jr_.J()) {
            nUO nuo = l1r.R;
            if (nuo == null) {
                f0G f0g = new f0G("Filled.ArrowDropDown");
                int i3 = jnb.R;
                oSW osw = new oSW(n3.v);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new jls(7.0f, 10.0f));
                arrayList.add(new o5j(5.0f, 5.0f));
                arrayList.add(new o5j(5.0f, -5.0f));
                arrayList.add(gqW.R);
                f0G.c(f0g, arrayList, osw);
                nuo = f0g.e();
                l1r.R = nuo;
            }
            f7Z.R(nuo, null, dTl.T(z ? 180.0f : 0.0f), 0, jr_, 48, 8);
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new nWm(this, z, i, 1);
        }
    }
}
