package defpackage;

import android.view.View;
import android.view.WindowId;

/* renamed from: otJ  reason: default package */
/* loaded from: classes.dex */
public final class otJ implements eDb {
    public final WindowId R;

    public otJ(View view) {
        this.R = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof otJ) && ((otJ) obj).R.equals(this.R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }
}
