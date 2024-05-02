package defpackage;

import android.graphics.Matrix;
import android.graphics.RenderNode;

/* renamed from: nGN  reason: default package */
/* loaded from: classes.dex */
public final class nGN implements b7F {
    public final RenderNode R = new RenderNode("Compose");

    public final boolean R() {
        return this.R.getClipToOutline();
    }

    public final boolean c() {
        return this.R.setHasOverlappingRendering(true);
    }

    public final void v(Matrix matrix) {
        this.R.getMatrix(matrix);
    }
}
