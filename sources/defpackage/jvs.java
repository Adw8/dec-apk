package defpackage;

/* renamed from: jvs  reason: default package */
/* loaded from: classes.dex */
public final class jvs extends t {
    public _L R;

    public jvs(_L _l) {
        this.R = _l;
    }

    public jvs(u uVar, O o) {
        W w = new W(2);
        w.R(uVar);
        w.R(o);
        this.R = new lme(new iuV(w));
    }

    public jvs(Bk[] bkArr) {
        this.R = new lme(bkArr);
    }

    public final Bk[] K() {
        Bk bk;
        int length = this.R.f696R.length;
        Bk[] bkArr = new Bk[length];
        for (int i = 0; i != length; i++) {
            b bVar = this.R.f696R[i];
            if (bVar instanceof Bk) {
                bk = (Bk) bVar;
            } else if (bVar != null) {
                bk = new Bk(q.A(bVar));
            } else {
                throw new IllegalArgumentException("null value in getInstance()");
            }
            bkArr[i] = bk;
        }
        return bkArr;
    }

    public final Bk o() {
        b[] bVarArr = this.R.f696R;
        if (bVarArr.length == 0) {
            return null;
        }
        b bVar = bVarArr[0];
        if (bVar instanceof Bk) {
            return (Bk) bVar;
        }
        if (bVar != null) {
            return new Bk(q.A(bVar));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    @Override // defpackage.t, defpackage.b
    public final O v() {
        return this.R;
    }
}
