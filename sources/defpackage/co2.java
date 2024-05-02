package defpackage;

/* renamed from: co2  reason: default package */
/* loaded from: classes.dex */
public final class co2 implements i_c {
    public final /* synthetic */ lkd R;

    public co2(lkd lkd) {
        this.R = lkd;
    }

    @Override // defpackage.i_c
    public final long H(int i, long j, long j2) {
        if (!((Boolean) this.R.f5811R.g()).booleanValue()) {
            return aWo.v;
        }
        if (!(aWo.X(j) == 0.0f) || aWo.X(j2) <= 0.0f) {
            lqA lqa = this.R.f5812R;
            lqa.v.R(Float.valueOf(aWo.X(j) + ((Number) lqa.v.getValue()).floatValue()));
        } else {
            this.R.f5812R.v.R(Float.valueOf(0.0f));
        }
        return aWo.v;
    }
}
