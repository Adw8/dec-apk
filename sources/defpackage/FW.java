package defpackage;

/* renamed from: FW  reason: default package */
/* loaded from: classes.dex */
public final class FW implements h8 {
    public final /* synthetic */ int R;

    public /* synthetic */ FW(int i) {
        this.R = i;
    }

    public final String toString() {
        switch (this.R) {
            case 0:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }

    @Override // defpackage.h8
    public final void v(int i, jJj jjj, mdz mdz, int[] iArr, int[] iArr2) {
        mdz mdz2 = mdz.Ltr;
        switch (this.R) {
            case 0:
                if (mdz == mdz2) {
                    nA.c(i, iArr, iArr2, false);
                    return;
                } else {
                    nA.v(iArr, iArr2, true);
                    return;
                }
            default:
                if (mdz == mdz2) {
                    nA.v(iArr, iArr2, false);
                    return;
                } else {
                    nA.c(i, iArr, iArr2, true);
                    return;
                }
        }
    }
}
