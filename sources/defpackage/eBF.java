package defpackage;

/* renamed from: eBF  reason: default package */
/* loaded from: classes.dex */
public final class eBF {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final L0 f3008R;

    /* renamed from: R  reason: collision with other field name */
    public final ari f3009R;

    /* renamed from: R  reason: collision with other field name */
    public final by5 f3010R;

    /* renamed from: R  reason: collision with other field name */
    public final d5E f3011R;

    /* renamed from: R  reason: collision with other field name */
    public final deI f3012R;

    /* renamed from: R  reason: collision with other field name */
    public final h5a f3013R;

    /* renamed from: R  reason: collision with other field name */
    public final hpO f3014R;

    /* renamed from: R  reason: collision with other field name */
    public final hqI f3015R;

    /* renamed from: R  reason: collision with other field name */
    public final String f3016R;

    /* renamed from: R  reason: collision with other field name */
    public final lIe f3017R;

    /* renamed from: R  reason: collision with other field name */
    public final ned f3018R;

    /* renamed from: R  reason: collision with other field name */
    public final o3t f3019R;
    public final long c;
    public final long v;

    public eBF(o3t o3t, long j, lIe lie, ned ned, hqI hqi, deI dei, String str, long j2, L0 l0, h5a h5a, d5E d5e, long j3, ari ari, hpO hpo, by5 by5) {
        this.f3019R = o3t;
        this.R = j;
        this.f3017R = lie;
        this.f3018R = ned;
        this.f3015R = hqi;
        this.f3012R = dei;
        this.f3016R = str;
        this.v = j2;
        this.f3008R = l0;
        this.f3013R = h5a;
        this.f3011R = d5e;
        this.c = j3;
        this.f3009R = ari;
        this.f3014R = hpo;
        this.f3010R = by5;
    }

    public final long R() {
        return this.f3019R.c();
    }

    public final eBF c(eBF ebf) {
        if (ebf == null) {
            return this;
        }
        o3t o3t = this.f3019R;
        o3t o3t2 = ebf.f3019R;
        o3t.getClass();
        boolean z = o3t2 instanceof o5;
        boolean z2 = true;
        if (z && (o3t instanceof o5)) {
            qD qDVar = ((o5) o3t2).f6667R;
            float v = o3t2.v();
            if (Float.isNaN(v)) {
                v = Float.valueOf(o3t.v()).floatValue();
            }
            o3t = new o5(qDVar, v);
        } else if (z && !(o3t instanceof o5)) {
            o3t = o3t2;
        } else if (z || !(o3t instanceof o5)) {
            o3t2.getClass();
            o3t = !n3x.v(o3t2, kVu.R) ? o3t2 : o3t;
        }
        deI dei = ebf.f3012R;
        if (dei == null) {
            dei = this.f3012R;
        }
        long j = !gQc.T(ebf.R) ? ebf.R : this.R;
        lIe lie = ebf.f3017R;
        if (lie == null) {
            lie = this.f3017R;
        }
        ned ned = ebf.f3018R;
        if (ned == null) {
            ned = this.f3018R;
        }
        hqI hqi = ebf.f3015R;
        if (hqi == null) {
            hqi = this.f3015R;
        }
        String str = ebf.f3016R;
        if (str == null) {
            str = this.f3016R;
        }
        long j2 = !gQc.T(ebf.v) ? ebf.v : this.v;
        L0 l0 = ebf.f3008R;
        if (l0 == null) {
            l0 = this.f3008R;
        }
        h5a h5a = ebf.f3013R;
        if (h5a == null) {
            h5a = this.f3013R;
        }
        d5E d5e = ebf.f3011R;
        if (d5e == null) {
            d5e = this.f3011R;
        }
        long j3 = ebf.c;
        if (j3 == n3.O) {
            z2 = false;
        }
        if (!z2) {
            j3 = this.c;
        }
        ari ari = ebf.f3009R;
        if (ari == null) {
            ari = this.f3009R;
        }
        hpO hpo = ebf.f3014R;
        if (hpo == null) {
            hpo = this.f3014R;
        }
        by5 by5 = ebf.f3010R;
        by5 by52 = this.f3010R;
        if (by52 != null) {
            by5 = by52;
        }
        return new eBF(o3t, j, lie, ned, hqi, dei, str, j2, l0, h5a, d5e, j3, ari, hpo, by5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eBF)) {
            return false;
        }
        eBF ebf = (eBF) obj;
        if (v(ebf)) {
            if (n3x.v(this.f3019R, ebf.f3019R) && n3x.v(this.f3009R, ebf.f3009R) && n3x.v(this.f3014R, ebf.f3014R)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long R = R();
        int i = n3.R;
        int R2 = ejC.R(R) * 31;
        a1 R3 = this.f3019R.R();
        int i2 = 0;
        int hashCode = R3 != null ? R3.hashCode() : 0;
        int hashCode2 = Float.hashCode(this.f3019R.v());
        long j = this.R;
        lqt[] lqtArr = eT9.R;
        int X = opT.X(j, (hashCode2 + ((R2 + hashCode) * 31)) * 31, 31);
        lIe lie = this.f3017R;
        int i3 = (X + (lie != null ? lie.f5651e : 0)) * 31;
        ned ned = this.f3018R;
        int hashCode3 = (i3 + (ned != null ? Integer.hashCode(ned.R) : 0)) * 31;
        hqI hqi = this.f3015R;
        int hashCode4 = (hashCode3 + (hqi != null ? Integer.hashCode(hqi.R) : 0)) * 31;
        deI dei = this.f3012R;
        int hashCode5 = (hashCode4 + (dei != null ? dei.hashCode() : 0)) * 31;
        String str = this.f3016R;
        int X2 = opT.X(this.v, (hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        L0 l0 = this.f3008R;
        int hashCode6 = (X2 + (l0 != null ? Float.hashCode(l0.R) : 0)) * 31;
        h5a h5a = this.f3013R;
        int hashCode7 = (hashCode6 + (h5a != null ? h5a.hashCode() : 0)) * 31;
        d5E d5e = this.f3011R;
        int e = jQ.e(this.c, (hashCode7 + (d5e != null ? d5e.hashCode() : 0)) * 31, 31);
        ari ari = this.f3009R;
        int i4 = (e + (ari != null ? ari.f1478R : 0)) * 31;
        hpO hpo = this.f3014R;
        int hashCode8 = (i4 + (hpo != null ? hpo.hashCode() : 0)) * 31;
        by5 by5 = this.f3010R;
        if (by5 != null) {
            i2 = by5.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        StringBuilder U = opT.U("SpanStyle(color=");
        U.append((Object) n3.m(R()));
        U.append(", brush=");
        U.append(this.f3019R.R());
        U.append(", alpha=");
        U.append(this.f3019R.v());
        U.append(", fontSize=");
        U.append((Object) eT9.e(this.R));
        U.append(", fontWeight=");
        U.append(this.f3017R);
        U.append(", fontStyle=");
        U.append(this.f3018R);
        U.append(", fontSynthesis=");
        U.append(this.f3015R);
        U.append(", fontFamily=");
        U.append(this.f3012R);
        U.append(", fontFeatureSettings=");
        U.append(this.f3016R);
        U.append(", letterSpacing=");
        U.append((Object) eT9.e(this.v));
        U.append(", baselineShift=");
        U.append(this.f3008R);
        U.append(", textGeometricTransform=");
        U.append(this.f3013R);
        U.append(", localeList=");
        U.append(this.f3011R);
        U.append(", background=");
        U.append((Object) n3.m(this.c));
        U.append(", textDecoration=");
        U.append(this.f3009R);
        U.append(", shadow=");
        U.append(this.f3014R);
        U.append(", platformStyle=");
        U.append(this.f3010R);
        U.append(')');
        return U.toString();
    }

    public final boolean v(eBF ebf) {
        if (this == ebf) {
            return true;
        }
        return eT9.R(this.R, ebf.R) && n3x.v(this.f3017R, ebf.f3017R) && n3x.v(this.f3018R, ebf.f3018R) && n3x.v(this.f3015R, ebf.f3015R) && n3x.v(this.f3012R, ebf.f3012R) && n3x.v(this.f3016R, ebf.f3016R) && eT9.R(this.v, ebf.v) && n3x.v(this.f3008R, ebf.f3008R) && n3x.v(this.f3013R, ebf.f3013R) && n3x.v(this.f3011R, ebf.f3011R) && n3.c(this.c, ebf.c) && n3x.v(this.f3010R, ebf.f3010R);
    }

    public eBF(long j, long j2, lIe lie, ned ned, hqI hqi, deI dei, String str, long j3, L0 l0, h5a h5a, d5E d5e, long j4, ari ari, hpO hpo) {
        this((j > n3.O ? 1 : (j == n3.O ? 0 : -1)) != 0 ? new y8(j) : kVu.R, j2, lie, ned, hqi, dei, str, j3, l0, h5a, d5e, j4, ari, hpo, (by5) null);
    }

    public eBF(long j, long j2, lIe lie, ned ned, hqI hqi, deI dei, String str, long j3, L0 l0, h5a h5a, d5E d5e, long j4, ari ari, hpO hpo, int i) {
        this((i & 1) != 0 ? n3.O : j, (i & 2) != 0 ? eT9.v : j2, (i & 4) != 0 ? null : lie, (i & 8) != 0 ? null : ned, (i & 16) != 0 ? null : hqi, (i & 32) != 0 ? null : dei, (i & 64) != 0 ? null : str, (i & 128) != 0 ? eT9.v : j3, (i & 256) != 0 ? null : l0, (i & 512) != 0 ? null : h5a, (i & 1024) != 0 ? null : d5e, (i & 2048) != 0 ? n3.O : j4, (i & 4096) != 0 ? null : ari, (i & 8192) != 0 ? null : hpo);
    }
}
