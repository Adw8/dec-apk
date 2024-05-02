package defpackage;

/* renamed from: dio  reason: default package */
/* loaded from: classes.dex */
public final class dio extends k8G implements kg9 {
    public final /* synthetic */ float R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dio(int i, float f) {
        super(1);
        this.X = i;
        this.R = f;
    }

    public final void R() {
        switch (this.X) {
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 1:
                jQ.Y(obj);
                R();
                throw null;
            case 2:
                jQ.Y(obj);
                R();
                throw null;
            case 3:
                jQ.Y(obj);
                R();
                throw null;
            default:
                jJj jjj = (jJj) obj;
                return new dU5(cU5.v(mLz.t(this.R), 0));
        }
    }
}
