package defpackage;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.Set;

/* renamed from: oS2  reason: default package */
/* loaded from: classes.dex */
public final class oS2 implements cGr {
    public final /* synthetic */ Dd R;

    public oS2(Q0 q0) {
        this.R = q0;
    }

    @Override // defpackage.cGr
    public final Set R() {
        return ((Map) this.R.v).keySet();
    }

    @Override // defpackage.cGr
    public final h5 X(Class cls) {
        try {
            return new h5(this.R, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // defpackage.cGr
    public final Class c() {
        return this.R.getClass();
    }

    @Override // defpackage.cGr
    public final h5 e() {
        Dd dd = this.R;
        return new h5(dd, (Class) dd.c);
    }

    @Override // defpackage.cGr
    public final Class v() {
        return null;
    }
}
