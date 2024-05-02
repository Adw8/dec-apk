package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: jKh  reason: default package */
/* loaded from: classes.dex */
public final class jKh extends FrameLayout implements _z {
    public final CollapsibleActionView R;

    public jKh(View view) {
        super(view.getContext());
        this.R = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage._z
    public final void onActionViewCollapsed() {
        this.R.onActionViewCollapsed();
    }

    @Override // defpackage._z
    public final void onActionViewExpanded() {
        this.R.onActionViewExpanded();
    }
}
