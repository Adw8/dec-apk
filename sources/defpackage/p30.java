package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: p30  reason: default package */
/* loaded from: classes.dex */
public abstract class p30 {
    public final cNN R;

    /* renamed from: R  reason: collision with other field name */
    public final Iterator f7060R;

    /* renamed from: R  reason: collision with other field name */
    public Map.Entry f7061R;
    public int e;
    public Map.Entry v;

    public p30(cNN cnn, Iterator it) {
        this.R = cnn;
        this.f7060R = it;
        this.e = cnn.R().v;
        R();
    }

    public final void R() {
        this.f7061R = this.v;
        this.v = this.f7060R.hasNext() ? (Map.Entry) this.f7060R.next() : null;
    }

    public final boolean hasNext() {
        return this.v != null;
    }

    public final void remove() {
        if (this.R.R().v == this.e) {
            Map.Entry entry = this.f7061R;
            if (entry != null) {
                this.R.remove(entry.getKey());
                this.f7061R = null;
                this.e = this.R.R().v;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
