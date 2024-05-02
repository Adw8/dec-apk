package defpackage;

/* renamed from: _H  reason: default package */
/* loaded from: classes.dex */
public final class _H extends k8G implements iv7 {
    public final /* synthetic */ eGS R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ _H(eGS egs, int i) {
        super(2);
        this.X = i;
        this.R = egs;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                fue fue = (fue) obj;
                ((gJ8) this.R.R).setModifier((ncu) obj2);
                break;
            case 1:
                fue fue2 = (fue) obj;
                ((gJ8) this.R.R).setDensity((jJj) obj2);
                break;
            case 2:
                fue fue3 = (fue) obj;
                ((gJ8) this.R.R).setLifecycleOwner((nu_) obj2);
                break;
            case 3:
                fue fue4 = (fue) obj;
                ((gJ8) this.R.R).setSavedStateRegistryOwner((adL) obj2);
                break;
            case 4:
                fue fue5 = (fue) obj;
                ((gJ8) this.R.R).setUpdateBlock((kg9) obj2);
                break;
            default:
                fue fue6 = (fue) obj;
                gJ8 gj8 = (gJ8) this.R.R;
                int ordinal = ((mdz) obj2).ordinal();
                int i = 1;
                if (ordinal == 0) {
                    i = 0;
                } else if (ordinal != 1) {
                    throw new j8f((Object) null);
                }
                gj8.setLayoutDirection(i);
                break;
        }
        return o8s.R;
    }
}
