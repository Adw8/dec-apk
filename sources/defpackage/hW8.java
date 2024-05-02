package defpackage;

import java.util.List;

/* renamed from: hW8  reason: default package */
/* loaded from: classes.dex */
public final class hW8 extends hzt {
    public final /* synthetic */ int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hW8(bEu beu, List list, int i) {
        super(beu, list);
        this.e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int parseInt;
        switch (this.e) {
            case 0:
                R(false);
                return null;
            default:
                String R = R(true);
                if (R == null) {
                    parseInt = 1;
                } else {
                    try {
                        parseInt = Integer.parseInt(R);
                    } catch (NumberFormatException unused) {
                        return 1;
                    }
                }
                return Integer.valueOf(parseInt);
        }
    }
}
