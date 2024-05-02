package defpackage;

/* renamed from: alX  reason: default package */
/* loaded from: classes.dex */
public enum alX {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public final iMP R() {
        switch (lad.v[ordinal()]) {
            case 1:
            case 2:
                return iMP.CREATED;
            case 3:
            case 4:
                return iMP.STARTED;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return iMP.RESUMED;
            case 6:
                return iMP.DESTROYED;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
