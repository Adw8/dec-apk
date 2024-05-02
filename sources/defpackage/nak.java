package defpackage;

/* renamed from: nak  reason: default package */
/* loaded from: classes.dex */
public final class nak implements lXY, pir {
    public static final Object v = new Object();
    public volatile Object R = v;

    /* renamed from: R  reason: collision with other field name */
    public volatile lXY f6472R;

    public nak(lXY lxy) {
        this.f6472R = lxy;
    }

    public static pir R(lXY lxy) {
        if (lxy instanceof pir) {
            return (pir) lxy;
        }
        lxy.getClass();
        return new nak(lxy);
    }

    public static void c(Object obj, Object obj2) {
        if ((obj != v) && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
    }

    public static lXY v(lXY lxy) {
        return lxy instanceof nak ? lxy : new nak(lxy);
    }

    @Override // defpackage.lXY
    public final Object get() {
        Object obj = this.R;
        Object obj2 = v;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.R;
                if (obj == obj2) {
                    obj = this.f6472R.get();
                    c(this.R, obj);
                    this.R = obj;
                    this.f6472R = null;
                }
            }
        }
        return obj;
    }
}
