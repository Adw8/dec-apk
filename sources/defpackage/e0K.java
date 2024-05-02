package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: e0K  reason: default package */
/* loaded from: classes.dex */
public final class e0K extends o2c {
    public static e0K R;

    /* renamed from: R  reason: collision with other field name */
    public final Application f2933R;

    public e0K(Application application) {
        this.f2933R = application;
    }

    @Override // defpackage.o2c, defpackage.hv5
    public final kvj R(Class cls) {
        Application application = this.f2933R;
        if (application != null) {
            return c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public final kvj c(Class cls, Application application) {
        if (!V5.class.isAssignableFrom(cls)) {
            return super.R(cls);
        }
        try {
            return (kvj) cls.getConstructor(Application.class).newInstance(application);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    @Override // defpackage.hv5
    public final kvj v(Class cls, o0y o0y) {
        if (this.f2933R != null) {
            return R(cls);
        }
        Application application = (Application) o0y.R(ppN.U);
        if (application != null) {
            return c(cls, application);
        }
        if (!V5.class.isAssignableFrom(cls)) {
            return super.R(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }
}
