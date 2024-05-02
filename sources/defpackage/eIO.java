package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: eIO  reason: default package */
/* loaded from: classes.dex */
public @interface eIO {
    boolean encoded() default false;

    String value();
}
