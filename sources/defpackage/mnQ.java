package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: mnQ  reason: default package */
/* loaded from: classes.dex */
public final class mnQ extends AbstractSet {
    public final /* synthetic */ kDn R;
    public final /* synthetic */ int e;

    public /* synthetic */ mnQ(kDn kdn, int i) {
        this.e = i;
        this.R = kdn;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.e) {
            case 0:
                this.R.clear();
                return;
            default:
                this.R.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                return (obj instanceof Map.Entry) && this.R.v((Map.Entry) obj) != null;
            default:
                return this.R.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new dVX(this);
            default:
                return new dVX(this, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        grV v;
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry) || (v = this.R.v((Map.Entry) obj)) == null) {
                    return false;
                }
                this.R.e(v, true);
                return true;
            default:
                kDn kdn = this.R;
                kdn.getClass();
                grV grv = null;
                if (obj != null) {
                    try {
                        grv = kdn.R(obj, false);
                    } catch (ClassCastException unused) {
                    }
                }
                if (grv != null) {
                    kdn.e(grv, true);
                }
                return grv != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.e) {
            case 0:
                return this.R.e;
            default:
                return this.R.e;
        }
    }
}
