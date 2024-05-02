package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* renamed from: eQ  reason: default package */
/* loaded from: classes.dex */
public class eQ extends ImageButton {
    public final Dn R;

    /* renamed from: R  reason: collision with other field name */
    public final Jd f3079R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3080R = false;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        by3.R(context);
        lM2.R(this, getContext());
        Jd jd = new Jd(this);
        this.f3079R = jd;
        jd.X(attributeSet, i);
        Dn dn = new Dn(this);
        this.R = dn;
        dn.c(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Jd jd = this.f3079R;
        if (jd != null) {
            jd.R();
        }
        Dn dn = this.R;
        if (dn != null) {
            dn.R();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        Jd jd = this.f3079R;
        if (jd != null) {
            return jd.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Jd jd = this.f3079R;
        if (jd != null) {
            return jd.e();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        epC epc;
        Dn dn = this.R;
        if (dn == null || (epc = (epC) dn.v) == null) {
            return null;
        }
        return (ColorStateList) epc.R;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        epC epc;
        Dn dn = this.R;
        if (dn == null || (epc = (epC) dn.v) == null) {
            return null;
        }
        return (PorterDuff.Mode) epc.v;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.R.f80R).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Jd jd = this.f3079R;
        if (jd != null) {
            jd.O();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        Jd jd = this.f3079R;
        if (jd != null) {
            jd.L(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        Dn dn = this.R;
        if (dn != null) {
            dn.R();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Dn dn = this.R;
        if (!(dn == null || drawable == null || this.f3080R)) {
            dn.R = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        Dn dn2 = this.R;
        if (dn2 != null) {
            dn2.R();
            if (!this.f3080R) {
                Dn dn3 = this.R;
                if (((ImageView) dn3.f80R).getDrawable() != null) {
                    ((ImageView) dn3.f80R).getDrawable().setLevel(dn3.R);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f3080R = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.R.X(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        Dn dn = this.R;
        if (dn != null) {
            dn.R();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Jd jd = this.f3079R;
        if (jd != null) {
            jd.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Jd jd = this.f3079R;
        if (jd != null) {
            jd.x(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        Dn dn = this.R;
        if (dn != null) {
            dn.O(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        Dn dn = this.R;
        if (dn != null) {
            dn.L(mode);
        }
    }
}
