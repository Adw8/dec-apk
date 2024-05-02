package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: njQ  reason: default package */
/* loaded from: classes.dex */
public abstract class njQ implements Closeable {
    public final ArrayList R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public List f6516R;

    /* renamed from: R  reason: collision with other field name */
    public k4H f6517R;
    public List v;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            ((cAh) it.next()).getClass();
        }
    }
}
