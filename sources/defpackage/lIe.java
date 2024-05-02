package defpackage;

/* renamed from: lIe  reason: default package */
/* loaded from: classes.dex */
public final class lIe implements Comparable {
    public static final lIe O;
    public static final lIe R;
    public static final lIe X;
    public static final lIe c;
    public static final lIe e;
    public static final lIe v;

    /* renamed from: e  reason: collision with other field name */
    public final int f5651e;

    static {
        lIe lie = new lIe(100);
        lIe lie2 = new lIe(200);
        lIe lie3 = new lIe(300);
        lIe lie4 = new lIe(400);
        R = lie4;
        lIe lie5 = new lIe(500);
        v = lie5;
        lIe lie6 = new lIe(600);
        c = lie6;
        lIe lie7 = new lIe(700);
        lIe lie8 = new lIe(800);
        lIe lie9 = new lIe(900);
        e = lie4;
        X = lie5;
        O = lie7;
        pdD.Y(lie, lie2, lie3, lie4, lie5, lie6, lie7, lie8, lie9);
    }

    public lIe(int i) {
        this.f5651e = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(opT.Z("Font weight can be in range [1, 1000]. Current value: ", i).toString());
        }
    }

    /* renamed from: R */
    public final int compareTo(lIe lie) {
        return n3x.O(this.f5651e, lie.f5651e);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lIe) && this.f5651e == ((lIe) obj).f5651e;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.f5651e;
    }

    @Override // java.lang.Object
    public final String toString() {
        return jQ.P(opT.U("FontWeight(weight="), this.f5651e, ')');
    }
}
