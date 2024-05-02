package defpackage;

/* renamed from: f1  reason: default package */
/* loaded from: classes.dex */
public abstract class f1 extends gIt implements hv5 {
    @Override // defpackage.hv5
    public final kvj R(Class cls) {
        if (cls.getCanonicalName() != null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.gIt
    public final void c(kvj kvj) {
    }

    public abstract kvj e(Class cls, nmx nmx);

    @Override // defpackage.hv5
    public final kvj v(Class cls, o0y o0y) {
        if (((String) o0y.R(dq.U)) != null) {
            return e(cls, mxC.H(o0y));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }
}
