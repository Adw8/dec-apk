package defpackage;

import java.lang.reflect.Array;

/* renamed from: max  reason: default package */
/* loaded from: classes.dex */
public final class max extends pdD {
    public final /* synthetic */ pdD R;
    public final /* synthetic */ int e;

    public /* synthetic */ max(pdD pdd, int i) {
        this.e = i;
        this.R = pdd;
    }

    @Override // defpackage.pdD
    public final void Z(kK5 kk5, Object obj) {
        switch (this.e) {
            case 0:
                Iterable<Object> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (Object obj2 : iterable) {
                        this.R.Z(kk5, obj2);
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        this.R.Z(kk5, Array.get(obj, i));
                    }
                    return;
                }
                return;
        }
    }
}
