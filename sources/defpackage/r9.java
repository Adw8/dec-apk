package defpackage;

import android.graphics.Canvas;

/* renamed from: r9  reason: default package */
/* loaded from: classes.dex */
public final class r9 {
    public static final r9 R = new r9();

    public final void R(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
