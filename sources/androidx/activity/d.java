package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.h;
import dev.kdrag0n.virtcontainer.R;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class d extends cMB implements ly1, jIY, adL, dZd, Z6, jOq, mMq, a2M, gpY, eI3 {

    /* renamed from: R  reason: collision with other field name */
    public h f1013R;

    /* renamed from: R  reason: collision with other field name */
    public final c31 f1014R;

    /* renamed from: R  reason: collision with other field name */
    public final hSL f1015R;

    /* renamed from: R  reason: collision with other field name */
    public ns8 f1017R;

    /* renamed from: v  reason: collision with other field name */
    public final m4i f1019v;

    /* renamed from: R  reason: collision with other field name */
    public final a0p f1011R = new a0p();
    public final CV R = new CV(new mBn(0, this));

    /* renamed from: R  reason: collision with other field name */
    public final c f1012R = new c(new k0f(0, this));

    /* renamed from: R  reason: collision with other field name */
    public final CopyOnWriteArrayList f1016R = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList v = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList X = new CopyOnWriteArrayList();

    /* renamed from: R  reason: collision with other field name */
    public boolean f1018R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1020v = false;

    public d() {
        m4i m4i = new m4i(this);
        this.f1019v = m4i;
        hSL hsl = new hSL(this);
        this.f1015R = hsl;
        new AtomicInteger();
        hm9 hm9 = (hm9) this;
        this.f1014R = new c31(hm9);
        m4i.R(new k3P(hm9) { // from class: androidx.activity.ComponentActivity$3
            public final /* synthetic */ d R;

            {
                this.R = r1;
            }

            @Override // defpackage.k3P
            public final void e(nu_ nu_, alX alx) {
                if (alx == alX.ON_STOP) {
                    Window window = this.R.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        m4i.R(new k3P(hm9) { // from class: androidx.activity.ComponentActivity$4
            public final /* synthetic */ d R;

            {
                this.R = r1;
            }

            @Override // defpackage.k3P
            public final void e(nu_ nu_, alX alx) {
                if (alx == alX.ON_DESTROY) {
                    this.R.f1011R.R = null;
                    if (!this.R.isChangingConfigurations()) {
                        this.R.e().R();
                    }
                }
            }
        });
        m4i.R(new k3P(hm9) { // from class: androidx.activity.ComponentActivity$5
            public final /* synthetic */ d R;

            {
                this.R = r1;
            }

            @Override // defpackage.k3P
            public final void e(nu_ nu_, alX alx) {
                d dVar = this.R;
                if (dVar.f1017R == null) {
                    ay1 ay1 = (ay1) dVar.getLastNonConfigurationInstance();
                    if (ay1 != null) {
                        dVar.f1017R = ay1.R;
                    }
                    if (dVar.f1017R == null) {
                        dVar.f1017R = new ns8();
                    }
                }
                this.R.f1019v.v(this);
            }
        });
        hsl.R();
        mxC.C(this);
        hsl.f4264R.c("android:support:activity-result", new fy7(0, this));
        C(new mGt(hm9, 0));
    }

    public final void C(oOW oow) {
        a0p a0p = this.f1011R;
        if (a0p.R != null) {
            oow.R();
        }
        a0p.f716R.add(oow);
    }

    @Override // defpackage.jIY
    public hv5 L() {
        if (this.f1013R == null) {
            this.f1013R = new h(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f1013R;
    }

    public final void N(eI8 ei8) {
        CV cv = this.R;
        ((CopyOnWriteArrayList) cv.v).remove(ei8);
        jQ.Y(((Map) cv.c).remove(ei8));
        ((Runnable) cv.f59R).run();
    }

    @Override // defpackage.nu_
    public final m4i O() {
        return this.f1019v;
    }

    public final void P(kWs kws) {
        this.f1016R.remove(kws);
    }

    @Override // defpackage.jIY
    public final o0y Z() {
        o0y o0y = new o0y(0);
        if (getApplication() != null) {
            o0y.v(ppN.U, getApplication());
        }
        o0y.v(mxC.f6248R, this);
        o0y.v(mxC.f6251v, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            o0y.v(mxC.f6249c, getIntent().getExtras());
        }
        return o0y;
    }

    @Override // defpackage.adL
    public final bhK c() {
        return this.f1015R.f4264R;
    }

    @Override // defpackage.ly1
    public final ns8 e() {
        if (getApplication() != null) {
            if (this.f1017R == null) {
                ay1 ay1 = (ay1) getLastNonConfigurationInstance();
                if (ay1 != null) {
                    this.f1017R = ay1.R;
                }
                if (this.f1017R == null) {
                    this.f1017R = new ns8();
                }
            }
            return this.f1017R;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final void g(kWs kws) {
        this.X.remove(kws);
    }

    public final void j(kWs kws) {
        this.e.remove(kws);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f1014R.R(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f1012R.v();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f1016R.iterator();
        while (it.hasNext()) {
            ((geB) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.cMB, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1015R.v(bundle);
        a0p a0p = this.f1011R;
        a0p.R = this;
        Iterator it = a0p.f716R.iterator();
        while (it.hasNext()) {
            ((oOW) it.next()).R();
        }
        super.onCreate(bundle);
        mQ4.v(this);
        c cVar = this.f1012R;
        cVar.f1006R = hvw.R(this);
        cVar.c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        CV cv = this.R;
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) cv.v).iterator();
        while (it.hasNext()) {
            ((eI8) it.next()).R.x();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.R.I();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (!this.f1018R) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((geB) it.next()).accept(new dud(z));
            }
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((geB) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.R.v).iterator();
        while (it.hasNext()) {
            ((eI8) it.next()).R.j();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (!this.f1020v) {
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                ((geB) it.next()).accept(new ivh(z));
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.R.v).iterator();
        while (it.hasNext()) {
            ((eI8) it.next()).R.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.f1014R.R(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        ay1 ay1;
        ns8 ns8 = this.f1017R;
        if (ns8 == null && (ay1 = (ay1) getLastNonConfigurationInstance()) != null) {
            ns8 = ay1.R;
        }
        if (ns8 == null) {
            return null;
        }
        ay1 ay12 = new ay1();
        ay12.R = ns8;
        return ay12;
    }

    @Override // defpackage.cMB, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        m4i m4i = this.f1019v;
        if (m4i instanceof m4i) {
            m4i.L(iMP.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f1015R.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            ((geB) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (dtx.i()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        aH9.vr(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        aH9.cr(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public abstract void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // defpackage.dZd
    public final c x() {
        return this.f1012R;
    }

    public final void y(kWs kws) {
        this.v.remove(kws);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: finally extract failed */
    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f1018R = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f1018R = false;
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((geB) it.next()).accept(new dud(z, 0));
            }
        } catch (Throwable th) {
            this.f1018R = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f1020v = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f1020v = false;
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                ((geB) it.next()).accept(new ivh(z, 0));
            }
        } catch (Throwable th) {
            this.f1020v = false;
            throw th;
        }
    }
}
