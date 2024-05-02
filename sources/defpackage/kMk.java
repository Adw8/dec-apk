package defpackage;

/* renamed from: kMk  reason: default package */
/* loaded from: classes.dex */
public final class kMk {
    public static final kMk R = new kMk(0, 0, null, null, null, 0, null, null, 0, 262143);

    /* renamed from: R  reason: collision with other field name */
    public final dWZ f5282R;

    /* renamed from: R  reason: collision with other field name */
    public final eBF f5283R;

    /* renamed from: R  reason: collision with other field name */
    public final kne f5284R;

    public kMk(eBF ebf, kne kne, dWZ dwz) {
        this.f5283R = ebf;
        this.f5284R = kne;
        this.f5282R = dwz;
    }

    public static kMk R(kMk kmk, long j, long j2, lIe lie, int i) {
        o3t o3t;
        long R2 = (i & 1) != 0 ? kmk.f5283R.R() : j;
        long j3 = (i & 2) != 0 ? kmk.f5283R.R : j2;
        lIe lie2 = (i & 4) != 0 ? kmk.f5283R.f3017R : lie;
        ned ned = (i & 8) != 0 ? kmk.f5283R.f3018R : null;
        hqI hqi = (i & 16) != 0 ? kmk.f5283R.f3015R : null;
        deI dei = (i & 32) != 0 ? kmk.f5283R.f3012R : null;
        String str = (i & 64) != 0 ? kmk.f5283R.f3016R : null;
        long j4 = (i & 128) != 0 ? kmk.f5283R.v : 0;
        L0 l0 = (i & 256) != 0 ? kmk.f5283R.f3008R : null;
        h5a h5a = (i & 512) != 0 ? kmk.f5283R.f3013R : null;
        d5E d5e = (i & 1024) != 0 ? kmk.f5283R.f3011R : null;
        long j5 = (i & 2048) != 0 ? kmk.f5283R.c : 0;
        ari ari = (i & 4096) != 0 ? kmk.f5283R.f3009R : null;
        hpO hpo = (i & 8192) != 0 ? kmk.f5283R.f3014R : null;
        pvy pvy = (i & 16384) != 0 ? kmk.f5284R.f5429R : null;
        cF0 cf0 = (32768 & i) != 0 ? kmk.f5284R.f5423R : null;
        long j6 = (65536 & i) != 0 ? kmk.f5284R.R : 0;
        mRi mri = (i & 131072) != 0 ? kmk.f5284R.f5428R : null;
        if (n3.c(R2, kmk.f5283R.R())) {
            o3t = kmk.f5283R.f3019R;
        } else {
            if (R2 != n3.O) {
                o3t = new y8(R2);
                eBF ebf = new eBF(o3t, j3, lie2, ned, hqi, dei, str, j4, l0, h5a, d5e, j5, ari, hpo, kmk.f5283R.f3010R);
                kne kne = kmk.f5284R;
                return new kMk(ebf, new kne(pvy, cf0, j6, mri, kne.f5425R, kne.f5424R, kne.f5426R, kne.f5427R), kmk.f5282R);
            }
            o3t = kVu.R;
        }
        eBF ebf = new eBF(o3t, j3, lie2, ned, hqi, dei, str, j4, l0, h5a, d5e, j5, ari, hpo, kmk.f5283R.f3010R);
        kne kne = kmk.f5284R;
        return new kMk(ebf, new kne(pvy, cf0, j6, mri, kne.f5425R, kne.f5424R, kne.f5426R, kne.f5427R), kmk.f5282R);
    }

    public final kMk c(kMk kmk) {
        return (kmk == null || n3x.v(kmk, R)) ? this : new kMk(this.f5283R.c(kmk.f5283R), this.f5284R.R(kmk.f5284R));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kMk)) {
            return false;
        }
        kMk kmk = (kMk) obj;
        return n3x.v(this.f5283R, kmk.f5283R) && n3x.v(this.f5284R, kmk.f5284R) && n3x.v(this.f5282R, kmk.f5282R);
    }

    public final int hashCode() {
        int hashCode = (this.f5284R.hashCode() + (this.f5283R.hashCode() * 31)) * 31;
        dWZ dwz = this.f5282R;
        return hashCode + (dwz != null ? dwz.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder U = opT.U("TextStyle(color=");
        U.append((Object) n3.m(v()));
        U.append(", brush=");
        U.append(this.f5283R.f3019R.R());
        U.append(", alpha=");
        U.append(this.f5283R.f3019R.v());
        U.append(", fontSize=");
        U.append((Object) eT9.e(this.f5283R.R));
        U.append(", fontWeight=");
        U.append(this.f5283R.f3017R);
        U.append(", fontStyle=");
        U.append(this.f5283R.f3018R);
        U.append(", fontSynthesis=");
        U.append(this.f5283R.f3015R);
        U.append(", fontFamily=");
        U.append(this.f5283R.f3012R);
        U.append(", fontFeatureSettings=");
        U.append(this.f5283R.f3016R);
        U.append(", letterSpacing=");
        U.append((Object) eT9.e(this.f5283R.v));
        U.append(", baselineShift=");
        U.append(this.f5283R.f3008R);
        U.append(", textGeometricTransform=");
        U.append(this.f5283R.f3013R);
        U.append(", localeList=");
        U.append(this.f5283R.f3011R);
        U.append(", background=");
        U.append((Object) n3.m(this.f5283R.c));
        U.append(", textDecoration=");
        U.append(this.f5283R.f3009R);
        U.append(", shadow=");
        U.append(this.f5283R.f3014R);
        U.append(", textAlign=");
        U.append(this.f5284R.f5429R);
        U.append(", textDirection=");
        U.append(this.f5284R.f5423R);
        U.append(", lineHeight=");
        U.append((Object) eT9.e(this.f5284R.R));
        U.append(", textIndent=");
        U.append(this.f5284R.f5428R);
        U.append(", platformStyle=");
        U.append(this.f5282R);
        U.append(", lineHeightStyle=");
        U.append(this.f5284R.f5424R);
        U.append(", lineBreak=");
        U.append(this.f5284R.f5426R);
        U.append(", hyphens=");
        U.append(this.f5284R.f5427R);
        U.append(')');
        return U.toString();
    }

    public final long v() {
        return this.f5283R.R();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kMk(defpackage.eBF r4, defpackage.kne r5) {
        /*
            r3 = this;
            by5 r0 = r4.f3010R
            gvH r1 = r5.f5425R
            if (r0 != 0) goto L_0x000a
            if (r1 != 0) goto L_0x000a
            r0 = 0
            goto L_0x0010
        L_0x000a:
            dWZ r2 = new dWZ
            r2.<init>(r0, r1)
            r0 = r2
        L_0x0010:
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kMk.<init>(eBF, kne):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kMk(long r30, long r32, defpackage.lIe r34, defpackage.ned r35, defpackage.deI r36, long r37, defpackage.ari r39, defpackage.pvy r40, long r41, int r43) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kMk.<init>(long, long, lIe, ned, deI, long, ari, pvy, long, int):void");
    }
}
