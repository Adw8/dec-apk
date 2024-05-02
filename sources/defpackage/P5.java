package defpackage;

import java.lang.reflect.Method;

/* renamed from: P5  reason: default package */
/* loaded from: classes.dex */
public final class P5 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Method f382R;

    public P5(int i, Method method) {
        this.R = i;
        this.f382R = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P5)) {
            return false;
        }
        P5 p5 = (P5) obj;
        return this.R == p5.R && this.f382R.getName().equals(p5.f382R.getName());
    }

    public final int hashCode() {
        return this.f382R.getName().hashCode() + (this.R * 31);
    }
}
