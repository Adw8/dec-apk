package defpackage;

/* renamed from: hv5  reason: default package */
/* loaded from: classes.dex */
public interface hv5 {
    default kvj R(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    default kvj v(Class cls, o0y o0y) {
        return R(cls);
    }
}
