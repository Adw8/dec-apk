package defpackage;

import java.util.Collections;

/* renamed from: nCG  reason: default package */
/* loaded from: classes.dex */
public final class nCG {
    public static volatile nCG R;
    public static final nCG v = new nCG();

    public nCG() {
        Collections.emptyMap();
    }

    public static nCG R() {
        nCG ncg = R;
        if (ncg == null) {
            synchronized (nCG.class) {
                ncg = R;
                if (ncg == null) {
                    Class cls = hSH.R;
                    nCG ncg2 = null;
                    if (cls != null) {
                        try {
                            ncg2 = (nCG) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (ncg2 == null) {
                        ncg2 = v;
                    }
                    R = ncg2;
                    ncg = ncg2;
                }
            }
        }
        return ncg;
    }
}
