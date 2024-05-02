package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g_1  reason: default package */
/* loaded from: classes.dex */
public abstract class g_1 {
    public static final int R;

    /* renamed from: R  reason: collision with other field name */
    public static final h11 f3790R = new h11(new byte[0], 0, 0, false);

    /* renamed from: R  reason: collision with other field name */
    public static final AtomicReference[] f3791R;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        R = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f3791R = atomicReferenceArr;
    }

    public static final void R(h11 h11) {
        if (!(h11.f4016R == null && h11.f4019v == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!h11.f4017R) {
            AtomicReference atomicReference = f3791R[(int) (Thread.currentThread().getId() & (((long) R) - 1))];
            h11 h112 = (h11) atomicReference.get();
            if (h112 != f3790R) {
                int i = h112 != null ? h112.v : 0;
                if (i < 65536) {
                    h11.f4016R = h112;
                    h11.R = 0;
                    h11.v = i + 8192;
                    if (!atomicReference.compareAndSet(h112, h11)) {
                        h11.f4016R = null;
                    }
                }
            }
        }
    }

    public static final h11 v() {
        AtomicReference atomicReference = f3791R[(int) (Thread.currentThread().getId() & (((long) R) - 1))];
        h11 h11 = f3790R;
        h11 h112 = (h11) atomicReference.getAndSet(h11);
        if (h112 == h11) {
            return new h11();
        }
        if (h112 == null) {
            atomicReference.set(null);
            return new h11();
        }
        atomicReference.set(h112.f4016R);
        h112.f4016R = null;
        h112.v = 0;
        return h112;
    }
}
