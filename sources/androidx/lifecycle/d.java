package androidx.lifecycle;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class d {
    public static void R(kvj kvj, bhK bhk, aLd ald) {
        Object obj;
        boolean z;
        HashMap hashMap = kvj.R;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = kvj.R.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !(z = savedStateHandleController.f1334R)) {
            if (!z) {
                savedStateHandleController.f1334R = true;
                ald.R(savedStateHandleController);
                bhk.c(savedStateHandleController.R, savedStateHandleController.f1333R.f6584R);
                v(ald, bhk);
                return;
            }
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
    }

    public static void v(aLd ald, bhK bhk) {
        iMP imp = ((m4i) ald).f5900R;
        if (imp == iMP.INITIALIZED || imp.R(iMP.STARTED)) {
            bhk.e();
        } else {
            ald.R(new k3P(bhk) { // from class: androidx.lifecycle.LegacySavedStateHandleController$1

                /* renamed from: R  reason: collision with other field name */
                public final /* synthetic */ bhK f1321R;

                {
                    this.f1321R = r2;
                }

                @Override // defpackage.k3P
                public final void e(nu_ nu_, alX alx) {
                    if (alx == alX.ON_START) {
                        aLd.this.v(this);
                        this.f1321R.e();
                    }
                }
            });
        }
    }
}
