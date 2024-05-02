package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* renamed from: kWP  reason: default package */
/* loaded from: classes.dex */
public abstract class kWP {

    /* renamed from: R  reason: collision with other field name */
    public static final Logger f5319R = Logger.getLogger(kWP.class.getName());

    /* renamed from: R  reason: collision with other field name */
    public static final AtomicReference f5318R = new AtomicReference(new diN());
    public static final ConcurrentHashMap R = new ConcurrentHashMap();
    public static final ConcurrentHashMap v = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    static {
        new ConcurrentHashMap();
    }

    public static synchronized void L(Q0 q0, boolean z) {
        synchronized (kWP.class) {
            try {
                AtomicReference atomicReference = f5318R;
                diN din = new diN((diN) atomicReference.get());
                din.e(q0);
                String P = q0.P();
                R(P, z ? q0.y().e() : Collections.emptyMap(), z);
                if (!((diN) atomicReference.get()).f2829R.containsKey(P)) {
                    R.put(P, new h89(26, q0));
                    if (z) {
                        Z(P, q0.y().e());
                    }
                }
                v.put(P, Boolean.valueOf(z));
                atomicReference.set(din);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void O(guO guo, Q0 q0) {
        synchronized (kWP.class) {
            AtomicReference atomicReference = f5318R;
            diN din = new diN((diN) atomicReference.get());
            din.c(guo, q0);
            String P = guo.P();
            String P2 = q0.P();
            R(P, guo.y().e(), true);
            R(P2, Collections.emptyMap(), false);
            if (!((diN) atomicReference.get()).f2829R.containsKey(P)) {
                R.put(P, new h89(26, guo));
                Z(guo.P(), guo.y().e());
            }
            ConcurrentHashMap concurrentHashMap = v;
            concurrentHashMap.put(P, Boolean.TRUE);
            concurrentHashMap.put(P2, Boolean.FALSE);
            atomicReference.set(din);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (((defpackage.diN) defpackage.kWP.f5318R.get()).f2829R.containsKey(r3) == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r4 = r4.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r4.hasNext() == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        r5 = (java.util.Map.Entry) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (defpackage.kWP.e.containsKey(r5.getKey()) == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0088, code lost:
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + ((java.lang.String) r5.getKey()) + " from an existing key manager of type " + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        r3 = r4.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        if (r3.hasNext() == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        r4 = (java.util.Map.Entry) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a7, code lost:
        if (defpackage.kWP.e.containsKey(r4.getKey()) != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c6, code lost:
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + ((java.lang.String) r4.getKey()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void R(java.lang.String r3, java.util.Map r4, boolean r5) {
        /*
            java.lang.Class<kWP> r0 = defpackage.kWP.class
            monitor-enter(r0)
            if (r5 == 0) goto L_0x0031
            java.util.concurrent.ConcurrentHashMap r1 = defpackage.kWP.v     // Catch: all -> 0x00c7
            boolean r2 = r1.containsKey(r3)     // Catch: all -> 0x00c7
            if (r2 == 0) goto L_0x0031
            java.lang.Object r1 = r1.get(r3)     // Catch: all -> 0x00c7
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: all -> 0x00c7
            boolean r1 = r1.booleanValue()     // Catch: all -> 0x00c7
            if (r1 == 0) goto L_0x001a
            goto L_0x0031
        L_0x001a:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: all -> 0x00c7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x00c7
            r5.<init>()     // Catch: all -> 0x00c7
            java.lang.String r1 = "New keys are already disallowed for key type "
            r5.append(r1)     // Catch: all -> 0x00c7
            r5.append(r3)     // Catch: all -> 0x00c7
            java.lang.String r3 = r5.toString()     // Catch: all -> 0x00c7
            r4.<init>(r3)     // Catch: all -> 0x00c7
            throw r4     // Catch: all -> 0x00c7
        L_0x0031:
            if (r5 == 0) goto L_0x00ca
            java.util.concurrent.atomic.AtomicReference r5 = defpackage.kWP.f5318R     // Catch: all -> 0x00c7
            java.lang.Object r5 = r5.get()     // Catch: all -> 0x00c7
            diN r5 = (defpackage.diN) r5     // Catch: all -> 0x00c7
            java.util.concurrent.ConcurrentHashMap r5 = r5.f2829R     // Catch: all -> 0x00c7
            boolean r5 = r5.containsKey(r3)     // Catch: all -> 0x00c7
            if (r5 == 0) goto L_0x0089
            java.util.Set r4 = r4.entrySet()     // Catch: all -> 0x00c7
            java.util.Iterator r4 = r4.iterator()     // Catch: all -> 0x00c7
        L_0x004b:
            boolean r5 = r4.hasNext()     // Catch: all -> 0x00c7
            if (r5 == 0) goto L_0x00ca
            java.lang.Object r5 = r4.next()     // Catch: all -> 0x00c7
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: all -> 0x00c7
            java.util.concurrent.ConcurrentHashMap r1 = defpackage.kWP.e     // Catch: all -> 0x00c7
            java.lang.Object r2 = r5.getKey()     // Catch: all -> 0x00c7
            boolean r1 = r1.containsKey(r2)     // Catch: all -> 0x00c7
            if (r1 == 0) goto L_0x0064
            goto L_0x004b
        L_0x0064:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: all -> 0x00c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x00c7
            r1.<init>()     // Catch: all -> 0x00c7
            java.lang.String r2 = "Attempted to register a new key template "
            r1.append(r2)     // Catch: all -> 0x00c7
            java.lang.Object r5 = r5.getKey()     // Catch: all -> 0x00c7
            java.lang.String r5 = (java.lang.String) r5     // Catch: all -> 0x00c7
            r1.append(r5)     // Catch: all -> 0x00c7
            java.lang.String r5 = " from an existing key manager of type "
            r1.append(r5)     // Catch: all -> 0x00c7
            r1.append(r3)     // Catch: all -> 0x00c7
            java.lang.String r3 = r1.toString()     // Catch: all -> 0x00c7
            r4.<init>(r3)     // Catch: all -> 0x00c7
            throw r4     // Catch: all -> 0x00c7
        L_0x0089:
            java.util.Set r3 = r4.entrySet()     // Catch: all -> 0x00c7
            java.util.Iterator r3 = r3.iterator()     // Catch: all -> 0x00c7
        L_0x0091:
            boolean r4 = r3.hasNext()     // Catch: all -> 0x00c7
            if (r4 == 0) goto L_0x00ca
            java.lang.Object r4 = r3.next()     // Catch: all -> 0x00c7
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: all -> 0x00c7
            java.util.concurrent.ConcurrentHashMap r5 = defpackage.kWP.e     // Catch: all -> 0x00c7
            java.lang.Object r1 = r4.getKey()     // Catch: all -> 0x00c7
            boolean r5 = r5.containsKey(r1)     // Catch: all -> 0x00c7
            if (r5 != 0) goto L_0x00aa
            goto L_0x0091
        L_0x00aa:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: all -> 0x00c7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x00c7
            r5.<init>()     // Catch: all -> 0x00c7
            java.lang.String r1 = "Attempted overwrite of a registered key template "
            r5.append(r1)     // Catch: all -> 0x00c7
            java.lang.Object r4 = r4.getKey()     // Catch: all -> 0x00c7
            java.lang.String r4 = (java.lang.String) r4     // Catch: all -> 0x00c7
            r5.append(r4)     // Catch: all -> 0x00c7
            java.lang.String r4 = r5.toString()     // Catch: all -> 0x00c7
            r3.<init>(r4)     // Catch: all -> 0x00c7
            throw r3     // Catch: all -> 0x00c7
        L_0x00c7:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x00ca:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kWP.R(java.lang.String, java.util.Map, boolean):void");
    }

    public static synchronized fZH X(k1p k1p) {
        fZH g;
        synchronized (kWP.class) {
            h5 e2 = ((diN) f5318R.get()).v(k1p.V()).e();
            if (((Boolean) v.get(k1p.V())).booleanValue()) {
                g = e2.g(k1p.o());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + k1p.V());
            }
        }
        return g;
    }

    public static void Z(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            e.put((String) entry.getKey(), lV8.R(str, ((qN) ((jeE) entry.getValue()).f4996R).e(), ((jeE) entry.getValue()).R));
        }
    }

    public static Object c(String str, csA csa, Class cls) {
        h5 R2 = ((diN) f5318R.get()).R(cls, str);
        R2.getClass();
        String str2 = "Expected proto of type " + ((Class) ((Dd) R2.R).R).getName();
        if (((Class) ((Dd) R2.R).R).isInstance(csa)) {
            return R2.Y(csa);
        }
        throw new GeneralSecurityException(str2);
    }

    public static synchronized qN e(k1p k1p) {
        qN j;
        synchronized (kWP.class) {
            h5 e2 = ((diN) f5318R.get()).v(k1p.V()).e();
            if (((Boolean) v.get(k1p.V())).booleanValue()) {
                j = e2.j(k1p.o());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + k1p.V());
            }
        }
        return j;
    }

    public static synchronized void m(d0J d0j) {
        synchronized (kWP.class) {
            Class v2 = d0j.v();
            ConcurrentHashMap concurrentHashMap = c;
            if (concurrentHashMap.containsKey(v2)) {
                d0J d0j2 = (d0J) concurrentHashMap.get(v2);
                if (!d0j.getClass().getName().equals(d0j2.getClass().getName())) {
                    Logger logger = f5319R;
                    logger.warning("Attempted overwrite of a registered PrimitiveWrapper for type " + v2);
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", v2.getName(), d0j2.getClass().getName(), d0j.getClass().getName()));
                }
            }
            concurrentHashMap.put(v2, d0j);
        }
    }

    public static Object v(String str, b0 b0Var, Class cls) {
        h5 R2 = ((diN) f5318R.get()).R(cls, str);
        R2.getClass();
        try {
            return R2.Y(((Dd) R2.R).i(b0Var));
        } catch (b7b e2) {
            StringBuilder U = opT.U("Failures parsing proto of type ");
            U.append(((Class) ((Dd) R2.R).R).getName());
            throw new GeneralSecurityException(U.toString(), e2);
        }
    }
}
