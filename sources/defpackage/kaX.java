package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kaX  reason: default package */
/* loaded from: classes.dex */
public @interface kaX {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
