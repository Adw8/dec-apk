package defpackage;

import java.io.File;

/* renamed from: aay  reason: default package */
/* loaded from: classes.dex */
public final class aay extends aFk implements iv7 {
    public final /* synthetic */ iHI R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aay(iHI ihi, aOO aoo) {
        super(2, aoo);
        this.R = ihi;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((aay) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            iHI ihi = this.R;
            this.X = 1;
            ihi.getClass();
            kxm.v(gvP.V(-3881558803784132499L), 4, gvP.V(-3881558859618707347L), null);
            String absolutePath = new File(ihi.R.getFilesDir(), gvP.V(-3881558941223085971L)).getAbsolutePath();
            new File(ihi.R.getFilesDir(), gvP.V(-3881558997057660819L)).delete();
            String V = gvP.V(-3881559052892235667L);
            String[] strArr = {gvP.V(-3881559108726810515L), opT.H("unix://", absolutePath)};
            btA bta = new btA(2);
            bta.R(ihi.R.getApplicationInfo().nativeLibraryDir + "/lib" + V + ".so");
            bta.v(strArr);
            Process start = new ProcessBuilder((String[]) bta.O(new String[bta.X()])).directory(ihi.R.getFilesDir()).redirectErrorStream(true).start();
            mLz.Y(true, new e5B(start, ihi, V, 0), 29);
            mLz.Y(true, new e5B(start, ihi, V, 1), 29);
            kxm.v(gvP.V(-3881559143086548883L), 4, gvP.V(-3881559198921123731L), null);
            Object L = ihi.L(100, new fB0(ihi, 11, absolutePath), this);
            if (L != bgr) {
                L = o8s.R;
            }
            if (L != bgr) {
                L = o8s.R;
            }
            if (L == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(gvP.V(-3881557682797668243L));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new aay(this.R, aoo);
    }
}
