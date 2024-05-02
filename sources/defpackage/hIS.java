package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: hIS  reason: default package */
/* loaded from: classes.dex */
public final class hIS extends nta {
    public final k_Z R;

    public hIS(k_Z k_z) {
        this.R = k_z;
    }

    public static Set c(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(b29.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    @Override // defpackage.nta
    public final l9F R(Type type, Annotation[] annotationArr) {
        return new nJf(this.R.c(type, c(annotationArr), null));
    }

    @Override // defpackage.nta
    public final l9F v(Type type, Annotation[] annotationArr, f9I f9i) {
        return new aVk(this.R.c(type, c(annotationArr), null));
    }
}
