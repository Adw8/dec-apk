package defpackage;

/* renamed from: meP  reason: default package */
/* loaded from: classes.dex */
public final class meP {
    public static final ppN R = new ppN();

    /* renamed from: R  reason: collision with other field name */
    public final byte f6104R;

    /* renamed from: R  reason: collision with other field name */
    public final int f6105R;
    public final byte v;

    public meP(byte b, byte b2, int i) {
        this.f6104R = b;
        this.v = b2;
        this.f6105R = i;
    }

    public final String toString() {
        byte b = this.f6104R;
        byte b2 = this.v;
        int i = this.f6105R;
        StringBuilder y = jQ.y("version=", b, ", type=", b2, ", payload=");
        y.append(i);
        return jQ.C("PairingPacketHeader(", y.toString(), ")");
    }
}
