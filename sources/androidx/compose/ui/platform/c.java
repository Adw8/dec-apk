package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class c extends aFk implements iv7 {
    public final /* synthetic */ WrappedComposition R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public c(WrappedComposition wrappedComposition, aOO aoo) {
        super(2, aoo);
        this.R = wrappedComposition;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((c) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            AndroidComposeView androidComposeView = this.R.f1245R;
            this.X = 1;
            Object x = androidComposeView.f1202R.x(this);
            if (x != bgr) {
                x = o8s.R;
            }
            if (x == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new c(this.R, aoo);
    }
}
