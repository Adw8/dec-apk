package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: pjN  reason: default package */
/* loaded from: classes.dex */
public final class pjN extends p30 implements Iterator, dsi {
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public pjN(cNN cnn, Iterator it, int i) {
        super(cnn, it);
        this.X = i;
        if (i == 1) {
            super(cnn, it);
        } else if (i != 2) {
        } else {
            super(cnn, it);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.X) {
            case 0:
                R();
                if (((p30) this).f7061R != null) {
                    return new gRw(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.v;
                if (entry != null) {
                    R();
                    return entry.getKey();
                }
                throw new IllegalStateException();
            default:
                Map.Entry entry2 = this.v;
                if (entry2 != null) {
                    R();
                    return entry2.getValue();
                }
                throw new IllegalStateException();
        }
    }
}
