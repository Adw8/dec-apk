package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: u8  reason: default package */
/* loaded from: classes.dex */
public final class u8 extends ViewOutlineProvider {
    public final /* synthetic */ Chip R;

    public u8(Chip chip) {
        this.R = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        OW ow = this.R.f2307R;
        if (ow != null) {
            ow.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
