package defpackage;

import java.io.PrintWriter;

/* renamed from: ebj  reason: default package */
/* loaded from: classes.dex */
public final class ebj extends vd {
    public final iYs R;

    /* renamed from: R  reason: collision with other field name */
    public final nu_ f3162R;

    public ebj(nu_ nu_, ns8 ns8) {
        this.f3162R = nu_;
        this.R = (iYs) new CV(ns8, iYs.R, 0).O(iYs.class);
    }

    public final void S(String str, PrintWriter printWriter) {
        iYs iys = this.R;
        if (iys.f4641R.m() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (iys.f4641R.m() > 0) {
                jQ.Y(iys.f4641R.x(0));
                printWriter.print(str);
                printWriter.print("  #");
                eSi esi = iys.f4641R;
                if (esi.f3102R) {
                    esi.O();
                }
                printWriter.print(esi.f3103R[0]);
                printWriter.print(": ");
                throw null;
            }
        }
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        nu_ nu_ = this.f3162R;
        if (nu_ == null) {
            sb.append("null");
        } else {
            String simpleName = nu_.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = nu_.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(nu_)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
