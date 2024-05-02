package defpackage;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.Set;

/* renamed from: kPZ  reason: default package */
/* loaded from: classes.dex */
public final class kPZ implements cGr {
    public final /* synthetic */ Dd R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ guO f5285R;

    public kPZ(guO guo, Q0 q0) {
        this.f5285R = guo;
        this.R = q0;
    }

    @Override // defpackage.cGr
    public final Set R() {
        return ((Map) this.f5285R.v).keySet();
    }

    @Override // defpackage.cGr
    public final h5 X(Class cls) {
        try {
            return new b0e(this.f5285R, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // defpackage.cGr
    public final Class c() {
        return this.f5285R.getClass();
    }

    @Override // defpackage.cGr
    public final h5 e() {
        guO guo = this.f5285R;
        return new b0e(guo, (Class) guo.c);
    }

    @Override // defpackage.cGr
    public final Class v() {
        return this.R.getClass();
    }
}
