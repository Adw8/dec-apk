package defpackage;

import android.content.Context;
import android.content.res.Resources;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: ga_  reason: default package */
/* loaded from: classes.dex */
public final class ga_ extends k8G implements kg9 {
    public static final ga_ R = new ga_();

    public ga_() {
        super(1);
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        Context context = (Context) obj;
        TC tc = new TC(context, null);
        tc.setTextSize(2, 18.0f);
        Resources resources = context.getResources();
        ThreadLocal threadLocal = cu3.f2452R;
        tc.setLetterSpacing(eSl.R(resources, R.dimen.font_inter_spacing_18));
        return tc;
    }
}
