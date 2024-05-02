package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: cH4  reason: default package */
/* loaded from: classes.dex */
public final class cH4 extends UW {
    public Context R;

    /* renamed from: R  reason: collision with other field name */
    public SharedPreferences f2053R;
    public String v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2056v;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f2054R = new ArrayList();

    /* renamed from: v  reason: collision with other field name */
    public final ArrayList f2055v = new ArrayList();

    public cH4(Context context) {
        super("root");
        String str;
        this.R = context;
        new HashMap();
        Context context2 = this.R;
        this.v = n3x.i("_preferences", (context2 == null || (str = context2.getPackageName()) == null) ? "package" : str);
        this.f2056v = true;
    }
}
