package defpackage;

/* renamed from: a6W  reason: default package */
/* loaded from: classes.dex */
public final class a6W extends arx {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final oFB f732R;

    public a6W(oFB ofb, long j) {
        this.f732R = ofb;
        this.R = j;
    }

    @Override // defpackage.arx
    public final Jl O() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // defpackage.arx
    public final oFB X() {
        return this.f732R;
    }

    @Override // defpackage.arx
    public final long c() {
        return this.R;
    }
}
