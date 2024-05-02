package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import dev.kdrag0n.virtcontainer.R;

/* loaded from: classes.dex */
public final class Y extends G5 {
    public final /* synthetic */ ClockFaceView R;

    public Y(ClockFaceView clockFaceView) {
        this.R = clockFaceView;
    }

    @Override // defpackage.G5
    public final boolean L(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.L(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        float x = view.getX() + (((float) view.getWidth()) / 2.0f);
        float height = (((float) view.getHeight()) / 2.0f) + view.getY();
        this.R.f2392R.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x, height, 0));
        this.R.f2392R.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x, height, 0));
        return true;
    }

    @Override // defpackage.G5
    public final void e(View view, jG jGVar) {
        ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            jGVar.f4895R.setTraversalAfter((View) this.R.c.get(intValue - 1));
        }
        jGVar.f4895R.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, intValue, 1, false, view.isSelected()));
        jGVar.f4895R.setClickable(true);
        jGVar.v(Ex.R);
    }
}
