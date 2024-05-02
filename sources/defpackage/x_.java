package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: x_  reason: default package */
/* loaded from: classes.dex */
public final class x_ implements fUt, f2 {
    public static final LinkedHashMap R;

    /* renamed from: R  reason: collision with other field name */
    public static final Map f7471R;

    /* renamed from: R  reason: collision with other field name */
    public final Class f7472R;

    static {
        int i = 0;
        List Y = pdD.Y(f_c.class, kg9.class, iv7.class, lR3.class, bBk.class, jkN.class, mT2.class, jUU.class, jUU.class, jUU.class, jUU.class, jUU.class, gyg.class, jUU.class, jUU.class, jUU.class, jUU.class, jUU.class, jUU.class, jUU.class, jUU.class, jUU.class, cTB.class);
        ArrayList arrayList = new ArrayList(a6.B(Y, 10));
        for (Object obj : Y) {
            i++;
            if (i >= 0) {
                arrayList.add(new kSh((Class) obj, Integer.valueOf(i)));
            } else {
                pdD.k();
                throw null;
            }
        }
        f7471R = mHQ.Y(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        for (String str : hashMap.values()) {
            StringBuilder U = opT.U("kotlin.jvm.internal.");
            U.append(iH_.vl(str));
            U.append("CompanionObject");
            String sb = U.toString();
            hashMap3.put(sb, str + ".Companion");
        }
        for (Map.Entry entry : f7471R.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(jjU.y(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), iH_.vl((String) entry2.getValue()));
        }
        R = linkedHashMap;
    }

    public x_(Class cls) {
        this.f7472R = cls;
    }

    @Override // defpackage.f2
    public final Class R() {
        return this.f7472R;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x_) && n3x.v(pdD.t(this), pdD.t((fUt) obj));
    }

    public final int hashCode() {
        return pdD.t(this).hashCode();
    }

    public final String toString() {
        return this.f7472R.toString() + " (Kotlin reflection is not available)";
    }
}
