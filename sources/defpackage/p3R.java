package defpackage;

/* renamed from: p3R  reason: default package */
/* loaded from: classes.dex */
public final class p3R {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final dOj f7063R;
    public int c = -1;
    public int e = -1;
    public int v;

    public p3R(bz bzVar, long j) {
        this.f7063R = new dOj(bzVar.R);
        this.R = odN.X(j);
        this.v = odN.e(j);
        int X = odN.X(j);
        int e = odN.e(j);
        if (X < 0 || X > bzVar.length()) {
            StringBuilder C = opT.C("start (", X, ") offset is outside of text region ");
            C.append(bzVar.length());
            throw new IndexOutOfBoundsException(C.toString());
        } else if (e < 0 || e > bzVar.length()) {
            StringBuilder C2 = opT.C("end (", e, ") offset is outside of text region ");
            C2.append(bzVar.length());
            throw new IndexOutOfBoundsException(C2.toString());
        } else if (X > e) {
            throw new IllegalArgumentException(jQ.U("Do not set reversed range: ", X, " > ", e));
        }
    }

    public final void L(int i, int i2) {
        if (i < 0 || i > this.f7063R.R()) {
            StringBuilder C = opT.C("start (", i, ") offset is outside of text region ");
            C.append(this.f7063R.R());
            throw new IndexOutOfBoundsException(C.toString());
        } else if (i2 < 0 || i2 > this.f7063R.R()) {
            StringBuilder C2 = opT.C("end (", i2, ") offset is outside of text region ");
            C2.append(this.f7063R.R());
            throw new IndexOutOfBoundsException(C2.toString());
        } else if (i <= i2) {
            m(i);
            Z(i2);
        } else {
            throw new IllegalArgumentException(jQ.U("Do not set reversed range: ", i, " > ", i2));
        }
    }

    public final void O(int i, int i2) {
        if (i < 0 || i > this.f7063R.R()) {
            StringBuilder C = opT.C("start (", i, ") offset is outside of text region ");
            C.append(this.f7063R.R());
            throw new IndexOutOfBoundsException(C.toString());
        } else if (i2 < 0 || i2 > this.f7063R.R()) {
            StringBuilder C2 = opT.C("end (", i2, ") offset is outside of text region ");
            C2.append(this.f7063R.R());
            throw new IndexOutOfBoundsException(C2.toString());
        } else if (i < i2) {
            this.c = i;
            this.e = i2;
        } else {
            throw new IllegalArgumentException(jQ.U("Do not set reversed or empty range: ", i, " > ", i2));
        }
    }

    public final void R(int i, int i2) {
        long e = dtx.e(i, i2);
        this.f7063R.v(i, i2, "");
        long t = cU5.t(dtx.e(this.R, this.v), e);
        m(odN.X(t));
        Z(odN.e(t));
        int i3 = this.c;
        if (i3 != -1) {
            long t2 = cU5.t(dtx.e(i3, this.e), e);
            if (odN.v(t2)) {
                this.c = -1;
                this.e = -1;
                return;
            }
            this.c = odN.X(t2);
            this.e = odN.e(t2);
        }
    }

    public final void X(int i, int i2, String str) {
        if (i < 0 || i > this.f7063R.R()) {
            StringBuilder C = opT.C("start (", i, ") offset is outside of text region ");
            C.append(this.f7063R.R());
            throw new IndexOutOfBoundsException(C.toString());
        } else if (i2 < 0 || i2 > this.f7063R.R()) {
            StringBuilder C2 = opT.C("end (", i2, ") offset is outside of text region ");
            C2.append(this.f7063R.R());
            throw new IndexOutOfBoundsException(C2.toString());
        } else if (i <= i2) {
            this.f7063R.v(i, i2, str);
            m(str.length() + i);
            Z(str.length() + i);
            this.c = -1;
            this.e = -1;
        } else {
            throw new IllegalArgumentException(jQ.U("Do not set reversed range: ", i, " > ", i2));
        }
    }

    public final void Z(int i) {
        if (i >= 0) {
            this.v = i;
            return;
        }
        throw new IllegalArgumentException(opT.Z("Cannot set selectionEnd to a negative value: ", i).toString());
    }

    public final odN c() {
        int i = this.c;
        if (i != -1) {
            return new odN(dtx.e(i, this.e));
        }
        return null;
    }

    public final int e() {
        return this.f7063R.R();
    }

    public final void m(int i) {
        if (i >= 0) {
            this.R = i;
            return;
        }
        throw new IllegalArgumentException(opT.Z("Cannot set selectionStart to a negative value: ", i).toString());
    }

    public final String toString() {
        return this.f7063R.toString();
    }

    public final char v(int i) {
        int i2;
        dOj doj = this.f7063R;
        ma7 ma7 = doj.f2600R;
        if (ma7 != null && i >= (i2 = doj.R)) {
            int i3 = ma7.v;
            int i4 = ma7.e;
            int i5 = ma7.c;
            int i6 = i3 - (i4 - i5);
            if (i >= i6 + i2) {
                return doj.f2599R.charAt(i - ((i6 - doj.v) + i2));
            }
            int i7 = i - i2;
            return i7 < i5 ? ((char[]) ma7.f6078R)[i7] : ((char[]) ma7.f6078R)[(i7 - i5) + i4];
        }
        return doj.f2599R.charAt(i);
    }
}
