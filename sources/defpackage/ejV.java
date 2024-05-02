package defpackage;

import java.io.IOException;

/* renamed from: ejV  reason: default package */
/* loaded from: classes.dex */
public final class ejV extends k8G implements f_c {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f3187R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ejV(int i, long j, Object obj) {
        super(0);
        this.X = i;
        this.f3187R = obj;
        this.R = j;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                h57.c(((pso) this.f3187R).R().f7279R, this.R, 0.0f);
                return;
            case 1:
                ((pso) this.f3187R).R().f7279R.L(this.R);
                return;
            default:
                ((pso) this.f3187R).R().L(this.R);
                return;
        }
    }

    @Override // defpackage.f_c
    public final Object g() {
        boolean z;
        switch (this.X) {
            case 0:
                R();
                break;
            case 1:
                R();
                break;
            case 2:
                R();
                break;
            default:
                jr5 jr5 = (jr5) this.f3187R;
                synchronized (jr5) {
                    long j = jr5.v;
                    long j2 = jr5.R;
                    if (j < j2) {
                        z = true;
                    } else {
                        jr5.R = j2 + 1;
                        z = false;
                    }
                }
                if (z) {
                    ((jr5) this.f3187R).c(null);
                    return -1L;
                }
                jr5 jr52 = (jr5) this.f3187R;
                jr52.getClass();
                try {
                    jr52.f5032R.Z(1, 0, false);
                } catch (IOException e) {
                    jr52.c(e);
                }
                return Long.valueOf(this.R);
        }
        return o8s.R;
    }
}
