package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* renamed from: nUp  reason: default package */
/* loaded from: classes.dex */
public final class nUp {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public long f6417R;

    /* renamed from: R  reason: collision with other field name */
    public TimeInterpolator f6418R;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public long f6419v;

    public nUp(long j) {
        this.f6418R = null;
        this.R = 0;
        this.v = 1;
        this.f6417R = j;
        this.f6419v = 150;
    }

    public final void R(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f6417R);
        objectAnimator.setDuration(this.f6419v);
        objectAnimator.setInterpolator(v());
        objectAnimator.setRepeatCount(this.R);
        objectAnimator.setRepeatMode(this.v);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nUp)) {
            return false;
        }
        nUp nup = (nUp) obj;
        if (this.f6417R == nup.f6417R && this.f6419v == nup.f6419v && this.R == nup.R && this.v == nup.v) {
            return v().getClass().equals(nup.v().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f6417R;
        long j2 = this.f6419v;
        return ((((v().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.R) * 31) + this.v;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\n');
        sb.append(nUp.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f6417R);
        sb.append(" duration: ");
        sb.append(this.f6419v);
        sb.append(" interpolator: ");
        sb.append(v().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.R);
        sb.append(" repeatMode: ");
        return jQ.j(sb, this.v, "}\n");
    }

    public final TimeInterpolator v() {
        TimeInterpolator timeInterpolator = this.f6418R;
        return timeInterpolator != null ? timeInterpolator : My.f300R;
    }

    public nUp(long j, long j2, TimeInterpolator timeInterpolator) {
        this.R = 0;
        this.v = 1;
        this.f6417R = j;
        this.f6419v = j2;
        this.f6418R = timeInterpolator;
    }
}
