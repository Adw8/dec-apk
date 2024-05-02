package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class d extends ContextWrapper {
    public LayoutInflater R;
    public LayoutInflater v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, pm2 pm2) {
        super(context);
        context.getClass();
        ViewComponentManager$FragmentContextWrapper$1 viewComponentManager$FragmentContextWrapper$1 = new ViewComponentManager$FragmentContextWrapper$1(this);
        this.R = null;
        pm2.getClass();
        pm2.f7242R.R(viewComponentManager$FragmentContextWrapper$1);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.v == null) {
            if (this.R == null) {
                this.R = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.v = this.R.cloneInContext(this);
        }
        return this.v;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.view.LayoutInflater r2, defpackage.pm2 r3) {
        /*
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r0.getClass()
            r1.<init>(r0)
            dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 r0 = new dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            r0.<init>(r1)
            r1.R = r2
            r3.getClass()
            m4i r1 = r3.f7242R
            r1.R(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.hilt.android.internal.managers.d.<init>(android.view.LayoutInflater, pm2):void");
    }
}
