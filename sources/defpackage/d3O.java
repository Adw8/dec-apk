package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: d3O  reason: default package */
/* loaded from: classes.dex */
public final class d3O {

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ k_Z f2477R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2478R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f2476R = new ArrayList();
    public final ArrayDeque R = new ArrayDeque();

    public d3O(k_Z k_z) {
        this.f2477R = k_z;
    }

    public final IllegalArgumentException R(IllegalArgumentException illegalArgumentException) {
        if (this.f2478R) {
            return illegalArgumentException;
        }
        this.f2478R = true;
        if (this.R.size() == 1 && ((kSP) this.R.getFirst()).f5295R == null) {
            return illegalArgumentException;
        }
        StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
        Iterator descendingIterator = this.R.descendingIterator();
        while (descendingIterator.hasNext()) {
            kSP ksp = (kSP) descendingIterator.next();
            sb.append("\nfor ");
            sb.append(ksp.f5296R);
            if (ksp.f5295R != null) {
                sb.append(' ');
                sb.append(ksp.f5295R);
            }
        }
        return new IllegalArgumentException(sb.toString(), illegalArgumentException);
    }

    public final void v(boolean z) {
        this.R.removeLast();
        if (this.R.isEmpty()) {
            this.f2477R.f5355R.remove();
            if (z) {
                synchronized (this.f2477R.f5356R) {
                    int size = this.f2476R.size();
                    for (int i = 0; i < size; i++) {
                        kSP ksp = (kSP) this.f2476R.get(i);
                        k49 k49 = (k49) this.f2477R.f5356R.put(ksp.R, ksp.f5297R);
                        if (k49 != null) {
                            ksp.f5297R = k49;
                            this.f2477R.f5356R.put(ksp.R, k49);
                        }
                    }
                }
            }
        }
    }
}
