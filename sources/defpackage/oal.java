package defpackage;

/* renamed from: oal  reason: default package */
/* loaded from: classes.dex */
public final class oal extends aFk implements iv7 {
    public /* synthetic */ int X;

    public oal(aOO aoo) {
        super(2, aoo);
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((oal) X(Integer.valueOf(((Number) obj).intValue()), (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        return Boolean.valueOf(this.X > 0);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        oal oal = new oal(aoo);
        oal.X = ((Number) obj).intValue();
        return oal;
    }
}
