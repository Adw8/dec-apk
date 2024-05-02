package defpackage;

import java.util.Comparator;

/* renamed from: oww  reason: default package */
/* loaded from: classes.dex */
public final class oww implements Comparator {
    public static final oww R = new oww();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return mpX.R;
    }
}
