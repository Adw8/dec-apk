package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: jvD  reason: default package */
/* loaded from: classes.dex */
public final class jvD extends kst {
    public final /* synthetic */ int R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jvD(iOp iop, int i) {
        super(iop);
        this.R = i;
    }

    @Override // defpackage.kst
    public final void y() {
        switch (this.R) {
            case 0:
                iOp iop = ((kst) this).f5455R;
                iop.f4576v = null;
                CheckableImageButton checkableImageButton = iop.f4577v;
                checkableImageButton.setOnLongClickListener(null);
                mxC.h(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
