package defpackage;

/* renamed from: btu  reason: default package */
/* loaded from: classes.dex */
public final class btu implements fDb {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final n3U f1845R;

    public btu(n3U n3u, long j) {
        this.f1845R = n3u;
        this.R = j;
    }

    @Override // defpackage.fDb
    public final long R(oOe ooe, long j, mdz mdz, long j2) {
        int ordinal = this.f1845R.ordinal();
        if (ordinal == 0) {
            int i = ooe.R;
            long j3 = this.R;
            int i2 = dU5.R;
            return cU5.v(i + ((int) (j3 >> 32)), dU5.v(j3) + ooe.v);
        } else if (ordinal == 1) {
            int i3 = ooe.R;
            long j4 = this.R;
            int i4 = dU5.R;
            return cU5.v((i3 + ((int) (j4 >> 32))) - ((int) (j2 >> 32)), dU5.v(j4) + ooe.v);
        } else if (ordinal == 2) {
            int i5 = ooe.R;
            long j5 = this.R;
            int i6 = dU5.R;
            return cU5.v((i5 + ((int) (j5 >> 32))) - (((int) (j2 >> 32)) / 2), dU5.v(j5) + ooe.v);
        } else {
            throw new j8f((Object) null);
        }
    }
}
