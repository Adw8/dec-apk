package defpackage;

import androidx.activity.result.d;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Ks  reason: default package */
/* loaded from: classes.dex */
public final class Ks extends WR {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Serializable f265R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f266R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mjG f267R;

    public /* synthetic */ Ks(Object obj, Serializable serializable, mjG mjg, int i) {
        this.R = i;
        this.f266R = obj;
        this.f265R = serializable;
        this.f267R = mjg;
    }

    @Override // defpackage.WR
    public final void R() {
        switch (this.R) {
            case 0:
                Integer num = (Integer) ((d) this.f266R).v.get((String) this.f265R);
                if (num != null) {
                    ((d) this.f266R).f1024R.add((String) this.f265R);
                    try {
                        ((d) this.f266R).v(num.intValue(), this.f267R);
                        return;
                    } catch (Exception e) {
                        ((d) this.f266R).f1024R.remove((String) this.f265R);
                        throw e;
                    }
                } else {
                    StringBuilder U = opT.U("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                    U.append(this.f267R);
                    U.append(" and input ");
                    U.append((Object) "android.permission.POST_NOTIFICATIONS");
                    U.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    throw new IllegalStateException(U.toString());
                }
            case 1:
                Integer num2 = (Integer) ((d) this.f266R).v.get((String) this.f265R);
                if (num2 != null) {
                    ((d) this.f266R).f1024R.add((String) this.f265R);
                    try {
                        ((d) this.f266R).v(num2.intValue(), this.f267R);
                        return;
                    } catch (Exception e2) {
                        ((d) this.f266R).f1024R.remove((String) this.f265R);
                        throw e2;
                    }
                } else {
                    StringBuilder U2 = opT.U("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                    U2.append(this.f267R);
                    U2.append(" and input ");
                    U2.append((Object) "android.permission.POST_NOTIFICATIONS");
                    U2.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    throw new IllegalStateException(U2.toString());
                }
            default:
                WR wr = (WR) ((AtomicReference) this.f265R).get();
                if (wr != null) {
                    wr.R();
                    return;
                }
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
    }

    @Override // defpackage.WR
    public final void v() {
        switch (this.R) {
            case 0:
                ((d) this.f266R).O((String) this.f265R);
                return;
            case 1:
                ((d) this.f266R).O((String) this.f265R);
                return;
            default:
                WR wr = (WR) ((AtomicReference) this.f265R).getAndSet(null);
                if (wr != null) {
                    wr.v();
                    return;
                }
                return;
        }
    }
}
