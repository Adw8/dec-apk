package defpackage;

import java.lang.reflect.Method;

/* renamed from: N9  reason: default package */
/* loaded from: classes.dex */
public final class N9 extends pdD {
    public final /* synthetic */ Method R;
    public final /* synthetic */ int e;
    public final /* synthetic */ Class v;

    public N9(Method method, Class cls, int i) {
        this.R = method;
        this.v = cls;
        this.e = i;
    }

    @Override // defpackage.pdD
    public final Object I() {
        return this.R.invoke(null, this.v, Integer.valueOf(this.e));
    }

    public final String toString() {
        return this.v.getName();
    }
}
