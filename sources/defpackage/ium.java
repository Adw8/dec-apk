package defpackage;

import android.content.SharedPreferences;

/* renamed from: ium  reason: default package */
/* loaded from: classes.dex */
public final class ium implements p1w {
    public static final /* synthetic */ icv[] R;

    /* renamed from: R  reason: collision with other field name */
    public final SharedPreferences f4759R;

    static {
        hm8 hm8 = new hm8(ium.class, afN.R(-46097910846348L), afN.R(-46153745421196L), 0);
        g8d.R.getClass();
        R = new icv[]{hm8};
    }

    public ium(SharedPreferences sharedPreferences) {
        this.f4759R = sharedPreferences;
        new Jv(afN.R(-45921817187212L), 4).R(this, R[0]);
    }

    @Override // defpackage.p1w
    public final SharedPreferences R() {
        return this.f4759R;
    }
}
