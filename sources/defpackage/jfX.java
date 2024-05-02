package defpackage;

/* renamed from: jfX  reason: default package */
/* loaded from: classes.dex */
public final class jfX extends aFk implements iv7 {
    public /* synthetic */ Object R;

    public jfX(aOO aoo) {
        super(2, aoo);
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((jfX) X((mAC) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        return Boolean.valueOf(((mAC) this.R) != mAC.START);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        jfX jfx = new jfX(aoo);
        jfx.R = obj;
        return jfx;
    }
}
