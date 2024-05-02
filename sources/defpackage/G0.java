package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* renamed from: G0  reason: default package */
/* loaded from: classes.dex */
public final class G0 extends Nk {

    /* renamed from: R  reason: collision with other field name */
    public Drawable f153R;

    /* renamed from: R  reason: collision with other field name */
    public final SeekBar f154R;
    public ColorStateList R = null;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f152R = null;

    /* renamed from: R  reason: collision with other field name */
    public boolean f155R = false;
    public boolean v = false;

    public G0(SeekBar seekBar) {
        super(seekBar);
        this.f154R = seekBar;
    }

    @Override // defpackage.Nk
    public final void R(AttributeSet attributeSet, int i) {
        super.R(attributeSet, R.attr.seekBarStyle);
        Context context = this.f154R.getContext();
        int[] iArr = iTI.L;
        CV h = CV.h(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        SeekBar seekBar = this.f154R;
        Context context2 = seekBar.getContext();
        TypedArray typedArray = (TypedArray) h.v;
        WeakHashMap weakHashMap = of5.f6887R;
        hpL.c(seekBar, context2, iArr, attributeSet, typedArray, R.attr.seekBarStyle, 0);
        Drawable C = h.C(0);
        if (C != null) {
            this.f154R.setThumb(C);
        }
        Drawable U = h.U(1);
        Drawable drawable = this.f153R;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f153R = U;
        if (U != null) {
            U.setCallback(this.f154R);
            f4J.v(U, eHQ.e(this.f154R));
            if (U.isStateful()) {
                U.setState(this.f154R.getDrawableState());
            }
            c();
        }
        this.f154R.invalidate();
        if (h.o(3)) {
            this.f152R = mTA.v(h.P(3, -1), this.f152R);
            this.v = true;
        }
        if (h.o(2)) {
            this.R = h.m(2);
            this.f155R = true;
        }
        h.z();
        c();
    }

    public final void c() {
        Drawable drawable = this.f153R;
        if (drawable == null) {
            return;
        }
        if (this.f155R || this.v) {
            Drawable mutate = drawable.mutate();
            this.f153R = mutate;
            if (this.f155R) {
                cAO.Z(mutate, this.R);
            }
            if (this.v) {
                cAO.m(this.f153R, this.f152R);
            }
            if (this.f153R.isStateful()) {
                this.f153R.setState(this.f154R.getDrawableState());
            }
        }
    }

    public final void e(Canvas canvas) {
        if (this.f153R != null) {
            int max = this.f154R.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f153R.getIntrinsicWidth();
                int intrinsicHeight = this.f153R.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f153R.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f154R.getWidth() - this.f154R.getPaddingLeft()) - this.f154R.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f154R.getPaddingLeft(), (float) (this.f154R.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f153R.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
