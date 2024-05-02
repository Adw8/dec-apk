package defpackage;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* renamed from: lOo  reason: default package */
/* loaded from: classes.dex */
public final class lOo extends jbB {
    public final /* synthetic */ int R = 1;

    /* renamed from: R  reason: collision with other field name */
    public final WeakReference f5711R;

    public lOo(EditText editText) {
        this.f5711R = new WeakReference(editText);
    }

    @Override // defpackage.jbB
    public final void R() {
        switch (this.R) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f5711R.get();
                if (switchCompat != null) {
                    switchCompat.e();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.jbB
    public final void v() {
        switch (this.R) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f5711R.get();
                if (switchCompat != null) {
                    switchCompat.e();
                    return;
                }
                return;
            default:
                jM9.R((EditText) this.f5711R.get(), 1);
                return;
        }
    }

    public lOo(SwitchCompat switchCompat) {
        this.f5711R = new WeakReference(switchCompat);
    }
}
