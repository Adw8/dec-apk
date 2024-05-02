package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: dnC  reason: default package */
/* loaded from: classes.dex */
public final class dnC extends CancellationException {
    public dnC(long j) {
        super("Timed out waiting for " + j + " ms");
    }
}
