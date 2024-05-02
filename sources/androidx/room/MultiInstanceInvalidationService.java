package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int e = 0;

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f1441R = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public final oZi f1442R = new oZi(this);
    public final i1V R = new i1V(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.R;
    }
}
