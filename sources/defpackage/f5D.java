package defpackage;

import android.os.Build;
import android.os.IBinder;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.util.Set;

/* renamed from: f5D  reason: default package */
/* loaded from: classes.dex */
public final class f5D extends aFk implements iv7 {
    public /* synthetic */ Object R;
    public int X;

    public f5D(aOO aoo) {
        super(2, aoo);
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((f5D) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        boolean z = true;
        if (i == 0) {
            jjU.o(obj);
            jy_ jy_ = (jy_) this.R;
            Set set = oWV.R;
            String str = Build.DEVICE;
            if (!set.contains(str) && !oWV.v.contains(str)) {
                return Boolean.FALSE;
            }
            try {
                Os.access("/dev/kvm", OsConstants.R_OK);
            } catch (ErrnoException e) {
                if (e.errno == OsConstants.ENOENT) {
                    pby[] pbyArr = kxm.R;
                    return Boolean.FALSE;
                }
                pby[] pbyArr2 = kxm.R;
            }
            GR gr = GR.v;
            this.X = 1;
            obj = mxC.u(1000, gr, this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((IBinder) obj) == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        f5D f5d = new f5D(aoo);
        f5d.R = obj;
        return f5d;
    }
}
