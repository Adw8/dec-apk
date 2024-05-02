package defpackage;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;

/* renamed from: fwW  reason: default package */
/* loaded from: classes.dex */
public final class fwW extends k8G implements f_c {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fwW(int i, Object obj) {
        super(0);
        this.X = i;
        this.R = obj;
    }

    @Override // defpackage.f_c
    public final Object g() {
        k0 t;
        switch (this.X) {
            case 0:
                HashMap hashMap = new HashMap();
                mMV mmv = (mMV) this.R;
                int size = mmv.f6017R.size();
                for (int i = 0; i < size; i++) {
                    kFD kfd = (kFD) mmv.f6017R.get(i);
                    Object jck = kfd.f5223R != null ? new jCk(Integer.valueOf(kfd.R), kfd.f5223R) : Integer.valueOf(kfd.R);
                    Object obj = hashMap.get(jck);
                    if (obj == null) {
                        obj = new LinkedHashSet();
                        hashMap.put(jck, obj);
                    }
                    ((LinkedHashSet) obj).add(kfd);
                }
                return hashMap;
            default:
                fLL fll = (fLL) this.R;
                synchronized (fll.f3384R) {
                    t = fll.t();
                    if (((a8X) fll.f3383R.getValue()).compareTo(a8X.ShuttingDown) <= 0) {
                        Throwable th = fll.f3385R;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (t != null) {
                    ((xx) t).Y(o8s.R);
                }
                return o8s.R;
        }
    }
}
