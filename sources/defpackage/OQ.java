package defpackage;

/* renamed from: OQ  reason: default package */
/* loaded from: classes.dex */
public final class OQ {
    public final Object R;

    public /* synthetic */ OQ(Object obj) {
        this.R = obj;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof OQ) && n3x.v(this.R, ((OQ) obj).R);
    }

    public final int hashCode() {
        Object obj = this.R;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.R;
        return "AsyncTypefaceResult(result=" + obj + ')';
    }
}
