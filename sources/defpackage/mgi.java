package defpackage;

/* renamed from: mgi  reason: default package */
/* loaded from: classes.dex */
public enum mgi implements okg {
    Active,
    ActiveParent,
    Captured,
    Deactivated,
    DeactivatedParent,
    Inactive;

    public final boolean R() {
        int ordinal = ordinal();
        if (!(ordinal == 0 || ordinal == 1 || ordinal == 2)) {
            if (ordinal == 3 || ordinal == 4) {
                return true;
            }
            if (ordinal != 5) {
                throw new j8f((Object) null);
            }
        }
        return false;
    }

    public final boolean v() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (!(ordinal == 3 || ordinal == 4 || ordinal == 5)) {
                throw new j8f((Object) null);
            }
        }
        return false;
    }
}
