package defpackage;

/* renamed from: mtB  reason: default package */
/* loaded from: classes.dex */
public final class mtB implements f11 {
    public final /* synthetic */ int R;

    public /* synthetic */ mtB(int i) {
        this.R = i;
    }

    @Override // defpackage.f11
    public final nWQ R(cro cro) {
        switch (this.R) {
            case 0:
                return new cMC(7, mAC.START);
            default:
                return new i31(new cLw(cro, null));
        }
    }

    public final String toString() {
        switch (this.R) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
