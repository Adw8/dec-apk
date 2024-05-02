package defpackage;

import java.util.Iterator;

/* renamed from: aCg  reason: default package */
/* loaded from: classes.dex */
public final class aCg implements Iterator, l10 {
    public final /* synthetic */ cWy R;

    /* renamed from: R  reason: collision with other field name */
    public lVU f790R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f791R = true;

    public aCg(cWy cwy) {
        this.R = cwy;
    }

    @Override // defpackage.l10
    public final void R(lVU lvu) {
        lVU lvu2 = this.f790R;
        if (lvu == lvu2) {
            lVU lvu3 = lvu2.f5764v;
            this.f790R = lvu3;
            this.f791R = lvu3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f791R) {
            return this.R.f2123R != null;
        }
        lVU lvu = this.f790R;
        return (lvu == null || lvu.f5763R == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f791R) {
            this.f791R = false;
            this.f790R = this.R.f2123R;
        } else {
            lVU lvu = this.f790R;
            this.f790R = lvu != null ? lvu.f5763R : null;
        }
        return this.f790R;
    }
}
