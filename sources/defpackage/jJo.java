package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: jJo  reason: default package */
/* loaded from: classes.dex */
public final class jJo implements Iterable, dsi {
    public final mq9 R;
    public final int X;
    public final int e;

    public jJo(int i, int i2, mq9 mq9) {
        this.R = mq9;
        this.e = i;
        this.X = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        mq9 mq9 = this.R;
        if (mq9.L == this.X) {
            int i = this.e;
            return new k9z(i + 1, l6.e(mq9.f6199R, i) + i, mq9);
        }
        throw new ConcurrentModificationException();
    }
}
