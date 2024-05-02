package defpackage;

/* renamed from: bRU  reason: default package */
/* loaded from: classes.dex */
public final class bRU extends RuntimeException {
    public final int e;

    public bRU(String str) {
        super(str);
        this.e = -1;
    }

    public bRU(String str, int i) {
        super(str);
        this.e = i;
    }

    public bRU(String str, Exception exc) {
        super(str, exc);
        this.e = -1;
    }

    public bRU(String str, Exception exc, int i) {
        super(str, exc);
        this.e = i;
    }
}
