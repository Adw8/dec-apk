package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.view.inputmethod.ExtractedText;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import dev.kdrag0n.virtcontainer.R;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: gQc  reason: default package */
/* loaded from: classes.dex */
public abstract class gQc {
    public static nUO R;

    public static final long A(double d) {
        return r((float) d, 4294967296L);
    }

    public static final Typeface B(Typeface typeface, aKW akw, Context context) {
        ThreadLocal threadLocal = dYl.R;
        if (typeface == null) {
            return null;
        }
        if (akw.R.isEmpty()) {
            return typeface;
        }
        Paint paint = (Paint) dYl.R.get();
        if (paint == null) {
            paint = new Paint();
            dYl.R.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(Y(akw.R, null, new mox(9, v(context)), 31));
        return paint.getTypeface();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object C(defpackage.dmk r5, float r6, defpackage.jM r7, defpackage.aOO r8) {
        /*
            boolean r0 = r8 instanceof defpackage.e6b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            e6b r0 = (defpackage.e6b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            e6b r0 = new e6b
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f2978R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            eLb r5 = r0.R
            defpackage.jjU.o(r8)
            goto L_0x004d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            defpackage.jjU.o(r8)
            eLb r8 = new eLb
            r8.<init>()
            lb4 r2 = new lb4
            r4 = 0
            r2.<init>(r6, r7, r8, r4)
            r0.R = r8
            r0.e = r3
            gRY r6 = defpackage.gRY.Default
            java.lang.Object r5 = r5.R(r6, r2, r0)
            if (r5 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r5 = r8
        L_0x004d:
            float r5 = r5.R
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gQc.C(dmk, float, jM, aOO):java.lang.Object");
    }

    public static boolean D(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static final long E(long j, long j2) {
        float e = nqW.e(j);
        long j3 = he3.f4327R;
        boolean z = true;
        if (j2 != j3) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * e;
            float v = nqW.v(j);
            if (j2 == j3) {
                z = false;
            }
            if (z) {
                return n1P.e(intBitsToFloat, Float.intBitsToFloat((int) (j2 & 4294967295L)) * v);
            }
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    public static final ExtractedText F(d5M d5m) {
        ExtractedText extractedText = new ExtractedText();
        String str = d5m.f2488R.R;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = odN.X(d5m.R);
        extractedText.selectionEnd = odN.e(d5m.R);
        extractedText.flags = !iH_.h(d5m.f2488R.R, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final Resources G(m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.x(ur.R);
        return ((Context) jr_.x(ur.f7428R)).getResources();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r5 > r6) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r5 < r6) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r0 > r2) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r0 < r2) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long H(int[] r5, long r6) {
        /*
            float r0 = defpackage.aWo.e(r6)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 < 0) goto L_0x001a
            r0 = r5[r2]
            float r0 = (float) r0
            float r0 = r0 * r3
            float r2 = defpackage.aWo.e(r6)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0027
        L_0x0018:
            r0 = r2
            goto L_0x0027
        L_0x001a:
            r0 = r5[r2]
            float r0 = (float) r0
            float r0 = r0 * r3
            float r2 = defpackage.aWo.e(r6)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0027
            goto L_0x0018
        L_0x0027:
            float r2 = defpackage.aWo.X(r6)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r2 = 1
            if (r1 < 0) goto L_0x003e
            r5 = r5[r2]
            float r5 = (float) r5
            float r5 = r5 * r3
            float r6 = defpackage.aWo.X(r6)
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x004b
        L_0x003c:
            r5 = r6
            goto L_0x004b
        L_0x003e:
            r5 = r5[r2]
            float r5 = (float) r5
            float r5 = r5 * r3
            float r6 = defpackage.aWo.X(r6)
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x004b
            goto L_0x003c
        L_0x004b:
            long r5 = defpackage.aH9.N(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gQc.H(int[], long):long");
    }

    public static final float I(Layout layout, int i, Paint paint) {
        float f;
        float f2;
        float lineLeft = layout.getLineLeft(i);
        kSh ksh = dVA.R;
        if (!(layout.getEllipsisCount(i) > 0) || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : bNu.R[paragraphAlignment.ordinal()]) == 1) {
            f = Math.abs(lineLeft);
            f2 = (((float) layout.getWidth()) - measureText) / 2.0f;
        } else {
            f = Math.abs(lineLeft);
            f2 = ((float) layout.getWidth()) - measureText;
        }
        return f2 + f;
    }

    public static final long J(int i, int i2, boolean z, boolean z2) {
        return i2 == 0 ? dtx.e(i, i) : i == 0 ? z ? dtx.e(1, 0) : dtx.e(0, 1) : i == i2 ? z ? dtx.e(i2 - 1, i2) : dtx.e(i2, i2 - 1) : z ? !z2 ? dtx.e(i - 1, i) : dtx.e(i + 1, i) : !z2 ? dtx.e(i, i + 1) : dtx.e(i, i - 1);
    }

    public static final gLv K(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(a6.B(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(z((kMB) it.next()));
            }
            return new gLv(cls, null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(a6.B(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(z((kMB) it2.next()));
            }
            return new gLv(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            gLv K = K(declaringClass, list.subList(length, list.size()));
            List<kMB> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(a6.B(subList, 10));
            for (kMB kmb : subList) {
                arrayList3.add(z(kmb));
            }
            return new gLv(cls, K, arrayList3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void L(defpackage.i5Q r22, java.util.Map r23, defpackage.m88 r24, int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 410
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gQc.L(i5Q, java.util.Map, m88, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object M(int r5, java.lang.Object r6, defpackage.pa3 r7, defpackage.lIe r8, int r9) {
        /*
            boolean r0 = r6 instanceof android.graphics.Typeface
            if (r0 != 0) goto L_0x0005
            return r6
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r5 != r1) goto L_0x000b
            r2 = r1
            goto L_0x000c
        L_0x000b:
            r2 = r0
        L_0x000c:
            if (r2 != 0) goto L_0x0019
            r2 = 2
            if (r5 != r2) goto L_0x0013
            r2 = r1
            goto L_0x0014
        L_0x0013:
            r2 = r0
        L_0x0014:
            if (r2 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r2 = r0
            goto L_0x001a
        L_0x0019:
            r2 = r1
        L_0x001a:
            if (r2 == 0) goto L_0x003b
            r2 = r7
            b8Y r2 = (defpackage.b8Y) r2
            lIe r3 = r2.f1540R
            boolean r3 = defpackage.n3x.v(r3, r8)
            if (r3 != 0) goto L_0x003b
            lIe r3 = defpackage.lIe.R
            lIe r3 = defpackage.lIe.c
            int r4 = r8.compareTo(r3)
            if (r4 < 0) goto L_0x003b
            lIe r2 = r2.f1540R
            int r2 = r2.compareTo(r3)
            if (r2 >= 0) goto L_0x003b
            r2 = r1
            goto L_0x003c
        L_0x003b:
            r2 = r0
        L_0x003c:
            if (r5 != r1) goto L_0x0040
            r3 = r1
            goto L_0x0041
        L_0x0040:
            r3 = r0
        L_0x0041:
            if (r3 != 0) goto L_0x004e
            r3 = 3
            if (r5 != r3) goto L_0x0048
            r5 = r1
            goto L_0x0049
        L_0x0048:
            r5 = r0
        L_0x0049:
            if (r5 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r5 = r0
            goto L_0x004f
        L_0x004e:
            r5 = r1
        L_0x004f:
            if (r5 == 0) goto L_0x005f
            r5 = r7
            b8Y r5 = (defpackage.b8Y) r5
            int r5 = r5.v
            if (r9 != r5) goto L_0x005a
            r5 = r1
            goto L_0x005b
        L_0x005a:
            r5 = r0
        L_0x005b:
            if (r5 != 0) goto L_0x005f
            r5 = r1
            goto L_0x0060
        L_0x005f:
            r5 = r0
        L_0x0060:
            if (r5 != 0) goto L_0x0065
            if (r2 != 0) goto L_0x0065
            return r6
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            int r8 = r8.f5651e
            goto L_0x0071
        L_0x006a:
            r8 = r7
            b8Y r8 = (defpackage.b8Y) r8
            lIe r8 = r8.f1540R
            int r8 = r8.f5651e
        L_0x0071:
            if (r5 == 0) goto L_0x0077
            if (r9 != r1) goto L_0x007e
        L_0x0075:
            r0 = r1
            goto L_0x007e
        L_0x0077:
            b8Y r7 = (defpackage.b8Y) r7
            int r5 = r7.v
            if (r5 != r1) goto L_0x007e
            goto L_0x0075
        L_0x007e:
            p2v r5 = defpackage.p2v.R
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = r5.R(r6, r8, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gQc.M(int, java.lang.Object, pa3, lIe, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void O(int r36, defpackage.ncu r37, defpackage.aD8 r38, boolean r39, float r40, boolean r41, defpackage.n4N r42, defpackage.kg9 r43, defpackage.ngd r44, boolean r45, defpackage.ky r46, defpackage.vV r47, defpackage.bBk r48, defpackage.m88 r49, int r50, int r51, int r52) {
        /*
        // Method dump skipped, instructions count: 1212
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gQc.O(int, ncu, aD8, boolean, float, boolean, n4N, kg9, ngd, boolean, ky, vV, bBk, m88, int, int, int):void");
    }

    public static final Bitmap P(aCQ acq) {
        if (acq instanceof lC) {
            return ((lC) acq).R;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final LifecycleCoroutineScopeImpl Q(nu_ nu_) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        m4i O = nu_.O();
        while (true) {
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) ((aLd) O).R.get();
            if (lifecycleCoroutineScopeImpl == null) {
                pyX pyx = new pyX(null);
                h8R h8r = iFn.R;
                hBL hbl = (hBL) hJr.R;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(O, jjU.t(pyx, hbl.f4160R));
                if (((aLd) O).R.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                    l6.z(lifecycleCoroutineScopeImpl, hbl.f4160R, 0, new btq(lifecycleCoroutineScopeImpl, null), 2);
                    break;
                }
            } else {
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x033b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x035f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(java.lang.String r37, defpackage.kg9 r38, defpackage.ncu r39, boolean r40, boolean r41, defpackage.kMk r42, defpackage.abA r43, defpackage.eIr r44, boolean r45, int r46, defpackage.iuk r47, defpackage.kg9 r48, defpackage.p2E r49, defpackage.a1 r50, defpackage.lR3 r51, defpackage.m88 r52, int r53, int r54, int r55) {
        /*
        // Method dump skipped, instructions count: 1089
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gQc.R(java.lang.String, kg9, ncu, boolean, boolean, kMk, abA, eIr, boolean, int, iuk, kg9, p2E, a1, lR3, m88, int, int, int):void");
    }

    public static final long S(int i) {
        return r((float) i, 4294967296L);
    }

    public static final boolean T(long j) {
        lqt[] lqtArr = eT9.R;
        return (j & 1095216660480L) == 0;
    }

    public static final String U(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        pvc l = a6.l(type, ldb.R);
        StringBuilder sb = new StringBuilder();
        sb.append(((Class) iOY.f(l)).getName());
        Iterator it = l.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        sb.append(iH_.f(i, "[]"));
        return sb.toString();
    }

    public static final boolean W(eBF ebf) {
        return (ebf.f3012R == null && ebf.f3018R == null && ebf.f3017R == null) ? false : true;
    }

    public static final void X(jww jww, String str, ncu ncu, mz mzVar, cZB czb, float f, Iw iw, m88 m88, int i, int i2) {
        ncu ncu2;
        jr_ jr_ = (jr_) m88;
        jr_.q(1142754848);
        ncu ncu3 = (i2 & 4) != 0 ? aff.R : ncu;
        mz mzVar2 = (i2 & 8) != 0 ? dq.X : mzVar;
        cZB czb2 = (i2 & 16) != 0 ? dq.f2878R : czb;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        Iw iw2 = (i2 & 64) != 0 ? null : iw;
        jr_.w(-816794123);
        if (str != null) {
            aff aff = aff.R;
            jr_.w(1157296644);
            boolean O = jr_.O(str);
            Object I = jr_.I();
            if (O || I == ppN.R) {
                I = new oF_(str, 0);
                jr_.ZW(I);
            }
            jr_.g(false);
            ncu2 = cU5.N(aff, false, (kg9) I);
        } else {
            ncu2 = aff.R;
        }
        jr_.g(false);
        ncu vr = msU.vr(y(ncu3.I(ncu2)), jww, mzVar2, czb2, f2, iw2, 2);
        doq doq = doq.R;
        jr_.w(-1323940314);
        jJj jjj = (jJj) jr_.x(lnF.X);
        mdz mdz = (mdz) jr_.x(lnF.H);
        bUo buo = (bUo) jr_.x(lnF.P);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(vr);
        if (jr_.f5052R instanceof Su) {
            jr_.mL();
            if (jr_.f5050L) {
                jr_.H(fme);
            } else {
                jr_.BF();
            }
            jr_.f5078e = false;
            l6.p(jr_, doq, igT.c);
            l6.p(jr_, jjj, igT.v);
            l6.p(jr_, mdz, igT.e);
            jQ.o(0, b, jQ.m(jr_, buo, igT.X, jr_), jr_, 2058660585, -2077995625);
            jr_.g(false);
            jr_.g(false);
            jr_.g(true);
            jr_.g(false);
            dYh t = jr_.t();
            if (t != null) {
                t.f2666R = new juh(jww, str, ncu3, mzVar2, czb2, f2, iw2, i, i2);
                return;
            }
            return;
        }
        l6.u();
        throw null;
    }

    public static String Y(ArrayList arrayList, String str, mox mox, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = "";
        String str3 = (i & 2) != 0 ? str2 : null;
        if ((i & 4) == 0) {
            str2 = null;
        }
        int i2 = (i & 8) != 0 ? -1 : 0;
        String str4 = (i & 16) != 0 ? "..." : null;
        if ((i & 32) != 0) {
            mox = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str3);
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = arrayList.get(i4);
            i3++;
            boolean z = true;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (mox != null) {
                sb.append((CharSequence) mox.x(obj));
            } else {
                if (obj != null) {
                    z = obj instanceof CharSequence;
                }
                if (z) {
                    sb.append((CharSequence) obj);
                } else if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                } else {
                    sb.append((CharSequence) String.valueOf(obj));
                }
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append((CharSequence) str4);
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public static final long Z(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        int i = he3.R;
        return floatToIntBits2;
    }

    public static final Bitmap.Config a(int i) {
        int i2 = jy3.R;
        boolean z = false;
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i == 4) {
            z = true;
        }
        return z ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static b8Y c(int i, lIe lie, int i2) {
        if ((i2 & 2) != 0) {
            lie = lIe.e;
        }
        return new b8Y(i, lie, 0, new aKW(new b9g[0]), 0);
    }

    public static final String d(int i, m88 m88) {
        String str;
        jr_ jr_ = (jr_) m88;
        jr_.w(-176762646);
        jr_.x(ur.R);
        Resources resources = ((Context) jr_.x(ur.f7428R)).getResources();
        boolean z = true;
        if (i == 0) {
            str = resources.getString(R.string.navigation_menu);
        } else {
            if (i == 1) {
                str = resources.getString(R.string.close_drawer);
            } else {
                if (i == 2) {
                    str = resources.getString(R.string.close_sheet);
                } else {
                    if (i == 3) {
                        str = resources.getString(R.string.default_error_message);
                    } else {
                        if (i == 4) {
                            str = resources.getString(R.string.dropdown_menu);
                        } else {
                            if (i == 5) {
                                str = resources.getString(R.string.range_start);
                            } else {
                                if (i == 6) {
                                    str = resources.getString(R.string.range_end);
                                } else {
                                    if (i == 7) {
                                        str = resources.getString(R.string.dialog);
                                    } else {
                                        if (i == 8) {
                                            str = resources.getString(R.string.expanded);
                                        } else {
                                            if (i != 9) {
                                                z = false;
                                            }
                                            str = z ? resources.getString(R.string.collapsed) : "";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        jr_.g(false);
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v12, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r7v14, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r7v16, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0275, code lost:
        if (r6 == defpackage.ppN.R) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02cd, code lost:
        if (r3 == defpackage.ppN.R) goto L_0x02cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(int r34, defpackage.ncu r35, defpackage.aD8 r36, boolean r37, float r38, defpackage.ngd r39, defpackage.ky r40, defpackage.n4N r41, defpackage.kg9 r42, boolean r43, defpackage.bBk r44, defpackage.m88 r45, int r46, int r47, int r48) {
        /*
        // Method dump skipped, instructions count: 896
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gQc.e(int, ncu, aD8, boolean, float, ngd, ky, n4N, kg9, boolean, bBk, m88, int, int, int):void");
    }

    public static int f(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final ncu g(ncu ncu, n76 n76) {
        return msU.a(ncu, 0.0f, 0.0f, n76, true, 59391);
    }

    public static fHP h(kwo kwo, int i, ArrayList arrayList, fHP fhp) {
        int i2;
        int i3 = i == 0 ? kwo.h : kwo.I;
        int i4 = 0;
        if (i3 != -1 && (fhp == null || i3 != fhp.R)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                fHP fhp2 = (fHP) arrayList.get(i5);
                if (fhp2.R == i3) {
                    if (fhp != null) {
                        fhp.e(i, fhp2);
                        arrayList.remove(fhp);
                    }
                    fhp = fhp2;
                } else {
                    i5++;
                }
            }
        } else if (i3 != -1) {
            return fhp;
        }
        if (fhp == null) {
            if (kwo instanceof lGG) {
                lGG lgg = (lGG) kwo;
                int i6 = 0;
                while (true) {
                    if (i6 >= lgg.u) {
                        i2 = -1;
                        break;
                    }
                    kwo kwo2 = lgg.c[i6];
                    if ((i == 0 && (i2 = kwo2.h) != -1) || (i == 1 && (i2 = kwo2.I) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i2 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        fHP fhp3 = (fHP) arrayList.get(i7);
                        if (fhp3.R == i2) {
                            fhp = fhp3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (fhp == null) {
                fhp = new fHP(i);
            }
            arrayList.add(fhp);
        }
        if (fhp.R(kwo)) {
            if (kwo instanceof gOm) {
                gOm gom = (gOm) kwo;
                iP5 ip5 = gom.m;
                if (gom.n == 0) {
                    i4 = 1;
                }
                ip5.v(i4, fhp, arrayList);
            }
            if (i == 0) {
                kwo.h = fhp.R;
                kwo.f5491R.v(i, fhp, arrayList);
                kwo.f5508c.v(i, fhp, arrayList);
            } else {
                kwo.I = fhp.R;
                kwo.f5516v.v(i, fhp, arrayList);
                kwo.f5504X.v(i, fhp, arrayList);
                kwo.f5512e.v(i, fhp, arrayList);
            }
            kwo.f5506Z.v(i, fhp, arrayList);
        }
        return fhp;
    }

    public static final Type i(ooI ooi, boolean z) {
        byj byj = (byj) ooi;
        kQO kqo = byj.f1882R;
        if (kqo instanceof fUt) {
            Class t = z ? pdD.t((fUt) kqo) : ((f2) ((fUt) kqo)).R();
            List list = byj.f1881R;
            if (list.isEmpty()) {
                return t;
            }
            if (!t.isArray()) {
                return K(t, list);
            }
            if (t.getComponentType().isPrimitive()) {
                return t;
            }
            kMB kmb = (kMB) (list.size() == 1 ? list.get(0) : null);
            if (kmb != null) {
                int i = kmb.R;
                ooI ooi2 = kmb.f5275R;
                int i2 = i == 0 ? -1 : hmB.R[jQ.I(i)];
                if (i2 == -1 || i2 == 1) {
                    return t;
                }
                if (i2 == 2 || i2 == 3) {
                    Type i3 = i(ooi2, false);
                    return i3 instanceof Class ? t : new eB2(i3);
                }
                throw new j8f((Object) null);
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + ooi);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + ooi);
    }

    public static final oey k(m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(1470655220);
        Object[] objArr = new Object[0];
        k_s Z = oey.R.Z();
        jr_.w(511388516);
        boolean O = jr_.O(0) | jr_.O(0);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            I = new eZO(0, 0);
            jr_.ZW(I);
        }
        jr_.g(false);
        oey oey = (oey) cpc.T(objArr, Z, (f_c) I, jr_, 4);
        jr_.g(false);
        return oey;
    }

    public static final long l(float f, long j) {
        return g4x.R(Math.max(0.0f, buB.v(j) - f), Math.max(0.0f, buB.c(j) - f));
    }

    public static final gIA m(mZf mzf, int i, hh4 hh4, iRR irr, boolean z, int i2) {
        gIA c = irr != null ? irr.c(hh4.f4348R.Z(i)) : gIA.R;
        int B = mzf.B(pk5.R);
        return new gIA(z ? (((float) i2) - c.f3720R) - ((float) B) : c.f3720R, c.v, z ? ((float) i2) - c.f3720R : ((float) B) + c.f3720R, c.e);
    }

    public static final Object n(pc0 pc0) {
        Object R2 = pc0.R();
        b5N b5n = R2 instanceof b5N ? (b5N) R2 : null;
        if (b5n != null) {
            return ((okZ) b5n).R;
        }
        return null;
    }

    public static final bYd o(Context context) {
        return new bYd(new g3(context), new aX(context.getResources().getConfiguration().fontWeightAdjustment));
    }

    public static final idZ p(nUO nuo, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(1413834416);
        float f = nuo.R;
        float f2 = nuo.v;
        float f3 = nuo.c;
        float f4 = nuo.e;
        String str = nuo.f6415R;
        long j = nuo.f6413R;
        int i = nuo.f6412R;
        boolean z = nuo.f6416R;
        dNH I = aH9.I(jr_, 1873274766, new noW(1, nuo));
        jr_.w(1068590786);
        jJj jjj = (jJj) jr_.x(lnF.X);
        float mZ = jjj.mZ(f);
        float mZ2 = jjj.mZ(f2);
        if (Float.isNaN(f3)) {
            f3 = mZ;
        }
        if (Float.isNaN(f4)) {
            f4 = mZ2;
        }
        n3 n3Var = new n3(j);
        An an = new An(i);
        jr_.w(511388516);
        boolean O = jr_.O(n3Var) | jr_.O(an);
        Object I2 = jr_.I();
        if (O || I2 == ppN.R) {
            if (!n3.c(j, n3.O)) {
                int i2 = Iw.R;
                I2 = new Iw(S2.R.R(j, i));
            } else {
                I2 = null;
            }
            jr_.ZW(I2);
        }
        jr_.g(false);
        Iw iw = (Iw) I2;
        jr_.w(-492369756);
        Object I3 = jr_.I();
        if (I3 == ppN.R) {
            I3 = new idZ();
            jr_.ZW(I3);
        }
        jr_.g(false);
        idZ idz = (idZ) I3;
        idz.f4678R.R(new nqW(n1P.e(mZ, mZ2)));
        idz.f4680v.R(Boolean.valueOf(z));
        idz.f4677R.f5894R.R(iw);
        idz.X(str, f3, f4, I, jr_, 35840);
        jr_.g(false);
        jr_.g(false);
        return idz;
    }

    public static final long r(float f, long j) {
        long floatToIntBits = j | (((long) Float.floatToIntBits(f)) & 4294967295L);
        lqt[] lqtArr = eT9.R;
        return floatToIntBits;
    }

    public static int s(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException(opT.Z("type needs to be >= FIRST and <= LAST, type=", i));
    }

    public static final int t(float f) {
        return ((int) ((float) (f >= 0.0f ? Math.ceil((double) f) : Math.floor((double) f)))) * -1;
    }

    public static final float u(Layout layout, int i, Paint paint) {
        float f;
        float f2;
        kSh ksh = dVA.R;
        if (!(layout.getEllipsisCount(i) > 0)) {
            return 0.0f;
        }
        int i2 = -1;
        if (layout.getParagraphDirection(i) != -1 || ((float) layout.getWidth()) >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null) {
            i2 = bNu.R[paragraphAlignment.ordinal()];
        }
        if (i2 == 1) {
            f2 = ((float) layout.getWidth()) - layout.getLineRight(i);
            f = (((float) layout.getWidth()) - measureText) / 2.0f;
        } else {
            f2 = ((float) layout.getWidth()) - layout.getLineRight(i);
            f = ((float) layout.getWidth()) - measureText;
        }
        return f2 - f;
    }

    public static final i4B v(Context context) {
        return new i4B(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }

    public static final int x(long j) {
        int i = Math.abs(aWo.e(j)) >= 0.5f ? 1 : 0;
        return Math.abs(aWo.X(j)) >= 0.5f ? i | 2 : i;
    }

    public static final ncu y(ncu ncu) {
        return msU.a(ncu, 0.0f, 0.0f, null, true, 61439);
    }

    public static final Type z(kMB kmb) {
        int i = kmb.R;
        if (i == 0) {
            return kl2.R;
        }
        ooI ooi = kmb.f5275R;
        int I = jQ.I(i);
        if (I == 0) {
            return i(ooi, true);
        }
        if (I == 1) {
            return new kl2(null, i(ooi, true));
        }
        if (I == 2) {
            return new kl2(i(ooi, true), null);
        }
        throw new j8f((Object) null);
    }

    public abstract List j(String str, List list);
}
