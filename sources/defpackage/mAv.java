package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.google.android.material.slider.Slider;
import dev.kdrag0n.virtcontainer.R;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: mAv  reason: default package */
/* loaded from: classes.dex */
public final class mAv {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public Object f5962R;
    public Object v;

    public /* synthetic */ mAv() {
        this.f5962R = new Object[8];
        this.R = 0;
    }

    public /* synthetic */ mAv(int i) {
        this.f5962R = new Object[16];
        this.v = new Object[16];
    }

    public /* synthetic */ mAv(cKc ckc, int i, byte[][] bArr) {
        this.f5962R = ckc;
        this.R = i;
        this.v = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x017e, code lost:
        if (r8.size() <= 0) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0180, code lost:
        r0 = new defpackage.h5(r8, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0186, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0187, code lost:
        if (r0 == null) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018a, code lost:
        if (r19 == false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018c, code lost:
        r0 = new defpackage.h5(r5, r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0192, code lost:
        r0 = new defpackage.h5(r5, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0198, code lost:
        if (r11 == 1) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x019b, code lost:
        if (r11 == 2) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x019d, code lost:
        r16 = (int[]) r0.R;
        r17 = (float[]) r0.v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ab, code lost:
        if (r7 == 1) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ad, code lost:
        if (r7 == 2) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01af, code lost:
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b2, code lost:
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b5, code lost:
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b7, code lost:
        r3 = new android.graphics.LinearGradient(r12, r26, r14, r15, r16, r17, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c4, code lost:
        r3 = new android.graphics.SweepGradient(r7, r9, (int[]) r0.R, (float[]) r0.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01dd, code lost:
        if (r8 <= 0.0f) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01df, code lost:
        r1 = (int[]) r0.R;
        r21 = (float[]) r0.v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ec, code lost:
        if (r7 == 1) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ef, code lost:
        if (r7 == 2) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f1, code lost:
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f4, code lost:
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f7, code lost:
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f9, code lost:
        r3 = new android.graphics.RadialGradient(r7, r9, r8, r1, r21, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x020f, code lost:
        return new defpackage.mAv(r3, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0217, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.mAv R(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
        // Method dump skipped, instructions count: 574
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mAv.R(android.content.res.Resources, int, android.content.res.Resources$Theme):mAv");
    }

    public final boolean L(int[] iArr) {
        if (X()) {
            ColorStateList colorStateList = (ColorStateList) this.v;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.R) {
                this.R = colorForState;
                return true;
            }
        }
        return false;
    }

    public final Vz O(int i, int i2) {
        oU oUVar;
        W Z = Z();
        int i3 = Z.R;
        if (i3 == 1) {
            oUVar = new oU(3, i, i2, Z.c(0), 0);
        } else {
            d7 d7Var = _4.R;
            oUVar = new oU(4, i, i2, i3 < 1 ? _4.R : new d7(Z), 0);
        }
        return i != 64 ? oUVar : new W9(oUVar, 0);
    }

    public final boolean X() {
        if (((Shader) this.f5962R) == null) {
            Object obj = this.v;
            if (((ColorStateList) obj) != null && ((ColorStateList) obj).isStateful()) {
                return true;
            }
        }
        return false;
    }

    public final W Z() {
        int read = ((InputStream) this.f5962R).read();
        if (read < 0) {
            return new W(0);
        }
        W w = new W();
        do {
            b e = e(read);
            w.R(e instanceof fXm ? ((fXm) e).P() : e.v());
            read = ((InputStream) this.f5962R).read();
        } while (read >= 0);
        return w;
    }

    public final Object c(Object obj) {
        int v = v(obj);
        if (v >= 0) {
            return ((Object[]) this.v)[v];
        }
        return null;
    }

    public final b e(int i) {
        Vz vz;
        InputStream inputStream = (InputStream) this.f5962R;
        boolean z = false;
        if (inputStream instanceof bNV) {
            bNV bnv = (bNV) inputStream;
            bnv.v = false;
            bnv.c();
        }
        int H = N.H((InputStream) this.f5962R, i);
        int O = N.O((InputStream) this.f5962R, this.R, H == 3 || H == 4 || H == 16 || H == 17 || H == 8);
        if (O >= 0) {
            gWT gwt = new gWT((InputStream) this.f5962R, O, this.R);
            if ((i & 224) != 0) {
                mAv mav = new mAv(gwt, gwt.e, (byte[][]) this.v);
                int i2 = i & 192;
                if (i2 != 0) {
                    if ((i & 32) != 0) {
                        z = true;
                    }
                    if (64 != i2) {
                        return new eBo(i2, H, z, mav);
                    }
                    if (!z) {
                        vz = new oU(4, i2, H, new nP9(((gWT) ((InputStream) mav.f5962R)).c()), 2);
                        if (i2 == 64) {
                            vz = new k61(vz);
                        }
                    } else {
                        vz = Vz.n(i2, H, mav.Z());
                    }
                    return (k61) vz;
                } else if (H == 3) {
                    return new eD(mav);
                } else {
                    if (H == 4) {
                        return new s4(0, mav);
                    }
                    if (H == 8) {
                        return new uP(2, mav);
                    }
                    if (H == 16) {
                        return new uP(3, mav);
                    }
                    if (H == 17) {
                        return new uP(4, mav);
                    }
                    StringBuilder U = opT.U("unknown DL object encountered: 0x");
                    U.append(Integer.toHexString(H));
                    throw new P(U.toString());
                }
            } else if (H == 3) {
                return new i4g(gwt);
            } else {
                if (H == 4) {
                    return new s4(1, gwt);
                }
                if (H == 8) {
                    throw new P("externals must use constructed encoding (see X.690 8.18)");
                } else if (H == 16) {
                    throw new P("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
                } else if (H != 17) {
                    try {
                        return N.c(H, gwt, (byte[][]) this.v);
                    } catch (IllegalArgumentException e) {
                        throw new P("corrupted stream detected", e);
                    }
                } else {
                    throw new P("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
                }
            }
        } else if ((i & 32) != 0) {
            mAv mav2 = new mAv(new bNV((InputStream) this.f5962R, this.R), this.R, (byte[][]) this.v);
            int i3 = i & 192;
            if (i3 != 0) {
                return 64 == i3 ? new x2(H, mav2) : new zr(i3, H, mav2);
            }
            if (H == 3) {
                return new eD(mav2);
            }
            if (H == 4) {
                return new s4(0, mav2);
            }
            if (H == 8) {
                return new uP(2, mav2);
            }
            if (H == 16) {
                return new uP(0, mav2);
            }
            if (H == 17) {
                return new uP(1, mav2);
            }
            StringBuilder U2 = opT.U("unknown BER object encountered: 0x");
            U2.append(Integer.toHexString(H));
            throw new P(U2.toString());
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    public final void m(Object obj, Object obj2) {
        int v = v(obj);
        if (v >= 0) {
            ((Object[]) this.v)[v] = obj2;
            return;
        }
        int i = -(v + 1);
        int i2 = this.R;
        Object[] objArr = (Object[]) this.f5962R;
        boolean z = i2 == objArr.length;
        Object[] objArr2 = z ? new Object[i2 * 2] : objArr;
        int i3 = i + 1;
        System.arraycopy(objArr, i, objArr2, i3, i2 - i);
        if (z) {
            P7.r((Object[]) this.f5962R, objArr2, 0, 0, i, 6);
        }
        objArr2[i] = obj;
        this.f5962R = objArr2;
        Object[] objArr3 = z ? new Object[this.R * 2] : (Object[]) this.v;
        System.arraycopy((Object[]) this.v, i, objArr3, i3, this.R - i);
        if (z) {
            P7.r((Object[]) this.v, objArr3, 0, 0, i, 6);
        }
        objArr3[i] = obj2;
        this.v = objArr3;
        this.R++;
    }

    public final int v(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i = 0;
        int i2 = this.R - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            Object obj2 = ((Object[]) this.f5962R)[i3];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i = i3 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i2 = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    Object obj3 = ((Object[]) this.f5962R)[i4];
                    if (obj3 == obj) {
                        return i4;
                    }
                    if (System.identityHashCode(obj3) != identityHashCode) {
                        break;
                    }
                }
                int i5 = i3 + 1;
                int i6 = this.R;
                while (i5 < i6) {
                    Object obj4 = ((Object[]) this.f5962R)[i5];
                    if (obj4 == obj) {
                        return i5;
                    }
                    i5++;
                    if (System.identityHashCode(obj4) != identityHashCode) {
                        return -i5;
                    }
                }
                return -(this.R + 1);
            }
        }
        return -(i + 1);
    }

    public /* synthetic */ mAv(Shader shader, ColorStateList colorStateList, int i) {
        this.f5962R = shader;
        this.v = colorStateList;
        this.R = i;
    }

    public /* synthetic */ mAv(Slider slider, AttributeSet attributeSet) {
        this.v = slider;
        this.f5962R = attributeSet;
        this.R = R.attr.sliderStyle;
    }
}
