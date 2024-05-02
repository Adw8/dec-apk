package defpackage;

/* renamed from: ak2  reason: default package */
/* loaded from: classes.dex */
public final class ak2 {
    public final Object R;
    public final Object c;
    public final Object v;

    public ak2(Object obj, Object obj2, Object obj3) {
        this.R = obj;
        this.v = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException R() {
        StringBuilder U = opT.U("Multiple entries with same key: ");
        U.append(this.R);
        U.append("=");
        U.append(this.v);
        U.append(" and ");
        U.append(this.R);
        U.append("=");
        U.append(this.c);
        return new IllegalArgumentException(U.toString());
    }
}
