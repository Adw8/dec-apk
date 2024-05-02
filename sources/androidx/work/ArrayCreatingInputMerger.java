package androidx.work;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends od5 {
    @Override // defpackage.od5
    public final g2m R(ArrayList arrayList) {
        pve pve = new pve(1);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : Collections.unmodifiableMap(((g2m) it.next()).f3659R).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = hashMap.get(str);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                            System.arraycopy(obj, 0, newInstance, 0, length);
                            System.arraycopy(value, 0, newInstance, length, length2);
                            value = newInstance;
                        } else {
                            value = Array.newInstance(obj.getClass(), 2);
                            Array.set(value, 0, obj);
                            Array.set(value, 1, value);
                        }
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        int length3 = Array.getLength(obj);
                        value = Array.newInstance(value.getClass(), length3 + 1);
                        System.arraycopy(obj, 0, value, 0, length3);
                        Array.set(value, length3, value);
                    } else if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                        throw new IllegalArgumentException();
                    } else {
                        int length4 = Array.getLength(value);
                        value = Array.newInstance(obj.getClass(), length4 + 1);
                        System.arraycopy(value, 0, value, 0, length4);
                        Array.set(value, length4, obj);
                    }
                    hashMap.put(str, value);
                } else if (cls.isArray()) {
                    hashMap.put(str, value);
                } else {
                    value = Array.newInstance(value.getClass(), 1);
                    Array.set(value, 0, value);
                    hashMap.put(str, value);
                }
            }
        }
        pve.v(hashMap);
        g2m g2m = new g2m(pve.R);
        g2m.v(g2m);
        return g2m;
    }
}
