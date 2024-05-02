package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: hdZ  reason: default package */
/* loaded from: classes.dex */
public final class hdZ extends s8 {
    public hdZ(fue fue) {
        super(fue);
    }

    @Override // defpackage.Su
    public final void L(int i, int i2, int i3) {
        ((fue) this.v).u(i, i2, i3);
    }

    @Override // defpackage.Su
    public final /* bridge */ /* synthetic */ void R(int i, Object obj) {
        fue fue = (fue) obj;
    }

    @Override // defpackage.Su
    public final void X() {
        gzG gzg = ((fue) ((s8) this).R).f3595R;
        if (gzg != null) {
            ((AndroidComposeView) gzg).N();
        }
    }

    @Override // defpackage.Su
    public final void Z(int i, int i2) {
        ((fue) this.v).S(i, i2);
    }

    @Override // defpackage.s8
    public final void m() {
        ((fue) ((s8) this).R).A();
    }

    @Override // defpackage.Su
    public final void v(int i, Object obj) {
        ((fue) this.v).y(i, (fue) obj);
    }
}
