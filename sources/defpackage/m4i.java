package defpackage;

import android.os.Looper;
import androidx.lifecycle.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: m4i  reason: default package */
/* loaded from: classes.dex */
public final class m4i extends aLd {

    /* renamed from: R  reason: collision with other field name */
    public final WeakReference f5901R;

    /* renamed from: R  reason: collision with other field name */
    public nol f5903R = new nol();
    public int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5904R = false;
    public boolean v = false;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f5902R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public iMP f5900R = iMP.INITIALIZED;
    public final boolean c = true;

    public m4i(nu_ nu_) {
        this.f5901R = new WeakReference(nu_);
    }

    public final void L(iMP imp) {
        e("setCurrentState");
        O(imp);
    }

    public final void O(iMP imp) {
        iMP imp2 = iMP.DESTROYED;
        iMP imp3 = this.f5900R;
        if (imp3 != imp) {
            if (imp3 == iMP.INITIALIZED && imp == imp2) {
                StringBuilder U = opT.U("no event down from ");
                U.append(this.f5900R);
                throw new IllegalStateException(U.toString());
            }
            this.f5900R = imp;
            if (this.f5904R || this.R != 0) {
                this.v = true;
                return;
            }
            this.f5904R = true;
            Z();
            this.f5904R = false;
            if (this.f5900R == imp2) {
                this.f5903R = new nol();
            }
        }
    }

    @Override // defpackage.aLd
    public final void R(f5f f5f) {
        nu_ nu_;
        e("addObserver");
        iMP imp = this.f5900R;
        iMP imp2 = iMP.DESTROYED;
        if (imp != imp2) {
            imp2 = iMP.INITIALIZED;
        }
        c cVar = new c(f5f, imp2);
        if (((c) this.f5903R.c(f5f, cVar)) == null && (nu_ = (nu_) this.f5901R.get()) != null) {
            boolean z = this.R != 0 || this.f5904R;
            iMP c = c(f5f);
            this.R++;
            while (cVar.R.compareTo(c) < 0 && this.f5903R.R.containsKey(f5f)) {
                this.f5902R.add(cVar.R);
                int ordinal = cVar.R.ordinal();
                alX alx = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : alX.ON_RESUME : alX.ON_START : alX.ON_CREATE;
                if (alx != null) {
                    cVar.R(nu_, alx);
                    ArrayList arrayList = this.f5902R;
                    arrayList.remove(arrayList.size() - 1);
                    c = c(f5f);
                } else {
                    StringBuilder U = opT.U("no event up from ");
                    U.append(cVar.R);
                    throw new IllegalStateException(U.toString());
                }
            }
            if (!z) {
                Z();
            }
            this.R--;
        }
    }

    public final void X(alX alx) {
        e("handleLifecycleEvent");
        O(alx.R());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0055, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x00f8, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z() {
        /*
        // Method dump skipped, instructions count: 378
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m4i.Z():void");
    }

    public final iMP c(f5f f5f) {
        nol nol = this.f5903R;
        iMP imp = null;
        lVU lvu = nol.R.containsKey(f5f) ? ((lVU) nol.R.get(f5f)).f5764v : null;
        iMP imp2 = lvu != null ? ((c) lvu.v).R : null;
        if (!this.f5902R.isEmpty()) {
            ArrayList arrayList = this.f5902R;
            imp = (iMP) arrayList.get(arrayList.size() - 1);
        }
        iMP imp3 = this.f5900R;
        if (imp2 == null || imp2.compareTo(imp3) >= 0) {
            imp2 = imp3;
        }
        return (imp == null || imp.compareTo(imp2) >= 0) ? imp2 : imp;
    }

    public final void e(String str) {
        if (this.c) {
            CW.S().f61R.getClass();
            if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
                throw new IllegalStateException(jQ.C("Method ", str, " must be called on the main thread"));
            }
        }
    }

    @Override // defpackage.aLd
    public final void v(f5f f5f) {
        e("removeObserver");
        this.f5903R.v(f5f);
    }
}
