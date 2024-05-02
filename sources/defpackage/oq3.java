package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: oq3  reason: default package */
/* loaded from: classes.dex */
public final class oq3 implements l9J {
    public final bz R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f6969R;

    /* renamed from: R  reason: collision with other field name */
    public final List f6970R;

    /* renamed from: R  reason: collision with other field name */
    public final cwX f6968R = pdD.J(new jAj(this, 1));
    public final cwX v = pdD.J(new jAj(this, 0));

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public oq3(defpackage.bz r31, defpackage.kMk r32, java.util.List r33, defpackage.jJj r34, defpackage.gP7 r35) {
        /*
        // Method dump skipped, instructions count: 618
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq3.<init>(bz, kMk, java.util.List, jJj, gP7):void");
    }

    @Override // defpackage.l9J
    public final float R() {
        return ((Number) this.v.getValue()).floatValue();
    }

    @Override // defpackage.l9J
    public final boolean c() {
        ArrayList arrayList = this.f6969R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((bGA) arrayList.get(i)).f1584R.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.l9J
    public final float v() {
        return ((Number) this.f6968R.getValue()).floatValue();
    }
}
