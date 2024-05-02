package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: hgO  reason: default package */
/* loaded from: classes.dex */
public final class hgO implements f21 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater R = AtomicReferenceFieldUpdater.newUpdater(hgO.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state;

    public hgO(boolean z) {
        this._state = z ? mxC.f6245R : mxC.v;
    }

    public final Object R(Object obj, aOO aoo) {
        if (v(obj)) {
            return o8s.R;
        }
        xx x = n3x.x(n3x.U(aoo));
        lAz laz = new lAz(this, obj, x);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof iNr) {
                iNr inr = (iNr) obj2;
                if (inr.R != mxC.e) {
                    R.compareAndSet(this, obj2, new c81(inr.R));
                } else {
                    if (R.compareAndSet(this, obj2, obj == null ? mxC.f6245R : new iNr(obj))) {
                        x.h(o8s.R, x.e, new Wn(this, 7, obj));
                        break;
                    }
                }
            } else if (obj2 instanceof c81) {
                c81 c81 = (c81) obj2;
                if (c81.owner != obj) {
                    do {
                    } while (!c81.j().H(laz, c81));
                    if (this._state == obj2 || !fGd.R.compareAndSet(laz, 0, 1)) {
                        break;
                    }
                    laz = new lAz(this, obj, x);
                } else {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
            } else if (obj2 instanceof a7C) {
                ((a7C) obj2).R(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
        x.y(new aYe(laz));
        Object P = x.P();
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        if (P != bgr) {
            P = o8s.R;
        }
        return P == bgr ? P : o8s.R;
    }

    public final void c(Object obj) {
        oLj olj;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof iNr) {
                if (obj == null) {
                    if (((iNr) obj2).R == mxC.e) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    iNr inr = (iNr) obj2;
                    if (inr.R != obj) {
                        z = false;
                    }
                    if (!z) {
                        StringBuilder U = opT.U("Mutex is locked by ");
                        U.append(inr.R);
                        U.append(" but expected ");
                        U.append(obj);
                        throw new IllegalStateException(U.toString().toString());
                    }
                }
                if (R.compareAndSet(this, obj2, mxC.v)) {
                    return;
                }
            } else if (obj2 instanceof a7C) {
                ((a7C) obj2).R(this);
            } else if (obj2 instanceof c81) {
                if (obj != null) {
                    c81 c81 = (c81) obj2;
                    if (c81.owner != obj) {
                        z = false;
                    }
                    if (!z) {
                        StringBuilder U2 = opT.U("Mutex is locked by ");
                        U2.append(c81.owner);
                        U2.append(" but expected ");
                        U2.append(obj);
                        throw new IllegalStateException(U2.toString().toString());
                    }
                }
                c81 c812 = (c81) obj2;
                while (true) {
                    olj = (oLj) c812.N();
                    if (olj == c812) {
                        olj = null;
                        break;
                    } else if (olj.V()) {
                        break;
                    } else {
                        ((joD) olj.N()).R.t();
                    }
                }
                if (olj == null) {
                    h4l h4l = new h4l(c812);
                    if (R.compareAndSet(this, obj2, h4l) && h4l.R(this) == null) {
                        return;
                    }
                } else {
                    fGd fgd = (fGd) olj;
                    if (fgd.h()) {
                        Object obj3 = fgd.f3367R;
                        if (obj3 == null) {
                            obj3 = mxC.c;
                        }
                        c812.owner = obj3;
                        fgd.Y();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public final String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof iNr) {
                StringBuilder U = opT.U("Mutex[");
                U.append(((iNr) obj).R);
                U.append(']');
                return U.toString();
            } else if (obj instanceof a7C) {
                ((a7C) obj).R(this);
            } else if (obj instanceof c81) {
                StringBuilder U2 = opT.U("Mutex[");
                U2.append(((c81) obj).owner);
                U2.append(']');
                return U2.toString();
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }

    public final boolean v(Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof iNr) {
                if (((iNr) obj2).R != mxC.e) {
                    return false;
                }
                if (R.compareAndSet(this, obj2, obj == null ? mxC.f6245R : new iNr(obj))) {
                    return true;
                }
            } else if (obj2 instanceof c81) {
                if (((c81) obj2).owner == obj) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (obj2 instanceof a7C) {
                ((a7C) obj2).R(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }
}
