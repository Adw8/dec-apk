package defpackage;

import java.io.IOException;

/* renamed from: uP  reason: default package */
/* loaded from: classes.dex */
public final class uP implements b, fXm {
    public mAv R;
    public final /* synthetic */ int e;

    public /* synthetic */ uP(int i, mAv mav) {
        this.e = i;
        this.R = mav;
    }

    @Override // defpackage.fXm
    public final O P() {
        switch (this.e) {
            case 0:
                return new d7(this.R.Z());
            case 1:
                return new D9(this.R.Z());
            case 2:
                try {
                    return new k2F(this.R.Z());
                } catch (IllegalArgumentException e) {
                    throw new P(e.getMessage(), e);
                }
            case 3:
                return k2D.R(this.R.Z());
            default:
                W Z = this.R.Z();
                fSU fsu = k2D.f5182R;
                return Z.R < 1 ? k2D.R : new cza(Z);
        }
    }

    @Override // defpackage.b
    public final O v() {
        switch (this.e) {
            case 0:
                try {
                    return P();
                } catch (IOException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            case 1:
                try {
                    return P();
                } catch (IOException e2) {
                    throw new _(0, e2.getMessage(), e2);
                }
            case 2:
                try {
                    return P();
                } catch (IOException e3) {
                    throw new _(0, "unable to get DER object", e3);
                } catch (IllegalArgumentException e4) {
                    throw new _(0, "unable to get DER object", e4);
                }
            case 3:
                try {
                    return P();
                } catch (IOException e5) {
                    throw new IllegalStateException(e5.getMessage());
                }
            default:
                try {
                    return P();
                } catch (IOException e6) {
                    throw new _(0, e6.getMessage(), e6);
                }
        }
    }
}
