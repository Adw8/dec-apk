package defpackage;

import android.util.Property;
import android.view.ViewGroup;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: Kq  reason: default package */
/* loaded from: classes.dex */
public final class Kq extends Property {
    public static final Kq R = new Kq();

    public Kq() {
        super(Float.class, "childrenAlpha");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
