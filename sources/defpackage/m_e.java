package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: m_e  reason: default package */
/* loaded from: classes.dex */
public final class m_e {

    /* renamed from: R  reason: collision with other field name */
    public final aME f6068R;

    /* renamed from: R  reason: collision with other field name */
    public final m5f f6070R;

    /* renamed from: R  reason: collision with other field name */
    public final ivW f6069R = g4x.O(fcD.R);
    public final B3 R = new B3(this);

    public m_e(aME ame, m5f m5f) {
        this.f6068R = ame;
        this.f6070R = m5f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005b A[LOOP:0: B:9:0x0055->B:11:0x005b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ihm R(defpackage.b1n r12, java.lang.String[] r13) {
        /*
        // Method dump skipped, instructions count: 251
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m_e.R(b1n, java.lang.String[]):ihm");
    }

    public final void c(String str, String str2) {
        Object obj;
        Iterator it = ((Iterable) this.f6069R.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (n3x.v(((ihm) obj).f4698R, str)) {
                break;
            }
        }
        ihm ihm = (ihm) obj;
        if (ihm != null) {
            ihm.c = str2;
        }
    }

    public final void v(String str) {
        ivW ivw = this.f6069R;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) ivw.getValue()) {
            if (!n3x.v(((ihm) obj).f4698R, str)) {
                arrayList.add(obj);
            }
        }
        ivw.H(arrayList);
    }
}
