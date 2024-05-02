package defpackage;

import android.graphics.Shader;

/* renamed from: qD  reason: default package */
/* loaded from: classes.dex */
public final class qD extends a1 {
    public long R = nqW.c;

    /* renamed from: R  reason: collision with other field name */
    public Shader f7354R;
    public final /* synthetic */ Shader v;

    public qD(Shader shader) {
        this.v = shader;
    }

    @Override // defpackage.a1
    public final void R(float f, long j, gw gwVar) {
        Shader shader = this.f7354R;
        if (shader == null || !nqW.R(this.R, j)) {
            shader = this.v;
            this.f7354R = shader;
            this.R = j;
        }
        long X = aH9.X(gwVar.f3991R.getColor());
        long j2 = n3.v;
        if (!n3.c(X, j2)) {
            gwVar.X(j2);
        }
        if (!n3x.v(gwVar.f3992R, shader)) {
            gwVar.f3992R = shader;
            gwVar.f3991R.setShader(shader);
        }
        if (!(((float) gwVar.f3991R.getAlpha()) / 255.0f == f)) {
            gwVar.e(f);
        }
    }
}
