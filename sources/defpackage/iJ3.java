package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: iJ3  reason: default package */
/* loaded from: classes.dex */
public final class iJ3 extends t {
    public Hashtable R = new Hashtable();

    /* renamed from: R  reason: collision with other field name */
    public Vector f4535R = new Vector();

    public iJ3(q qVar) {
        Enumeration d = qVar.d();
        while (d.hasMoreElements()) {
            Object nextElement = d.nextElement();
            u uVar = ajt.v;
            ajt ajt = nextElement instanceof ajt ? (ajt) nextElement : nextElement != null ? new ajt(q.A(nextElement)) : null;
            if (!this.R.containsKey(ajt.f994R)) {
                this.R.put(ajt.f994R, ajt);
                this.f4535R.addElement(ajt.f994R);
            } else {
                StringBuilder U = opT.U("repeated extension found: ");
                U.append(ajt.f994R);
                throw new IllegalArgumentException(U.toString());
            }
        }
    }

    @Override // defpackage.t, defpackage.b
    public final O v() {
        W w = new W(this.f4535R.size());
        Enumeration elements = this.f4535R.elements();
        while (elements.hasMoreElements()) {
            w.R((ajt) this.R.get((u) elements.nextElement()));
        }
        return new iuV(w);
    }

    public iJ3(ajt[] ajtArr) {
        for (int i = 0; i != ajtArr.length; i++) {
            ajt ajt = ajtArr[i];
            this.f4535R.addElement(ajt.f994R);
            this.R.put(ajt.f994R, ajt);
        }
    }
}
