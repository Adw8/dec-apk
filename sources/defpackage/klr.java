package defpackage;

import java.util.Objects;

/* renamed from: klr  reason: default package */
/* loaded from: classes.dex */
public final class klr {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final cMT f5411R;

    /* renamed from: R  reason: collision with other field name */
    public final o02 f5412R;

    public klr(cMT cmt, int i, o02 o02) {
        this.f5411R = cmt;
        this.R = i;
        this.f5412R = o02;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof klr)) {
            return false;
        }
        klr klr = (klr) obj;
        return this.f5411R == klr.f5411R && this.R == klr.R && this.f5412R.equals(klr.f5412R);
    }

    public final int hashCode() {
        return Objects.hash(this.f5411R, Integer.valueOf(this.R), Integer.valueOf(this.f5412R.hashCode()));
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.f5411R, Integer.valueOf(this.R), this.f5412R);
    }
}
