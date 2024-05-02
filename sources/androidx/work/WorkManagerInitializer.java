package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements pme {
    public static final String R = kfk.P("WrkMgrInitializer");

    @Override // defpackage.pme
    public final List R() {
        return Collections.emptyList();
    }

    @Override // defpackage.pme
    public final Object v(Context context) {
        kfk.U().x(R, "Initializing WorkManager with default configuration.", new Throwable[0]);
        jFe.v(context, new l_s(new dOV()));
        return jFe.R(context);
    }
}
