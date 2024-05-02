package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int[][] R = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: R  reason: collision with other field name */
    public final fBr f2340R;
    public ColorStateList X;
    public boolean Z;
    public ColorStateList e;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, R.attr.switchStyle, 2132018178), attributeSet, R.attr.switchStyle);
        Context context2 = getContext();
        this.f2340R = new fBr(context2);
        TypedArray w = aH9.w(context2, attributeSet, hDC.T, R.attr.switchStyle, 2132018178, new int[0]);
        this.Z = w.getBoolean(0, false);
        w.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.e == null) {
            int t = vd.t(this, R.attr.colorSurface);
            int t2 = vd.t(this, R.attr.colorControlActivated);
            float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
            if (this.f2340R.f3352R) {
                float f = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap weakHashMap = of5.f6887R;
                    f += m18.m((View) parent);
                }
                dimension += f;
            }
            int R2 = this.f2340R.R(t, dimension);
            this.e = new ColorStateList(R, new int[]{vd.Y(t, t2, 1.0f), R2, vd.Y(t, t2, 0.38f), R2});
        }
        return this.e;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.X == null) {
            int[][] iArr = R;
            int t = vd.t(this, R.attr.colorSurface);
            int t2 = vd.t(this, R.attr.colorControlActivated);
            int t3 = vd.t(this, R.attr.colorOnSurface);
            this.X = new ColorStateList(iArr, new int[]{vd.Y(t, t2, 0.54f), vd.Y(t, t3, 0.32f), vd.Y(t, t2, 0.12f), vd.Y(t, t3, 0.12f)});
        }
        return this.X;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.Z && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.Z && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.Z = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList(null);
        setTrackTintList(null);
    }
}
