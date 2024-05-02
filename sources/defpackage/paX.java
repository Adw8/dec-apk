package defpackage;

/* renamed from: paX  reason: default package */
/* loaded from: classes.dex */
public final class paX implements Comparable {
    public final String R;
    public final int X;
    public final int e;
    public final String v;

    public paX(int i, int i2, String str, String str2) {
        this.e = i;
        this.X = i2;
        this.R = str;
        this.v = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        paX pax = (paX) obj;
        int i = this.e - pax.e;
        return i == 0 ? this.X - pax.X : i;
    }
}
