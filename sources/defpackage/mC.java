package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: mC  reason: default package */
/* loaded from: classes.dex */
public final class mC extends Drawable {
    public final ActionBarContainer R;

    public mC(ActionBarContainer actionBarContainer) {
        this.R = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.R;
        if (actionBarContainer.f1050v) {
            Drawable drawable = actionBarContainer.c;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.R;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.R;
        Drawable drawable3 = actionBarContainer2.v;
        if (drawable3 != null && actionBarContainer2.f1048c) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.R;
        if (!actionBarContainer.f1050v) {
            Drawable drawable = actionBarContainer.R;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        } else if (actionBarContainer.c != null) {
            actionBarContainer.R.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
