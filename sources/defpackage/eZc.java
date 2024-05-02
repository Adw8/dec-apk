package defpackage;

import java.util.WeakHashMap;

/* renamed from: eZc  reason: default package */
/* loaded from: classes.dex */
public final class eZc implements Runnable {
    public final /* synthetic */ olv R;
    public final /* synthetic */ int e;

    public /* synthetic */ eZc(olv olv, int i) {
        this.e = i;
        this.R = olv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 1:
                aYp ayp = this.R.f6917R;
                if (ayp != null) {
                    ayp.setListSelectionHidden(true);
                    ayp.requestLayout();
                    return;
                }
                return;
            default:
                aYp ayp2 = this.R.f6917R;
                if (ayp2 != null) {
                    WeakHashMap weakHashMap = of5.f6887R;
                    if (d6y.v(ayp2) && this.R.f6917R.getCount() > this.R.f6917R.getChildCount()) {
                        int childCount = this.R.f6917R.getChildCount();
                        olv olv = this.R;
                        if (childCount <= olv.x) {
                            olv.R.setInputMethodMode(2);
                            this.R.Z();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
