package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* loaded from: classes.dex */
public final class GestureDetectorCompat {
    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        new gL6(context, onGestureListener, handler);
    }
}
