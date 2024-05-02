package defpackage;

import android.os.IBinder;

/* renamed from: lFG  reason: default package */
/* loaded from: classes.dex */
public final class lFG implements i9A {
    public IBinder R;

    public lFG(IBinder iBinder) {
        this.R = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.R;
    }
}
