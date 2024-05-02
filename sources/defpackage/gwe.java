package defpackage;

import dev.kdrag0n.virtcontainer.ui.create.CreateFragment;
import dev.kdrag0n.virtcontainer.ui.create.CreateViewModel;

/* renamed from: gwe  reason: default package */
/* loaded from: classes.dex */
public final class gwe extends aFk implements iv7 {
    public final /* synthetic */ CreateFragment R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3996R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gwe(CreateFragment createFragment, aOO aoo) {
        super(2, aoo);
        this.R = createFragment;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((gwe) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f3996R;
        mxC.y(((CreateViewModel) this.R.R.getValue()).f2745R, jy_, new nYR(this.R, 0));
        mxC.y(((CreateViewModel) this.R.R.getValue()).v, jy_, new nYR(this.R, 1));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        gwe gwe = new gwe(this.R, aoo);
        gwe.f3996R = obj;
        return gwe;
    }
}
