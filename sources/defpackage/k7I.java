package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: k7I  reason: default package */
/* loaded from: classes.dex */
public final class k7I implements IC {
    public final Object R;
    public Object X;
    public final Object c;
    public Object e;
    public final Object v;

    public /* synthetic */ k7I() {
        this.R = new ArrayList();
        this.v = new hTn();
        this.c = new hTn();
        this.e = new hTn();
        this.X = new hTn();
    }

    public static void c(cnO cno, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = (d7 / ((double) 180)) * 3.141592653589793d;
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        double d11 = ((d2 * sin) + (d * cos)) / d5;
        double d12 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d13 = ((d4 * sin) + (d3 * cos)) / d5;
        double d14 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d15 = d11 - d13;
        double d16 = d12 - d14;
        double d17 = (double) 2;
        double d18 = (d11 + d13) / d17;
        double d19 = (d12 + d14) / d17;
        double d20 = (d16 * d16) + (d15 * d15);
        if (!(d20 == 0.0d)) {
            double d21 = (1.0d / d20) - 0.25d;
            if (d21 < 0.0d) {
                double sqrt = (double) ((float) (Math.sqrt(d20) / 1.99999d));
                c(cno, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d21);
            double d22 = d15 * sqrt2;
            double d23 = sqrt2 * d16;
            if (z == z2) {
                d9 = d18 - d23;
                d8 = d19 + d22;
            } else {
                d9 = d18 + d23;
                d8 = d19 - d22;
            }
            double atan2 = Math.atan2(d12 - d8, d11 - d9);
            double atan22 = Math.atan2(d14 - d8, d13 - d9) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z2 != (i >= 0)) {
                atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d24 = d5;
            double d25 = d9 * d24;
            double d26 = d8 * d6;
            double d27 = (d25 * cos) - (d26 * sin);
            double d28 = (d26 * cos) + (d25 * sin);
            double d29 = (double) 4;
            int ceil = (int) Math.ceil(Math.abs((atan22 * d29) / 3.141592653589793d));
            double cos2 = Math.cos(d10);
            double sin2 = Math.sin(d10);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d30 = -d24;
            double d31 = d30 * cos2;
            double d32 = d6 * sin2;
            double d33 = (d31 * sin3) - (d32 * cos3);
            double d34 = d30 * sin2;
            double d35 = d6 * cos2;
            double d36 = (cos3 * d35) + (sin3 * d34);
            double d37 = atan22 / ((double) ceil);
            double d38 = d;
            double d39 = d2;
            int i2 = 0;
            double d40 = atan2;
            while (i2 < ceil) {
                double d41 = d40 + d37;
                double sin4 = Math.sin(d41);
                double cos4 = Math.cos(d41);
                double d42 = (((d24 * cos2) * cos4) + d27) - (d32 * sin4);
                double d43 = (d35 * sin4) + (d24 * sin2 * cos4) + d28;
                double d44 = (d31 * sin4) - (d32 * cos4);
                double d45 = (cos4 * d35) + (sin4 * d34);
                double d46 = d41 - d40;
                double tan = Math.tan(d46 / d17);
                double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d29) - ((double) 1)) * Math.sin(d46)) / ((double) 3);
                ((dm) cno).f2856R.cubicTo((float) ((d33 * sqrt3) + d38), (float) ((d36 * sqrt3) + d39), (float) (d42 - (sqrt3 * d44)), (float) (d43 - (sqrt3 * d45)), (float) d42, (float) d43);
                i2++;
                ceil = ceil;
                d24 = d5;
                d34 = d34;
                d38 = d42;
                d39 = d43;
                d40 = d41;
                d36 = d45;
                d33 = d44;
                d17 = d17;
                d37 = d37;
                sin2 = sin2;
            }
        }
    }

    public final void O() {
        for (oCU ocu : (List) this.R) {
            int i = ocu.R;
            if (e(i) == null) {
                int i2 = e9E.X;
                StringBuilder i3 = jQ.i("Navigation destination ", aYa.H((Context) this.v, i), " cannot be found in the navigation graph ");
                i3.append((f25) this.e);
                throw new IllegalArgumentException(i3.toString());
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:287:0x006b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:362:0x006f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:291:0x00b8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:296:0x0106 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:301:0x0154 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:306:0x01a4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:311:0x01f4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:316:0x0244 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:321:0x0294 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:324:0x0304 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:330:0x036b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:335:0x03c2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:340:0x0417 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:345:0x046c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:350:0x04c1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:355:0x0510 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:360:0x055f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:363:0x05de */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:367:0x0665 */
    public final void R(char c, float[] fArr) {
        Collection collection;
        ArrayList arrayList;
        boolean z;
        List list = (List) this.R;
        boolean z2 = true;
        if (c == 'z' || c == 'Z') {
            collection = Collections.singletonList(gqW.R);
        } else {
            char c2 = 2;
            if (c == 'm') {
                ka_ i = caw.i(new heu(0, fArr.length - 2), 2);
                arrayList = new ArrayList(a6.B(i, 10));
                jrc R = i.iterator();
                while (R.R) {
                    int nextInt = R.nextInt();
                    float[] k = P7.k(fArr, nextInt, nextInt + 2);
                    float f = k[0];
                    float f2 = k[1];
                    Object bn8 = new bn8(f, f2);
                    if ((bn8 instanceof jls) && nextInt > 0) {
                        bn8 = new lug(f, f2);
                    } else if (nextInt > 0) {
                        bn8 = new o5j(f, f2);
                    }
                    arrayList.add(bn8);
                }
            } else if (c == 'M') {
                ka_ i2 = caw.i(new heu(0, fArr.length - 2), 2);
                arrayList = new ArrayList(a6.B(i2, 10));
                jrc R2 = i2.iterator();
                while (R2.R) {
                    int nextInt2 = R2.nextInt();
                    float[] k2 = P7.k(fArr, nextInt2, nextInt2 + 2);
                    float f3 = k2[0];
                    float f4 = k2[1];
                    Object jls = new jls(f3, f4);
                    if (nextInt2 > 0) {
                        jls = new lug(f3, f4);
                    } else if ((jls instanceof bn8) && nextInt2 > 0) {
                        jls = new o5j(f3, f4);
                    }
                    arrayList.add(jls);
                }
            } else if (c == 'l') {
                ka_ i3 = caw.i(new heu(0, fArr.length - 2), 2);
                arrayList = new ArrayList(a6.B(i3, 10));
                jrc R3 = i3.iterator();
                while (R3.R) {
                    int nextInt3 = R3.nextInt();
                    float[] k3 = P7.k(fArr, nextInt3, nextInt3 + 2);
                    float f5 = k3[0];
                    float f6 = k3[1];
                    Object o5j = new o5j(f5, f6);
                    if ((o5j instanceof jls) && nextInt3 > 0) {
                        o5j = new lug(f5, f6);
                    } else if ((o5j instanceof bn8) && nextInt3 > 0) {
                        o5j = new o5j(f5, f6);
                    }
                    arrayList.add(o5j);
                }
            } else if (c == 'L') {
                ka_ i4 = caw.i(new heu(0, fArr.length - 2), 2);
                arrayList = new ArrayList(a6.B(i4, 10));
                jrc R4 = i4.iterator();
                while (R4.R) {
                    int nextInt4 = R4.nextInt();
                    float[] k4 = P7.k(fArr, nextInt4, nextInt4 + 2);
                    float f7 = k4[0];
                    float f8 = k4[1];
                    Object lug = new lug(f7, f8);
                    if ((lug instanceof jls) && nextInt4 > 0) {
                        lug = new lug(f7, f8);
                    } else if ((lug instanceof bn8) && nextInt4 > 0) {
                        lug = new o5j(f7, f8);
                    }
                    arrayList.add(lug);
                }
            } else if (c == 'h') {
                ka_ i5 = caw.i(new heu(0, fArr.length - 1), 1);
                arrayList = new ArrayList(a6.B(i5, 10));
                jrc R5 = i5.iterator();
                while (R5.R) {
                    int nextInt5 = R5.nextInt();
                    float[] k5 = P7.k(fArr, nextInt5, nextInt5 + 1);
                    float f9 = k5[0];
                    Object gau = new gAU(f9);
                    if ((gau instanceof jls) && nextInt5 > 0) {
                        gau = new lug(f9, k5[1]);
                    } else if ((gau instanceof bn8) && nextInt5 > 0) {
                        gau = new o5j(f9, k5[1]);
                    }
                    arrayList.add(gau);
                }
            } else if (c == 'H') {
                ka_ i6 = caw.i(new heu(0, fArr.length - 1), 1);
                arrayList = new ArrayList(a6.B(i6, 10));
                jrc R6 = i6.iterator();
                while (R6.R) {
                    int nextInt6 = R6.nextInt();
                    float[] k6 = P7.k(fArr, nextInt6, nextInt6 + 1);
                    float f10 = k6[0];
                    Object cy0 = new cY0(f10);
                    if ((cy0 instanceof jls) && nextInt6 > 0) {
                        cy0 = new lug(f10, k6[1]);
                    } else if ((cy0 instanceof bn8) && nextInt6 > 0) {
                        cy0 = new o5j(f10, k6[1]);
                    }
                    arrayList.add(cy0);
                }
            } else if (c == 'v') {
                ka_ i7 = caw.i(new heu(0, fArr.length - 1), 1);
                arrayList = new ArrayList(a6.B(i7, 10));
                jrc R7 = i7.iterator();
                while (R7.R) {
                    int nextInt7 = R7.nextInt();
                    float[] k7 = P7.k(fArr, nextInt7, nextInt7 + 1);
                    float f11 = k7[0];
                    Object dvi = new dVi(f11);
                    if ((dvi instanceof jls) && nextInt7 > 0) {
                        dvi = new lug(f11, k7[1]);
                    } else if ((dvi instanceof bn8) && nextInt7 > 0) {
                        dvi = new o5j(f11, k7[1]);
                    }
                    arrayList.add(dvi);
                }
            } else if (c == 'V') {
                ka_ i8 = caw.i(new heu(0, fArr.length - 1), 1);
                arrayList = new ArrayList(a6.B(i8, 10));
                jrc R8 = i8.iterator();
                while (R8.R) {
                    int nextInt8 = R8.nextInt();
                    float[] k8 = P7.k(fArr, nextInt8, nextInt8 + 1);
                    float f12 = k8[0];
                    Object jmf = new jMF(f12);
                    if ((jmf instanceof jls) && nextInt8 > 0) {
                        jmf = new lug(f12, k8[1]);
                    } else if ((jmf instanceof bn8) && nextInt8 > 0) {
                        jmf = new o5j(f12, k8[1]);
                    }
                    arrayList.add(jmf);
                }
            } else {
                char c3 = 5;
                char c4 = 6;
                char c5 = 3;
                char c6 = 4;
                if (c == 'c') {
                    ka_ i9 = caw.i(new heu(0, fArr.length - 6), 6);
                    arrayList = new ArrayList(a6.B(i9, 10));
                    jrc R9 = i9.iterator();
                    while (R9.R) {
                        int nextInt9 = R9.nextInt();
                        float[] k9 = P7.k(fArr, nextInt9, nextInt9 + 6);
                        float f13 = k9[0];
                        float f14 = k9[1];
                        alB alb = new alB(f13, f14, k9[2], k9[3], k9[c6], k9[c3]);
                        arrayList.add((!(alb instanceof jls) || nextInt9 <= 0) ? (!(alb instanceof bn8) || nextInt9 <= 0) ? alb : new o5j(f13, f14) : new lug(f13, f14));
                        c3 = 5;
                        c6 = 4;
                    }
                } else if (c == 'C') {
                    ka_ i10 = caw.i(new heu(0, fArr.length - 6), 6);
                    arrayList = new ArrayList(a6.B(i10, 10));
                    jrc R10 = i10.iterator();
                    while (R10.R) {
                        int nextInt10 = R10.nextInt();
                        float[] k10 = P7.k(fArr, nextInt10, nextInt10 + 6);
                        float f15 = k10[0];
                        float f16 = k10[1];
                        Object cbj = new cBj(f15, f16, k10[c2], k10[c5], k10[4], k10[5]);
                        if ((cbj instanceof jls) && nextInt10 > 0) {
                            cbj = new lug(f15, f16);
                        } else if ((cbj instanceof bn8) && nextInt10 > 0) {
                            cbj = new o5j(f15, f16);
                        }
                        arrayList.add(cbj);
                        c2 = 2;
                        c5 = 3;
                    }
                } else if (c == 's') {
                    ka_ i11 = caw.i(new heu(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(a6.B(i11, 10));
                    jrc R11 = i11.iterator();
                    while (R11.R) {
                        int nextInt11 = R11.nextInt();
                        float[] k11 = P7.k(fArr, nextInt11, nextInt11 + 4);
                        float f17 = k11[0];
                        float f18 = k11[1];
                        Object fyk = new fYk(f17, f18, k11[2], k11[3]);
                        if ((fyk instanceof jls) && nextInt11 > 0) {
                            fyk = new lug(f17, f18);
                        } else if ((fyk instanceof bn8) && nextInt11 > 0) {
                            fyk = new o5j(f17, f18);
                        }
                        arrayList.add(fyk);
                    }
                } else if (c == 'S') {
                    ka_ i12 = caw.i(new heu(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(a6.B(i12, 10));
                    jrc R12 = i12.iterator();
                    while (R12.R) {
                        int nextInt12 = R12.nextInt();
                        float[] k12 = P7.k(fArr, nextInt12, nextInt12 + 4);
                        float f19 = k12[0];
                        float f20 = k12[1];
                        Object kug = new kuG(f19, f20, k12[2], k12[3]);
                        if ((kug instanceof jls) && nextInt12 > 0) {
                            kug = new lug(f19, f20);
                        } else if ((kug instanceof bn8) && nextInt12 > 0) {
                            kug = new o5j(f19, f20);
                        }
                        arrayList.add(kug);
                    }
                } else if (c == 'q') {
                    ka_ i13 = caw.i(new heu(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(a6.B(i13, 10));
                    jrc R13 = i13.iterator();
                    while (R13.R) {
                        int nextInt13 = R13.nextInt();
                        float[] k13 = P7.k(fArr, nextInt13, nextInt13 + 4);
                        float f21 = k13[0];
                        float f22 = k13[1];
                        Object eok = new eOK(f21, f22, k13[2], k13[3]);
                        if ((eok instanceof jls) && nextInt13 > 0) {
                            eok = new lug(f21, f22);
                        } else if ((eok instanceof bn8) && nextInt13 > 0) {
                            eok = new o5j(f21, f22);
                        }
                        arrayList.add(eok);
                    }
                } else if (c == 'Q') {
                    ka_ i14 = caw.i(new heu(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(a6.B(i14, 10));
                    jrc R14 = i14.iterator();
                    while (R14.R) {
                        int nextInt14 = R14.nextInt();
                        float[] k14 = P7.k(fArr, nextInt14, nextInt14 + 4);
                        float f23 = k14[0];
                        float f24 = k14[1];
                        Object akt = new aKt(f23, f24, k14[2], k14[3]);
                        if ((akt instanceof jls) && nextInt14 > 0) {
                            akt = new lug(f23, f24);
                        } else if ((akt instanceof bn8) && nextInt14 > 0) {
                            akt = new o5j(f23, f24);
                        }
                        arrayList.add(akt);
                    }
                } else if (c == 't') {
                    ka_ i15 = caw.i(new heu(0, fArr.length - 2), 2);
                    arrayList = new ArrayList(a6.B(i15, 10));
                    jrc R15 = i15.iterator();
                    while (R15.R) {
                        int nextInt15 = R15.nextInt();
                        float[] k15 = P7.k(fArr, nextInt15, nextInt15 + 2);
                        float f25 = k15[0];
                        float f26 = k15[1];
                        Object pda = new pdA(f25, f26);
                        if ((pda instanceof jls) && nextInt15 > 0) {
                            pda = new lug(f25, f26);
                        } else if ((pda instanceof bn8) && nextInt15 > 0) {
                            pda = new o5j(f25, f26);
                        }
                        arrayList.add(pda);
                    }
                } else if (c == 'T') {
                    ka_ i16 = caw.i(new heu(0, fArr.length - 2), 2);
                    arrayList = new ArrayList(a6.B(i16, 10));
                    jrc R16 = i16.iterator();
                    while (R16.R) {
                        int nextInt16 = R16.nextInt();
                        float[] k16 = P7.k(fArr, nextInt16, nextInt16 + 2);
                        float f27 = k16[0];
                        float f28 = k16[1];
                        Object kn6 = new kN6(f27, f28);
                        if ((kn6 instanceof jls) && nextInt16 > 0) {
                            kn6 = new lug(f27, f28);
                        } else if ((kn6 instanceof bn8) && nextInt16 > 0) {
                            kn6 = new o5j(f27, f28);
                        }
                        arrayList.add(kn6);
                    }
                } else {
                    float f29 = 0.0f;
                    if (c == 'a') {
                        ka_ i17 = caw.i(new heu(0, fArr.length - 7), 7);
                        arrayList = new ArrayList(a6.B(i17, 10));
                        jrc R17 = i17.iterator();
                        while (R17.R) {
                            int nextInt17 = R17.nextInt();
                            float[] k17 = P7.k(fArr, nextInt17, nextInt17 + 7);
                            float f30 = k17[0];
                            char c7 = z2 ? 1 : 0;
                            char c8 = z2 ? 1 : 0;
                            char c9 = z2 ? 1 : 0;
                            float f31 = k17[c7];
                            float f32 = k17[2];
                            if (Float.compare(k17[3], 0.0f) != 0) {
                                boolean z3 = z2 ? 1 : 0;
                                boolean z4 = z2 ? 1 : 0;
                                boolean z5 = z2 ? 1 : 0;
                                z = z3;
                            } else {
                                z = false;
                            }
                            ld3 ld3 = new ld3(f30, f31, f32, z, Float.compare(k17[4], 0.0f) != 0, k17[5], k17[c4]);
                            arrayList.add((!(ld3 instanceof jls) || nextInt17 <= 0) ? (!(ld3 instanceof bn8) || nextInt17 <= 0) ? ld3 : new o5j(k17[0], k17[1]) : new lug(k17[0], k17[1]));
                            z2 = true;
                            c4 = 6;
                        }
                    } else if (c == 'A') {
                        ka_ i18 = caw.i(new heu(0, fArr.length - 7), 7);
                        ArrayList arrayList2 = new ArrayList(a6.B(i18, 10));
                        jrc R18 = i18.iterator();
                        while (R18.R) {
                            int nextInt18 = R18.nextInt();
                            float[] k18 = P7.k(fArr, nextInt18, nextInt18 + 7);
                            bS3 bs3 = new bS3(k18[0], k18[1], k18[2], Float.compare(k18[3], f29) != 0, Float.compare(k18[4], f29) != 0, k18[5], k18[6]);
                            arrayList2.add((!(bs3 instanceof jls) || nextInt18 <= 0) ? (!(bs3 instanceof bn8) || nextInt18 <= 0) ? bs3 : new o5j(k18[0], k18[1]) : new lug(k18[0], k18[1]));
                            f29 = 0.0f;
                        }
                        collection = arrayList2;
                    } else {
                        throw new IllegalArgumentException("Unknown command for: " + c);
                    }
                }
            }
            collection = arrayList;
        }
        list.addAll(collection == 1 ? 1 : 0);
    }

    public final void X(cnO cno) {
        int i;
        k7I k7i = this;
        dm dmVar = (dm) cno;
        dmVar.e();
        ((hTn) k7i.v).R();
        ((hTn) k7i.c).R();
        ((hTn) k7i.e).R();
        ((hTn) k7i.X).R();
        List list = (List) k7i.R;
        int size = list.size();
        e7L e7l = null;
        int i2 = 0;
        k7I k7i2 = k7i;
        while (i2 < size) {
            e7L e7l2 = (e7L) list.get(i2);
            if (e7l == null) {
                e7l = e7l2;
            }
            if (e7l2 instanceof gqW) {
                hTn htn = (hTn) k7i2.v;
                hTn htn2 = (hTn) k7i2.e;
                htn.R = htn2.R;
                htn.v = htn2.v;
                hTn htn3 = (hTn) k7i2.c;
                htn3.R = htn2.R;
                htn3.v = htn2.v;
                dmVar.f2856R.close();
                hTn htn4 = (hTn) k7i2.v;
                dmVar.f2856R.moveTo(htn4.R, htn4.v);
            } else if (e7l2 instanceof bn8) {
                bn8 bn8 = (bn8) e7l2;
                hTn htn5 = (hTn) k7i2.v;
                float f = htn5.R;
                float f2 = bn8.R;
                htn5.R = f + f2;
                float f3 = htn5.v;
                float f4 = bn8.v;
                htn5.v = f3 + f4;
                dmVar.f2856R.rMoveTo(f2, f4);
                hTn htn6 = (hTn) k7i2.e;
                hTn htn7 = (hTn) k7i2.v;
                htn6.R = htn7.R;
                htn6.v = htn7.v;
            } else if (e7l2 instanceof jls) {
                jls jls = (jls) e7l2;
                hTn htn8 = (hTn) k7i2.v;
                float f5 = jls.R;
                htn8.R = f5;
                float f6 = jls.v;
                htn8.v = f6;
                dmVar.f2856R.moveTo(f5, f6);
                hTn htn9 = (hTn) k7i2.e;
                hTn htn10 = (hTn) k7i2.v;
                htn9.R = htn10.R;
                htn9.v = htn10.v;
            } else if (e7l2 instanceof o5j) {
                o5j o5j = (o5j) e7l2;
                dmVar.f2856R.rLineTo(o5j.R, o5j.v);
                hTn htn11 = (hTn) k7i2.v;
                htn11.R += o5j.R;
                htn11.v += o5j.v;
            } else if (e7l2 instanceof lug) {
                lug lug = (lug) e7l2;
                dmVar.f2856R.lineTo(lug.R, lug.v);
                hTn htn12 = (hTn) k7i2.v;
                htn12.R = lug.R;
                htn12.v = lug.v;
            } else if (e7l2 instanceof gAU) {
                gAU gau = (gAU) e7l2;
                dmVar.f2856R.rLineTo(gau.R, 0.0f);
                ((hTn) k7i2.v).R += gau.R;
            } else if (e7l2 instanceof cY0) {
                cY0 cy0 = (cY0) e7l2;
                dmVar.f2856R.lineTo(cy0.R, ((hTn) k7i2.v).v);
                ((hTn) k7i2.v).R = cy0.R;
            } else if (e7l2 instanceof dVi) {
                dVi dvi = (dVi) e7l2;
                dmVar.f2856R.rLineTo(0.0f, dvi.R);
                ((hTn) k7i2.v).v += dvi.R;
            } else if (e7l2 instanceof jMF) {
                jMF jmf = (jMF) e7l2;
                dmVar.f2856R.lineTo(((hTn) k7i2.v).R, jmf.R);
                ((hTn) k7i2.v).v = jmf.R;
            } else if (e7l2 instanceof alB) {
                alB alb = (alB) e7l2;
                dmVar.f2856R.rCubicTo(alb.R, alb.v, alb.c, alb.e, alb.X, alb.O);
                hTn htn13 = (hTn) k7i2.c;
                hTn htn14 = (hTn) k7i2.v;
                htn13.R = htn14.R + alb.c;
                htn13.v = htn14.v + alb.e;
                htn14.R += alb.X;
                htn14.v += alb.O;
            } else if (e7l2 instanceof cBj) {
                cBj cbj = (cBj) e7l2;
                dmVar.f2856R.cubicTo(cbj.R, cbj.v, cbj.c, cbj.e, cbj.X, cbj.O);
                hTn htn15 = (hTn) k7i2.c;
                htn15.R = cbj.c;
                htn15.v = cbj.e;
                hTn htn16 = (hTn) k7i2.v;
                htn16.R = cbj.X;
                htn16.v = cbj.O;
            } else if (e7l2 instanceof fYk) {
                fYk fyk = (fYk) e7l2;
                if (e7l.R) {
                    hTn htn17 = (hTn) k7i2.X;
                    hTn htn18 = (hTn) k7i2.v;
                    float f7 = htn18.R;
                    hTn htn19 = (hTn) k7i2.c;
                    htn17.R = f7 - htn19.R;
                    htn17.v = htn18.v - htn19.v;
                } else {
                    ((hTn) k7i2.X).R();
                }
                hTn htn20 = (hTn) k7i2.X;
                dmVar.f2856R.rCubicTo(htn20.R, htn20.v, fyk.R, fyk.v, fyk.c, fyk.e);
                hTn htn21 = (hTn) k7i2.c;
                hTn htn22 = (hTn) k7i2.v;
                htn21.R = htn22.R + fyk.R;
                htn21.v = htn22.v + fyk.v;
                htn22.R += fyk.c;
                htn22.v += fyk.e;
            } else if (e7l2 instanceof kuG) {
                kuG kug = (kuG) e7l2;
                if (e7l.R) {
                    hTn htn23 = (hTn) k7i2.X;
                    float f8 = (float) 2;
                    hTn htn24 = (hTn) k7i2.v;
                    hTn htn25 = (hTn) k7i2.c;
                    htn23.R = (htn24.R * f8) - htn25.R;
                    htn23.v = (f8 * htn24.v) - htn25.v;
                } else {
                    hTn htn26 = (hTn) k7i2.X;
                    hTn htn27 = (hTn) k7i2.v;
                    htn26.R = htn27.R;
                    htn26.v = htn27.v;
                }
                hTn htn28 = (hTn) k7i2.X;
                dmVar.f2856R.cubicTo(htn28.R, htn28.v, kug.R, kug.v, kug.c, kug.e);
                hTn htn29 = (hTn) k7i2.c;
                htn29.R = kug.R;
                htn29.v = kug.v;
                hTn htn30 = (hTn) k7i2.v;
                htn30.R = kug.c;
                htn30.v = kug.e;
            } else if (e7l2 instanceof eOK) {
                eOK eok = (eOK) e7l2;
                dmVar.f2856R.rQuadTo(eok.R, eok.v, eok.c, eok.e);
                hTn htn31 = (hTn) k7i2.c;
                hTn htn32 = (hTn) k7i2.v;
                htn31.R = htn32.R + eok.R;
                htn31.v = htn32.v + eok.v;
                htn32.R += eok.c;
                htn32.v += eok.e;
            } else if (e7l2 instanceof aKt) {
                aKt akt = (aKt) e7l2;
                dmVar.f2856R.quadTo(akt.R, akt.v, akt.c, akt.e);
                hTn htn33 = (hTn) k7i2.c;
                htn33.R = akt.R;
                htn33.v = akt.v;
                hTn htn34 = (hTn) k7i2.v;
                htn34.R = akt.c;
                htn34.v = akt.e;
            } else if (e7l2 instanceof pdA) {
                pdA pda = (pdA) e7l2;
                if (e7l.v) {
                    hTn htn35 = (hTn) k7i2.X;
                    hTn htn36 = (hTn) k7i2.v;
                    float f9 = htn36.R;
                    hTn htn37 = (hTn) k7i2.c;
                    htn35.R = f9 - htn37.R;
                    htn35.v = htn36.v - htn37.v;
                } else {
                    ((hTn) k7i2.X).R();
                }
                hTn htn38 = (hTn) k7i2.X;
                dmVar.f2856R.rQuadTo(htn38.R, htn38.v, pda.R, pda.v);
                hTn htn39 = (hTn) k7i2.c;
                hTn htn40 = (hTn) k7i2.v;
                float f10 = htn40.R;
                hTn htn41 = (hTn) k7i2.X;
                htn39.R = f10 + htn41.R;
                htn39.v = htn40.v + htn41.v;
                htn40.R += pda.R;
                htn40.v += pda.v;
            } else if (e7l2 instanceof kN6) {
                kN6 kn6 = (kN6) e7l2;
                if (e7l.v) {
                    hTn htn42 = (hTn) k7i2.X;
                    float f11 = (float) 2;
                    hTn htn43 = (hTn) k7i2.v;
                    hTn htn44 = (hTn) k7i2.c;
                    htn42.R = (htn43.R * f11) - htn44.R;
                    htn42.v = (f11 * htn43.v) - htn44.v;
                } else {
                    hTn htn45 = (hTn) k7i2.X;
                    hTn htn46 = (hTn) k7i2.v;
                    htn45.R = htn46.R;
                    htn45.v = htn46.v;
                }
                hTn htn47 = (hTn) k7i2.X;
                dmVar.f2856R.quadTo(htn47.R, htn47.v, kn6.R, kn6.v);
                hTn htn48 = (hTn) k7i2.c;
                hTn htn49 = (hTn) k7i2.X;
                htn48.R = htn49.R;
                htn48.v = htn49.v;
                hTn htn50 = (hTn) k7i2.v;
                htn50.R = kn6.R;
                htn50.v = kn6.v;
            } else {
                if (e7l2 instanceof ld3) {
                    ld3 ld3 = (ld3) e7l2;
                    float f12 = ld3.e;
                    hTn htn51 = (hTn) k7i2.v;
                    float f13 = htn51.R;
                    float f14 = f12 + f13;
                    float f15 = ld3.X;
                    float f16 = htn51.v;
                    float f17 = f15 + f16;
                    dmVar = dmVar;
                    i = i2;
                    list = list;
                    size = size;
                    c(cno, (double) f13, (double) f16, (double) f14, (double) f17, (double) ld3.R, (double) ld3.v, (double) ld3.c, ld3.f5794c, ld3.f5795e);
                    hTn htn52 = (hTn) this.v;
                    htn52.R = f14;
                    htn52.v = f17;
                    hTn htn53 = (hTn) this.c;
                    htn53.R = f14;
                    htn53.v = f17;
                    k7i = this;
                    e7l = e7l2;
                } else {
                    i = i2;
                    list = list;
                    size = size;
                    if (e7l2 instanceof bS3) {
                        bS3 bs3 = (bS3) e7l2;
                        hTn htn54 = (hTn) k7i2.v;
                        dmVar = dmVar;
                        e7l = e7l2;
                        k7i = this;
                        c(cno, (double) htn54.R, (double) htn54.v, (double) bs3.e, (double) bs3.X, (double) bs3.R, (double) bs3.v, (double) bs3.c, bs3.f1660c, bs3.f1661e);
                        hTn htn55 = (hTn) k7i.v;
                        float f18 = bs3.e;
                        htn55.R = f18;
                        float f19 = bs3.X;
                        htn55.v = f19;
                        hTn htn56 = (hTn) k7i.c;
                        htn56.R = f18;
                        htn56.v = f19;
                    } else {
                        dmVar = dmVar;
                        k7i = k7i;
                        e7l = e7l2;
                        i2 = i + 1;
                    }
                }
                k7i2 = k7i;
                i2 = i + 1;
            }
            dmVar = dmVar;
            i = i2;
            e7l = e7l2;
            list = list;
            size = size;
            i2 = i + 1;
        }
    }

    public final e9E e(int i) {
        il ilVar = new il();
        ilVar.addLast((f25) this.e);
        while (!ilVar.isEmpty()) {
            e9E e9e = (e9E) ilVar.removeFirst();
            if (e9e.e == i) {
                return e9e;
            }
            if (e9e instanceof f25) {
                oV5 ov5 = new oV5((f25) e9e);
                while (ov5.hasNext()) {
                    ilVar.addLast((e9E) ov5.next());
                }
            }
        }
        return null;
    }

    @Override // defpackage.IC
    public final void onCancel() {
        ((View) this.R).clearAnimation();
        ((ViewGroup) this.v).endViewTransition((View) this.R);
        ((l3O) this.c).c();
        if (hAW.W(2)) {
            StringBuilder U = opT.U("Animation from operation ");
            U.append((kuA) this.e);
            U.append(" has been cancelled.");
            Log.v("FragmentManager", U.toString());
        }
    }

    public final fiw v() {
        if (((f25) this.e) == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        } else if (!((List) this.R).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            Iterator it = ((List) this.R).iterator();
            e9E e9e = null;
            while (true) {
                int i = 0;
                if (it.hasNext()) {
                    oCU ocu = (oCU) it.next();
                    int i2 = ocu.R;
                    Bundle bundle = ocu.f6701R;
                    e9E e = e(i2);
                    if (e != null) {
                        int[] c = e.c(e9e);
                        int length = c.length;
                        while (i < length) {
                            arrayList.add(Integer.valueOf(c[i]));
                            arrayList2.add(bundle);
                            i++;
                        }
                        e9e = e;
                    } else {
                        int i3 = e9E.X;
                        StringBuilder i4 = jQ.i("Navigation destination ", aYa.H((Context) this.v, i2), " cannot be found in the navigation graph ");
                        i4.append((f25) this.e);
                        throw new IllegalArgumentException(i4.toString());
                    }
                } else {
                    ((Intent) this.c).putExtra("android-support-nav:controller:deepLinkIds", dF.mZ(arrayList));
                    ((Intent) this.c).putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
                    fiw fiw = new fiw((Context) this.v);
                    Intent intent = new Intent((Intent) this.c);
                    ComponentName component = intent.getComponent();
                    if (component == null) {
                        component = intent.resolveActivity(fiw.R.getPackageManager());
                    }
                    if (component != null) {
                        fiw.R(component);
                    }
                    fiw.f3523R.add(intent);
                    int size = fiw.f3523R.size();
                    while (i < size) {
                        Intent intent2 = (Intent) fiw.f3523R.get(i);
                        if (intent2 != null) {
                            intent2.putExtra("android-support-nav:controller:deepLinkIntent", (Intent) this.c);
                        }
                        i++;
                    }
                    return fiw;
                }
            }
        } else {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
    }

    public k7I(mpr mpr) {
        Intent intent;
        Context context = mpr.f6176R;
        this.v = context;
        if (context instanceof Activity) {
            intent = new Intent(context, context.getClass());
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (intent == null) {
                intent = new Intent();
            }
        }
        intent.addFlags(268468224);
        this.c = intent;
        this.R = new ArrayList();
        this.e = mpr.Z();
    }

    public /* synthetic */ k7I(View view, ViewGroup viewGroup, l3O l3o, peT pet, kuA kua) {
        this.X = pet;
        this.R = view;
        this.v = viewGroup;
        this.c = l3o;
        this.e = kua;
    }
}
