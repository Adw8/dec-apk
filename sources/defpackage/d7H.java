package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* renamed from: d7H  reason: default package */
/* loaded from: classes.dex */
public class d7H extends iB8 {
    public final Class R;

    public d7H(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        } else if (true ^ cls.isEnum()) {
            this.R = cls;
        } else {
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }
    }

    @Override // defpackage.iB8
    public final Object R(String str, Bundle bundle) {
        return (Serializable) bundle.get(str);
    }

    /* renamed from: X */
    public Serializable c(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    @Override // defpackage.iB8
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        this.R.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7H)) {
            return false;
        }
        return n3x.v(this.R, ((d7H) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    @Override // defpackage.iB8
    public String v() {
        return this.R.getName();
    }

    public d7H(Class cls, int i) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.R = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
