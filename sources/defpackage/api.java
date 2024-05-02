package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: api  reason: default package */
/* loaded from: classes.dex */
public final class api extends iB8 {
    public final Class R;

    public api(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls)) {
            try {
                this.R = Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
    }

    @Override // defpackage.iB8
    public final Object R(String str, Bundle bundle) {
        return (Parcelable[]) bundle.get(str);
    }

    @Override // defpackage.iB8
    public final Object c(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // defpackage.iB8
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        this.R.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !n3x.v(api.class, obj.getClass())) {
            return false;
        }
        return n3x.v(this.R, ((api) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    @Override // defpackage.iB8
    public final String v() {
        return this.R.getName();
    }
}
