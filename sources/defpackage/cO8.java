package defpackage;

import java.util.NoSuchElementException;

/* renamed from: cO8  reason: default package */
/* loaded from: classes.dex */
public final class cO8 extends c07 implements i1l {
    public final dZs R;
    public Object c;

    public cO8(dZs dzs, Object obj, Object obj2) {
        super(obj, obj2);
        this.R = dzs;
        this.c = obj2;
    }

    @Override // defpackage.c07, java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // defpackage.c07, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.c;
        this.c = obj;
        dZs dzs = this.R;
        Object obj3 = super.R;
        iuh iuh = (iuh) dzs.R;
        if (iuh.f4758R.containsKey(obj3)) {
            boolean z = ((dU8) iuh).R;
            if (!z) {
                iuh.f4758R.put(obj3, obj);
            } else if (z) {
                j18 j18 = ((dU8) iuh).f2629R[iuh.e];
                Object obj4 = j18.R[j18.X];
                iuh.f4758R.put(obj3, obj);
                iuh.c(obj4 != null ? obj4.hashCode() : 0, iuh.f4758R.f6053R, obj4, 0);
            } else {
                throw new NoSuchElementException();
            }
            iuh.X = iuh.f4758R.e;
        }
        return obj2;
    }
}
