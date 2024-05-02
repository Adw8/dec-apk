package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: ow_  reason: default package */
/* loaded from: classes.dex */
public final class ow_ implements InvocationHandler {
    public final /* synthetic */ f9I R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Class f7033R;

    /* renamed from: R  reason: collision with other field name */
    public final hpz f7032R = hpz.R;

    /* renamed from: R  reason: collision with other field name */
    public final Object[] f7034R = new Object[0];

    public ow_(f9I f9i, Class cls) {
        this.R = f9i;
        this.f7033R = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f7034R;
        }
        if (this.f7032R.f4392R && method.isDefault()) {
            return this.f7032R.v(method, this.f7033R, obj, objArr);
        }
        dNl X = this.R.X(method);
        return X.R(new oEG(X.f2588R, objArr, X.R, X.f2589R), objArr);
    }
}
