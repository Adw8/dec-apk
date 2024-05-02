package defpackage;

/* renamed from: oRu  reason: default package */
/* loaded from: classes.dex */
public final class oRu extends pbU {
    public final Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ oRu(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    @Override // defpackage.pbU
    public final void h(Throwable th) {
        switch (this.e) {
            case 0:
                ((jZi) this.R).R();
                return;
            case 1:
                ((kg9) this.R).x(th);
                return;
            case 2:
                Object E = Y().E();
                if (E instanceof pag) {
                    ((xx) this.R).Y(new bvw(((pag) E).f7100R));
                    return;
                } else {
                    ((xx) this.R).Y(dTl.G(E));
                    return;
                }
            default:
                ((aOO) this.R).Y(o8s.R);
                return;
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.e) {
            case 0:
                h((Throwable) obj);
                break;
            case 1:
                h((Throwable) obj);
                break;
            case 2:
                h((Throwable) obj);
                break;
            default:
                h((Throwable) obj);
                break;
        }
        return o8s.R;
    }
}
