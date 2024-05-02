package defpackage;

/* renamed from: gHm  reason: default package */
/* loaded from: classes.dex */
public final class gHm implements nmZ, dH9 {
    public final f_c R;

    /* renamed from: R  reason: collision with other field name */
    public kWx f3717R = new kWx();

    public gHm(f_c f_c) {
        this.R = f_c;
    }

    @Override // defpackage.nmZ
    public final jJG C() {
        return this.f3717R;
    }

    @Override // defpackage.nmZ
    public final void H(jJG jjg) {
        this.f3717R = (kWx) jjg;
    }

    public final Object[] X() {
        Object[] objArr;
        int i = dR6.c;
        mAv mav = c((kWx) jwU.O(this.f3717R), jwU.L(), false, this.R).f5321R;
        return (mav == null || (objArr = (Object[]) mav.f5962R) == null) ? new Object[0] : objArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:18:0x003d, B:20:0x0049, B:23:0x0051, B:25:0x0056, B:27:0x007a, B:28:0x007d, B:29:0x0080), top: B:79:0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051 A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:18:0x003d, B:20:0x0049, B:23:0x0051, B:25:0x0056, B:27:0x007a, B:28:0x007d, B:29:0x0080), top: B:79:0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.kWx c(defpackage.kWx r9, defpackage.dR6 r10, boolean r11, defpackage.f_c r12) {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gHm.c(kWx, dR6, boolean, f_c):kWx");
    }

    public final Object e() {
        int i = dR6.c;
        return c((kWx) jwU.O(this.f3717R), jwU.L(), false, this.R).R;
    }

    @Override // defpackage.dH9
    public final Object getValue() {
        int i = dR6.c;
        kg9 O = jwU.L().O();
        if (O != null) {
            O.x(this);
        }
        return c((kWx) jwU.O(this.f3717R), jwU.L(), true, this.R).R;
    }

    public final String toString() {
        kWx kwx = (kWx) jwU.O(this.f3717R);
        StringBuilder U = opT.U("DerivedState(value=");
        kWx kwx2 = (kWx) jwU.O(this.f3717R);
        U.append(kwx2.R != kWx.v && kwx2.f5322v == kwx2.c(this, jwU.L()) ? String.valueOf(kwx2.R) : "<Not calculated>");
        U.append(")@");
        U.append(hashCode());
        return U.toString();
    }
}
