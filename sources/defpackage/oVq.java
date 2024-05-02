package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: oVq  reason: default package */
/* loaded from: classes.dex */
public final class oVq implements hZi {
    public static final f1A R = new f1A(19, 0);

    /* renamed from: R  reason: collision with other field name */
    public static final k_s f6834R;

    /* renamed from: R  reason: collision with other field name */
    public e9w f6835R;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f6836R = new LinkedHashMap();

    /* renamed from: R  reason: collision with other field name */
    public final Map f6837R;

    static {
        ky1 ky1 = ky1.g;
        nqF nqf = nqF.O;
        k_s k_s = e29.R;
        f6834R = new k_s(ky1, nqf);
    }

    public oVq(Map map) {
        this.f6837R = map;
    }

    @Override // defpackage.hZi
    public final void O(Object obj) {
        nKg nkg = (nKg) this.f6836R.get(obj);
        if (nkg != null) {
            nkg.f6364R = false;
        } else {
            this.f6837R.remove(obj);
        }
    }

    @Override // defpackage.hZi
    public final void e(Object obj, iv7 iv7, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-1198538093);
        jr_.w(444418301);
        jr_._(obj);
        jr_.w(-642722479);
        jr_.w(-492369756);
        Object I = jr_.I();
        if (I == ppN.R) {
            e9w e9w = this.f6835R;
            if (e9w != null ? e9w.v(obj) : true) {
                I = new nKg(this, obj);
                jr_.ZW(I);
            } else {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        jr_.g(false);
        nKg nkg = (nKg) I;
        l6.R(new bkv[]{hcN.R.v(nkg.f6363R)}, iv7, jr_, (i & 112) | 8);
        caw.v(o8s.R, new ove(this, obj, nkg), jr_);
        jr_.g(false);
        if (jr_.f5078e && jr_.f5058R.X == jr_.c) {
            jr_.c = -1;
            jr_.f5078e = false;
        }
        jr_.g(false);
        jr_.g(false);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new dR(this, obj, iv7, i, 6);
        }
    }
}
