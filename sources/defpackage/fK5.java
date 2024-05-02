package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: fK5  reason: default package */
/* loaded from: classes.dex */
public @interface fK5 {
    boolean encoded() default false;

    String value();
}
