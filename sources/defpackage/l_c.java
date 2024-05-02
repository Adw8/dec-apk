package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: l_c  reason: default package */
/* loaded from: classes.dex */
public final class l_c {

    /* renamed from: R  reason: collision with other field name */
    public final long f5780R;

    /* renamed from: R  reason: collision with other field name */
    public final hiT f5782R;
    public final int R = 5;

    /* renamed from: R  reason: collision with other field name */
    public final aHy f5781R = new aHy(this, jQ.g(new StringBuilder(), khE.f5394R, " ConnectionPool"));

    /* renamed from: R  reason: collision with other field name */
    public final ConcurrentLinkedQueue f5783R = new ConcurrentLinkedQueue();

    public l_c(i97 i97, TimeUnit timeUnit) {
        this.f5780R = timeUnit.toNanos(5);
        this.f5782R = i97.O();
    }

    public final int R(ot7 ot7, long j) {
        bd4 bd4 = khE.R;
        ArrayList arrayList = ot7.f7002R;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder U = opT.U("A connection to ");
                U.append(ot7.f6999R.R.f3093R);
                U.append(" was leaked. Did you forget to close a response body?");
                String sb = U.toString();
                oMv omv = oMv.f6773R;
                oMv.f6773R.x(((izQ) reference).R, sb);
                arrayList.remove(i);
                ot7.f7006R = true;
                if (arrayList.isEmpty()) {
                    ot7.f6996R = j - this.f5780R;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
