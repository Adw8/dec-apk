package defpackage;

import android.content.SharedPreferences;
import de.Maxr1998.modernpreferences.PreferencesAdapter;
import java.util.ArrayList;

/* renamed from: mkC  reason: default package */
/* loaded from: classes.dex */
public final class mkC extends e1q {
    public int H;
    public PreferencesAdapter R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f6146R;
    public final boolean c;
    public final SharedPreferences v;

    /* renamed from: v  reason: collision with other field name */
    public final ArrayList f6147v;
    public int x;

    public mkC(cH4 ch4) {
        super(((UW) ch4).f566R);
        this.v = ch4.f2053R;
        ArrayList arrayList = ch4.f2054R;
        this.f6146R = arrayList;
        this.f6147v = ch4.f2055v;
        this.c = ch4.f2056v;
        ((UW) this).f565R = ((UW) ch4).f565R;
        ((UW) this).e = ((UW) ch4).e;
        ((UW) this).v = ((UW) ch4).v;
        this.X = ch4.X;
        super.c = ch4.c;
        this.O = ch4.O;
        ((UW) this).R = ((UW) ch4).R;
        this.L = ch4.L;
        ((UW) this).f568e = ((UW) ch4).f568e;
        this.Z = ch4.Z;
        ((UW) this).f567R = ((UW) ch4).f567R;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                e1q e1q = (e1q) this.f6146R.get(i);
                if (e1q.f2941R == null) {
                    e1q.f2941R = this;
                    e1q.m = i;
                    e1q.R = this.v;
                    int i3 = g2w.R;
                    e1q.R();
                    if (i2 <= size) {
                        i = i2;
                    } else {
                        return;
                    }
                } else {
                    throw new IllegalStateException("Preference was already attached to a screen!".toString());
                }
            }
        }
    }

    @Override // defpackage.UW
    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (n3x.v(mkC.class, obj.getClass())) {
                    mkC mkc = (mkC) obj;
                    if (!n3x.v(((UW) this).f566R, ((UW) mkc).f566R) || !n3x.v(this.f6146R, mkc.f6146R)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.UW
    public final int hashCode() {
        return this.f6146R.hashCode() + (((UW) this).f566R.hashCode() * 31);
    }
}
