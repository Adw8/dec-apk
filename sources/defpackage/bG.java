package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: bG  reason: default package */
/* loaded from: classes.dex */
public final class bG extends ora {
    public ArrayList R = new ArrayList();
    public int X;

    public bG(int i, kwo kwo) {
        super(kwo);
        this.c = i;
        kwo kwo2 = ((ora) this).f6978R;
        kwo H = kwo2.H(i);
        while (H != null) {
            H = H.H(this.c);
            kwo2 = H;
        }
        ((ora) this).f6978R = kwo2;
        ArrayList arrayList = this.R;
        int i2 = this.c;
        arrayList.add(i2 == 0 ? kwo2.f5496R : i2 == 1 ? kwo2.f5490R : null);
        kwo x = kwo2.x(this.c);
        while (x != null) {
            ArrayList arrayList2 = this.R;
            int i3 = this.c;
            arrayList2.add(i3 == 0 ? x.f5496R : i3 == 1 ? x.f5490R : null);
            x = x.x(this.c);
        }
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            ora ora = (ora) it.next();
            int i4 = this.c;
            if (i4 == 0) {
                ora.f6978R.f5489R = this;
            } else if (i4 == 1) {
                ora.f6978R.f5515v = this;
            }
        }
        if ((this.c == 0 && ((m_b) ((ora) this).f6978R.f5495R).Z) && this.R.size() > 1) {
            ArrayList arrayList3 = this.R;
            ((ora) this).f6978R = ((ora) arrayList3.get(arrayList3.size() - 1)).f6978R;
        }
        this.X = this.c == 0 ? ((ora) this).f6978R.J : ((ora) this).f6978R.Y;
    }

    public final kwo C() {
        for (int i = 0; i < this.R.size(); i++) {
            kwo kwo = ((ora) this.R.get(i)).f6978R;
            if (kwo.K != 8) {
                return kwo;
            }
        }
        return null;
    }

    @Override // defpackage.ora
    public final boolean H() {
        int size = this.R.size();
        for (int i = 0; i < size; i++) {
            if (!((ora) this.R.get(i)).H()) {
                return false;
            }
        }
        return true;
    }

    public final kwo N() {
        for (int size = this.R.size() - 1; size >= 0; size--) {
            kwo kwo = ((ora) this.R.get(size)).f6978R;
            if (kwo.K != 8) {
                return kwo;
            }
        }
        return null;
    }

    @Override // defpackage.ora
    public final void O() {
        ((ora) this).f6976R = null;
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            ((ora) it.next()).O();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:266:0x03c6, code lost:
        r9 = r9 - r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d5  */
    @Override // defpackage.ora, defpackage.ccT
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(defpackage.ccT r26) {
        /*
        // Method dump skipped, instructions count: 1005
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bG.R(ccT):void");
    }

    @Override // defpackage.ora
    public final void X() {
        for (int i = 0; i < this.R.size(); i++) {
            ((ora) this.R.get(i)).X();
        }
    }

    @Override // defpackage.ora
    public final void e() {
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            ((ora) it.next()).e();
        }
        int size = this.R.size();
        if (size >= 1) {
            kwo kwo = ((ora) this.R.get(0)).f6978R;
            kwo kwo2 = ((ora) this.R.get(size - 1)).f6978R;
            if (this.c == 0) {
                iP5 ip5 = kwo.f5491R;
                iP5 ip52 = kwo2.f5508c;
                pgw m = ora.m(ip5, 0);
                int e = ip5.e();
                kwo C = C();
                if (C != null) {
                    e = C.f5491R.e();
                }
                if (m != null) {
                    ora.v(((ora) this).f6979R, m, e);
                }
                pgw m2 = ora.m(ip52, 0);
                int e2 = ip52.e();
                kwo N = N();
                if (N != null) {
                    e2 = N.f5508c.e();
                }
                if (m2 != null) {
                    ora.v(((ora) this).f6981v, m2, -e2);
                }
            } else {
                iP5 ip53 = kwo.f5516v;
                iP5 ip54 = kwo2.f5512e;
                pgw m3 = ora.m(ip53, 1);
                int e3 = ip53.e();
                kwo C2 = C();
                if (C2 != null) {
                    e3 = C2.f5516v.e();
                }
                if (m3 != null) {
                    ora.v(((ora) this).f6979R, m3, e3);
                }
                pgw m4 = ora.m(ip54, 1);
                int e4 = ip54.e();
                kwo N2 = N();
                if (N2 != null) {
                    e4 = N2.f5512e.e();
                }
                if (m4 != null) {
                    ora.v(((ora) this).f6981v, m4, -e4);
                }
            }
            ((ora) this).f6979R.f7165R = this;
            ((ora) this).f6981v.f7165R = this;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.c == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append((ora) it.next());
            sb.append("> ");
        }
        return sb.toString();
    }

    @Override // defpackage.ora
    public final long x() {
        int size = this.R.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            ora ora = (ora) this.R.get(i);
            j = ((long) ora.f6981v.v) + ora.x() + j + ((long) ora.f6979R.v);
        }
        return j;
    }
}
