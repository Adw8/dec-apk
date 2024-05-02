package defpackage;

import java.util.Comparator;

/* renamed from: dFp  reason: default package */
/* loaded from: classes.dex */
public final class dFp implements Comparator {
    public static final dFp R = new dFp();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        fue fue = (fue) obj;
        fue fue2 = (fue) obj2;
        int O = n3x.O(fue2.O, fue.O);
        return O != 0 ? O : n3x.O(fue.hashCode(), fue2.hashCode());
    }
}
