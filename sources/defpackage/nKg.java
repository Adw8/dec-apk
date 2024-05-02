package defpackage;

import java.util.Map;

/* renamed from: nKg  reason: default package */
/* loaded from: classes.dex */
public final class nKg {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public final mMG f6363R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6364R = true;

    public nKg(oVq ovq, Object obj) {
        this.R = obj;
        e9_ e9_ = new e9_(ovq);
        owM owm = hcN.R;
        this.f6363R = new mMG((Map) ovq.f6837R.get(obj), e9_);
    }

    public final void R(Map map) {
        if (this.f6364R) {
            Map c = this.f6363R.c();
            if (c.isEmpty()) {
                map.remove(this.R);
            } else {
                map.put(this.R, c);
            }
        }
    }
}
