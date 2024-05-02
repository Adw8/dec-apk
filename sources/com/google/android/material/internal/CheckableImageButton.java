package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import dev.kdrag0n.virtcontainer.R;

/* loaded from: classes.dex */
public class CheckableImageButton extends eQ implements Checkable {
    public static final int[] R = {16842912};
    public boolean c = true;
    public boolean e = true;
    public boolean v;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        of5.O(this, new bWR(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.v;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (!this.v) {
            return super.onCreateDrawableState(i);
        }
        return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), R);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y2 y2Var = (y2) parcelable;
        super.onRestoreInstanceState(((OG) y2Var).f327R);
        setChecked(y2Var.R);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        y2 y2Var = new y2(super.onSaveInstanceState());
        y2Var.R = this.v;
        return y2Var;
    }

    public void setCheckable(boolean z) {
        if (this.c != z) {
            this.c = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.c && this.v != z) {
            this.v = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.e = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.e) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.v);
    }
}
