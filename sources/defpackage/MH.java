package defpackage;

/* renamed from: MH  reason: default package */
/* loaded from: classes.dex */
public class MH extends b0 {
    public final byte[] R;

    public MH(byte[] bArr) {
        bArr.getClass();
        this.R = bArr;
    }

    @Override // defpackage.b0
    public void C(int i, byte[] bArr) {
        System.arraycopy(this.R, 0, bArr, 0, i);
    }

    @Override // defpackage.b0
    public byte P(int i) {
        return this.R[i];
    }

    @Override // defpackage.b0
    public byte R(int i) {
        return this.R[i];
    }

    public int V() {
        return 0;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0) || size() != ((b0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof MH)) {
            return obj.equals(this);
        }
        MH mh = (MH) obj;
        int i = this.e;
        int i2 = mh.e;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > mh.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        } else if (0 + size <= mh.size()) {
            byte[] bArr = this.R;
            byte[] bArr2 = mh.R;
            int V = V() + size;
            int V2 = V();
            int V3 = mh.V() + 0;
            while (V2 < V) {
                if (bArr[V2] != bArr2[V3]) {
                    return false;
                }
                V2++;
                V3++;
            }
            return true;
        } else {
            StringBuilder y = jQ.y("Ran off end of other: ", 0, ", ", size, ", ");
            y.append(mh.size());
            throw new IllegalArgumentException(y.toString());
        }
    }

    @Override // defpackage.b0
    public int size() {
        return this.R.length;
    }
}
