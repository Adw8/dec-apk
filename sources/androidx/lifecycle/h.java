package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class h extends gIt implements hv5 {
    public aLd R;

    /* renamed from: R  reason: collision with other field name */
    public Application f1347R;

    /* renamed from: R  reason: collision with other field name */
    public Bundle f1348R;

    /* renamed from: R  reason: collision with other field name */
    public bhK f1349R;

    /* renamed from: R  reason: collision with other field name */
    public final e0K f1350R;

    public h(Application application, adL adl, Bundle bundle) {
        e0K e0k;
        this.f1349R = adl.c();
        this.R = adl.O();
        this.f1348R = bundle;
        this.f1347R = application;
        if (application != null) {
            if (e0K.R == null) {
                e0K.R = new e0K(application);
            }
            e0k = e0K.R;
        } else {
            e0k = new e0K(null);
        }
        this.f1350R = e0k;
    }

    @Override // defpackage.hv5
    public final kvj R(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.gIt
    public final void c(kvj kvj) {
        aLd ald = this.R;
        if (ald != null) {
            d.R(kvj, this.f1349R, ald);
        }
    }

    public final kvj e(Class cls, String str) {
        Application application;
        if (this.R != null) {
            boolean isAssignableFrom = V5.class.isAssignableFrom(cls);
            Constructor R = (!isAssignableFrom || this.f1347R == null) ? h79.R(cls, h79.v) : h79.R(cls, h79.R);
            if (R != null) {
                bhK bhk = this.f1349R;
                aLd ald = this.R;
                Bundle bundle = this.f1348R;
                Bundle R2 = bhk.R(str);
                Class[] clsArr = nmx.R;
                nmx y = dq.y(R2, bundle);
                SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, y);
                if (!savedStateHandleController.f1334R) {
                    savedStateHandleController.f1334R = true;
                    ald.R(savedStateHandleController);
                    bhk.c(str, y.f6584R);
                    d.v(ald, bhk);
                    kvj v = (!isAssignableFrom || (application = this.f1347R) == null) ? h79.v(cls, R, y) : h79.v(cls, R, application, y);
                    v.c(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
                    return v;
                }
                throw new IllegalStateException("Already attached to lifecycleOwner");
            } else if (this.f1347R != null) {
                return this.f1350R.R(cls);
            } else {
                if (o2c.R == null) {
                    o2c.R = new o2c();
                }
                return o2c.R.R(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    @Override // defpackage.hv5
    public final kvj v(Class cls, o0y o0y) {
        String str = (String) o0y.R(dq.U);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (o0y.R(mxC.f6248R) != null && o0y.R(mxC.f6251v) != null) {
            Application application = (Application) o0y.R(ppN.U);
            boolean isAssignableFrom = V5.class.isAssignableFrom(cls);
            Constructor R = (!isAssignableFrom || application == null) ? h79.R(cls, h79.v) : h79.R(cls, h79.R);
            return R == null ? this.f1350R.v(cls, o0y) : (!isAssignableFrom || application == null) ? h79.v(cls, R, mxC.H(o0y)) : h79.v(cls, R, application, mxC.H(o0y));
        } else if (this.R != null) {
            return e(cls, str);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }
}
