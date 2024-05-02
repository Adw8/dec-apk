package defpackage;

/* renamed from: kcd  reason: default package */
/* loaded from: classes.dex */
public abstract class kcd extends njT {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public String f5368R;

    /* renamed from: R  reason: collision with other field name */
    public k6t[] f5369R;
    public int v;

    public kcd() {
        this.f5369R = null;
        this.R = 0;
    }

    public k6t[] getPathData() {
        return this.f5369R;
    }

    public String getPathName() {
        return this.f5368R;
    }

    public void setPathData(k6t[] k6tArr) {
        if (!gvP.m(this.f5369R, k6tArr)) {
            this.f5369R = gvP.t(k6tArr);
            return;
        }
        k6t[] k6tArr2 = this.f5369R;
        for (int i = 0; i < k6tArr.length; i++) {
            k6tArr2[i].R = k6tArr[i].R;
            int i2 = 0;
            while (true) {
                float[] fArr = k6tArr[i].f5199R;
                if (i2 < fArr.length) {
                    k6tArr2[i].f5199R[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public kcd(kcd kcd) {
        this.f5369R = null;
        this.R = 0;
        this.f5368R = kcd.f5368R;
        this.v = kcd.v;
        this.f5369R = gvP.t(kcd.f5369R);
    }
}
