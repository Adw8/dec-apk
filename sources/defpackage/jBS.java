package defpackage;

/* renamed from: jBS  reason: default package */
/* loaded from: classes.dex */
public final class jBS implements bpk, B8 {
    public final dAd R;

    /* renamed from: R  reason: collision with other field name */
    public final mdz f4852R;

    /* renamed from: R  reason: collision with other field name */
    public final oey f4853R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4854R;

    public jBS(oey oey, dAd dad, boolean z, mdz mdz) {
        this.f4853R = oey;
        this.R = dad;
        this.f4854R = z;
        this.f4852R = mdz;
    }

    public static final boolean m(i4C i4c, jBS jbs) {
        return i4c.v < jbs.f4853R.L().O() - 1;
    }

    public final boolean c(i4C i4c, int i) {
        if (!(i == 1)) {
            if (i == 2) {
                return m(i4c, this);
            }
            if (!(i == 5)) {
                if (!(i == 6)) {
                    if (i == 3) {
                        int ordinal = this.f4852R.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new j8f((Object) null);
                            } else if (!this.f4854R) {
                                return m(i4c, this);
                            } else {
                                if (i4c.R <= 0) {
                                    return false;
                                }
                            }
                        } else if (this.f4854R) {
                            return m(i4c, this);
                        } else {
                            if (i4c.R <= 0) {
                                return false;
                            }
                        }
                    } else {
                        if (i == 4) {
                            int ordinal2 = this.f4852R.ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    throw new j8f((Object) null);
                                } else if (this.f4854R) {
                                    return m(i4c, this);
                                } else {
                                    if (i4c.R <= 0) {
                                        return false;
                                    }
                                }
                            } else if (!this.f4854R) {
                                return m(i4c, this);
                            } else {
                                if (i4c.R <= 0) {
                                    return false;
                                }
                            }
                        } else {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                        }
                    }
                } else if (!this.f4854R) {
                    return m(i4c, this);
                } else {
                    if (i4c.R <= 0) {
                        return false;
                    }
                }
            } else if (this.f4854R) {
                return m(i4c, this);
            } else {
                if (i4c.R <= 0) {
                    return false;
                }
            }
        } else if (i4c.R <= 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.bpk
    public final Object getValue() {
        return this;
    }

    @Override // defpackage.bpk
    public final bsy r() {
        return hV.R;
    }
}
