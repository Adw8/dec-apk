package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* renamed from: cod  reason: default package */
/* loaded from: classes.dex */
public final class cod {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final int f2195R;

    /* renamed from: R  reason: collision with other field name */
    public final ColorStateList f2196R;

    /* renamed from: R  reason: collision with other field name */
    public Typeface f2197R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2198R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2199R;
    public float X;
    public final float c;

    /* renamed from: c  reason: collision with other field name */
    public final int f2200c;
    public final float e;
    public final float v;

    /* renamed from: v  reason: collision with other field name */
    public final int f2201v;

    /* renamed from: v  reason: collision with other field name */
    public ColorStateList f2202v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2203v = false;

    public cod(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, hDC.r);
        this.X = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f2202v = lTs.m(context, obtainStyledAttributes, 3);
        lTs.m(context, obtainStyledAttributes, 4);
        lTs.m(context, obtainStyledAttributes, 5);
        this.f2195R = obtainStyledAttributes.getInt(2, 0);
        this.f2201v = obtainStyledAttributes.getInt(1, 1);
        int i2 = 12;
        i2 = 10;
        if (!obtainStyledAttributes.hasValue(12)) {
        }
        this.f2200c = obtainStyledAttributes.getResourceId(i2, 0);
        this.f2198R = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f2196R = lTs.m(context, obtainStyledAttributes, 6);
        this.R = obtainStyledAttributes.getFloat(7, 0.0f);
        this.v = obtainStyledAttributes.getFloat(8, 0.0f);
        this.c = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, hDC.z);
        this.f2199R = obtainStyledAttributes2.hasValue(0);
        this.e = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void L(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface h = vd.h(context.getResources().getConfiguration(), typeface);
        if (h != null) {
            typeface = h;
        }
        textPaint.setTypeface(typeface);
        int i = this.f2195R & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.X);
        if (this.f2199R) {
            textPaint.setLetterSpacing(this.e);
        }
    }

    public final void O(Context context, TextPaint textPaint, n1P n1p) {
        if (e(context)) {
            L(context, textPaint, v(context));
            return;
        }
        R();
        L(context, textPaint, this.f2197R);
        c(context, new peH(this, context, textPaint, n1p));
    }

    public final void R() {
        String str;
        if (this.f2197R == null && (str = this.f2198R) != null) {
            this.f2197R = Typeface.create(str, this.f2195R);
        }
        if (this.f2197R == null) {
            int i = this.f2201v;
            if (i == 1) {
                this.f2197R = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f2197R = Typeface.SERIF;
            } else if (i != 3) {
                this.f2197R = Typeface.DEFAULT;
            } else {
                this.f2197R = Typeface.MONOSPACE;
            }
            this.f2197R = Typeface.create(this.f2197R, this.f2195R);
        }
    }

    public final void X(Context context, TextPaint textPaint, n1P n1p) {
        O(context, textPaint, n1p);
        ColorStateList colorStateList = this.f2202v;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.c;
        float f2 = this.R;
        float f3 = this.v;
        ColorStateList colorStateList2 = this.f2196R;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void c(Context context, n1P n1p) {
        if (e(context)) {
            v(context);
        } else {
            R();
        }
        int i = this.f2200c;
        if (i == 0) {
            this.f2203v = true;
        }
        if (this.f2203v) {
            n1p.V(this.f2197R, true);
            return;
        }
        try {
            ekY eky = new ekY(this, n1p);
            ThreadLocal threadLocal = cu3.f2452R;
            if (context.isRestricted()) {
                eky.L(-4);
            } else {
                cu3.R(context, i, new TypedValue(), 0, eky, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            while (true) {
                this.f2203v = true;
                n1p.t(1);
                return;
            }
        } catch (Exception e) {
            StringBuilder U = opT.U("Error loading font ");
            U.append(this.f2198R);
            Log.d("TextAppearance", U.toString(), e);
            this.f2203v = true;
            n1p.t(-3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[ORIG_RETURN, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f2200c
            if (r1 == 0) goto L_0x001c
            java.lang.ThreadLocal r7 = defpackage.cu3.f2452R
            boolean r7 = r8.isRestricted()
            if (r7 == 0) goto L_0x000d
            goto L_0x001c
        L_0x000d:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r7 = defpackage.cu3.R(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x001d
        L_0x001c:
            r7 = 0
        L_0x001d:
            if (r7 == 0) goto L_0x0021
            r7 = 1
            goto L_0x0022
        L_0x0021:
            r7 = 0
        L_0x0022:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cod.e(android.content.Context):boolean");
    }

    public final Typeface v(Context context) {
        if (this.f2203v) {
            return this.f2197R;
        }
        if (!context.isRestricted()) {
            try {
                int i = this.f2200c;
                ThreadLocal threadLocal = cu3.f2452R;
                Typeface R = context.isRestricted() ? null : cu3.R(context, i, new TypedValue(), 0, null, false, false);
                this.f2197R = R;
                if (R != null) {
                    this.f2197R = Typeface.create(R, this.f2195R);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                StringBuilder U = opT.U("Error loading font ");
                U.append(this.f2198R);
                Log.d("TextAppearance", U.toString(), e);
            }
        }
        R();
        this.f2203v = true;
        return this.f2197R;
    }
}
