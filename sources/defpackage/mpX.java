package defpackage;

import java.util.Comparator;

/* renamed from: mpX  reason: default package */
/* loaded from: classes.dex */
public final class mpX implements Comparator {
    public static final mpX R = new mpX();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj2).compareTo((Comparable) obj);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return oww.R;
    }
}
