package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: ojP  reason: default package */
/* loaded from: classes.dex */
public abstract class ojP {
    public static final b8r R = new b8r();

    /* renamed from: R  reason: collision with other field name */
    public static final oE_ f6898R;

    static {
        oE_ oe_;
        try {
            oe_ = (oE_) f0t.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            oe_ = null;
        }
        f6898R = oe_;
    }

    public static void R(ArrayList arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }
}
