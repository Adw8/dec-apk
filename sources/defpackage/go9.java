package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: go9  reason: default package */
/* loaded from: classes.dex */
public final class go9 extends pdD {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public final Method f3934R;

    /* renamed from: R  reason: collision with other field name */
    public final l9F f3935R;
    public final int X;
    public final /* synthetic */ int e = 0;

    public go9(Method method, int i, bd4 bd4, l9F l9f) {
        this.f3934R = method;
        this.X = i;
        this.R = bd4;
        this.f3935R = l9f;
    }

    @Override // defpackage.pdD
    public final void Z(kK5 kk5, Object obj) {
        switch (this.e) {
            case 0:
                if (obj != null) {
                    try {
                        kk5.c((bd4) this.R, (h7U) this.f3935R.X(obj));
                        return;
                    } catch (IOException e) {
                        Method method = this.f3934R;
                        int i = this.X;
                        throw biy.i(method, i, "Unable to convert " + obj + " to RequestBody", e);
                    }
                } else {
                    return;
                }
            default:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                kk5.c(ppN.N("Content-Disposition", jQ.C("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) this.R), (h7U) this.f3935R.X(value));
                            } else {
                                throw biy.i(this.f3934R, this.X, jQ.C("Part map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw biy.i(this.f3934R, this.X, "Part map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw biy.i(this.f3934R, this.X, "Part map was null.", new Object[0]);
        }
    }

    public go9(Method method, int i, l9F l9f, String str) {
        this.f3934R = method;
        this.X = i;
        this.f3935R = l9f;
        this.R = str;
    }
}
