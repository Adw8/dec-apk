package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ebT  reason: default package */
/* loaded from: classes.dex */
public final class ebT {
    public final i4m R;

    /* renamed from: R  reason: collision with other field name */
    public final ivW f3156R;

    /* renamed from: R  reason: collision with other field name */
    public final jFk f3157R;

    /* renamed from: R  reason: collision with other field name */
    public final ReentrantLock f3158R = new ReentrantLock(true);

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mpr f3159R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3160R;
    public final i4m v;

    /* renamed from: v  reason: collision with other field name */
    public final ivW f3161v;

    public ebT(mpr mpr, jFk jfk) {
        this.f3159R = mpr;
        ivW O = g4x.O(fcD.R);
        this.f3156R = O;
        ivW O2 = g4x.O(lsA.R);
        this.f3161v = O2;
        this.R = new i4m(O);
        this.v = new i4m(O2);
        this.f3157R = jfk;
    }

    public final void R(j5B j5b) {
        ReentrantLock reentrantLock = this.f3158R;
        reentrantLock.lock();
        try {
            ivW ivw = this.f3156R;
            ivw.H(dF.iE((Collection) ivw.getValue(), j5b));
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void X(j5B j5b) {
        jFk v = this.f3159R.f6183R.v(j5b.f4822R.f2986R);
        if (n3x.v(v, this.f3157R)) {
            kg9 kg9 = this.f3159R.f6191R;
            if (kg9 != null) {
                kg9.x(j5b);
                R(j5b);
                return;
            }
            StringBuilder U = opT.U("Ignoring add of destination ");
            U.append(j5b.f4822R);
            U.append(" outside of the call to navigate(). ");
            Log.i("NavController", U.toString());
            return;
        }
        Object obj = this.f3159R.X.get(v);
        if (obj != null) {
            ((ebT) obj).X(j5b);
            return;
        }
        throw new IllegalStateException(jQ.g(opT.U("NavigatorBackStack for "), j5b.f4822R.f2986R, " should already be created").toString());
    }

    public final void c(j5B j5b, boolean z) {
        jFk v = this.f3159R.f6183R.v(j5b.f4822R.f2986R);
        if (n3x.v(v, this.f3157R)) {
            mpr mpr = this.f3159R;
            kg9 kg9 = mpr.f6196v;
            if (kg9 != null) {
                kg9.x(j5b);
                e(j5b);
                return;
            }
            eOg eog = new eOg(2, this, j5b, z);
            int indexOf = mpr.f6186R.indexOf(j5b);
            if (indexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + j5b + " as it was not found on the current back stack");
                return;
            }
            int i = indexOf + 1;
            il ilVar = mpr.f6186R;
            if (i != ilVar.X) {
                mpr.P(((j5B) ilVar.get(i)).f4822R.e, true, false);
            }
            mpr.g(mpr, j5b);
            eog.g();
            mpr.K();
            mpr.v();
            return;
        }
        ((ebT) this.f3159R.X.get(v)).c(j5b, z);
    }

    public final void e(j5B j5b) {
        ReentrantLock reentrantLock = this.f3158R;
        reentrantLock.lock();
        try {
            ivW ivw = this.f3156R;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) ivw.getValue()) {
                if (!(!n3x.v((j5B) obj, j5b))) {
                    break;
                }
                arrayList.add(obj);
            }
            ivw.H(arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void v(j5B j5b) {
        ivW ivw = this.f3156R;
        ivw.H(dF.iE(dF.cr((Iterable) ivw.getValue(), dF.zw((List) this.f3156R.getValue())), j5b));
    }
}
