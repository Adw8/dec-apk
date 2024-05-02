package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* renamed from: h6s  reason: default package */
/* loaded from: classes.dex */
public class h6s {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f4065R;

    /* renamed from: R  reason: collision with other field name */
    public View f4066R;

    /* renamed from: R  reason: collision with other field name */
    public PopupWindow.OnDismissListener f4067R;

    /* renamed from: R  reason: collision with other field name */
    public fkQ f4068R;

    /* renamed from: R  reason: collision with other field name */
    public final iCh f4069R;

    /* renamed from: R  reason: collision with other field name */
    public final lRG f4070R;

    /* renamed from: R  reason: collision with other field name */
    public ovy f4071R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4072R;
    public int c;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f4073v;

    public h6s(Context context, lRG lrg, View view, boolean z) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, lrg, z);
    }

    public final fkQ R() {
        fkQ fkq;
        if (this.f4068R == null) {
            Display defaultDisplay = ((WindowManager) this.f4065R.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            cUy.R(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= this.f4065R.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                fkq = new f5(this.f4065R, this.f4066R, this.R, this.v, this.f4072R);
            } else {
                fkq = new bzH(this.R, this.v, this.f4065R, this.f4066R, this.f4070R, this.f4072R);
            }
            fkq.U(this.f4070R);
            fkq.y(this.f4069R);
            fkq.N(this.f4066R);
            fkq.L(this.f4071R);
            fkq.P(this.f4073v);
            fkq.j(this.c);
            this.f4068R = fkq;
        }
        return this.f4068R;
    }

    public void c() {
        this.f4068R = null;
        PopupWindow.OnDismissListener onDismissListener = this.f4067R;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void e(int i, int i2, boolean z, boolean z2) {
        fkQ R = R();
        R.t(z2);
        if (z) {
            int i3 = this.c;
            View view = this.f4066R;
            WeakHashMap weakHashMap = of5.f6887R;
            if ((Gravity.getAbsoluteGravity(i3, eHQ.e(view)) & 7) == 5) {
                i -= this.f4066R.getWidth();
            }
            R.g(i);
            R.i(i2);
            int i4 = (int) ((this.f4065R.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            R.R = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        R.Z();
    }

    public final boolean v() {
        fkQ fkq = this.f4068R;
        return fkq != null && fkq.v();
    }

    public h6s(int i, int i2, Context context, View view, lRG lrg, boolean z) {
        this.c = 8388611;
        this.f4069R = new iCh(this);
        this.f4065R = context;
        this.f4070R = lrg;
        this.f4066R = view;
        this.f4072R = z;
        this.R = i;
        this.v = i2;
    }
}
