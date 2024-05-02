package defpackage;

import android.view.View;

/* renamed from: o89  reason: default package */
/* loaded from: classes.dex */
public final class o89 extends aFk implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ View f6681R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f6682R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dkV f6683R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f6684R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jJj f6685R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f6686R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mk9 f6687R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nhg f6688R;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ dH9 f6689X;
    public final /* synthetic */ dH9 c;
    public final /* synthetic */ dH9 e;
    public final /* synthetic */ dH9 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public o89(dkV dkv, mk9 mk9, View view, jJj jjj, float f, nhg nhg, dH9 dh9, dH9 dh92, dH9 dh93, dH9 dh94, h0T h0t, dH9 dh95, aOO aoo) {
        super(2, aoo);
        this.f6683R = dkv;
        this.f6687R = mk9;
        this.f6681R = view;
        this.f6685R = jjj;
        this.R = f;
        this.f6688R = nhg;
        this.f6682R = dh9;
        this.v = dh92;
        this.c = dh93;
        this.e = dh94;
        this.f6684R = h0t;
        this.f6689X = dh95;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((o89) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Throwable th;
        jUs jus;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            jy_ jy_ = (jy_) this.f6686R;
            jUs O = this.f6683R.O(this.f6687R, this.f6681R, this.f6685R, this.R);
            dRB drb = new dRB();
            f30 f30 = (f30) O;
            long R = iTI.R(f30.R.getWidth(), f30.R.getHeight());
            jJj jjj = this.f6685R;
            kg9 kg9 = (kg9) this.f6682R.getValue();
            if (kg9 != null) {
                kg9.x(new o2S(jjj.C(iTI.J(R))));
            }
            drb.R = R;
            l6.z(jy_, null, 0, new p4w(new hzK(this.f6688R, new es7(f30, null), 1), null), 3);
            try {
                i31 l = l6.l(new cPF(f30, this.f6685R, this.v, this.c, this.e, this.f6684R, this.f6689X, drb, this.f6682R));
                this.f6686R = f30;
                this.X = 1;
                Object v = l.v(oEJ.R, this);
                if (v != bgr) {
                    v = o8s.R;
                }
                if (v == bgr) {
                    return bgr;
                }
                jus = f30;
            } catch (Throwable th2) {
                th = th2;
                jus = f30;
                ((f30) jus).R.dismiss();
                throw th;
            }
        } else if (i == 1) {
            jus = (jUs) this.f6686R;
            try {
                jjU.o(obj);
            } catch (Throwable th3) {
                th = th3;
                ((f30) jus).R.dismiss();
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((f30) jus).R.dismiss();
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        o89 o89 = new o89(this.f6683R, this.f6687R, this.f6681R, this.f6685R, this.R, this.f6688R, this.f6682R, this.v, this.c, this.e, this.f6684R, this.f6689X, aoo);
        o89.f6686R = obj;
        return o89;
    }
}
