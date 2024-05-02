package defpackage;

import android.view.View;
import android.view.autofill.AutofillManager;

/* renamed from: Zv  reason: default package */
/* loaded from: classes.dex */
public final class Zv implements i8 {
    public final TZ R;

    /* renamed from: R  reason: collision with other field name */
    public final View f671R;

    /* renamed from: R  reason: collision with other field name */
    public final AutofillManager f672R;

    public Zv(View view, TZ tz) {
        this.f671R = view;
        this.R = tz;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f672R = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }
}
