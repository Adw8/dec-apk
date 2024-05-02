package defpackage;

import com.termux.terminal.Y;

/* renamed from: gbv  reason: default package */
/* loaded from: classes.dex */
public final class gbv extends aFk implements iv7 {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f3799R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gbv(h0T h0t, dH9 dh9, aOO aoo) {
        super(2, aoo);
        this.R = dh9;
        this.f3799R = h0t;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((gbv) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Y y;
        gje gje;
        jjU.o(obj);
        h0T h0t = this.f3799R;
        dH9 dh9 = this.R;
        float f = iqx.R;
        ihm ihm = (ihm) dh9.getValue();
        h0t.R(Boolean.valueOf((ihm == null || (y = ihm.R) == null || (gje = y.f2413R) == null) ? false : gje.N()));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new gbv(this.f3799R, this.R, aoo);
    }
}
