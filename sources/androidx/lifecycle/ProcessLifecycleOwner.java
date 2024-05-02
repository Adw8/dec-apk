package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public class ProcessLifecycleOwner implements nu_ {
    public static final ProcessLifecycleOwner R = new ProcessLifecycleOwner();

    /* renamed from: R  reason: collision with other field name */
    public Handler f1323R;
    public int e = 0;
    public int X = 0;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1326R = true;
    public boolean v = true;

    /* renamed from: R  reason: collision with other field name */
    public final m4i f1325R = new m4i(this);

    /* renamed from: R  reason: collision with other field name */
    public k0f f1324R = new k0f(8, this);

    private ProcessLifecycleOwner() {
    }

    @Override // defpackage.nu_
    public final m4i O() {
        return this.f1325R;
    }

    public final void R() {
        int i = this.X + 1;
        this.X = i;
        if (i != 1) {
            return;
        }
        if (this.f1326R) {
            this.f1325R.X(alX.ON_RESUME);
            this.f1326R = false;
            return;
        }
        this.f1323R.removeCallbacks(this.f1324R);
    }
}
