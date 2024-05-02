package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: btf  reason: default package */
/* loaded from: classes.dex */
public final class btf extends InsetDrawable {
    public btf(Drawable drawable, int i, int i2, int i3, int i4) {
        super(drawable, i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.Drawable, android.graphics.drawable.DrawableWrapper
    public final boolean getPadding(Rect rect) {
        return false;
    }
}
