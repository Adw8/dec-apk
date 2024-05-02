package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: aFh  reason: default package */
/* loaded from: classes.dex */
public final class aFh {
    public final Tx R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f810R;

    /* renamed from: R  reason: collision with other field name */
    public final Throwable f811R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f812R;
    public final Object v;

    public aFh(Object obj, Tx tx, kg9 kg9, Object obj2, Throwable th) {
        this.f810R = obj;
        this.R = tx;
        this.f812R = kg9;
        this.v = obj2;
        this.f811R = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static aFh R(aFh afh, Tx tx, CancellationException cancellationException, int i) {
        Object obj = null;
        Object obj2 = (i & 1) != 0 ? afh.f810R : null;
        if ((i & 2) != 0) {
            tx = afh.R;
        }
        kg9 kg9 = (i & 4) != 0 ? afh.f812R : null;
        if ((i & 8) != 0) {
            obj = afh.v;
        }
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = afh.f811R;
        }
        afh.getClass();
        return new aFh(obj2, tx, kg9, obj, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aFh)) {
            return false;
        }
        aFh afh = (aFh) obj;
        return n3x.v(this.f810R, afh.f810R) && n3x.v(this.R, afh.R) && n3x.v(this.f812R, afh.f812R) && n3x.v(this.v, afh.v) && n3x.v(this.f811R, afh.f811R);
    }

    public final int hashCode() {
        Object obj = this.f810R;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Tx tx = this.R;
        int hashCode2 = (hashCode + (tx == null ? 0 : tx.hashCode())) * 31;
        kg9 kg9 = this.f812R;
        int hashCode3 = (hashCode2 + (kg9 == null ? 0 : kg9.hashCode())) * 31;
        Object obj2 = this.v;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f811R;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder U = opT.U("CompletedContinuation(result=");
        U.append(this.f810R);
        U.append(", cancelHandler=");
        U.append(this.R);
        U.append(", onCancellation=");
        U.append(this.f812R);
        U.append(", idempotentResume=");
        U.append(this.v);
        U.append(", cancelCause=");
        U.append(this.f811R);
        U.append(')');
        return U.toString();
    }

    public /* synthetic */ aFh(Object obj, Tx tx, kg9 kg9, Object obj2, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : tx, (i & 4) != 0 ? null : kg9, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : cancellationException);
    }
}
