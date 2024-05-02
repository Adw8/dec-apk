package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* renamed from: d5Z  reason: default package */
/* loaded from: classes.dex */
public final class d5Z extends nta {
    public static final d5Z R = new d5Z();

    @Override // defpackage.nta
    public final l9F v(Type type, Annotation[] annotationArr, f9I f9i) {
        if (biy.P(type) != Optional.class) {
            return null;
        }
        return new ezN(f9i.L(biy.C(0, (ParameterizedType) type), annotationArr));
    }
}
