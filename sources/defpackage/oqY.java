package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: oqY  reason: default package */
/* loaded from: classes.dex */
public @interface oqY {
    String encoding() default "binary";

    String value() default "";
}
