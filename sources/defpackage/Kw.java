package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: Kw  reason: default package */
/* loaded from: classes.dex */
public final class Kw extends BroadcastReceiver {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f268R;

    public /* synthetic */ Kw(int i, Object obj) {
        this.R = i;
        this.f268R = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.R) {
            case 0:
                ((Xb) this.f268R).H();
                return;
            case 1:
                if (intent != null) {
                    ((j4) this.f268R).O(intent);
                    return;
                }
                return;
            default:
                ((hd8) this.f268R).R(intent);
                return;
        }
    }

    public /* synthetic */ Kw(hd8 hd8) {
        this.R = 3;
        this.f268R = hd8;
    }
}
