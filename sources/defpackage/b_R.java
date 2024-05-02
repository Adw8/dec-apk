package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: b_R  reason: default package */
/* loaded from: classes.dex */
public final class b_R extends aH9 implements ZG {
    public static final AccelerateInterpolator R = new AccelerateInterpolator();

    /* renamed from: R  reason: collision with other field name */
    public static final DecelerateInterpolator f1729R = new DecelerateInterpolator();
    public boolean L;

    /* renamed from: R  reason: collision with other field name */
    public Context f1731R;

    /* renamed from: R  reason: collision with other field name */
    public View f1732R;

    /* renamed from: R  reason: collision with other field name */
    public ActionBarContainer f1733R;

    /* renamed from: R  reason: collision with other field name */
    public ActionBarContextView f1734R;

    /* renamed from: R  reason: collision with other field name */
    public ActionBarOverlayLayout f1735R;

    /* renamed from: R  reason: collision with other field name */
    public eY0 f1736R;

    /* renamed from: R  reason: collision with other field name */
    public elR f1737R;

    /* renamed from: R  reason: collision with other field name */
    public hYl f1740R;

    /* renamed from: R  reason: collision with other field name */
    public kH f1742R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1743R;
    public boolean X;
    public boolean Z;
    public boolean e;
    public Context v;

    /* renamed from: v  reason: collision with other field name */
    public eY0 f1744v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1746v;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f1741R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public int f1730R = 0;
    public boolean c = true;
    public boolean O = true;

    /* renamed from: R  reason: collision with other field name */
    public final gPX f1738R = new gPX(this, 0);

    /* renamed from: v  reason: collision with other field name */
    public final gPX f1745v = new gPX(this, 1);

    /* renamed from: R  reason: collision with other field name */
    public final h89 f1739R = new h89(0, this);

    public b_R(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        yG(decorView);
        if (!z) {
            this.f1732R = decorView.findViewById(16908290);
        }
    }

    public final void Kl(boolean z) {
        ozg ozg;
        ozg ozg2;
        if (z) {
            if (!this.X) {
                this.X = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1735R;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                WD(false);
            }
        } else if (this.X) {
            this.X = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1735R;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            WD(false);
        }
        ActionBarContainer actionBarContainer = this.f1733R;
        WeakHashMap weakHashMap = of5.f6887R;
        if (d6y.c(actionBarContainer)) {
            if (z) {
                muY muy = (muY) this.f1737R;
                ozg2 = of5.R(muy.f6229R);
                ozg2.R(0.0f);
                ozg2.c(100);
                ozg2.e(new fGk(muy, 4));
                ozg = this.f1734R.U(200, 0);
            } else {
                muY muy2 = (muY) this.f1737R;
                ozg R2 = of5.R(muy2.f6229R);
                R2.R(1.0f);
                R2.c(200);
                R2.e(new fGk(muy2, 0));
                ozg2 = this.f1734R.U(100, 8);
                ozg = R2;
            }
            hYl hyl = new hYl();
            hyl.f4300R.add(ozg2);
            View view = (View) ozg2.R.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) ozg.R.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            hyl.f4300R.add(ozg);
            hyl.v();
        } else if (z) {
            ((muY) this.f1737R).f6229R.setVisibility(4);
            this.f1734R.setVisibility(0);
        } else {
            ((muY) this.f1737R).f6229R.setVisibility(0);
            this.f1734R.setVisibility(8);
        }
    }

    public final void WD(boolean z) {
        View view;
        View view2;
        View view3;
        hjh hjh = null;
        if (this.X || !this.e) {
            if (!this.O) {
                this.O = true;
                hYl hyl = this.f1740R;
                if (hyl != null) {
                    hyl.R();
                }
                this.f1733R.setVisibility(0);
                if (this.f1730R != 0 || (!this.L && !z)) {
                    this.f1733R.setAlpha(1.0f);
                    this.f1733R.setTranslationY(0.0f);
                    if (this.c && (view2 = this.f1732R) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.f1745v.R();
                } else {
                    this.f1733R.setTranslationY(0.0f);
                    float f = (float) (-this.f1733R.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        this.f1733R.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f1733R.setTranslationY(f);
                    hYl hyl2 = new hYl();
                    ozg R2 = of5.R(this.f1733R);
                    R2.X(0.0f);
                    h89 h89 = this.f1739R;
                    View view4 = (View) R2.R.get();
                    if (view4 != null) {
                        if (h89 != null) {
                            hjh = new ValueAnimator.AnimatorUpdateListener(view4) { // from class: hjh
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ((View) ((b_R) h89.this.R).f1733R.getParent()).invalidate();
                                }
                            };
                        }
                        byW.R(view4.animate(), hjh);
                    }
                    if (!hyl2.f4301R) {
                        hyl2.f4300R.add(R2);
                    }
                    if (this.c && (view3 = this.f1732R) != null) {
                        view3.setTranslationY(f);
                        ozg R3 = of5.R(this.f1732R);
                        R3.X(0.0f);
                        if (!hyl2.f4301R) {
                            hyl2.f4300R.add(R3);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = f1729R;
                    boolean z2 = hyl2.f4301R;
                    if (!z2) {
                        hyl2.f4297R = decelerateInterpolator;
                    }
                    if (!z2) {
                        hyl2.R = 250;
                    }
                    gPX gpx = this.f1745v;
                    if (!z2) {
                        hyl2.f4298R = gpx;
                    }
                    this.f1740R = hyl2;
                    hyl2.v();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1735R;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = of5.f6887R;
                    fv7.c(actionBarOverlayLayout);
                }
            }
        } else if (this.O) {
            this.O = false;
            hYl hyl3 = this.f1740R;
            if (hyl3 != null) {
                hyl3.R();
            }
            if (this.f1730R != 0 || (!this.L && !z)) {
                this.f1738R.R();
                return;
            }
            this.f1733R.setAlpha(1.0f);
            this.f1733R.setTransitioning(true);
            hYl hyl4 = new hYl();
            float f2 = (float) (-this.f1733R.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                this.f1733R.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            ozg R4 = of5.R(this.f1733R);
            R4.X(f2);
            h89 h892 = this.f1739R;
            View view5 = (View) R4.R.get();
            if (view5 != null) {
                if (h892 != null) {
                    hjh = new ValueAnimator.AnimatorUpdateListener(view5) { // from class: hjh
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((b_R) h89.this.R).f1733R.getParent()).invalidate();
                        }
                    };
                }
                byW.R(view5.animate(), hjh);
            }
            if (!hyl4.f4301R) {
                hyl4.f4300R.add(R4);
            }
            if (this.c && (view = this.f1732R) != null) {
                ozg R5 = of5.R(view);
                R5.X(f2);
                if (!hyl4.f4301R) {
                    hyl4.f4300R.add(R5);
                }
            }
            AccelerateInterpolator accelerateInterpolator = R;
            boolean z3 = hyl4.f4301R;
            if (!z3) {
                hyl4.f4297R = accelerateInterpolator;
            }
            if (!z3) {
                hyl4.R = 250;
            }
            gPX gpx2 = this.f1738R;
            if (!z3) {
                hyl4.f4298R = gpx2;
            }
            this.f1740R = hyl4;
            hyl4.v();
        }
    }

    public final void mZ(boolean z) {
        if (z != this.f1746v) {
            this.f1746v = z;
            int size = this.f1741R.size();
            for (int i = 0; i < size; i++) {
                ((Hr) this.f1741R.get(i)).R();
            }
        }
    }

    public final Context pG() {
        if (this.v == null) {
            TypedValue typedValue = new TypedValue();
            this.f1731R.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.v = new ContextThemeWrapper(this.f1731R, i);
            } else {
                this.v = this.f1731R;
            }
        }
        return this.v;
    }

    public final void wm(boolean z) {
        if (!z) {
            ((muY) this.f1737R).getClass();
            this.f1733R.setTabContainer(null);
        } else {
            this.f1733R.setTabContainer(null);
            ((muY) this.f1737R).getClass();
        }
        this.f1737R.getClass();
        ((muY) this.f1737R).f6229R.setCollapsible(false);
        this.f1735R.setHasNonEmbeddedTabs(false);
    }

    public final void yG(View view) {
        elR elr;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f1735R = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof elR) {
            elr = (elR) findViewById;
        } else if (findViewById instanceof Toolbar) {
            elr = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder U = opT.U("Can't make a decor toolbar out of ");
            U.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(U.toString());
        }
        this.f1737R = elr;
        this.f1734R = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f1733R = actionBarContainer;
        elR elr2 = this.f1737R;
        if (elr2 == null || this.f1734R == null || actionBarContainer == null) {
            throw new IllegalStateException(b_R.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        Context context = ((muY) elr2).f6229R.getContext();
        this.f1731R = context;
        if ((((muY) this.f1737R).R & 4) != 0) {
            this.f1743R = true;
        }
        gL6 gl6 = new gL6(1, context);
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f1737R.getClass();
        wm(((Context) gl6.R).getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f1731R.obtainStyledAttributes(null, iTI.f4603R, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1735R;
            if (actionBarOverlayLayout2.f1084v) {
                this.Z = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f1733R;
            WeakHashMap weakHashMap = of5.f6887R;
            m18.t(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public b_R(Dialog dialog) {
        new ArrayList();
        yG(dialog.getWindow().getDecorView());
    }
}
