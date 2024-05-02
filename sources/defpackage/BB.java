package defpackage;

import dev.kdrag0n.virtcontainer.ui.main.MainActivity;

/* renamed from: BB  reason: default package */
/* loaded from: classes.dex */
public final class BB extends aFk implements iv7 {
    public final /* synthetic */ gh R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f18R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f19R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public BB(boolean z, gh ghVar, aOO aoo) {
        super(2, aoo);
        this.f19R = z;
        this.R = ghVar;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((BB) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2;
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f18R;
        gh ghVar = this.R;
        boolean z = true;
        try {
            kxm.v(cUF.v(jy_), 4, "Connecting adb", null);
            kFV R = ghVar.R();
            R.c(dF.X4(ghVar.f3864R.f330R, ";", null, null, null, 62));
            ghVar.f3871R.R.H(Boolean.TRUE);
            R.c("am start " + (ghVar.R.R + "/" + MainActivity.class.getName()));
            l6.g(R, null);
            oLT olt = ghVar.f3870R;
            obj2 = Boolean.valueOf(C1.R(olt.f6770R, olt.R.R) == 0);
        } catch (Throwable th) {
            obj2 = new bvw(th);
        }
        if (n3x.v(obj2 instanceof bvw ? null : obj2, Boolean.TRUE) && this.f19R) {
            if (C1.R(this.R.f3870R.f6770R, "android.permission.WRITE_SECURE_SETTINGS") != 0) {
                z = false;
            }
            if (z) {
                l6.z(g8W.R, iFn.f4518R, 0, new o6(this.R, null), 2);
            }
        }
        return new mwl(obj2);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        BB bb = new BB(this.f19R, this.R, aoo);
        bb.f18R = obj;
        return bb;
    }
}
