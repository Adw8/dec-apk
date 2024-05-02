package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: ook  reason: default package */
/* loaded from: classes.dex */
public final class ook extends gQ {
    @Override // defpackage.gQ
    public final Random O() {
        return ThreadLocalRandom.current();
    }

    @Override // defpackage.h22
    public final long X(long j) {
        return ThreadLocalRandom.current().nextLong(0, j);
    }

    @Override // defpackage.h22
    public final long e(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }
}
