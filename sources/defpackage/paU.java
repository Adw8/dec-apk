package defpackage;

import java.util.RandomAccess;

/* renamed from: paU  reason: default package */
/* loaded from: classes.dex */
public final class paU extends Uk implements RandomAccess {
    public final int[] R;

    /* renamed from: R  reason: collision with other field name */
    public final F6[] f7099R;

    public paU(F6[] f6Arr, int[] iArr) {
        this.f7099R = f6Arr;
        this.R = iArr;
    }

    @Override // defpackage.U1
    public final int R() {
        return this.f7099R.length;
    }

    @Override // defpackage.U1, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof F6)) {
            return false;
        }
        return super.contains((F6) obj);
    }

    @Override // defpackage.Uk, java.util.List
    public final Object get(int i) {
        return this.f7099R[i];
    }

    @Override // defpackage.Uk, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof F6)) {
            return -1;
        }
        return super.indexOf((F6) obj);
    }

    @Override // defpackage.Uk, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof F6)) {
            return -1;
        }
        return super.lastIndexOf((F6) obj);
    }
}
