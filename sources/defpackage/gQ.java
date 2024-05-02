package defpackage;

import java.util.Random;

/* renamed from: gQ  reason: default package */
/* loaded from: classes.dex */
public abstract class gQ extends h22 {
    public abstract Random O();

    @Override // defpackage.h22
    public final int R(int i) {
        return (O().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.h22
    public final long c() {
        return O().nextLong();
    }

    @Override // defpackage.h22
    public final int v() {
        return O().nextInt();
    }
}
