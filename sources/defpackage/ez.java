package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: ez  reason: default package */
/* loaded from: classes.dex */
public final class ez extends Property {
    public Rect R = new Rect();

    public ez(Class cls) {
        super(cls, "boundsOrigin");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.R);
        Rect rect = this.R;
        return new PointF((float) rect.left, (float) rect.top);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        drawable.copyBounds(this.R);
        this.R.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.R);
    }
}
