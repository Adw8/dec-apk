package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: nY  reason: default package */
/* loaded from: classes.dex */
public class nY extends SeekBar {
    public final G0 R;

    public nY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        lM2.R(this, getContext());
        G0 g0 = new G0(this);
        this.R = g0;
        g0.R(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        G0 g0 = this.R;
        Drawable drawable = g0.f153R;
        if (drawable != null && drawable.isStateful() && drawable.setState(g0.f154R.getDrawableState())) {
            g0.f154R.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.R.f153R;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.R.e(canvas);
    }
}
