package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.activity.c;
import androidx.activity.d;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: eAj  reason: default package */
/* loaded from: classes.dex */
public final class eAj extends pdD implements jOq, mMq, a2M, gpY, ly1, dZd, Z6, adL, kQZ, eI3 {
    public final Activity R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f3004R;

    /* renamed from: R  reason: collision with other field name */
    public final Handler f3005R;

    /* renamed from: R  reason: collision with other field name */
    public final hAW f3006R = new hAW();

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hm9 f3007R;

    public eAj(pJ pJVar) {
        this.f3007R = pJVar;
        Handler handler = new Handler();
        this.R = pJVar;
        this.f3004R = pJVar;
        this.f3005R = handler;
    }

    public final void B(geB geb) {
        ((d) this.f3007R).f1016R.add(geb);
    }

    public final void D(kWs kws) {
        this.f3007R.g(kws);
    }

    public final void E(kWs kws) {
        ((d) this.f3007R).v.add(kws);
    }

    public final void F(kWs kws) {
        this.f3007R.j(kws);
    }

    public final void G(eI8 ei8) {
        CV cv = ((d) this.f3007R).R;
        ((CopyOnWriteArrayList) cv.v).add(ei8);
        ((Runnable) cv.f59R).run();
    }

    public final void M(kWs kws) {
        ((d) this.f3007R).X.add(kws);
    }

    @Override // defpackage.nu_
    public final m4i O() {
        return this.f3007R.c;
    }

    @Override // defpackage.kQZ
    public final void R(pm2 pm2) {
        this.f3007R.getClass();
    }

    public final void a(kWs kws) {
        this.f3007R.P(kws);
    }

    public final void b(kWs kws) {
        this.f3007R.y(kws);
    }

    @Override // defpackage.adL
    public final bhK c() {
        return ((d) this.f3007R).f1015R.f4264R;
    }

    @Override // defpackage.ly1
    public final ns8 e() {
        return this.f3007R.e();
    }

    public final void f(eI8 ei8) {
        this.f3007R.N(ei8);
    }

    public final void l(kWs kws) {
        ((d) this.f3007R).e.add(kws);
    }

    @Override // defpackage.pdD
    public final boolean n() {
        Window window = this.f3007R.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.dZd
    public final c x() {
        return ((d) this.f3007R).f1012R;
    }

    @Override // defpackage.pdD
    public final View z(int i) {
        return this.f3007R.findViewById(i);
    }
}
