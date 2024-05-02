package defpackage;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: pk  reason: default package */
/* loaded from: classes.dex */
public final class pk extends k8G implements lR3 {
    public final /* synthetic */ f8n R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ f_c f7204R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fzf f7205R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f7206R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f7207R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f7208R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public pk(f8n f8n, p2E p2e, fzf fzf, String str, f_c f_c, boolean z) {
        super(3);
        this.f7204R = f_c;
        this.f7208R = z;
        this.f7207R = p2e;
        this.R = f8n;
        this.f7206R = str;
        this.f7205R = fzf;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        h0T h0t;
        Boolean bool;
        boolean z;
        CE ce;
        ncu ncu = (ncu) obj;
        ((Number) obj3).intValue();
        jr_ jr_ = (jr_) ((m88) obj2);
        jr_.w(92076020);
        h0T s = l6.s(this.f7204R, jr_);
        jr_.w(-492369756);
        Object I = jr_.I();
        f1A f1a = ppN.R;
        if (I == f1a) {
            I = l6.n(null);
            jr_.ZW(I);
        }
        jr_.g(false);
        h0T h0t2 = (h0T) I;
        jr_.w(-492369756);
        Object I2 = jr_.I();
        if (I2 == f1a) {
            I2 = new LinkedHashMap();
            jr_.ZW(I2);
        }
        jr_.g(false);
        Map map = (Map) I2;
        jr_.w(1841981561);
        if (this.f7208R) {
            dTl.Z(this.f7207R, h0t2, map, jr_, 560);
        }
        jr_.g(false);
        int i = t4.R;
        jr_.w(-1990508712);
        q4 q4Var = new q4(0, (View) jr_.x(ur.X));
        jr_.g(false);
        jr_.w(-492369756);
        Object I3 = jr_.I();
        if (I3 == f1a) {
            I3 = l6.n(Boolean.TRUE);
            jr_.ZW(I3);
        }
        jr_.g(false);
        h0T h0t3 = (h0T) I3;
        jr_.w(511388516);
        boolean O = jr_.O(h0t3) | jr_.O(q4Var);
        Object I4 = jr_.I();
        if (O || I4 == f1a) {
            I4 = new _c(h0t3, 0, q4Var);
            jr_.ZW(I4);
        }
        jr_.g(false);
        h0T s2 = l6.s(I4, jr_);
        jr_.w(-492369756);
        Object I5 = jr_.I();
        if (I5 == f1a) {
            I5 = l6.n(new aWo(aWo.v));
            jr_.ZW(I5);
        }
        jr_.g(false);
        h0T h0t4 = (h0T) I5;
        aff aff = aff.R;
        p2E p2e = this.f7207R;
        Boolean valueOf = Boolean.valueOf(this.f7208R);
        p2E p2e2 = this.f7207R;
        Object[] objArr = {h0t4, Boolean.valueOf(this.f7208R), p2e2, h0t2, s2, s};
        boolean z2 = this.f7208R;
        jr_.w(-568225417);
        boolean z3 = false;
        for (int i2 = 0; i2 < 6; i2++) {
            z3 |= jr_.O(objArr[i2]);
        }
        Object I6 = jr_.I();
        if (z3 || I6 == ppN.R) {
            h0t = h0t4;
            bool = valueOf;
            CE ce2 = new CE(h0t4, z2, p2e2, h0t2, s2, s, null);
            jr_.ZW(ce2);
            z = false;
            ce = ce2;
        } else {
            h0t = h0t4;
            z = false;
            bool = valueOf;
            ce = I6;
        }
        jr_.g(z);
        pdm pdm = lCG.R;
        lBz lbz = lBz.Y;
        ncu g = g4x.g(aff, lbz, new ezT(p2e, bool, ce, 1));
        jr_.w(-492369756);
        Object I7 = jr_.I();
        f1A f1a2 = ppN.R;
        if (I7 == f1a2) {
            I7 = new sc(h0t3);
            jr_.ZW(I7);
        }
        jr_.g(false);
        ncu ncu2 = (ncu) I7;
        p2E p2e3 = this.f7207R;
        f8n f8n = this.R;
        Object x = jQ.x(jr_, 773894976, -492369756);
        if (x == f1a2) {
            x = new hyO(caw.N(jr_));
            jr_.ZW(x);
        }
        jr_.g(false);
        jy_ jy_ = ((hyO) x).R;
        jr_.g(false);
        boolean z4 = this.f7208R;
        String str = this.f7206R;
        fzf fzf = this.f7205R;
        f_c f_c = this.f7204R;
        ncu N = cU5.N(ncu2, true, new _7(fzf, str, z4, f_c));
        _7 _7 = new _7(z4, map, h0t, jy_, f_c, p2e3);
        bsy bsy = khu.R;
        ncu R = mWb.R(N, new czM(_7, null));
        owM owm = pbX.R;
        ncu g2 = g4x.g(g4x.g(R, lbz, new fB0(f8n, 0, p2e3)), lbz, new mGH(p2e3, z4, 2));
        cxL cxl = ppQ.R;
        ncu I8 = g4x.g(g2, lbz, new mGH(p2e3, z4)).I(g);
        jr_.g(false);
        return I8;
    }
}
