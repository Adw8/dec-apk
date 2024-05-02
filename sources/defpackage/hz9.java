package defpackage;

/* renamed from: hz9  reason: default package */
/* loaded from: classes.dex */
public final class hz9 {
    public int R = 0;
    public int v = 0;
    public int c = Integer.MIN_VALUE;
    public int e = Integer.MIN_VALUE;
    public int X = 0;
    public int O = 0;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4430R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f4431v = false;

    public final void R(int i, int i2) {
        this.c = i;
        this.e = i2;
        this.f4431v = true;
        if (this.f4430R) {
            if (i2 != Integer.MIN_VALUE) {
                this.R = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.v = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.R = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.v = i2;
        }
    }
}
