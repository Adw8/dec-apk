package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: prF  reason: default package */
/* loaded from: classes.dex */
public final class prF implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = of5.f6887R;
        fv7.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
