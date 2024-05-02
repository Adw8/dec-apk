package defpackage;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.h;

/* renamed from: krp  reason: default package */
/* loaded from: classes.dex */
public final class krp extends k8G implements f_c {
    public final /* synthetic */ j5B R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ krp(j5B j5b) {
        super(0);
        this.R = j5b;
    }

    @Override // defpackage.f_c
    public final Object g() {
        Context context = this.R.R;
        Application application = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        }
        j5B j5b = this.R;
        return new h(application, j5b, j5b.f4820R);
    }
}
