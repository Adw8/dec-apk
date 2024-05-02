package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: plH  reason: default package */
/* loaded from: classes.dex */
public final class plH extends t implements J {
    public static UB R = UB.R;

    /* renamed from: R  reason: collision with other field name */
    public iuV f7210R;

    /* renamed from: R  reason: collision with other field name */
    public vC f7211R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7212R;

    /* renamed from: R  reason: collision with other field name */
    public jvs[] f7213R;
    public int e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public plH() {
        /*
        // Method dump skipped, instructions count: 394
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plH.<init>():void");
    }

    public plH(vC vCVar, jvs[] jvsArr) {
        this.f7211R = vCVar;
        this.f7213R = (jvs[]) jvsArr.clone();
        this.f7210R = new iuV(this.f7213R);
    }

    @Override // defpackage.t
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof plH) && !(obj instanceof q)) {
            return false;
        }
        if (this.f7210R.h(((b) obj).v())) {
            return true;
        }
        try {
            vC vCVar = this.f7211R;
            plH plh = new plH(q.A(((b) obj).v()));
            vCVar.getClass();
            return vC.v(this, plh);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.t
    public final int hashCode() {
        if (this.f7212R) {
            return this.e;
        }
        this.f7212R = true;
        this.f7211R.getClass();
        jvs[] jvsArr = (jvs[]) this.f7213R.clone();
        int i = 0;
        for (int i2 = 0; i2 != jvsArr.length; i2++) {
            jvs jvs = jvsArr[i2];
            if (jvs.R.f696R.length > 1) {
                Bk[] K = jvs.K();
                for (int i3 = 0; i3 != K.length; i3++) {
                    i = (i ^ K[i3].f43R.hashCode()) ^ vd.C(K[i3].R).hashCode();
                }
            } else {
                i = (i ^ jvs.o().f43R.hashCode()) ^ vd.C(jvsArr[i2].o().R).hashCode();
            }
        }
        this.e = i;
        return i;
    }

    public final String toString() {
        UB ub = (UB) this.f7211R;
        ub.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        jvs[] jvsArr = (jvs[]) this.f7213R.clone();
        boolean z = true;
        for (jvs jvs : jvsArr) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            Hashtable hashtable = ub.f555v;
            if (jvs.R.f696R.length > 1) {
                Bk[] K = jvs.K();
                boolean z2 = true;
                for (int i = 0; i != K.length; i++) {
                    if (z2) {
                        z2 = false;
                    } else {
                        stringBuffer.append('+');
                    }
                    vd.m(stringBuffer, K[i], hashtable);
                }
            } else if (jvs.o() != null) {
                vd.m(stringBuffer, jvs.o(), hashtable);
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.t, defpackage.b
    public final O v() {
        return this.f7210R;
    }

    public plH(q qVar) {
        iuV iuv;
        jvs jvs;
        _L _l;
        this.f7211R = R;
        this.f7213R = new jvs[qVar.size()];
        Enumeration d = qVar.d();
        boolean z = true;
        int i = 0;
        while (d.hasMoreElements()) {
            Object nextElement = d.nextElement();
            if (nextElement instanceof jvs) {
                jvs = (jvs) nextElement;
            } else if (nextElement != null) {
                Y y = _L.R;
                if (nextElement instanceof _L) {
                    _l = (_L) nextElement;
                } else if (nextElement instanceof b) {
                    O v = ((b) nextElement).v();
                    if (v instanceof _L) {
                        _l = (_L) v;
                    } else {
                        StringBuilder U = opT.U("unknown object in getInstance: ");
                        U.append(nextElement.getClass().getName());
                        throw new IllegalArgumentException(U.toString());
                    }
                } else if (nextElement instanceof byte[]) {
                    try {
                        _l = (_L) _L.R.X((byte[]) nextElement);
                    } catch (IOException e) {
                        StringBuilder U2 = opT.U("failed to construct set from byte[]: ");
                        U2.append(e.getMessage());
                        throw new IllegalArgumentException(U2.toString());
                    }
                } else {
                    StringBuilder U = opT.U("unknown object in getInstance: ");
                    U.append(nextElement.getClass().getName());
                    throw new IllegalArgumentException(U.toString());
                }
                jvs = new jvs(_l);
            } else {
                jvs = null;
            }
            z &= jvs == nextElement;
            i++;
            this.f7213R[i] = jvs;
        }
        if (z) {
            int i2 = iuV.X;
            iuv = (iuV) qVar.u();
        } else {
            iuv = new iuV(this.f7213R);
        }
        this.f7210R = iuv;
    }
}
