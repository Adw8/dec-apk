package defpackage;

import java.io.Serializable;

/* renamed from: _5  reason: default package */
/* loaded from: classes.dex */
public final class _5 implements nbD, Serializable {
    public final hdJ R;

    /* renamed from: R  reason: collision with other field name */
    public final nbD f679R;

    public _5(hdJ hdj, nbD nbd) {
        this.f679R = nbd;
        this.R = hdj;
    }

    @Override // defpackage.nbD
    public final nbD H(e86 e86) {
        if (this.R.O(e86) != null) {
            return this.f679R;
        }
        nbD H = this.f679R.H(e86);
        return H == this.f679R ? this : H == aIH.R ? this.R : new _5(this.R, H);
    }

    @Override // defpackage.nbD
    public final nbD M(nbD nbd) {
        return jjU.t(this, nbd);
    }

    @Override // defpackage.nbD
    public final hdJ O(e86 e86) {
        while (true) {
            hdJ O = this.R.O(e86);
            if (O != null) {
                return O;
            }
            nbD nbd = this.f679R;
            if (!(nbd instanceof _5)) {
                return nbd.O(e86);
            }
            this = (_5) nbd;
        }
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof _5)) {
                return false;
            }
            _5 _5 = (_5) obj;
            _5.getClass();
            int i = 2;
            _5 _52 = _5;
            int i2 = 2;
            while (true) {
                nbD nbd = _52.f679R;
                _52 = nbd instanceof _5 ? (_5) nbd : null;
                if (_52 == null) {
                    break;
                }
                i2++;
            }
            _5 _53 = this;
            while (true) {
                nbD nbd2 = _53.f679R;
                _53 = nbd2 instanceof _5 ? (_5) nbd2 : null;
                if (_53 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            while (true) {
                hdJ hdj = this.R;
                if (n3x.v(_5.O(hdj.R()), hdj)) {
                    nbD nbd3 = this.f679R;
                    if (!(nbd3 instanceof _5)) {
                        hdJ hdj2 = (hdJ) nbd3;
                        z = n3x.v(_5.O(hdj2.R()), hdj2);
                        break;
                    }
                    this = (_5) nbd3;
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.R.hashCode() + this.f679R.hashCode();
    }

    @Override // defpackage.nbD
    public final Object o(Object obj, iv7 iv7) {
        return iv7.J(this.f679R.o(obj, iv7), this.R);
    }

    @Override // java.lang.Object
    public final String toString() {
        return '[' + ((String) o("", go2.N)) + ']';
    }
}
