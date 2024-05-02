package defpackage;

import java.util.Iterator;

/* renamed from: m9g  reason: default package */
/* loaded from: classes.dex */
public abstract class m9g implements Iterator, l10 {
    public lVU R;
    public lVU v;

    public m9g(lVU lvu, lVU lvu2) {
        this.R = lvu2;
        this.v = lvu;
    }

    @Override // defpackage.l10
    public final void R(lVU lvu) {
        lVU lvu2;
        if (this.R == lvu && lvu == this.v) {
            this.v = null;
            this.R = null;
        }
        lVU lvu3 = this.R;
        if (lvu3 == lvu) {
            switch (((ayt) this).e) {
                case 0:
                    lvu2 = lvu3.f5764v;
                    break;
                default:
                    lvu2 = lvu3.f5763R;
                    break;
            }
            this.R = lvu2;
        }
        if (this.v == lvu) {
            this.v = v();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.v != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        lVU lvu = this.v;
        this.v = v();
        return lvu;
    }

    public final lVU v() {
        lVU lvu = this.v;
        lVU lvu2 = this.R;
        if (lvu == lvu2 || lvu2 == null) {
            return null;
        }
        switch (((ayt) this).e) {
            case 0:
                return lvu.f5763R;
            default:
                return lvu.f5764v;
        }
    }
}
