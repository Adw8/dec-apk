package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* renamed from: diN  reason: default package */
/* loaded from: classes.dex */
public final class diN {
    public static final Logger R = Logger.getLogger(diN.class.getName());

    /* renamed from: R  reason: collision with other field name */
    public final ConcurrentHashMap f2829R;

    public diN(diN din) {
        this.f2829R = new ConcurrentHashMap(din.f2829R);
    }

    public final h5 R(Class cls, String str) {
        cGr v = v(str);
        if (v.R().contains(cls)) {
            return v.X(cls);
        }
        StringBuilder U = opT.U("Primitive type ");
        U.append(cls.getName());
        U.append(" not supported by key manager of type ");
        U.append(v.c());
        U.append(", supported primitives: ");
        Set<Class> R2 = v.R();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : R2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        U.append(sb.toString());
        throw new GeneralSecurityException(U.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0066, code lost:
        r5.f2829R.putIfAbsent(r0, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void X(defpackage.cGr r6, boolean r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            h5 r0 = r6.e()     // Catch: all -> 0x0073
            java.lang.Object r0 = r0.R     // Catch: all -> 0x0073
            Dd r0 = (defpackage.Dd) r0     // Catch: all -> 0x0073
            java.lang.String r0 = r0.P()     // Catch: all -> 0x0073
            java.util.concurrent.ConcurrentHashMap r1 = r5.f2829R     // Catch: all -> 0x0073
            java.lang.Object r1 = r1.get(r0)     // Catch: all -> 0x0073
            cGr r1 = (defpackage.cGr) r1     // Catch: all -> 0x0073
            if (r1 == 0) goto L_0x0064
            java.lang.Class r2 = r1.c()     // Catch: all -> 0x0073
            java.lang.Class r3 = r6.c()     // Catch: all -> 0x0073
            boolean r2 = r2.equals(r3)     // Catch: all -> 0x0073
            if (r2 == 0) goto L_0x0026
            goto L_0x0064
        L_0x0026:
            java.util.logging.Logger r7 = defpackage.diN.R     // Catch: all -> 0x0073
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x0073
            r2.<init>()     // Catch: all -> 0x0073
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch: all -> 0x0073
            r2.append(r0)     // Catch: all -> 0x0073
            java.lang.String r2 = r2.toString()     // Catch: all -> 0x0073
            r7.warning(r2)     // Catch: all -> 0x0073
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: all -> 0x0073
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: all -> 0x0073
            r4 = 0
            r3[r4] = r0     // Catch: all -> 0x0073
            r0 = 1
            java.lang.Class r1 = r1.c()     // Catch: all -> 0x0073
            java.lang.String r1 = r1.getName()     // Catch: all -> 0x0073
            r3[r0] = r1     // Catch: all -> 0x0073
            r0 = 2
            java.lang.Class r6 = r6.c()     // Catch: all -> 0x0073
            java.lang.String r6 = r6.getName()     // Catch: all -> 0x0073
            r3[r0] = r6     // Catch: all -> 0x0073
            java.lang.String r6 = java.lang.String.format(r2, r3)     // Catch: all -> 0x0073
            r7.<init>(r6)     // Catch: all -> 0x0073
            throw r7     // Catch: all -> 0x0073
        L_0x0064:
            if (r7 != 0) goto L_0x006c
            java.util.concurrent.ConcurrentHashMap r7 = r5.f2829R     // Catch: all -> 0x0073
            r7.putIfAbsent(r0, r6)     // Catch: all -> 0x0073
            goto L_0x0071
        L_0x006c:
            java.util.concurrent.ConcurrentHashMap r7 = r5.f2829R     // Catch: all -> 0x0073
            r7.put(r0, r6)     // Catch: all -> 0x0073
        L_0x0071:
            monitor-exit(r5)
            return
        L_0x0073:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.diN.X(cGr, boolean):void");
    }

    public final synchronized void c(guO guo, Q0 q0) {
        Class v;
        oDI odi = eqw.f3215R;
        eqw z = q0.z();
        if (!odi.R()) {
            throw new GeneralSecurityException("failed to register key manager " + guo.getClass() + " as it is not FIPS compatible.");
        } else if (z.R()) {
            String P = guo.P();
            String P2 = q0.P();
            if (this.f2829R.containsKey(P) && ((cGr) this.f2829R.get(P)).v() != null && (v = ((cGr) this.f2829R.get(P)).v()) != null && !v.getName().equals(Q0.class.getName())) {
                Logger logger = R;
                logger.warning("Attempted overwrite of a registered key manager for key type " + P + " with inconsistent public key type " + P2);
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", guo.getClass().getName(), v.getName(), Q0.class.getName()));
            }
            X(new kPZ(guo, q0), true);
            X(new oS2(q0), false);
        } else {
            throw new GeneralSecurityException("failed to register key manager " + Q0.class + " as it is not FIPS compatible.");
        }
    }

    public final synchronized void e(Q0 q0) {
        if (q0.z().R()) {
            X(new oS2(q0), false);
        } else {
            throw new GeneralSecurityException("failed to register key manager " + Q0.class + " as it is not FIPS compatible.");
        }
    }

    public final synchronized cGr v(String str) {
        if (this.f2829R.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (cGr) this.f2829R.get(str);
    }

    public diN() {
        this.f2829R = new ConcurrentHashMap();
    }
}
