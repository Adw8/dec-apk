package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: e4a  reason: default package */
/* loaded from: classes.dex */
public final class e4a extends h6 {
    public final HashSet R = new HashSet();

    /* renamed from: R  reason: collision with other field name */
    public final Iterator f2968R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f2969R;

    public e4a(Iterator it, kg9 kg9) {
        this.f2968R = it;
        this.f2969R = kg9;
    }

    @Override // defpackage.h6
    public final void R() {
        while (this.f2968R.hasNext()) {
            Object next = this.f2968R.next();
            if (this.R.add(this.f2969R.x(next))) {
                ((h6) this).R = next;
                this.e = 1;
                return;
            }
        }
        this.e = 3;
    }
}
