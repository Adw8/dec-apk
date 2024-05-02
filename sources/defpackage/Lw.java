package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: Lw  reason: default package */
/* loaded from: classes.dex */
public abstract class Lw extends k49 {
    public static final tm R = new tm(2);

    /* renamed from: R  reason: collision with other field name */
    public final k49 f284R;

    public Lw(k49 k49) {
        this.f284R = k49;
    }

    public final AbstractCollection L(csz csz) {
        AbstractCollection abstractCollection;
        switch (((Nh) this).R) {
            case 0:
                abstractCollection = new ArrayList();
                break;
            default:
                abstractCollection = new LinkedHashSet();
                break;
        }
        csz.R();
        while (csz.H()) {
            abstractCollection.add(this.f284R.R(csz));
        }
        csz.X();
        return abstractCollection;
    }

    public final String toString() {
        return this.f284R + ".collection()";
    }
}
