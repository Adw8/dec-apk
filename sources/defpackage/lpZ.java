package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: lpZ  reason: default package */
/* loaded from: classes.dex */
public @interface lpZ {
    boolean encoded() default false;

    String value();
}
