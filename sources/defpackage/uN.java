package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: uN  reason: default package */
/* loaded from: classes.dex */
public final class uN extends nta {
    public boolean R = true;

    @Override // defpackage.nta
    public final l9F R(Type type, Annotation[] annotationArr) {
        if (h7U.class.isAssignableFrom(biy.P(type))) {
            return ppN.X;
        }
        return null;
    }

    @Override // defpackage.nta
    public final l9F v(Type type, Annotation[] annotationArr, f9I f9i) {
        if (type == arx.class) {
            return biy.y(annotationArr, kXz.class) ? D6.R : hw1.v;
        }
        if (type == Void.class) {
            return d_.R;
        }
        if (!this.R || type != o8s.class) {
            return null;
        }
        try {
            return oL.R;
        } catch (NoClassDefFoundError unused) {
            this.R = false;
            return null;
        }
    }
}
