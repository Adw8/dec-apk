package defpackage;

/* renamed from: M1  reason: default package */
/* loaded from: classes.dex */
public final class M1 extends k8G implements lR3 {
    public final /* synthetic */ bSG R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f289R;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public M1(boolean z, bSG bsg, boolean z2) {
        super(3);
        this.f289R = z;
        this.R = bsg;
        this.v = z2;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        ncu ncu = (ncu) obj;
        ((Number) obj3).intValue();
        jr_ jr_ = (jr_) ((m88) obj2);
        jr_.w(-1538687176);
        long j = ((k1m) jr_.x(ei2.f3183R)).R;
        Object[] objArr = {new n3(j), Boolean.valueOf(this.f289R), this.R, Boolean.valueOf(this.v)};
        boolean z = this.f289R;
        bSG bsg = this.R;
        boolean z2 = this.v;
        jr_.w(-568225417);
        boolean z3 = false;
        for (int i = 0; i < 4; i++) {
            z3 |= jr_.O(objArr[i]);
        }
        Object I = jr_.I();
        if (z3 || I == ppN.R) {
            I = new T9(j, z, bsg, z2);
            jr_.ZW(I);
        }
        jr_.g(false);
        ncu I2 = ncu.I(g4x.g(aff.R, lBz.Y, new nzF(1, (kg9) I)));
        jr_.g(false);
        return I2;
    }
}
