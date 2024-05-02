package defpackage;

import dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService;
import java.io.Serializable;

/* renamed from: kk  reason: default package */
/* loaded from: classes.dex */
public final class kk implements lbd, Serializable {
    public final Class R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f5406R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5407R = false;
    public final int e = 2;

    public kk(AdbPairingService adbPairingService, Class cls) {
        this.f5406R = adbPairingService;
        this.R = cls;
    }

    @Override // defpackage.lbd
    public final int W() {
        return 2;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk)) {
            return false;
        }
        kk kkVar = (kk) obj;
        return this.f5407R == kkVar.f5407R && this.e == kkVar.e && n3x.v(this.f5406R, kkVar.f5406R) && n3x.v(this.R, kkVar.R);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        Object obj = this.f5406R;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.R;
        if (cls != null) {
            i = cls.hashCode();
        }
        return ((((((((((hashCode + i) * 31) - 376295340) * 31) + 1532146321) * 31) + (this.f5407R ? 1231 : 1237)) * 31) + 2) * 31) + this.e;
    }

    @Override // java.lang.Object
    public final String toString() {
        g8d.R.getClass();
        return j3H.R(this);
    }
}
