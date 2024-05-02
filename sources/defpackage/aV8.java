package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* renamed from: aV8  reason: default package */
/* loaded from: classes.dex */
public final class aV8 extends DE {
    public static final aV8 R = new aV8();

    @Override // defpackage.DE
    public final Ia R(Type type, Annotation[] annotationArr) {
        if (biy.P(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type C = biy.C(0, (ParameterizedType) type);
            if (biy.P(C) != o3I.class) {
                return new ezN(C);
            }
            if (C instanceof ParameterizedType) {
                return new Zz(biy.C(0, (ParameterizedType) C));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
