package defpackage;

/* renamed from: ady  reason: default package */
/* loaded from: classes.dex */
public final class ady extends k8G implements kg9 {
    public final /* synthetic */ int L;

    /* renamed from: L  reason: collision with other field name */
    public final /* synthetic */ l0f f944L;
    public final /* synthetic */ int O;

    /* renamed from: O  reason: collision with other field name */
    public final /* synthetic */ l0f f945O;
    public final /* synthetic */ l0f R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lyV f946R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mZf f947R;
    public final /* synthetic */ int X;

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ l0f f948X;
    public final /* synthetic */ int Z;
    public final /* synthetic */ l0f c;
    public final /* synthetic */ l0f e;
    public final /* synthetic */ int m;
    public final /* synthetic */ l0f v;
    public final /* synthetic */ int x;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ady(l0f l0f, int i, int i2, int i3, int i4, l0f l0f2, l0f l0f3, l0f l0f4, l0f l0f5, l0f l0f6, l0f l0f7, lyV lyv, int i5, int i6, mZf mzf) {
        super(1);
        this.R = l0f;
        this.X = i;
        this.O = i2;
        this.L = i3;
        this.Z = i4;
        this.v = l0f2;
        this.c = l0f3;
        this.e = l0f4;
        this.f948X = l0f5;
        this.f945O = l0f6;
        this.f944L = l0f7;
        this.f946R = lyv;
        this.m = i5;
        this.x = i6;
        this.f947R = mzf;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        h57 h57 = (h57) obj;
        l0f l0f = this.R;
        if (l0f != null) {
            int i = this.X - this.O;
            if (i < 0) {
                i = 0;
            }
            int i2 = this.L;
            int i3 = this.Z;
            l0f l0f2 = this.v;
            l0f l0f3 = this.c;
            l0f l0f4 = this.e;
            l0f l0f5 = this.f948X;
            l0f l0f6 = this.f945O;
            l0f l0f7 = this.f944L;
            lyV lyv = this.f946R;
            boolean z = lyv.f5871R;
            int i4 = this.m + this.x;
            float f = lyv.R;
            float D = this.f947R.D();
            float f2 = nZp.R;
            h57.e(h57, l0f6, dU5.v);
            int e = i3 - c5p.e(l0f7);
            if (l0f4 != null) {
                h57.X(h57, l0f4, 0, dq.f2891v.R(l0f4.X, e));
            }
            if (l0f5 != null) {
                h57.X(h57, l0f5, i2 - l0f5.e, dq.f2891v.R(l0f5.X, e));
            }
            int R = z ? dq.f2891v.R(l0f.X, e) : mLz.t(c5p.R * D);
            h57.X(h57, l0f, c5p.X(l0f4), R - mLz.t(((float) (R - i)) * f));
            h57.X(h57, l0f2, c5p.X(l0f4), i4);
            if (l0f3 != null) {
                h57.X(h57, l0f3, c5p.X(l0f4), i4);
            }
            if (l0f7 != null) {
                h57.X(h57, l0f7, 0, e);
            }
        } else {
            int i5 = this.L;
            int i6 = this.Z;
            l0f l0f8 = this.v;
            l0f l0f9 = this.c;
            l0f l0f10 = this.e;
            l0f l0f11 = this.f948X;
            l0f l0f12 = this.f945O;
            l0f l0f13 = this.f944L;
            boolean z2 = this.f946R.f5871R;
            float D2 = this.f947R.D();
            ngd ngd = this.f946R.f5870R;
            float f3 = nZp.R;
            h57.e(h57, l0f12, dU5.v);
            int e2 = i6 - c5p.e(l0f13);
            int t = mLz.t(ngd.v() * D2);
            if (l0f10 != null) {
                h57.X(h57, l0f10, 0, dq.f2891v.R(l0f10.X, e2));
            }
            if (l0f11 != null) {
                h57.X(h57, l0f11, i5 - l0f11.e, dq.f2891v.R(l0f11.X, e2));
            }
            h57.X(h57, l0f8, c5p.X(l0f10), z2 ? dq.f2891v.R(l0f8.X, e2) : t);
            if (l0f9 != null) {
                if (z2) {
                    t = dq.f2891v.R(l0f9.X, e2);
                }
                h57.X(h57, l0f9, c5p.X(l0f10), t);
            }
            if (l0f13 != null) {
                h57.X(h57, l0f13, 0, e2);
            }
        }
        return o8s.R;
    }
}
