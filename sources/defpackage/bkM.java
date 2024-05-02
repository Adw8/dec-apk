package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: bkM  reason: default package */
/* loaded from: classes.dex */
public final class bkM extends aFk implements lR3 {
    public final /* synthetic */ fLL R;

    /* renamed from: R  reason: collision with other field name */
    public List f1785R;

    /* renamed from: R  reason: collision with other field name */
    public Set f1786R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ kJx f1787R;
    public int X;
    public List c;
    public List v;

    /* renamed from: v  reason: collision with other field name */
    public Set f1788v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bkM(fLL fll, aOO aoo) {
        super(3, aoo);
        this.R = fll;
    }

    public static final void H(List list, fLL fll) {
        list.clear();
        synchronized (fll.f3384R) {
            ArrayList arrayList = fll.X;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                list.add((p4d) arrayList.get(i));
            }
            fll.X.clear();
        }
    }

    public static final void Z(List list, List list2, List list3, Set set, Set set2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v9, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c5, code lost:
        r10.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c9, code lost:
        throw null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0072 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00da A[Catch: all -> 0x01d4, TryCatch #2 {, blocks: (B:34:0x00c3, B:36:0x00cc, B:42:0x00da, B:44:0x00e6), top: B:88:0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r18) {
        /*
        // Method dump skipped, instructions count: 471
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkM.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        jy_ jy_ = (jy_) obj;
        bkM bkm = new bkM(this.R, (aOO) obj3);
        bkm.f1787R = (kJx) obj2;
        return bkm.O(o8s.R);
    }
}
