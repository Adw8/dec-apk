package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: mr5  reason: default package */
/* loaded from: classes.dex */
public @interface mr5 {
    boolean ignore() default false;

    String name() default "\u0000";
}
