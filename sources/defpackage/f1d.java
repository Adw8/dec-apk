package defpackage;

/* renamed from: f1d  reason: default package */
/* loaded from: classes.dex */
public final class f1d extends j18 {
    public final /* synthetic */ int O;

    public /* synthetic */ f1d(int i) {
        this.O = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.O) {
            case 0:
                int i = this.X + 2;
                this.X = i;
                Object[] objArr = this.R;
                return new c07(objArr[i - 2], objArr[i - 1]);
            case 1:
                int i2 = this.X + 2;
                this.X = i2;
                return this.R[i2 - 2];
            default:
                int i3 = this.X + 2;
                this.X = i3;
                return this.R[i3 - 1];
        }
    }
}
