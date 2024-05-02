package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.c;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: bEF  reason: default package */
/* loaded from: classes.dex */
public class bEF extends Dialog implements nu_, dZd {
    public final c R = new c(new mBn(1, this));

    /* renamed from: R  reason: collision with other field name */
    public m4i f1580R;

    public bEF(Context context, int i) {
        super(context, i);
    }

    public static void R(bEF bef) {
        super.onBackPressed();
    }

    @Override // defpackage.nu_
    public final m4i O() {
        m4i m4i = this.f1580R;
        if (m4i != null) {
            return m4i;
        }
        m4i m4i2 = new m4i(this);
        this.f1580R = m4i2;
        return m4i2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        super.addContentView(view, layoutParams);
    }

    public final void e() {
        aH9.vr(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.R.v();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c cVar = this.R;
        cVar.f1006R = getOnBackInvokedDispatcher();
        cVar.c();
        m4i m4i = this.f1580R;
        if (m4i == null) {
            m4i = new m4i(this);
            this.f1580R = m4i;
        }
        m4i.X(alX.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        m4i m4i = this.f1580R;
        if (m4i == null) {
            m4i = new m4i(this);
            this.f1580R = m4i;
        }
        m4i.X(alX.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m4i m4i = this.f1580R;
        if (m4i == null) {
            m4i = new m4i(this);
            this.f1580R = m4i;
        }
        m4i.X(alX.ON_DESTROY);
        this.f1580R = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // defpackage.dZd
    public final c x() {
        return this.R;
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        super.setContentView(view, layoutParams);
    }
}
