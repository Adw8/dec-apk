package defpackage;

/* renamed from: hdv  reason: default package */
/* loaded from: classes.dex */
public final class hdv extends brQ {
    public final /* synthetic */ int R;

    public /* synthetic */ hdv(int i) {
        this.R = i;
    }

    public static int O(int i, int i2, long j, byte[] bArr) {
        if (i2 == 0) {
            hdv hdv = d_A.R;
            if (i > -12) {
                return -1;
            }
            return i;
        } else if (i2 == 1) {
            return d_A.c(i, hU3.Z(j, bArr));
        } else {
            if (i2 == 2) {
                return d_A.e(i, hU3.Z(j, bArr), hU3.Z(j + 1, bArr));
            }
            throw new AssertionError();
        }
    }

    public static int X(int i, long j, byte[] bArr) {
        int i2 = 0;
        if (i < 16) {
            return 0;
        }
        while (true) {
            int i3 = i2 + 8;
            if (i3 > i || (hU3.N(hU3.R + j, bArr) & -9187201950435737472L) != 0) {
                break;
            }
            j += 8;
            i2 = i3;
        }
        while (i2 < i) {
            j = 1 + j;
            if (hU3.Z(j, bArr) < 0) {
                return i2;
            }
            i2++;
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(java.lang.CharSequence r18, byte[] r19, int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 598
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdv.c(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x012b, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(int r21, int r22, byte[] r23) {
        /*
        // Method dump skipped, instructions count: 340
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdv.e(int, int, byte[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String v(byte[] r18, int r19, int r20) {
        /*
        // Method dump skipped, instructions count: 530
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdv.v(byte[], int, int):java.lang.String");
    }
}
