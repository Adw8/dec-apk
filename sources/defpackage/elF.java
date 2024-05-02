package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: elF  reason: default package */
/* loaded from: classes.dex */
public final class elF extends pdD {
    public final Method R;

    /* renamed from: R  reason: collision with other field name */
    public final l9F f3193R;
    public final int X;
    public final /* synthetic */ int e;

    public /* synthetic */ elF(Method method, int i, l9F l9f, int i2) {
        this.e = i2;
        this.R = method;
        this.X = i;
        this.f3193R = l9f;
    }

    @Override // defpackage.pdD
    public final void Z(kK5 kk5, Object obj) {
        switch (this.e) {
            case 0:
                if (obj != null) {
                    try {
                        kk5.f5259R = (h7U) this.f3193R.X(obj);
                        return;
                    } catch (IOException e) {
                        Method method = this.R;
                        int i = this.X;
                        throw biy.V(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
                    }
                } else {
                    throw biy.i(this.R, this.X, "Body parameter value must not be null.", new Object[0]);
                }
            default:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                kk5.v(str, (String) this.f3193R.X(value));
                            } else {
                                throw biy.i(this.R, this.X, jQ.C("Header map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw biy.i(this.R, this.X, "Header map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw biy.i(this.R, this.X, "Header map was null.", new Object[0]);
        }
    }
}
