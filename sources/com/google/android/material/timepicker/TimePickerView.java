package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int x = 0;
    public final MaterialButtonToggleGroup R;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        h hVar = new h(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.R = materialButtonToggleGroup;
        materialButtonToggleGroup.f2300R.add(new e(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        dzk dzk = new dzk(new GestureDetector(getContext(), new g(this)));
        chip.setOnTouchListener(dzk);
        chip2.setOnTouchListener(dzk);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(hVar);
        chip2.setOnClickListener(hVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public final void C() {
        djn djn;
        if (this.R.getVisibility() == 0) {
            nsw nsw = new nsw();
            nsw.v(this);
            WeakHashMap weakHashMap = of5.f6887R;
            char c = 1;
            if (eHQ.e(this) == 0) {
                c = 2;
            }
            if (nsw.f6616v.containsKey(Integer.valueOf((int) R.id.material_clock_display)) && (djn = (djn) nsw.f6616v.get(Integer.valueOf((int) R.id.material_clock_display))) != null) {
                switch (c) {
                    case 1:
                        fay fay = djn.f2847R;
                        fay.f3448O = -1;
                        fay.f3454X = -1;
                        fay.Y = -1;
                        fay.A = Integer.MIN_VALUE;
                        break;
                    case 2:
                        fay fay2 = djn.f2847R;
                        fay2.f3456Z = -1;
                        fay2.f3447L = -1;
                        fay2.h = -1;
                        fay2.d = Integer.MIN_VALUE;
                        break;
                    case 3:
                        fay fay3 = djn.f2847R;
                        fay3.x = -1;
                        fay3.m = -1;
                        fay3.I = 0;
                        fay3.S = Integer.MIN_VALUE;
                        break;
                    case 4:
                        fay fay4 = djn.f2847R;
                        fay4.H = -1;
                        fay4.U = -1;
                        fay4.u = 0;
                        fay4.W = Integer.MIN_VALUE;
                        break;
                    case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                        fay fay5 = djn.f2847R;
                        fay5.C = -1;
                        fay5.N = -1;
                        fay5.P = -1;
                        fay5.Q = 0;
                        fay5.r = Integer.MIN_VALUE;
                        break;
                    case 6:
                        fay fay6 = djn.f2847R;
                        fay6.j = -1;
                        fay6.g = -1;
                        fay6.n = 0;
                        fay6.T = Integer.MIN_VALUE;
                        break;
                    case 7:
                        fay fay7 = djn.f2847R;
                        fay7.y = -1;
                        fay7.t = -1;
                        fay7.z = 0;
                        fay7.s = Integer.MIN_VALUE;
                        break;
                    case VmNativeCallback.$stable /* 8 */:
                        fay fay8 = djn.f2847R;
                        fay8.e = -1.0f;
                        fay8.V = -1;
                        fay8.i = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            nsw.R(this);
            setConstraintSet(null);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            C();
        }
    }
}
