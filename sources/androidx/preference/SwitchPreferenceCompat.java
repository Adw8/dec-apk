package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import dev.kdrag0n.virtcontainer.R;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, me6.H, R.attr.switchPreferenceCompatStyle, 0);
        hDC.Y(obtainStyledAttributes, 7, 0);
        hDC.Y(obtainStyledAttributes, 6, 1);
        hDC.Y(obtainStyledAttributes, 9, 3);
        hDC.Y(obtainStyledAttributes, 8, 4);
        obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
