package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: gLv  reason: default package */
/* loaded from: classes.dex */
public final class gLv implements ParameterizedType, Type {
    public final Class R;

    /* renamed from: R  reason: collision with other field name */
    public final Type f3732R;

    /* renamed from: R  reason: collision with other field name */
    public final Type[] f3733R;

    public gLv(Class cls, Type type, ArrayList arrayList) {
        this.R = cls;
        this.f3732R = type;
        this.f3733R = (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (n3x.v(this.R, parameterizedType.getRawType()) && n3x.v(this.f3732R, parameterizedType.getOwnerType()) && Arrays.equals(this.f3733R, parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f3733R;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f3732R;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.R;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Type type = this.f3732R;
        if (type != null) {
            sb.append(gQc.U(type));
            sb.append("$");
            sb.append(this.R.getSimpleName());
        } else {
            sb.append(gQc.U(this.R));
        }
        Type[] typeArr = this.f3733R;
        if (!(typeArr.length == 0)) {
            kXV kxv = kXV.R;
            sb.append((CharSequence) "<");
            int i = 0;
            for (Type type2 : typeArr) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                n3x.R(sb, type2, kxv);
            }
            sb.append((CharSequence) ">");
        }
        return sb.toString();
    }

    @Override // java.lang.Object
    public final int hashCode() {
        int hashCode = this.R.hashCode();
        Type type = this.f3732R;
        return Arrays.hashCode(this.f3733R) ^ (hashCode ^ (type != null ? type.hashCode() : 0));
    }

    @Override // java.lang.Object
    public final String toString() {
        return getTypeName();
    }
}
