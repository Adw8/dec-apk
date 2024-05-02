package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: _1  reason: default package */
/* loaded from: classes.dex */
public abstract class _1 {
    public static final owM R = new owM(fzi.C);

    public static final long R(long j, m88 m88) {
        jr_ jr_ = (jr_) m88;
        E2 e2 = (E2) jr_.x(R);
        long x = n3.c(j, e2.y()) ? e2.x() : n3.c(j, e2.i()) ? e2.U() : n3.c(j, e2.Y()) ? e2.j() : n3.c(j, e2.v()) ? e2.L() : n3.c(j, e2.c()) ? e2.Z() : n3.c(j, e2.o()) ? e2.N() : n3.c(j, e2.J()) ? e2.P() : n3.c(j, e2.t()) ? e2.H() : n3.c(j, e2.V()) ? e2.C() : n3.c(j, e2.h()) ? e2.g() : n3.c(j, e2.e()) ? e2.m() : n3.c(j, e2.O()) ? e2.X() : n3.O;
        return (x > n3.O ? 1 : (x == n3.O ? 0 : -1)) != 0 ? x : ((n3) jr_.x(kft.R)).f6279R;
    }

    public static final long X(int i, m88 m88) {
        return v((E2) ((jr_) m88).x(R), i);
    }

    public static E2 c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, int i) {
        long j23 = (i & 1) != 0 ? p4.i : j;
        return new E2(j23, (i & 2) != 0 ? p4.x : j2, (i & 4) != 0 ? p4.V : j3, (i & 8) != 0 ? p4.H : j4, (i & 16) != 0 ? p4.X : j5, (i & 32) != 0 ? p4.K : j6, (i & 64) != 0 ? p4.U : j7, (i & 128) != 0 ? p4.J : j8, (i & 256) != 0 ? p4.C : j9, (i & 512) != 0 ? p4.I : j10, (i & 1024) != 0 ? p4.j : j11, (i & 2048) != 0 ? p4.u : j12, (i & 4096) != 0 ? p4.g : j13, (i & 8192) != 0 ? p4.R : j14, (i & 16384) != 0 ? p4.L : j15, (32768 & i) != 0 ? p4.Y : j16, (65536 & i) != 0 ? p4.N : j17, (131072 & i) != 0 ? p4.h : j18, (262144 & i) != 0 ? p4.P : j19, (524288 & i) != 0 ? j23 : 0, (1048576 & i) != 0 ? p4.O : j20, (2097152 & i) != 0 ? p4.e : j21, (4194304 & i) != 0 ? p4.v : 0, (8388608 & i) != 0 ? p4.Z : 0, (16777216 & i) != 0 ? p4.c : 0, (33554432 & i) != 0 ? p4.m : 0, (67108864 & i) != 0 ? p4.y : j22, (134217728 & i) != 0 ? p4.t : 0, (i & 268435456) != 0 ? p4.o : 0);
    }

    public static final long e(E2 e2, float f) {
        if (hoI.R(f, (float) 0)) {
            return e2.o();
        }
        return aH9.z(n3.v(e2.K(), ((((float) Math.log((double) (f + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f), e2.o());
    }

    public static final long v(E2 e2, int i) {
        if (i != 0) {
            switch (i - 1) {
                case 0:
                    return e2.v();
                case 1:
                    return e2.c();
                case 2:
                    return e2.e();
                case 3:
                    return e2.X();
                case 4:
                    return ((n3) e2.X.getValue()).f6279R;
                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    return e2.O();
                case 6:
                    return e2.L();
                case 7:
                    return e2.Z();
                case VmNativeCallback.$stable /* 8 */:
                    return e2.m();
                case 9:
                    return e2.x();
                case 10:
                    return e2.H();
                case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                    return e2.U();
                case 12:
                    return e2.C();
                case 13:
                    return e2.N();
                case 14:
                    return e2.P();
                case 15:
                    return e2.j();
                case 16:
                    return e2.g();
                case 17:
                    return ((n3) e2.I.getValue()).f6279R;
                case 18:
                    return ((n3) e2.u.getValue()).f6279R;
                case 19:
                    return e2.y();
                case 20:
                    return e2.t();
                case 21:
                    return ((n3) e2.z.getValue()).f6279R;
                case 22:
                    return e2.i();
                case 23:
                    return e2.V();
                case 24:
                    return e2.o();
                case 25:
                    return e2.K();
                case 26:
                    return e2.J();
                case 27:
                    return e2.Y();
                case 28:
                    return e2.h();
                default:
                    throw new j8f((Object) null);
            }
        } else {
            throw null;
        }
    }
}
