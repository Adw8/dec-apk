package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    public final Dn R;

    /* renamed from: R  reason: collision with other field name */
    public final Jd f1093R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1094R;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Jd jd = this.f1093R;
        if (jd != null) {
            jd.R();
        }
        Dn dn = this.R;
        if (dn != null) {
            dn.R();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        Jd jd = this.f1093R;
        if (jd != null) {
            return jd.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Jd jd = this.f1093R;
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
        Jd jd = this.f1093R;
        if (jd != null) {
            jd.O();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        Jd jd = this.f1093R;
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
        if (!(dn == null || drawable == null || this.f1094R)) {
            dn.R = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        Dn dn2 = this.R;
        if (dn2 != null) {
            dn2.R();
            if (!this.f1094R) {
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
        this.f1094R = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        Dn dn = this.R;
        if (dn != null) {
            dn.X(i);
        }
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
        Jd jd = this.f1093R;
        if (jd != null) {
            jd.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Jd jd = this.f1093R;
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

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        by3.R(context);
        this.f1094R = false;
        lM2.R(this, getContext());
        Jd jd = new Jd(this);
        this.f1093R = jd;
        jd.X(attributeSet, i);
        Dn dn = new Dn(this);
        this.R = dn;
        dn.c(attributeSet, i);
    }
}
