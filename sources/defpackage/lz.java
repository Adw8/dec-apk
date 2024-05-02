package defpackage;

import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.List;

/* renamed from: lz  reason: default package */
/* loaded from: classes.dex */
public final class lz {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long f5874R;

    /* renamed from: R  reason: collision with other field name */
    public final aA f5875R;

    /* renamed from: R  reason: collision with other field name */
    public final cwX f5876R;

    /* renamed from: R  reason: collision with other field name */
    public final CharSequence f5877R;

    /* renamed from: R  reason: collision with other field name */
    public final List f5878R;

    /* renamed from: R  reason: collision with other field name */
    public final nUF f5879R;

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x0071 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.CharSequence, android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0270 A[LOOP:1: B:199:0x026e->B:200:0x0270, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lz(defpackage.aA r24, int r25, boolean r26, long r27) {
        /*
        // Method dump skipped, instructions count: 900
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz.<init>(aA, int, boolean, long):void");
    }

    public static void O(lz lzVar, Gp gp, a1 a1Var, float f, hpO hpo, ari ari) {
        Vw vw = lzVar.f5875R.f768R;
        vw.R(a1Var, n1P.e(lzVar.e(), lzVar.v()), f);
        vw.c(hpo);
        vw.e(ari);
        lzVar.X(gp);
    }

    public final nUF R(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        gvH gvh;
        CharSequence charSequence = this.f5877R;
        float e = e();
        aA aAVar = this.f5875R;
        Vw vw = aAVar.f768R;
        int i8 = aAVar.R;
        lht lht = aAVar.f773R;
        dWZ dwz = aAVar.f772R.f5282R;
        return new nUF(charSequence, e, vw, i, truncateAt, i8, (dwz == null || (gvh = dwz.f2656R) == null) ? true : gvh.f3988R, i3, i5, i6, i7, i4, i2, lht);
    }

    public final void X(Gp gp) {
        Canvas canvas = dO.R;
        Canvas canvas2 = ((W3) gp).R;
        if (this.f5879R.f6404c) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, e(), v());
        }
        nUF nuf = this.f5879R;
        int i = nuf.f6406v;
        if (i != 0) {
            canvas2.translate(0.0f, (float) i);
        }
        lAN lan = nuf.f6401R;
        lan.R = canvas2;
        nuf.f6399R.draw(lan);
        int i2 = nuf.f6406v;
        if (i2 != 0) {
            canvas2.translate(0.0f, ((float) -1) * ((float) i2));
        }
        if (this.f5879R.f6404c) {
            canvas2.restore();
        }
    }

    public final float c(int i, boolean z) {
        return z ? this.f5879R.O(i, false) : this.f5879R.L(i, false);
    }

    public final float e() {
        return (float) oys.Z(this.f5874R);
    }

    public final float v() {
        return (float) this.f5879R.R();
    }
}
