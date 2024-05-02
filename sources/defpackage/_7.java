package defpackage;

import java.util.Map;

/* renamed from: _7  reason: default package */
/* loaded from: classes.dex */
public final class _7 extends k8G implements kg9 {
    public final /* synthetic */ aAC R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f688R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f689R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public _7(_0 _0, boolean z, aD4 ad4, knn knn, ofd ofd, li liVar) {
        super(1);
        this.X = 3;
        this.v = _0;
        this.f689R = z;
        this.f688R = ad4;
        this.R = knn;
        this.c = ofd;
        this.e = liVar;
    }

    public final void R(bNL bnl) {
        switch (this.X) {
            case 1:
                fzf fzf = (fzf) this.f688R;
                if (fzf != null) {
                    onS.v(bnl, fzf.R);
                }
                _d _dVar = new _d((f_c) this.e, 0);
                icv[] icvArr = onS.f6950R;
                kEW kew = (kEW) bnl;
                kew.c(jGN.v, new Tp((String) this.v, _dVar));
                f_c f_c = (f_c) this.R;
                if (f_c != null) {
                    kew.c(jGN.c, new Tp((String) this.c, new _d(f_c, 1)));
                }
                if (!this.f689R) {
                    kew.c(dwC.m, o8s.R);
                    return;
                }
                return;
            default:
                icv[] icvArr2 = onS.f6950R;
                kEW kew2 = (kEW) bnl;
                kew2.c(dwC.I, (kg9) this.v);
                if (this.f689R) {
                    b_t b_t = onS.O;
                    icv icv = onS.f6950R[6];
                    b_t.R(bnl, (aD4) this.f688R);
                } else {
                    b_t b_t2 = onS.X;
                    icv icv2 = onS.f6950R[5];
                    b_t2.R(bnl, (aD4) this.f688R);
                }
                iv7 iv7 = (iv7) this.R;
                if (iv7 != null) {
                    kew2.c(jGN.e, new Tp(null, iv7));
                }
                kg9 kg9 = (kg9) this.c;
                if (kg9 != null) {
                    kew2.c(jGN.X, new Tp(null, kg9));
                }
                b_t b_t3 = onS.H;
                icv icv3 = onS.f6950R[13];
                b_t3.R(bnl, (li) this.e);
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b1  */
    @Override // defpackage.kg9
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r12) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage._7.x(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public _7(fzf fzf, String str, boolean z, f_c f_c) {
        super(1);
        this.X = 1;
        this.f688R = fzf;
        this.v = str;
        this.R = null;
        this.c = null;
        this.f689R = z;
        this.e = f_c;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public _7(boolean z, Map map, h0T h0t, jy_ jy_, f_c f_c, p2E p2e) {
        super(1);
        this.X = 2;
        this.f689R = z;
        this.v = map;
        this.f688R = h0t;
        this.c = jy_;
        this.R = f_c;
        this.e = p2e;
    }
}
