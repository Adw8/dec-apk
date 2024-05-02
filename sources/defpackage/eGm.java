package defpackage;

import java.util.List;
import java.util.Objects;

/* renamed from: eGm  reason: default package */
/* loaded from: classes.dex */
public final class eGm {
    public final imB R;

    /* renamed from: R  reason: collision with other field name */
    public final Integer f3043R;

    /* renamed from: R  reason: collision with other field name */
    public final List f3044R;

    public eGm(imB imb, List list, Integer num) {
        this.R = imb;
        this.f3044R = list;
        this.f3043R = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eGm)) {
            return false;
        }
        eGm egm = (eGm) obj;
        return this.R.equals(egm.R) && this.f3044R.equals(egm.f3044R) && Objects.equals(this.f3043R, egm.f3043R);
    }

    public final int hashCode() {
        return Objects.hash(this.R, this.f3044R);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.R, this.f3044R, this.f3043R);
    }
}
