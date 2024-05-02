package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: j7  reason: default package */
/* loaded from: classes.dex */
public abstract class j7 {
    public static final L5 R = new L5();

    /* renamed from: R  reason: collision with other field name */
    public static final Object f4835R = new Object();

    public static void L(j7 j7Var) {
        synchronized (f4835R) {
            Iterator it = R.iterator();
            while (it.hasNext()) {
                j7 j7Var2 = (j7) ((WeakReference) it.next()).get();
                if (j7Var2 == j7Var || j7Var2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void H(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void O();

    public abstract void U(CharSequence charSequence);

    public abstract void X();

    public abstract boolean Z(int i);

    public abstract void e();

    public abstract void m(int i);

    public abstract void v(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void x(View view);
}
