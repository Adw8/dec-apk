package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: UV  reason: default package */
/* loaded from: classes.dex */
public final class UV extends eGR {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f563R;
    public boolean c;
    public boolean e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f564v;

    public UV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UV(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public UV(UV uv) {
        super(uv);
        this.f563R = uv.f563R;
    }

    public UV() {
        super(-2);
        this.f563R = false;
    }
}
