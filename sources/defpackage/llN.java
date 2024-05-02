package defpackage;

import dev.kdrag0n.virtcontainer.service.VirtService;

/* renamed from: llN  reason: default package */
/* loaded from: classes.dex */
public final class llN extends aFk implements kg9 {
    public final /* synthetic */ VirtService R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f5815R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public llN(jy_ jy_, VirtService virtService, aOO aoo) {
        super(1, aoo);
        this.f5815R = jy_;
        this.R = virtService;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        kxm.v(cUF.v(this.f5815R), 4, "VM stopped, abort", null);
        this.R.stopSelf();
        return o8s.R;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        llN lln = new llN(this.f5815R, this.R, (aOO) obj);
        o8s o8s = o8s.R;
        lln.O(o8s);
        return o8s;
    }
}
