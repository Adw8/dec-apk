package defpackage;

import java.io.InputStreamReader;

/* renamed from: e5B  reason: default package */
/* loaded from: classes.dex */
public final class e5B extends k8G implements f_c {
    public final /* synthetic */ iHI R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Process f2971R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f2972R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e5B(Process process, iHI ihi, String str, int i) {
        super(0);
        this.X = i;
        this.f2971R = process;
        this.R = ihi;
        this.f2972R = str;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                mLz.O(new InputStreamReader(this.f2971R.getInputStream(), O1.R), new Wn(this.R, 4, this.f2972R));
                return;
            default:
                int waitFor = this.f2971R.waitFor();
                String V = gvP.V(-3881556248278591379L);
                String str = this.f2972R;
                kxm.v(V, 6, "[" + str + "] *exit | ret=" + waitFor, null);
                return;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
