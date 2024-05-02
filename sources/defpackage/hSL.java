package defpackage;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import java.util.Map;

/* renamed from: hSL  reason: default package */
/* loaded from: classes.dex */
public final class hSL {
    public final adL R;

    /* renamed from: R  reason: collision with other field name */
    public final bhK f4264R = new bhK();

    /* renamed from: R  reason: collision with other field name */
    public boolean f4265R;

    public hSL(adL adl) {
        this.R = adl;
    }

    public final void R() {
        m4i O = this.R.O();
        if (O.f5900R == iMP.INITIALIZED) {
            O.R(new Recreator(this.R));
            bhK bhk = this.f4264R;
            if (!bhk.f1770R) {
                O.R(new pkq(3, bhk));
                bhk.f1770R = true;
                this.f4265R = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void c(Bundle bundle) {
        bhK bhk = this.f4264R;
        bhk.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = bhk.f1768R;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        cWy cwy = bhk.f1769R;
        cwy.getClass();
        aCg acg = new aCg(cwy);
        cwy.R.put(acg, Boolean.FALSE);
        while (acg.hasNext()) {
            Map.Entry entry = (Map.Entry) acg.next();
            bundle2.putBundle((String) entry.getKey(), ((kod) entry.getValue()).R());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void v(Bundle bundle) {
        if (!this.f4265R) {
            R();
        }
        m4i O = this.R.O();
        if (!O.f5900R.R(iMP.STARTED)) {
            bhK bhk = this.f4264R;
            if (!bhk.f1770R) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
            } else if (!bhk.v) {
                bhk.f1768R = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                bhk.v = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
        } else {
            StringBuilder U = opT.U("performRestore cannot be called when owner is ");
            U.append(O.f5900R);
            throw new IllegalStateException(U.toString().toString());
        }
    }
}
