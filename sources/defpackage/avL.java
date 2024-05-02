package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: avL  reason: default package */
/* loaded from: classes.dex */
public final class avL extends pdD {
    public final Method R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f1491R;
    public final int X;
    public final /* synthetic */ int e;

    public /* synthetic */ avL(Method method, int i, boolean z, int i2) {
        this.e = i2;
        this.R = method;
        this.X = i;
        this.f1491R = z;
    }

    public final void G(kK5 kk5, Map map) {
        switch (this.e) {
            case 0:
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                String obj = value.toString();
                                if (obj != null) {
                                    kk5.R(str, obj, this.f1491R);
                                } else {
                                    Method method = this.R;
                                    int i = this.X;
                                    throw biy.i(method, i, "Field map value '" + value + "' converted to null by " + dq.class.getName() + " for key '" + str + "'.", new Object[0]);
                                }
                            } else {
                                throw biy.i(this.R, this.X, jQ.C("Field map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw biy.i(this.R, this.X, "Field map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw biy.i(this.R, this.X, "Field map was null.", new Object[0]);
            default:
                if (map != null) {
                    for (Map.Entry entry2 : map.entrySet()) {
                        String str2 = (String) entry2.getKey();
                        if (str2 != null) {
                            Object value2 = entry2.getValue();
                            if (value2 != null) {
                                String obj2 = value2.toString();
                                if (obj2 != null) {
                                    kk5.e(str2, obj2, this.f1491R);
                                } else {
                                    Method method2 = this.R;
                                    int i2 = this.X;
                                    throw biy.i(method2, i2, "Query map value '" + value2 + "' converted to null by " + dq.class.getName() + " for key '" + str2 + "'.", new Object[0]);
                                }
                            } else {
                                throw biy.i(this.R, this.X, jQ.C("Query map contained null value for key '", str2, "'."), new Object[0]);
                            }
                        } else {
                            throw biy.i(this.R, this.X, "Query map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw biy.i(this.R, this.X, "Query map was null", new Object[0]);
        }
    }

    @Override // defpackage.pdD
    public final /* bridge */ /* synthetic */ void Z(kK5 kk5, Object obj) {
        switch (this.e) {
            case 0:
                G(kk5, (Map) obj);
                return;
            default:
                G(kk5, (Map) obj);
                return;
        }
    }
}
