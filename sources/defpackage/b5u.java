package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: b5u  reason: default package */
/* loaded from: classes.dex */
public final class b5u extends kpt {
    public final kpt R;
    public final boolean c;
    public final boolean e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b5u(defpackage.kpt r3, defpackage.kg9 r4, defpackage.kg9 r5, boolean r6, boolean r7) {
        /*
            r2 = this;
            nQA r0 = defpackage.nQA.R
            nQA r0 = defpackage.nQA.R
            if (r3 == 0) goto L_0x000a
            kg9 r1 = r3.f5441R
            if (r1 != 0) goto L_0x0014
        L_0x000a:
            java.util.concurrent.atomic.AtomicReference r1 = defpackage.jwU.f5152R
            java.lang.Object r1 = r1.get()
            n3s r1 = (defpackage.n3s) r1
            kg9 r1 = r1.f5441R
        L_0x0014:
            kg9 r4 = defpackage.jwU.Z(r4, r1, r6)
            if (r3 == 0) goto L_0x001e
            kg9 r1 = r3.v
            if (r1 != 0) goto L_0x0028
        L_0x001e:
            java.util.concurrent.atomic.AtomicReference r1 = defpackage.jwU.f5152R
            java.lang.Object r1 = r1.get()
            n3s r1 = (defpackage.n3s) r1
            kg9 r1 = r1.v
        L_0x0028:
            kg9 r5 = defpackage.jwU.R(r5, r1)
            r1 = 0
            r2.<init>(r1, r0, r4, r5)
            r2.R = r3
            r2.c = r6
            r2.e = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5u.<init>(kpt, kg9, kg9, boolean, boolean):void");
    }

    @Override // defpackage.kpt, defpackage.dR6
    public final void C(nmZ nmz) {
        I().C(nmz);
    }

    @Override // defpackage.kpt, defpackage.dR6
    public final void H() {
        fk4.R();
        throw null;
    }

    public final kpt I() {
        kpt kpt = this.R;
        return kpt == null ? (kpt) jwU.f5152R.get() : kpt;
    }

    @Override // defpackage.kpt
    public final void J(HashSet hashSet) {
        fk4.R();
        throw null;
    }

    @Override // defpackage.kpt, defpackage.dR6
    public final boolean L() {
        return I().L();
    }

    @Override // defpackage.kpt, defpackage.dR6
    public final void U() {
        I().U();
    }

    @Override // defpackage.kpt
    public final Set V() {
        return I().V();
    }

    @Override // defpackage.dR6
    public final nQA X() {
        return I().X();
    }

    @Override // defpackage.kpt
    public final kpt Y(kg9 kg9, kg9 kg92) {
        kg9 Z = jwU.Z(kg9, ((kpt) this).f5441R, true);
        kg9 R = jwU.R(kg92, ((kpt) this).v);
        return !this.c ? new b5u(I().Y(null, R), Z, R, false, true) : I().Y(Z, R);
    }

    @Override // defpackage.kpt, defpackage.dR6
    public final void c() {
        kpt kpt;
        ((dR6) this).f2607R = true;
        if (this.e && (kpt = this.R) != null) {
            kpt.c();
        }
    }

    @Override // defpackage.dR6
    public final int e() {
        return I().e();
    }

    @Override // defpackage.dR6
    public final void g(nQA nqa) {
        fk4.R();
        throw null;
    }

    @Override // defpackage.kpt
    public final aJV i() {
        return I().i();
    }

    @Override // defpackage.dR6
    public final void j(int i) {
        fk4.R();
        throw null;
    }

    @Override // defpackage.kpt, defpackage.dR6
    public final void x() {
        fk4.R();
        throw null;
    }

    @Override // defpackage.kpt, defpackage.dR6
    public final dR6 y(kg9 kg9) {
        kg9 Z = jwU.Z(kg9, ((kpt) this).f5441R, true);
        return !this.c ? jwU.X(I().y(null), Z, true) : I().y(Z);
    }
}
