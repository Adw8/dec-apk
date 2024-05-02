package defpackage;

import android.content.Context;

/* renamed from: mSI  reason: default package */
/* loaded from: classes.dex */
public abstract class mSI implements lXY {
    public static Context R(cr crVar) {
        Context context = crVar.R;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
