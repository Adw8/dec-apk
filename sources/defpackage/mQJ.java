package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: mQJ  reason: default package */
/* loaded from: classes.dex */
public final class mQJ implements lYW {

    /* renamed from: R  reason: collision with other field name */
    public final AndroidComposeView f6032R;

    /* renamed from: R  reason: collision with other field name */
    public final e4H f6034R;

    /* renamed from: R  reason: collision with other field name */
    public f_c f6035R;

    /* renamed from: R  reason: collision with other field name */
    public gw f6036R;

    /* renamed from: R  reason: collision with other field name */
    public kg9 f6038R;

    /* renamed from: R  reason: collision with other field name */
    public final nGN f6039R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6040R;
    public boolean c;
    public boolean v;

    /* renamed from: R  reason: collision with other field name */
    public final dAE f6033R = new dAE(ky1.I);

    /* renamed from: R  reason: collision with other field name */
    public final h89 f6037R = new h89(4);
    public long R = b3a.v;

    public mQJ(AndroidComposeView androidComposeView, kg9 kg9, q4 q4Var) {
        this.f6032R = androidComposeView;
        this.f6038R = kg9;
        this.f6035R = q4Var;
        this.f6034R = new e4H(androidComposeView.getDensity());
        nGN ngn = new nGN();
        ngn.c();
        this.f6039R = ngn;
    }

    @Override // defpackage.lYW
    public final void L() {
        if (this.f6040R || !this.f6039R.R.hasDisplayList()) {
            x(false);
            cnO cno = null;
            if (this.f6039R.R()) {
                e4H e4h = this.f6034R;
                if (!(!e4h.f2959c)) {
                    e4h.X();
                    cno = e4h.f2952R;
                }
            }
            kg9 kg9 = this.f6038R;
            if (kg9 != null) {
                nGN ngn = this.f6039R;
                h89 h89 = this.f6037R;
                RecordingCanvas beginRecording = ngn.R.beginRecording();
                W3 w3 = (W3) h89.R;
                Canvas canvas = w3.R;
                w3.R = beginRecording;
                if (cno != null) {
                    w3.y();
                    w3.C(cno, 1);
                }
                kg9.x(w3);
                if (cno != null) {
                    w3.j();
                }
                ((W3) h89.R).R = canvas;
                ngn.R.endRecording();
            }
        }
    }

    @Override // defpackage.lYW
    public final void O(q4 q4Var, kg9 kg9) {
        x(false);
        this.v = false;
        this.c = false;
        this.R = b3a.v;
        this.f6038R = kg9;
        this.f6035R = q4Var;
    }

    @Override // defpackage.lYW
    public final void R(aG9 ag9, boolean z) {
        if (z) {
            float[] R = this.f6033R.R(this.f6039R);
            if (R == null) {
                ag9.R = 0.0f;
                ag9.v = 0.0f;
                ag9.c = 0.0f;
                ag9.e = 0.0f;
                return;
            }
            l1r.c(R, ag9);
            return;
        }
        l1r.c(this.f6033R.v(this.f6039R), ag9);
    }

    @Override // defpackage.lYW
    public final long X(long j, boolean z) {
        if (!z) {
            return l1r.v(this.f6033R.v(this.f6039R), j);
        }
        float[] R = this.f6033R.R(this.f6039R);
        return R != null ? l1r.v(R, j) : aWo.c;
    }

    @Override // defpackage.lYW
    public final void Z(Gp gp) {
        Canvas canvas = dO.R;
        Canvas canvas2 = ((W3) gp).R;
        boolean z = false;
        if (canvas2.isHardwareAccelerated()) {
            L();
            if (this.f6039R.R.getElevation() > 0.0f) {
                z = true;
            }
            this.c = z;
            if (z) {
                gp.L();
            }
            canvas2.drawRenderNode(this.f6039R.R);
            if (this.c) {
                gp.i();
                return;
            }
            return;
        }
        float left = (float) this.f6039R.R.getLeft();
        float top = (float) this.f6039R.R.getTop();
        float right = (float) this.f6039R.R.getRight();
        float bottom = (float) this.f6039R.R.getBottom();
        if (this.f6039R.R.getAlpha() < 1.0f) {
            gw gwVar = this.f6036R;
            if (gwVar == null) {
                gwVar = new gw();
                this.f6036R = gwVar;
            }
            gwVar.e(this.f6039R.R.getAlpha());
            canvas2.saveLayer(left, top, right, bottom, gwVar.f3991R);
        } else {
            gp.y();
        }
        gp.g(left, top);
        gp.U(this.f6033R.v(this.f6039R));
        if (this.f6039R.R() || this.f6039R.R.getClipToBounds()) {
            this.f6034R.R(gp);
        }
        kg9 kg9 = this.f6038R;
        if (kg9 != null) {
            kg9.x(gp);
        }
        gp.j();
        x(false);
    }

    @Override // defpackage.lYW
    public final void c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, n76 n76, boolean z, long j2, long j3, mdz mdz, jJj jjj) {
        f_c f_c;
        this.R = j;
        boolean z2 = false;
        boolean z3 = this.f6039R.R() && !(this.f6034R.f2959c ^ true);
        this.f6039R.R.setScaleX(f);
        this.f6039R.R.setScaleY(f2);
        this.f6039R.R.setAlpha(f3);
        this.f6039R.R.setTranslationX(f4);
        this.f6039R.R.setTranslationY(f5);
        this.f6039R.R.setElevation(f6);
        this.f6039R.R.setAmbientShadowColor(aH9.vz(j2));
        this.f6039R.R.setSpotShadowColor(aH9.vz(j3));
        this.f6039R.R.setRotationZ(f9);
        this.f6039R.R.setRotationX(f7);
        this.f6039R.R.setRotationY(f8);
        this.f6039R.R.setCameraDistance(f10);
        nGN ngn = this.f6039R;
        int i = b3a.R;
        ngn.R.setPivotX(Float.intBitsToFloat((int) (j >> 32)) * ((float) this.f6039R.R.getWidth()));
        this.f6039R.R.setPivotY(b3a.R(j) * ((float) this.f6039R.R.getHeight()));
        this.f6039R.R.setClipToOutline(z && n76 != cUF.f2104R);
        this.f6039R.R.setClipToBounds(z && n76 == cUF.f2104R);
        eqC.R.R(this.f6039R.R, null);
        boolean e = this.f6034R.e(n76, this.f6039R.R.getAlpha(), this.f6039R.R(), this.f6039R.R.getElevation(), mdz, jjj);
        this.f6039R.R.setOutline(this.f6034R.v());
        if (this.f6039R.R() && !(!this.f6034R.f2959c)) {
            z2 = true;
        }
        if (z3 == z2 && (!z2 || !e)) {
            aDH.R.R(this.f6032R);
        } else if (!this.f6040R && !this.v) {
            this.f6032R.invalidate();
            x(true);
        }
        if (!this.c && this.f6039R.R.getElevation() > 0.0f && (f_c = this.f6035R) != null) {
            f_c.g();
        }
        this.f6033R.c();
    }

    @Override // defpackage.lYW
    public final void destroy() {
        if (this.f6039R.R.hasDisplayList()) {
            this.f6039R.R.discardDisplayList();
        }
        this.f6038R = null;
        this.f6035R = null;
        this.v = true;
        x(false);
        AndroidComposeView androidComposeView = this.f6032R;
        androidComposeView.f1233c = true;
        androidComposeView.y(this);
    }

    @Override // defpackage.lYW
    public final boolean e(long j) {
        float e = aWo.e(j);
        float X = aWo.X(j);
        if (this.f6039R.R.getClipToBounds()) {
            return 0.0f <= e && e < ((float) this.f6039R.R.getWidth()) && 0.0f <= X && X < ((float) this.f6039R.R.getHeight());
        }
        if (this.f6039R.R()) {
            return this.f6034R.c(j);
        }
        return true;
    }

    @Override // defpackage.lYW
    public final void invalidate() {
        if (!this.f6040R && !this.v) {
            this.f6032R.invalidate();
            x(true);
        }
    }

    @Override // defpackage.lYW
    public final void m(long j) {
        int i = (int) (j >> 32);
        int v = ltH.v(j);
        nGN ngn = this.f6039R;
        long j2 = this.R;
        int i2 = b3a.R;
        float f = (float) i;
        ngn.R.setPivotX(Float.intBitsToFloat((int) (j2 >> 32)) * f);
        nGN ngn2 = this.f6039R;
        float R = b3a.R(this.R);
        float f2 = (float) v;
        ngn2.R.setPivotY(R * f2);
        nGN ngn3 = this.f6039R;
        if (ngn3.R.setPosition(ngn3.R.getLeft(), this.f6039R.R.getTop(), this.f6039R.R.getLeft() + i, this.f6039R.R.getTop() + v)) {
            e4H e4h = this.f6034R;
            long e = n1P.e(f, f2);
            if (!nqW.R(e4h.f2949R, e)) {
                e4h.f2949R = e;
                e4h.f2961v = true;
            }
            nGN ngn4 = this.f6039R;
            ngn4.R.setOutline(this.f6034R.v());
            if (!this.f6040R && !this.v) {
                this.f6032R.invalidate();
                x(true);
            }
            this.f6033R.c();
        }
    }

    @Override // defpackage.lYW
    public final void v(long j) {
        int left = this.f6039R.R.getLeft();
        int top = this.f6039R.R.getTop();
        int i = (int) (j >> 32);
        int v = dU5.v(j);
        if (left != i || top != v) {
            this.f6039R.R.offsetLeftAndRight(i - left);
            this.f6039R.R.offsetTopAndBottom(v - top);
            aDH.R.R(this.f6032R);
            this.f6033R.c();
        }
    }

    public final void x(boolean z) {
        if (z != this.f6040R) {
            this.f6040R = z;
            this.f6032R.C(this, z);
        }
    }
}
