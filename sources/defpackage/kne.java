package defpackage;

/* renamed from: kne  reason: default package */
/* loaded from: classes.dex */
public final class kne {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final cF0 f5423R;

    /* renamed from: R  reason: collision with other field name */
    public final erS f5424R;

    /* renamed from: R  reason: collision with other field name */
    public final gvH f5425R;

    /* renamed from: R  reason: collision with other field name */
    public final h4c f5426R;

    /* renamed from: R  reason: collision with other field name */
    public final hF1 f5427R;

    /* renamed from: R  reason: collision with other field name */
    public final mRi f5428R;

    /* renamed from: R  reason: collision with other field name */
    public final pvy f5429R;

    public kne(pvy pvy, cF0 cf0, long j, mRi mri, gvH gvh, erS ers, h4c h4c, hF1 hf1) {
        this.f5429R = pvy;
        this.f5423R = cf0;
        this.R = j;
        this.f5428R = mri;
        this.f5425R = gvh;
        this.f5424R = ers;
        this.f5426R = h4c;
        this.f5427R = hf1;
        if (!eT9.R(j, eT9.v)) {
            if (!(eT9.c(j) >= 0.0f)) {
                StringBuilder U = opT.U("lineHeight can't be negative (");
                U.append(eT9.c(j));
                U.append(')');
                throw new IllegalStateException(U.toString().toString());
            }
        }
    }

    public final kne R(kne kne) {
        if (kne == null) {
            return this;
        }
        long j = gQc.T(kne.R) ? this.R : kne.R;
        mRi mri = kne.f5428R;
        if (mri == null) {
            mri = this.f5428R;
        }
        pvy pvy = kne.f5429R;
        if (pvy == null) {
            pvy = this.f5429R;
        }
        cF0 cf0 = kne.f5423R;
        if (cf0 == null) {
            cf0 = this.f5423R;
        }
        gvH gvh = kne.f5425R;
        gvH gvh2 = this.f5425R;
        gvH gvh3 = (gvh2 != null && gvh == null) ? gvh2 : gvh;
        erS ers = kne.f5424R;
        if (ers == null) {
            ers = this.f5424R;
        }
        h4c h4c = kne.f5426R;
        if (h4c == null) {
            h4c = this.f5426R;
        }
        hF1 hf1 = kne.f5427R;
        return new kne(pvy, cf0, j, mri, gvh3, ers, h4c, hf1 == null ? this.f5427R : hf1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kne)) {
            return false;
        }
        kne kne = (kne) obj;
        return n3x.v(this.f5429R, kne.f5429R) && n3x.v(this.f5423R, kne.f5423R) && eT9.R(this.R, kne.R) && n3x.v(this.f5428R, kne.f5428R) && n3x.v(this.f5425R, kne.f5425R) && n3x.v(this.f5424R, kne.f5424R) && n3x.v(this.f5426R, kne.f5426R) && n3x.v(this.f5427R, kne.f5427R);
    }

    public final int hashCode() {
        pvy pvy = this.f5429R;
        int i = 0;
        int hashCode = (pvy != null ? Integer.hashCode(pvy.R) : 0) * 31;
        cF0 cf0 = this.f5423R;
        int hashCode2 = cf0 != null ? Integer.hashCode(cf0.R) : 0;
        long j = this.R;
        lqt[] lqtArr = eT9.R;
        int X = opT.X(j, (hashCode + hashCode2) * 31, 31);
        mRi mri = this.f5428R;
        int hashCode3 = (X + (mri != null ? mri.hashCode() : 0)) * 31;
        gvH gvh = this.f5425R;
        int hashCode4 = (hashCode3 + (gvh != null ? gvh.hashCode() : 0)) * 31;
        erS ers = this.f5424R;
        int hashCode5 = (hashCode4 + (ers != null ? ers.hashCode() : 0)) * 31;
        h4c h4c = this.f5426R;
        int hashCode6 = (hashCode5 + (h4c != null ? h4c.hashCode() : 0)) * 31;
        hF1 hf1 = this.f5427R;
        if (hf1 != null) {
            i = hf1.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder U = opT.U("ParagraphStyle(textAlign=");
        U.append(this.f5429R);
        U.append(", textDirection=");
        U.append(this.f5423R);
        U.append(", lineHeight=");
        U.append((Object) eT9.e(this.R));
        U.append(", textIndent=");
        U.append(this.f5428R);
        U.append(", platformStyle=");
        U.append(this.f5425R);
        U.append(", lineHeightStyle=");
        U.append(this.f5424R);
        U.append(", lineBreak=");
        U.append(this.f5426R);
        U.append(", hyphens=");
        U.append(this.f5427R);
        U.append(')');
        return U.toString();
    }
}
