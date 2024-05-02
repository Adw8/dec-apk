package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: eB2  reason: default package */
/* loaded from: classes.dex */
public final class eB2 implements GenericArrayType, Type {
    public final Type R;

    public eB2(Type type) {
        this.R = type;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && n3x.v(this.R, ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.R;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return gQc.U(this.R) + "[]";
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.R.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        return getTypeName();
    }
}
