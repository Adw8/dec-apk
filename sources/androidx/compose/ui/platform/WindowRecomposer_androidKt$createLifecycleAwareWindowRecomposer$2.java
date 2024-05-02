package androidx.compose.ui.platform;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 implements k3P {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ be9 f1241R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fLL f1242R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f1243R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWW f1244R;

    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2(m3D m3d, be9 be9, fLL fll, nWW nww, View view) {
        this.f1243R = m3d;
        this.f1241R = be9;
        this.f1242R = fll;
        this.f1244R = nww;
        this.R = view;
    }

    @Override // defpackage.k3P
    public final void e(nu_ nu_, alX alx) {
        boolean z;
        int i = nuZ.R[alx.ordinal()];
        if (i != 1) {
            if (i == 2) {
                be9 be9 = this.f1241R;
                if (be9 != null) {
                    hP9 hp9 = be9.R;
                    synchronized (hp9.f4226R) {
                        synchronized (hp9.f4226R) {
                            z = hp9.f4228R;
                        }
                        if (!z) {
                            List list = (List) hp9.v;
                            hp9.v = (List) hp9.f4227R;
                            hp9.f4227R = list;
                            hp9.f4228R = true;
                            int size = list.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                ((aOO) list.get(i2)).Y(o8s.R);
                            }
                            list.clear();
                        }
                    }
                }
            } else if (i == 3) {
                be9 be92 = this.f1241R;
                if (be92 != null) {
                    hP9 hp92 = be92.R;
                    synchronized (hp92.f4226R) {
                        hp92.f4228R = false;
                    }
                }
            } else if (i == 4) {
                this.f1242R.y();
            }
        } else {
            l6.z(this.f1243R, null, 4, new phY(this.f1244R, this.f1242R, nu_, this, this.R, null), 1);
        }
    }
}
