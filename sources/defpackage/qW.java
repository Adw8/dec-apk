package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: qW  reason: default package */
/* loaded from: classes.dex */
public final class qW implements View.OnClickListener {
    public Context R;

    /* renamed from: R  reason: collision with other field name */
    public final View f7357R;

    /* renamed from: R  reason: collision with other field name */
    public final String f7358R;

    /* renamed from: R  reason: collision with other field name */
    public Method f7359R;

    public qW(View view, String str) {
        this.f7357R = view;
        this.f7358R = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f7359R == null) {
            Context context = this.f7357R.getContext();
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f7358R, View.class)) != null) {
                        this.f7359R = method;
                        this.R = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f7357R.getId();
            if (id == -1) {
                str = "";
            } else {
                StringBuilder U = opT.U(" with id '");
                U.append(this.f7357R.getContext().getResources().getResourceEntryName(id));
                U.append("'");
                str = U.toString();
            }
            StringBuilder U2 = opT.U("Could not find method ");
            U2.append(this.f7358R);
            U2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            U2.append(this.f7357R.getClass());
            U2.append(str);
            throw new IllegalStateException(U2.toString());
        }
        try {
            this.f7359R.invoke(this.R, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
