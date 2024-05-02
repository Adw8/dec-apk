package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: lOA  reason: default package */
/* loaded from: classes.dex */
public final class lOA extends ResultReceiver {
    public final /* synthetic */ cqI R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lOA(Handler handler, cqI cqi) {
        super(handler);
        this.R = cqi;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.R.v(null);
    }
}
