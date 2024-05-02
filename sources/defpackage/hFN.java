package defpackage;

import java.util.List;

/* renamed from: hFN  reason: default package */
/* loaded from: classes.dex */
public final class hFN {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long f4164R;

    /* renamed from: R  reason: collision with other field name */
    public final bz f4165R;

    /* renamed from: R  reason: collision with other field name */
    public final gP7 f4166R;

    /* renamed from: R  reason: collision with other field name */
    public final jJj f4167R;

    /* renamed from: R  reason: collision with other field name */
    public final List f4168R;

    /* renamed from: R  reason: collision with other field name */
    public final kMk f4169R;

    /* renamed from: R  reason: collision with other field name */
    public final mdz f4170R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4171R;
    public final int v;

    public hFN(bz bzVar, kMk kmk, List list, int i, boolean z, int i2, jJj jjj, mdz mdz, gP7 gp7, long j) {
        this.f4165R = bzVar;
        this.f4169R = kmk;
        this.f4168R = list;
        this.R = i;
        this.f4171R = z;
        this.v = i2;
        this.f4167R = jjj;
        this.f4170R = mdz;
        this.f4166R = gp7;
        this.f4164R = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hFN)) {
            return false;
        }
        hFN hfn = (hFN) obj;
        if (!n3x.v(this.f4165R, hfn.f4165R) || !n3x.v(this.f4169R, hfn.f4169R) || !n3x.v(this.f4168R, hfn.f4168R) || this.R != hfn.R || this.f4171R != hfn.f4171R) {
            return false;
        }
        return (this.v == hfn.v) && n3x.v(this.f4167R, hfn.f4167R) && this.f4170R == hfn.f4170R && n3x.v(this.f4166R, hfn.f4166R) && oys.v(this.f4164R, hfn.f4164R);
    }

    public final int hashCode() {
        int hashCode = this.f4169R.hashCode();
        int hashCode2 = this.f4168R.hashCode();
        int hashCode3 = Boolean.hashCode(this.f4171R);
        int e = opT.e(this.v, (hashCode3 + ((((hashCode2 + ((hashCode + (this.f4165R.hashCode() * 31)) * 31)) * 31) + this.R) * 31)) * 31, 31);
        int hashCode4 = this.f4170R.hashCode();
        int hashCode5 = this.f4166R.hashCode();
        return Long.hashCode(this.f4164R) + ((hashCode5 + ((hashCode4 + ((this.f4167R.hashCode() + e) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder U = opT.U("TextLayoutInput(text=");
        U.append((Object) this.f4165R);
        U.append(", style=");
        U.append(this.f4169R);
        U.append(", placeholders=");
        U.append(this.f4168R);
        U.append(", maxLines=");
        U.append(this.R);
        U.append(", softWrap=");
        U.append(this.f4171R);
        U.append(", overflow=");
        int i = this.v;
        boolean z = false;
        if (i == 1) {
            str = "Clip";
        } else {
            if (i == 2) {
                str = "Ellipsis";
            } else {
                if (i == 3) {
                    z = true;
                }
                str = z ? "Visible" : "Invalid";
            }
        }
        U.append((Object) str);
        U.append(", density=");
        U.append(this.f4167R);
        U.append(", layoutDirection=");
        U.append(this.f4170R);
        U.append(", fontFamilyResolver=");
        U.append(this.f4166R);
        U.append(", constraints=");
        U.append((Object) oys.H(this.f4164R));
        U.append(')');
        return U.toString();
    }
}
