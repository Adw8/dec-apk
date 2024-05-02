package defpackage;

import android.util.SparseArray;

/* renamed from: lxt  reason: default package */
/* loaded from: classes.dex */
public final class lxt {

    /* renamed from: R  reason: collision with other field name */
    public SparseArray f5866R = new SparseArray();
    public int R = 0;

    public final fSp R(int i) {
        fSp fsp = (fSp) this.f5866R.get(i);
        if (fsp != null) {
            return fsp;
        }
        fSp fsp2 = new fSp();
        this.f5866R.put(i, fsp2);
        return fsp2;
    }
}
