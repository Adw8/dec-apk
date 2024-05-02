package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: fi6  reason: default package */
/* loaded from: classes.dex */
public class fi6 extends ViewGroup {
    public boolean R;

    public fi6(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void R(Gp gp, View view, long j) {
        Canvas canvas = dO.R;
        super.drawChild(((W3) gp).R, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        int childCount = super.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            } else if (((pzb) getChildAt(i)).v) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.R = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.R = false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.R) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
