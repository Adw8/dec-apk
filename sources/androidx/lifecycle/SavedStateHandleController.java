package androidx.lifecycle;

/* access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements k3P {
    public final String R;

    /* renamed from: R  reason: collision with other field name */
    public final nmx f1333R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1334R = false;

    public SavedStateHandleController(String str, nmx nmx) {
        this.R = str;
        this.f1333R = nmx;
    }

    @Override // defpackage.k3P
    public final void e(nu_ nu_, alX alx) {
        if (alx == alX.ON_DESTROY) {
            this.f1334R = false;
            nu_.O().v(this);
        }
    }
}
