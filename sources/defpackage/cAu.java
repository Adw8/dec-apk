package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* renamed from: cAu  reason: default package */
/* loaded from: classes.dex */
public final class cAu {
    public static final double R = Math.cos(Math.toRadians(45.0d));

    /* renamed from: R  reason: collision with other field name */
    public int f1989R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f1990R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f1992R;

    /* renamed from: R  reason: collision with other field name */
    public LayerDrawable f1993R;

    /* renamed from: R  reason: collision with other field name */
    public RippleDrawable f1994R;

    /* renamed from: R  reason: collision with other field name */
    public final c18 f1995R;

    /* renamed from: R  reason: collision with other field name */
    public final MaterialCardView f1996R;

    /* renamed from: R  reason: collision with other field name */
    public dOE f1997R;
    public int c;

    /* renamed from: c  reason: collision with other field name */
    public ColorStateList f1999c;

    /* renamed from: c  reason: collision with other field name */
    public c18 f2000c;
    public int e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public ColorStateList f2001v;

    /* renamed from: v  reason: collision with other field name */
    public Drawable f2002v;

    /* renamed from: v  reason: collision with other field name */
    public final c18 f2003v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2004v;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f1991R = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public boolean f1998R = false;

    public cAu(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f1996R = materialCardView;
        c18 c18 = new c18(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, 2132018164);
        this.f1995R = c18;
        c18.x(materialCardView.getContext());
        c18.P();
        dOE doe = c18.f1920R.f6907R;
        doe.getClass();
        nBP nbp = new nBP(doe);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, hDC.x, R.attr.materialCardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            nbp.c(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f2003v = new c18();
        L(new dOE(nbp));
        obtainStyledAttributes.recycle();
    }

    public static float v(jy3 jy3, float f) {
        if (jy3 instanceof i0e) {
            return (float) ((1.0d - R) * ((double) f));
        }
        if (jy3 instanceof m7I) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final void L(dOE doe) {
        this.f1997R = doe;
        this.f1995R.setShapeAppearanceModel(doe);
        c18 c18 = this.f1995R;
        c18.f1928v = !c18.H();
        c18 c182 = this.f2003v;
        if (c182 != null) {
            c182.setShapeAppearanceModel(doe);
        }
        c18 c183 = this.f2000c;
        if (c183 != null) {
            c183.setShapeAppearanceModel(doe);
        }
    }

    public final void O(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f2002v = mutate;
            cAO.Z(mutate, this.f2001v);
            boolean isChecked = this.f1996R.isChecked();
            Drawable drawable2 = this.f2002v;
            if (drawable2 != null) {
                drawable2.setAlpha(isChecked ? 255 : 0);
            }
        } else {
            this.f2002v = null;
        }
        LayerDrawable layerDrawable = this.f1993R;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f2002v);
        }
    }

    public final float R() {
        float v = v(this.f1997R.f2592R, this.f1995R.m());
        jy3 jy3 = this.f1997R.f2598v;
        c18 c18 = this.f1995R;
        float max = Math.max(v, v(jy3, c18.f1920R.f6907R.f2597v.R(c18.Z())));
        jy3 jy32 = this.f1997R.f2594c;
        c18 c182 = this.f1995R;
        float v2 = v(jy32, c182.f1920R.f6907R.f2593c.R(c182.Z()));
        jy3 jy33 = this.f1997R.f2596e;
        c18 c183 = this.f1995R;
        return Math.max(max, Math.max(v2, v(jy33, c183.f1920R.f6907R.f2595e.R(c183.Z()))));
    }

    public final void X(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f1993R != null) {
            boolean z = false;
            if (this.f1996R.getUseCompatPadding()) {
                float f = 0.0f;
                i4 = (int) Math.ceil((double) (((this.f1996R.getMaxCardElevation() * 1.5f) + (Z() ? R() : 0.0f)) * 2.0f));
                float maxCardElevation = this.f1996R.getMaxCardElevation();
                if (Z()) {
                    f = R();
                }
                i3 = (int) Math.ceil((double) ((maxCardElevation + f) * 2.0f));
            } else {
                i4 = 0;
                i3 = 0;
            }
            int i7 = this.c;
            int i8 = (i7 & 8388613) == 8388613 ? ((i - this.f1989R) - this.v) - i3 : this.f1989R;
            int i9 = (i7 & 80) == 80 ? this.f1989R : ((i2 - this.f1989R) - this.v) - i4;
            int i10 = (i7 & 8388613) == 8388613 ? this.f1989R : ((i - this.f1989R) - this.v) - i3;
            if ((i7 & 80) == 80) {
                z = true;
            }
            int i11 = z ? ((i2 - this.f1989R) - this.v) - i4 : this.f1989R;
            MaterialCardView materialCardView = this.f1996R;
            WeakHashMap weakHashMap = of5.f6887R;
            if (eHQ.e(materialCardView) == 1) {
                i6 = i10;
                i5 = i8;
            } else {
                i5 = i10;
                i6 = i8;
            }
            this.f1993R.setLayerInset(2, i6, i11, i5, i9);
        }
    }

    public final boolean Z() {
        return this.f1996R.getPreventCornerOverlap() && this.f1995R.H() && this.f1996R.getUseCompatPadding();
    }

    public final LayerDrawable c() {
        if (this.f1994R == null) {
            this.f2000c = new c18(this.f1997R);
            this.f1994R = new RippleDrawable(this.f1990R, null, this.f2000c);
        }
        if (this.f1993R == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f1994R, this.f2003v, this.f2002v});
            this.f1993R = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f1993R;
    }

    public final btf e(Drawable drawable) {
        int i;
        int i2 = 0;
        if (this.f1996R.getUseCompatPadding()) {
            float f = 0.0f;
            i = (int) Math.ceil((double) ((this.f1996R.getMaxCardElevation() * 1.5f) + (Z() ? R() : 0.0f)));
            float maxCardElevation = this.f1996R.getMaxCardElevation();
            if (Z()) {
                f = R();
            }
            i2 = (int) Math.ceil((double) (maxCardElevation + f));
        } else {
            i = 0;
        }
        return new btf(drawable, i2, i, i2, i);
    }

    public final void m() {
        boolean z = true;
        if (!(this.f1996R.getPreventCornerOverlap() && !this.f1995R.H()) && !Z()) {
            z = false;
        }
        float f = 0.0f;
        float R2 = z ? R() : 0.0f;
        if (this.f1996R.getPreventCornerOverlap() && this.f1996R.getUseCompatPadding()) {
            f = (float) ((1.0d - R) * ((double) this.f1996R.getCardViewRadius()));
        }
        int i = (int) (R2 - f);
        MaterialCardView materialCardView = this.f1996R;
        Rect rect = this.f1991R;
        ((l8) materialCardView).f5589R.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        h5 h5Var = ((l8) materialCardView).f5590R;
        if (!((l8) h5Var.v).getUseCompatPadding()) {
            h5Var.K(0, 0, 0, 0);
            return;
        }
        miq miq = (miq) ((Drawable) h5Var.R);
        float f2 = miq.v;
        float f3 = miq.R;
        int ceil = (int) Math.ceil((double) lsR.R(f2, f3, h5Var.C()));
        int ceil2 = (int) Math.ceil((double) lsR.v(f2, f3, h5Var.C()));
        h5Var.K(ceil, ceil2, ceil, ceil2);
    }

    public final void x() {
        if (!this.f1998R) {
            this.f1996R.setBackgroundInternal(e(this.f1995R));
        }
        this.f1996R.setForeground(e(this.f1992R));
    }
}
