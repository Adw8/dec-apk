package defpackage;

import dev.kdrag0n.virt.NativeLib;

/* renamed from: lIT  reason: default package */
/* loaded from: classes.dex */
public final class lIT extends aFk implements iv7 {
    public final /* synthetic */ oo3 R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lIT(oo3 oo3, aOO aoo) {
        super(2, aoo);
        this.R = oo3;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((lIT) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        oo3 oo3 = this.R;
        oo3.getClass();
        pby[] pbyArr = kxm.R;
        doT dot = oo3.f6953R;
        long j = (long) 1024;
        NativeLib.g(((long) ((Number) dot.c.v(dot, doT.v[1])).intValue()) * j * j);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new lIT(this.R, aoo);
    }
}
