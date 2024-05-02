package defpackage;

/* renamed from: wU  reason: default package */
/* loaded from: classes.dex */
public final class wU extends k8G implements kg9 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ C0 f7462R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h8 f7463R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l0f f7464R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mZf f7465R;
    public final /* synthetic */ int X;
    public final /* synthetic */ l0f c;
    public final /* synthetic */ l0f v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public wU(l0f l0f, int i, l0f l0f2, h8 h8Var, long j, l0f l0f3, mZf mzf, C0 c0, int i2, int i3) {
        super(1);
        this.f7464R = l0f;
        this.X = i;
        this.v = l0f2;
        this.f7463R = h8Var;
        this.R = j;
        this.c = l0f3;
        this.f7465R = mzf;
        this.f7462R = c0;
        this.O = i2;
        this.L = i3;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        h57 h57 = (h57) obj;
        l0f l0f = this.f7464R;
        int i = 0;
        h57.X(h57, l0f, 0, (this.X - l0f.X) / 2);
        l0f l0f2 = this.v;
        h8 h8Var = this.f7463R;
        oy oyVar = nA.f6329R;
        int Z = n3x.v(h8Var, oyVar) ? (oys.Z(this.R) - this.v.e) / 2 : n3x.v(h8Var, nA.v) ? (oys.Z(this.R) - this.v.e) - this.c.e : Math.max(this.f7465R.B(c3.v), this.f7464R.e);
        C0 c0 = this.f7462R;
        if (n3x.v(c0, oyVar)) {
            i = (this.X - this.v.X) / 2;
        } else if (n3x.v(c0, nA.f6332v)) {
            int i2 = this.O;
            if (i2 == 0) {
                i = this.X - this.v.X;
            } else {
                int i3 = this.X;
                int i4 = this.v.X;
                i = (i3 - i4) - Math.max(0, (i2 - i4) + this.L);
            }
        }
        h57.X(h57, l0f2, Z, i);
        l0f l0f3 = this.c;
        int Z2 = oys.Z(this.R);
        l0f l0f4 = this.c;
        h57.X(h57, l0f3, Z2 - l0f4.e, (this.X - l0f4.X) / 2);
        return o8s.R;
    }
}
