package defpackage;

/* renamed from: feV  reason: default package */
/* loaded from: classes.dex */
public final class feV extends Exception {
    public final String R;

    public feV(String str) {
        super(opT.H("LXD command failed: ", str));
        this.R = str;
    }
}
