package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: gqK  reason: default package */
/* loaded from: classes.dex */
public final class gqK implements oFl {

    /* renamed from: R  reason: collision with other field name */
    public final List f3954R;
    public final int e;

    /* renamed from: R  reason: collision with other field name */
    public Float f3953R = null;

    /* renamed from: v  reason: collision with other field name */
    public Float f3955v = null;
    public aD4 R = null;
    public aD4 v = null;

    public gqK(int i, ArrayList arrayList) {
        this.e = i;
        this.f3954R = arrayList;
    }

    @Override // defpackage.oFl
    public final boolean isValid() {
        return this.f3954R.contains(this);
    }
}
