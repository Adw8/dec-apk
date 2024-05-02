package defpackage;

/* renamed from: fLN  reason: default package */
/* loaded from: classes.dex */
public abstract class fLN extends C2 {
    public fLN(aOO aoo) {
        super(aoo);
        if (aoo != null) {
            if (!(aoo.v() == aIH.R)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // defpackage.aOO
    public final nbD v() {
        return aIH.R;
    }
}
