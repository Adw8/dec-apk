package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

/* renamed from: s3  reason: default package */
/* loaded from: classes.dex */
public abstract class s3 extends T0 {
    public static final void E(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object obj : iterable) {
            collection.add(obj);
        }
    }

    public static final Object f(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.remove(pdD.i(arrayList));
        }
        throw new NoSuchElementException("List is empty.");
    }
}
