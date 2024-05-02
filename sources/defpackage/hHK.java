package defpackage;

/* renamed from: hHK  reason: default package */
/* loaded from: classes.dex */
public final class hHK extends ift {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final ift f4198R;

    public hHK(cyq cyq, float f) {
        super(0);
        this.f4198R = cyq;
        this.R = f;
    }

    @Override // defpackage.ift
    public final void L(float f, float f2, float f3, okT okt) {
        this.f4198R.L(f, f2 - this.R, f3, okt);
    }

    @Override // defpackage.ift
    public final boolean O() {
        return this.f4198R.O();
    }
}
