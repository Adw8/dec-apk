package defpackage;

import androidx.lifecycle.Y;

/* renamed from: obI  reason: default package */
/* loaded from: classes.dex */
public abstract class obI {
    public final aXc R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Y f6852R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6853R;
    public int e = -1;

    public obI(Y y, aXc axc) {
        this.f6852R = y;
        this.R = axc;
    }

    public final void R(boolean z) {
        if (z != this.f6853R) {
            this.f6853R = z;
            Y y = this.f6852R;
            int i = z ? 1 : -1;
            int i2 = y.R;
            y.R = i + i2;
            if (!y.f1338R) {
                y.f1338R = true;
                while (true) {
                    try {
                        int i3 = y.R;
                        if (i2 == i3) {
                            break;
                        }
                        i2 = i3;
                    } finally {
                        y.f1338R = false;
                    }
                }
            }
            if (this.f6853R) {
                this.f6852R.c(this);
            }
        }
    }

    public abstract boolean c();

    public void v() {
    }
}
