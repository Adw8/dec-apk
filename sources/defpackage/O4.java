package defpackage;

import java.lang.reflect.Method;

/* renamed from: O4  reason: default package */
/* loaded from: classes.dex */
public final class O4 extends pdD {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Method f325R;
    public final /* synthetic */ Class v;

    public O4(Method method, Object obj, Class cls) {
        this.f325R = method;
        this.R = obj;
        this.v = cls;
    }

    @Override // defpackage.pdD
    public final Object I() {
        return this.f325R.invoke(this.R, this.v);
    }

    public final String toString() {
        return this.v.getName();
    }
}
