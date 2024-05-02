package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: oZi  reason: default package */
/* loaded from: classes.dex */
public final class oZi extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService R;

    public oZi(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.R = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ho5 ho5 = (ho5) iInterface;
        this.R.f1441R.remove(Integer.valueOf(((Integer) obj).intValue()));
    }
}
