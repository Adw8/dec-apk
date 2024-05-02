package defpackage;

import java.util.Iterator;

/* renamed from: gUH  reason: default package */
/* loaded from: classes.dex */
public class gUH extends pgw {
    public int X;

    public gUH(ora ora) {
        super(ora);
        if (ora instanceof nLB) {
            ((pgw) this).R = 2;
        } else {
            ((pgw) this).R = 3;
        }
    }

    @Override // defpackage.pgw
    public final void e(int i) {
        if (!((pgw) this).f7167c) {
            ((pgw) this).f7167c = true;
            ((pgw) this).c = i;
            Iterator it = ((pgw) this).f7164R.iterator();
            while (it.hasNext()) {
                ccT cct = (ccT) it.next();
                cct.R(cct);
            }
        }
    }
}
