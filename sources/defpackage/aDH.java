package defpackage;

import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: aDH  reason: default package */
/* loaded from: classes.dex */
public final class aDH {
    public static final aDH R = new aDH();

    public final void R(AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
