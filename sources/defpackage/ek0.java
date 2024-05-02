package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* renamed from: ek0  reason: default package */
/* loaded from: classes.dex */
public final class ek0 extends RippleDrawable {
    public Integer R;

    /* renamed from: R  reason: collision with other field name */
    public n3 f3188R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f3189R;
    public boolean v;

    public ek0(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.f3189R = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f3189R) {
            this.v = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.v = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.v;
    }
}
