package defpackage;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: oHI  reason: default package */
/* loaded from: classes.dex */
public final class oHI implements MenuItem.OnMenuItemClickListener {
    public static final Class[] R = {MenuItem.class};

    /* renamed from: R  reason: collision with other field name */
    public Object f6721R;

    /* renamed from: R  reason: collision with other field name */
    public Method f6722R;

    public oHI(Object obj, String str) {
        this.f6721R = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f6722R = cls.getMethod(str, R);
        } catch (Exception e) {
            StringBuilder i = jQ.i("Couldn't resolve menu item onClick handler ", str, " in class ");
            i.append(cls.getName());
            InflateException inflateException = new InflateException(i.toString());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.f6722R.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.f6722R.invoke(this.f6721R, menuItem)).booleanValue();
            }
            this.f6722R.invoke(this.f6721R, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
