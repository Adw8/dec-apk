package defpackage;

/* renamed from: eSv  reason: default package */
/* loaded from: classes.dex */
public final class eSv extends arx {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final Jl f3105R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f3106R;
    public final /* synthetic */ int e = 1;

    public eSv(oFB ofb, long j, ME me) {
        this.f3106R = ofb;
        this.R = j;
        this.f3105R = me;
    }

    @Override // defpackage.arx
    public final Jl O() {
        switch (this.e) {
            case 0:
                return this.f3105R;
            default:
                return this.f3105R;
        }
    }

    @Override // defpackage.arx
    public final oFB X() {
        switch (this.e) {
            case 0:
                return (oFB) this.f3106R;
            default:
                String str = (String) this.f3106R;
                if (str == null) {
                    return null;
                }
                try {
                    return bRg.R(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }

    @Override // defpackage.arx
    public final long c() {
        switch (this.e) {
            case 0:
                return this.R;
            default:
                return this.R;
        }
    }

    public eSv(String str, long j, oDA oda) {
        this.f3106R = str;
        this.R = j;
        this.f3105R = oda;
    }
}
