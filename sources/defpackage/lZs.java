package defpackage;

/* renamed from: lZs  reason: default package */
/* loaded from: classes.dex */
public final class lZs extends mjG implements gl4 {
    public final float L;
    public final float O;
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final long f5772R;

    /* renamed from: R  reason: collision with other field name */
    public final fMI f5773R = new fMI(this);

    /* renamed from: R  reason: collision with other field name */
    public final n76 f5774R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5775R;
    public final float X;
    public final float Z;
    public final float c;

    /* renamed from: c  reason: collision with other field name */
    public final long f5776c;
    public final float e;
    public final float m;
    public final float v;

    /* renamed from: v  reason: collision with other field name */
    public final long f5777v;
    public final float x;

    public lZs(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, n76 n76, boolean z, long j2, long j3) {
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
        this.X = f5;
        this.O = f6;
        this.L = f7;
        this.Z = f8;
        this.m = f9;
        this.x = f10;
        this.f5772R = j;
        this.f5774R = n76;
        this.f5775R = z;
        this.f5777v = j2;
        this.f5776c = j3;
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        l0f L = pc0.L(j);
        return mzf.f(L.e, L.X, iia.R, new V4(L, 19, this));
    }

    public final boolean equals(Object obj) {
        lZs lzs = obj instanceof lZs ? (lZs) obj : null;
        if (lzs == null) {
            return false;
        }
        if (!(this.R == lzs.R)) {
            return false;
        }
        if (!(this.v == lzs.v)) {
            return false;
        }
        if (!(this.c == lzs.c)) {
            return false;
        }
        if (!(this.e == lzs.e)) {
            return false;
        }
        if (!(this.X == lzs.X)) {
            return false;
        }
        if (!(this.O == lzs.O)) {
            return false;
        }
        if (!(this.L == lzs.L)) {
            return false;
        }
        if (!(this.Z == lzs.Z)) {
            return false;
        }
        if (!(this.m == lzs.m)) {
            return false;
        }
        if (!(this.x == lzs.x)) {
            return false;
        }
        long j = this.f5772R;
        long j2 = lzs.f5772R;
        int i = b3a.R;
        return ((j > j2 ? 1 : (j == j2 ? 0 : -1)) == 0) && n3x.v(this.f5774R, lzs.f5774R) && this.f5775R == lzs.f5775R && n3x.v(null, null) && n3.c(this.f5777v, lzs.f5777v) && n3.c(this.f5776c, lzs.f5776c);
    }

    public final int hashCode() {
        int c = jQ.c(this.x, jQ.c(this.m, jQ.c(this.Z, jQ.c(this.L, jQ.c(this.O, jQ.c(this.X, jQ.c(this.e, jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        long j = this.f5772R;
        int i = b3a.R;
        int X = opT.X(j, c, 31);
        int hashCode = Boolean.hashCode(this.f5775R);
        long j2 = this.f5777v;
        int i2 = n3.R;
        return ejC.R(this.f5776c) + jQ.e(j2, (((hashCode + ((this.f5774R.hashCode() + X) * 31)) * 31) + 0) * 31, 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("SimpleGraphicsLayerModifier(scaleX=");
        U.append(this.R);
        U.append(", scaleY=");
        U.append(this.v);
        U.append(", alpha = ");
        U.append(this.c);
        U.append(", translationX=");
        U.append(this.e);
        U.append(", translationY=");
        U.append(this.X);
        U.append(", shadowElevation=");
        U.append(this.O);
        U.append(", rotationX=");
        U.append(this.L);
        U.append(", rotationY=");
        U.append(this.Z);
        U.append(", rotationZ=");
        U.append(this.m);
        U.append(", cameraDistance=");
        U.append(this.x);
        U.append(", transformOrigin=");
        long j = this.f5772R;
        int i = b3a.R;
        U.append((Object) ("TransformOrigin(packedValue=" + j + ')'));
        U.append(", shape=");
        U.append(this.f5774R);
        U.append(", clip=");
        U.append(this.f5775R);
        U.append(", renderEffect=");
        U.append((Object) null);
        U.append(", ambientShadowColor=");
        U.append((Object) n3.m(this.f5777v));
        U.append(", spotShadowColor=");
        U.append((Object) n3.m(this.f5776c));
        U.append(')');
        return U.toString();
    }
}
