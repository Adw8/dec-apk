package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

/* renamed from: Uq  reason: default package */
/* loaded from: classes.dex */
public final class Uq extends pdD {
    public final /* synthetic */ Executable R;
    public final /* synthetic */ int e;
    public final /* synthetic */ Class v;

    public /* synthetic */ Uq(Executable executable, Class cls, int i) {
        this.e = i;
        this.R = executable;
        this.v = cls;
    }

    @Override // defpackage.pdD
    public final Object I() {
        switch (this.e) {
            case 0:
                return ((Constructor) this.R).newInstance(null);
            default:
                return ((Method) this.R).invoke(null, this.v, Object.class);
        }
    }

    public final String toString() {
        switch (this.e) {
            case 0:
                return this.v.getName();
            default:
                return this.v.getName();
        }
    }
}
