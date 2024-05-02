package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: vJ  reason: default package */
/* loaded from: classes.dex */
public final class vJ extends k49 {
    public static final tm R = new tm(0);

    /* renamed from: R  reason: collision with other field name */
    public final Class f7435R;

    /* renamed from: R  reason: collision with other field name */
    public final k49 f7436R;

    public vJ(Class cls, k49 k49) {
        this.f7435R = cls;
        this.f7436R = k49;
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        mot.R();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f7436R.O(mot, Array.get(obj, i));
        }
        ((dfN) mot).k(1, 2, ']');
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        ArrayList arrayList = new ArrayList();
        csz.R();
        while (csz.H()) {
            arrayList.add(this.f7436R.R(csz));
        }
        csz.X();
        Object newInstance = Array.newInstance(this.f7435R, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public final String toString() {
        return this.f7436R + ".array()";
    }
}
