package defpackage;

/* renamed from: d9D  reason: default package */
/* loaded from: classes.dex */
public final class d9D extends mGS {
    public final /* synthetic */ mzJ R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ oCF f2507R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public d9D(String str, oCF ocf, mzJ mzj) {
        super(str, true);
        this.f2507R = ocf;
        this.R = mzj;
    }

    @Override // defpackage.mGS
    public final long R() {
        cMR cmr;
        try {
            cmr = this.f2507R.X();
        } catch (Throwable th) {
            cmr = new cMR(this.f2507R, th, 2);
        }
        if (!this.R.f6261R.contains(this.f2507R)) {
            return -1;
        }
        this.R.f6262R.put(cmr);
        return -1;
    }
}
