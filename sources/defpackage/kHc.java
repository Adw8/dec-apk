package defpackage;

import android.view.View;
import android.view.ViewParent;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* renamed from: kHc  reason: default package */
/* loaded from: classes.dex */
public final class kHc {
    public static final WeakHashMap R = new WeakHashMap();
    public final y3 L;

    /* renamed from: R  reason: collision with other field name */
    public int f5235R;

    /* renamed from: R  reason: collision with other field name */
    public final dq8 f5236R;

    /* renamed from: R  reason: collision with other field name */
    public final n6E f5237R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5239R;
    public final y3 Z;

    /* renamed from: c  reason: collision with other field name */
    public final y3 f5241c;

    /* renamed from: e  reason: collision with other field name */
    public final y3 f5242e;
    public final y3 m;

    /* renamed from: v  reason: collision with other field name */
    public final y3 f5243v;

    /* renamed from: R  reason: collision with other field name */
    public final y3 f5238R = f1A.v(4, "captionBar");

    /* renamed from: X  reason: collision with other field name */
    public final y3 f5240X = f1A.v(2, "navigationBars");

    /* renamed from: O  reason: collision with other field name */
    public final y3 f5234O = f1A.v(1, "statusBars");
    public final dq8 v = f1A.c(4, "captionBarIgnoringVisibility");
    public final dq8 c = f1A.c(2, "navigationBarsIgnoringVisibility");
    public final dq8 e = f1A.c(1, "statusBarsIgnoringVisibility");
    public final dq8 X = f1A.c(7, "systemBarsIgnoringVisibility");
    public final dq8 O = f1A.c(64, "tappableElementIgnoringVisibility");

    static {
        new f1A(5, 0);
    }

    public kHc(View view) {
        y3 v = f1A.v(128, "displayCutout");
        this.f5243v = v;
        y3 v2 = f1A.v(8, "ime");
        this.f5241c = v2;
        y3 v3 = f1A.v(32, "mandatorySystemGestures");
        this.f5242e = v3;
        boolean z = true;
        y3 v4 = f1A.v(7, "systemBars");
        this.L = v4;
        y3 v5 = f1A.v(16, "systemGestures");
        this.Z = v5;
        y3 v6 = f1A.v(64, "tappableElement");
        this.m = v6;
        dq8 dq8 = new dq8(new g2o(0, 0, 0, 0), "waterfall");
        this.f5236R = dq8;
        new pwr(new pwr(v4, v2), v);
        new pwr(new pwr(new pwr(v6, v3), v5), dq8);
        ViewParent parent = view.getParent();
        Boolean bool = null;
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        bool = tag instanceof Boolean ? (Boolean) tag : bool;
        this.f5239R = bool != null ? bool.booleanValue() : z;
        this.f5237R = new n6E(this);
    }

    public final void R(gWM gwm, int i) {
        this.f5238R.O(gwm, i);
        this.f5241c.O(gwm, i);
        this.f5243v.O(gwm, i);
        this.f5240X.O(gwm, i);
        this.f5234O.O(gwm, i);
        this.L.O(gwm, i);
        this.Z.O(gwm, i);
        this.m.O(gwm, i);
        this.f5242e.O(gwm, i);
        if (i == 0) {
            this.v.O(ooA.K(gwm.v(4)));
            this.c.O(ooA.K(gwm.v(2)));
            this.e.O(ooA.K(gwm.v(1)));
            this.X.O(ooA.K(gwm.v(7)));
            this.O.O(ooA.K(gwm.v(64)));
            dzX X = gwm.f3779R.X();
            if (X != null) {
                this.f5236R.O(ooA.K(ojk.c(j4s.v(X.R))));
            }
        }
        ift.H();
    }
}
