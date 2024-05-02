package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: o7L  reason: default package */
/* loaded from: classes.dex */
public final class o7L extends k49 {
    public final k49 R;

    /* renamed from: R  reason: collision with other field name */
    public final k_Z f6674R;
    public final k49 X;
    public final k49 c;
    public final k49 e;
    public final k49 v;

    public o7L(k_Z k_z) {
        this.f6674R = k_z;
        this.R = k_z.R(List.class);
        this.v = k_z.R(Map.class);
        this.c = k_z.R(String.class);
        this.e = k_z.R(Double.class);
        this.X = k_z.R(Boolean.class);
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        Class<?> cls = obj.getClass();
        if (cls == Object.class) {
            mot.c();
            mot.X();
            return;
        }
        k_Z k_z = this.f6674R;
        if (Map.class.isAssignableFrom(cls)) {
            cls = Map.class;
        } else if (Collection.class.isAssignableFrom(cls)) {
            cls = Collection.class;
        }
        k_z.c(cls, mzK.f6263R, null).O(mot, obj);
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        int I = jQ.I(csz.W());
        if (I == 0) {
            return this.R.R(csz);
        }
        if (I == 2) {
            return this.v.R(csz);
        }
        if (I == 5) {
            return this.c.R(csz);
        }
        if (I == 6) {
            return this.e.R(csz);
        }
        if (I == 7) {
            return this.X.R(csz);
        }
        if (I == 8) {
            csz.o();
            return null;
        }
        StringBuilder U = opT.U("Expected a value but was ");
        U.append(jQ.Q(csz.W()));
        U.append(" at path ");
        U.append(csz.Z());
        throw new IllegalStateException(U.toString());
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}
