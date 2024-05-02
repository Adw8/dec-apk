package androidx.preference;

import android.content.res.TypedArray;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903428(0x7f030184, float:1.7413674E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = defpackage.hDC.N(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = defpackage.me6.f6101c
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L_0x002e
            aYa r5 = defpackage.aYa.R
            if (r5 != 0) goto L_0x002a
            aYa r5 = new aYa
            r0 = 7
            r5.<init>(r0)
            defpackage.aYa.R = r5
        L_0x002a:
            aYa r5 = defpackage.aYa.R
            r3.f1355R = r5
        L_0x002e:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
