package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: kB3  reason: default package */
/* loaded from: classes.dex */
public final class kB3 implements Drawable.Callback {
    public Object R;
    public final /* synthetic */ int e = 1;

    public kB3(EH eh) {
        this.R = eh;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.e) {
            case 0:
                return;
            default:
                ((EH) this.R).invalidateSelf();
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.e) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.R;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
            default:
                ((EH) this.R).scheduleSelf(runnable, j);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.e) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.R;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            default:
                ((EH) this.R).unscheduleSelf(runnable);
                return;
        }
    }
}
