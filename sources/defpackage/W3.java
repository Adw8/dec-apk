package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.ArrayList;

/* renamed from: W3  reason: default package */
/* loaded from: classes.dex */
public final class W3 implements Gp {
    public Canvas R = dO.R;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f588R = new Rect();
    public final Rect v = new Rect();

    @Override // defpackage.Gp
    public final void C(cnO cno, int i) {
        Canvas canvas = this.R;
        if (cno instanceof dm) {
            canvas.clipPath(((dm) cno).f2856R, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.Gp
    public final void H(gIA gia, gw gwVar) {
        this.R.saveLayer(gia.f3720R, gia.v, gia.c, gia.e, gwVar.f3991R, 31);
    }

    @Override // defpackage.Gp
    public final void L() {
        r9.R.R(this.R, true);
    }

    @Override // defpackage.Gp
    public final void N(float f, float f2, float f3, float f4, float f5, float f6, gw gwVar) {
        this.R.drawRoundRect(f, f2, f3, f4, f5, f6, gwVar.f3991R);
    }

    @Override // defpackage.Gp
    public final void O() {
        this.R.scale(-1.0f, 1.0f);
    }

    @Override // defpackage.Gp
    public final void P(float f, float f2, float f3, float f4, float f5, float f6, gw gwVar) {
        this.R.drawArc(f, f2, f3, f4, f5, f6, false, gwVar.f3991R);
    }

    @Override // defpackage.Gp
    public final void R(aCQ acq, long j, long j2, long j3, long j4, gw gwVar) {
        Canvas canvas = this.R;
        Bitmap P = gQc.P(acq);
        Rect rect = this.f588R;
        int i = dU5.R;
        int i2 = (int) (j >> 32);
        rect.left = i2;
        rect.top = dU5.v(j);
        rect.right = i2 + ((int) (j2 >> 32));
        rect.bottom = ltH.v(j2) + dU5.v(j);
        Rect rect2 = this.v;
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        rect2.top = dU5.v(j3);
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = ltH.v(j4) + dU5.v(j3);
        canvas.drawBitmap(P, rect, rect2, gwVar.f3991R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00de  */
    @Override // defpackage.Gp
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U(float[] r24) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.W3.U(float[]):void");
    }

    @Override // defpackage.Gp
    public final void X(cnO cno, gw gwVar) {
        Canvas canvas = this.R;
        if (cno instanceof dm) {
            canvas.drawPath(((dm) cno).f2856R, gwVar.f3991R);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.Gp
    public final void Z(float f, float f2, float f3, float f4, int i) {
        this.R.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.Gp
    public final void c(long j, long j2, gw gwVar) {
        this.R.drawLine(aWo.e(j), aWo.X(j), aWo.e(j2), aWo.X(j2), gwVar.f3991R);
    }

    @Override // defpackage.Gp
    public final void e(float f, long j, gw gwVar) {
        this.R.drawCircle(aWo.e(j), aWo.X(j), f, gwVar.f3991R);
    }

    @Override // defpackage.Gp
    public final void g(float f, float f2) {
        this.R.translate(f, f2);
    }

    @Override // defpackage.Gp
    public final void i() {
        r9.R.R(this.R, false);
    }

    @Override // defpackage.Gp
    public final void j() {
        this.R.restore();
    }

    @Override // defpackage.Gp
    public final void m() {
        this.R.rotate(45.0f);
    }

    @Override // defpackage.Gp
    public final void t(float f, float f2, float f3, float f4, gw gwVar) {
        this.R.drawRect(f, f2, f3, f4, gwVar.f3991R);
    }

    @Override // defpackage.Gp
    public final void v(aCQ acq, long j, gw gwVar) {
        this.R.drawBitmap(gQc.P(acq), aWo.e(j), aWo.X(j), gwVar.f3991R);
    }

    @Override // defpackage.Gp
    public final void x(gw gwVar, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long j = ((aWo) arrayList.get(i)).f906R;
            this.R.drawPoint(aWo.e(j), aWo.X(j), gwVar.f3991R);
        }
    }

    @Override // defpackage.Gp
    public final void y() {
        this.R.save();
    }
}
