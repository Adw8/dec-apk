package defpackage;

import android.view.MotionEvent;

/* renamed from: a0B  reason: default package */
/* loaded from: classes.dex */
public final class a0B extends k8G implements kg9 {
    public final /* synthetic */ nCn R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0B(nCn ncn, int i) {
        super(1);
        this.X = i;
        this.R = ncn;
    }

    public final void R(MotionEvent motionEvent) {
        kg9 kg9 = null;
        switch (this.X) {
            case 0:
                kg9 kg92 = this.R.R;
                if (kg92 != null) {
                    kg9 = kg92;
                }
                kg9.x(motionEvent);
                return;
            default:
                kg9 kg93 = this.R.R;
                if (kg93 != null) {
                    kg9 = kg93;
                }
                kg9.x(motionEvent);
                return;
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                R((MotionEvent) obj);
                break;
            default:
                R((MotionEvent) obj);
                break;
        }
        return o8s.R;
    }
}
