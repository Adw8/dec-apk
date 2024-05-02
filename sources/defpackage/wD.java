package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: wD  reason: default package */
/* loaded from: classes.dex */
public final class wD {
    public epC L;
    public epC O;

    /* renamed from: R  reason: collision with other field name */
    public Typeface f7453R;

    /* renamed from: R  reason: collision with other field name */
    public final TextView f7454R;

    /* renamed from: R  reason: collision with other field name */
    public epC f7455R;

    /* renamed from: R  reason: collision with other field name */
    public final z7 f7456R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7457R;
    public epC X;
    public epC c;
    public epC e;

    /* renamed from: v  reason: collision with other field name */
    public epC f7458v;
    public int R = 0;
    public int v = -1;

    public wD(TextView textView) {
        this.f7454R = textView;
        this.f7456R = new z7(textView);
    }

    public static epC c(Context context, pp ppVar, int i) {
        ColorStateList Z;
        synchronized (ppVar) {
            Z = ppVar.f7286R.Z(context, i);
        }
        if (Z == null) {
            return null;
        }
        epC epc = new epC(0);
        epc.f3213v = true;
        epc.R = Z;
        return epc;
    }

    public final void L(Context context, int i) {
        String t;
        CV cv = new CV(context, 2, context.obtainStyledAttributes(i, iTI.J));
        if (cv.o(14)) {
            this.f7454R.setAllCaps(cv.Z(14, false));
        }
        if (cv.o(0) && cv.H(0, -1) == 0) {
            this.f7454R.setTextSize(0, 0.0f);
        }
        x(context, cv);
        if (cv.o(13) && (t = cv.t(13)) != null) {
            mW.e(this.f7454R, t);
        }
        cv.z();
        Typeface typeface = this.f7453R;
        if (typeface != null) {
            this.f7454R.setTypeface(typeface, this.R);
        }
    }

    public final void O(AttributeSet attributeSet, int i) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int resourceId;
        int i5;
        Context context = this.f7454R.getContext();
        pp R = pp.R();
        int[] iArr = iTI.Z;
        CV h = CV.h(context, attributeSet, iArr, i, 0);
        TextView textView = this.f7454R;
        Context context2 = textView.getContext();
        TypedArray typedArray = (TypedArray) h.v;
        WeakHashMap weakHashMap = of5.f6887R;
        hpL.c(textView, context2, iArr, attributeSet, typedArray, i, 0);
        int y = h.y(0, -1);
        if (h.o(3)) {
            this.f7455R = c(context, R, h.y(3, 0));
        }
        if (h.o(1)) {
            this.f7458v = c(context, R, h.y(1, 0));
        }
        if (h.o(4)) {
            this.c = c(context, R, h.y(4, 0));
        }
        if (h.o(2)) {
            this.e = c(context, R, h.y(2, 0));
        }
        if (h.o(5)) {
            this.X = c(context, R, h.y(5, 0));
        }
        if (h.o(6)) {
            this.O = c(context, R, h.y(6, 0));
        }
        h.z();
        boolean z3 = this.f7454R.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (y != -1) {
            CV cv = new CV(context, 2, context.obtainStyledAttributes(y, iTI.J));
            if (z3 || !cv.o(14)) {
                z2 = false;
                z = false;
            } else {
                z2 = cv.Z(14, false);
                z = true;
            }
            x(context, cv);
            if (cv.o(15)) {
                str2 = cv.t(15);
                i5 = 13;
            } else {
                i5 = 13;
                str2 = null;
            }
            str = cv.o(i5) ? cv.t(i5) : null;
            cv.z();
        } else {
            z2 = false;
            z = false;
            str2 = null;
            str = null;
        }
        CV h2 = CV.h(context, attributeSet, iTI.J, i, 0);
        if (!z3 && h2.o(14)) {
            z2 = h2.Z(14, false);
            z = true;
        }
        if (h2.o(15)) {
            str2 = h2.t(15);
        }
        if (h2.o(13)) {
            str = h2.t(13);
        }
        if (h2.o(0) && h2.H(0, -1) == 0) {
            this.f7454R.setTextSize(0, 0.0f);
        }
        x(context, h2);
        h2.z();
        if (!z3 && z) {
            this.f7454R.setAllCaps(z2);
        }
        Typeface typeface = this.f7453R;
        if (typeface != null) {
            if (this.v == -1) {
                this.f7454R.setTypeface(typeface, this.R);
            } else {
                this.f7454R.setTypeface(typeface);
            }
        }
        if (str != null) {
            mW.e(this.f7454R, str);
        }
        if (str2 != null) {
            bM.v(this.f7454R, bM.R(str2));
        }
        z7 z7Var = this.f7456R;
        Context context3 = z7Var.f7494R;
        int[] iArr2 = iTI.m;
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        TextView textView2 = z7Var.f7495R;
        hpL.c(textView2, textView2.getContext(), iArr2, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            z7Var.f7493R = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr3[i6] = obtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                z7Var.f7497R = z7.R(iArr3);
                z7Var.c();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!z7Var.e()) {
            z7Var.f7493R = 0;
        } else if (z7Var.f7493R == 1) {
            if (!z7Var.f7498v) {
                DisplayMetrics displayMetrics = z7Var.f7494R.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z7Var.X(dimension2, dimension3, dimension);
            }
            z7Var.v();
        }
        z7 z7Var2 = this.f7456R;
        if (z7Var2.f7493R != 0) {
            int[] iArr4 = z7Var2.f7497R;
            if (iArr4.length > 0) {
                if (((float) mW.R(this.f7454R)) != -1.0f) {
                    mW.v(this.f7454R, Math.round(this.f7456R.v), Math.round(this.f7456R.c), Math.round(this.f7456R.R), 0);
                } else {
                    mW.c(this.f7454R, iArr4, 0);
                }
            }
        }
        CV Y = CV.Y(context, attributeSet, iTI.m);
        int y2 = Y.y(8, -1);
        Drawable v = y2 != -1 ? R.v(context, y2) : null;
        int y3 = Y.y(13, -1);
        Drawable v2 = y3 != -1 ? R.v(context, y3) : null;
        int y4 = Y.y(9, -1);
        Drawable v3 = y4 != -1 ? R.v(context, y4) : null;
        int y5 = Y.y(6, -1);
        Drawable v4 = y5 != -1 ? R.v(context, y5) : null;
        int y6 = Y.y(10, -1);
        Drawable v5 = y6 != -1 ? R.v(context, y6) : null;
        int y7 = Y.y(7, -1);
        Drawable v6 = y7 != -1 ? R.v(context, y7) : null;
        if (v5 != null || v6 != null) {
            Drawable[] R2 = r3.R(this.f7454R);
            TextView textView3 = this.f7454R;
            if (v5 == null) {
                v5 = R2[0];
            }
            if (v2 == null) {
                v2 = R2[1];
            }
            if (v6 == null) {
                v6 = R2[2];
            }
            if (v4 == null) {
                v4 = R2[3];
            }
            r3.v(textView3, v5, v2, v6, v4);
        } else if (!(v == null && v2 == null && v3 == null && v4 == null)) {
            Drawable[] R3 = r3.R(this.f7454R);
            Drawable drawable = R3[0];
            if (drawable == null && R3[2] == null) {
                Drawable[] compoundDrawables = this.f7454R.getCompoundDrawables();
                TextView textView4 = this.f7454R;
                if (v == null) {
                    v = compoundDrawables[0];
                }
                if (v2 == null) {
                    v2 = compoundDrawables[1];
                }
                if (v3 == null) {
                    v3 = compoundDrawables[2];
                }
                if (v4 == null) {
                    v4 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(v, v2, v3, v4);
            } else {
                TextView textView5 = this.f7454R;
                if (v2 == null) {
                    v2 = R3[1];
                }
                Drawable drawable2 = R3[2];
                if (v4 == null) {
                    v4 = R3[3];
                }
                r3.v(textView5, drawable, v2, drawable2, v4);
            }
        }
        if (Y.o(11)) {
            ColorStateList m = Y.m(11);
            TextView textView6 = this.f7454R;
            textView6.getClass();
            o8J.O(textView6, m);
        }
        if (Y.o(12)) {
            i2 = -1;
            PorterDuff.Mode v7 = mTA.v(Y.P(12, -1), null);
            TextView textView7 = this.f7454R;
            textView7.getClass();
            o8J.L(textView7, v7);
        } else {
            i2 = -1;
        }
        int H = Y.H(15, i2);
        int H2 = Y.H(18, i2);
        int H3 = Y.H(19, i2);
        Y.z();
        if (H != i2) {
            TextView textView8 = this.f7454R;
            gvP.H(H);
            eAv.c(textView8, H);
        }
        if (H2 != i2) {
            TextView textView9 = this.f7454R;
            gvP.H(H2);
            Paint.FontMetricsInt fontMetricsInt = textView9.getPaint().getFontMetricsInt();
            int i7 = nRg.R(textView9) ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (H2 > Math.abs(i7)) {
                textView9.setPadding(textView9.getPaddingLeft(), textView9.getPaddingTop(), textView9.getPaddingRight(), H2 - i7);
            }
            i3 = -1;
        } else {
            i3 = i2;
        }
        if (H3 != i3) {
            TextView textView10 = this.f7454R;
            gvP.H(H3);
            int fontMetricsInt2 = textView10.getPaint().getFontMetricsInt(null);
            if (H3 != fontMetricsInt2) {
                textView10.setLineSpacing((float) (H3 - fontMetricsInt2), 1.0f);
            }
        }
    }

    public final void R(Drawable drawable, epC epc) {
        if (drawable != null && epc != null) {
            pp.e(drawable, epc, this.f7454R.getDrawableState());
        }
    }

    public final PorterDuff.Mode X() {
        epC epc = this.L;
        if (epc != null) {
            return (PorterDuff.Mode) epc.v;
        }
        return null;
    }

    public final void Z(ColorStateList colorStateList) {
        boolean z = false;
        if (this.L == null) {
            this.L = new epC(0);
        }
        epC epc = this.L;
        epc.R = colorStateList;
        if (colorStateList != null) {
            z = true;
        }
        epc.f3213v = z;
        this.f7455R = epc;
        this.f7458v = epc;
        this.c = epc;
        this.e = epc;
        this.X = epc;
        this.O = epc;
    }

    public final ColorStateList e() {
        epC epc = this.L;
        if (epc != null) {
            return (ColorStateList) epc.R;
        }
        return null;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z = false;
        if (this.L == null) {
            this.L = new epC(0);
        }
        epC epc = this.L;
        epc.v = mode;
        if (mode != null) {
            z = true;
        }
        epc.f3212R = z;
        this.f7455R = epc;
        this.f7458v = epc;
        this.c = epc;
        this.e = epc;
        this.X = epc;
        this.O = epc;
    }

    public final void v() {
        if (!(this.f7455R == null && this.f7458v == null && this.c == null && this.e == null)) {
            Drawable[] compoundDrawables = this.f7454R.getCompoundDrawables();
            R(compoundDrawables[0], this.f7455R);
            R(compoundDrawables[1], this.f7458v);
            R(compoundDrawables[2], this.c);
            R(compoundDrawables[3], this.e);
        }
        if (this.X != null || this.O != null) {
            Drawable[] R = r3.R(this.f7454R);
            R(R[0], this.X);
            R(R[2], this.O);
        }
    }

    public final void x(Context context, CV cv) {
        String t;
        this.R = cv.P(2, this.R);
        int P = cv.P(11, -1);
        this.v = P;
        boolean z = false;
        if (P != -1) {
            this.R = (this.R & 2) | 0;
        }
        int i = 10;
        if (cv.o(10) || cv.o(12)) {
            this.f7453R = null;
            if (cv.o(12)) {
                i = 12;
            }
            int i2 = this.v;
            int i3 = this.R;
            if (!context.isRestricted()) {
                try {
                    Typeface N = cv.N(i, this.R, new Lk(this, i2, i3, new WeakReference(this.f7454R)));
                    if (N != null) {
                        if (this.v != -1) {
                            this.f7453R = U3.R(Typeface.create(N, 0), this.v, (this.R & 2) != 0);
                        } else {
                            this.f7453R = N;
                        }
                    }
                    this.f7457R = this.f7453R == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f7453R == null && (t = cv.t(i)) != null) {
                if (this.v != -1) {
                    Typeface create = Typeface.create(t, 0);
                    int i4 = this.v;
                    if ((this.R & 2) != 0) {
                        z = true;
                    }
                    this.f7453R = U3.R(create, i4, z);
                    return;
                }
                this.f7453R = Typeface.create(t, this.R);
            }
        } else if (cv.o(1)) {
            this.f7457R = false;
            int P2 = cv.P(1, 1);
            if (P2 == 1) {
                this.f7453R = Typeface.SANS_SERIF;
            } else if (P2 == 2) {
                this.f7453R = Typeface.SERIF;
            } else if (P2 == 3) {
                this.f7453R = Typeface.MONOSPACE;
            }
        }
    }
}
