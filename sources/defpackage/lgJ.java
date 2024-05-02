package defpackage;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* renamed from: lgJ  reason: default package */
/* loaded from: classes.dex */
public abstract class lgJ {
    public static final boolean R(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void v(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }
}
