package defpackage;

import java.util.Objects;

/* renamed from: j70  reason: default package */
/* loaded from: classes.dex */
public final class j70 extends pdD {
    public final String R;

    /* renamed from: R  reason: collision with other field name */
    public final l9F f4836R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4837R;
    public final /* synthetic */ int e;

    public j70(String str, boolean z, int i) {
        dq dqVar = dq.f2889v;
        this.e = i;
        if (i != 1) {
            Objects.requireNonNull(str, "name == null");
            this.R = str;
            this.f4836R = dqVar;
            this.f4837R = z;
            return;
        }
        Objects.requireNonNull(str, "name == null");
        this.R = str;
        this.f4836R = dqVar;
        this.f4837R = z;
    }

    @Override // defpackage.pdD
    public final void Z(kK5 kk5, Object obj) {
        String str;
        String str2;
        switch (this.e) {
            case 0:
                if (obj != null && (str2 = (String) this.f4836R.X(obj)) != null) {
                    kk5.R(this.R, str2, this.f4837R);
                    return;
                }
                return;
            default:
                if (obj != null && (str = (String) this.f4836R.X(obj)) != null) {
                    kk5.e(this.R, str, this.f4837R);
                    return;
                }
                return;
        }
    }
}
