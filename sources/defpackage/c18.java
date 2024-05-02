package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* renamed from: c18  reason: default package */
/* loaded from: classes.dex */
public class c18 extends Drawable implements kOI {
    public static final String R = c18.class.getSimpleName();
    public static final Paint c;

    /* renamed from: R  reason: collision with other field name */
    public final Matrix f1909R;

    /* renamed from: R  reason: collision with other field name */
    public final Paint f1910R;

    /* renamed from: R  reason: collision with other field name */
    public final Path f1911R;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuffColorFilter f1912R;

    /* renamed from: R  reason: collision with other field name */
    public final RectF f1913R;

    /* renamed from: R  reason: collision with other field name */
    public final Region f1914R;

    /* renamed from: R  reason: collision with other field name */
    public dOE f1915R;

    /* renamed from: R  reason: collision with other field name */
    public final erz f1916R;

    /* renamed from: R  reason: collision with other field name */
    public final gL6 f1917R;

    /* renamed from: R  reason: collision with other field name */
    public final BitSet f1918R;

    /* renamed from: R  reason: collision with other field name */
    public final juL f1919R;

    /* renamed from: R  reason: collision with other field name */
    public oku f1920R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1921R;

    /* renamed from: R  reason: collision with other field name */
    public final lLA[] f1922R;

    /* renamed from: c  reason: collision with other field name */
    public final RectF f1923c;
    public int e;
    public final Paint v;

    /* renamed from: v  reason: collision with other field name */
    public final Path f1924v;

    /* renamed from: v  reason: collision with other field name */
    public PorterDuffColorFilter f1925v;

    /* renamed from: v  reason: collision with other field name */
    public final RectF f1926v;

    /* renamed from: v  reason: collision with other field name */
    public final Region f1927v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1928v;

    /* renamed from: v  reason: collision with other field name */
    public final lLA[] f1929v;

    static {
        Paint paint = new Paint(1);
        c = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public c18() {
        this(new dOE());
    }

    public final void C(ColorStateList colorStateList) {
        oku oku = this.f1920R;
        if (oku.f6903R != colorStateList) {
            oku.f6903R = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean H() {
        return this.f1920R.f6907R.e(Z());
    }

    public void L(Canvas canvas) {
        Paint paint = this.v;
        Path path = this.f1924v;
        dOE doe = this.f1915R;
        this.f1926v.set(Z());
        Paint.Style style = this.f1920R.f6904R;
        float f = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.v.getStrokeWidth() > 0.0f) {
            f = this.v.getStrokeWidth() / 2.0f;
        }
        this.f1926v.inset(f, f);
        O(canvas, paint, path, doe, this.f1926v);
    }

    public final void N(float f) {
        oku oku = this.f1920R;
        if (oku.v != f) {
            oku.v = f;
            this.f1921R = true;
            invalidateSelf();
        }
    }

    public final void O(Canvas canvas, Paint paint, Path path, dOE doe, RectF rectF) {
        if (doe.e(rectF)) {
            float R2 = doe.f2597v.R(rectF) * this.f1920R.v;
            canvas.drawRoundRect(rectF, R2, R2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void P() {
        this.f1919R.R(-12303292);
        this.f1920R.f6909R = false;
        super.invalidateSelf();
    }

    public final void U(float f) {
        oku oku = this.f1920R;
        if (oku.X != f) {
            oku.X = f;
            i();
        }
    }

    public final void X(Canvas canvas) {
        if (this.f1918R.cardinality() > 0) {
            Log.w(R, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f1920R.f6913e != 0) {
            canvas.drawPath(this.f1911R, this.f1919R.f5099R);
        }
        for (int i = 0; i < 4; i++) {
            lLA lla = this.f1922R[i];
            juL jul = this.f1919R;
            int i2 = this.f1920R.f6911c;
            Matrix matrix = lLA.v;
            lla.R(matrix, jul, i2, canvas);
            this.f1929v[i].R(matrix, this.f1919R, this.f1920R.f6911c, canvas);
        }
        if (this.f1928v) {
            oku oku = this.f1920R;
            int sin = (int) (Math.sin(Math.toRadians((double) oku.f6910X)) * ((double) oku.f6913e));
            oku oku2 = this.f1920R;
            int cos = (int) (Math.cos(Math.toRadians((double) oku2.f6910X)) * ((double) oku2.f6913e));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(this.f1911R, c);
            canvas.translate((float) sin, (float) cos);
        }
    }

    public final RectF Z() {
        this.f1913R.set(getBounds());
        return this.f1913R;
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            if (z) {
                int color = paint.getColor();
                int e = e(color);
                this.e = e;
                if (e != color) {
                    return new PorterDuffColorFilter(e, PorterDuff.Mode.SRC_IN);
                }
            }
            return null;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = e(colorForState);
        }
        this.e = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01fd  */
    @Override // android.graphics.drawable.Drawable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r15) {
        /*
        // Method dump skipped, instructions count: 531
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c18.draw(android.graphics.Canvas):void");
    }

    public final int e(int i) {
        oku oku = this.f1920R;
        float f = oku.X + oku.O + oku.e;
        fBr fbr = oku.f6908R;
        return fbr != null ? fbr.R(i, f) : i;
    }

    public final void g(ColorStateList colorStateList) {
        oku oku = this.f1920R;
        if (oku.f6916v != colorStateList) {
            oku.f6916v = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1920R.f6902R;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1920R;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f1920R.f6915v != 2) {
            if (H()) {
                outline.setRoundRect(getBounds(), m() * this.f1920R.v);
                return;
            }
            v(Z(), this.f1911R);
            this.f1911R.isConvex();
            try {
                outline.setConvexPath(this.f1911R);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f1920R.f6906R;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.f1914R.set(getBounds());
        v(Z(), this.f1911R);
        this.f1927v.setPath(this.f1911R, this.f1914R);
        this.f1914R.op(this.f1927v, Region.Op.DIFFERENCE);
        return this.f1914R;
    }

    public final void i() {
        oku oku = this.f1920R;
        float f = oku.X + oku.O;
        oku.f6911c = (int) Math.ceil((double) (0.75f * f));
        this.f1920R.f6913e = (int) Math.ceil((double) (f * 0.25f));
        t();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1921R = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f1920R.f6914e) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f1920R.f6912c) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f1920R.f6916v) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f1920R.f6903R) != null && colorStateList4.isStateful())));
    }

    public final void j() {
        oku oku = this.f1920R;
        if (oku.f6915v != 2) {
            oku.f6915v = 2;
            super.invalidateSelf();
        }
    }

    public final float m() {
        return this.f1920R.f6907R.f2591R.R(Z());
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f1920R = new oku(this.f1920R);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f1921R = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.joe
    public boolean onStateChange(int[] iArr) {
        boolean z = y(iArr) || t();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        oku oku = this.f1920R;
        if (oku.f6902R != i) {
            oku.f6902R = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1920R.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.kOI
    public final void setShapeAppearanceModel(dOE doe) {
        this.f1920R.f6907R = doe;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1920R.f6914e = colorStateList;
        t();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        oku oku = this.f1920R;
        if (oku.f6905R != mode) {
            oku.f6905R = mode;
            t();
            super.invalidateSelf();
        }
    }

    public final boolean t() {
        PorterDuffColorFilter porterDuffColorFilter = this.f1912R;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1925v;
        oku oku = this.f1920R;
        this.f1912R = c(oku.f6914e, oku.f6905R, this.f1910R, true);
        oku oku2 = this.f1920R;
        this.f1925v = c(oku2.f6912c, oku2.f6905R, this.v, false);
        oku oku3 = this.f1920R;
        if (oku3.f6909R) {
            this.f1919R.R(oku3.f6914e.getColorForState(getState(), 0));
        }
        return !cTo.R(porterDuffColorFilter, this.f1912R) || !cTo.R(porterDuffColorFilter2, this.f1925v);
    }

    public final void v(RectF rectF, Path path) {
        erz erz = this.f1916R;
        oku oku = this.f1920R;
        erz.R(oku.f6907R, oku.v, rectF, this.f1917R, path);
        if (this.f1920R.R != 1.0f) {
            this.f1909R.reset();
            Matrix matrix = this.f1909R;
            float f = this.f1920R.R;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f1909R);
        }
        path.computeBounds(this.f1923c, true);
    }

    public final void x(Context context) {
        this.f1920R.f6908R = new fBr(context);
        i();
    }

    public final boolean y(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f1920R.f6903R == null || color2 == (colorForState2 = this.f1920R.f6903R.getColorForState(iArr, (color2 = this.f1910R.getColor())))) {
            z = false;
        } else {
            this.f1910R.setColor(colorForState2);
            z = true;
        }
        if (this.f1920R.f6916v == null || color == (colorForState = this.f1920R.f6916v.getColorForState(iArr, (color = this.v.getColor())))) {
            return z;
        }
        this.v.setColor(colorForState);
        return true;
    }

    public c18(Context context, AttributeSet attributeSet, int i, int i2) {
        this(dOE.v(context, attributeSet, i, i2).R());
    }

    public c18(dOE doe) {
        this(new oku(doe));
    }

    public c18(oku oku) {
        erz erz;
        this.f1922R = new lLA[4];
        this.f1929v = new lLA[4];
        this.f1918R = new BitSet(8);
        this.f1909R = new Matrix();
        this.f1911R = new Path();
        this.f1924v = new Path();
        this.f1913R = new RectF();
        this.f1926v = new RectF();
        this.f1914R = new Region();
        this.f1927v = new Region();
        Paint paint = new Paint(1);
        this.f1910R = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.f1919R = new juL();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            erz = lAT.R;
        } else {
            erz = new erz();
        }
        this.f1916R = erz;
        this.f1923c = new RectF();
        this.f1928v = true;
        this.f1920R = oku;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        t();
        y(getState());
        this.f1917R = new gL6(23, this);
    }
}
