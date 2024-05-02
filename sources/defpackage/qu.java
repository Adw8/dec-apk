package defpackage;

import android.content.Context;

/* renamed from: qu  reason: default package */
/* loaded from: classes.dex */
public final class qu extends aFk implements iv7 {
    public final /* synthetic */ Context R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ b8Y f7377R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public qu(b8Y b8y, Context context, aOO aoo) {
        super(2, aoo);
        this.f7377R = b8y;
        this.R = context;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((qu) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        b8Y b8y = this.f7377R;
        return onH.R.R(this.R, b8y);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new qu(this.f7377R, this.R, aoo);
    }
}
