package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: e1q  reason: default package */
/* loaded from: classes.dex */
public abstract class e1q extends UW {
    public SharedPreferences R;

    /* renamed from: R  reason: collision with other field name */
    public mkC f2941R;
    public int m;
    public boolean v = true;

    /* renamed from: R  reason: collision with other field name */
    public AtomicBoolean f2940R = new AtomicBoolean(false);

    public e1q(String str) {
        super(str);
    }

    public void R() {
    }

    public CharSequence c(Context context) {
        CharSequence charSequence;
        boolean z = this.v;
        if (!z && this.O != -1) {
            return context.getResources().getText(this.O);
        }
        if (!z && (charSequence = this.c) != null) {
            return charSequence;
        }
        if (this.X != -1) {
            return context.getResources().getText(this.X);
        }
        CharSequence charSequence2 = super.v;
        if (charSequence2 != null) {
            return charSequence2;
        }
        return null;
    }

    public void v(kS8 ks8) {
    }
}
