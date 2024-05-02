package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: nje  reason: default package */
/* loaded from: classes.dex */
public final class nje {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public int f6518R;

    /* renamed from: R  reason: collision with other field name */
    public TC f6519R;

    /* renamed from: R  reason: collision with other field name */
    public Animator f6520R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f6521R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f6522R;

    /* renamed from: R  reason: collision with other field name */
    public Typeface f6523R;

    /* renamed from: R  reason: collision with other field name */
    public FrameLayout f6524R;

    /* renamed from: R  reason: collision with other field name */
    public LinearLayout f6525R;

    /* renamed from: R  reason: collision with other field name */
    public final TextInputLayout f6526R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f6527R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6528R;
    public int X;
    public int c;

    /* renamed from: c  reason: collision with other field name */
    public CharSequence f6529c;
    public int e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public TC f6530v;

    /* renamed from: v  reason: collision with other field name */
    public ColorStateList f6531v;

    /* renamed from: v  reason: collision with other field name */
    public CharSequence f6532v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f6533v;

    public nje(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f6521R = context;
        this.f6526R = textInputLayout;
        this.R = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void L(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f6525R;
        if (linearLayout != null) {
            boolean z = true;
            if (!(i == 0 || i == 1)) {
                z = false;
            }
            if (!z || (frameLayout = this.f6524R) == null) {
                linearLayout.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.f6518R - 1;
            this.f6518R = i2;
            LinearLayout linearLayout2 = this.f6525R;
            if (i2 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final void O() {
        this.f6527R = null;
        c();
        if (this.v == 1) {
            if (!this.f6533v || TextUtils.isEmpty(this.f6529c)) {
                this.c = 0;
            } else {
                this.c = 2;
            }
        }
        m(this.v, this.c, Z(this.f6519R, ""));
    }

    public final void R(TextView textView, int i) {
        if (this.f6525R == null && this.f6524R == null) {
            LinearLayout linearLayout = new LinearLayout(this.f6521R);
            this.f6525R = linearLayout;
            linearLayout.setOrientation(0);
            this.f6526R.addView(this.f6525R, -1, -2);
            this.f6524R = new FrameLayout(this.f6521R);
            this.f6525R.addView(this.f6524R, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f6526R.getEditText() != null) {
                v();
            }
        }
        if (i == 0 || i == 1) {
            this.f6524R.setVisibility(0);
            this.f6524R.addView(textView);
        } else {
            this.f6525R.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f6525R.setVisibility(0);
        this.f6518R++;
    }

    public final TextView X(int i) {
        if (i == 1) {
            return this.f6519R;
        }
        if (i != 2) {
            return null;
        }
        return this.f6530v;
    }

    public final boolean Z(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f6526R;
        WeakHashMap weakHashMap = of5.f6887R;
        return d6y.c(textInputLayout) && this.f6526R.isEnabled() && (this.c != this.v || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public final void c() {
        Animator animator = this.f6520R;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void e(ArrayList arrayList, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, i3 == i ? 1.0f : 0.0f);
                ofFloat.setDuration(167L);
                ofFloat.setInterpolator(My.f298R);
                arrayList.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.R, 0.0f);
                    ofFloat2.setDuration(217L);
                    ofFloat2.setInterpolator(My.f299R);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final void m(int i, int i2, boolean z) {
        TextView X;
        TextView X2;
        if (i != i2) {
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f6520R = animatorSet;
                ArrayList arrayList = new ArrayList();
                e(arrayList, this.f6533v, this.f6530v, 2, i, i2);
                e(arrayList, this.f6528R, this.f6519R, 1, i, i2);
                hDC.Q(animatorSet, arrayList);
                animatorSet.addListener(new aGm(this, i2, X(i), i, X(i2)));
                animatorSet.start();
            } else if (i != i2) {
                if (!(i2 == 0 || (X2 = X(i2)) == null)) {
                    X2.setVisibility(0);
                    X2.setAlpha(1.0f);
                }
                if (!(i == 0 || (X = X(i)) == null)) {
                    X.setVisibility(4);
                    if (i == 1) {
                        X.setText((CharSequence) null);
                    }
                }
                this.v = i2;
            }
            this.f6526R.j();
            this.f6526R.t(z, false);
            this.f6526R.o();
        }
    }

    public final void v() {
        if ((this.f6525R == null || this.f6526R.getEditText() == null) ? false : true) {
            EditText editText = this.f6526R.getEditText();
            boolean N = lTs.N(this.f6521R);
            LinearLayout linearLayout = this.f6525R;
            WeakHashMap weakHashMap = of5.f6887R;
            int O = eHQ.O(editText);
            if (N) {
                O = this.f6521R.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = this.f6521R.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (N) {
                dimensionPixelSize = this.f6521R.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int X = eHQ.X(editText);
            if (N) {
                X = this.f6521R.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            eHQ.H(linearLayout, O, dimensionPixelSize, X, 0);
        }
    }
}
