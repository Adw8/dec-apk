package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: c1_  reason: default package */
/* loaded from: classes.dex */
public final class c1_ implements GenericArrayType {
    public final Type R;

    public c1_(Type type) {
        this.R = mzK.R(type);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && cpc.I(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.R;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.R.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        return mzK.x(this.R) + "[]";
    }
}
