package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

@mEz("dialog")
/* renamed from: kmE  reason: default package */
/* loaded from: classes.dex */
public final class kmE extends jFk {
    public final Context R;

    /* renamed from: R  reason: collision with other field name */
    public final hAW f5417R;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f5418R = new LinkedHashSet();

    /* renamed from: R  reason: collision with other field name */
    public final pkq f5419R = new pkq(2, this);

    public kmE(Context context, hAW haw) {
        this.R = context;
        this.f5417R = haw;
    }

    @Override // defpackage.jFk
    public final e9E R() {
        return new lE3(this);
    }

    @Override // defpackage.jFk
    public final void X(ebT ebt) {
        m4i m4i;
        super.X(ebt);
        for (j5B j5b : (List) ebt.R.getValue()) {
            jcp jcp = (jcp) this.f5417R.n(j5b.f4826R);
            if (jcp == null || (m4i = ((pm2) jcp).f7242R) == null) {
                this.f5418R.add(j5b.f4826R);
            } else {
                m4i.R(this.f5419R);
            }
        }
        this.f5417R.f4120R.add(new kQZ() { // from class: imZ
            @Override // defpackage.kQZ
            public final void R(pm2 pm2) {
                kmE kme = kmE.this;
                LinkedHashSet linkedHashSet = kme.f5418R;
                String str = pm2.f7248c;
                gvP.X(linkedHashSet);
                if (linkedHashSet.remove(str)) {
                    pm2.f7242R.R(kme.f5419R);
                }
            }
        });
    }

    @Override // defpackage.jFk
    public final void e(List list, ixU ixu) {
        if (this.f5417R.p()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j5B j5b = (j5B) it.next();
            lE3 le3 = (lE3) j5b.f4822R;
            String str = le3.e;
            if (str != null) {
                if (str.charAt(0) == '.') {
                    str = this.R.getPackageName() + str;
                }
                aLv A = this.f5417R.A();
                this.R.getClassLoader();
                pm2 R = A.R(str);
                if (jcp.class.isAssignableFrom(R.getClass())) {
                    jcp jcp = (jcp) R;
                    jcp.B(j5b.f4820R);
                    ((pm2) jcp).f7242R.R(this.f5419R);
                    hAW haw = this.f5417R;
                    String str2 = j5b.f4826R;
                    jcp.V = false;
                    jcp.o = true;
                    haw.getClass();
                    KP kp = new KP(haw);
                    kp.f255c = true;
                    kp.X(0, jcp, str2, 1);
                    kp.e(false);
                    v().X(j5b);
                } else {
                    StringBuilder U = opT.U("Dialog destination ");
                    String str3 = le3.e;
                    if (str3 != null) {
                        throw new IllegalArgumentException(jQ.g(U, str3, " is not an instance of DialogFragment").toString());
                    }
                    throw new IllegalStateException("DialogFragment class was not set".toString());
                }
            } else {
                throw new IllegalStateException("DialogFragment class was not set".toString());
            }
        }
    }

    @Override // defpackage.jFk
    public final void m(j5B j5b, boolean z) {
        if (this.f5417R.p()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) v().R.getValue();
        for (j5B j5b2 : dF.xN(list.subList(list.indexOf(j5b), list.size()))) {
            pm2 n = this.f5417R.n(j5b2.f4826R);
            if (n != null) {
                n.f7242R.v(this.f5419R);
                ((jcp) n).M(false, false);
            }
        }
        v().c(j5b, z);
    }
}
