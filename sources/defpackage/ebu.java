package defpackage;

import java.lang.reflect.Method;

/* renamed from: ebu  reason: default package */
/* loaded from: classes.dex */
public final class ebu extends pdD {
    public final Method R;
    public final int X;
    public final /* synthetic */ int e;

    public /* synthetic */ ebu(Method method, int i, int i2) {
        this.e = i2;
        this.R = method;
        this.X = i;
    }

    @Override // defpackage.pdD
    public final void Z(kK5 kk5, Object obj) {
        switch (this.e) {
            case 0:
                bd4 bd4 = (bd4) obj;
                if (bd4 != null) {
                    iRl irl = kk5.f5262R;
                    irl.getClass();
                    int length = bd4.R.length / 2;
                    for (int i = 0; i < length; i++) {
                        dTl.o(irl, bd4.v(i), bd4.H(i));
                    }
                    return;
                }
                throw biy.i(this.R, this.X, "Headers parameter must not be null.", new Object[0]);
            default:
                if (obj != null) {
                    kk5.v = obj.toString();
                    return;
                }
                throw biy.i(this.R, this.X, "@Url parameter is null.", new Object[0]);
        }
    }
}
