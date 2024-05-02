package defpackage;

import android.view.Choreographer;

/* renamed from: oby  reason: default package */
/* loaded from: classes.dex */
public final class oby extends aFk implements iv7 {
    public oby(aOO aoo) {
        super(2, aoo);
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        jy_ jy_ = (jy_) obj;
        return new oby((aOO) obj2).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        return Choreographer.getInstance();
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new oby(aoo);
    }
}
