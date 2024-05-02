package defpackage;

/* renamed from: lpN  reason: default package */
/* loaded from: classes.dex */
public final class lpN extends aH9 {
    public final /* synthetic */ int R = 1;

    /* renamed from: R  reason: collision with other field name */
    public final Object f5841R;

    public lpN(ky kyVar) {
        this.f5841R = kyVar;
    }

    @Override // defpackage.aH9
    public final int i(int i, mdz mdz) {
        switch (this.R) {
            case 0:
                return ((vV) this.f5841R).R(0, i, mdz);
            default:
                return ((ky) this.f5841R).R(0, i);
        }
    }

    public lpN(vV vVVar) {
        this.f5841R = vVVar;
    }
}
