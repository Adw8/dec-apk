package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: pgw  reason: default package */
/* loaded from: classes.dex */
public class pgw implements ccT {
    public int c;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public ora f7169v;

    /* renamed from: R  reason: collision with other field name */
    public ora f7165R = null;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7166R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f7170v = false;
    public int R = 1;
    public int e = 1;

    /* renamed from: R  reason: collision with other field name */
    public gUH f7163R = null;

    /* renamed from: c  reason: collision with other field name */
    public boolean f7167c = false;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f7164R = new ArrayList();

    /* renamed from: v  reason: collision with other field name */
    public ArrayList f7168v = new ArrayList();

    public pgw(ora ora) {
        this.f7169v = ora;
    }

    @Override // defpackage.ccT
    public final void R(ccT cct) {
        Iterator it = this.f7168v.iterator();
        while (it.hasNext()) {
            if (!((pgw) it.next()).f7167c) {
                return;
            }
        }
        this.f7170v = true;
        ora ora = this.f7165R;
        if (ora != null) {
            ora.R(this);
        }
        if (this.f7166R) {
            this.f7169v.R(this);
            return;
        }
        pgw pgw = null;
        int i = 0;
        Iterator it2 = this.f7168v.iterator();
        while (it2.hasNext()) {
            pgw pgw2 = (pgw) it2.next();
            if (!(pgw2 instanceof gUH)) {
                i++;
                pgw = pgw2;
            }
        }
        if (pgw != null && i == 1 && pgw.f7167c) {
            gUH guh = this.f7163R;
            if (guh != null) {
                if (((pgw) guh).f7167c) {
                    this.v = this.e * ((pgw) guh).c;
                } else {
                    return;
                }
            }
            e(pgw.c + this.v);
        }
        ora ora2 = this.f7165R;
        if (ora2 != null) {
            ora2.R(this);
        }
    }

    public final void c() {
        this.f7168v.clear();
        this.f7164R.clear();
        this.f7167c = false;
        this.c = 0;
        this.f7170v = false;
        this.f7166R = false;
    }

    public void e(int i) {
        if (!this.f7167c) {
            this.f7167c = true;
            this.c = i;
            Iterator it = this.f7164R.iterator();
            while (it.hasNext()) {
                ccT cct = (ccT) it.next();
                cct.R(cct);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7169v.f6978R.f5517v);
        sb.append(":");
        sb.append(jQ.z(this.R));
        sb.append("(");
        sb.append(this.f7167c ? Integer.valueOf(this.c) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f7168v.size());
        sb.append(":d=");
        sb.append(this.f7164R.size());
        sb.append(">");
        return sb.toString();
    }

    public final void v(ccT cct) {
        this.f7164R.add(cct);
        if (this.f7167c) {
            cct.R(cct);
        }
    }
}
