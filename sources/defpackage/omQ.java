package defpackage;

/* renamed from: omQ  reason: default package */
/* loaded from: classes.dex */
public final class omQ extends k8G implements f_c {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f6933R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ omQ(kg9 kg9, boolean z, int i) {
        super(0);
        this.X = i;
        this.R = kg9;
        this.f6933R = z;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                ((kg9) this.R).x(Boolean.valueOf(!this.f6933R));
                return;
            case 1:
                ((kg9) this.R).x(Boolean.valueOf(!this.f6933R));
                return;
            case 2:
                ((kg9) this.R).x(Boolean.valueOf(!this.f6933R));
                return;
            default:
                if (this.f6933R) {
                    ((jzQ) this.R).v();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            case 1:
                R();
                break;
            case 2:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public omQ(boolean z, jzQ jzq) {
        super(0);
        this.X = 3;
        this.f6933R = z;
        this.R = jzq;
    }
}
