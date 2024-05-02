package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lLL  reason: default package */
/* loaded from: classes.dex */
public final class lLL {
    public final Method R;

    /* renamed from: R  reason: collision with other field name */
    public final List f5654R;

    public lLL(Method method, ArrayList arrayList) {
        this.R = method;
        this.f5654R = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.R.getDeclaringClass().getName(), this.R.getName(), this.f5654R);
    }
}
