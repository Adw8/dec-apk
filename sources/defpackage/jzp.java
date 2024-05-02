package defpackage;

import android.os.Bundle;

/* renamed from: jzp  reason: default package */
/* loaded from: classes.dex */
public final class jzp implements Comparable {
    public final Bundle R;

    /* renamed from: R  reason: collision with other field name */
    public final e9E f5175R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5176R;
    public final int e;
    public final boolean v;

    public jzp(e9E e9e, Bundle bundle, boolean z, boolean z2, int i) {
        this.f5175R = e9e;
        this.R = bundle;
        this.f5176R = z;
        this.v = z2;
        this.e = i;
    }

    /* renamed from: R */
    public final int compareTo(jzp jzp) {
        boolean z = this.f5176R;
        if (z && !jzp.f5176R) {
            return 1;
        }
        if (!z && jzp.f5176R) {
            return -1;
        }
        Bundle bundle = this.R;
        if (bundle != null && jzp.R == null) {
            return 1;
        }
        if (bundle == null && jzp.R != null) {
            return -1;
        }
        if (bundle != null) {
            int size = bundle.size() - jzp.R.size();
            if (size > 0) {
                return 1;
            }
            if (size < 0) {
                return -1;
            }
        }
        boolean z2 = this.v;
        if (z2 && !jzp.v) {
            return 1;
        }
        if (z2 || !jzp.v) {
            return this.e - jzp.e;
        }
        return -1;
    }
}
