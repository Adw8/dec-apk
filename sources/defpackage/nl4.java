package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* renamed from: nl4  reason: default package */
/* loaded from: classes.dex */
public final class nl4 {
    public int L;
    public int O;
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f6559R;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f6560R;

    /* renamed from: R  reason: collision with other field name */
    public RippleDrawable f6561R;

    /* renamed from: R  reason: collision with other field name */
    public c18 f6562R;

    /* renamed from: R  reason: collision with other field name */
    public final MaterialButton f6563R;

    /* renamed from: R  reason: collision with other field name */
    public dOE f6564R;
    public int X;
    public int c;

    /* renamed from: c  reason: collision with other field name */
    public ColorStateList f6567c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f6569e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public ColorStateList f6570v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6565R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f6571v = false;

    /* renamed from: c  reason: collision with other field name */
    public boolean f6568c = false;

    /* renamed from: X  reason: collision with other field name */
    public boolean f6566X = true;

    public nl4(MaterialButton materialButton, dOE doe) {
        this.f6563R = materialButton;
        this.f6564R = doe;
    }

    public final void O() {
        int i = 0;
        c18 v = v(false);
        c18 v2 = v(true);
        if (v != null) {
            ColorStateList colorStateList = this.f6570v;
            v.f1920R.c = (float) this.O;
            v.invalidateSelf();
            v.g(colorStateList);
            if (v2 != null) {
                float f = (float) this.O;
                if (this.f6565R) {
                    i = vd.t(this.f6563R, R.attr.colorSurface);
                }
                v2.f1920R.c = f;
                v2.invalidateSelf();
                v2.g(ColorStateList.valueOf(i));
            }
        }
    }

    public final kOI R() {
        RippleDrawable rippleDrawable = this.f6561R;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f6561R.getNumberOfLayers() > 2 ? (kOI) this.f6561R.getDrawable(2) : (kOI) this.f6561R.getDrawable(1);
    }

    public final void X() {
        MaterialButton materialButton = this.f6563R;
        c18 c18 = new c18(this.f6564R);
        c18.x(this.f6563R.getContext());
        cAO.Z(c18, this.f6559R);
        PorterDuff.Mode mode = this.f6560R;
        if (mode != null) {
            cAO.m(c18, mode);
        }
        ColorStateList colorStateList = this.f6570v;
        c18.f1920R.c = (float) this.O;
        c18.invalidateSelf();
        c18.g(colorStateList);
        c18 c182 = new c18(this.f6564R);
        c182.setTint(0);
        float f = (float) this.O;
        int t = this.f6565R ? vd.t(this.f6563R, R.attr.colorSurface) : 0;
        c182.f1920R.c = f;
        c182.invalidateSelf();
        c182.g(ColorStateList.valueOf(t));
        c18 c183 = new c18(this.f6564R);
        this.f6562R = c183;
        cAO.L(c183, -1);
        ColorStateList colorStateList2 = this.f6567c;
        if (colorStateList2 == null) {
            colorStateList2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c182, c18}), this.R, this.c, this.v, this.e), this.f6562R);
        this.f6561R = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        c18 v = v(false);
        if (v != null) {
            v.U((float) this.L);
            v.setState(this.f6563R.getDrawableState());
        }
    }

    public final void c(dOE doe) {
        this.f6564R = doe;
        if (v(false) != null) {
            v(false).setShapeAppearanceModel(doe);
        }
        if (v(true) != null) {
            v(true).setShapeAppearanceModel(doe);
        }
        if (R() != null) {
            R().setShapeAppearanceModel(doe);
        }
    }

    public final void e(int i, int i2) {
        MaterialButton materialButton = this.f6563R;
        WeakHashMap weakHashMap = of5.f6887R;
        int O = eHQ.O(materialButton);
        int paddingTop = this.f6563R.getPaddingTop();
        int X = eHQ.X(this.f6563R);
        int paddingBottom = this.f6563R.getPaddingBottom();
        int i3 = this.c;
        int i4 = this.e;
        this.e = i2;
        this.c = i;
        if (!this.f6571v) {
            X();
        }
        eHQ.H(this.f6563R, O, (paddingTop + i) - i3, X, (paddingBottom + i2) - i4);
    }

    public final c18 v(boolean z) {
        RippleDrawable rippleDrawable = this.f6561R;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (c18) ((LayerDrawable) ((InsetDrawable) this.f6561R.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }
}
