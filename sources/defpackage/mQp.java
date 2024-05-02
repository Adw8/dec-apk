package defpackage;

/* renamed from: mQp  reason: default package */
/* loaded from: classes.dex */
public final class mQp extends h7U {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ oFB f6041R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ byte[] f6042R;
    public final /* synthetic */ int v;

    public mQp(oFB ofb, byte[] bArr, int i, int i2) {
        this.f6041R = ofb;
        this.R = i;
        this.f6042R = bArr;
        this.v = i2;
    }

    @Override // defpackage.h7U
    public final long R() {
        return (long) this.R;
    }

    @Override // defpackage.h7U
    public final void c(NV nv) {
        nv.x(this.f6042R, this.v, this.R);
    }

    @Override // defpackage.h7U
    public final oFB v() {
        return this.f6041R;
    }
}
