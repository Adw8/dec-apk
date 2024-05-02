package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: gJ8  reason: default package */
/* loaded from: classes.dex */
public final class gJ8 extends qc {
    public kg9 X = i5D.V;
    public kg9 e;
    public View v;

    public gJ8(Context context, hYA hya, lh8 lh8) {
        super(context, hya, lh8);
        setClipChildren(false);
        int i = ooA.R;
    }

    public final kg9 getFactory() {
        return this.e;
    }

    public /* bridge */ /* synthetic */ LG getSubCompositionView() {
        return null;
    }

    public final View getTypedView$ui_release() {
        return this.v;
    }

    public final kg9 getUpdateBlock() {
        return this.X;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setFactory(kg9 kg9) {
        this.e = kg9;
        if (kg9 != null) {
            View view = (View) kg9.x(getContext());
            this.v = view;
            setView$ui_release(view);
        }
    }

    public final void setTypedView$ui_release(View view) {
        this.v = view;
    }

    public final void setUpdateBlock(kg9 kg9) {
        this.X = kg9;
        setUpdate(new q4(23, this));
    }
}
