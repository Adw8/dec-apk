package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hk  reason: default package */
/* loaded from: classes.dex */
public final class hk extends kE9 {

    /* renamed from: R  reason: collision with other field name */
    public final Handler f4361R;

    /* renamed from: R  reason: collision with other field name */
    public final Choreographer f4362R;

    /* renamed from: R  reason: collision with other field name */
    public final el f4363R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4367R;

    /* renamed from: v  reason: collision with other field name */
    public boolean f4368v;

    /* renamed from: R  reason: collision with other field name */
    public static final bV5 f4359R = new bV5(fme.C);
    public static final Fl R = new Fl(0);

    /* renamed from: R  reason: collision with other field name */
    public final Object f4365R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public final il f4364R = new il();

    /* renamed from: R  reason: collision with other field name */
    public List f4366R = new ArrayList();
    public List v = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final _9 f4360R = new _9(this);

    public hk(Choreographer choreographer, Handler handler) {
        this.f4362R = choreographer;
        this.f4361R = handler;
        this.f4363R = new el(choreographer);
    }

    public static final void vl(hk hkVar) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (hkVar.f4365R) {
                il ilVar = hkVar.f4364R;
                runnable = (Runnable) (ilVar.isEmpty() ? null : ilVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (hkVar.f4365R) {
                    il ilVar2 = hkVar.f4364R;
                    runnable = (Runnable) (ilVar2.isEmpty() ? null : ilVar2.removeFirst());
                }
            }
            synchronized (hkVar.f4365R) {
                z = false;
                if (hkVar.f4364R.isEmpty()) {
                    hkVar.f4367R = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.kE9
    public final void mL(nbD nbd, Runnable runnable) {
        synchronized (this.f4365R) {
            this.f4364R.addLast(runnable);
            if (!this.f4367R) {
                this.f4367R = true;
                this.f4361R.post(this.f4360R);
                if (!this.f4368v) {
                    this.f4368v = true;
                    this.f4362R.postFrameCallback(this.f4360R);
                }
            }
        }
    }
}
