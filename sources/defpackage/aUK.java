package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: aUK  reason: default package */
/* loaded from: classes.dex */
public final class aUK extends DE {
    public final Executor R;

    public aUK(Executor executor) {
        this.R = executor;
    }

    @Override // defpackage.DE
    public final Ia R(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (biy.P(type) != fb.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type C = biy.C(0, (ParameterizedType) type);
            if (!biy.y(annotationArr, hgx.class)) {
                executor = this.R;
            }
            return new CV(this, C, executor, 19);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
