package defpackage;

import java.io.Serializable;

/* renamed from: Z5  reason: default package */
/* loaded from: classes.dex */
public abstract class Z5 implements goX, Serializable {
    public transient goX R;

    /* renamed from: R  reason: collision with other field name */
    public final Class f659R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f660R;

    /* renamed from: R  reason: collision with other field name */
    public final String f661R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f662R;
    public final String v;

    public Z5(Object obj, Class cls, String str, String str2, boolean z) {
        this.f660R = obj;
        this.f659R = cls;
        this.f661R = str;
        this.v = str2;
        this.f662R = z;
    }

    public final goX R() {
        goX gox = this.R;
        if (gox != null) {
            return gox;
        }
        goX v = v();
        this.R = v;
        return v;
    }

    public final f2 c() {
        Class cls = this.f659R;
        if (cls == null) {
            return null;
        }
        if (!this.f662R) {
            return g8d.R(cls);
        }
        g8d.R.getClass();
        return new h9o(cls);
    }

    public abstract goX v();
}
