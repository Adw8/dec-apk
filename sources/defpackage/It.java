package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: It  reason: default package */
/* loaded from: classes.dex */
public final class It extends ClickableSpan {
    public final jG R;
    public final int X;
    public final int e;

    public It(int i, jG jGVar, int i2) {
        this.e = i;
        this.R = jGVar;
        this.X = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.e);
        jG jGVar = this.R;
        jGVar.f4895R.performAction(this.X, bundle);
    }
}
