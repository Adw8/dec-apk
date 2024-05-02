package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: y4  reason: default package */
/* loaded from: classes.dex */
public final class y4 {
    public final HashMap R = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public final Map f7483R;

    public y4(HashMap hashMap) {
        this.f7483R = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            alX alx = (alX) entry.getValue();
            List list = (List) this.R.get(alx);
            if (list == null) {
                list = new ArrayList();
                this.R.put(alx, list);
            }
            list.add((P5) entry.getKey());
        }
    }

    public static void R(List list, nu_ nu_, alX alx, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                P5 p5 = (P5) list.get(size);
                p5.getClass();
                try {
                    int i = p5.R;
                    if (i == 0) {
                        p5.f382R.invoke(obj, new Object[0]);
                    } else if (i == 1) {
                        p5.f382R.invoke(obj, nu_);
                    } else if (i == 2) {
                        p5.f382R.invoke(obj, nu_, alx);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
