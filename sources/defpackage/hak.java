package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: hak  reason: default package */
/* loaded from: classes.dex */
public abstract class hak {
    public static final String R = kfk.P("Schedulers");

    /* JADX INFO: finally extract failed */
    public static void R(l_s l_s, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            ptn N = workDatabase.N();
            workDatabase.c();
            try {
                ArrayList e = N.e(l_s.c);
                ArrayList c = N.c();
                if (e.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = e.iterator();
                    while (it.hasNext()) {
                        N.C(((l3L) it.next()).f5562R, currentTimeMillis);
                    }
                }
                workDatabase.Z();
                workDatabase.O();
                if (e.size() > 0) {
                    l3L[] l3lArr = (l3L[]) e.toArray(new l3L[e.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        fjo fjo = (fjo) it2.next();
                        if (fjo.e()) {
                            fjo.X(l3lArr);
                        }
                    }
                }
                if (c.size() > 0) {
                    l3L[] l3lArr2 = (l3L[]) c.toArray(new l3L[c.size()]);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        fjo fjo2 = (fjo) it3.next();
                        if (!fjo2.e()) {
                            fjo2.X(l3lArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.O();
                throw th;
            }
        }
    }
}
