package defpackage;

/* renamed from: Kn  reason: default package */
/* loaded from: classes.dex */
public final class Kn extends MH {
    public final int O;
    public final int X;

    public Kn(byte[] bArr, int i, int i2) {
        super(bArr);
        b0.v(i, i + i2, bArr.length);
        this.X = i;
        this.O = i2;
    }

    @Override // defpackage.MH, defpackage.b0
    public final void C(int i, byte[] bArr) {
        System.arraycopy(this.R, this.X + 0, bArr, 0, i);
    }

    @Override // defpackage.MH, defpackage.b0
    public final byte P(int i) {
        return this.R[this.X + i];
    }

    @Override // defpackage.MH, defpackage.b0
    public final byte R(int i) {
        int i2 = this.O;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.R[this.X + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(opT.Z("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(jQ.U("Index > length: ", i, ", ", i2));
    }

    @Override // defpackage.MH
    public final int V() {
        return this.X;
    }

    @Override // defpackage.MH, defpackage.b0
    public final int size() {
        return this.O;
    }
}
