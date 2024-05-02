package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: jDM  reason: default package */
/* loaded from: classes.dex */
public final class jDM extends TC {
    public jDM(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        boolean z = true;
        if (hDC.s(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = hDC.n;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int X = X(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(X == -1 ? false : z)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    e(resourceId, theme);
                }
            }
        }
    }

    public static int X(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i3, typedValue) || typedValue.type != 2) {
                i = typedArray.getDimensionPixelSize(i3, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                i = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
            }
        }
        return i;
    }

    public final void e(int i, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, hDC.z);
        int X = X(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (X >= 0) {
            setLineHeight(X);
        }
    }

    @Override // defpackage.TC, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (hDC.s(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            e(i, context.getTheme());
        }
    }
}
