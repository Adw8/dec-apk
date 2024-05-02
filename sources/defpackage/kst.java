package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: kst  reason: default package */
/* loaded from: classes.dex */
public abstract class kst {
    public final Context R;

    /* renamed from: R  reason: collision with other field name */
    public final CheckableImageButton f5453R;

    /* renamed from: R  reason: collision with other field name */
    public final TextInputLayout f5454R;

    /* renamed from: R  reason: collision with other field name */
    public final iOp f5455R;

    public kst(iOp iop) {
        this.f5454R = iop.f4570R;
        this.f5455R = iop;
        this.R = iop.getContext();
        this.f5453R = iop.f4577v;
    }

    public void C(EditText editText) {
    }

    public boolean H() {
        return this instanceof heD;
    }

    public View.OnFocusChangeListener L() {
        return null;
    }

    public void N(jG jGVar) {
    }

    public View.OnClickListener O() {
        return null;
    }

    public void P(AccessibilityEvent accessibilityEvent) {
    }

    public void R() {
    }

    public boolean U() {
        return false;
    }

    public View.OnFocusChangeListener X() {
        return null;
    }

    public P_ Z() {
        return null;
    }

    public int c() {
        return 0;
    }

    public int e() {
        return 0;
    }

    public final void g() {
        this.f5455R.X(false);
    }

    public void j(boolean z) {
    }

    public boolean m(int i) {
        return true;
    }

    public void t() {
    }

    public void v() {
    }

    public boolean x() {
        return false;
    }

    public abstract void y();
}
