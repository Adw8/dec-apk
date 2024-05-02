package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: BS  reason: default package */
/* loaded from: classes.dex */
public final class BS {
    public final Jd L;
    public final Jd O;
    public final Jd R;

    /* renamed from: R  reason: collision with other field name */
    public final Paint f21R;
    public final Jd X;
    public final Jd c;
    public final Jd e;
    public final Jd v;

    public BS(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(hDC.r(R.attr.materialCalendarStyle, context, hSy.class.getCanonicalName()).data, hDC.o);
        this.R = Jd.v(context, obtainStyledAttributes.getResourceId(3, 0));
        this.L = Jd.v(context, obtainStyledAttributes.getResourceId(1, 0));
        this.v = Jd.v(context, obtainStyledAttributes.getResourceId(2, 0));
        this.c = Jd.v(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList m = lTs.m(context, obtainStyledAttributes, 6);
        this.e = Jd.v(context, obtainStyledAttributes.getResourceId(8, 0));
        this.X = Jd.v(context, obtainStyledAttributes.getResourceId(7, 0));
        this.O = Jd.v(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f21R = paint;
        paint.setColor(m.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
