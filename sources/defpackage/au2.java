package defpackage;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: au2  reason: default package */
/* loaded from: classes.dex */
public abstract class au2 implements Iterator {
    public final /* synthetic */ AbstractMap R;

    /* renamed from: R  reason: collision with other field name */
    public Map.Entry f1487R;
    public int X;
    public final /* synthetic */ int e = 0;
    public Map.Entry v = null;

    public au2(aDS ads) {
        this.R = ads;
        this.f1487R = ads.v.f4196e;
        this.X = ads.X;
    }

    public final grV R() {
        grV grv = (grV) this.f1487R;
        AbstractMap abstractMap = this.R;
        if (grv == ((kDn) abstractMap).f5217R) {
            throw new NoSuchElementException();
        } else if (((kDn) abstractMap).X == this.X) {
            this.f1487R = grv.f3963e;
            this.v = grv;
            return grv;
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return ((hGV) this.f1487R) != ((aDS) this.R).v;
            default:
                return ((grV) this.f1487R) != ((kDn) this.R).f5217R;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                hGV hgv = (hGV) this.v;
                if (hgv != null) {
                    ((aDS) this.R).e(hgv, true);
                    this.v = null;
                    this.X = ((aDS) this.R).X;
                    return;
                }
                throw new IllegalStateException();
            default:
                grV grv = (grV) this.v;
                if (grv != null) {
                    ((kDn) this.R).e(grv, true);
                    this.v = null;
                    this.X = ((kDn) this.R).X;
                    return;
                }
                throw new IllegalStateException();
        }
    }

    public final hGV v() {
        hGV hgv = (hGV) this.f1487R;
        AbstractMap abstractMap = this.R;
        if (hgv == ((aDS) abstractMap).v) {
            throw new NoSuchElementException();
        } else if (((aDS) abstractMap).X == this.X) {
            this.f1487R = hgv.f4196e;
            this.v = hgv;
            return hgv;
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public au2(kDn kdn) {
        this.R = kdn;
        this.f1487R = kdn.f5217R.f3963e;
        this.X = kdn.X;
    }
}
