package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: k_Z  reason: default package */
/* loaded from: classes.dex */
public final class k_Z {
    public static final ArrayList R;

    /* renamed from: R  reason: collision with other field name */
    public final ThreadLocal f5355R = new ThreadLocal();

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f5356R = new LinkedHashMap();

    /* renamed from: R  reason: collision with other field name */
    public final List f5357R;

    static {
        ArrayList arrayList = new ArrayList(5);
        R = arrayList;
        arrayList.add(pdD.f7136R);
        arrayList.add(Lw.R);
        arrayList.add(a2F.R);
        arrayList.add(vJ.R);
        arrayList.add(f7l.R);
        arrayList.add(Yr.R);
    }

    public k_Z(bq4 bq4) {
        int size = bq4.f1822R.size();
        ArrayList arrayList = R;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(bq4.f1822R);
        arrayList2.addAll(arrayList);
        this.f5357R = Collections.unmodifiableList(arrayList2);
    }

    public final k49 R(Class cls) {
        return c(cls, mzK.f6263R, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [k49] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.k49 c(java.lang.reflect.Type r9, java.util.Set r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k_Z.c(java.lang.reflect.Type, java.util.Set, java.lang.String):k49");
    }

    public final k49 v(Type type) {
        return c(type, mzK.f6263R, null);
    }
}
