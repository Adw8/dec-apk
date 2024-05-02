package defpackage;

import android.content.Intent;
import dev.kdrag0n.virtcontainer.ui.main.MainActivity;
import dev.kdrag0n.virtcontainer.ui.onboarding.OnboardingActivity;

/* renamed from: dFW  reason: default package */
/* loaded from: classes.dex */
public final class dFW extends aFk implements iv7 {
    public final /* synthetic */ MainActivity R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dFW(MainActivity mainActivity, aOO aoo) {
        super(2, aoo);
        this.R = mainActivity;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((dFW) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        doT dot = null;
        if (i == 0) {
            jjU.o(obj);
            iKP ikp = this.R.f2749R;
            if (ikp == null) {
                ikp = null;
            }
            this.X = 1;
            ikp.getClass();
            obj = iKP.R(this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!((Boolean) obj).booleanValue()) {
            MainActivity mainActivity = this.R;
            int i2 = MainActivity.X;
            doT dot2 = mainActivity.R;
            if (dot2 != null) {
                dot = dot2;
            }
            dot.c(false);
            mainActivity.startActivity(new Intent(mainActivity, OnboardingActivity.class));
            mainActivity.finish();
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new dFW(this.R, aoo);
    }
}
