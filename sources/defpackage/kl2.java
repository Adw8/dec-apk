package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: kl2  reason: default package */
/* loaded from: classes.dex */
public final class kl2 implements WildcardType, Type {
    public static final kl2 R = new kl2(null, null);

    /* renamed from: R  reason: collision with other field name */
    public final Type f5410R;
    public final Type v;

    public kl2(Type type, Type type2) {
        this.f5410R = type;
        this.v = type2;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.v;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        if (this.v != null) {
            StringBuilder U = opT.U("? super ");
            U.append(gQc.U(this.v));
            return U.toString();
        }
        Type type = this.f5410R;
        if (type == null || n3x.v(type, Object.class)) {
            return "?";
        }
        StringBuilder U2 = opT.U("? extends ");
        U2.append(gQc.U(this.f5410R));
        return U2.toString();
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f5410R;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
    }

    @Override // java.lang.Object
    public final String toString() {
        return getTypeName();
    }
}
