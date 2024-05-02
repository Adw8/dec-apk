package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* renamed from: hmV  reason: default package */
/* loaded from: classes.dex */
public final class hmV extends iB8 {
    public final Class R;

    public hmV(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            try {
                this.R = Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }

    @Override // defpackage.iB8
    public final Object R(String str, Bundle bundle) {
        return (Serializable[]) bundle.get(str);
    }

    @Override // defpackage.iB8
    public final Object c(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.os.Bundle */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.iB8
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.os.Bundle r1, java.lang.String r2, java.lang.Object r3) {
        /*
            r0 = this;
            java.io.Serializable[] r3 = (java.io.Serializable[]) r3
            java.lang.Class r0 = r0.R
            r0.cast(r3)
            r1.putSerializable(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmV.e(android.os.Bundle, java.lang.String, java.lang.Object):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !n3x.v(hmV.class, obj.getClass())) {
            return false;
        }
        return n3x.v(this.R, ((hmV) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    @Override // defpackage.iB8
    public final String v() {
        return this.R.getName();
    }
}
