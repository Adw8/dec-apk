package defpackage;

/* renamed from: plU  reason: default package */
/* loaded from: classes.dex */
public abstract class plU extends C2 {
    public final nbD R;
    public transient aOO v;

    public plU(aOO aoo, nbD nbd) {
        super(aoo);
        this.R = nbd;
    }

    @Override // defpackage.C2
    public void L() {
        aOO aoo = this.v;
        if (!(aoo == null || aoo == this)) {
            nbD v = v();
            int i = mx9.R;
            mx9 mx9 = (mx9) v.O(hw1.c);
            ((na6) aoo).H();
        }
        this.v = iBw.R;
    }

    @Override // defpackage.aOO
    public nbD v() {
        return this.R;
    }

    public plU(aOO aoo) {
        this(aoo, aoo != null ? aoo.v() : null);
    }
}
