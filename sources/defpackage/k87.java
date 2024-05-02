package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: k87  reason: default package */
/* loaded from: classes.dex */
public abstract class k87 {
    public final AtomicBoolean R = new AtomicBoolean(false);

    /* renamed from: R  reason: collision with other field name */
    public volatile mVu f5201R;

    /* renamed from: R  reason: collision with other field name */
    public final msD f5202R;

    public k87(msD msd) {
        this.f5202R = msd;
    }

    public final mVu R() {
        this.f5202R.R();
        if (this.R.compareAndSet(false, true)) {
            if (this.f5201R == null) {
                String v = v();
                msD msd = this.f5202R;
                msd.R();
                msd.v();
                this.f5201R = new mVu(((iUj) msd.f6207R.L()).f4620R.compileStatement(v));
            }
            return this.f5201R;
        }
        String v2 = v();
        msD msd2 = this.f5202R;
        msd2.R();
        msd2.v();
        return new mVu(((iUj) msd2.f6207R.L()).f4620R.compileStatement(v2));
    }

    public final void c(mVu mvu) {
        if (mvu == this.f5201R) {
            this.R.set(false);
        }
    }

    public abstract String v();
}
