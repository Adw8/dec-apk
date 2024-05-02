package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: itC  reason: default package */
/* loaded from: classes.dex */
public final class itC extends lkt implements Iterable {
    public final ArrayList R = new ArrayList();

    @Override // defpackage.lkt
    public final int R() {
        if (this.R.size() == 1) {
            return ((lkt) this.R.get(0)).R();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.lkt
    public final String c() {
        if (this.R.size() == 1) {
            return ((lkt) this.R.get(0)).c();
        }
        throw new IllegalStateException();
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof itC) && ((itC) obj).R.equals(this.R));
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.R.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.R.iterator();
    }
}
