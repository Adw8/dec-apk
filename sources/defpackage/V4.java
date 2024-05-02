package defpackage;

import android.view.View;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* renamed from: V4  reason: default package */
/* loaded from: classes.dex */
public final class V4 extends k8G implements kg9 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V4(Object obj, int i, Object obj2) {
        super(1);
        this.X = i;
        this.v = obj;
        this.R = obj2;
    }

    public final nRn R() {
        switch (this.X) {
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                kHc khc = (kHc) this.v;
                View view = (View) this.R;
                if (khc.f5235R == 0) {
                    n6E n6e = khc.f5237R;
                    WeakHashMap weakHashMap = of5.f6887R;
                    m18.V(view, n6e);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(khc.f5237R);
                    n6E n6e2 = khc.f5237R;
                    view.setWindowInsetsAnimationCallback(n6e2 != null ? new hNM(n6e2) : null);
                }
                khc.f5235R++;
                return new fQb((kHc) this.v, 4, (View) this.R);
            case 6:
            default:
                gv2 gv2 = (gv2) this.v;
                gv2.f3980R = (fDb) this.R;
                gv2.x();
                return new k7S(3);
            case 7:
                ((gx6) this.v).f3997R.remove(this.R);
                return new fQb((gx6) this.v, 5, this.R);
            case VmNativeCallback.$stable /* 8 */:
                ((M4) ((ze) this.v)).R.v((sR) this.R);
                return new fQb((ze) this.v, 6, (sR) this.R);
        }
    }

    public final void X(Throwable th) {
        Throwable th2 = null;
        _v _vVar = null;
        switch (this.X) {
            case 13:
                yH yHVar = (yH) this.v;
                Object obj = yHVar.f7484R;
                nWW nww = (nWW) this.R;
                synchronized (obj) {
                    List list = yHVar.f7486R;
                    Object obj2 = nww.R;
                    if (obj2 != null) {
                        _vVar = (_v) obj2;
                    }
                    list.remove(_vVar);
                }
                return;
            case 14:
                hP9 hp9 = (hP9) this.v;
                Object obj3 = hp9.f4226R;
                k0 k0Var = (k0) this.R;
                synchronized (obj3) {
                    ((List) hp9.v).remove(k0Var);
                }
                return;
            default:
                fLL fll = (fLL) this.v;
                Object obj4 = fll.f3384R;
                Throwable th3 = (Throwable) this.R;
                synchronized (obj4) {
                    if (th3 != null) {
                        if (th != null) {
                            if (!(!(th instanceof CancellationException))) {
                                th = null;
                            }
                            if (th != null) {
                                l6.U(th3, th);
                            }
                        }
                        th2 = th3;
                    }
                    fll.f3385R = th2;
                    fll.f3383R.H(a8X.ShutDown);
                }
                return;
        }
    }

    public final void c(h57 h57) {
        switch (this.X) {
            case 6:
                List list = (List) this.v;
                iFC ifc = (iFC) this.R;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    iFC ifc2 = (iFC) list.get(i);
                    if (ifc2 != ifc) {
                        ifc2.e(h57);
                    }
                }
                iFC ifc3 = (iFC) this.R;
                if (ifc3 != null) {
                    ifc3.e(h57);
                    return;
                }
                return;
            case 18:
                h57.L(h57, (l0f) this.v, 0, 0, ((Hn) this.R).R, 4);
                return;
            default:
                h57.L(h57, (l0f) this.v, 0, 0, ((lZs) this.R).f5773R, 4);
                return;
        }
    }

    public final void e(bNL bnl) {
        switch (this.X) {
            case 2:
                boolean e = mGH.e((h0T) this.v);
                b_t b_t = onS.e;
                icv icv = onS.f6950R[4];
                b_t.R(bnl, Boolean.valueOf(e));
                kEW kew = (kEW) bnl;
                kew.c(jGN.P, new Tp(null, new _c((jzQ) this.R, (h0T) this.v, 1)));
                return;
            default:
                icv[] icvArr = onS.f6950R;
                kEW kew2 = (kEW) bnl;
                kew2.c(dwC.t, Collections.singletonList((bz) this.v));
                kew2.c(jGN.R, new Tp(null, new cag((jyH) this.R, 1)));
                return;
        }
    }

    public final void v(ohT oht) {
        switch (this.X) {
            case 0:
                ((jDh) oht).v();
                jQ.Y(this.v);
                throw null;
            default:
                ((jDh) oht).v();
                fiv.S(oht, (cnO) this.v, (a1) this.R, 0.0f, null, 60);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013b, code lost:
        if (r15 == null) goto L_0x0151;
     */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x01e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01e4  */
    @Override // defpackage.kg9
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r15) {
        /*
        // Method dump skipped, instructions count: 1984
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.V4.x(java.lang.Object):java.lang.Object");
    }
}
