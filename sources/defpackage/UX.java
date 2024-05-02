package defpackage;

/* renamed from: UX  reason: default package */
/* loaded from: classes.dex */
public final class UX extends k8G implements kg9 {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f569R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UX(Object obj, boolean z, int i) {
        super(1);
        this.X = i;
        this.R = obj;
        this.f569R = z;
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
            case 0:
                long j = ((aWo) obj).f906R;
                if (this.f569R) {
                    ((f_c) ((dH9) this.R).getValue()).g();
                }
                return o8s.R;
            case 1:
                jQ.Y(obj);
                R();
                throw null;
            case 2:
                jQ.Y(obj);
                R();
                throw null;
            default:
                jQ.Y(obj);
                R();
                throw null;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UX(boolean z, dH9 dh9) {
        super(1);
        this.X = 0;
        this.f569R = z;
        this.R = dh9;
    }
}
