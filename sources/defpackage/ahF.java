package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: ahF  reason: default package */
/* loaded from: classes.dex */
public final class ahF extends Drawable.ConstantState {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f967R;

    /* renamed from: R  reason: collision with other field name */
    public Bitmap f968R;

    /* renamed from: R  reason: collision with other field name */
    public Paint f969R;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f970R;

    /* renamed from: R  reason: collision with other field name */
    public db0 f971R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f972R;
    public boolean c;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public ColorStateList f973v;

    /* renamed from: v  reason: collision with other field name */
    public PorterDuff.Mode f974v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f975v;

    public ahF(ahF ahf) {
        this.f967R = null;
        this.f970R = lPr.R;
        if (ahf != null) {
            this.R = ahf.R;
            db0 db0 = new db0(ahf.f971R);
            this.f971R = db0;
            if (ahf.f971R.f2687v != null) {
                db0.f2687v = new Paint(ahf.f971R.f2687v);
            }
            if (ahf.f971R.f2680R != null) {
                this.f971R.f2680R = new Paint(ahf.f971R.f2680R);
            }
            this.f967R = ahf.f967R;
            this.f970R = ahf.f970R;
            this.f972R = ahf.f972R;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.R;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new lPr(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new lPr(this);
    }

    public ahF() {
        this.f967R = null;
        this.f970R = lPr.R;
        this.f971R = new db0();
    }
}
