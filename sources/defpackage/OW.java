package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import dev.kdrag0n.virtcontainer.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: OW  reason: default package */
/* loaded from: classes.dex */
public final class OW extends c18 implements Drawable.Callback, joe {
    public float C;

    /* renamed from: C  reason: collision with other field name */
    public int f331C;
    public float H;

    /* renamed from: H  reason: collision with other field name */
    public int f332H;

    /* renamed from: H  reason: collision with other field name */
    public boolean f333H;
    public float L;

    /* renamed from: L  reason: collision with other field name */
    public int f334L;

    /* renamed from: L  reason: collision with other field name */
    public ColorStateList f335L;

    /* renamed from: L  reason: collision with other field name */
    public boolean f336L;
    public float O;

    /* renamed from: O  reason: collision with other field name */
    public int f337O;

    /* renamed from: O  reason: collision with other field name */
    public ColorStateList f338O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f339O;

    /* renamed from: R  reason: collision with other field name */
    public float f340R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f341R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f342R;

    /* renamed from: R  reason: collision with other field name */
    public ColorFilter f343R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f347R;

    /* renamed from: R  reason: collision with other field name */
    public RippleDrawable f348R;

    /* renamed from: R  reason: collision with other field name */
    public SpannableStringBuilder f349R;

    /* renamed from: R  reason: collision with other field name */
    public TextUtils.TruncateAt f350R;

    /* renamed from: R  reason: collision with other field name */
    public gm9 f351R;

    /* renamed from: R  reason: collision with other field name */
    public final ovn f354R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f355R;
    public float U;
    public float X;

    /* renamed from: X  reason: collision with other field name */
    public int f357X;

    /* renamed from: X  reason: collision with other field name */
    public ColorStateList f358X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f359X;
    public float Z;

    /* renamed from: Z  reason: collision with other field name */
    public int f360Z;

    /* renamed from: Z  reason: collision with other field name */
    public ColorStateList f361Z;

    /* renamed from: Z  reason: collision with other field name */
    public boolean f362Z;
    public float c;

    /* renamed from: c  reason: collision with other field name */
    public ColorStateList f363c;

    /* renamed from: c  reason: collision with other field name */
    public PorterDuffColorFilter f365c;

    /* renamed from: c  reason: collision with other field name */
    public Drawable f366c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f367c;
    public float e;

    /* renamed from: e  reason: collision with other field name */
    public ColorStateList f368e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f371e;
    public float m;

    /* renamed from: m  reason: collision with other field name */
    public int f372m;

    /* renamed from: m  reason: collision with other field name */
    public ColorStateList f373m;

    /* renamed from: m  reason: collision with other field name */
    public boolean f374m;

    /* renamed from: v  reason: collision with other field name */
    public ColorStateList f376v;

    /* renamed from: v  reason: collision with other field name */
    public Drawable f377v;

    /* renamed from: v  reason: collision with other field name */
    public gm9 f378v;
    public float x;

    /* renamed from: x  reason: collision with other field name */
    public int f379x;

    /* renamed from: x  reason: collision with other field name */
    public boolean f380x;
    public static final int[] v = {16842910};
    public static final ShapeDrawable R = new ShapeDrawable(new OvalShape());

    /* renamed from: v  reason: collision with other field name */
    public float f375v = -1.0f;

    /* renamed from: e  reason: collision with other field name */
    public final Paint f369e = new Paint(1);

    /* renamed from: R  reason: collision with other field name */
    public final Paint.FontMetrics f344R = new Paint.FontMetrics();

    /* renamed from: e  reason: collision with other field name */
    public final RectF f370e = new RectF();

    /* renamed from: R  reason: collision with other field name */
    public final PointF f345R = new PointF();

    /* renamed from: c  reason: collision with other field name */
    public final Path f364c = new Path();

    /* renamed from: U  reason: collision with other field name */
    public int f356U = 255;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f346R = PorterDuff.Mode.SRC_IN;

    /* renamed from: R  reason: collision with other field name */
    public WeakReference f353R = new WeakReference(null);

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f352R = "";

    public OW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2132018166);
        x(context);
        this.f341R = context;
        ovn ovn = new ovn(this);
        this.f354R = ovn;
        ovn.f7024R.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = v;
        setState(iArr);
        if (!Arrays.equals(this.f355R, iArr)) {
            this.f355R = iArr;
            if (q()) {
                z(getState(), iArr);
            }
        }
        this.f380x = true;
        R.setTint(-1);
    }

    public static boolean I(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void _(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean h(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public final void A(ColorStateList colorStateList) {
        if (this.f335L != colorStateList) {
            this.f335L = colorStateList;
            if (this.f336L && this.f366c != null && this.f339O) {
                cAO.Z(this.f366c, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void B(float f) {
        if (this.U != f) {
            this.U = f;
            invalidateSelf();
            if (q()) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        if (this.f368e != colorStateList) {
            this.f368e = colorStateList;
            if (!this.f374m) {
                colorStateList = null;
            } else if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.f373m = colorStateList;
            onStateChange(getState());
        }
    }

    public final void E(ColorStateList colorStateList) {
        if (this.f338O != colorStateList) {
            this.f338O = colorStateList;
            if (q()) {
                cAO.Z(this.f377v, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(float f) {
        if (this.L != f) {
            float K = K();
            this.L = f;
            float K2 = K();
            invalidateSelf();
            if (K != K2) {
                u();
            }
        }
    }

    public final void G(Drawable drawable) {
        Drawable drawable2 = this.f377v;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof i2s) {
            ndA nda = (ndA) ((i2s) drawable2);
            drawable2 = null;
            nda.getClass();
        }
        if (drawable2 != drawable) {
            float J = J();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f377v = drawable3;
            ColorStateList colorStateList = this.f368e;
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.f348R = new RippleDrawable(colorStateList, this.f377v, R);
            float J2 = J();
            _(drawable2);
            if (q()) {
                V(this.f377v);
            }
            invalidateSelf();
            if (J != J2) {
                u();
            }
        }
    }

    public final float J() {
        if (q()) {
            return this.H + this.X + this.U;
        }
        return 0.0f;
    }

    public final float K() {
        if (!w() && !b()) {
            return 0.0f;
        }
        float f = this.L;
        Drawable drawable = this.f362Z ? this.f366c : this.f347R;
        float f2 = this.e;
        if (f2 <= 0.0f && drawable != null) {
            f2 = (float) drawable.getIntrinsicWidth();
        }
        return f2 + f + this.Z;
    }

    public final void M(float f) {
        if (this.H != f) {
            this.H = f;
            invalidateSelf();
            if (q()) {
                u();
            }
        }
    }

    public final void Q(Drawable drawable) {
        if (this.f366c != drawable) {
            float K = K();
            this.f366c = drawable;
            float K2 = K();
            _(this.f366c);
            V(this.f366c);
            invalidateSelf();
            if (K != K2) {
                u();
            }
        }
    }

    @Override // defpackage.joe
    public final void R() {
        u();
        invalidateSelf();
    }

    public final void S(boolean z) {
        if (this.f336L != z) {
            boolean b = b();
            this.f336L = z;
            boolean b2 = b();
            if (b != b2) {
                if (b2) {
                    V(this.f366c);
                } else {
                    _(this.f366c);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void T(ColorStateList colorStateList) {
        this.f371e = true;
        if (this.f358X != colorStateList) {
            this.f358X = colorStateList;
            if (w()) {
                cAO.Z(this.f347R, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            f4J.v(drawable, f4J.R(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f377v) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f355R);
                }
                cAO.Z(drawable, this.f338O);
                return;
            }
            Drawable drawable2 = this.f347R;
            if (drawable == drawable2 && this.f371e) {
                cAO.Z(drawable2, this.f358X);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void W(Drawable drawable) {
        Drawable drawable2 = this.f347R;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof i2s) {
            ndA nda = (ndA) ((i2s) drawable2);
            drawable2 = null;
            nda.getClass();
        }
        if (drawable2 != drawable) {
            float K = K();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f347R = drawable3;
            float K2 = K();
            _(drawable2);
            if (w()) {
                V(this.f347R);
            }
            invalidateSelf();
            if (K != K2) {
                u();
            }
        }
    }

    public final float Y() {
        return this.f333H ? m() : this.f375v;
    }

    public final void a(float f) {
        if (this.Z != f) {
            float K = K();
            this.Z = f;
            float K2 = K();
            invalidateSelf();
            if (K != K2) {
                u();
            }
        }
    }

    public final boolean b() {
        return this.f336L && this.f366c != null && this.f362Z;
    }

    public final void d(float f) {
        if (this.f375v != f) {
            this.f375v = f;
            setShapeAppearanceModel(((c18) this).f1920R.f6907R.X(f));
        }
    }

    @Override // defpackage.c18, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.f356U) != 0) {
            int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i) : 0;
            if (!this.f333H) {
                this.f369e.setColor(this.f357X);
                this.f369e.setStyle(Paint.Style.FILL);
                this.f370e.set(bounds);
                canvas.drawRoundRect(this.f370e, Y(), Y(), this.f369e);
            }
            if (!this.f333H) {
                this.f369e.setColor(this.f337O);
                this.f369e.setStyle(Paint.Style.FILL);
                Paint paint = this.f369e;
                ColorFilter colorFilter = this.f343R;
                if (colorFilter == null) {
                    colorFilter = this.f365c;
                }
                paint.setColorFilter(colorFilter);
                this.f370e.set(bounds);
                canvas.drawRoundRect(this.f370e, Y(), Y(), this.f369e);
            }
            if (this.f333H) {
                super.draw(canvas);
            }
            if (this.c > 0.0f && !this.f333H) {
                this.f369e.setColor(this.f360Z);
                this.f369e.setStyle(Paint.Style.STROKE);
                if (!this.f333H) {
                    Paint paint2 = this.f369e;
                    ColorFilter colorFilter2 = this.f343R;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f365c;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.f370e;
                float f = this.c / 2.0f;
                rectF.set(((float) bounds.left) + f, ((float) bounds.top) + f, ((float) bounds.right) - f, ((float) bounds.bottom) - f);
                float f2 = this.f375v - (this.c / 2.0f);
                canvas.drawRoundRect(this.f370e, f2, f2, this.f369e);
            }
            this.f369e.setColor(this.f372m);
            this.f369e.setStyle(Paint.Style.FILL);
            this.f370e.set(bounds);
            if (!this.f333H) {
                canvas.drawRoundRect(this.f370e, Y(), Y(), this.f369e);
            } else {
                RectF rectF2 = new RectF(bounds);
                Path path = this.f364c;
                erz erz = ((c18) this).f1916R;
                oku oku = ((c18) this).f1920R;
                erz.R(oku.f6907R, oku.v, rectF2, ((c18) this).f1917R, path);
                O(canvas, this.f369e, this.f364c, ((c18) this).f1920R.f6907R, Z());
            }
            if (w()) {
                o(bounds, this.f370e);
                RectF rectF3 = this.f370e;
                float f3 = rectF3.left;
                float f4 = rectF3.top;
                canvas.translate(f3, f4);
                this.f347R.setBounds(0, 0, (int) this.f370e.width(), (int) this.f370e.height());
                this.f347R.draw(canvas);
                canvas.translate(-f3, -f4);
            }
            if (b()) {
                o(bounds, this.f370e);
                RectF rectF4 = this.f370e;
                float f5 = rectF4.left;
                float f6 = rectF4.top;
                canvas.translate(f5, f6);
                this.f366c.setBounds(0, 0, (int) this.f370e.width(), (int) this.f370e.height());
                this.f366c.draw(canvas);
                canvas.translate(-f5, -f6);
            }
            if (!this.f380x || this.f352R == null) {
                i2 = saveLayerAlpha;
                i3 = 0;
                i4 = 255;
            } else {
                PointF pointF = this.f345R;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.f352R != null) {
                    float K = K() + this.O + this.m;
                    if (f4J.R(this) == 0) {
                        pointF.x = ((float) bounds.left) + K;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - K;
                        align = Paint.Align.RIGHT;
                    }
                    this.f354R.f7024R.getFontMetrics(this.f344R);
                    Paint.FontMetrics fontMetrics = this.f344R;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF5 = this.f370e;
                rectF5.setEmpty();
                if (this.f352R != null) {
                    float K2 = K() + this.O + this.m;
                    float J = J() + this.C + this.x;
                    if (f4J.R(this) == 0) {
                        rectF5.left = ((float) bounds.left) + K2;
                        rectF5.right = ((float) bounds.right) - J;
                    } else {
                        rectF5.left = ((float) bounds.left) + J;
                        rectF5.right = ((float) bounds.right) - K2;
                    }
                    rectF5.top = (float) bounds.top;
                    rectF5.bottom = (float) bounds.bottom;
                }
                ovn ovn = this.f354R;
                if (ovn.f7025R != null) {
                    ovn.f7024R.drawableState = getState();
                    ovn ovn2 = this.f354R;
                    ovn2.f7025R.X(this.f341R, ovn2.f7024R, ovn2.f7027R);
                }
                this.f354R.f7024R.setTextAlign(align);
                boolean z = Math.round(this.f354R.R(this.f352R.toString())) > Math.round(this.f370e.width());
                if (z) {
                    i5 = canvas.save();
                    canvas.clipRect(this.f370e);
                } else {
                    i5 = 0;
                }
                CharSequence charSequence = this.f352R;
                if (z && this.f350R != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f354R.f7024R, this.f370e.width(), this.f350R);
                }
                int length = charSequence.length();
                PointF pointF2 = this.f345R;
                i2 = saveLayerAlpha;
                i3 = 0;
                i4 = 255;
                canvas.drawText(charSequence, 0, length, pointF2.x, pointF2.y, this.f354R.f7024R);
                if (z) {
                    canvas.restoreToCount(i5);
                }
            }
            if (q()) {
                RectF rectF6 = this.f370e;
                rectF6.setEmpty();
                if (q()) {
                    float f7 = this.C + this.U;
                    if (f4J.R(this) == 0) {
                        float f8 = ((float) bounds.right) - f7;
                        rectF6.right = f8;
                        rectF6.left = f8 - this.X;
                    } else {
                        float f9 = ((float) bounds.left) + f7;
                        rectF6.left = f9;
                        rectF6.right = f9 + this.X;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f10 = this.X;
                    float f11 = exactCenterY - (f10 / 2.0f);
                    rectF6.top = f11;
                    rectF6.bottom = f11 + f10;
                }
                RectF rectF7 = this.f370e;
                float f12 = rectF7.left;
                float f13 = rectF7.top;
                canvas.translate(f12, f13);
                this.f377v.setBounds(i3, i3, (int) this.f370e.width(), (int) this.f370e.height());
                this.f348R.setBounds(this.f377v.getBounds());
                this.f348R.jumpToCurrentState();
                this.f348R.draw(canvas);
                canvas.translate(-f12, -f13);
            }
            if (this.f356U < i4) {
                canvas.restoreToCount(i2);
            }
        }
    }

    public final void f(boolean z) {
        if (this.f359X != z) {
            boolean q = q();
            this.f359X = z;
            boolean q2 = q();
            if (q != q2) {
                if (q2) {
                    V(this.f377v);
                } else {
                    _(this.f377v);
                }
                invalidateSelf();
                u();
            }
        }
    }

    @Override // defpackage.c18, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f356U;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f343R;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f340R;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(J() + this.f354R.R(this.f352R.toString()) + K() + this.O + this.m + this.x + this.C), this.f331C);
    }

    @Override // defpackage.c18, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.c18, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f333H) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f375v);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f340R, this.f375v);
        }
        outline.setAlpha(((float) this.f356U) / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.c18, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (h(this.f342R) || h(this.f376v) || h(this.f363c)) {
            return true;
        }
        if (this.f374m && h(this.f373m)) {
            return true;
        }
        cod cod = this.f354R.f7025R;
        if ((cod == null || (colorStateList = cod.f2202v) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        return (this.f336L && this.f366c != null && this.f339O) || I(this.f347R) || I(this.f366c) || h(this.f361Z);
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f363c != colorStateList) {
            this.f363c = colorStateList;
            if (this.f333H) {
                g(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void l(float f) {
        if (this.X != f) {
            this.X = f;
            invalidateSelf();
            if (q()) {
                u();
            }
        }
    }

    public final void n(boolean z) {
        if (this.f339O != z) {
            this.f339O = z;
            float K = K();
            if (!z && this.f362Z) {
                this.f362Z = false;
            }
            float K2 = K();
            invalidateSelf();
            if (K != K2) {
                u();
            }
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (w() || b()) {
            float f = this.O + this.L;
            Drawable drawable = this.f362Z ? this.f366c : this.f347R;
            float f2 = this.e;
            if (f2 <= 0.0f && drawable != null) {
                f2 = (float) drawable.getIntrinsicWidth();
            }
            if (f4J.R(this) == 0) {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = ((float) rect.right) - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.f362Z ? this.f366c : this.f347R;
            float f5 = this.e;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 24, this.f341R.getResources().getDisplayMetrics()));
                if (((float) drawable2.getIntrinsicHeight()) <= f5) {
                    f5 = (float) drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (w()) {
            onLayoutDirectionChanged |= f4J.v(this.f347R, i);
        }
        if (b()) {
            onLayoutDirectionChanged |= f4J.v(this.f366c, i);
        }
        if (q()) {
            onLayoutDirectionChanged |= f4J.v(this.f377v, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (w()) {
            onLevelChange |= this.f347R.setLevel(i);
        }
        if (b()) {
            onLevelChange |= this.f366c.setLevel(i);
        }
        if (q()) {
            onLevelChange |= this.f377v.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.c18, android.graphics.drawable.Drawable, defpackage.joe
    public final boolean onStateChange(int[] iArr) {
        if (this.f333H) {
            super.onStateChange(iArr);
        }
        return z(iArr, this.f355R);
    }

    public final void p(float f) {
        if (this.c != f) {
            this.c = f;
            this.f369e.setStrokeWidth(f);
            if (this.f333H) {
                ((c18) this).f1920R.c = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final boolean q() {
        return this.f359X && this.f377v != null;
    }

    public final void r(boolean z) {
        if (this.f367c != z) {
            boolean w = w();
            this.f367c = z;
            boolean w2 = w();
            if (w != w2) {
                if (w2) {
                    V(this.f347R);
                } else {
                    _(this.f347R);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void s(float f) {
        if (this.e != f) {
            float K = K();
            this.e = f;
            float K2 = K();
            invalidateSelf();
            if (K != K2) {
                u();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.c18, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f356U != i) {
            this.f356U = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.c18, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f343R != colorFilter) {
            this.f343R = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.c18, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f361Z != colorStateList) {
            this.f361Z = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.c18, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f346R != mode) {
            this.f346R = mode;
            ColorStateList colorStateList = this.f361Z;
            this.f365c = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (w()) {
            visible |= this.f347R.setVisible(z, z2);
        }
        if (b()) {
            visible |= this.f366c.setVisible(z, z2);
        }
        if (q()) {
            visible |= this.f377v.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        n7 n7Var = (n7) this.f353R.get();
        if (n7Var != null) {
            Chip chip = (Chip) n7Var;
            chip.c(chip.X);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean w() {
        return this.f367c && this.f347R != null;
    }

    public final boolean z(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f342R;
        int e = e(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f357X) : 0);
        onStateChange = true;
        if (this.f357X != e) {
            this.f357X = e;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f376v;
        int e2 = e(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f337O) : 0);
        if (this.f337O != e2) {
            this.f337O = e2;
            onStateChange = true;
        }
        int v2 = B7.v(e2, e);
        if ((this.f334L != v2) || (((c18) this).f1920R.f6903R == null)) {
            this.f334L = v2;
            C(ColorStateList.valueOf(v2));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f363c;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f360Z) : 0;
        if (this.f360Z != colorForState) {
            this.f360Z = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f373m == null || !jjU.i(iArr)) ? 0 : this.f373m.getColorForState(iArr, this.f372m);
        if (this.f372m != colorForState2) {
            this.f372m = colorForState2;
            if (this.f374m) {
                onStateChange = true;
            }
        }
        cod cod = this.f354R.f7025R;
        int colorForState3 = (cod == null || (colorStateList = cod.f2202v) == null) ? 0 : colorStateList.getColorForState(iArr, this.f379x);
        if (this.f379x != colorForState3) {
            this.f379x = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i : state) {
                if (i == 16842912) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z3 = z && this.f339O;
        if (this.f362Z == z3 || this.f366c == null) {
            z2 = false;
        } else {
            float K = K();
            this.f362Z = z3;
            if (K != K()) {
                onStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f361Z;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f332H) : 0;
        if (this.f332H != colorForState4) {
            this.f332H = colorForState4;
            ColorStateList colorStateList6 = this.f361Z;
            PorterDuff.Mode mode = this.f346R;
            this.f365c = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        }
        if (I(this.f347R)) {
            onStateChange |= this.f347R.setState(iArr);
        }
        if (I(this.f366c)) {
            onStateChange |= this.f366c.setState(iArr);
        }
        if (I(this.f377v)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            onStateChange |= this.f377v.setState(iArr3);
        }
        if (I(this.f348R)) {
            onStateChange |= this.f348R.setState(iArr2);
        }
        if (onStateChange) {
            invalidateSelf();
        }
        if (z2) {
            u();
        }
        return onStateChange;
    }
}
