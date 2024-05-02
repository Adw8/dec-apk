package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: dOE  reason: default package */
/* loaded from: classes.dex */
public final class dOE {
    public ift R;

    /* renamed from: R  reason: collision with other field name */
    public jfq f2591R;

    /* renamed from: R  reason: collision with other field name */
    public jy3 f2592R;
    public ift c;

    /* renamed from: c  reason: collision with other field name */
    public jfq f2593c;

    /* renamed from: c  reason: collision with other field name */
    public jy3 f2594c;
    public ift e;

    /* renamed from: e  reason: collision with other field name */
    public jfq f2595e;

    /* renamed from: e  reason: collision with other field name */
    public jy3 f2596e;
    public ift v;

    /* renamed from: v  reason: collision with other field name */
    public jfq f2597v;

    /* renamed from: v  reason: collision with other field name */
    public jy3 f2598v;

    public dOE(nBP nbp) {
        this.f2592R = nbp.f6343R;
        this.f2598v = nbp.f6349v;
        this.f2594c = nbp.f6345c;
        this.f2596e = nbp.f6347e;
        this.f2591R = nbp.f6342R;
        this.f2597v = nbp.f6348v;
        this.f2593c = nbp.f6344c;
        this.f2595e = nbp.f6346e;
        this.R = nbp.R;
        this.v = nbp.v;
        this.c = nbp.c;
        this.e = nbp.e;
    }

    public static nBP R(Context context, int i, int i2, SO so) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(hDC.d);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            jfq c = c(obtainStyledAttributes, 5, so);
            jfq c2 = c(obtainStyledAttributes, 8, c);
            jfq c3 = c(obtainStyledAttributes, 9, c);
            jfq c4 = c(obtainStyledAttributes, 7, c);
            jfq c5 = c(obtainStyledAttributes, 6, c);
            nBP nbp = new nBP();
            jy3 x = hDC.x(i4);
            nbp.f6343R = x;
            nBP.v(x);
            nbp.f6342R = c2;
            jy3 x2 = hDC.x(i5);
            nbp.f6349v = x2;
            nBP.v(x2);
            nbp.f6348v = c3;
            jy3 x3 = hDC.x(i6);
            nbp.f6345c = x3;
            nBP.v(x3);
            nbp.f6344c = c4;
            jy3 x4 = hDC.x(i7);
            nbp.f6347e = x4;
            nBP.v(x4);
            nbp.f6346e = c5;
            return nbp;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static jfq c(TypedArray typedArray, int i, jfq jfq) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return jfq;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new SO((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new nFv(peekValue.getFraction(1.0f, 1.0f)) : jfq;
    }

    public static nBP v(Context context, AttributeSet attributeSet, int i, int i2) {
        SO so = new SO((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hDC.I, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return R(context, resourceId, resourceId2, so);
    }

    public final dOE X(float f) {
        nBP nbp = new nBP(this);
        nbp.c(f);
        return new dOE(nbp);
    }

    public final boolean e(RectF rectF) {
        boolean z = this.e.getClass().equals(ift.class) && this.v.getClass().equals(ift.class) && this.R.getClass().equals(ift.class) && this.c.getClass().equals(ift.class);
        float R = this.f2591R.R(rectF);
        return z && ((this.f2597v.R(rectF) > R ? 1 : (this.f2597v.R(rectF) == R ? 0 : -1)) == 0 && (this.f2595e.R(rectF) > R ? 1 : (this.f2595e.R(rectF) == R ? 0 : -1)) == 0 && (this.f2593c.R(rectF) > R ? 1 : (this.f2593c.R(rectF) == R ? 0 : -1)) == 0) && ((this.f2598v instanceof i0e) && (this.f2592R instanceof i0e) && (this.f2594c instanceof i0e) && (this.f2596e instanceof i0e));
    }

    public dOE() {
        this.f2592R = new i0e();
        this.f2598v = new i0e();
        this.f2594c = new i0e();
        this.f2596e = new i0e();
        this.f2591R = new SO(0.0f);
        this.f2597v = new SO(0.0f);
        this.f2593c = new SO(0.0f);
        this.f2595e = new SO(0.0f);
        this.R = hDC.H();
        this.v = hDC.H();
        this.c = hDC.H();
        this.e = hDC.H();
    }
}
