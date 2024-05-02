package defpackage;

import java.util.ListIterator;

/* renamed from: dH  reason: default package */
/* loaded from: classes.dex */
public final class dH extends k8G implements f_c {
    public final /* synthetic */ h5L R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dH(h5L h5l, int i) {
        super(0);
        this.X = i;
        this.R = h5l;
    }

    @Override // defpackage.f_c
    public final Object g() {
        switch (this.X) {
            case 0:
                Object v = this.R.v();
                aMr amr = aMr.Visible;
                return Boolean.valueOf(v == amr || this.R.e() == amr);
            default:
                ListIterator listIterator = this.R.f4044R.listIterator();
                long j = 0;
                while (true) {
                    aJE aje = (aJE) listIterator;
                    if (aje.hasNext()) {
                        j = Math.max(j, ((c0y) aje.next()).v().R);
                    } else {
                        ListIterator listIterator2 = this.R.v.listIterator();
                        while (true) {
                            aJE aje2 = (aJE) listIterator2;
                            if (!aje2.hasNext()) {
                                return Long.valueOf(j);
                            }
                            j = Math.max(j, ((Number) ((h5L) aje2.next()).f4043R.getValue()).longValue());
                        }
                    }
                }
        }
    }
}
