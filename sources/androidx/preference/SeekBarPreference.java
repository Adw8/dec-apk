package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import dev.kdrag0n.virtcontainer.R;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int L;
    public int O;
    public int X;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, me6.m, R.attr.seekBarPreferenceStyle, 0);
        this.X = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.X;
        i = i < i2 ? i2 : i;
        if (i != this.O) {
            this.O = i;
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.L) {
            this.L = Math.min(this.O - this.X, Math.abs(i3));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }
}
