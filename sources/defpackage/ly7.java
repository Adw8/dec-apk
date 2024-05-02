package defpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* renamed from: ly7  reason: default package */
/* loaded from: classes.dex */
public final class ly7 extends aFk implements iv7 {
    public final /* synthetic */ aME R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5867R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f5868R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String[] f5869R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ly7(aME ame, aOO aoo, kg9 kg9, String[] strArr) {
        super(2, aoo);
        this.R = ame;
        this.f5868R = kg9;
        this.f5869R = strArr;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((ly7) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            aME ame = this.R;
            this.f5867R = (jy_) this.f5867R;
            this.X = 1;
            Object Z = ame.f850R.Z(this);
            if (Z != bgr) {
                Z = o8s.R;
            }
            if (Z == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jy_ jy_ = (jy_) this.f5867R;
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String[] strArr = this.f5869R;
        pby[] pbyArr = kxm.R;
        kg9 kg9 = this.f5868R;
        if (kg9 != null) {
            aME ame2 = this.R;
            Process U = ame2.U(strArr);
            nWW nww = new nWW();
            nww.R = "";
            InputStreamReader inputStreamReader = new InputStreamReader(U.getInputStream(), O1.R);
            mLz.O(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192), new ofd(nww, ame2, kg9, 18));
            if (U.waitFor() == 0) {
                return (String) nww.R;
            }
            throw new feV((String) nww.R);
        }
        Process U2 = this.R.U(strArr);
        InputStreamReader inputStreamReader2 = new InputStreamReader(U2.getInputStream(), O1.R);
        BufferedReader bufferedReader = inputStreamReader2 instanceof BufferedReader ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
        try {
            String obj2 = iH_.vr(mLz.N(bufferedReader)).toString();
            dTl.V(bufferedReader, null);
            if (U2.waitFor() == 0) {
                return obj2;
            }
            throw new feV(obj2);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                dTl.V(bufferedReader, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        ly7 ly7 = new ly7(this.R, aoo, this.f5868R, this.f5869R);
        ly7.f5867R = obj;
        return ly7;
    }
}
