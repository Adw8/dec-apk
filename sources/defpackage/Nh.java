package defpackage;

import java.util.Collection;

/* renamed from: Nh  reason: default package */
/* loaded from: classes.dex */
public final class Nh extends Lw {
    public final /* synthetic */ int R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Nh(k49 k49, int i) {
        super(k49);
        this.R = i;
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        switch (this.R) {
            case 0:
                mot.R();
                for (Object obj2 : (Collection) obj) {
                    super.f284R.O(mot, obj2);
                }
                ((dfN) mot).k(1, 2, ']');
                return;
            default:
                mot.R();
                for (Object obj3 : (Collection) obj) {
                    super.f284R.O(mot, obj3);
                }
                ((dfN) mot).k(1, 2, ']');
                return;
        }
    }

    @Override // defpackage.k49
    public final /* bridge */ /* synthetic */ Object R(csz csz) {
        switch (this.R) {
            case 0:
                return L(csz);
            default:
                return L(csz);
        }
    }
}
