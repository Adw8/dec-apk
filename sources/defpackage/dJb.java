package defpackage;

/* renamed from: dJb  reason: default package */
/* loaded from: classes.dex */
public final class dJb {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public iMP f2559R;

    /* renamed from: R  reason: collision with other field name */
    public pm2 f2560R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2561R;
    public int X;
    public int c;
    public int e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public iMP f2562v;

    public dJb() {
    }

    public dJb(int i, pm2 pm2) {
        this.R = i;
        this.f2560R = pm2;
        this.f2561R = false;
        iMP imp = iMP.RESUMED;
        this.f2559R = imp;
        this.f2562v = imp;
    }

    public dJb(int i, pm2 pm2, int i2) {
        this.R = i;
        this.f2560R = pm2;
        this.f2561R = true;
        iMP imp = iMP.RESUMED;
        this.f2559R = imp;
        this.f2562v = imp;
    }

    public dJb(dJb djb) {
        this.R = djb.R;
        this.f2560R = djb.f2560R;
        this.f2561R = djb.f2561R;
        this.v = djb.v;
        this.c = djb.c;
        this.e = djb.e;
        this.X = djb.X;
        this.f2559R = djb.f2559R;
        this.f2562v = djb.f2562v;
    }
}
