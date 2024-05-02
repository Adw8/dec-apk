package defpackage;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: u  reason: default package */
/* loaded from: classes.dex */
public final class u extends O {
    public static final ConcurrentHashMap R = new ConcurrentHashMap();

    /* renamed from: R  reason: collision with other field name */
    public final String f7421R;

    /* renamed from: R  reason: collision with other field name */
    public byte[] f7422R;

    static {
        new Y(6, 13, u.class);
    }

    public u(u uVar, String str) {
        if (M.Q(0, str)) {
            this.f7421R = uVar.f7421R + "." + str;
            return;
        }
        throw new IllegalArgumentException(jQ.C("string ", str, " not a valid OID branch"));
    }

    public u(boolean z, byte[] bArr) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr2.length; i++) {
            int i2 = bArr2[i] & 255;
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (i2 & 127));
                if ((i2 & 128) == 0) {
                    if (z2) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z2 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf((long) (i2 & 127)));
                if ((i2 & 128) == 0) {
                    if (z2) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80));
                        z2 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.f7421R = stringBuffer.toString();
        this.f7422R = z ? mLz.e(bArr) : bArr2;
    }

    public static u A(b bVar) {
        if (bVar == null || (bVar instanceof u)) {
            return (u) bVar;
        }
        O v = bVar.v();
        if (v instanceof u) {
            return (u) v;
        }
        StringBuilder U = opT.U("illegal object in getInstance: ");
        U.append(bVar.getClass().getName());
        throw new IllegalArgumentException(U.toString());
    }

    @Override // defpackage.O
    public final boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.g(z, 6, Q());
    }

    public final synchronized byte[] Q() {
        if (this.f7422R == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            n(byteArrayOutputStream);
            this.f7422R = byteArrayOutputStream.toByteArray();
        }
        return this.f7422R;
    }

    public final u S() {
        v vVar = new v(Q());
        ConcurrentHashMap concurrentHashMap = R;
        u uVar = (u) concurrentHashMap.get(vVar);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = (u) concurrentHashMap.putIfAbsent(vVar, this);
        return uVar2 == null ? this : uVar2;
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return Zz.x(Q().length, z);
    }

    @Override // defpackage.O, defpackage.t
    public final int hashCode() {
        return this.f7421R.hashCode();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    public final void n(java.io.ByteArrayOutputStream r7) {
        /*
            r6 = this;
            L2 r0 = new L2
            java.lang.String r6 = r6.f7421R
            r0.<init>(r6)
            java.lang.String r6 = r0.c()
            int r6 = java.lang.Integer.parseInt(r6)
            int r6 = r6 * 40
            java.lang.String r1 = r0.c()
            int r2 = r1.length()
            r3 = 18
            if (r2 > r3) goto L_0x0024
            long r4 = (long) r6
            long r1 = java.lang.Long.parseLong(r1)
            long r1 = r1 + r4
            goto L_0x004d
        L_0x0024:
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r1)
            long r4 = (long) r6
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r4)
            java.math.BigInteger r6 = r2.add(r6)
            defpackage.M.S(r7, r6)
        L_0x0035:
            int r6 = r0.v
            r1 = -1
            if (r6 == r1) goto L_0x003c
            r6 = 1
            goto L_0x003d
        L_0x003c:
            r6 = 0
        L_0x003d:
            if (r6 == 0) goto L_0x005a
            java.lang.String r6 = r0.c()
            int r1 = r6.length()
            if (r1 > r3) goto L_0x0051
            long r1 = java.lang.Long.parseLong(r6)
        L_0x004d:
            defpackage.M.A(r7, r1)
            goto L_0x0035
        L_0x0051:
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r6)
            defpackage.M.S(r7, r1)
            goto L_0x0035
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u.n(java.io.ByteArrayOutputStream):void");
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof u)) {
            return false;
        }
        return this.f7421R.equals(((u) o).f7421R);
    }

    public final String toString() {
        return this.f7421R;
    }

    public u(String str) {
        char charAt;
        if (str != null) {
            boolean z = false;
            if (str.length() >= 3 && str.charAt(1) == '.' && (charAt = str.charAt(0)) >= '0' && charAt <= '2') {
                z = M.Q(2, str);
            }
            if (z) {
                this.f7421R = str;
                return;
            }
            throw new IllegalArgumentException(jQ.C("string ", str, " not an OID"));
        }
        throw new NullPointerException("'identifier' cannot be null");
    }
}
