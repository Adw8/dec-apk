package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* renamed from: d72  reason: default package */
/* loaded from: classes.dex */
public abstract class d72 {
    public static final String R = kfk.P("ConstraintTracker");

    /* renamed from: R  reason: collision with other field name */
    public final CV f2491R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f2492R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f2493R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f2494R = new LinkedHashSet();
    public Object v;

    public d72(Context context, CV cv) {
        this.f2492R = context.getApplicationContext();
        this.f2491R = cv;
    }

    public abstract Object R();

    public abstract void c();

    public abstract void e();

    public final void v(Object obj) {
        synchronized (this.f2493R) {
            Object obj2 = this.v;
            if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                this.v = obj;
                ((Executor) this.f2491R.c).execute(new bx(this, 7, new ArrayList(this.f2494R)));
            }
        }
    }
}
