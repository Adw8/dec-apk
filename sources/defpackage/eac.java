package defpackage;

import java.util.ArrayList;

/* renamed from: eac  reason: default package */
/* loaded from: classes.dex */
public final class eac implements cav {
    public final npH R;
    private volatile /* synthetic */ Object _rootCause;
    private volatile /* synthetic */ int _isCompleting = 0;
    private volatile /* synthetic */ Object _exceptionsHolder = null;

    public eac(npH nph, Throwable th) {
        this.R = nph;
        this._rootCause = th;
    }

    public final ArrayList L(Throwable th) {
        ArrayList arrayList;
        Object obj = this._exceptionsHolder;
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 != null) {
            arrayList.add(0, th2);
        }
        if (th != null && !n3x.v(th, th2)) {
            arrayList.add(th);
        }
        this._exceptionsHolder = dTl.X;
        return arrayList;
    }

    public final boolean O() {
        return this._exceptionsHolder == dTl.X;
    }

    public final void R(Throwable th) {
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 == null) {
            this._rootCause = th;
        } else if (th != th2) {
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                this._exceptionsHolder = th;
            } else if (obj instanceof Throwable) {
                if (th != obj) {
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(obj);
                    arrayList.add(th);
                    this._exceptionsHolder = arrayList;
                }
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    @Override // defpackage.cav
    public final boolean X() {
        return ((Throwable) this._rootCause) == null;
    }

    @Override // defpackage.cav
    public final npH Z() {
        return this.R;
    }

    public final boolean c() {
        return ((Throwable) this._rootCause) != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final boolean e() {
        return this._isCompleting;
    }

    public final void m() {
        this._isCompleting = 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.StringBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    public final String toString() {
        StringBuilder U = opT.U("Finishing[cancelling=");
        U.append(c());
        U.append(", completing=");
        U.append((boolean) this._isCompleting);
        U.append(", rootCause=");
        U.append((Throwable) this._rootCause);
        U.append(", exceptions=");
        U.append(this._exceptionsHolder);
        U.append(", list=");
        U.append(this.R);
        U.append(']');
        return U.toString();
    }

    public final Throwable v() {
        return (Throwable) this._rootCause;
    }
}
