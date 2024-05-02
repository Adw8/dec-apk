package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: kV5  reason: default package */
/* loaded from: classes.dex */
public final class kV5 {
    public static final kV5 R = new kV5();

    /* renamed from: R  reason: collision with other field name */
    public final ConcurrentHashMap f5311R = new ConcurrentHashMap();

    /* renamed from: R  reason: collision with other field name */
    public final eEJ f5310R = new eEJ();

    public final bvr R(Class cls) {
        bvr bvr;
        Class cls2;
        Charset charset = ibk.R;
        if (cls != null) {
            bvr bvr2 = (bvr) this.f5311R.get(cls);
            if (bvr2 != null) {
                return bvr2;
            }
            eEJ eej = this.f5310R;
            eej.getClass();
            Class cls3 = dA8.R;
            if (csA.class.isAssignableFrom(cls) || (cls2 = dA8.R) == null || cls2.isAssignableFrom(cls)) {
                bWV R2 = eej.f3039R.R(cls);
                kob kob = (kob) R2;
                boolean z = true;
                if ((kob.R & 2) == 2) {
                    if (csA.class.isAssignableFrom(cls)) {
                        bvr = new o3w(dA8.c, irI.R, kob.f5434R);
                    } else {
                        k3o k3o = dA8.f2516R;
                        aVf avf = irI.v;
                        if (avf != null) {
                            bvr = new o3w(k3o, avf, kob.f5434R);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                } else if (csA.class.isAssignableFrom(cls)) {
                    if (kob.e() != 1) {
                        z = false;
                    }
                    bvr = z ? m6r.Y(R2, iG8.v, hwQ.f4423R, dA8.c, irI.R, aeJ.v) : m6r.Y(R2, iG8.v, hwQ.f4423R, dA8.c, null, aeJ.v);
                } else {
                    if (kob.e() != 1) {
                        z = false;
                    }
                    if (z) {
                        mxz mxz = iG8.R;
                        fi4 fi4 = hwQ.R;
                        k3o k3o2 = dA8.f2516R;
                        aVf avf2 = irI.v;
                        if (avf2 != null) {
                            bvr = m6r.Y(R2, mxz, fi4, k3o2, avf2, aeJ.R);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        bvr = m6r.Y(R2, iG8.R, hwQ.R, dA8.v, null, aeJ.R);
                    }
                }
                bvr bvr3 = (bvr) this.f5311R.putIfAbsent(cls, bvr);
                return bvr3 != null ? bvr3 : bvr;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
