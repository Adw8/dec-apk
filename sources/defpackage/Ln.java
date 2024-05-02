package defpackage;

import java.util.Iterator;

/* renamed from: Ln  reason: default package */
/* loaded from: classes.dex */
public final class Ln implements Iterable, dsi {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ Ln(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new o7s((Object[]) this.R);
            default:
                return ((pvc) this.R).iterator();
        }
    }
}
