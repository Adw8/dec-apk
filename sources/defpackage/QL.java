package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.WeakHashMap;

/* renamed from: QL  reason: default package */
/* loaded from: classes.dex */
public final class QL {
    public float C;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;

    /* renamed from: L  reason: collision with other field name */
    public Typeface f429L;
    public float N;
    public float O;

    /* renamed from: O  reason: collision with other field name */
    public Typeface f431O;
    public float P;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public int f432R;

    /* renamed from: R  reason: collision with other field name */
    public N5 f433R;

    /* renamed from: R  reason: collision with other field name */
    public TimeInterpolator f434R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f435R;

    /* renamed from: R  reason: collision with other field name */
    public Bitmap f436R;

    /* renamed from: R  reason: collision with other field name */
    public Typeface f439R;

    /* renamed from: R  reason: collision with other field name */
    public StaticLayout f440R;

    /* renamed from: R  reason: collision with other field name */
    public final TextPaint f441R;

    /* renamed from: R  reason: collision with other field name */
    public final View f443R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f444R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f445R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f446R;
    public float U;
    public float V;

    /* renamed from: X  reason: collision with other field name */
    public int f447X;

    /* renamed from: X  reason: collision with other field name */
    public Typeface f448X;
    public float Y;
    public float Z;
    public float c;

    /* renamed from: c  reason: collision with other field name */
    public ColorStateList f450c;

    /* renamed from: c  reason: collision with other field name */
    public Typeface f451c;

    /* renamed from: c  reason: collision with other field name */
    public CharSequence f452c;

    /* renamed from: e  reason: collision with other field name */
    public int f454e;

    /* renamed from: e  reason: collision with other field name */
    public ColorStateList f455e;

    /* renamed from: e  reason: collision with other field name */
    public Typeface f456e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f457e;
    public float g;
    public float h;
    public float i;
    public float j;
    public float m;
    public float o;
    public float t;
    public float u;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public N5 f459v;

    /* renamed from: v  reason: collision with other field name */
    public TimeInterpolator f460v;

    /* renamed from: v  reason: collision with other field name */
    public ColorStateList f461v;

    /* renamed from: v  reason: collision with other field name */
    public Typeface f463v;

    /* renamed from: v  reason: collision with other field name */
    public final TextPaint f464v;

    /* renamed from: v  reason: collision with other field name */
    public CharSequence f465v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f466v;
    public float x;
    public float y;

    /* renamed from: v  reason: collision with other field name */
    public int f458v = 16;

    /* renamed from: c  reason: collision with other field name */
    public int f449c = 16;
    public float e = 15.0f;
    public float X = 15.0f;

    /* renamed from: R  reason: collision with other field name */
    public TextUtils.TruncateAt f442R = TextUtils.TruncateAt.END;

    /* renamed from: c  reason: collision with other field name */
    public boolean f453c = true;

    /* renamed from: O  reason: collision with other field name */
    public int f430O = 1;
    public float z = 0.0f;
    public float n = 1.0f;

    /* renamed from: L  reason: collision with other field name */
    public int f428L = 1;

    /* renamed from: v  reason: collision with other field name */
    public final Rect f462v = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public final Rect f437R = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public final RectF f438R = new RectF();

    public QL(View view) {
        this.f443R = view;
        TextPaint textPaint = new TextPaint(129);
        this.f441R = textPaint;
        this.f464v = new TextPaint(textPaint);
        float f = this.v;
        this.c = jQ.v(1.0f, f, 0.5f, f);
        Z(view.getContext().getResources().getConfiguration());
    }

    public static float L(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        LinearInterpolator linearInterpolator = My.f298R;
        return jQ.v(f2, f, f3, f);
    }

    public static int R(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((((float) Color.alpha(i2)) * f) + (((float) Color.alpha(i)) * f2)), Math.round((((float) Color.red(i2)) * f) + (((float) Color.red(i)) * f2)), Math.round((((float) Color.green(i2)) * f) + (((float) Color.green(i)) * f2)), Math.round((((float) Color.blue(i2)) * f) + (((float) Color.blue(i)) * f2)));
    }

    public final boolean C(Typeface typeface) {
        N5 n5 = this.f459v;
        if (n5 != null) {
            n5.f309R = true;
        }
        if (this.f451c == typeface) {
            return false;
        }
        this.f451c = typeface;
        Typeface h = vd.h(this.f443R.getContext().getResources().getConfiguration(), typeface);
        this.f463v = h;
        if (h == null) {
            h = this.f451c;
        }
        this.f439R = h;
        return true;
    }

    public final void H(ColorStateList colorStateList) {
        if (this.f461v != colorStateList) {
            this.f461v = colorStateList;
            m(false);
        }
    }

    public final void N(int i) {
        cod cod = new cod(this.f443R.getContext(), i);
        ColorStateList colorStateList = cod.f2202v;
        if (colorStateList != null) {
            this.f435R = colorStateList;
        }
        float f = cod.X;
        if (f != 0.0f) {
            this.e = f;
        }
        ColorStateList colorStateList2 = cod.f2196R;
        if (colorStateList2 != null) {
            this.f455e = colorStateList2;
        }
        this.V = cod.R;
        this.o = cod.v;
        this.i = cod.c;
        this.J = cod.e;
        N5 n5 = this.f433R;
        if (n5 != null) {
            n5.f309R = true;
        }
        h89 h89 = new h89(21, this);
        cod.R();
        this.f433R = new N5(h89, cod.f2197R);
        cod.c(this.f443R.getContext(), this.f433R);
        m(false);
    }

    public final int O(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f446R;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final boolean P(Typeface typeface) {
        N5 n5 = this.f433R;
        if (n5 != null) {
            n5.f309R = true;
        }
        if (this.f431O == typeface) {
            return false;
        }
        this.f431O = typeface;
        Typeface h = vd.h(this.f443R.getContext().getResources().getConfiguration(), typeface);
        this.f448X = h;
        if (h == null) {
            h = this.f431O;
        }
        this.f456e = h;
        return true;
    }

    public final void U(int i) {
        if (this.f449c != i) {
            this.f449c = i;
            m(false);
        }
    }

    public final float X() {
        TextPaint textPaint = this.f464v;
        textPaint.setTextSize(this.X);
        textPaint.setTypeface(this.f439R);
        textPaint.setLetterSpacing(this.K);
        return -this.f464v.ascent();
    }

    public final void Z(Configuration configuration) {
        Typeface typeface = this.f451c;
        if (typeface != null) {
            this.f463v = vd.h(configuration, typeface);
        }
        Typeface typeface2 = this.f431O;
        if (typeface2 != null) {
            this.f448X = vd.h(configuration, typeface2);
        }
        Typeface typeface3 = this.f463v;
        if (typeface3 == null) {
            typeface3 = this.f451c;
        }
        this.f439R = typeface3;
        Typeface typeface4 = this.f448X;
        if (typeface4 == null) {
            typeface4 = this.f431O;
        }
        this.f456e = typeface4;
        m(true);
    }

    public final void c(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        if (this.f444R != null) {
            float width = (float) this.f462v.width();
            float width2 = (float) this.f437R.width();
            if (Math.abs(f - 1.0f) < 1.0E-5f) {
                f3 = this.X;
                f2 = this.K;
                this.U = 1.0f;
                typeface = this.f439R;
            } else {
                f3 = this.e;
                f2 = this.J;
                typeface = this.f456e;
                if (Math.abs(f - 0.0f) < 1.0E-5f) {
                    this.U = 1.0f;
                } else {
                    this.U = L(this.e, this.X, f, this.f460v) / this.e;
                }
                float f4 = this.X / this.e;
                width = (!z && width2 * f4 > width) ? Math.min(width / f4, width2) : width2;
            }
            if (width > 0.0f) {
                boolean z3 = this.C != f3;
                boolean z4 = this.Y != f2;
                boolean z5 = this.f429L != typeface;
                StaticLayout staticLayout2 = this.f440R;
                boolean z6 = z3 || z4 || (staticLayout2 != null && (width > ((float) staticLayout2.getWidth()) ? 1 : (width == ((float) staticLayout2.getWidth()) ? 0 : -1)) != 0) || z5 || this.f457e;
                this.C = f3;
                this.Y = f2;
                this.f429L = typeface;
                this.f457e = false;
                this.f441R.setLinearText(this.U != 1.0f);
                z2 = z6;
            } else {
                z2 = false;
            }
            if (this.f465v == null || z2) {
                this.f441R.setTextSize(this.C);
                this.f441R.setTypeface(this.f429L);
                this.f441R.setLetterSpacing(this.Y);
                boolean v = v(this.f444R);
                this.f466v = v;
                int i = this.f430O;
                if (!(i > 1 && (!v || this.f445R))) {
                    i = 1;
                }
                try {
                    if (i == 1) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        int absoluteGravity = Gravity.getAbsoluteGravity(this.f458v, v ? 1 : 0) & 7;
                        alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f466v ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f466v ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
                    }
                    e_A e_a = new e_A((int) width, this.f441R, this.f444R);
                    e_a.f3143R = this.f442R;
                    e_a.f3147v = v;
                    e_a.f3141R = alignment;
                    e_a.f3145R = false;
                    e_a.c = i;
                    float f5 = this.z;
                    float f6 = this.n;
                    e_a.R = f5;
                    e_a.v = f6;
                    e_a.e = this.f428L;
                    staticLayout = e_a.R();
                } catch (crb e) {
                    Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                    staticLayout = null;
                }
                staticLayout.getClass();
                this.f440R = staticLayout;
                this.f465v = staticLayout.getText();
            }
        }
    }

    public final void e(Canvas canvas) {
        int save = canvas.save();
        if (this.f465v != null && this.f438R.width() > 0.0f && this.f438R.height() > 0.0f) {
            this.f441R.setTextSize(this.C);
            float f = this.x;
            float f2 = this.H;
            float f3 = this.U;
            if (f3 != 1.0f && !this.f445R) {
                canvas.scale(f3, f3, f, f2);
            }
            boolean z = true;
            if (this.f430O <= 1 || (this.f466v && !this.f445R)) {
                z = false;
            }
            if (!z || (this.f445R && this.R <= this.c)) {
                canvas.translate(f, f2);
                this.f440R.draw(canvas);
            } else {
                float lineStart = this.x - ((float) this.f440R.getLineStart(0));
                int alpha = this.f441R.getAlpha();
                canvas.translate(lineStart, f2);
                float f4 = (float) alpha;
                this.f441R.setAlpha((int) (this.u * f4));
                TextPaint textPaint = this.f441R;
                float f5 = this.N;
                float f6 = this.P;
                float f7 = this.j;
                int i = this.f447X;
                textPaint.setShadowLayer(f5, f6, f7, B7.c(i, (Color.alpha(i) * textPaint.getAlpha()) / 255));
                this.f440R.draw(canvas);
                this.f441R.setAlpha((int) (this.I * f4));
                TextPaint textPaint2 = this.f441R;
                float f8 = this.N;
                float f9 = this.P;
                float f10 = this.j;
                int i2 = this.f447X;
                textPaint2.setShadowLayer(f8, f9, f10, B7.c(i2, (Color.alpha(i2) * textPaint2.getAlpha()) / 255));
                int lineBaseline = this.f440R.getLineBaseline(0);
                CharSequence charSequence = this.f452c;
                float f11 = (float) lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, this.f441R);
                this.f441R.setShadowLayer(this.N, this.P, this.j, this.f447X);
                if (!this.f445R) {
                    String trim = this.f452c.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    this.f441R.setAlpha(alpha);
                    canvas.drawText(trim, 0, Math.min(this.f440R.getLineEnd(0), trim.length()), 0.0f, f11, (Paint) this.f441R);
                }
            }
            canvas.restoreToCount(save);
        }
    }

    public final void g(float f) {
        c(f, false);
        View view = this.f443R;
        WeakHashMap weakHashMap = of5.f6887R;
        mHC.H(view);
    }

    public final void j(float f) {
        float f2;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.R) {
            this.R = f;
            if (this.f445R) {
                this.f438R.set(f < this.c ? this.f437R : this.f462v);
            } else {
                this.f438R.left = L((float) this.f437R.left, (float) this.f462v.left, f, this.f434R);
                this.f438R.top = L(this.O, this.L, f, this.f434R);
                this.f438R.right = L((float) this.f437R.right, (float) this.f462v.right, f, this.f434R);
                this.f438R.bottom = L((float) this.f437R.bottom, (float) this.f462v.bottom, f, this.f434R);
            }
            if (!this.f445R) {
                this.x = L(this.Z, this.m, f, this.f434R);
                this.H = L(this.O, this.L, f, this.f434R);
                g(f);
                f2 = f;
            } else if (f < this.c) {
                this.x = this.Z;
                this.H = this.O;
                g(0.0f);
                f2 = 0.0f;
            } else {
                this.x = this.m;
                this.H = this.L - ((float) Math.max(0, this.f432R));
                g(1.0f);
                f2 = 1.0f;
            }
            lUH luh = My.f300R;
            this.I = 1.0f - L(0.0f, 1.0f, 1.0f - f, luh);
            View view = this.f443R;
            WeakHashMap weakHashMap = of5.f6887R;
            mHC.H(view);
            this.u = L(1.0f, 0.0f, f, luh);
            mHC.H(this.f443R);
            ColorStateList colorStateList = this.f461v;
            ColorStateList colorStateList2 = this.f435R;
            if (colorStateList != colorStateList2) {
                this.f441R.setColor(R(O(colorStateList2), O(this.f461v), f2));
            } else {
                this.f441R.setColor(O(colorStateList));
            }
            float f3 = this.K;
            float f4 = this.J;
            if (f3 != f4) {
                this.f441R.setLetterSpacing(L(f4, f3, f, luh));
            } else {
                this.f441R.setLetterSpacing(f3);
            }
            this.N = L(this.i, this.g, f, null);
            this.P = L(this.V, this.y, f, null);
            this.j = L(this.o, this.t, f, null);
            int R = R(O(this.f455e), O(this.f450c), f);
            this.f447X = R;
            this.f441R.setShadowLayer(this.N, this.P, this.j, R);
            if (this.f445R) {
                int alpha = this.f441R.getAlpha();
                float f5 = this.c;
                this.f441R.setAlpha((int) ((f <= f5 ? My.R(1.0f, 0.0f, this.v, f5, f) : My.R(0.0f, 1.0f, f5, 1.0f, f)) * ((float) alpha)));
            }
            mHC.H(this.f443R);
        }
    }

    public final void m(boolean z) {
        float f;
        float f2;
        StaticLayout staticLayout;
        if ((this.f443R.getHeight() > 0 && this.f443R.getWidth() > 0) || z) {
            c(1.0f, z);
            CharSequence charSequence = this.f465v;
            if (!(charSequence == null || (staticLayout = this.f440R) == null)) {
                this.f452c = TextUtils.ellipsize(charSequence, this.f441R, (float) staticLayout.getWidth(), this.f442R);
            }
            CharSequence charSequence2 = this.f452c;
            if (charSequence2 != null) {
                this.h = this.f441R.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.h = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f449c, this.f466v ? 1 : 0);
            int i = absoluteGravity & 112;
            if (i == 48) {
                this.L = (float) this.f462v.top;
            } else if (i != 80) {
                this.L = ((float) this.f462v.centerY()) - ((this.f441R.descent() - this.f441R.ascent()) / 2.0f);
            } else {
                this.L = this.f441R.ascent() + ((float) this.f462v.bottom);
            }
            int i2 = absoluteGravity & 8388615;
            if (i2 == 1) {
                this.m = ((float) this.f462v.centerX()) - (this.h / 2.0f);
            } else if (i2 != 5) {
                this.m = (float) this.f462v.left;
            } else {
                this.m = ((float) this.f462v.right) - this.h;
            }
            c(0.0f, z);
            StaticLayout staticLayout2 = this.f440R;
            float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
            StaticLayout staticLayout3 = this.f440R;
            if (staticLayout3 == null || this.f430O <= 1) {
                CharSequence charSequence3 = this.f465v;
                f = charSequence3 != null ? this.f441R.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
            } else {
                f = (float) staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.f440R;
            this.f454e = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f458v, this.f466v ? 1 : 0);
            int i3 = absoluteGravity2 & 112;
            if (i3 == 48) {
                this.O = (float) this.f437R.top;
            } else if (i3 != 80) {
                this.O = ((float) this.f437R.centerY()) - (height / 2.0f);
            } else {
                this.O = this.f441R.descent() + (((float) this.f437R.bottom) - height);
            }
            int i4 = absoluteGravity2 & 8388615;
            if (i4 == 1) {
                this.Z = ((float) this.f437R.centerX()) - (f / 2.0f);
            } else if (i4 != 5) {
                this.Z = (float) this.f437R.left;
            } else {
                this.Z = ((float) this.f437R.right) - f;
            }
            Bitmap bitmap = this.f436R;
            if (bitmap != null) {
                bitmap.recycle();
                this.f436R = null;
            }
            g(this.R);
            float f3 = this.R;
            if (this.f445R) {
                this.f438R.set(f3 < this.c ? this.f437R : this.f462v);
            } else {
                this.f438R.left = L((float) this.f437R.left, (float) this.f462v.left, f3, this.f434R);
                this.f438R.top = L(this.O, this.L, f3, this.f434R);
                this.f438R.right = L((float) this.f437R.right, (float) this.f462v.right, f3, this.f434R);
                this.f438R.bottom = L((float) this.f437R.bottom, (float) this.f462v.bottom, f3, this.f434R);
            }
            if (!this.f445R) {
                this.x = L(this.Z, this.m, f3, this.f434R);
                this.H = L(this.O, this.L, f3, this.f434R);
                g(f3);
                f2 = f3;
            } else if (f3 < this.c) {
                this.x = this.Z;
                this.H = this.O;
                g(0.0f);
                f2 = 0.0f;
            } else {
                this.x = this.m;
                this.H = this.L - ((float) Math.max(0, this.f432R));
                g(1.0f);
                f2 = 1.0f;
            }
            lUH luh = My.f300R;
            this.I = 1.0f - L(0.0f, 1.0f, 1.0f - f3, luh);
            View view = this.f443R;
            WeakHashMap weakHashMap = of5.f6887R;
            mHC.H(view);
            this.u = L(1.0f, 0.0f, f3, luh);
            mHC.H(this.f443R);
            ColorStateList colorStateList = this.f461v;
            ColorStateList colorStateList2 = this.f435R;
            if (colorStateList != colorStateList2) {
                this.f441R.setColor(R(O(colorStateList2), O(this.f461v), f2));
            } else {
                this.f441R.setColor(O(colorStateList));
            }
            float f4 = this.K;
            float f5 = this.J;
            if (f4 != f5) {
                this.f441R.setLetterSpacing(L(f5, f4, f3, luh));
            } else {
                this.f441R.setLetterSpacing(f4);
            }
            this.N = L(this.i, this.g, f3, null);
            this.P = L(this.V, this.y, f3, null);
            this.j = L(this.o, this.t, f3, null);
            int R = R(O(this.f455e), O(this.f450c), f3);
            this.f447X = R;
            this.f441R.setShadowLayer(this.N, this.P, this.j, R);
            if (this.f445R) {
                int alpha = this.f441R.getAlpha();
                float f6 = this.c;
                this.f441R.setAlpha((int) ((f3 <= f6 ? My.R(1.0f, 0.0f, this.v, f6, f3) : My.R(0.0f, 1.0f, f6, 1.0f, f3)) * ((float) alpha)));
            }
            mHC.H(this.f443R);
        }
    }

    public final boolean v(CharSequence charSequence) {
        View view = this.f443R;
        WeakHashMap weakHashMap = of5.f6887R;
        boolean z = true;
        if (eHQ.e(view) != 1) {
            z = false;
        }
        if (!this.f453c) {
            return z;
        }
        return (z ? iRg.e : iRg.c).c(charSequence, charSequence.length());
    }

    public final void x(int i) {
        cod cod = new cod(this.f443R.getContext(), i);
        ColorStateList colorStateList = cod.f2202v;
        if (colorStateList != null) {
            this.f461v = colorStateList;
        }
        float f = cod.X;
        if (f != 0.0f) {
            this.X = f;
        }
        ColorStateList colorStateList2 = cod.f2196R;
        if (colorStateList2 != null) {
            this.f450c = colorStateList2;
        }
        this.y = cod.R;
        this.t = cod.v;
        this.g = cod.c;
        this.K = cod.e;
        N5 n5 = this.f459v;
        if (n5 != null) {
            n5.f309R = true;
        }
        gL6 gl6 = new gL6(21, this);
        cod.R();
        this.f459v = new N5(gl6, cod.f2197R);
        cod.c(this.f443R.getContext(), this.f459v);
        m(false);
    }

    public final boolean y(int[] iArr) {
        ColorStateList colorStateList;
        this.f446R = iArr;
        ColorStateList colorStateList2 = this.f461v;
        if (!((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f435R) != null && colorStateList.isStateful()))) {
            return false;
        }
        m(false);
        return true;
    }
}
