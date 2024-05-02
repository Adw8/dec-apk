package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* renamed from: hOJ  reason: default package */
/* loaded from: classes.dex */
public final class hOJ extends nvs {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hOJ(Object obj, Context context, int i) {
        super(context);
        this.e = i;
        this.R = obj;
    }

    @Override // defpackage.nvs
    public final void O(View view, btj btj, nLx nlx) {
        switch (this.e) {
            case 0:
                eFe efe = (eFe) this.R;
                int[] R = efe.R(efe.f3040R.getLayoutManager(), view);
                int i = R[0];
                int i2 = R[1];
                int ceil = (int) Math.ceil(((double) c(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = ((nvs) this).f6632R;
                    nlx.R = i;
                    nlx.v = i2;
                    nlx.c = ceil;
                    nlx.f6376R = decelerateInterpolator;
                    nlx.f6377R = true;
                    return;
                }
                return;
            default:
                super.O(view, btj, nlx);
                return;
        }
    }

    @Override // defpackage.nvs
    public final int c(int i) {
        switch (this.e) {
            case 0:
                return Math.min(100, super.c(i));
            default:
                return super.c(i);
        }
    }

    @Override // defpackage.nvs
    public final float v(DisplayMetrics displayMetrics) {
        int i;
        switch (this.e) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            default:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / ((float) i);
    }
}
