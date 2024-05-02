package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b2X  reason: default package */
/* loaded from: classes.dex */
public final class b2X extends mjG implements ed5 {
    public static AtomicInteger R = new AtomicInteger(0);

    /* renamed from: R  reason: collision with other field name */
    public final kEW f1512R;

    public b2X(boolean z, boolean z2, kg9 kg9, kg9 kg92) {
        kEW kew = new kEW();
        kew.f5221R = z;
        kew.v = z2;
        kg9.x(kew);
        this.f1512R = kew;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2X) && n3x.v(this.f1512R, ((b2X) obj).f1512R);
    }

    public final int hashCode() {
        return this.f1512R.hashCode();
    }
}
