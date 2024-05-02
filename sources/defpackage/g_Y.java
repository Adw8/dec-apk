package defpackage;

/* renamed from: g_Y  reason: default package */
/* loaded from: classes.dex */
public final class g_Y {
    public int R = 0;
    public int X;
    public int c;
    public int e;
    public int v;

    public final boolean R() {
        int i = this.R;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.e;
            int i4 = this.v;
            if ((((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) << 0) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.e;
            int i6 = this.c;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.X;
            int i8 = this.v;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.X;
            int i10 = this.c;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if (((i2 << 12) & i) == 0) {
                return false;
            }
        }
        return true;
    }
}
