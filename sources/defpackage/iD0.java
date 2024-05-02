package defpackage;

import android.net.Uri;
import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel;
import java.io.File;

/* renamed from: iD0  reason: default package */
/* loaded from: classes.dex */
public final class iD0 extends aFk implements iv7 {
    public final /* synthetic */ RootSettingsViewModel R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iD0(RootSettingsViewModel rootSettingsViewModel, aOO aoo) {
        super(2, aoo);
        this.R = rootSettingsViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((iD0) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            this.R.f2786R.R(Boolean.TRUE);
            lsf lsf = iFn.f4518R;
            oxF oxf = new oxF(this.R, null);
            this.X = 1;
            obj = l6.a(lsf, oxf, this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else if (i == 2) {
            jjU.o(obj);
            this.R.f2786R.R(Boolean.FALSE);
            return o8s.R;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        RootSettingsViewModel rootSettingsViewModel = this.R;
        bLS bls = rootSettingsViewModel.f2781R;
        Uri v = ((mMh) ((nak) rootSettingsViewModel.f2787R).get()).v((File) obj);
        this.X = 2;
        if (bls.R(v, this) == bgr) {
            return bgr;
        }
        this.R.f2786R.R(Boolean.FALSE);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new iD0(this.R, aoo);
    }
}
