package defpackage;

import android.content.SharedPreferences;

/* renamed from: kun  reason: default package */
/* loaded from: classes.dex */
public final class kun implements FI {
    public final FI R;

    /* renamed from: R  reason: collision with other field name */
    public final SharedPreferences f5478R;

    public kun(FI fi, SharedPreferences sharedPreferences) {
        this.R = fi;
        this.f5478R = sharedPreferences;
    }

    @Override // defpackage.FI
    public final ncu R(boolean z) {
        return this.R.R(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kun)) {
            return false;
        }
        kun kun = (kun) obj;
        return n3x.v(this.R, kun.R) && n3x.v(this.f5478R, kun.f5478R);
    }

    public final int hashCode() {
        return this.f5478R.hashCode() + (this.R.hashCode() * 31);
    }

    public final String toString() {
        FI fi = this.R;
        SharedPreferences sharedPreferences = this.f5478R;
        return "SettingsScope(columnScope=" + fi + ", preferences=" + sharedPreferences + ")";
    }

    @Override // defpackage.FI
    public final ncu v(ncu ncu, vV vVVar) {
        return this.R.v(ncu, vVVar);
    }
}
