package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.WeakHashMap;

/* renamed from: mZP  reason: default package */
/* loaded from: classes.dex */
public final class mZP extends Property {
    public final /* synthetic */ int R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mZP(Class cls, String str, int i) {
        super(cls, str);
        this.R = i;
    }

    public final Float R(View view) {
        switch (this.R) {
            case 6:
                mZP mzp = kkY.R;
                return Float.valueOf(view.getTransitionAlpha());
            case 7:
            default:
                WeakHashMap weakHashMap = of5.f6887R;
                return Float.valueOf((float) eHQ.X(view));
            case VmNativeCallback.$stable:
                return Float.valueOf((float) view.getLayoutParams().width);
            case 9:
                return Float.valueOf((float) view.getLayoutParams().height);
            case 10:
                WeakHashMap weakHashMap2 = of5.f6887R;
                return Float.valueOf((float) eHQ.O(view));
        }
    }

    public final void c(View view, PointF pointF) {
        switch (this.R) {
            case 3:
                int left = view.getLeft();
                int top = view.getTop();
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                mZP mzp = kkY.R;
                view.setLeftTopRightBottom(left, top, round, round2);
                return;
            case 4:
                int round3 = Math.round(pointF.x);
                int round4 = Math.round(pointF.y);
                int right = view.getRight();
                int bottom = view.getBottom();
                mZP mzp2 = kkY.R;
                view.setLeftTopRightBottom(round3, round4, right, bottom);
                return;
            default:
                int round5 = Math.round(pointF.x);
                int round6 = Math.round(pointF.y);
                mZP mzp3 = kkY.R;
                view.setLeftTopRightBottom(round5, round6, view.getWidth() + round5, view.getHeight() + round6);
                return;
        }
    }

    public final void e(View view, Float f) {
        switch (this.R) {
            case 6:
                float floatValue = f.floatValue();
                mZP mzp = kkY.R;
                view.setTransitionAlpha(floatValue);
                return;
            case 7:
            default:
                WeakHashMap weakHashMap = of5.f6887R;
                eHQ.H(view, eHQ.O(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
                return;
            case VmNativeCallback.$stable:
                view.getLayoutParams().width = f.intValue();
                view.requestLayout();
                return;
            case 9:
                view.getLayoutParams().height = f.intValue();
                view.requestLayout();
                return;
            case 10:
                int intValue = f.intValue();
                int paddingTop = view.getPaddingTop();
                WeakHashMap weakHashMap2 = of5.f6887R;
                eHQ.H(view, intValue, paddingTop, eHQ.X(view), view.getPaddingBottom());
                return;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.R) {
            case 0:
                return Float.valueOf(((SwitchCompat) obj).mThumbPosition);
            case 1:
                fv fvVar = (fv) obj;
                return null;
            case 2:
                fv fvVar2 = (fv) obj;
                return null;
            case 3:
                View view = (View) obj;
                return null;
            case 4:
                View view2 = (View) obj;
                return null;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                View view3 = (View) obj;
                return null;
            case 6:
                return R((View) obj);
            case 7:
                WeakHashMap weakHashMap = of5.f6887R;
                return pco.R((View) obj);
            case VmNativeCallback.$stable:
                return R((View) obj);
            case 9:
                return R((View) obj);
            case 10:
                return R((View) obj);
            default:
                return R((View) obj);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.R) {
            case 0:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
            case 1:
                v((fv) obj, (PointF) obj2);
                return;
            case 2:
                v((fv) obj, (PointF) obj2);
                return;
            case 3:
                c((View) obj, (PointF) obj2);
                return;
            case 4:
                c((View) obj, (PointF) obj2);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                c((View) obj, (PointF) obj2);
                return;
            case 6:
                e((View) obj, (Float) obj2);
                return;
            case 7:
                WeakHashMap weakHashMap = of5.f6887R;
                pco.c((View) obj, (Rect) obj2);
                return;
            case VmNativeCallback.$stable:
                e((View) obj, (Float) obj2);
                return;
            case 9:
                e((View) obj, (Float) obj2);
                return;
            case 10:
                e((View) obj, (Float) obj2);
                return;
            default:
                e((View) obj, (Float) obj2);
                return;
        }
    }

    public final void v(fv fvVar, PointF pointF) {
        switch (this.R) {
            case 1:
                fvVar.getClass();
                fvVar.R = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                fvVar.v = round;
                int i = fvVar.X + 1;
                fvVar.X = i;
                if (i == fvVar.O) {
                    kkY.R(fvVar.f3614R, fvVar.R, round, fvVar.c, fvVar.e);
                    fvVar.X = 0;
                    fvVar.O = 0;
                    return;
                }
                return;
            default:
                fvVar.getClass();
                fvVar.c = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                fvVar.e = round2;
                int i2 = fvVar.O + 1;
                fvVar.O = i2;
                if (fvVar.X == i2) {
                    kkY.R(fvVar.f3614R, fvVar.R, fvVar.v, fvVar.c, round2);
                    fvVar.X = 0;
                    fvVar.O = 0;
                    return;
                }
                return;
        }
    }
}
