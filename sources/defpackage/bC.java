package defpackage;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* renamed from: bC  reason: default package */
/* loaded from: classes.dex */
public final class bC {
    public static final bC R = new bC();

    public final void L(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    public final void O(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public final AutofillId R(ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    public final boolean X(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public final void Z(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    public final boolean c(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public final boolean e(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public final CharSequence m(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }

    public final boolean v(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }
}
