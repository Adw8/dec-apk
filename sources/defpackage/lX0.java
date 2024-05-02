package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;

/* renamed from: lX0  reason: default package */
/* loaded from: classes.dex */
public final class lX0 extends laR {
    public final /* synthetic */ nCn R;
    public int e = 1;

    public lX0(nCn ncn) {
        this.R = ncn;
    }

    public final void g(pdm pdm) {
        boolean z;
        List list = pdm.f7140R;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (((phU) list.get(i)).v()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            if (this.e == 2) {
                hjM hjm = super.R;
                if (hjm != null) {
                    msU.wm(pdm, hjm.X(aWo.v), new a0B(this.R, 0), true);
                } else {
                    throw new IllegalStateException("layoutCoordinates not set".toString());
                }
            }
            this.e = 3;
            return;
        }
        hjM hjm2 = super.R;
        if (hjm2 != null) {
            msU.wm(pdm, hjm2.X(aWo.v), new V4(this, 21, this.R), false);
            if (this.e == 2) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((phU) list.get(i2)).R();
                }
                aAx aax = pdm.f7139R;
                if (aax != null) {
                    aax.f774R = !this.R.f6352R;
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set".toString());
    }

    @Override // defpackage.laR
    public final void m() {
        if (this.e == 2) {
            long uptimeMillis = SystemClock.uptimeMillis();
            a0B a0b = new a0B(this.R, 1);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            a0b.x(obtain);
            obtain.recycle();
            this.e = 1;
            this.R.f6352R = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.laR
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(defpackage.pdm r7, defpackage.gKj r8, long r9) {
        /*
            r6 = this;
            gKj r9 = defpackage.gKj.Final
            java.util.List r10 = r7.f7140R
            nCn r0 = r6.R
            boolean r0 = r0.f6352R
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0036
            int r0 = r10.size()
            r3 = r1
        L_0x0011:
            if (r3 >= r0) goto L_0x0030
            java.lang.Object r4 = r10.get(r3)
            phU r4 = (defpackage.phU) r4
            boolean r5 = defpackage.n1P.m(r4)
            if (r5 != 0) goto L_0x0028
            boolean r4 = defpackage.n1P.H(r4)
            if (r4 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r4 = r1
            goto L_0x0029
        L_0x0028:
            r4 = r2
        L_0x0029:
            if (r4 == 0) goto L_0x002d
            r0 = r2
            goto L_0x0031
        L_0x002d:
            int r3 = r3 + 1
            goto L_0x0011
        L_0x0030:
            r0 = r1
        L_0x0031:
            if (r0 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r0 = r1
            goto L_0x0037
        L_0x0036:
            r0 = r2
        L_0x0037:
            int r3 = r6.e
            r4 = 3
            if (r3 == r4) goto L_0x004c
            gKj r3 = defpackage.gKj.Initial
            if (r8 != r3) goto L_0x0045
            if (r0 == 0) goto L_0x0045
            r6.g(r7)
        L_0x0045:
            if (r8 != r9) goto L_0x004c
            if (r0 != 0) goto L_0x004c
            r6.g(r7)
        L_0x004c:
            if (r8 != r9) goto L_0x006f
            int r7 = r10.size()
            r8 = r1
        L_0x0053:
            if (r8 >= r7) goto L_0x0066
            java.lang.Object r9 = r10.get(r8)
            phU r9 = (defpackage.phU) r9
            boolean r9 = defpackage.n1P.H(r9)
            if (r9 != 0) goto L_0x0063
            r7 = r1
            goto L_0x0067
        L_0x0063:
            int r8 = r8 + 1
            goto L_0x0053
        L_0x0066:
            r7 = r2
        L_0x0067:
            if (r7 == 0) goto L_0x006f
            r6.e = r2
            nCn r6 = r6.R
            r6.f6352R = r1
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lX0.x(pdm, gKj, long):void");
    }
}
