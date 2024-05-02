package defpackage;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: pn  reason: default package */
/* loaded from: classes.dex */
public final class pn implements pvc {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f7262R;

    public /* synthetic */ pn(int i, Object obj) {
        this.R = i;
        this.f7262R = obj;
    }

    @Override // defpackage.pvc
    public final Iterator iterator() {
        switch (this.R) {
            case 0:
                return new o7s((Object[]) this.f7262R);
            case 1:
                return ((Iterable) this.f7262R).iterator();
            case 2:
                return new fPl(this);
            case 3:
                f4h f4h = new f4h();
                f4h.R = n3x.L(f4h, f4h, (iv7) this.f7262R);
                return f4h;
            case 4:
                return (Iterator) this.f7262R;
            default:
                ArrayList D = iOY.D((pvc) this.f7262R);
                if (D.size() > 1) {
                    Collections.sort(D);
                }
                return D.iterator();
        }
    }

    public pn(BufferedReader bufferedReader) {
        this.R = 2;
        this.f7262R = bufferedReader;
    }
}
