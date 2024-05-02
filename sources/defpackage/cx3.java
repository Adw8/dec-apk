package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;

/* renamed from: cx3  reason: default package */
/* loaded from: classes.dex */
public final class cx3 extends k49 {
    public final Class R;

    /* renamed from: R  reason: collision with other field name */
    public final jsT f2460R;

    /* renamed from: R  reason: collision with other field name */
    public final Enum[] f2461R;

    /* renamed from: R  reason: collision with other field name */
    public final String[] f2462R;

    public cx3(Class cls) {
        this.R = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f2461R = enumArr;
            this.f2462R = new String[enumArr.length];
            int i = 0;
            while (true) {
                Enum[] enumArr2 = this.f2461R;
                if (i < enumArr2.length) {
                    String name = enumArr2[i].name();
                    String[] strArr = this.f2462R;
                    Field field = cls.getField(name);
                    Set set = mzK.f6263R;
                    mr5 mr5 = (mr5) field.getAnnotation(mr5.class);
                    if (mr5 != null) {
                        String name2 = mr5.name();
                        if (!"\u0000".equals(name2)) {
                            name = name2;
                        }
                    }
                    strArr[i] = name;
                    i++;
                } else {
                    this.f2460R = jsT.v(this.f2462R);
                    return;
                }
            }
        } catch (NoSuchFieldException e) {
            StringBuilder U = opT.U("Missing field in ");
            U.append(cls.getName());
            throw new AssertionError(U.toString(), e);
        }
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        mot.d(this.f2462R[((Enum) obj).ordinal()]);
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        int i;
        jsT jst = this.f2460R;
        b4j b4j = (b4j) csz;
        int i2 = b4j.f1521X;
        if (i2 == 0) {
            i2 = b4j.a();
        }
        if (i2 < 8 || i2 > 11) {
            i = -1;
        } else if (i2 == 11) {
            i = b4j.mL(b4j.f1520R, jst);
        } else {
            int p = b4j.f1518R.p((paU) jst.v);
            if (p != -1) {
                b4j.f1521X = 0;
                int[] iArr = b4j.v;
                int i3 = b4j.e - 1;
                iArr[i3] = iArr[i3] + 1;
                i = p;
            } else {
                String d = b4j.d();
                i = b4j.mL(d, jst);
                if (i == -1) {
                    b4j.f1521X = 11;
                    b4j.f1520R = d;
                    int[] iArr2 = b4j.v;
                    int i4 = b4j.e - 1;
                    iArr2[i4] = iArr2[i4] - 1;
                }
            }
        }
        if (i != -1) {
            return this.f2461R[i];
        }
        String Z = csz.Z();
        String d2 = csz.d();
        StringBuilder U = opT.U("Expected one of ");
        U.append(Arrays.asList(this.f2462R));
        U.append(" but was ");
        U.append(d2);
        U.append(" at path ");
        U.append(Z);
        throw new j8f(U.toString(), 0);
    }

    public final String toString() {
        StringBuilder U = opT.U("JsonAdapter(");
        U.append(this.R.getName());
        U.append(")");
        return U.toString();
    }
}
