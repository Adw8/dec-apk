package defpackage;

/* renamed from: gvH  reason: default package */
/* loaded from: classes.dex */
public final class gvH {
    public static final gvH R = new gvH(true);

    /* renamed from: R  reason: collision with other field name */
    public final boolean f3988R;

    public gvH(boolean z) {
        this.f3988R = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gvH) && this.f3988R == ((gvH) obj).f3988R;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3988R);
    }

    public final String toString() {
        StringBuilder U = opT.U("PlatformParagraphStyle(includeFontPadding=");
        U.append(this.f3988R);
        U.append(')');
        return U.toString();
    }
}
