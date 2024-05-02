package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* renamed from: hP9  reason: default package */
/* loaded from: classes.dex */
public final class hP9 {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f4226R;

    /* renamed from: R  reason: collision with other field name */
    public Collection f4227R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4228R;
    public Object v;

    public hP9(int i) {
        this.R = 1;
        this.f4228R = false;
        this.f4226R = pdD.J(fme.X);
        this.v = new gvk(1);
        this.f4227R = new mYQ((Comparator) this.v);
    }

    public final void R(fue fue) {
        if (fue.K()) {
            if (this.f4228R) {
                Integer num = (Integer) ((Map) ((cwX) this.f4226R).getValue()).get(fue);
                if (num == null) {
                    ((Map) ((cwX) this.f4226R).getValue()).put(fue, Integer.valueOf(fue.O));
                } else {
                    if (!(num.intValue() == fue.O)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            ((mYQ) this.f4227R).add(fue);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final String toString() {
        switch (this.R) {
            case 1:
                return ((mYQ) this.f4227R).toString();
            default:
                return super.toString();
        }
    }

    public final boolean v(fue fue) {
        if (fue.K()) {
            boolean remove = ((mYQ) this.f4227R).remove(fue);
            if (this.f4228R) {
                Integer num = (Integer) ((Map) ((cwX) this.f4226R).getValue()).remove(fue);
                boolean z = true;
                if (remove) {
                    int i = fue.O;
                    if (num == null || num.intValue() != i) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (num != null) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            return remove;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public hP9() {
        this.R = 0;
        this.f4226R = new Object();
        this.v = new ArrayList();
        this.f4227R = new ArrayList();
        this.f4228R = true;
    }
}
