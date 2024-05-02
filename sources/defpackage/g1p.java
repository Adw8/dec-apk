package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/* renamed from: g1p  reason: default package */
/* loaded from: classes.dex */
public final class g1p {
    public final cwX R;

    /* renamed from: R  reason: collision with other field name */
    public final List f3653R;

    public g1p(Context context, Optional optional) {
        this.f3653R = (List) optional.orElseGet(new Supplier() { // from class: c_6
            @Override // java.util.function.Supplier
            public final Object get() {
                return fcD.R;
            }
        });
        this.R = pdD.J(new _c(context, 14, this));
    }
}
