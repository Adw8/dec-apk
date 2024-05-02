package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import dev.kdrag0n.virtcontainer.R;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public Context R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f1352R;

    /* renamed from: R  reason: collision with other field name */
    public Object f1353R;

    /* renamed from: R  reason: collision with other field name */
    public String f1354R;

    /* renamed from: R  reason: collision with other field name */
    public nYE f1355R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1356R;
    public int e;
    public CharSequence v;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.e = Integer.MAX_VALUE;
        this.f1356R = true;
        this.R = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, me6.O, i, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        this.f1354R = hDC.Y(obtainStyledAttributes, 26, 6);
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f1352R = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.v = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.e = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        hDC.Y(obtainStyledAttributes, 22, 13);
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        this.f1356R = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        hDC.Y(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, this.f1356R));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, this.f1356R));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f1353R = c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f1353R = c(obtainStyledAttributes, 11);
        }
        obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        if (obtainStyledAttributes.hasValue(32)) {
            obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public CharSequence R() {
        nYE nye = this.f1355R;
        return nye != null ? nye.e(this) : this.v;
    }

    public Object c(TypedArray typedArray, int i) {
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.e;
        int i2 = preference2.e;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f1352R;
        CharSequence charSequence2 = preference2.f1352R;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f1352R.toString());
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f1352R;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence R = R();
        if (!TextUtils.isEmpty(R)) {
            sb.append(R);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void v() {
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hDC.N(context, R.attr.preferenceStyle, 16842894));
    }
}
