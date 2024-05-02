package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: j4l  reason: default package */
/* loaded from: classes.dex */
public final class j4l implements ParameterizedType {
    public final Type R;

    /* renamed from: R  reason: collision with other field name */
    public final Type[] f4819R;
    public final Type v;

    public j4l(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() != null ? false : true)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            biy.L(type3);
        }
        this.R = type;
        this.v = type2;
        this.f4819R = (Type[]) typeArr.clone();
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && biy.x(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f4819R.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.R;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.v;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f4819R) ^ this.v.hashCode();
        Type type = this.R;
        return (type != null ? type.hashCode() : 0) ^ hashCode;
    }

    @Override // java.lang.Object
    public final String toString() {
        Type[] typeArr = this.f4819R;
        if (typeArr.length == 0) {
            return biy.h(this.v);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(biy.h(this.v));
        sb.append("<");
        sb.append(biy.h(this.f4819R[0]));
        for (int i = 1; i < this.f4819R.length; i++) {
            sb.append(", ");
            sb.append(biy.h(this.f4819R[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
