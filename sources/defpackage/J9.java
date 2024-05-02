package defpackage;

import moe.shizuku.manager.adb.d;

/* renamed from: J9  reason: default package */
/* loaded from: classes.dex */
public final class J9 extends aFk implements iv7 {
    public final /* synthetic */ gh R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f198R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f199R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public J9(gh ghVar, String str, aOO aoo) {
        super(2, aoo);
        this.R = ghVar;
        this.f199R = str;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((J9) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2;
        Integer num;
        boolean z;
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f198R;
        gh ghVar = this.R;
        String str = this.f199R;
        try {
            num = (Integer) ghVar.f3869R.getValue();
        } catch (Throwable th) {
            obj2 = new bvw(th);
        }
        if (num != null) {
            d dVar = new d(num.intValue(), str, (jY) ghVar.f3868R.getValue());
            pby[] pbyArr = kxm.R;
            try {
                z = dVar.c();
            } catch (fH unused) {
                z = false;
            }
            dTl.V(dVar, null);
            obj2 = Boolean.valueOf(z);
            return new mwl(obj2);
        }
        throw new IllegalStateException("Missing port".toString());
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        J9 j9 = new J9(this.R, this.f199R, aoo);
        j9.f198R = obj;
        return j9;
    }
}
