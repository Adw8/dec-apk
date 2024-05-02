package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: oku  reason: default package */
/* loaded from: classes.dex */
public final class oku extends Drawable.ConstantState {
    public float O;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public int f6902R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f6903R;

    /* renamed from: R  reason: collision with other field name */
    public Paint.Style f6904R;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f6905R;

    /* renamed from: R  reason: collision with other field name */
    public Rect f6906R;

    /* renamed from: R  reason: collision with other field name */
    public dOE f6907R;

    /* renamed from: R  reason: collision with other field name */
    public fBr f6908R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6909R;
    public float X;

    /* renamed from: X  reason: collision with other field name */
    public int f6910X;
    public float c;

    /* renamed from: c  reason: collision with other field name */
    public int f6911c;

    /* renamed from: c  reason: collision with other field name */
    public ColorStateList f6912c;
    public float e;

    /* renamed from: e  reason: collision with other field name */
    public int f6913e;

    /* renamed from: e  reason: collision with other field name */
    public ColorStateList f6914e;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public int f6915v;

    /* renamed from: v  reason: collision with other field name */
    public ColorStateList f6916v;

    public oku(dOE doe) {
        this.f6903R = null;
        this.f6916v = null;
        this.f6912c = null;
        this.f6914e = null;
        this.f6905R = PorterDuff.Mode.SRC_IN;
        this.f6906R = null;
        this.R = 1.0f;
        this.v = 1.0f;
        this.f6902R = 255;
        this.e = 0.0f;
        this.X = 0.0f;
        this.O = 0.0f;
        this.f6915v = 0;
        this.f6911c = 0;
        this.f6913e = 0;
        this.f6910X = 0;
        this.f6909R = false;
        this.f6904R = Paint.Style.FILL_AND_STROKE;
        this.f6907R = doe;
        this.f6908R = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        c18 c18 = new c18(this);
        c18.f1921R = true;
        return c18;
    }

    public oku(oku oku) {
        this.f6903R = null;
        this.f6916v = null;
        this.f6912c = null;
        this.f6914e = null;
        this.f6905R = PorterDuff.Mode.SRC_IN;
        this.f6906R = null;
        this.R = 1.0f;
        this.v = 1.0f;
        this.f6902R = 255;
        this.e = 0.0f;
        this.X = 0.0f;
        this.O = 0.0f;
        this.f6915v = 0;
        this.f6911c = 0;
        this.f6913e = 0;
        this.f6910X = 0;
        this.f6909R = false;
        this.f6904R = Paint.Style.FILL_AND_STROKE;
        this.f6907R = oku.f6907R;
        this.f6908R = oku.f6908R;
        this.c = oku.c;
        this.f6903R = oku.f6903R;
        this.f6916v = oku.f6916v;
        this.f6905R = oku.f6905R;
        this.f6914e = oku.f6914e;
        this.f6902R = oku.f6902R;
        this.R = oku.R;
        this.f6913e = oku.f6913e;
        this.f6915v = oku.f6915v;
        this.f6909R = oku.f6909R;
        this.v = oku.v;
        this.e = oku.e;
        this.X = oku.X;
        this.O = oku.O;
        this.f6911c = oku.f6911c;
        this.f6910X = oku.f6910X;
        this.f6912c = oku.f6912c;
        this.f6904R = oku.f6904R;
        if (oku.f6906R != null) {
            this.f6906R = new Rect(oku.f6906R);
        }
    }
}
