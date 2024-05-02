package defpackage;

/* renamed from: nIq  reason: default package */
/* loaded from: classes.dex */
public abstract class nIq {
    static {
        F6 f6 = F6.R;
        kgV.e("\"\\");
        kgV.e("\t ,=");
    }

    public static final boolean R(dEt det) {
        if (n3x.v((String) det.f2539R.v, "HEAD")) {
            return false;
        }
        int i = det.e;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && khE.e(det) == -1 && !iH_.Q("chunked", dEt.R(det, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d8, code lost:
        if (defpackage.e6C.R.R.matcher(r0).matches() == false) goto L_0x01da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(defpackage.nvJ r33, defpackage.a7_ r34, defpackage.bd4 r35) {
        /*
        // Method dump skipped, instructions count: 576
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nIq.v(nvJ, a7_, bd4):void");
    }
}
