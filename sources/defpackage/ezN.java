package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Type;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/* renamed from: ezN  reason: default package */
/* loaded from: classes.dex */
public final class ezN implements Ia, l9F {
    public Object R;

    public /* synthetic */ ezN(Object obj) {
        this.R = obj;
    }

    @Override // defpackage.Ia
    public final Object R(oEG oeg) {
        fi1 fi1 = new fi1(oeg);
        oeg.H(new f67(this, 0, fi1));
        return fi1;
    }

    @Override // defpackage.l9F
    public final Object X(Object obj) {
        return Optional.ofNullable(((l9F) this.R).X((arx) obj));
    }

    @Override // defpackage.Ia
    public final Type e() {
        return (Type) this.R;
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public ezN(int i) {
        this(Looper.getMainLooper());
        if (i != 3) {
        } else {
            this(TimeUnit.MINUTES);
        }
    }

    public /* synthetic */ ezN(Looper looper) {
        this.R = new Handler(looper);
    }

    public /* synthetic */ ezN(TimeUnit timeUnit) {
        this.R = new l_c(i97.R, timeUnit);
    }
}
