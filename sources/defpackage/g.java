package defpackage;

/* renamed from: g  reason: default package */
/* loaded from: classes.dex */
public final class g extends O {
    public static final Y R = new Y(1, 2, g.class);

    /* renamed from: R  reason: collision with other field name */
    public static final g f3647R = new g((byte) 0);
    public static final g v = new g((byte) -1);

    /* renamed from: R  reason: collision with other field name */
    public final byte f3648R;

    public g(byte b) {
        this.f3648R = b;
    }

    public static g n(byte[] bArr) {
        if (bArr.length == 1) {
            byte b = bArr[0];
            return b != -1 ? b != 0 ? new g(b) : f3647R : v;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    @Override // defpackage.O
    public final boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        byte b = this.f3648R;
        zz.i(1, z);
        zz.P(1);
        zz.C(b);
    }

    public final boolean Q() {
        return this.f3648R != 0;
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return Zz.x(1, z);
    }

    @Override // defpackage.O, defpackage.t
    public final int hashCode() {
        return Q() ? 1 : 0;
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        return (o instanceof g) && Q() == ((g) o).Q();
    }

    public final String toString() {
        return Q() ? "TRUE" : "FALSE";
    }

    @Override // defpackage.O
    public final O u() {
        return Q() ? v : f3647R;
    }
}
