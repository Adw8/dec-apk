package defpackage;

/* renamed from: W  reason: default package */
/* loaded from: classes.dex */
public final class W {
    public static final b[] v = new b[0];
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f586R;

    /* renamed from: R  reason: collision with other field name */
    public b[] f587R;

    public W() {
        this(10);
    }

    public W(int i) {
        if (i >= 0) {
            this.f587R = i == 0 ? v : new b[i];
            this.R = 0;
            this.f586R = false;
            return;
        }
        throw new IllegalArgumentException("'initialCapacity' must not be negative");
    }

    public static b[] v(b[] bVarArr) {
        return bVarArr.length < 1 ? v : (b[]) bVarArr.clone();
    }

    public final void R(b bVar) {
        if (bVar != null) {
            b[] bVarArr = this.f587R;
            int length = bVarArr.length;
            boolean z = true;
            int i = this.R + 1;
            if (i <= length) {
                z = false;
            }
            if (this.f586R || z) {
                b[] bVarArr2 = new b[Math.max(bVarArr.length, (i >> 1) + i)];
                System.arraycopy(this.f587R, 0, bVarArr2, 0, this.R);
                this.f587R = bVarArr2;
                this.f586R = false;
            }
            this.f587R[this.R] = bVar;
            this.R = i;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    public final b c(int i) {
        if (i < this.R) {
            return this.f587R[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.R);
    }

    public final b[] e() {
        int i = this.R;
        if (i == 0) {
            return v;
        }
        b[] bVarArr = this.f587R;
        if (bVarArr.length == i) {
            this.f586R = true;
            return bVarArr;
        }
        b[] bVarArr2 = new b[i];
        System.arraycopy(bVarArr, 0, bVarArr2, 0, i);
        return bVarArr2;
    }
}
