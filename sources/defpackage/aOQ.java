package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* renamed from: aOQ  reason: default package */
/* loaded from: classes.dex */
public final class aOQ implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (layout != null && paint != null) {
            int lineForOffset = layout.getLineForOffset(i6);
            boolean z2 = true;
            if (lineForOffset == layout.getLineCount() - 1) {
                kSh ksh = dVA.R;
                if (layout.getEllipsisCount(lineForOffset) > 0) {
                    float u = gQc.u(layout, lineForOffset, paint) + gQc.I(layout, lineForOffset, paint);
                    if (u != 0.0f) {
                        z2 = false;
                    }
                    if (!z2) {
                        canvas.translate(u, 0.0f);
                    }
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
