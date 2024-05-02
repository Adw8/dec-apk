package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: gx8  reason: default package */
/* loaded from: classes.dex */
public final class gx8 {
    private volatile AtomicReferenceArray<Object> array;

    public gx8(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int R() {
        return this.array.length();
    }

    public final void c(int i, i6s i6s) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, i6s);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, i6s);
        this.array = atomicReferenceArray2;
    }

    public final Object v(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }
}
