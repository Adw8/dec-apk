package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import dev.kdrag0n.virtcontainer.R;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] R;
    public String v;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, me6.e, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.R = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (n2G.R == null) {
                n2G.R = new n2G(7, null);
            }
            ((Preference) this).f1355R = n2G.R;
            v();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, me6.O, i, 0);
        this.v = hDC.Y(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence R() {
        nYE nye = ((Preference) this).f1355R;
        if (nye != null) {
            return nye.e(this);
        }
        CharSequence e = e();
        CharSequence R = super.R();
        String str = this.v;
        if (str == null) {
            return R;
        }
        Object[] objArr = new Object[1];
        if (e == null) {
            e = "";
        }
        objArr[0] = e;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, R)) {
            return R;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final CharSequence e() {
        return null;
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hDC.N(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
