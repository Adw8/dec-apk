package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: tm  reason: default package */
/* loaded from: classes.dex */
public final class tm implements nxu {
    public final /* synthetic */ int R;

    public /* synthetic */ tm(int i) {
        this.R = i;
    }

    public static void v(Type type, Class cls) {
        Class<?> d = cpc.d(type);
        if (cls.isAssignableFrom(d)) {
            throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + d.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    @Override // defpackage.nxu
    public final k49 R(Type type, Set set, k_Z k_z) {
        k49 k49;
        k49 k492;
        Class<?> cls;
        NoSuchMethodException e;
        Object[] objArr;
        Constructor<?> constructor;
        pdD pdd;
        mr5 mr5;
        Class d;
        Type[] typeArr;
        Type type2 = type;
        int i = 0;
        int i2 = 1;
        switch (this.R) {
            case 0:
                Type genericComponentType = type2 instanceof GenericArrayType ? ((GenericArrayType) type2).getGenericComponentType() : type2 instanceof Class ? ((Class) type2).getComponentType() : null;
                if (genericComponentType != null && set.isEmpty()) {
                    return new vJ(cpc.d(genericComponentType), k_z.v(genericComponentType)).e();
                }
                return null;
            case 1:
                if (!(type2 instanceof Class) && !(type2 instanceof ParameterizedType)) {
                    return null;
                }
                Class d2 = cpc.d(type);
                if (d2.isInterface() || d2.isEnum() || !set.isEmpty()) {
                    return null;
                }
                if (mzK.e(d2)) {
                    v(type2, List.class);
                    v(type2, Set.class);
                    v(type2, Map.class);
                    v(type2, Collection.class);
                    String str = "Platform " + d2;
                    if (type2 instanceof ParameterizedType) {
                        str = str + " in " + type2;
                    }
                    throw new IllegalArgumentException(opT.H(str, " requires explicit JsonAdapter to be registered"));
                } else if (d2.isAnonymousClass()) {
                    StringBuilder U = opT.U("Cannot serialize anonymous class ");
                    U.append(d2.getName());
                    throw new IllegalArgumentException(U.toString());
                } else if (d2.isLocalClass()) {
                    StringBuilder U2 = opT.U("Cannot serialize local class ");
                    U2.append(d2.getName());
                    throw new IllegalArgumentException(U2.toString());
                } else if (d2.getEnclosingClass() != null && !Modifier.isStatic(d2.getModifiers())) {
                    StringBuilder U3 = opT.U("Cannot serialize non-static nested class ");
                    U3.append(d2.getName());
                    throw new IllegalArgumentException(U3.toString());
                } else if (!Modifier.isAbstract(d2.getModifiers())) {
                    Class<? extends Annotation> cls2 = mzK.R;
                    if (!(cls2 != null && d2.isAnnotationPresent(cls2))) {
                        try {
                            try {
                                try {
                                    try {
                                        Constructor declaredConstructor = d2.getDeclaredConstructor(new Class[0]);
                                        declaredConstructor.setAccessible(true);
                                        pdd = new Uq(declaredConstructor, d2, 0);
                                    } catch (Exception unused) {
                                        StringBuilder U4 = opT.U("cannot construct instances of ");
                                        U4.append(d2.getName());
                                        throw new IllegalArgumentException(U4.toString());
                                    }
                                } catch (NoSuchMethodException unused2) {
                                    Class<?> cls3 = Class.forName("sun.misc.Unsafe");
                                    Field declaredField = cls3.getDeclaredField("theUnsafe");
                                    declaredField.setAccessible(true);
                                    pdd = new O4(cls3.getMethod("allocateInstance", Class.class), declaredField.get(null), d2);
                                }
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                                declaredMethod.setAccessible(true);
                                int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                                declaredMethod2.setAccessible(true);
                                pdd = new N9(declaredMethod2, d2, intValue);
                            } catch (IllegalAccessException unused4) {
                                throw new AssertionError();
                            }
                        } catch (IllegalAccessException unused5) {
                            throw new AssertionError();
                        } catch (NoSuchMethodException unused6) {
                            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                            declaredMethod3.setAccessible(true);
                            pdd = new Uq(declaredMethod3, d2, 1);
                        } catch (InvocationTargetException e2) {
                            mzK.Z(e2);
                            throw null;
                        }
                        TreeMap treeMap = new TreeMap();
                        while (type2 != Object.class) {
                            Class d3 = cpc.d(type2);
                            boolean e3 = mzK.e(d3);
                            Field[] declaredFields = d3.getDeclaredFields();
                            int length = declaredFields.length;
                            i2 = i;
                            while (i < length) {
                                Field field = declaredFields[i];
                                int modifiers = field.getModifiers();
                                if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !e3)) {
                                }
                                if (i2 != 0 && ((mr5 = (mr5) field.getAnnotation(mr5.class)) == null || !mr5.ignore())) {
                                    Type L = mzK.L(type2, d3, field.getGenericType(), new LinkedHashSet());
                                    Annotation[] annotations = field.getAnnotations();
                                    int length2 = annotations.length;
                                    int i3 = 0;
                                    LinkedHashSet linkedHashSet = null;
                                    while (i3 < length2) {
                                        Annotation annotation = annotations[i3];
                                        if (annotation.annotationType().isAnnotationPresent(b29.class)) {
                                            if (linkedHashSet == null) {
                                                linkedHashSet = new LinkedHashSet();
                                            }
                                            linkedHashSet.add(annotation);
                                            linkedHashSet = linkedHashSet;
                                        }
                                        i3++;
                                        d3 = d3;
                                        e3 = e3;
                                        declaredFields = declaredFields;
                                    }
                                    d3 = d3;
                                    e3 = e3;
                                    declaredFields = declaredFields;
                                    Set unmodifiableSet = linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : mzK.f6263R;
                                    String name = field.getName();
                                    k49 c = k_z.c(L, unmodifiableSet, name);
                                    field.setAccessible(true);
                                    if (mr5 != null) {
                                        String name2 = mr5.name();
                                        if (!"\u0000".equals(name2)) {
                                            name = name2;
                                        }
                                    }
                                    L_ l_ = (L_) treeMap.put(name, new L_(name, field, c));
                                    if (l_ != null) {
                                        StringBuilder U5 = opT.U("Conflicting fields:\n    ");
                                        U5.append(l_.f281R);
                                        U5.append("\n    ");
                                        U5.append(field);
                                        throw new IllegalArgumentException(U5.toString());
                                    }
                                } else {
                                    d3 = d3;
                                    e3 = e3;
                                    declaredFields = declaredFields;
                                }
                                i++;
                                i2 = 0;
                                i2 = 1;
                            }
                            Class d4 = cpc.d(type2);
                            type2 = mzK.L(type2, d4, d4.getGenericSuperclass(), new LinkedHashSet());
                            i = 0;
                            i2 = 1;
                        }
                        return new Yr(pdd, treeMap).e();
                    }
                    StringBuilder U6 = opT.U("Cannot serialize Kotlin type ");
                    U6.append(d2.getName());
                    U6.append(". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                    throw new IllegalArgumentException(U6.toString());
                } else {
                    StringBuilder U7 = opT.U("Cannot serialize abstract class ");
                    U7.append(d2.getName());
                    throw new IllegalArgumentException(U7.toString());
                }
            case 2:
                Class d5 = cpc.d(type);
                if (!set.isEmpty()) {
                    return null;
                }
                if (d5 == List.class || d5 == Collection.class) {
                    return new Nh(k_z.v(cpc.V(type2, Collection.class)), 0).e();
                }
                if (d5 == Set.class) {
                    return new Nh(k_z.v(cpc.V(type2, Collection.class)), 1).e();
                }
                return null;
            case 3:
                if (!set.isEmpty() || (d = cpc.d(type)) != Map.class) {
                    return null;
                }
                if (type2 == Properties.class) {
                    typeArr = new Type[]{String.class, String.class};
                } else if (Map.class.isAssignableFrom(d)) {
                    Type L2 = mzK.L(type2, d, mzK.c(type2, d, Map.class), new LinkedHashSet());
                    typeArr = L2 instanceof ParameterizedType ? ((ParameterizedType) L2).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                } else {
                    throw new IllegalArgumentException();
                }
                return new a2F(k_z, typeArr[0], typeArr[1]).e();
            case 4:
                return null;
            default:
                if (!set.isEmpty()) {
                    return null;
                }
                if (type2 == Boolean.TYPE) {
                    return pdD.f7135R;
                }
                if (type2 == Byte.TYPE) {
                    return pdD.v;
                }
                if (type2 == Character.TYPE) {
                    return pdD.c;
                }
                if (type2 == Double.TYPE) {
                    return pdD.e;
                }
                if (type2 == Float.TYPE) {
                    return pdD.X;
                }
                if (type2 == Integer.TYPE) {
                    return pdD.O;
                }
                if (type2 == Long.TYPE) {
                    return pdD.L;
                }
                if (type2 == Short.TYPE) {
                    return pdD.Z;
                }
                if (type2 == Boolean.class) {
                    return pdD.f7135R.e();
                }
                if (type2 == Byte.class) {
                    return pdD.v.e();
                }
                if (type2 == Character.class) {
                    return pdD.c.e();
                }
                if (type2 == Double.class) {
                    return pdD.e.e();
                }
                if (type2 == Float.class) {
                    return pdD.X.e();
                }
                if (type2 == Integer.class) {
                    return pdD.O.e();
                }
                if (type2 == Long.class) {
                    return pdD.L.e();
                }
                if (type2 == Short.class) {
                    return pdD.Z.e();
                }
                if (type2 == String.class) {
                    return pdD.m.e();
                }
                if (type2 == Object.class) {
                    return new o7L(k_z).e();
                }
                Class d6 = cpc.d(type);
                Set set2 = mzK.f6263R;
                h8S h8s = (h8S) d6.getAnnotation(h8S.class);
                if (h8s == null || !h8s.generateAdapter()) {
                    k492 = null;
                    k49 = null;
                } else {
                    String name3 = d6.getName();
                    try {
                        try {
                            cls = Class.forName(name3.replace("$", "_") + "JsonAdapter", true, d6.getClassLoader());
                        } catch (NoSuchMethodException e4) {
                            e = e4;
                            cls = null;
                        }
                        try {
                            if (type2 instanceof ParameterizedType) {
                                Type[] actualTypeArguments = ((ParameterizedType) type2).getActualTypeArguments();
                                try {
                                    constructor = cls.getDeclaredConstructor(k_Z.class, Type[].class);
                                    objArr = new Object[]{k_z, actualTypeArguments};
                                } catch (NoSuchMethodException unused7) {
                                    constructor = cls.getDeclaredConstructor(Type[].class);
                                    objArr = new Object[]{actualTypeArguments};
                                }
                            } else {
                                try {
                                    constructor = cls.getDeclaredConstructor(k_Z.class);
                                    objArr = new Object[]{k_z};
                                } catch (NoSuchMethodException unused8) {
                                    constructor = cls.getDeclaredConstructor(new Class[0]);
                                    objArr = new Object[0];
                                }
                            }
                            constructor.setAccessible(true);
                            k492 = ((k49) constructor.newInstance(objArr)).e();
                            k49 = null;
                        } catch (NoSuchMethodException e5) {
                            e = e5;
                            if ((type2 instanceof ParameterizedType) || cls.getTypeParameters().length == 0) {
                                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type2, e);
                            }
                            throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type2 + "'. Suspiciously, the type was not parameterized but the target class '" + cls.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                        }
                    } catch (ClassNotFoundException e6) {
                        throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type2, e6);
                    } catch (IllegalAccessException e7) {
                        throw new RuntimeException("Failed to access the generated JsonAdapter for " + type2, e7);
                    } catch (InstantiationException e8) {
                        throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type2, e8);
                    } catch (InvocationTargetException e9) {
                        mzK.Z(e9);
                        throw null;
                    }
                }
                return k492 != null ? k492 : d6.isEnum() ? new cx3(d6).e() : k49;
        }
    }
}
