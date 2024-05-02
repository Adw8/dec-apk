package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class Guideline extends View {
    public boolean R = true;

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.R = z;
    }

    public void setGuidelineBegin(int i) {
        nki nki = (nki) getLayoutParams();
        if (!this.R || nki.f6542R != i) {
            nki.f6542R = i;
            setLayoutParams(nki);
        }
    }

    public void setGuidelineEnd(int i) {
        nki nki = (nki) getLayoutParams();
        if (!this.R || nki.f6555v != i) {
            nki.f6555v = i;
            setLayoutParams(nki);
        }
    }

    public void setGuidelinePercent(float f) {
        nki nki = (nki) getLayoutParams();
        if (!this.R || nki.R != f) {
            nki.R = f;
            setLayoutParams(nki);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
