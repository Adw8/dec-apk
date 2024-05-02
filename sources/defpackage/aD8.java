package defpackage;

import java.util.Iterator;

/* renamed from: aD8  reason: default package */
/* loaded from: classes.dex */
public final class aD8 implements dmk {
    public static final k_s R = msU.mL(oCi.v, g5M.L);

    /* renamed from: R  reason: collision with other field name */
    public final oST f795R;

    /* renamed from: R  reason: collision with other field name */
    public final oey f796R;

    /* renamed from: v  reason: collision with other field name */
    public final oST f797v = l6.n(0);

    /* renamed from: R  reason: collision with other field name */
    public final gHm f794R = l6.V(new hNx(this, 3));
    public final gHm v = l6.V(new hNx(this, 2));
    public final oST c = l6.n(null);
    public final oST e = l6.n(null);

    public aD8(int i) {
        this.f796R = new oey(i, 0);
        this.f795R = l6.n(Integer.valueOf(i));
    }

    public final iFC L() {
        Object obj;
        b9a L = this.f796R.L();
        Iterator it = L.L().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                iFC ifc = (iFC) obj;
                int min = Math.min(ifc.R + ifc.c, L.X() - L.v()) - Math.max(ifc.R, 0);
                do {
                    Object next = it.next();
                    iFC ifc2 = (iFC) next;
                    int min2 = Math.min(ifc2.R + ifc2.c, L.X() - L.v()) - Math.max(ifc2.R, 0);
                    if (min < min2) {
                        obj = next;
                        min = min2;
                    }
                } while (it.hasNext());
            }
        }
        return (iFC) obj;
    }

    public final int O() {
        return ((Number) this.f797v.getValue()).intValue();
    }

    @Override // defpackage.dmk
    public final Object R(gRY gry, iv7 iv7, aOO aoo) {
        Object R2 = this.f796R.R(gry, iv7, aoo);
        return R2 == bGR.COROUTINE_SUSPENDED ? R2 : o8s.R;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0112 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x018d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c4 A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:22:0x0054, B:41:0x0089, B:43:0x00a1, B:45:0x00a5, B:46:0x00a8, B:47:0x00aa, B:50:0x00b9, B:52:0x00c4, B:55:0x00d4, B:59:0x00ed, B:60:0x00fb, B:62:0x0101, B:69:0x0113, B:71:0x0117, B:74:0x0132, B:76:0x013d, B:79:0x0168, B:80:0x0176, B:82:0x017c, B:89:0x018e, B:91:0x0192, B:93:0x019b), top: B:107:0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d4 A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:22:0x0054, B:41:0x0089, B:43:0x00a1, B:45:0x00a5, B:46:0x00a8, B:47:0x00aa, B:50:0x00b9, B:52:0x00c4, B:55:0x00d4, B:59:0x00ed, B:60:0x00fb, B:62:0x0101, B:69:0x0113, B:71:0x0117, B:74:0x0132, B:76:0x013d, B:79:0x0168, B:80:0x0176, B:82:0x017c, B:89:0x018e, B:91:0x0192, B:93:0x019b), top: B:107:0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0101 A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:22:0x0054, B:41:0x0089, B:43:0x00a1, B:45:0x00a5, B:46:0x00a8, B:47:0x00aa, B:50:0x00b9, B:52:0x00c4, B:55:0x00d4, B:59:0x00ed, B:60:0x00fb, B:62:0x0101, B:69:0x0113, B:71:0x0117, B:74:0x0132, B:76:0x013d, B:79:0x0168, B:80:0x0176, B:82:0x017c, B:89:0x018e, B:91:0x0192, B:93:0x019b), top: B:107:0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0117 A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:22:0x0054, B:41:0x0089, B:43:0x00a1, B:45:0x00a5, B:46:0x00a8, B:47:0x00aa, B:50:0x00b9, B:52:0x00c4, B:55:0x00d4, B:59:0x00ed, B:60:0x00fb, B:62:0x0101, B:69:0x0113, B:71:0x0117, B:74:0x0132, B:76:0x013d, B:79:0x0168, B:80:0x0176, B:82:0x017c, B:89:0x018e, B:91:0x0192, B:93:0x019b), top: B:107:0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0132 A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:22:0x0054, B:41:0x0089, B:43:0x00a1, B:45:0x00a5, B:46:0x00a8, B:47:0x00aa, B:50:0x00b9, B:52:0x00c4, B:55:0x00d4, B:59:0x00ed, B:60:0x00fb, B:62:0x0101, B:69:0x0113, B:71:0x0117, B:74:0x0132, B:76:0x013d, B:79:0x0168, B:80:0x0176, B:82:0x017c, B:89:0x018e, B:91:0x0192, B:93:0x019b), top: B:107:0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017c A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:22:0x0054, B:41:0x0089, B:43:0x00a1, B:45:0x00a5, B:46:0x00a8, B:47:0x00aa, B:50:0x00b9, B:52:0x00c4, B:55:0x00d4, B:59:0x00ed, B:60:0x00fb, B:62:0x0101, B:69:0x0113, B:71:0x0117, B:74:0x0132, B:76:0x013d, B:79:0x0168, B:80:0x0176, B:82:0x017c, B:89:0x018e, B:91:0x0192, B:93:0x019b), top: B:107:0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b5 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object X(int r10, float r11, defpackage.aOO r12) {
        /*
        // Method dump skipped, instructions count: 520
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aD8.X(int, float, aOO):java.lang.Object");
    }

    public final int Z() {
        return ((Number) this.f795R.getValue()).intValue();
    }

    @Override // defpackage.dmk
    public final boolean c() {
        return this.f796R.c();
    }

    @Override // defpackage.dmk
    public final float e(float f) {
        return this.f796R.e(f);
    }

    public final String toString() {
        StringBuilder U = opT.U("PagerState(pageCount=");
        U.append(((Number) this.f794R.getValue()).intValue());
        U.append(", currentPage=");
        U.append(Z());
        U.append(", currentPageOffset=");
        U.append(((Number) this.v.getValue()).floatValue());
        U.append(')');
        return U.toString();
    }
}
