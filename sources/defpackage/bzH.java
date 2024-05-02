package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: bzH  reason: default package */
/* loaded from: classes.dex */
public final class bzH extends fkQ implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public int L;
    public final int O;

    /* renamed from: R  reason: collision with other field name */
    public final Context f1885R;

    /* renamed from: R  reason: collision with other field name */
    public View f1886R;

    /* renamed from: R  reason: collision with other field name */
    public ViewTreeObserver f1887R;

    /* renamed from: R  reason: collision with other field name */
    public PopupWindow.OnDismissListener f1888R;

    /* renamed from: R  reason: collision with other field name */
    public final jMp f1889R;

    /* renamed from: R  reason: collision with other field name */
    public final lRG f1890R;

    /* renamed from: R  reason: collision with other field name */
    public final mJT f1891R;

    /* renamed from: R  reason: collision with other field name */
    public ovy f1892R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f1893R;
    public final int X;
    public boolean c;
    public final int e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f1894e;
    public View v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1895v;
    public final Cx R = new Cx(1, this);

    /* renamed from: R  reason: collision with other field name */
    public final V1 f1884R = new V1(1, this);
    public int Z = 0;

    public bzH(int i, int i2, Context context, View view, lRG lrg, boolean z) {
        this.f1885R = context;
        this.f1890R = lrg;
        this.f1893R = z;
        this.f1889R = new jMp(lrg, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.X = i;
        this.O = i2;
        Resources resources = context.getResources();
        this.e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1886R = view;
        this.f1891R = new mJT(context, i, i2);
        lrg.v(this, context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    @Override // defpackage.lF5
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H(defpackage.go1 r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x007a
            h6s r0 = new h6s
            android.content.Context r5 = r9.f1885R
            android.view.View r6 = r9.v
            boolean r8 = r9.f1893R
            int r3 = r9.X
            int r4 = r9.O
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            ovy r2 = r9.f1892R
            r0.f4071R = r2
            fkQ r3 = r0.f4068R
            if (r3 == 0) goto L_0x0023
            r3.L(r2)
        L_0x0023:
            boolean r2 = defpackage.fkQ.V(r10)
            r0.f4073v = r2
            fkQ r3 = r0.f4068R
            if (r3 == 0) goto L_0x0030
            r3.P(r2)
        L_0x0030:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f1888R
            r0.f4067R = r2
            r2 = 0
            r9.f1888R = r2
            lRG r2 = r9.f1890R
            r2.c(r1)
            mJT r2 = r9.f1891R
            int r3 = r2.O
            int r2 = r2.N()
            int r4 = r9.Z
            android.view.View r5 = r9.f1886R
            java.util.WeakHashMap r6 = defpackage.of5.f6887R
            int r5 = defpackage.eHQ.e(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005e
            android.view.View r4 = r9.f1886R
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005e:
            boolean r4 = r0.v()
            r5 = 1
            if (r4 == 0) goto L_0x0066
            goto L_0x006f
        L_0x0066:
            android.view.View r4 = r0.f4066R
            if (r4 != 0) goto L_0x006c
            r0 = r1
            goto L_0x0070
        L_0x006c:
            r0.e(r3, r2, r5, r5)
        L_0x006f:
            r0 = r5
        L_0x0070:
            if (r0 == 0) goto L_0x007a
            ovy r9 = r9.f1892R
            if (r9 == 0) goto L_0x0079
            r9.e(r10)
        L_0x0079:
            return r5
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzH.H(go1):boolean");
    }

    @Override // defpackage.lF5
    public final void L(ovy ovy) {
        this.f1892R = ovy;
    }

    @Override // defpackage.fkQ
    public final void N(View view) {
        this.f1886R = view;
    }

    @Override // defpackage.fkQ
    public final void P(boolean z) {
        this.f1889R.f4914R = z;
    }

    @Override // defpackage.lF5
    public final void R(lRG lrg, boolean z) {
        if (lrg == this.f1890R) {
            dismiss();
            ovy ovy = this.f1892R;
            if (ovy != null) {
                ovy.R(lrg, z);
            }
        }
    }

    @Override // defpackage.fkQ
    public final void U(lRG lrg) {
    }

    @Override // defpackage.gt5
    public final void Z() {
        View view;
        Rect rect;
        boolean z = true;
        if (!v()) {
            if (this.f1895v || (view = this.f1886R) == null) {
                z = false;
            } else {
                this.v = view;
                ((olv) this.f1891R).R.setOnDismissListener(this);
                mJT mjt = this.f1891R;
                ((olv) mjt).f6922R = this;
                ((olv) mjt).f6930e = true;
                ((olv) mjt).R.setFocusable(true);
                View view2 = this.v;
                boolean z2 = this.f1887R == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f1887R = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.R);
                }
                view2.addOnAttachStateChangeListener(this.f1884R);
                mJT mjt2 = this.f1891R;
                ((olv) mjt2).f6921R = view2;
                mjt2.m = this.Z;
                if (!this.c) {
                    this.L = fkQ.C(this.f1889R, this.f1885R, this.e);
                    this.c = true;
                }
                this.f1891R.y(this.L);
                ((olv) this.f1891R).R.setInputMethodMode(2);
                mJT mjt3 = this.f1891R;
                Rect rect2 = ((fkQ) this).R;
                if (rect2 != null) {
                    mjt3.getClass();
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                ((olv) mjt3).v = rect;
                this.f1891R.Z();
                aYp ayp = ((olv) this.f1891R).f6917R;
                ayp.setOnKeyListener(this);
                if (this.f1894e && this.f1890R.f5732R != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1885R).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) ayp, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f1890R.f5732R);
                    }
                    frameLayout.setEnabled(false);
                    ayp.addHeaderView(frameLayout, null, false);
                }
                this.f1891R.L(this.f1889R);
                this.f1891R.Z();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // defpackage.lF5
    public final boolean c() {
        return false;
    }

    @Override // defpackage.gt5
    public final void dismiss() {
        if (v()) {
            this.f1891R.dismiss();
        }
    }

    @Override // defpackage.gt5
    public final aYp e() {
        return ((olv) this.f1891R).f6917R;
    }

    @Override // defpackage.fkQ
    public final void g(int i) {
        this.f1891R.O = i;
    }

    @Override // defpackage.fkQ
    public final void i(int i) {
        this.f1891R.j(i);
    }

    @Override // defpackage.fkQ
    public final void j(int i) {
        this.Z = i;
    }

    @Override // defpackage.lF5
    public final void m() {
        this.c = false;
        jMp jmp = this.f1889R;
        if (jmp != null) {
            jmp.notifyDataSetChanged();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f1895v = true;
        this.f1890R.c(true);
        ViewTreeObserver viewTreeObserver = this.f1887R;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1887R = this.v.getViewTreeObserver();
            }
            this.f1887R.removeGlobalOnLayoutListener(this.R);
            this.f1887R = null;
        }
        this.v.removeOnAttachStateChangeListener(this.f1884R);
        PopupWindow.OnDismissListener onDismissListener = this.f1888R;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.fkQ
    public final void t(boolean z) {
        this.f1894e = z;
    }

    @Override // defpackage.gt5
    public final boolean v() {
        return !this.f1895v && this.f1891R.v();
    }

    @Override // defpackage.fkQ
    public final void y(PopupWindow.OnDismissListener onDismissListener) {
        this.f1888R = onDismissListener;
    }
}
