package defpackage;

/* renamed from: lFn  reason: default package */
/* loaded from: classes.dex */
public final class lFn {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final String f5626R;

    /* renamed from: R  reason: collision with other field name */
    public final nX1 f5627R;

    public lFn(nX1 nx1, int i, String str) {
        this.f5627R = nx1;
        this.R = i;
        this.f5626R = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f5627R == nX1.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.R);
        sb.append(' ');
        sb.append(this.f5626R);
        return sb.toString();
    }
}
