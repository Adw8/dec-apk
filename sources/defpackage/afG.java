package defpackage;

/* renamed from: afG  reason: default package */
/* loaded from: classes.dex */
public final class afG extends aFk implements iv7 {
    public /* synthetic */ Object R;

    public afG(aOO aoo) {
        super(2, aoo);
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((afG) X((a8X) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        return Boolean.valueOf(((a8X) this.R) == a8X.ShutDown);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        afG afg = new afG(aoo);
        afg.R = obj;
        return afg;
    }
}
