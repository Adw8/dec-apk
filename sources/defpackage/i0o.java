package defpackage;

import android.os.Looper;
import android.view.MotionEvent;

/* renamed from: i0o  reason: default package */
/* loaded from: classes.dex */
public final class i0o extends k8G implements kg9 {
    public final /* synthetic */ qc R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0o(gJ8 gj8, int i) {
        super(1);
        this.X = i;
        this.R = gj8;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        boolean z;
        switch (this.X) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    case 6:
                        z = this.R.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        z = this.R.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(z);
            case 1:
                qc qcVar = (qc) obj;
                this.R.getHandler().post(new i4(this.R.f7373R, 1));
                return o8s.R;
            default:
                f_c f_c = (f_c) obj;
                if (this.R.getHandler().getLooper() == Looper.myLooper()) {
                    f_c.g();
                } else {
                    this.R.getHandler().post(new i4(f_c, 2));
                }
                return o8s.R;
        }
    }
}
