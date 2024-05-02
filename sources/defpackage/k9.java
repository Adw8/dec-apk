package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* renamed from: k9  reason: default package */
/* loaded from: classes.dex */
public final class k9 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ g22 f5203R;

    public k9(Configuration configuration, g22 g22) {
        this.R = configuration;
        this.f5203R = g22;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int updateFrom = this.R.updateFrom(configuration);
        Iterator it = this.f5203R.R.entrySet().iterator();
        while (it.hasNext()) {
            jjm jjm = (jjm) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (jjm == null || Configuration.needNewResources(updateFrom, jjm.R)) {
                it.remove();
            }
        }
        this.R.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f5203R.R.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.f5203R.R.clear();
    }
}
