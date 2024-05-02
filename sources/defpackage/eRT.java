package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: eRT  reason: default package */
/* loaded from: classes.dex */
public final class eRT extends o02 {
    public static final String v = kfk.P("WorkContinuationImpl");
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public h5 f3085R;

    /* renamed from: R  reason: collision with other field name */
    public final jFe f3086R;

    /* renamed from: R  reason: collision with other field name */
    public final String f3087R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f3088R;

    /* renamed from: R  reason: collision with other field name */
    public final List f3089R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3090R;

    /* renamed from: v  reason: collision with other field name */
    public final ArrayList f3091v;

    public eRT(jFe jfe, String str, int i, List list) {
        this(jfe, str, i, list, 0);
    }

    public static boolean J(eRT ert, HashSet hashSet) {
        hashSet.addAll(ert.f3088R);
        HashSet Y = Y(ert);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (Y.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(ert.f3088R);
        return false;
    }

    public static HashSet Y(eRT ert) {
        HashSet hashSet = new HashSet();
        ert.getClass();
        return hashSet;
    }

    public final aSp K() {
        if (!this.f3090R) {
            dQ4 dq4 = new dQ4(this);
            this.f3086R.f4884R.X(dq4);
            this.f3085R = dq4.f2603R;
        } else {
            kfk.U().g(v, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f3088R)), new Throwable[0]);
        }
        return this.f3085R;
    }

    public eRT(jFe jfe, String str, int i, List list, int i2) {
        this.f3086R = jfe;
        this.f3087R = str;
        this.R = i;
        this.f3089R = list;
        this.f3088R = new ArrayList(list.size());
        this.f3091v = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            String uuid = ((lyz) list.get(i3)).f5872R.toString();
            this.f3088R.add(uuid);
            this.f3091v.add(uuid);
        }
    }
}
