package defpackage;

import java.util.concurrent.CompletableFuture;

/* renamed from: fi1  reason: default package */
/* loaded from: classes.dex */
public final class fi1 extends CompletableFuture {
    public final fb R;

    public fi1(oEG oeg) {
        this.R = oeg;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.R.cancel();
        }
        return super.cancel(z);
    }
}
