package defpackage;

/* renamed from: _n  reason: default package */
/* loaded from: classes.dex */
public final class _n implements FI {
    public static final _n R = new _n();

    @Override // defpackage.FI
    public final ncu R(boolean z) {
        if (((double) 1.0f) > 0.0d) {
            return new ep4(z);
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }

    @Override // defpackage.FI
    public final ncu v(ncu ncu, vV vVVar) {
        return ncu.I(new i3h(vVVar));
    }
}
