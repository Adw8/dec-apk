package defpackage;

/* renamed from: c_x  reason: default package */
/* loaded from: classes.dex */
public final class c_x implements c71 {
    public int X;
    public int e;

    public /* synthetic */ c_x(int i) {
        this.e = 0;
        this.X = i;
    }

    public /* synthetic */ c_x(int i, int i2) {
        this.e = i;
        this.X = i2;
    }

    @Override // defpackage.c71
    public int L(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.e) {
            z = true;
        }
        if (z) {
            return i;
        }
        throw new IllegalStateException(jQ.P(jQ.y("OffsetMapping.transformedToOriginal returned invalid mapping: ", i, " -> ", i, " is not in range of original text [0, "), this.e, ']').toString());
    }

    @Override // defpackage.c71
    public int Z(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.X) {
            z = true;
        }
        if (z) {
            return i;
        }
        throw new IllegalStateException(jQ.P(jQ.y("OffsetMapping.originalToTransformed returned invalid mapping: ", i, " -> ", i, " is not in range of transformed text [0, "), this.X, ']').toString());
    }

    public /* synthetic */ c_x() {
    }
}
