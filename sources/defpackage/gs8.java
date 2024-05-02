package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: gs8  reason: default package */
/* loaded from: classes.dex */
public abstract class gs8 {
    public static final owM R = new owM(fzi.j);

    public static final n76 R(int i, m88 m88) {
        n76 n76;
        jr_ jr_ = (jr_) m88;
        jr_.w(-612531606);
        eG1 eg1 = (eG1) jr_.x(R);
        if (i != 0) {
            switch (i - 1) {
                case 0:
                    n76 = eg1.X;
                    break;
                case 1:
                    n76 = v(eg1.X);
                    break;
                case 2:
                    n76 = eg1.R;
                    break;
                case 3:
                    n76 = v(eg1.R);
                    break;
                case 4:
                    n76 = kfX.R;
                    break;
                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    n76 = eg1.e;
                    break;
                case 6:
                    gX2 gx2 = eg1.e;
                    float f = (float) 0.0d;
                    n76 = gX2.v(gx2, new c2I(f), null, new c2I(f), 6);
                    break;
                case 7:
                    n76 = v(eg1.e);
                    break;
                case VmNativeCallback.$stable:
                    n76 = eg1.c;
                    break;
                case 9:
                    n76 = cUF.f2104R;
                    break;
                case 10:
                    n76 = eg1.v;
                    break;
                default:
                    throw new j8f((Object) null);
            }
            jr_.g(false);
            return n76;
        }
        throw null;
    }

    public static final o9z v(gX2 gx2) {
        float f = (float) 0.0d;
        return gX2.v(gx2, null, new c2I(f), new c2I(f), 3);
    }
}
