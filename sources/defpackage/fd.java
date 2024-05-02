package defpackage;

/* renamed from: fd  reason: default package */
/* loaded from: classes.dex */
public abstract class fd implements qe {
    public String R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f3471R = new int[2];

    public final int[] c(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.f3471R;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public final String e() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        return null;
    }
}
