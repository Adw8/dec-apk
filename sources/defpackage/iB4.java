package defpackage;

/* renamed from: iB4  reason: default package */
/* loaded from: classes.dex */
public final class iB4 {
    public final p4a R;

    /* renamed from: R  reason: collision with other field name */
    public final wg f4483R;

    public iB4(aQM aqm, dq dqVar) {
        this.R = aqm;
        this.f4483R = dqVar;
    }

    public final void R(b05 b05) {
        synchronized (this) {
            p4a p4a = this.R;
            ((aQM) p4a).R.edit().putLong("com.lyft.kronos.cached_current_time", b05.R).apply();
            p4a p4a2 = this.R;
            ((aQM) p4a2).R.edit().putLong("com.lyft.kronos.cached_elapsed_time", b05.v).apply();
            p4a p4a3 = this.R;
            ((aQM) p4a3).R.edit().putLong("com.lyft.kronos.cached_offset", b05.c).apply();
        }
    }
}
