package defpackage;

import java.util.Objects;

/* renamed from: fto  reason: default package */
/* loaded from: classes.dex */
public final class fto extends pdD {
    public final String R;

    /* renamed from: R  reason: collision with other field name */
    public final l9F f3577R;

    public fto(String str) {
        dq dqVar = dq.f2889v;
        Objects.requireNonNull(str, "name == null");
        this.R = str;
        this.f3577R = dqVar;
    }

    @Override // defpackage.pdD
    public final void Z(kK5 kk5, Object obj) {
        String str;
        if (obj != null && (str = (String) this.f3577R.X(obj)) != null) {
            kk5.v(this.R, str);
        }
    }
}
