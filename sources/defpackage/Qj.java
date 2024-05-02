package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import dev.kdrag0n.virtcontainer.R;
import java.lang.reflect.Constructor;

/* renamed from: Qj  reason: default package */
/* loaded from: classes.dex */
public class Qj {

    /* renamed from: R  reason: collision with other field name */
    public final Object[] f471R = new Object[2];

    /* renamed from: R  reason: collision with other field name */
    public static final Class[] f469R = {Context.class, AttributeSet.class};

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f468R = {16843375};

    /* renamed from: R  reason: collision with other field name */
    public static final String[] f470R = {"android.widget.", "android.view.", "android.webkit."};
    public static final cE0 R = new cE0();

    public final void L(TextView textView, String str) {
        if (textView == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    public final View O(Context context, String str, String str2) {
        String str3;
        cE0 ce0 = R;
        Constructor constructor = (Constructor) ce0.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f469R);
            ce0.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f471R);
    }

    public yp R(Context context, AttributeSet attributeSet) {
        return new yp(context, attributeSet);
    }

    public TC X(Context context, AttributeSet attributeSet) {
        return new TC(context, attributeSet);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public ri e(Context context, AttributeSet attributeSet) {
        return new ri(context, attributeSet);
    }

    public GV v(Context context, AttributeSet attributeSet) {
        return new GV(context, attributeSet, R.attr.buttonStyle);
    }
}
