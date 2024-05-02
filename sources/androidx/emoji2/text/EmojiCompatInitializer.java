package androidx.emoji2.text;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements pme {
    @Override // defpackage.pme
    public final List R() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public final Boolean v(Context context) {
        Object obj;
        hYY hyy = new hYY(context);
        if (dfg.R == null) {
            synchronized (dfg.f2803R) {
                if (dfg.R == null) {
                    dfg.R = new dfg(hyy);
                }
            }
        }
        hU c = hU.c(context);
        c.getClass();
        synchronized (hU.f4273R) {
            try {
                obj = c.f4275R.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c.v(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final m4i O = ((nu_) obj).O();
        O.R(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(nu_ nu_) {
                EmojiCompatInitializer.this.getClass();
                eiY.R(Looper.getMainLooper()).postDelayed(new cbB(), 500);
                O.v(this);
            }
        });
        return Boolean.TRUE;
    }
}
