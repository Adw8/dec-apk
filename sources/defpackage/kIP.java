package defpackage;

/* renamed from: kIP  reason: default package */
/* loaded from: classes.dex */
public final class kIP implements hKX, imF {
    public static final Object v = new Object();
    public volatile hKX R;

    /* renamed from: R  reason: collision with other field name */
    public volatile Object f5249R = v;

    public kIP(hKX hkx) {
        this.R = hkx;
    }

    public static hKX c(hKX hkx) {
        return hkx instanceof kIP ? hkx : new kIP(hkx);
    }

    public static imF v(hKX hkx) {
        if (hkx instanceof imF) {
            return (imF) hkx;
        }
        hkx.getClass();
        return new kIP(hkx);
    }

    @Override // defpackage.hKX
    public final Object R() {
        Object obj = this.f5249R;
        Object obj2 = v;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f5249R;
                if (obj == obj2) {
                    obj = this.R.R();
                    Object obj3 = this.f5249R;
                    if (!(obj3 == obj2 || obj3 == obj)) {
                        String valueOf = String.valueOf(obj3);
                        String valueOf2 = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f5249R = obj;
                    this.R = null;
                }
            }
        }
        return obj;
    }
}
