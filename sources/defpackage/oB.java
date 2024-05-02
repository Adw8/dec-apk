package defpackage;

/* renamed from: oB  reason: default package */
/* loaded from: classes.dex */
public final class oB extends aFk implements iv7 {
    public oB(aOO aoo) {
        super(2, aoo);
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        jy_ jy_ = (jy_) obj;
        oB oBVar = new oB((aOO) obj2);
        o8s o8s = o8s.R;
        oBVar.O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        Thread.currentThread().join();
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new oB(aoo);
    }
}
