package defpackage;

import java.util.ArrayList;

/* renamed from: lGG  reason: default package */
/* loaded from: classes.dex */
public abstract class lGG extends kwo implements haS {
    public kwo[] c = new kwo[4];
    public int u = 0;

    public final void p(int i, fHP fhp, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.u; i2++) {
            fhp.R(this.c[i2]);
        }
        for (int i3 = 0; i3 < this.u; i3++) {
            gQc.h(this.c[i3], i, arrayList, fhp);
        }
    }
}
