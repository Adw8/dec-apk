package defpackage;

import android.provider.Settings;

/* renamed from: o6  reason: default package */
/* loaded from: classes.dex */
public final class o6 extends aFk implements iv7 {
    public final /* synthetic */ gh R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f6669R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public o6(gh ghVar, aOO aoo) {
        super(2, aoo);
        this.R = ghVar;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((o6) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jy_ jy_;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            jy_ jy_2 = (jy_) this.f6669R;
            this.f6669R = jy_2;
            this.X = 1;
            if (n3x.Z(3000, this) == bgr) {
                return bgr;
            }
            jy_ = jy_2;
        } else if (i == 1) {
            jy_ = (jy_) this.f6669R;
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            Settings.Global.putInt(this.R.f3866R.getContentResolver(), "adb_wifi_enabled", 0);
        } catch (Exception e) {
            kxm.v(cUF.v(jy_), 5, "Failed to disable ADB wifi", e);
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        o6 o6Var = new o6(this.R, aoo);
        o6Var.f6669R = obj;
        return o6Var;
    }
}
