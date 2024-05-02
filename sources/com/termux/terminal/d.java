package com.termux.terminal;

/* loaded from: classes.dex */
public final class d extends Thread {
    public final /* synthetic */ Y R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public d(Y y, String str) {
        super(str);
        this.R = y;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int waitFor = JNI.waitFor(this.R.R);
        c cVar = this.R.f2412R;
        cVar.sendMessage(cVar.obtainMessage(4, Integer.valueOf(waitFor)));
    }
}
