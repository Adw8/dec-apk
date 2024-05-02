package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: f9I  reason: default package */
/* loaded from: classes.dex */
public final class f9I {
    public Lh R;

    /* renamed from: R  reason: collision with other field name */
    public a7_ f3328R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f3329R;

    /* renamed from: R  reason: collision with other field name */
    public final List f3330R;

    /* renamed from: R  reason: collision with other field name */
    public Executor f3331R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3332R;
    public final List v;

    public f9I() {
        hpz hpz = hpz.R;
        this.f3330R = new ArrayList();
        this.v = new ArrayList();
        this.f3329R = hpz;
    }

    public final l9F L(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f3330R.indexOf(null) + 1;
        int size = this.f3330R.size();
        for (int i = indexOf; i < size; i++) {
            l9F v = ((nta) this.f3330R.get(i)).v(type, annotationArr, this);
            if (v != null) {
                return v;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f3330R.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((nta) this.f3330R.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final l9F O(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f3330R.indexOf(null) + 1;
        int size = this.f3330R.size();
        for (int i = indexOf; i < size; i++) {
            l9F R = ((nta) this.f3330R.get(i)).R(type, annotationArr);
            if (R != null) {
                return R;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f3330R.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((nta) this.f3330R.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void R(String str) {
        hro hro = new hro();
        hro.X(null, str);
        a7_ v = hro.v();
        List list = v.f739R;
        if ("".equals(list.get(list.size() - 1))) {
            this.f3328R = v;
            return;
        }
        throw new IllegalArgumentException("baseUrl must end in /: " + v);
    }

    public final dNl X(Method method) {
        dNl dnl;
        dNl dnl2 = (dNl) ((Map) this.f3329R).get(method);
        if (dnl2 != null) {
            return dnl2;
        }
        synchronized (((Map) this.f3329R)) {
            dnl = (dNl) ((Map) this.f3329R).get(method);
            if (dnl == null) {
                dnl = dNl.v(this, method);
                ((Map) this.f3329R).put(method, dnl);
            }
        }
        return dnl;
    }

    public final void Z(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        int size = this.f3330R.size();
        for (int i = 0; i < size; i++) {
            ((nta) this.f3330R.get(i)).getClass();
        }
    }

    public final Ia c(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.v.indexOf(null) + 1;
        int size = this.v.size();
        for (int i = indexOf; i < size; i++) {
            Ia R = ((DE) this.v.get(i)).R(type, annotationArr);
            if (R != null) {
                return R;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.v.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((DE) this.v.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final Object e(Class cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f3332R) {
                hpz hpz = hpz.R;
                Method[] declaredMethods = cls.getDeclaredMethods();
                for (Method method : declaredMethods) {
                    if (!(hpz.f4392R && method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                        X(method);
                    }
                }
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new ow_(this, cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public final f9I v() {
        if (this.f3328R != null) {
            Lh lh = this.R;
            if (lh == null) {
                lh = new nZz(new jwR());
            }
            Executor executor = this.f3331R;
            if (executor == null) {
                executor = ((hpz) this.f3329R).R();
            }
            ArrayList arrayList = new ArrayList(this.v);
            hpz hpz = (hpz) this.f3329R;
            hpz.getClass();
            aUK auk = new aUK(executor);
            arrayList.addAll(hpz.f4392R ? Arrays.asList(aV8.R, auk) : Collections.singletonList(auk));
            ArrayList arrayList2 = new ArrayList(this.f3330R.size() + 1 + (((hpz) this.f3329R).f4392R ? 1 : 0));
            arrayList2.add(new uN());
            arrayList2.addAll(this.f3330R);
            arrayList2.addAll(((hpz) this.f3329R).f4392R ? Collections.singletonList(d5Z.R) : Collections.emptyList());
            return new f9I(lh, this.f3328R, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.f3332R);
        }
        throw new IllegalStateException("Base URL required.");
    }

    public /* synthetic */ f9I(Lh lh, a7_ a7_, List list, List list2, Executor executor, boolean z) {
        this.f3329R = new ConcurrentHashMap();
        this.R = lh;
        this.f3328R = a7_;
        this.f3330R = list;
        this.v = list2;
        this.f3331R = executor;
        this.f3332R = z;
    }
}
