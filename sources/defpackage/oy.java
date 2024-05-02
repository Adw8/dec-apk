package defpackage;

/* renamed from: oy  reason: default package */
/* loaded from: classes.dex */
public final class oy implements h8, C0 {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ int f7042R;

    public oy(int i) {
        this.f7042R = i;
        if (i == 1) {
            this.R = (float) 0;
        } else if (i == 2) {
            this.R = (float) 0;
        } else if (i != 3) {
            this.R = (float) 0;
        } else {
            this.R = (float) 0;
        }
    }

    @Override // defpackage.h8, defpackage.C0
    public final float R() {
        switch (this.f7042R) {
            case 0:
                return this.R;
            case 1:
                return this.R;
            case 2:
                return this.R;
            default:
                return this.R;
        }
    }

    @Override // defpackage.C0
    public final void c(jJj jjj, int i, int[] iArr, int[] iArr2) {
        switch (this.f7042R) {
            case 0:
                nA.R(i, iArr, iArr2, false);
                return;
            case 1:
                nA.e(i, iArr, iArr2, false);
                return;
            case 2:
                nA.X(i, iArr, iArr2, false);
                return;
            default:
                nA.O(i, iArr, iArr2, false);
                return;
        }
    }

    public final String toString() {
        switch (this.f7042R) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }

    @Override // defpackage.h8
    public final void v(int i, jJj jjj, mdz mdz, int[] iArr, int[] iArr2) {
        mdz mdz2 = mdz.Ltr;
        switch (this.f7042R) {
            case 0:
                if (mdz == mdz2) {
                    nA.R(i, iArr, iArr2, false);
                    return;
                } else {
                    nA.R(i, iArr, iArr2, true);
                    return;
                }
            case 1:
                if (mdz == mdz2) {
                    nA.e(i, iArr, iArr2, false);
                    return;
                } else {
                    nA.e(i, iArr, iArr2, true);
                    return;
                }
            case 2:
                if (mdz == mdz2) {
                    nA.X(i, iArr, iArr2, false);
                    return;
                } else {
                    nA.X(i, iArr, iArr2, true);
                    return;
                }
            default:
                if (mdz == mdz2) {
                    nA.O(i, iArr, iArr2, false);
                    return;
                } else {
                    nA.O(i, iArr, iArr2, true);
                    return;
                }
        }
    }
}
