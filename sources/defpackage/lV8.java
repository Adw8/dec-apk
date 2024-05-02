package defpackage;

/* renamed from: lV8  reason: default package */
/* loaded from: classes.dex */
public final class lV8 {
    public final k1p R;

    public lV8(k1p k1p) {
        this.R = k1p;
    }

    public static lV8 R(String str, byte[] bArr, int i) {
        hPF hpf;
        a4y K = k1p.K();
        K.X();
        k1p.j((k1p) K.v, str);
        MH H = b0.H(bArr, 0, bArr.length);
        K.X();
        k1p.g((k1p) K.v, H);
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0) {
                hpf = hPF.TINK;
            } else if (i2 == 1) {
                hpf = hPF.LEGACY;
            } else if (i2 == 2) {
                hpf = hPF.RAW;
            } else if (i2 == 3) {
                hpf = hPF.CRUNCHY;
            } else {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
            K.X();
            k1p.y((k1p) K.v, hpf);
            return new lV8((k1p) K.v());
        }
        throw null;
    }
}
