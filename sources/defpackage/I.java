package defpackage;

/* renamed from: I  reason: default package */
/* loaded from: classes.dex */
public final class I extends O {
    public final lfP R;

    public I(lfP lfp) {
        if (lfp != null) {
            this.R = lfp;
            return;
        }
        throw new NullPointerException("'baseGraphicString' cannot be null");
    }

    @Override // defpackage.O
    public final boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.i(7, z);
        zz.g(false, 25, this.R.R);
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return this.R.Y(z);
    }

    @Override // defpackage.O, defpackage.t
    public final int hashCode() {
        return ~this.R.hashCode();
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (!(o instanceof I)) {
            return false;
        }
        return this.R.o(((I) o).R);
    }

    @Override // defpackage.O
    public final O u() {
        lfP lfp = this.R;
        lfp.getClass();
        return lfp == this.R ? this : new I(lfp);
    }

    @Override // defpackage.O
    public final O z() {
        lfP lfp = this.R;
        lfp.getClass();
        return lfp == this.R ? this : new I(lfp);
    }
}
