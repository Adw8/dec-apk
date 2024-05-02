package defpackage;

import dev.kdrag0n.virtcontainer.ui.main.MainSharedViewModel;

/* renamed from: jAK  reason: default package */
/* loaded from: classes.dex */
public final class jAK extends aFk implements iv7 {
    public final /* synthetic */ MainSharedViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public ivW f4851R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jAK(MainSharedViewModel mainSharedViewModel, aOO aoo) {
        super(2, aoo);
        this.R = mainSharedViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((jAK) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        ivW ivw;
        he6 he6;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            MainSharedViewModel mainSharedViewModel = this.R;
            ivW ivw2 = mainSharedViewModel.R;
            kdp kdp = mainSharedViewModel.f2753R;
            this.f4851R = ivw2;
            this.X = 1;
            kdp.getClass();
            obj = oNN.Okay;
            ivw = ivw2;
        } else if (i == 1) {
            ivw = this.f4851R;
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int ordinal = ((oNN) obj).ordinal();
        if (ordinal == 0) {
            he6 = he6.NotRunning;
        } else if (ordinal == 1) {
            he6 = he6.Error;
        } else if (ordinal == 2) {
            he6 = he6.Okay;
        } else {
            throw new j8f((Object) null);
        }
        ivw.H(he6);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new jAK(this.R, aoo);
    }
}
