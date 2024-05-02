package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: buR  reason: default package */
/* loaded from: classes.dex */
public final class buR extends iB8 {
    public final Class R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public buR(Class cls) {
        super(true);
        boolean z = true;
        if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
            z = false;
        }
        if (z) {
            this.R = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // defpackage.iB8
    public final Object R(String str, Bundle bundle) {
        return bundle.get(str);
    }

    @Override // defpackage.iB8
    public final Object c(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // defpackage.iB8
    public final void e(Bundle bundle, String str, Object obj) {
        this.R.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !n3x.v(buR.class, obj.getClass())) {
            return false;
        }
        return n3x.v(this.R, ((buR) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    @Override // defpackage.iB8
    public final String v() {
        return this.R.getName();
    }
}
