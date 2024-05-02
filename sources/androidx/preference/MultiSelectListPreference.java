package androidx.preference;

import android.content.res.TypedArray;
import java.util.HashSet;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r3, android.util.AttributeSet r4) {
        /*
            r2 = this;
            r0 = 2130903391(0x7f03015f, float:1.7413599E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = defpackage.hDC.N(r3, r0, r1)
            r2.<init>(r3, r4, r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            int[] r2 = defpackage.me6.X
            r1 = 0
            android.content.res.TypedArray r2 = r3.obtainStyledAttributes(r4, r2, r0, r1)
            r3 = 2
            java.lang.CharSequence[] r3 = r2.getTextArray(r3)
            if (r3 != 0) goto L_0x0023
            r2.getTextArray(r1)
        L_0x0023:
            r3 = 3
            r4 = 1
            java.lang.CharSequence[] r3 = r2.getTextArray(r3)
            if (r3 != 0) goto L_0x002e
            r2.getTextArray(r4)
        L_0x002e:
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
