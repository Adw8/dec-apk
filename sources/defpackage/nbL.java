package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: nbL  reason: default package */
/* loaded from: classes.dex */
public final class nbL extends ThreadLocal {
    public final /* synthetic */ bDg R;

    public nbL(bDg bdg) {
        this.R = bdg;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            Mac mac = (Mac) aXa.v.R(this.R.f1577R);
            mac.init(this.R.f1578R);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
