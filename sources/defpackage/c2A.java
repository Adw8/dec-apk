package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: c2A  reason: default package */
/* loaded from: classes.dex */
public final class c2A {
    public static final Pattern R = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    public static final Pattern v = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    public boolean H;
    public boolean L;
    public boolean O;

    /* renamed from: R  reason: collision with other field name */
    public bd4 f1934R;

    /* renamed from: R  reason: collision with other field name */
    public final f9I f1935R;

    /* renamed from: R  reason: collision with other field name */
    public String f1936R;

    /* renamed from: R  reason: collision with other field name */
    public final Method f1937R;

    /* renamed from: R  reason: collision with other field name */
    public LinkedHashSet f1938R;

    /* renamed from: R  reason: collision with other field name */
    public oFB f1939R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1940R;

    /* renamed from: R  reason: collision with other field name */
    public final Annotation[] f1941R;

    /* renamed from: R  reason: collision with other field name */
    public final Type[] f1942R;

    /* renamed from: R  reason: collision with other field name */
    public pdD[] f1943R;

    /* renamed from: R  reason: collision with other field name */
    public final Annotation[][] f1944R;
    public boolean U;
    public boolean X;
    public boolean Z;
    public boolean c;
    public boolean e;
    public boolean m;

    /* renamed from: v  reason: collision with other field name */
    public String f1945v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1946v;
    public boolean x;

    public c2A(f9I f9i, Method method) {
        this.f1935R = f9i;
        this.f1937R = method;
        this.f1941R = method.getAnnotations();
        this.f1942R = method.getGenericParameterTypes();
        this.f1944R = method.getParameterAnnotations();
    }

    public static Class R(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    public final void c(int i, Type type) {
        if (biy.g(type)) {
            throw biy.i(this.f1937R, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }

    public final void v(String str, String str2, boolean z) {
        String str3 = this.f1936R;
        if (str3 == null) {
            this.f1936R = str;
            this.m = z;
            if (!str2.isEmpty()) {
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (R.matcher(substring).find()) {
                        throw biy.t(this.f1937R, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.f1945v = str2;
                Matcher matcher = R.matcher(str2);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (matcher.find()) {
                    linkedHashSet.add(matcher.group(1));
                }
                this.f1938R = linkedHashSet;
                return;
            }
            return;
        }
        throw biy.t(this.f1937R, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
    }
}
