package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: gd0  reason: default package */
/* loaded from: classes.dex */
public final class gd0 implements mpM {
    public final /* synthetic */ bzl R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lTo f3828R;

    public gd0(lTo lto, bzl bzl) {
        this.f3828R = lto;
        this.R = bzl;
    }

    @Override // defpackage.mpM
    public final gWM v(View view, gWM gwm) {
        int i;
        int i2;
        int i3;
        lTo lto = this.f3828R;
        bzl bzl = this.R;
        int i4 = bzl.R;
        int i5 = bzl.c;
        int i6 = bzl.e;
        lto.getClass();
        ojk R = gwm.R(7);
        ojk R2 = gwm.R(32);
        ((BottomSheetBehavior) lto.R).m = R.v;
        boolean J = vd.J(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) lto.R;
        if (bottomSheetBehavior.f2281e) {
            bottomSheetBehavior.Z = gwm.c();
            paddingBottom = ((BottomSheetBehavior) lto.R).Z + i6;
        }
        BottomSheetBehavior bottomSheetBehavior2 = (BottomSheetBehavior) lto.R;
        if (bottomSheetBehavior2.f2276X) {
            paddingLeft = (J ? i5 : i4) + R.f6899R;
        }
        if (bottomSheetBehavior2.f2260O) {
            if (!J) {
                i4 = i5;
            }
            paddingRight = i4 + R.c;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior3 = (BottomSheetBehavior) lto.R;
        boolean z = false;
        z = true;
        if (bottomSheetBehavior3.f2277Z && marginLayoutParams.leftMargin != (i3 = R.f6899R)) {
            marginLayoutParams.leftMargin = i3;
            z = true;
        }
        if (bottomSheetBehavior3.f2284m && marginLayoutParams.rightMargin != (i2 = R.c)) {
            marginLayoutParams.rightMargin = i2;
            z = true;
        }
        if (bottomSheetBehavior3.f2288x && marginLayoutParams.topMargin != (i = R.v)) {
            marginLayoutParams.topMargin = i;
        }
        if (z) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z2 = lto.f5744R;
        if (z2) {
            ((BottomSheetBehavior) lto.R).L = R2.e;
        }
        BottomSheetBehavior bottomSheetBehavior4 = (BottomSheetBehavior) lto.R;
        if (bottomSheetBehavior4.f2281e || z2) {
            bottomSheetBehavior4.d();
        }
        return gwm;
    }
}
