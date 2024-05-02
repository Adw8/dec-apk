package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: dN9  reason: default package */
/* loaded from: classes.dex */
public final class dN9 implements Xf {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ k0 f2581R;

    public /* synthetic */ dN9(xx xxVar, int i) {
        this.R = i;
        this.f2581R = xxVar;
    }

    @Override // defpackage.Xf
    public final void R(fb fbVar, o3I o3i) {
        switch (this.R) {
            case 0:
                if (o3i.R.f2543R) {
                    Object obj = o3i.f6659R;
                    if (obj == null) {
                        j0 C = fbVar.C();
                        C.getClass();
                        x_ R = g8d.R(lLL.class);
                        Object cast = R.R().cast(((Map) C.X).get(R));
                        if (cast != null) {
                            Method method = ((lLL) cast).R;
                            StringBuilder U = opT.U("Response from ");
                            U.append(method.getDeclaringClass().getName());
                            U.append('.');
                            U.append(method.getName());
                            U.append(" was null but response body type was declared as non-null");
                            dE5 de5 = new dE5(U.toString());
                            ((xx) this.f2581R).Y(new bvw(de5));
                            return;
                        }
                        dE5 de52 = new dE5();
                        n3x.y(n3x.class.getName(), de52);
                        throw de52;
                    }
                    ((xx) this.f2581R).Y(obj);
                    return;
                }
                ((xx) this.f2581R).Y(new bvw(new iYd(o3i)));
                return;
            case 1:
                if (o3i.R.f2543R) {
                    ((xx) this.f2581R).Y(o3i.f6659R);
                    return;
                }
                ((xx) this.f2581R).Y(new bvw(new iYd(o3i)));
                return;
            default:
                ((xx) this.f2581R).Y(o3i);
                return;
        }
    }

    @Override // defpackage.Xf
    public final void v(Throwable th) {
        switch (this.R) {
            case 0:
                ((xx) this.f2581R).Y(new bvw(th));
                return;
            case 1:
                ((xx) this.f2581R).Y(new bvw(th));
                return;
            default:
                ((xx) this.f2581R).Y(new bvw(th));
                return;
        }
    }
}
