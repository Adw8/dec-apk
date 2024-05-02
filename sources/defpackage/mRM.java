package defpackage;

/* renamed from: mRM  reason: default package */
/* loaded from: classes.dex */
public class mRM {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object[] f6044R;
    public int v;

    public mRM(int i, int i2) {
        this.R = i2;
        if (i2 != 1) {
            if (i > 0) {
                this.f6044R = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else if (i > 0) {
            this.f6044R = new Object[i];
        } else {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    public Object R() {
        switch (this.R) {
            case 0:
                int i = this.v;
                if (i <= 0) {
                    return null;
                }
                int i2 = i - 1;
                Object[] objArr = this.f6044R;
                Object obj = objArr[i2];
                objArr[i2] = null;
                this.v = i2;
                return obj;
            default:
                int i3 = this.v;
                if (i3 <= 0) {
                    return null;
                }
                int i4 = i3 - 1;
                Object[] objArr2 = this.f6044R;
                Object obj2 = objArr2[i4];
                objArr2[i4] = null;
                this.v = i4;
                return obj2;
        }
    }

    public boolean v(Object obj) {
        int i;
        boolean z;
        switch (this.R) {
            case 0:
                int i2 = this.v;
                Object[] objArr = this.f6044R;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.v = i2 + 1;
                return true;
            default:
                int i3 = 0;
                while (true) {
                    i = this.v;
                    if (i3 >= i) {
                        z = false;
                    } else if (this.f6044R[i3] == obj) {
                        z = true;
                    } else {
                        i3++;
                    }
                }
                if (!z) {
                    Object[] objArr2 = this.f6044R;
                    if (i >= objArr2.length) {
                        return false;
                    }
                    objArr2[i] = obj;
                    this.v = i + 1;
                    return true;
                }
                throw new IllegalStateException("Already in the pool!");
        }
    }
}
