package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;

/* renamed from: jCU  reason: default package */
/* loaded from: classes.dex */
public final class jCU implements ParameterizedType {
    public final Type R;

    /* renamed from: R  reason: collision with other field name */
    public final Type[] f4856R;
    public final Type v;

    public jCU(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || cpc.d(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        this.R = type == null ? null : mzK.R(type);
        this.v = mzK.R(type2);
        this.f4856R = (Type[]) typeArr.clone();
        int i = 0;
        while (true) {
            Type[] typeArr2 = this.f4856R;
            if (i < typeArr2.length) {
                Type type3 = typeArr2[i];
                type3.getClass();
                mzK.v(type3);
                Type[] typeArr3 = this.f4856R;
                typeArr3[i] = mzK.R(typeArr3[i]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && cpc.I(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f4856R.clone();
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
        int hashCode = Arrays.hashCode(this.f4856R) ^ this.v.hashCode();
        Type type = this.R;
        Set set = mzK.f6263R;
        return (type != null ? type.hashCode() : 0) ^ hashCode;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f4856R.length + 1) * 30);
        sb.append(mzK.x(this.v));
        if (this.f4856R.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(mzK.x(this.f4856R[0]));
        for (int i = 1; i < this.f4856R.length; i++) {
            sb.append(", ");
            sb.append(mzK.x(this.f4856R[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
