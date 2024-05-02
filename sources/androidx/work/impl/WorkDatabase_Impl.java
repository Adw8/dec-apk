package androidx.work.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public static final /* synthetic */ int v = 0;
    public volatile CV R;

    /* renamed from: R  reason: collision with other field name */
    public volatile ndl f1453R;

    /* renamed from: R  reason: collision with other field name */
    public volatile piu f1454R;

    /* renamed from: R  reason: collision with other field name */
    public volatile ptn f1455R;
    public volatile ndl c;
    public volatile ndl e;

    /* renamed from: v  reason: collision with other field name */
    public volatile ndl f1456v;

    @Override // androidx.work.impl.WorkDatabase
    public final piu C() {
        piu piu;
        if (this.f1454R != null) {
            return this.f1454R;
        }
        synchronized (this) {
            if (this.f1454R == null) {
                this.f1454R = new piu(this);
            }
            piu = this.f1454R;
        }
        return piu;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final CV H() {
        CV cv;
        if (this.R != null) {
            return this.R;
        }
        synchronized (this) {
            if (this.R == null) {
                this.R = new CV(this);
            }
            cv = this.R;
        }
        return cv;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ptn N() {
        ptn ptn;
        if (this.f1455R != null) {
            return this.f1455R;
        }
        synchronized (this) {
            if (this.f1455R == null) {
                this.f1455R = new ptn(this);
            }
            ptn = this.f1455R;
        }
        return ptn;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ndl P() {
        ndl ndl;
        if (this.f1456v != null) {
            return this.f1456v;
        }
        synchronized (this) {
            if (this.f1456v == null) {
                this.f1456v = new ndl(this, 3);
            }
            ndl = this.f1456v;
        }
        return ndl;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ndl U() {
        ndl ndl;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new ndl(this, 2);
            }
            ndl = this.c;
        }
        return ndl;
    }

    @Override // defpackage.msD
    public final fIY X(aDq adq) {
        Dn dn = new Dn(adq, new c85(this));
        Context context = adq.R;
        String str = adq.f804R;
        if (context != null) {
            return adq.f802R.v(new bOp(context, str, dn, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // defpackage.msD
    public final bBO e() {
        return new bBO(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ndl m() {
        ndl ndl;
        if (this.f1453R != null) {
            return this.f1453R;
        }
        synchronized (this) {
            if (this.f1453R == null) {
                this.f1453R = new ndl(this, 0);
            }
            ndl = this.f1453R;
        }
        return ndl;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ndl x() {
        ndl ndl;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new ndl(this, 1);
            }
            ndl = this.e;
        }
        return ndl;
    }
}
