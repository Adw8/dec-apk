package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: g0S  reason: default package */
/* loaded from: classes.dex */
public final class g0S extends QR implements mfM {
    public final e76 R;
    public final /* synthetic */ int e;

    public g0S(e76 e76, int i) {
        this.e = i;
        if (i != 1) {
            this.R = e76;
        } else {
            this.R = e76;
        }
    }

    @Override // defpackage.U1
    public final int R() {
        switch (this.e) {
            case 0:
                e76 e76 = this.R;
                e76.getClass();
                return e76.e;
            default:
                e76 e762 = this.R;
                e762.getClass();
                return e762.e;
        }
    }

    @Override // defpackage.U1, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.R.get(entry.getKey());
                return obj2 != null ? n3x.v(obj2, entry.getValue()) : entry.getValue() == null && this.R.containsKey(entry.getKey());
            default:
                return this.R.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new gah(this.R.f2983R, 0);
            default:
                return new gah(this.R.f2983R, 1);
        }
    }
}
