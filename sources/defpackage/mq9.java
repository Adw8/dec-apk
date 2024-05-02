package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: mq9  reason: default package */
/* loaded from: classes.dex */
public final class mq9 implements Iterable, dsi {
    public int L;
    public int O;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6198R;
    public int X;
    public int e;

    /* renamed from: R  reason: collision with other field name */
    public int[] f6199R = new int[0];

    /* renamed from: R  reason: collision with other field name */
    public Object[] f6200R = new Object[0];
    public ArrayList R = new ArrayList();

    public final boolean C(WB wb) {
        if (wb.R()) {
            int k = l6.k(this.R, wb.R, this.e);
            if (k >= 0 && n3x.v(this.R.get(k), wb)) {
                return true;
            }
        }
        return false;
    }

    public final mdh H() {
        if (!this.f6198R) {
            if (this.O <= 0) {
                this.f6198R = true;
                this.L++;
                return new mdh(this);
            }
            vC.e("Cannot start a writer when a reader is pending".toString());
            throw null;
        }
        vC.e("Cannot start a writer when another writer is pending".toString());
        throw null;
    }

    public final WB R() {
        if (!this.f6198R) {
            int i = this.e;
            if (i > 0) {
                ArrayList arrayList = this.R;
                int k = l6.k(arrayList, 0, i);
                if (k >= 0) {
                    return (WB) arrayList.get(k);
                }
                WB wb = new WB(0);
                arrayList.add(-(k + 1), wb);
                return wb;
            }
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        vC.e("use active SlotWriter to create an anchor location instead ".toString());
        throw null;
    }

    public final ilY c() {
        if (!this.f6198R) {
            this.O++;
            return new ilY(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new k9z(0, this.e, this);
    }

    public final int v(WB wb) {
        if (!(!this.f6198R)) {
            vC.e("Use active SlotWriter to determine anchor location instead".toString());
            throw null;
        } else if (wb.R()) {
            return wb.R;
        } else {
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
    }
}
