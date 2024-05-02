package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: UJ  reason: default package */
/* loaded from: classes.dex */
public final class UJ extends k8G implements f_c {
    public final /* synthetic */ cwX R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pm2 f557R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UJ(pm2 pm2, cwX cwx, int i) {
        super(0);
        this.X = i;
        this.f557R = pm2;
        this.R = cwx;
    }

    public final hv5 R() {
        hv5 L;
        hv5 L2;
        hv5 L3;
        hv5 L4;
        hv5 L5;
        hv5 L6;
        hv5 L7;
        hv5 L8;
        hv5 L9;
        hv5 L10;
        hv5 L11;
        hv5 L12;
        jIY jiy = null;
        switch (this.X) {
            case 0:
                ly1 e = gvP.e(this.R);
                if (e instanceof jIY) {
                    jiy = (jIY) e;
                }
                return (jiy == null || (L2 = jiy.L()) == null) ? this.f557R.L() : L2;
            case 1:
                ly1 e2 = gvP.e(this.R);
                if (e2 instanceof jIY) {
                    jiy = (jIY) e2;
                }
                return (jiy == null || (L3 = jiy.L()) == null) ? this.f557R.L() : L3;
            case 2:
                ly1 e3 = gvP.e(this.R);
                if (e3 instanceof jIY) {
                    jiy = (jIY) e3;
                }
                return (jiy == null || (L4 = jiy.L()) == null) ? this.f557R.L() : L4;
            case 3:
                ly1 e4 = gvP.e(this.R);
                if (e4 instanceof jIY) {
                    jiy = (jIY) e4;
                }
                return (jiy == null || (L5 = jiy.L()) == null) ? this.f557R.L() : L5;
            case 4:
                ly1 e5 = gvP.e(this.R);
                if (e5 instanceof jIY) {
                    jiy = (jIY) e5;
                }
                return (jiy == null || (L6 = jiy.L()) == null) ? this.f557R.L() : L6;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                ly1 e6 = gvP.e(this.R);
                if (e6 instanceof jIY) {
                    jiy = (jIY) e6;
                }
                return (jiy == null || (L7 = jiy.L()) == null) ? this.f557R.L() : L7;
            case 6:
                ly1 e7 = gvP.e(this.R);
                if (e7 instanceof jIY) {
                    jiy = (jIY) e7;
                }
                return (jiy == null || (L8 = jiy.L()) == null) ? this.f557R.L() : L8;
            case 7:
                ly1 e8 = gvP.e(this.R);
                if (e8 instanceof jIY) {
                    jiy = (jIY) e8;
                }
                return (jiy == null || (L9 = jiy.L()) == null) ? this.f557R.L() : L9;
            case VmNativeCallback.$stable /* 8 */:
                ly1 e9 = gvP.e(this.R);
                if (e9 instanceof jIY) {
                    jiy = (jIY) e9;
                }
                return (jiy == null || (L10 = jiy.L()) == null) ? this.f557R.L() : L10;
            case 9:
                ly1 e10 = gvP.e(this.R);
                if (e10 instanceof jIY) {
                    jiy = (jIY) e10;
                }
                return (jiy == null || (L11 = jiy.L()) == null) ? this.f557R.L() : L11;
            case 10:
                ly1 e11 = gvP.e(this.R);
                if (e11 instanceof jIY) {
                    jiy = (jIY) e11;
                }
                return (jiy == null || (L12 = jiy.L()) == null) ? this.f557R.L() : L12;
            default:
                ly1 e12 = gvP.e(this.R);
                if (e12 instanceof jIY) {
                    jiy = (jIY) e12;
                }
                return (jiy == null || (L = jiy.L()) == null) ? this.f557R.L() : L;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                return R();
            case 1:
                return R();
            case 2:
                return R();
            case 3:
                return R();
            case 4:
                return R();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return R();
            case 6:
                return R();
            case 7:
                return R();
            case VmNativeCallback.$stable /* 8 */:
                return R();
            case 9:
                return R();
            case 10:
                return R();
            default:
                return R();
        }
    }
}
