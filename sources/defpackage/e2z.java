package defpackage;

import android.view.View;

/* renamed from: e2z  reason: default package */
/* loaded from: classes.dex */
public final class e2z extends k8G implements f_c {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ eGS f2946R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f2947R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public e2z(View view, eGS egs, int i, h0T h0t) {
        super(0);
        this.R = view;
        this.f2946R = egs;
        this.X = i;
        this.f2947R = h0t;
    }

    @Override // defpackage.f_c
    public final Object g() {
        jyF.v(this.R.getRootView(), (hjM) this.f2946R.R, this.X, new n2R(this.f2947R, 2));
        return o8s.R;
    }
}
