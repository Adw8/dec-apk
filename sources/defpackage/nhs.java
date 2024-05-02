package defpackage;

import android.widget.EditText;

/* renamed from: nhs  reason: default package */
/* loaded from: classes.dex */
public final class nhs {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public Object f6515R;
    public int v;

    public nhs(int i) {
        if (i != 2) {
            this.f6515R = new Object[16];
            return;
        }
        this.f6515R = new nhs[256];
        this.R = 0;
        this.v = 0;
    }

    public nhs(EditText editText) {
        this.R = Integer.MAX_VALUE;
        this.v = 0;
        if (editText != null) {
            this.f6515R = new b4N(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }

    public /* synthetic */ nhs(int i, int i2) {
        this.f6515R = null;
        this.R = i;
        int i3 = i2 & 7;
        this.v = i3 == 0 ? 8 : i3;
    }
}
