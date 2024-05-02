package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: ngM  reason: default package */
/* loaded from: classes.dex */
public final class ngM extends hYA {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public HashSet f6503R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jr_ f6505R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f6507R;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f6504R = new LinkedHashSet();

    /* renamed from: R  reason: collision with other field name */
    public final oST f6506R = l6.n(e76.R);

    public ngM(jr_ jr_, int i, boolean z) {
        this.f6505R = jr_;
        this.R = i;
        this.f6507R = z;
    }

    @Override // defpackage.hYA
    public final void C(m88 m88) {
        HashSet hashSet = this.f6503R;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(((jr_) m88).f5066R);
            }
        }
        LinkedHashSet linkedHashSet = this.f6504R;
        gvP.X(linkedHashSet);
        linkedHashSet.remove(m88);
    }

    @Override // defpackage.hYA
    public final void H(jr_ jr_) {
        this.f6504R.add(jr_);
    }

    @Override // defpackage.hYA
    public final void L(fzE fze) {
        jr_ jr_ = this.f6505R;
        jr_.f5057R.L(jr_.f5055R);
        this.f6505R.f5057R.L(fze);
    }

    @Override // defpackage.hYA
    public final void N(fzE fze) {
        this.f6505R.f5057R.N(fze);
    }

    @Override // defpackage.hYA
    public final nbD O() {
        return this.f6505R.f5057R.O();
    }

    public final void P() {
        if (!this.f6504R.isEmpty()) {
            HashSet hashSet = this.f6503R;
            if (hashSet != null) {
                for (jr_ jr_ : this.f6504R) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(jr_.f5066R);
                    }
                }
            }
            this.f6504R.clear();
        }
    }

    @Override // defpackage.hYA
    public final void R(fzE fze, dNH dnh) {
        this.f6505R.f5057R.R(fze, dnh);
    }

    @Override // defpackage.hYA
    public final void U() {
        this.f6505R.e++;
    }

    @Override // defpackage.hYA
    public final int X() {
        return this.R;
    }

    @Override // defpackage.hYA
    public final void Z(p4d p4d, mBo mbo) {
        this.f6505R.f5057R.Z(p4d, mbo);
    }

    @Override // defpackage.hYA
    public final boolean c() {
        return this.f6507R;
    }

    @Override // defpackage.hYA
    public final g2d e() {
        return (g2d) this.f6506R.getValue();
    }

    @Override // defpackage.hYA
    public final mBo m(p4d p4d) {
        return this.f6505R.f5057R.m(p4d);
    }

    @Override // defpackage.hYA
    public final void v() {
        jr_ jr_ = this.f6505R;
        jr_.e--;
    }

    @Override // defpackage.hYA
    public final void x(Set set) {
        HashSet hashSet = this.f6503R;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f6503R = hashSet;
        }
        hashSet.add(set);
    }
}
