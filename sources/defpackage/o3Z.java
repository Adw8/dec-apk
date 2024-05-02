package defpackage;

/* renamed from: o3Z  reason: default package */
/* loaded from: classes.dex */
public final class o3Z implements cjR {
    public mdz R;

    /* renamed from: R  reason: collision with other field name */
    public final ncu f6660R;

    /* renamed from: R  reason: collision with other field name */
    public final pi1 f6661R;

    public o3Z() {
        pi1 pi1 = new pi1();
        this.f6661R = pi1;
        bsy bsy = ofC.R;
        this.f6660R = pi1.I(ofC.f6889R);
    }

    public final void R(boolean z) {
        mgi mgi;
        pi1 pi1 = this.f6661R;
        mgi mgi2 = pi1.f7192R;
        if (msU.Y(pi1, z)) {
            pi1 pi12 = this.f6661R;
            int ordinal = mgi2.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                mgi = mgi.Active;
            } else if (ordinal == 3 || ordinal == 4) {
                mgi = mgi.Deactivated;
            } else if (ordinal == 5) {
                mgi = mgi.Inactive;
            } else {
                throw new j8f((Object) null);
            }
            pi12.U(mgi);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x01f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(int r17) {
        /*
        // Method dump skipped, instructions count: 535
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o3Z.v(int):boolean");
    }
}
