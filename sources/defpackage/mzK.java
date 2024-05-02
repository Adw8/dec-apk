package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: mzK  reason: default package */
/* loaded from: classes.dex */
public abstract class mzK {
    public static final Class R;

    /* renamed from: R  reason: collision with other field name */
    public static final Set f6263R = Collections.emptySet();

    /* renamed from: R  reason: collision with other field name */
    public static final Type[] f6264R = new Type[0];

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        R = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        Collections.unmodifiableMap(linkedHashMap);
    }

    public static j8f H(String str, String str2, csz csz) {
        String Z = csz.Z();
        return new j8f(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", str, Z) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, Z), 0);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x004b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:84:0x004b */
    public static Type L(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        TypeVariable typeVariable;
        do {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (linkedHashSet.contains(typeVariable)) {
                    return type2;
                }
                linkedHashSet.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls2 != null) {
                    Type c = c(type, cls, cls2);
                    if (c instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        while (i < typeParameters.length) {
                            if (typeVariable.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) c).getActualTypeArguments()[i];
                                continue;
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable;
                continue;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type L = L(type, cls, componentType, linkedHashSet);
                        return componentType == L ? cls3 : new c1_(L);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type L2 = L(type, cls, genericComponentType, linkedHashSet);
                    return genericComponentType == L2 ? genericArrayType : new c1_(L2);
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type L3 = L(type, cls, ownerType, linkedHashSet);
                    boolean z = L3 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type L4 = L(type, cls, actualTypeArguments[i], linkedHashSet);
                        if (L4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = L4;
                        }
                        i++;
                    }
                    return z ? new jCU(L3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                } else {
                    boolean z2 = type2 instanceof WildcardType;
                    WildcardType wildcardType = type2;
                    if (z2) {
                        WildcardType wildcardType2 = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type L5 = L(type, cls, lowerBounds[0], linkedHashSet);
                            wildcardType = wildcardType2;
                            if (L5 != lowerBounds[0]) {
                                return new khJ(new Type[]{Object.class}, L5 instanceof WildcardType ? ((WildcardType) L5).getLowerBounds() : new Type[]{L5});
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type L6 = L(type, cls, upperBounds[0], linkedHashSet);
                                wildcardType = wildcardType2;
                                if (L6 != upperBounds[0]) {
                                    return new khJ(L6 instanceof WildcardType ? ((WildcardType) L6).getUpperBounds() : new Type[]{L6}, f6264R);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }

    public static Type O(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    public static Type R(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new c1_(R(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof jCU) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new jCU(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return type instanceof c1_ ? type : new c1_(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType) || (type instanceof khJ)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new khJ(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static j8f X(String str, String str2, csz csz) {
        String Z = csz.Z();
        return new j8f(str2.equals(str) ? String.format("Required value '%s' missing at %s", str, Z) : String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, Z), 0);
    }

    public static void Z(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        } else if (targetException instanceof Error) {
            throw ((Error) targetException);
        } else {
            throw new RuntimeException(targetException);
        }
    }

    public static Type c(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return c(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean e(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static String m(Type type, Set set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    public static void v(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    public static String x(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
