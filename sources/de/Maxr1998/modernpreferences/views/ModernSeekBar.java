package de.Maxr1998.modernpreferences.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ModernSeekBar extends nY {
    public Drawable R;

    /* renamed from: R  reason: collision with other field name */
    public Integer f2694R;
    public Drawable v;

    public ModernSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void setDefaultMarkerDrawable(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            WeakHashMap weakHashMap = of5.f6887R;
            f4J.v(drawable, eHQ.e(this));
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
        invalidate();
    }

    private final void setTickMarkDrawable(Drawable drawable) {
        Drawable drawable2 = this.R;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            WeakHashMap weakHashMap = of5.f6887R;
            f4J.v(drawable, eHQ.e(this));
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
        invalidate();
    }

    @Override // defpackage.nY, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.R;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidateDrawable(drawable);
        }
        Drawable drawable2 = this.v;
        if (drawable2 != null && drawable2.isStateful() && drawable2.setState(getDrawableState())) {
            invalidateDrawable(drawable2);
        }
    }

    public final Integer getDefault() {
        return this.f2694R;
    }

    public final boolean getHasTickMarks() {
        return this.R != null;
    }

    @Override // defpackage.nY, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.R;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.v;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
    }

    @Override // defpackage.nY, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        int intValue;
        Drawable drawable;
        int max;
        super.onDraw(canvas);
        Drawable drawable2 = this.R;
        int i = 1;
        if (drawable2 != null && (max = getMax()) > 0) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            int intrinsicHeight = drawable2.getIntrinsicHeight();
            int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
            int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
            drawable2.setBounds(-i2, -i3, i2, i3);
            float width = ((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) / ((float) max);
            int save = canvas.save();
            canvas.translate((float) getPaddingLeft(), ((float) getHeight()) / 2.0f);
            int i4 = max + 1;
            for (int i5 = 0; i5 < i4; i5++) {
                drawable2.draw(canvas);
                canvas.translate(width, 0.0f);
            }
            canvas.restoreToCount(save);
        }
        Integer num = this.f2694R;
        if (!(num == null || (intValue = num.intValue()) == getProgress() || (drawable = this.v) == null)) {
            int intrinsicWidth2 = drawable.getIntrinsicWidth();
            int intrinsicHeight2 = drawable.getIntrinsicHeight();
            int i6 = intrinsicWidth2 >= 0 ? intrinsicWidth2 / 2 : 1;
            if (intrinsicHeight2 >= 0) {
                i = intrinsicHeight2 / 2;
            }
            drawable.setBounds(-i6, -i, i6, i);
            int save2 = canvas.save();
            canvas.translate(((float) getPaddingLeft()) + (((float) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * intValue)) / ((float) getMax())), ((float) getHeight()) / 2.0f);
            drawable.draw(canvas);
            canvas.restoreToCount(save2);
        }
    }

    public final void setDefault(Integer num) {
        boolean z = true;
        if (num != null) {
            heu heu = new heu(0, getMax());
            int intValue = num.intValue();
            if (!(intValue >= 0 && intValue <= heu.X)) {
                z = false;
            }
        }
        if (z) {
            this.f2694R = num;
            if (num == null) {
                setDefaultMarkerDrawable(null);
            } else if (this.v == null) {
                Context context = getContext();
                Object obj = C1.R;
                setDefaultMarkerDrawable(eNe.v(context, R.drawable.map_seekbar_default_marker));
            }
        } else {
            throw new IllegalArgumentException(("Default must be in range 0 to max (is " + num + ')').toString());
        }
    }

    public final void setHasTickMarks(boolean z) {
        Drawable drawable;
        if (z) {
            drawable = this.R;
            if (drawable == null) {
                Context context = getContext();
                Object obj = C1.R;
                drawable = eNe.v(context, R.drawable.map_seekbar_tick_mark);
            }
        } else {
            drawable = null;
        }
        setTickMarkDrawable(drawable);
    }
}
