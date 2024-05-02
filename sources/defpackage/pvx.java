package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: pvx  reason: default package */
/* loaded from: classes.dex */
public abstract class pvx {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Class f7317R;
    public final int c;
    public final int v;

    public pvx(int i, Class cls, int i2, int i3) {
        this.R = i;
        this.f7317R = cls;
        this.c = i2;
        this.v = i3;
    }

    public static boolean R(Boolean bool, Boolean bool2) {
        return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
    }

    public final void c(View view, Object obj) {
        boolean R;
        if (Build.VERSION.SDK_INT >= this.v) {
            int i = ((g59) this).e;
            switch (i) {
                case 0:
                    Boolean bool = (Boolean) obj;
                    switch (i) {
                        case 0:
                            fKW.m(view, bool.booleanValue());
                            return;
                        default:
                            fKW.L(view, bool.booleanValue());
                            return;
                    }
                case 1:
                    CharSequence charSequence = (CharSequence) obj;
                    switch (i) {
                        case 1:
                            fKW.Z(view, charSequence);
                            return;
                        default:
                            jBM.v(view, charSequence);
                            return;
                    }
                case 2:
                    CharSequence charSequence2 = (CharSequence) obj;
                    switch (i) {
                        case 1:
                            fKW.Z(view, charSequence2);
                            return;
                        default:
                            jBM.v(view, charSequence2);
                            return;
                    }
                default:
                    Boolean bool2 = (Boolean) obj;
                    switch (i) {
                        case 0:
                            fKW.m(view, bool2.booleanValue());
                            return;
                        default:
                            fKW.L(view, bool2.booleanValue());
                            return;
                    }
            }
        } else {
            Object v = v(view);
            int i2 = ((g59) this).e;
            switch (i2) {
                case 0:
                    Boolean bool3 = (Boolean) v;
                    Boolean bool4 = (Boolean) obj;
                    switch (i2) {
                        case 0:
                            R = R(bool3, bool4);
                            break;
                        default:
                            R = R(bool3, bool4);
                            break;
                    }
                case 1:
                    CharSequence charSequence3 = (CharSequence) v;
                    CharSequence charSequence4 = (CharSequence) obj;
                    switch (i2) {
                        case 1:
                            R = TextUtils.equals(charSequence3, charSequence4);
                            break;
                        default:
                            R = TextUtils.equals(charSequence3, charSequence4);
                            break;
                    }
                case 2:
                    CharSequence charSequence5 = (CharSequence) v;
                    CharSequence charSequence6 = (CharSequence) obj;
                    switch (i2) {
                        case 1:
                            R = TextUtils.equals(charSequence5, charSequence6);
                            break;
                        default:
                            R = TextUtils.equals(charSequence5, charSequence6);
                            break;
                    }
                default:
                    Boolean bool5 = (Boolean) v;
                    Boolean bool6 = (Boolean) obj;
                    switch (i2) {
                        case 0:
                            R = R(bool5, bool6);
                            break;
                        default:
                            R = R(bool5, bool6);
                            break;
                    }
            }
            if (!R) {
                WeakHashMap weakHashMap = of5.f6887R;
                View.AccessibilityDelegate R2 = hpL.R(view);
                G5 g5 = R2 == null ? null : R2 instanceof ma ? ((ma) R2).R : new G5(R2);
                if (g5 == null) {
                    g5 = new G5();
                }
                of5.O(view, g5);
                view.setTag(this.R, obj);
                of5.c(view, this.c);
            }
        }
    }

    public final Object v(View view) {
        if (Build.VERSION.SDK_INT >= this.v) {
            g59 g59 = (g59) this;
            int i = g59.e;
            switch (i) {
                case 0:
                    return g59.e(view);
                case 1:
                    switch (i) {
                        case 1:
                            return fKW.v(view);
                        default:
                            return jBM.R(view);
                    }
                case 2:
                    switch (i) {
                        case 1:
                            return fKW.v(view);
                        default:
                            return jBM.R(view);
                    }
                default:
                    return g59.e(view);
            }
        } else {
            Object tag = view.getTag(this.R);
            if (this.f7317R.isInstance(tag)) {
                return tag;
            }
            return null;
        }
    }
}
