package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: n1w  reason: default package */
/* loaded from: classes.dex */
public final class n1w implements kDd, cof {
    public final Context R;

    public /* synthetic */ n1w(Context context, int i) {
        this.R = context;
    }

    @Override // defpackage.kDd
    public final void R(cUF cuf) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new fz0("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new c9G(this, cuf, threadPoolExecutor, 0));
    }

    @Override // defpackage.cof
    public final fIY v(bOp bop) {
        Context context = this.R;
        String str = bop.f1619R;
        Dn dn = bop.R;
        if (dn == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        } else if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        } else if (!TextUtils.isEmpty(str)) {
            return new fvO(context, str, dn, true);
        } else {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
    }

    public /* synthetic */ n1w(Context context) {
        this.R = context.getApplicationContext();
    }
}
