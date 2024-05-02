package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: auU  reason: default package */
/* loaded from: classes.dex */
public final class auU implements GenericArrayType {
    public final Type R;

    public auU(Type type) {
        this.R = type;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && biy.x(this, (GenericArrayType) obj);
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
        return biy.h(this.R) + "[]";
    }
}
