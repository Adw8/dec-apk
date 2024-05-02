package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;

/* renamed from: kQB  reason: default package */
/* loaded from: classes.dex */
public final class kQB {
    public int O;
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public Object f5287R;
    public int X;
    public int c;
    public int e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ Object f5288v;

    public /* synthetic */ kQB(fHP fhp, kwo kwo, fhh fhh, int i) {
        this.f5288v = fhp;
        this.f5287R = new WeakReference(kwo);
        iP5 ip5 = kwo.f5491R;
        fhh.getClass();
        this.R = fhh.N(ip5);
        this.v = fhh.N(kwo.f5516v);
        this.c = fhh.N(kwo.f5508c);
        this.e = fhh.N(kwo.f5512e);
        this.X = fhh.N(kwo.f5504X);
        this.O = i;
    }

    public static boolean R(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01de A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(defpackage.kwo r18, defpackage.M_ r19) {
        /*
        // Method dump skipped, instructions count: 711
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kQB.v(kwo, M_):void");
    }

    public /* synthetic */ kQB(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f5288v = constraintLayout;
        this.f5287R = constraintLayout2;
    }
}
