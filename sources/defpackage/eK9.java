package defpackage;

/* renamed from: eK9  reason: default package */
/* loaded from: classes.dex */
public final class eK9 extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f3061R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f3062R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f3063R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eK9(Object obj, String str, ncu ncu, long j, int i, int i2, int i3) {
        super(2);
        this.X = i3;
        this.f3061R = obj;
        this.f3062R = str;
        this.f3063R = ncu;
        this.R = j;
        this.O = i;
        this.L = i2;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                f7Z.R((nUO) this.f3061R, this.f3062R, this.f3063R, this.R, m88, this.O | 1, this.L);
                return;
            default:
                f7Z.v((jww) this.f3061R, this.f3062R, this.f3063R, this.R, m88, this.O | 1, this.L);
                return;
        }
    }
}
