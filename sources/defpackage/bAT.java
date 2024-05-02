package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bAT  reason: default package */
/* loaded from: classes.dex */
public final class bAT {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final eS f1544R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f1545R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public List f1546R;

    /* renamed from: R  reason: collision with other field name */
    public final ppN f1547R;

    /* renamed from: R  reason: collision with other field name */
    public final ppf f1548R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f1549R;
    public List v;

    public bAT(eS eSVar, ppf ppf, lMx lmx, boolean z, ppN ppn) {
        List list;
        this.f1544R = eSVar;
        this.f1548R = ppf;
        this.f1549R = z;
        this.f1547R = ppn;
        fcD fcd = fcD.R;
        this.f1546R = fcd;
        this.v = fcd;
        a7_ a7_ = eSVar.f3093R;
        Proxy proxy = eSVar.f3095R;
        if (proxy != null) {
            list = Collections.singletonList(proxy);
        } else {
            URI Z = a7_.Z();
            if (Z.getHost() == null) {
                list = khE.X(Proxy.NO_PROXY);
            } else {
                List<Proxy> select = eSVar.f3096R.select(Z);
                list = select == null || select.isEmpty() ? khE.X(Proxy.NO_PROXY) : khE.m(select);
            }
        }
        this.f1546R = list;
        this.R = 0;
    }

    public final boolean R() {
        return (this.R < this.f1546R.size()) || (this.f1545R.isEmpty() ^ true);
    }
}
