package defpackage;

/* renamed from: kob  reason: default package */
/* loaded from: classes.dex */
public final class kob implements bWV {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final String f5433R;

    /* renamed from: R  reason: collision with other field name */
    public final qN f5434R;

    /* renamed from: R  reason: collision with other field name */
    public final Object[] f5435R;

    public kob(csA csa, String str, Object[] objArr) {
        this.f5434R = csa;
        this.f5433R = str;
        this.f5435R = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.R = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            i2++;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
            } else {
                this.R = i | (charAt2 << i3);
                return;
            }
        }
    }

    public final qN R() {
        return this.f5434R;
    }

    public final String c() {
        return this.f5433R;
    }

    public final int e() {
        return (this.R & 1) == 1 ? 1 : 2;
    }

    public final Object[] v() {
        return this.f5435R;
    }
}
