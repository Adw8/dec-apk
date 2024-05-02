package defpackage;

/* renamed from: lkI  reason: default package */
/* loaded from: classes.dex */
public final class lkI implements hgx {
    public static final lkI R = new lkI();

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return hgx.class;
    }

    @Override // java.lang.annotation.Annotation, java.lang.Object
    public final boolean equals(Object obj) {
        return obj instanceof hgx;
    }

    @Override // java.lang.annotation.Annotation, java.lang.Object
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation, java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("@");
        U.append(hgx.class.getName());
        U.append("()");
        return U.toString();
    }
}
