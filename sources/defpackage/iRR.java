package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* renamed from: iRR  reason: default package */
/* loaded from: classes.dex */
public final class iRR {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final long f4589R;

    /* renamed from: R  reason: collision with other field name */
    public final hFN f4590R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f4591R;

    /* renamed from: R  reason: collision with other field name */
    public final pm5 f4592R;
    public final float v;

    public iRR(hFN hfn, pm5 pm5, long j) {
        this.f4590R = hfn;
        this.f4592R = pm5;
        this.f4589R = j;
        float f = 0.0f;
        this.R = pm5.f7261v.isEmpty() ? 0.0f : ((pps) pm5.f7261v.get(0)).f7288R.f5879R.v(0);
        if (!pm5.f7261v.isEmpty()) {
            pps pps = (pps) dF.zw(pm5.f7261v);
            nUF nuf = pps.f7288R.f5879R;
            f = nuf.v(nuf.f6397R - 1) + pps.R;
        }
        this.v = f;
        this.f4591R = pm5.f7257R;
    }

    public final bSG C(int i) {
        pm5 pm5 = this.f4592R;
        pm5.c(i);
        pps pps = (pps) pm5.f7261v.get(i == pm5.f7258R.R.length() ? pdD.i(pm5.f7261v) : cU5.X(i, pm5.f7261v));
        lz lzVar = pps.f7288R;
        return lzVar.f5879R.f6399R.getParagraphDirection(lzVar.f5879R.e(pps.R(i))) == 1 ? bSG.Ltr : bSG.Rtl;
    }

    public final float H(int i) {
        pm5 pm5 = this.f4592R;
        pm5.e(i);
        pps pps = (pps) pm5.f7261v.get(cU5.O(i, pm5.f7261v));
        return pps.f7288R.f5879R.X(i - pps.c) + pps.R;
    }

    public final int L(float f) {
        pm5 pm5 = this.f4592R;
        pps pps = (pps) pm5.f7261v.get(f <= 0.0f ? 0 : f >= pm5.v ? pdD.i(pm5.f7261v) : cU5.L(pm5.f7261v, f));
        int i = pps.f7289v;
        int i2 = pps.f7287R;
        if (i - i2 == 0) {
            return Math.max(0, i2 - 1);
        }
        nUF nuf = pps.f7288R.f5879R;
        return pps.c + nuf.f6399R.getLineForVertical(nuf.f6406v + ((int) (f - pps.R)));
    }

    public final long N(int i) {
        int i2;
        int i3;
        pm5 pm5 = this.f4592R;
        pm5.c(i);
        pps pps = (pps) pm5.f7261v.get(i == pm5.f7258R.R.length() ? pdD.i(pm5.f7261v) : cU5.X(i, pm5.f7261v));
        lz lzVar = pps.f7288R;
        int R = pps.R(i);
        mX0 mx0 = (mX0) lzVar.f5876R.getValue();
        gFY gfy = mx0.R;
        gfy.R(R);
        if (mx0.R.X(gfy.f3698R.preceding(R))) {
            gFY gfy2 = mx0.R;
            gfy2.R(R);
            i2 = R;
            while (i2 != -1) {
                if (gfy2.X(i2) && !gfy2.c(i2)) {
                    break;
                }
                gfy2.R(i2);
                i2 = gfy2.f3698R.preceding(i2);
            }
        } else {
            gFY gfy3 = mx0.R;
            gfy3.R(R);
            if (gfy3.e(R)) {
                if (!gfy3.f3698R.isBoundary(R) || gfy3.v(R)) {
                    i2 = gfy3.f3698R.preceding(R);
                } else {
                    i2 = R;
                }
            } else if (gfy3.v(R)) {
                i2 = gfy3.f3698R.preceding(R);
            } else {
                i2 = -1;
            }
        }
        if (i2 == -1) {
            i2 = R;
        }
        mX0 mx02 = (mX0) lzVar.f5876R.getValue();
        gFY gfy4 = mx02.R;
        gfy4.R(R);
        if (mx02.R.c(gfy4.f3698R.following(R))) {
            gFY gfy5 = mx02.R;
            gfy5.R(R);
            i3 = R;
            while (i3 != -1) {
                if (!gfy5.X(i3) && gfy5.c(i3)) {
                    break;
                }
                gfy5.R(i3);
                i3 = gfy5.f3698R.following(i3);
            }
        } else {
            gFY gfy6 = mx02.R;
            gfy6.R(R);
            if (gfy6.v(R)) {
                if (!gfy6.f3698R.isBoundary(R) || gfy6.e(R)) {
                    i3 = gfy6.f3698R.following(R);
                } else {
                    i3 = R;
                }
            } else if (gfy6.e(R)) {
                i3 = gfy6.f3698R.following(R);
            } else {
                i3 = -1;
            }
        }
        if (i3 != -1) {
            R = i3;
        }
        long e = dtx.e(i2, R);
        int i4 = odN.R;
        return dtx.e(((int) (e >> 32)) + pps.f7287R, odN.c(e) + pps.f7287R);
    }

    public final int O(int i) {
        pm5 pm5 = this.f4592R;
        pps pps = (pps) pm5.f7261v.get(i >= pm5.f7258R.R.length() ? pdD.i(pm5.f7261v) : i < 0 ? 0 : cU5.X(i, pm5.f7261v));
        return pps.f7288R.f5879R.e(pps.R(i)) + pps.c;
    }

    public final bSG R(int i) {
        pm5 pm5 = this.f4592R;
        pm5.c(i);
        pps pps = (pps) pm5.f7261v.get(i == pm5.f7258R.R.length() ? pdD.i(pm5.f7261v) : cU5.X(i, pm5.f7261v));
        return pps.f7288R.f5879R.f6399R.isRtlCharAt(pps.R(i)) ? bSG.Rtl : bSG.Ltr;
    }

    public final int U(long j) {
        pm5 pm5 = this.f4592R;
        pm5.getClass();
        float f = 0.0f;
        pps pps = (pps) pm5.f7261v.get(aWo.X(j) <= 0.0f ? 0 : aWo.X(j) >= pm5.v ? pdD.i(pm5.f7261v) : cU5.L(pm5.f7261v, aWo.X(j)));
        int i = pps.f7289v;
        int i2 = pps.f7287R;
        if (i - i2 == 0) {
            return Math.max(0, i2 - 1);
        }
        lz lzVar = pps.f7288R;
        long N = aH9.N(aWo.e(j), aWo.X(j) - pps.R);
        nUF nuf = lzVar.f5879R;
        int lineForVertical = nuf.f6399R.getLineForVertical(nuf.f6406v + ((int) aWo.X(N)));
        nUF nuf2 = lzVar.f5879R;
        float e = aWo.e(N);
        Layout layout = nuf2.f6399R;
        float f2 = (float) -1;
        if (lineForVertical == nuf2.f6397R - 1) {
            f = nuf2.R + nuf2.v;
        }
        return pps.f7287R + layout.getOffsetForHorizontal(lineForVertical, (f * f2) + e);
    }

    public final int X(int i, boolean z) {
        int i2;
        pm5 pm5 = this.f4592R;
        pm5.e(i);
        pps pps = (pps) pm5.f7261v.get(cU5.O(i, pm5.f7261v));
        lz lzVar = pps.f7288R;
        int i3 = i - pps.c;
        if (z) {
            nUF nuf = lzVar.f5879R;
            i2 = nuf.f6399R.getEllipsisStart(i3) == 0 ? nuf.f6399R.getLineVisibleEnd(i3) : nuf.f6399R.getEllipsisStart(i3) + nuf.f6399R.getLineStart(i3);
        } else {
            nUF nuf2 = lzVar.f5879R;
            i2 = nuf2.f6399R.getEllipsisStart(i3) == 0 ? nuf2.f6399R.getLineEnd(i3) : nuf2.f6399R.getText().length();
        }
        return i2 + pps.f7287R;
    }

    public final float Z(int i) {
        pm5 pm5 = this.f4592R;
        pm5.e(i);
        pps pps = (pps) pm5.f7261v.get(cU5.O(i, pm5.f7261v));
        lz lzVar = pps.f7288R;
        int i2 = i - pps.c;
        nUF nuf = lzVar.f5879R;
        return nuf.f6399R.getLineLeft(i2) + (i2 == nuf.f6397R + -1 ? nuf.R : 0.0f);
    }

    public final gIA c(int i) {
        pm5 pm5 = this.f4592R;
        pm5.c(i);
        pps pps = (pps) pm5.f7261v.get(i == pm5.f7258R.R.length() ? pdD.i(pm5.f7261v) : cU5.X(i, pm5.f7261v));
        lz lzVar = pps.f7288R;
        int R = pps.R(i);
        if (R >= 0 && R <= lzVar.f5877R.length()) {
            float O = lzVar.f5879R.O(R, false);
            int e = lzVar.f5879R.e(R);
            float X = lzVar.f5879R.X(e);
            float c = lzVar.f5879R.c(e);
            long N = aH9.N(0.0f, pps.R);
            return new gIA(aWo.e(N) + O, aWo.X(N) + X, aWo.e(N) + O, aWo.X(N) + c);
        }
        lzVar.getClass();
        StringBuilder C = opT.C("offset(", R, ") is out of bounds (0,");
        C.append(lzVar.f5877R.length());
        throw new AssertionError(C.toString());
    }

    public final float e(int i) {
        pm5 pm5 = this.f4592R;
        pm5.e(i);
        pps pps = (pps) pm5.f7261v.get(cU5.O(i, pm5.f7261v));
        return pps.f7288R.f5879R.c(i - pps.c) + pps.R;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iRR)) {
            return false;
        }
        iRR irr = (iRR) obj;
        if (!n3x.v(this.f4590R, irr.f4590R) || !n3x.v(this.f4592R, irr.f4592R) || !ltH.R(this.f4589R, irr.f4589R)) {
            return false;
        }
        if (!(this.R == irr.R)) {
            return false;
        }
        return ((this.v > irr.v ? 1 : (this.v == irr.v ? 0 : -1)) == 0) && n3x.v(this.f4591R, irr.f4591R);
    }

    public final int hashCode() {
        int hashCode = this.f4592R.hashCode();
        return this.f4591R.hashCode() + jQ.c(this.v, jQ.c(this.R, opT.X(this.f4589R, (hashCode + (this.f4590R.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final float m(int i) {
        pm5 pm5 = this.f4592R;
        pm5.e(i);
        pps pps = (pps) pm5.f7261v.get(cU5.O(i, pm5.f7261v));
        lz lzVar = pps.f7288R;
        int i2 = i - pps.c;
        nUF nuf = lzVar.f5879R;
        return nuf.f6399R.getLineRight(i2) + (i2 == nuf.f6397R + -1 ? nuf.v : 0.0f);
    }

    public final String toString() {
        StringBuilder U = opT.U("TextLayoutResult(layoutInput=");
        U.append(this.f4590R);
        U.append(", multiParagraph=");
        U.append(this.f4592R);
        U.append(", size=");
        U.append((Object) ltH.c(this.f4589R));
        U.append(", firstBaseline=");
        U.append(this.R);
        U.append(", lastBaseline=");
        U.append(this.v);
        U.append(", placeholderRects=");
        U.append(this.f4591R);
        U.append(')');
        return U.toString();
    }

    public final gIA v(int i) {
        float f;
        float f2;
        pm5 pm5 = this.f4592R;
        if (i >= 0 && i < pm5.f7258R.R.R.length()) {
            pps pps = (pps) pm5.f7261v.get(cU5.X(i, pm5.f7261v));
            lz lzVar = pps.f7288R;
            int R = pps.R(i);
            nUF nuf = lzVar.f5879R;
            int e = nuf.e(R);
            float X = nuf.X(e);
            float c = nuf.c(e);
            boolean z = nuf.f6399R.getParagraphDirection(e) == 1;
            boolean isRtlCharAt = nuf.f6399R.isRtlCharAt(R);
            if (z && !isRtlCharAt) {
                f2 = nuf.O(R, false);
                f = nuf.O(R + 1, true);
            } else if (z && isRtlCharAt) {
                f = nuf.L(R, false);
                f2 = nuf.L(R + 1, true);
            } else if (isRtlCharAt) {
                f = nuf.O(R, false);
                f2 = nuf.O(R + 1, true);
            } else {
                f2 = nuf.L(R, false);
                f = nuf.L(R + 1, true);
            }
            RectF rectF = new RectF(f2, X, f, c);
            float f3 = rectF.left;
            float f4 = rectF.top;
            float f5 = rectF.right;
            float f6 = rectF.bottom;
            long N = aH9.N(0.0f, pps.R);
            return new gIA(aWo.e(N) + f3, aWo.X(N) + f4, aWo.e(N) + f5, aWo.X(N) + f6);
        }
        pm5.getClass();
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + pm5.f7258R.R.length() + ')').toString());
    }

    public final int x(int i) {
        pm5 pm5 = this.f4592R;
        pm5.e(i);
        pps pps = (pps) pm5.f7261v.get(cU5.O(i, pm5.f7261v));
        return pps.f7288R.f5879R.f6399R.getLineStart(i - pps.c) + pps.f7287R;
    }
}
