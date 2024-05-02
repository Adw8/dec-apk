package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: _d  reason: default package */
/* loaded from: classes.dex */
public final class _d extends k8G implements f_c {
    public final /* synthetic */ f_c R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ _d(f_c f_c, int i) {
        super(0);
        this.X = i;
        this.R = f_c;
    }

    public final ly1 R() {
        switch (this.X) {
            case 7:
                return (ly1) this.R.g();
            case VmNativeCallback.$stable /* 8 */:
                return (ly1) this.R.g();
            case 9:
                return (ly1) this.R.g();
            case 10:
                return (ly1) this.R.g();
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return (ly1) this.R.g();
            case 12:
                return (ly1) this.R.g();
            case 13:
                return (ly1) this.R.g();
            case 14:
                return (ly1) this.R.g();
            case 15:
                return (ly1) this.R.g();
            case 16:
                return (ly1) this.R.g();
            case 17:
                return (ly1) this.R.g();
            default:
                return (ly1) this.R.g();
        }
    }

    @Override // defpackage.f_c
    public final Object g() {
        switch (this.X) {
            case 0:
                return v();
            case 1:
                return v();
            case 2:
                return this.R.g();
            case 3:
                return v();
            case 4:
                return this.R.g();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return this.R.g();
            case 6:
                return this.R.g();
            case 7:
                return R();
            case VmNativeCallback.$stable /* 8 */:
                return R();
            case 9:
                return R();
            case 10:
                return R();
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return R();
            case 12:
                return R();
            case 13:
                return R();
            case 14:
                return R();
            case 15:
                return R();
            case 16:
                return R();
            case 17:
                return R();
            case 18:
                return R();
            default:
                try {
                    return (List) this.R.g();
                } catch (SSLPeerUnverifiedException unused) {
                    return fcD.R;
                }
        }
    }

    public final Boolean v() {
        switch (this.X) {
            case 0:
                this.R.g();
                return Boolean.TRUE;
            case 1:
                this.R.g();
                return Boolean.TRUE;
            default:
                this.R.g();
                return Boolean.TRUE;
        }
    }
}
