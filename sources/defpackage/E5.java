package defpackage;

import dev.kdrag0n.virtcontainer.R;

/* renamed from: E5  reason: default package */
/* loaded from: classes.dex */
public abstract class E5 extends Ms {
    public static final /* synthetic */ icv[] R;

    /* renamed from: R  reason: collision with other field name */
    public final l4A f82R = new l4A(this);

    static {
        gzV gzv = new gzV(E5.class, "binding", "getBinding()Ldev/kdrag0n/app/databinding/ContentComposeBinding;", 0);
        g8d.R.getClass();
        R = new icv[]{gzv};
    }

    public E5() {
        super(R.layout.content_compose);
        qQ qQVar = qQ.R;
    }

    public final void E(iv7 iv7) {
        l4A l4a = this.f82R;
        icv icv = R[0];
        bww bww = l4a.R;
        if (bww == null) {
            kGM kgm = l4a.f5577R.f7241R;
            if (kgm != null) {
                kgm.v();
                if (kgm.f5229R.f5900R.R(iMP.INITIALIZED)) {
                    bww = (bww) l4a.f5576R.x(p());
                    l4a.R = bww;
                } else {
                    throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
                }
            } else {
                throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
            }
        }
        oer.v(((my1) bww).R, (dNH) iv7);
    }
}
