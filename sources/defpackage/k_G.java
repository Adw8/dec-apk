package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: k_G  reason: default package */
/* loaded from: classes.dex */
public abstract class k_G implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public int O;
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final View f5351R;

    /* renamed from: R  reason: collision with other field name */
    public eWu f5352R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5353R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f5354R = new int[2];
    public final int X;
    public final int e;
    public eWu v;

    public k_G(View view) {
        this.f5351R = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.R = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.e = tapTimeout;
        this.X = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void R() {
        eWu ewu = this.v;
        if (ewu != null) {
            this.f5351R.removeCallbacks(ewu);
        }
        eWu ewu2 = this.f5352R;
        if (ewu2 != null) {
            this.f5351R.removeCallbacks(ewu2);
        }
    }

    public abstract boolean c();

    public boolean e() {
        gt5 v = v();
        if (v == null || !v.v()) {
            return true;
        }
        v.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (r4 != 3) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0110  */
    @Override // android.view.View.OnTouchListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k_G.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f5353R = false;
        this.O = -1;
        eWu ewu = this.f5352R;
        if (ewu != null) {
            this.f5351R.removeCallbacks(ewu);
        }
    }

    public abstract gt5 v();
}
