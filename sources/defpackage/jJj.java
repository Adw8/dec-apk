package defpackage;

/* renamed from: jJj  reason: default package */
/* loaded from: classes.dex */
public interface jJj {
    default int B(float f) {
        float mZ = mZ(f);
        if (Float.isInfinite(mZ)) {
            return Integer.MAX_VALUE;
        }
        return mLz.t(mZ);
    }

    default long C(long j) {
        return (j > nqW.c ? 1 : (j == nqW.c ? 0 : -1)) != 0 ? gvP.v(q(nqW.e(j)), q(nqW.v(j))) : o2S.c;
    }

    float D();

    default long M(long j) {
        int i = o2S.R;
        if (j != o2S.c) {
            return n1P.e(mZ(o2S.v(j)), mZ(o2S.R(j)));
        }
        int i2 = nqW.R;
        return nqW.c;
    }

    default float l(int i) {
        return ((float) i) / D();
    }

    default float mZ(float f) {
        return D() * f;
    }

    default float q(float f) {
        return f / D();
    }

    float vr();

    default float vz(long j) {
        if (lqt.R(eT9.v(j), 4294967296L)) {
            float c = eT9.c(j);
            return D() * vr() * c;
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }
}
