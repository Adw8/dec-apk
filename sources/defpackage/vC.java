package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vC  reason: default package */
/* loaded from: classes.dex */
public abstract class vC {
    public static FC R;

    /* renamed from: R  reason: collision with other field name */
    public static Gp f7431R;

    /* renamed from: R  reason: collision with other field name */
    public static aCQ f7432R;

    /* renamed from: R  reason: collision with other field name */
    public static final f3L f7433R = new f3L("provider");
    public static final f3L v = new f3L("provider");
    public static final f3L c = new f3L("compositionLocalMap");
    public static final f3L e = new f3L("providerValues");
    public static final f3L X = new f3L("providers");
    public static final f3L O = new f3L("reference");

    /* renamed from: R  reason: collision with other field name */
    public static final jPG f7434R = new jPG();

    public static boolean L(jvs jvs, jvs jvs2) {
        if (jvs.R.f696R.length == jvs2.R.f696R.length) {
            Bk[] K = jvs.K();
            Bk[] K2 = jvs2.K();
            if (K.length == K2.length) {
                for (int i = 0; i != K.length; i++) {
                    Bk bk = K[i];
                    Bk bk2 = K2[i];
                    if (bk == bk2 || (bk != null && bk2 != null && bk.f43R.h(bk2.f43R) && vd.C(bk.R).equals(vd.C(bk2.R)))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final int O(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int O2 = n3x.O(((pnH) list.get(i3)).R, i);
            if (O2 < 0) {
                i2 = i3 + 1;
            } else if (O2 <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void R(int i, int i2, ArrayList arrayList) {
        int O2 = O(i, arrayList);
        if (O2 < 0) {
            O2 = -(O2 + 1);
        }
        while (O2 < arrayList.size() && ((pnH) arrayList.get(O2)).R < i2) {
            arrayList.remove(O2);
        }
    }

    public static StaticLayout X(CharSequence charSequence, int i, int i2, Vw vw, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        return f7434R.R(new lNr(charSequence, i, i2, vw, i3, textDirectionHeuristic, alignment, i4, truncateAt, i5, f, f2, i6, z, z2, i7, i8, i9, i10, iArr, iArr2));
    }

    public static final void Z(mdh mdh, h1W h1w) {
        dYh dyh;
        hAe hae;
        int L = mdh.L(mdh.f6092R, mdh.N(mdh.H));
        int[] iArr = mdh.f6092R;
        int i = mdh.H;
        ppg ppg = new ppg(L, mdh.L(iArr, mdh.N(mdh.P(i) + i)), mdh);
        while (ppg.hasNext()) {
            Object next = ppg.next();
            if (next instanceof ddq) {
                h1w.e((ddq) next);
            } else if ((next instanceof dYh) && (hae = (dyh = (dYh) next).f2665R) != null) {
                hae.f4151R = true;
                dyh.f2665R = null;
                dyh.f2664R = null;
                dyh.f2667R = null;
            }
        }
        mdh.z();
    }

    public static final void c(ilY ily, ArrayList arrayList, int i) {
        if (ily.m(i)) {
            arrayList.add(ily.x(i));
            return;
        }
        int i2 = i + 1;
        int Z = ily.Z(i) + i;
        while (i2 < Z) {
            c(ily, arrayList, i2);
            i2 += ily.Z(i2);
        }
    }

    public static final void e(String str) {
        throw new leD(jQ.C("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void m(boolean z) {
        if (!z) {
            e("Check failed".toString());
            throw null;
        }
    }

    public static boolean v(plH plh, plH plh2) {
        boolean z;
        jvs[] jvsArr = (jvs[]) plh.f7213R.clone();
        jvs[] jvsArr2 = (jvs[]) plh2.f7213R.clone();
        if (jvsArr.length != jvsArr2.length) {
            return false;
        }
        boolean z2 = (jvsArr[0].o() == null || jvsArr2[0].o() == null) ? false : !jvsArr[0].o().f43R.h(jvsArr2[0].o().f43R);
        for (int i = 0; i != jvsArr.length; i++) {
            jvs jvs = jvsArr[i];
            if (z2) {
                for (int length = jvsArr2.length - 1; length >= 0; length--) {
                    jvs jvs2 = jvsArr2[length];
                    if (jvs2 != null && L(jvs, jvs2)) {
                        jvsArr2[length] = null;
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                for (int i2 = 0; i2 != jvsArr2.length; i2++) {
                    jvs jvs3 = jvsArr2[i2];
                    if (jvs3 != null && L(jvs, jvs3)) {
                        jvsArr2[i2] = null;
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static O x(u uVar, String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return (uVar.h(UB.O) || uVar.h(UB.L)) ? new hP2(str) : uVar.h(UB.f553e) ? new s(str) : (uVar.h(UB.f551R) || uVar.h(UB.v) || uVar.h(UB.f552c) || uVar.h(UB.X)) ? new d1S(str) : new nhO(str);
        }
        try {
            int length = (str.length() - 1) / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i != length; i++) {
                int i2 = (i * 2) + 1;
                bArr[i] = (byte) (vd.P(str.charAt(i2 + 1)) | (vd.P(str.charAt(i2)) << 4));
            }
            return O.I(bArr);
        } catch (IOException unused) {
            StringBuilder U = opT.U("can't recode value for oid ");
            U.append(uVar.f7421R);
            throw new _(U.toString());
        }
    }
}
