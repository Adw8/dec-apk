package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: dB8  reason: default package */
/* loaded from: classes.dex */
public abstract class dB8 {
    public static final owM R = new owM(fzi.i);

    public static final kMk R(c_P c_p, int i) {
        if (i != 0) {
            switch (i - 1) {
                case 0:
                    return c_p.x;
                case 1:
                    return c_p.H;
                case 2:
                    return c_p.U;
                case 3:
                    return c_p.R;
                case 4:
                    return c_p.v;
                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    return c_p.c;
                case 6:
                    return c_p.e;
                case 7:
                    return c_p.X;
                case VmNativeCallback.$stable /* 8 */:
                    return c_p.O;
                case 9:
                    return c_p.C;
                case 10:
                    return c_p.N;
                case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                    return c_p.P;
                case 12:
                    return c_p.L;
                case 13:
                    return c_p.Z;
                case 14:
                    return c_p.m;
                default:
                    throw new j8f((Object) null);
            }
        } else {
            throw null;
        }
    }
}
