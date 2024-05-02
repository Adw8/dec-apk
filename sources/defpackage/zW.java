package defpackage;

/* renamed from: zW  reason: default package */
/* loaded from: classes.dex */
public final class zW implements C0 {
    public final /* synthetic */ int R;

    public /* synthetic */ zW(int i) {
        this.R = i;
    }

    @Override // defpackage.C0
    public final void c(jJj jjj, int i, int[] iArr, int[] iArr2) {
        switch (this.R) {
            case 0:
                nA.c(i, iArr, iArr2, false);
                return;
            default:
                nA.v(iArr, iArr2, false);
                return;
        }
    }

    public final String toString() {
        switch (this.R) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
