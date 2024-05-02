package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: muY  reason: default package */
/* loaded from: classes.dex */
public final class muY implements elR {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public RR f6225R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f6226R;

    /* renamed from: R  reason: collision with other field name */
    public View f6227R;

    /* renamed from: R  reason: collision with other field name */
    public Window.Callback f6228R;

    /* renamed from: R  reason: collision with other field name */
    public Toolbar f6229R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f6230R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6231R;
    public Drawable c;

    /* renamed from: c  reason: collision with other field name */
    public CharSequence f6232c;
    public Drawable e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public Drawable f6233v;

    /* renamed from: v  reason: collision with other field name */
    public CharSequence f6234v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f6235v;

    public muY(Toolbar toolbar) {
        Drawable drawable;
        this.v = 0;
        this.f6229R = toolbar;
        this.f6230R = toolbar.getTitle();
        this.f6234v = toolbar.getSubtitle();
        this.f6231R = this.f6230R != null;
        this.c = toolbar.getNavigationIcon();
        String str = null;
        CV h = CV.h(toolbar.getContext(), null, iTI.f4603R, R.attr.actionBarStyle, 0);
        this.e = h.U(15);
        CharSequence V = h.V(27);
        if (!TextUtils.isEmpty(V)) {
            this.f6231R = true;
            this.f6230R = V;
            if ((this.R & 8) != 0) {
                this.f6229R.setTitle(V);
                if (this.f6231R) {
                    of5.L(this.f6229R.getRootView(), V);
                }
            }
        }
        CharSequence V2 = h.V(25);
        if (!TextUtils.isEmpty(V2)) {
            this.f6234v = V2;
            if ((this.R & 8) != 0) {
                this.f6229R.setSubtitle(V2);
            }
        }
        Drawable U = h.U(20);
        if (U != null) {
            this.f6233v = U;
            c();
        }
        Drawable U2 = h.U(17);
        if (U2 != null) {
            this.f6226R = U2;
            c();
        }
        if (this.c == null && (drawable = this.e) != null) {
            this.c = drawable;
            if ((this.R & 4) != 0) {
                this.f6229R.setNavigationIcon(drawable);
            } else {
                this.f6229R.setNavigationIcon((Drawable) null);
            }
        }
        R(h.P(10, 0));
        int y = h.y(9, 0);
        if (y != 0) {
            View inflate = LayoutInflater.from(this.f6229R.getContext()).inflate(y, (ViewGroup) this.f6229R, false);
            View view = this.f6227R;
            if (!(view == null || (this.R & 16) == 0)) {
                this.f6229R.removeView(view);
            }
            this.f6227R = inflate;
            if (!(inflate == null || (this.R & 16) == 0)) {
                this.f6229R.addView(inflate);
            }
            R(this.R | 16);
        }
        int layoutDimension = ((TypedArray) h.v).getLayoutDimension(13, 0);
        if (layoutDimension > 0) {
            ViewGroup.LayoutParams layoutParams = this.f6229R.getLayoutParams();
            layoutParams.height = layoutDimension;
            this.f6229R.setLayoutParams(layoutParams);
        }
        int x = h.x(7, -1);
        int x2 = h.x(3, -1);
        if (x >= 0 || x2 >= 0) {
            Toolbar toolbar2 = this.f6229R;
            int max = Math.max(x, 0);
            int max2 = Math.max(x2, 0);
            if (toolbar2.f1168R == null) {
                toolbar2.f1168R = new hz9();
            }
            toolbar2.f1168R.R(max, max2);
        }
        int y2 = h.y(28, 0);
        if (y2 != 0) {
            Toolbar toolbar3 = this.f6229R;
            Context context = toolbar3.getContext();
            toolbar3.X = y2;
            TC tc = toolbar3.f1158R;
            if (tc != null) {
                tc.setTextAppearance(context, y2);
            }
        }
        int y3 = h.y(26, 0);
        if (y3 != 0) {
            Toolbar toolbar4 = this.f6229R;
            Context context2 = toolbar4.getContext();
            toolbar4.O = y3;
            TC tc2 = toolbar4.v;
            if (tc2 != null) {
                tc2.setTextAppearance(context2, y3);
            }
        }
        int y4 = h.y(22, 0);
        if (y4 != 0) {
            this.f6229R.setPopupTheme(y4);
        }
        h.z();
        if (R.string.abc_action_bar_up_description != this.v) {
            this.v = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f6229R.getNavigationContentDescription())) {
                int i = this.v;
                this.f6232c = i != 0 ? this.f6229R.getContext().getString(i) : str;
                v();
            }
        }
        this.f6232c = this.f6229R.getNavigationContentDescription();
        this.f6229R.setNavigationOnClickListener(new MX(this));
    }

    public final void R(int i) {
        View view;
        int i2 = this.R ^ i;
        this.R = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    v();
                }
                if ((this.R & 4) != 0) {
                    Toolbar toolbar = this.f6229R;
                    Drawable drawable = this.c;
                    if (drawable == null) {
                        drawable = this.e;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    this.f6229R.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                c();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f6229R.setTitle(this.f6230R);
                    this.f6229R.setSubtitle(this.f6234v);
                } else {
                    this.f6229R.setTitle((CharSequence) null);
                    this.f6229R.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f6227R) != null) {
                if ((i & 16) != 0) {
                    this.f6229R.addView(view);
                } else {
                    this.f6229R.removeView(view);
                }
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.R;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f6233v;
            if (drawable == null) {
                drawable = this.f6226R;
            }
        } else {
            drawable = this.f6226R;
        }
        this.f6229R.setLogo(drawable);
    }

    public final void v() {
        if ((this.R & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f6232c)) {
            this.f6229R.setNavigationContentDescription(this.v);
        } else {
            this.f6229R.setNavigationContentDescription(this.f6232c);
        }
    }
}
