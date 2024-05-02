package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* renamed from: Yr  reason: default package */
/* loaded from: classes.dex */
public final class Yr extends k49 {
    public static final tm R = new tm(1);

    /* renamed from: R  reason: collision with other field name */
    public final jsT f639R;

    /* renamed from: R  reason: collision with other field name */
    public final pdD f640R;

    /* renamed from: R  reason: collision with other field name */
    public final L_[] f641R;

    public Yr(pdD pdd, TreeMap treeMap) {
        this.f640R = pdd;
        this.f641R = (L_[]) treeMap.values().toArray(new L_[treeMap.size()]);
        this.f639R = jsT.v((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        try {
            mot.c();
            L_[] l_Arr = this.f641R;
            for (L_ l_ : l_Arr) {
                mot.Z(l_.R);
                l_.f282R.O(mot, l_.f281R.get(obj));
            }
            mot.X();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        try {
            Object I = this.f640R.I();
            try {
                csz.c();
                while (csz.H()) {
                    int G = csz.G(this.f639R);
                    if (G == -1) {
                        csz.B();
                        csz.l();
                    } else {
                        L_ l_ = this.f641R[G];
                        l_.f281R.set(I, l_.f282R.R(csz));
                    }
                }
                csz.O();
                return I;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            mzK.Z(e2);
            throw null;
        }
    }

    public final String toString() {
        StringBuilder U = opT.U("JsonAdapter(");
        U.append(this.f640R);
        U.append(")");
        return U.toString();
    }
}
