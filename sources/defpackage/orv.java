package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: orv  reason: default package */
/* loaded from: classes.dex */
public final class orv implements InvocationHandler {
    public String R;

    /* renamed from: R  reason: collision with other field name */
    public final List f6982R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6983R;

    public orv(ArrayList arrayList) {
        this.f6982R = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (n3x.v(name, "supports") && n3x.v(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (!n3x.v(name, "unsupported") || !n3x.v(Void.TYPE, returnType)) {
            if (n3x.v(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f6982R;
                }
            }
            if ((n3x.v(name, "selectProtocol") || n3x.v(name, "select")) && n3x.v(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    if (obj2 != null) {
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                Object obj3 = list.get(i);
                                if (obj3 != null) {
                                    String str = (String) obj3;
                                    if (!this.f6982R.contains(str)) {
                                        if (i == size) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        this.R = str;
                                        return str;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                        String str2 = (String) this.f6982R.get(0);
                        this.R = str2;
                        return str2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
            }
            if ((!n3x.v(name, "protocolSelected") && !n3x.v(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            if (obj4 != null) {
                this.R = (String) obj4;
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f6983R = true;
        return null;
    }
}
