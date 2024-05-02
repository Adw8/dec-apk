package defpackage;

/* renamed from: dId  reason: default package */
/* loaded from: classes.dex */
public final class dId extends h7U {
    public final /* synthetic */ int R = 1;

    /* renamed from: R  reason: collision with other field name */
    public final Object f2557R;

    /* renamed from: R  reason: collision with other field name */
    public final oFB f2558R;

    public dId(oFB ofb, F6 f6) {
        this.f2558R = ofb;
        this.f2557R = f6;
    }

    @Override // defpackage.h7U
    public final long R() {
        switch (this.R) {
            case 0:
                return (long) ((F6) this.f2557R).v();
            default:
                return ((h7U) this.f2557R).R();
        }
    }

    @Override // defpackage.h7U
    public final void c(NV nv) {
        switch (this.R) {
            case 0:
                nv.y((F6) this.f2557R);
                return;
            default:
                ((h7U) this.f2557R).c(nv);
                return;
        }
    }

    @Override // defpackage.h7U
    public final oFB v() {
        switch (this.R) {
            case 0:
                return this.f2558R;
            default:
                return this.f2558R;
        }
    }

    public dId(h7U h7u, oFB ofb) {
        this.f2557R = h7u;
        this.f2558R = ofb;
    }
}
