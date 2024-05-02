package defpackage;

/* renamed from: nIH  reason: default package */
/* loaded from: classes.dex */
public abstract class nIH {
    public static final Object R = new Object();

    public static final void R(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (!z) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }
}
