package defpackage;

import android.app.Activity;
import android.app.Application;
import androidx.activity.d;

/* renamed from: in  reason: default package */
/* loaded from: classes.dex */
public final class in implements iLf {
    public final DJ R;

    /* renamed from: R  reason: collision with other field name */
    public final Activity f4726R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f4727R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public volatile ktS f4728R;

    public in(Activity activity) {
        this.f4726R = activity;
        this.R = new DJ((d) activity);
    }

    @Override // defpackage.iLf
    public final Object R() {
        if (this.f4728R == null) {
            synchronized (this.f4727R) {
                if (this.f4728R == null) {
                    this.f4728R = (ktS) v();
                }
            }
        }
        return this.f4728R;
    }

    public final Object v() {
        if (this.f4726R.getApplication() instanceof iLf) {
            dYv dyv = (dYv) ((Rx) hDC.C(Rx.class, this.R));
            CV cv = new CV(dyv.f2668R, dyv.R);
            Activity activity = this.f4726R;
            activity.getClass();
            cv.c = activity;
            return new ktS((fMX) cv.f59R, (dYv) cv.v);
        } else if (Application.class.equals(this.f4726R.getApplication().getClass())) {
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
        } else {
            StringBuilder U = opT.U("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: ");
            U.append(this.f4726R.getApplication().getClass());
            throw new IllegalStateException(U.toString());
        }
    }
}
