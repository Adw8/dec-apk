package defpackage;

import android.view.View;

/* renamed from: g59  reason: default package */
/* loaded from: classes.dex */
public final class g59 extends pvx {
    public final /* synthetic */ int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public g59(int i, int i2) {
        super(i, Boolean.class, 0, 28);
        this.e = i2;
    }

    public final Boolean e(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(fKW.e(view));
            default:
                return Boolean.valueOf(fKW.c(view));
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g59(int i, Class cls, int i2, int i3, int i4) {
        super(i, cls, i2, i3);
        this.e = i4;
    }
}
