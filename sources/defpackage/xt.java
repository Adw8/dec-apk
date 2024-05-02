package defpackage;

/* renamed from: xt  reason: default package */
/* loaded from: classes.dex */
public final class xt implements h8, C0 {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final iv7 f7475R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f7476R;
    public final float v;

    public xt(float f, boolean z, iv7 iv7) {
        this.R = f;
        this.f7476R = z;
        this.f7475R = iv7;
        this.v = f;
    }

    @Override // defpackage.h8, defpackage.C0
    public final float R() {
        return this.v;
    }

    @Override // defpackage.C0
    public final void c(jJj jjj, int i, int[] iArr, int[] iArr2) {
        v(i, jjj, mdz.Ltr, iArr, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt)) {
            return false;
        }
        xt xtVar = (xt) obj;
        return hoI.R(this.R, xtVar.R) && this.f7476R == xtVar.f7476R && n3x.v(this.f7475R, xtVar.f7475R);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.R) * 31;
        boolean z = this.f7476R;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = (hashCode + i) * 31;
        iv7 iv7 = this.f7475R;
        return i4 + (iv7 == null ? 0 : iv7.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7476R ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) hoI.v(this.R));
        sb.append(", ");
        sb.append(this.f7475R);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.h8
    public final void v(int i, jJj jjj, mdz mdz, int[] iArr, int[] iArr2) {
        int i2;
        int i3;
        if (!(iArr.length == 0)) {
            int B = jjj.B(this.R);
            boolean z = this.f7476R && mdz == mdz.Rtl;
            FW fw = nA.R;
            if (!z) {
                int length = iArr.length;
                int i4 = 0;
                i3 = 0;
                i2 = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = iArr[i4];
                    i5++;
                    int min = Math.min(i3, i - i6);
                    iArr2[i5] = min;
                    int min2 = Math.min(B, (i - min) - i6);
                    i3 = iArr2[i5] + i6 + min2;
                    i4++;
                    i2 = min2;
                }
            } else {
                i3 = 0;
                i2 = 0;
                for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                    int i7 = iArr[length2];
                    int min3 = Math.min(i3, i - i7);
                    iArr2[length2] = min3;
                    i2 = Math.min(B, (i - min3) - i7);
                    i3 = iArr2[length2] + i7 + i2;
                }
            }
            int i8 = i3 - i2;
            iv7 iv7 = this.f7475R;
            if (iv7 != null && i8 < i) {
                int intValue = ((Number) iv7.J(Integer.valueOf(i - i8), mdz)).intValue();
                int length3 = iArr2.length;
                for (int i9 = 0; i9 < length3; i9++) {
                    iArr2[i9] = iArr2[i9] + intValue;
                }
            }
        }
    }
}
