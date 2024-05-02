package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: ofk  reason: default package */
/* loaded from: classes.dex */
public final class ofk implements WildcardType {
    public final Type R;
    public final Type v;

    public ofk(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        } else if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        } else if (typeArr2.length == 1) {
            Type type = typeArr2[0];
            type.getClass();
            biy.L(type);
            if (typeArr[0] == Object.class) {
                this.v = typeArr2[0];
                this.R = Object.class;
                return;
            }
            throw new IllegalArgumentException();
        } else {
            Type type2 = typeArr[0];
            type2.getClass();
            biy.L(type2);
            this.v = null;
            this.R = typeArr[0];
        }
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && biy.x(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.v;
        return type != null ? new Type[]{type} : biy.f1776R;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.R};
    }

    @Override // java.lang.Object
    public final int hashCode() {
        Type type = this.v;
        return (this.R.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    @Override // java.lang.Object
    public final String toString() {
        if (this.v != null) {
            StringBuilder U = opT.U("? super ");
            U.append(biy.h(this.v));
            return U.toString();
        } else if (this.R == Object.class) {
            return "?";
        } else {
            StringBuilder U2 = opT.U("? extends ");
            U2.append(biy.h(this.R));
            return U2.toString();
        }
    }
}
