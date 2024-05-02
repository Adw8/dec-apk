package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* renamed from: hpL  reason: default package */
/* loaded from: classes.dex */
public abstract class hpL {
    public static View.AccessibilityDelegate R(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    public static void e(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }

    public static List<Rect> v(View view) {
        return view.getSystemGestureExclusionRects();
    }
}
