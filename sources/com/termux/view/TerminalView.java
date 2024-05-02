package com.termux.view;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Scroller;
import com.termux.terminal.Y;

/* loaded from: classes.dex */
public final class TerminalView extends View {
    public static boolean v = false;
    public int L;

    /* renamed from: R  reason: collision with other field name */
    public final Scroller f2424R;

    /* renamed from: R  reason: collision with other field name */
    public c8A f2425R;

    /* renamed from: R  reason: collision with other field name */
    public Y f2426R;

    /* renamed from: R  reason: collision with other field name */
    public final evu f2427R;

    /* renamed from: R  reason: collision with other field name */
    public gje f2428R;

    /* renamed from: R  reason: collision with other field name */
    public mT0 f2430R;

    /* renamed from: R  reason: collision with other field name */
    public oHp f2431R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2432R;
    public int e;

    /* renamed from: v  reason: collision with other field name */
    public float f2434v;

    /* renamed from: R  reason: collision with other field name */
    public int[] f2433R = {-1, -1, -1, -1};
    public float R = 1.0f;
    public int X = -1;
    public int O = -1;

    /* renamed from: R  reason: collision with other field name */
    public long f2423R = -1;

    /* renamed from: R  reason: collision with other field name */
    public final j3x f2429R = new j3x(this);

    public TerminalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2427R = new evu(context, new lTo(this));
        this.f2424R = new Scroller(context);
        this.f2432R = ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    private CharSequence getText() {
        gje gje = this.f2428R;
        idE ide = gje.f3905c;
        int i = this.e;
        return ide.L(0, i, gje.e, gje.c + i);
    }

    /* access modifiers changed from: private */
    public ActionMode getTextSelectionActionMode() {
        c8A c8a = this.f2425R;
        if (c8a != null) {
            return c8a.f1972R;
        }
        return null;
    }

    public final void H() {
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0 && this.f2426R != null) {
            int max = Math.max(4, (int) (((float) width) / this.f2431R.R));
            oHp ohp = this.f2431R;
            int max2 = Math.max(4, (height - ohp.e) / ohp.v);
            gje gje = this.f2428R;
            if (gje == null || max != gje.e || max2 != gje.c) {
                this.f2426R.v(max, max2);
                this.f2428R = this.f2426R.f2413R;
                this.f2430R.getClass();
                this.e = 0;
                scrollTo(0, 0);
                invalidate();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L() {
        /*
            r5 = this;
            gje r0 = r5.f2428R
            if (r0 != 0) goto L_0x0005
            goto L_0x0069
        L_0x0005:
            idE r0 = r0.f3905c
            int r0 = r0.e
            int r1 = r5.e
            int r2 = -r0
            if (r1 >= r2) goto L_0x0010
            r5.e = r2
        L_0x0010:
            boolean r1 = r5.O()
            r2 = 0
            if (r1 != 0) goto L_0x001d
            gje r0 = r5.f2428R
            r0.getClass()
            goto L_0x0035
        L_0x001d:
            gje r1 = r5.f2428R
            int r1 = r1.g
            int r3 = r5.e
            int r4 = -r3
            int r4 = r4 + r1
            if (r4 <= r0) goto L_0x0037
            boolean r0 = r5.O()
            if (r0 == 0) goto L_0x0030
            r5.m()
        L_0x0030:
            gje r0 = r5.f2428R
            r0.getClass()
        L_0x0035:
            r0 = r2
            goto L_0x0049
        L_0x0037:
            r0 = 1
            int r3 = r3 - r1
            r5.e = r3
            c8A r3 = r5.f2425R
            if (r3 == 0) goto L_0x0049
            int r4 = r3.L
            int r4 = r4 - r1
            r3.L = r4
            int r4 = r3.Z
            int r4 = r4 - r1
            r3.Z = r4
        L_0x0049:
            if (r0 != 0) goto L_0x0057
            int r0 = r5.e
            if (r0 == 0) goto L_0x0057
            r1 = -3
            if (r0 >= r1) goto L_0x0055
            r5.awakenScrollBars()
        L_0x0055:
            r5.e = r2
        L_0x0057:
            gje r0 = r5.f2428R
            r0.g = r2
            r5.invalidate()
            boolean r0 = r5.f2432R
            if (r0 == 0) goto L_0x0069
            java.lang.CharSequence r0 = r5.getText()
            r5.setContentDescription(r0)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.termux.view.TerminalView.L():void");
    }

    public final boolean O() {
        c8A c8a = this.f2425R;
        if (c8a != null) {
            return c8a.f1976R;
        }
        return false;
    }

    public final void X(int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        if (v) {
            mT0 mt0 = this.f2430R;
            StringBuilder y = jQ.y("inputCodePoint(eventSource=", i, ", codePoint=", i2, ", controlDownFromEvent=");
            y.append(z);
            y.append(", leftAltDownFromEvent=");
            y.append(z2);
            y.append(")");
            ((lV4) mt0).R(y.toString());
        }
        if (this.f2426R != null) {
            gje gje = this.f2428R;
            int i5 = 1;
            if (gje != null) {
                gje.f3908m = true;
            }
            boolean z3 = z || ((Boolean) ((lV4) this.f2430R).f5760R.getValue()).booleanValue();
            boolean z4 = z2 || ((Boolean) ((lV4) this.f2430R).v.getValue()).booleanValue();
            lV4 lv4 = (lV4) this.f2430R;
            h0T h0t = lv4.f5760R;
            Boolean bool = Boolean.FALSE;
            h0t.R(bool);
            lv4.v.R(bool);
            int i6 = 94;
            if (z3) {
                if (i2 >= 97 && i2 <= 122) {
                    i4 = i2 - 97;
                } else if (i2 >= 65 && i2 <= 90) {
                    i4 = i2 - 65;
                } else if (i2 == 32 || i2 == 50) {
                    i2 = 0;
                } else if (i2 == 91 || i2 == 51) {
                    i2 = 27;
                } else if (i2 == 92 || i2 == 52) {
                    i2 = 28;
                } else if (i2 == 93 || i2 == 53) {
                    i2 = 29;
                } else if (i2 == 94 || i2 == 54) {
                    i2 = 30;
                } else if (i2 == 95 || i2 == 55 || i2 == 47) {
                    i2 = 31;
                } else if (i2 == 56) {
                    i2 = 127;
                }
                i2 = i4 + 1;
            }
            if (i2 > -1) {
                if (i > 0) {
                    if (i2 != 710) {
                        if (i2 == 715) {
                            i6 = 96;
                        } else if (i2 == 732) {
                            i6 = 126;
                        }
                    }
                    Y y2 = this.f2426R;
                    y2.getClass();
                    if (i6 <= 1114111 || (i6 >= 55296 && i6 <= 57343)) {
                        throw new IllegalArgumentException(opT.Z("Invalid code point: ", i6));
                    }
                    if (z4) {
                        y2.f2417R[0] = 27;
                    } else {
                        i5 = 0;
                    }
                    if (i6 <= 127) {
                        i3 = i5 + 1;
                        y2.f2417R[i5] = (byte) i6;
                    } else if (i6 <= 2047) {
                        byte[] bArr = y2.f2417R;
                        int i7 = i5 + 1;
                        bArr[i5] = (byte) ((i6 >> 6) | 192);
                        i3 = i7 + 1;
                        bArr[i7] = (byte) ((i6 & 63) | 128);
                    } else if (i6 <= 65535) {
                        byte[] bArr2 = y2.f2417R;
                        int i8 = i5 + 1;
                        bArr2[i5] = (byte) ((i6 >> 12) | 224);
                        int i9 = i8 + 1;
                        bArr2[i8] = (byte) (((i6 >> 6) & 63) | 128);
                        i3 = i9 + 1;
                        bArr2[i9] = (byte) ((i6 & 63) | 128);
                    } else {
                        byte[] bArr3 = y2.f2417R;
                        int i10 = i5 + 1;
                        bArr3[i5] = (byte) ((i6 >> 18) | 240);
                        int i11 = i10 + 1;
                        bArr3[i10] = (byte) (((i6 >> 12) & 63) | 128);
                        int i12 = i11 + 1;
                        bArr3[i11] = (byte) (((i6 >> 6) & 63) | 128);
                        i3 = i12 + 1;
                        bArr3[i12] = (byte) ((i6 & 63) | 128);
                    }
                    byte[] bArr4 = y2.f2417R;
                    if (y2.R > 0) {
                        y2.f2419v.v(bArr4, i3);
                        return;
                    }
                    return;
                }
                i6 = i2;
                Y y2 = this.f2426R;
                y2.getClass();
                if (i6 <= 1114111) {
                }
                throw new IllegalArgumentException(opT.Z("Invalid code point: ", i6));
            }
        }
    }

    public final void Z(MotionEvent motionEvent, int i, boolean z) {
        int[] c = c(motionEvent, false);
        int i2 = c[0] + 1;
        int i3 = c[1] + 1;
        if (z && (i == 65 || i == 64)) {
            if (this.f2423R == motionEvent.getDownTime()) {
                i2 = this.X;
                i3 = this.O;
            } else {
                this.f2423R = motionEvent.getDownTime();
                this.X = i2;
                this.O = i3;
            }
        }
        gje gje = this.f2428R;
        if (i2 < 1) {
            i2 = 1;
        }
        int i4 = gje.e;
        if (i2 > i4) {
            i2 = i4;
        }
        if (i3 < 1) {
            i3 = 1;
        }
        int i5 = gje.c;
        if (i3 > i5) {
            i3 = i5;
        }
        if (i != 32 || gje.C(128)) {
            char c2 = 'M';
            if (gje.C(512)) {
                Y y = gje.f3890R;
                StringBuilder U = opT.U("\u001b[<%d;%d;%d");
                if (!z) {
                    c2 = 'm';
                }
                U.append(c2);
                y.c(String.format(U.toString(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                return;
            }
            if (!z) {
                i = 3;
            }
            if (!(i2 > 223 || i3 > 223)) {
                byte[] bArr = {27, 91, 77, (byte) (i + 32), (byte) (i2 + 32), (byte) (i3 + 32)};
                Y y2 = gje.f3890R;
                if (y2.R > 0) {
                    y2.f2419v.v(bArr, 6);
                }
            }
        }
    }

    @Override // android.view.View
    public final void autofill(AutofillValue autofillValue) {
        if (autofillValue.isText()) {
            this.f2426R.c(autofillValue.getTextValue().toString());
        }
    }

    public final int[] c(MotionEvent motionEvent, boolean z) {
        int x = (int) (motionEvent.getX() / this.f2431R.R);
        float y = motionEvent.getY();
        oHp ohp = this.f2431R;
        int i = (int) ((y - ((float) ohp.e)) / ((float) ohp.v));
        if (z) {
            i += this.e;
        }
        return new int[]{x, i};
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        gje gje = this.f2428R;
        if (gje == null) {
            return 1;
        }
        return gje.c;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        gje gje = this.f2428R;
        if (gje == null) {
            return 1;
        }
        idE ide = gje.f3905c;
        return ((ide.e + ide.v) + this.e) - gje.c;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        gje gje = this.f2428R;
        if (gje == null) {
            return 1;
        }
        idE ide = gje.f3905c;
        return ide.v + ide.e;
    }

    public final boolean e(int i, int i2) {
        gje gje = this.f2428R;
        if (gje != null) {
            gje.f3908m = true;
        }
        gje gje2 = this.f2426R.f2413R;
        String R = kPj.R(i, i2, gje2.C(1), gje2.C(32));
        if (R == null) {
            return false;
        }
        this.f2426R.c(R);
        return true;
    }

    @Override // android.view.View
    public int getAutofillType() {
        return 1;
    }

    @Override // android.view.View
    public AutofillValue getAutofillValue() {
        return AutofillValue.forText("");
    }

    public Y getCurrentSession() {
        return this.f2426R;
    }

    public String getSelectedText() {
        c8A c8a;
        if (!O() || (c8a = this.f2425R) == null) {
            return null;
        }
        return c8a.R();
    }

    public String getStoredSelectedText() {
        c8A c8a = this.f2425R;
        if (c8a != null) {
            return c8a.f1974R;
        }
        return null;
    }

    public c8A getTextSelectionCursorController() {
        if (this.f2425R == null) {
            this.f2425R = new c8A(this);
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnTouchModeChangeListener(this.f2425R);
            }
        }
        return this.f2425R;
    }

    public int getTopRow() {
        return this.e;
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        return true;
    }

    public final void m() {
        c8A textSelectionCursorController = getTextSelectionCursorController();
        boolean z = false;
        if (textSelectionCursorController.f1976R && System.currentTimeMillis() - textSelectionCursorController.R >= 300) {
            textSelectionCursorController.f1975R.R();
            textSelectionCursorController.v.R();
            ActionMode actionMode = textSelectionCursorController.f1972R;
            if (actionMode != null) {
                actionMode.finish();
            }
            textSelectionCursorController.Z = -1;
            textSelectionCursorController.O = -1;
            textSelectionCursorController.L = -1;
            textSelectionCursorController.X = -1;
            textSelectionCursorController.f1976R = false;
            z = true;
        }
        if (z) {
            mT0 mt0 = this.f2430R;
            O();
            mt0.getClass();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2425R != null) {
            getViewTreeObserver().addOnTouchModeChangeListener(this.f2425R);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f2430R.getClass();
        this.f2430R.getClass();
        editorInfo.inputType = 0;
        editorInfo.imeOptions = 33554432;
        return new hRx(this, this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2425R != null) {
            m();
            getViewTreeObserver().removeOnTouchModeChangeListener(this.f2425R);
            this.f2425R.getClass();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int[] iArr;
        int i;
        int i2;
        boolean z;
        char[] cArr;
        int i3;
        int i4;
        int i5;
        int i6;
        short s;
        int i7;
        char[] cArr2;
        boolean z2;
        TerminalView terminalView = this;
        gje gje = terminalView.f2428R;
        if (gje == null) {
            canvas.drawColor(-16777216);
            return;
        }
        int[] iArr2 = terminalView.f2433R;
        c8A c8a = terminalView.f2425R;
        if (!(c8a == null || iArr2 == null || iArr2.length != 4)) {
            iArr2[0] = c8a.L;
            iArr2[1] = c8a.Z;
            iArr2[2] = c8a.X;
            iArr2[3] = c8a.O;
        }
        oHp ohp = terminalView.f2431R;
        int i8 = terminalView.e;
        int i9 = iArr2[0];
        int i10 = iArr2[1];
        int i11 = iArr2[2];
        int i12 = iArr2[3];
        ohp.getClass();
        boolean C = gje.C(2);
        int i13 = i8 + gje.c;
        int i14 = gje.e;
        int i15 = gje.f3909v;
        int i16 = gje.f3889R;
        boolean z3 = !gje.C(16) ? false : gje.f3904Z ? gje.f3908m : true;
        idE ide = gje.f3905c;
        int[] iArr3 = gje.f3898R.f6727R;
        int i17 = gje.X;
        if (C) {
            canvas.drawColor(iArr3[256], PorterDuff.Mode.SRC);
        }
        float f = (float) ohp.e;
        int i18 = i8;
        while (i18 < i13) {
            float f2 = f + ((float) ohp.v);
            int i19 = (i18 != i16 || !z3) ? -1 : i15;
            if (i18 < i9 || i18 > i10) {
                iArr = iArr3;
                i11 = -1;
                i12 = -1;
            } else {
                if (i18 != i9) {
                    i11 = -1;
                }
                if (i18 != i10) {
                    i12 = gje.e;
                }
                iArr = iArr3;
            }
            pz6 R = ide.R(ide.O(i18));
            char[] cArr3 = R.f7332R;
            int i20 = i18;
            short s2 = R.f7330R;
            long j = 0;
            float f3 = 0.0f;
            boolean z4 = false;
            int i21 = 0;
            int i22 = 0;
            boolean z5 = false;
            int i23 = -1;
            int i24 = 0;
            boolean z6 = false;
            char[] cArr4 = cArr3;
            while (i22 < i14) {
                char c = cArr4[i21];
                boolean isHighSurrogate = Character.isHighSurrogate(c);
                int i25 = isHighSurrogate ? 2 : 1;
                if (isHighSurrogate) {
                    i15 = i15;
                    i2 = Character.toCodePoint(c, cArr4[i21 + 1]);
                } else {
                    i15 = i15;
                    i2 = c;
                }
                int z7 = lTs.z(i2 == 1 ? 1 : 0);
                boolean z8 = i19 == i22 || (z7 == 2 && i19 == i22 + 1);
                if (i22 < i11 || i22 > i12) {
                    i11 = i11;
                    i12 = i12;
                    z = false;
                } else {
                    i11 = i11;
                    i12 = i12;
                    z = true;
                }
                long j2 = R.f7333R[i22];
                float[] fArr = ohp.f6726R;
                float measureText = i2 < fArr.length ? fArr[i2 == 1 ? 1 : 0] : ohp.f6724R.measureText(cArr4, i21, i25);
                z6 = ((double) Math.abs((measureText / ohp.R) - ((float) z7))) > 0.01d;
                if (j2 == j && z8 == z4 && z == z5 && !z6 && !z6) {
                    i17 = i17;
                    i4 = z7;
                    i3 = i21;
                    ohp = ohp;
                    i19 = i19;
                    gje = gje;
                    cArr = cArr4;
                    i20 = i20;
                    i24 = i24;
                    s = s2;
                    z6 = z6;
                    i13 = i13;
                    i7 = 2;
                    i5 = i25;
                    i6 = i22;
                } else {
                    if (i22 == 0) {
                        z5 = z;
                        i17 = i17;
                        i4 = z7;
                        z4 = z8;
                        i3 = i21;
                        i6 = i22;
                        ohp = ohp;
                        i19 = i19;
                        gje = gje;
                        cArr2 = cArr4;
                        i20 = i20;
                        s = s2;
                        i13 = i13;
                        i7 = 2;
                        i5 = i25;
                    } else {
                        int i26 = i22 - i23;
                        int i27 = i21 - i24;
                        int i28 = z4 ? gje.f3898R.f6727R[258] : 0;
                        boolean z9 = z4 && i17 == 0;
                        if (C || z9) {
                            i17 = i17;
                            z2 = true;
                        } else {
                            i17 = i17;
                            z2 = false;
                        }
                        i4 = z7;
                        z4 = z8;
                        i7 = 2;
                        i13 = i13;
                        i5 = i25;
                        i3 = i21;
                        i6 = i22;
                        ohp = ohp;
                        z5 = z;
                        i19 = i19;
                        gje = gje;
                        i20 = i20;
                        s = s2;
                        cArr2 = cArr4;
                        ohp.R(canvas, cArr4, iArr, f2, i23, i26, i24, i27, f3, i28, i17, j, z2, z5);
                    }
                    i23 = i6;
                    f3 = 0.0f;
                    j = j2;
                    i24 = i3;
                    cArr = cArr2;
                }
                f3 += measureText;
                i22 = i6 + i4;
                i21 = i3 + i5;
                while (i21 < s) {
                    char c2 = cArr[i21];
                    boolean isHighSurrogate2 = Character.isHighSurrogate(c2);
                    int i29 = c2;
                    if (isHighSurrogate2) {
                        i29 = Character.toCodePoint(c2, cArr[i21 + 1]);
                    }
                    if (lTs.z(i29 == 1 ? 1 : 0) <= 0) {
                        if (!Character.isHighSurrogate(cArr[i21])) {
                            i7 = 1;
                        }
                        i21 += i7;
                    }
                }
                s2 = s;
                i16 = i16;
                i14 = i14;
                R = R;
                cArr4 = cArr;
            }
            int i30 = i14 - i23;
            int i31 = i21 - i24;
            if (z4) {
                gje = gje;
                i = gje.f3898R.f6727R[258];
            } else {
                gje = gje;
                i = 0;
            }
            ohp.R(canvas, cArr4, iArr, f2, i23, i30, i24, i31, f3, i, i17, j, C || (z4 && i17 == 0), z5);
            i18 = i20 + 1;
            f = f2;
            iArr3 = iArr;
            i9 = i9;
            i10 = i10;
            ide = ide;
            i13 = i13;
            i16 = i16;
            i14 = i14;
            i15 = i15;
            ohp = ohp;
            i17 = i17;
            terminalView = this;
        }
        c8A c8a2 = terminalView.f2425R;
        if (c8a2 != null && c8a2.f1976R) {
            c8a2.f1975R.c(c8a2.X, c8a2.L, false);
            c8a2.v.c(c8a2.O + 1, c8a2.Z, false);
            ActionMode actionMode = c8a2.f1972R;
            if (actionMode != null) {
                actionMode.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f2428R == null || !motionEvent.isFromSource(8194) || motionEvent.getAction() != 8) {
            return false;
        }
        if (motionEvent.getAxisValue(9) > 0.0f) {
            z = true;
        }
        v(motionEvent, z ? -3 : 3);
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        if (v) {
            mT0 mt0 = this.f2430R;
            StringBuilder C = opT.C("onKeyDown(keyCode=", i, ", isSystem()=");
            C.append(keyEvent.isSystem());
            C.append(", event=");
            C.append(keyEvent);
            C.append(")");
            ((lV4) mt0).R(C.toString());
        }
        if (this.f2428R == null) {
            return true;
        }
        if (O()) {
            m();
        }
        this.f2430R.getClass();
        if (keyEvent.isSystem()) {
            this.f2430R.getClass();
            return super.onKeyDown(i, keyEvent);
        } else if (keyEvent.getAction() == 2 && i == 0) {
            this.f2426R.c(keyEvent.getCharacters());
            return true;
        } else {
            int metaState = keyEvent.getMetaState();
            boolean z2 = keyEvent.isCtrlPressed() || ((Boolean) ((lV4) this.f2430R).f5760R.getValue()).booleanValue();
            boolean z3 = (metaState & 16) != 0 || ((Boolean) ((lV4) this.f2430R).v.getValue()).booleanValue();
            if (!keyEvent.isShiftPressed()) {
                this.f2430R.getClass();
                z = false;
            } else {
                z = true;
            }
            boolean z4 = (metaState & 32) != 0;
            int i2 = z2 ? 1073741824 : 0;
            if (keyEvent.isAltPressed() || z3) {
                i2 |= Integer.MIN_VALUE;
            }
            if (z) {
                i2 |= 536870912;
            }
            if (keyEvent.isNumLockOn()) {
                i2 |= 268435456;
            }
            if (keyEvent.isFunctionPressed() || !e(i, i2)) {
                int i3 = 28672;
                if (!z4) {
                    i3 = 28690;
                }
                int metaState2 = (~i3) & keyEvent.getMetaState();
                if (z) {
                    metaState2 |= 65;
                }
                this.f2430R.getClass();
                int unicodeChar = keyEvent.getUnicodeChar(metaState2);
                if (v) {
                    ((lV4) this.f2430R).R(jQ.U("KeyEvent#getUnicodeChar(", metaState2, ") returned: ", unicodeChar));
                }
                if (unicodeChar == 0) {
                    return false;
                }
                int i4 = this.L;
                if ((unicodeChar & Integer.MIN_VALUE) != 0) {
                    if (i4 != 0) {
                        X(keyEvent.getDeviceId(), this.L, z2, z3);
                    }
                    this.L = Integer.MAX_VALUE & unicodeChar;
                } else {
                    if (i4 != 0) {
                        int deadChar = KeyCharacterMap.getDeadChar(i4, unicodeChar);
                        if (deadChar > 0) {
                            unicodeChar = deadChar;
                        }
                        this.L = 0;
                    }
                    X(keyEvent.getDeviceId(), unicodeChar, z2, z3);
                }
                if (this.L != i4) {
                    invalidate();
                }
                return true;
            }
            if (v) {
                ((lV4) this.f2430R).R("handleKeyCode() took key event");
            }
            return true;
        }
    }

    @Override // android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (v) {
            mT0 mt0 = this.f2430R;
            ((lV4) mt0).R("onKeyPreIme(keyCode=" + i + ", event=" + keyEvent + ")");
        }
        if (i != 4) {
            this.f2430R.getClass();
        } else if (O()) {
            m();
            return true;
        } else {
            this.f2430R.getClass();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (v) {
            mT0 mt0 = this.f2430R;
            ((lV4) mt0).R("onKeyUp(keyCode=" + i + ", event=" + keyEvent + ")");
        }
        if (this.f2428R == null && i != 4) {
            return true;
        }
        this.f2430R.getClass();
        if (keyEvent.isSystem()) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        H();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClipData.Item itemAt;
        if (this.f2428R == null) {
            return true;
        }
        int action = motionEvent.getAction();
        if (O()) {
            x(motionEvent);
            this.f2427R.R(motionEvent);
            return true;
        }
        if (motionEvent.isFromSource(8194)) {
            if (motionEvent.isButtonPressed(2)) {
                if (action == 0) {
                    showContextMenu();
                }
                return true;
            } else if (motionEvent.isButtonPressed(4)) {
                ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
                if (!(primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null)) {
                    CharSequence coerceToText = itemAt.coerceToText(getContext());
                    if (!TextUtils.isEmpty(coerceToText)) {
                        this.f2428R.y(coerceToText.toString());
                    }
                }
            } else if (this.f2428R.N()) {
                int action2 = motionEvent.getAction();
                if (action2 == 0 || action2 == 1) {
                    Z(motionEvent, 0, motionEvent.getAction() == 0);
                } else if (action2 == 2) {
                    Z(motionEvent, 32, true);
                }
            }
        }
        this.f2427R.R(motionEvent);
        return true;
    }

    public void setIsTerminalViewKeyLoggingEnabled(boolean z) {
        v = z;
    }

    public void setTerminalViewClient(mT0 mt0) {
        this.f2430R = mt0;
    }

    public void setTextSize(int i) {
        oHp ohp = this.f2431R;
        this.f2431R = new oHp(ohp == null ? Typeface.MONOSPACE : ohp.f6725R, i);
        H();
    }

    public void setTopRow(int i) {
        this.e = i;
    }

    public void setTypeface(Typeface typeface) {
        this.f2431R = new oHp(typeface, this.f2431R.f6723R);
        H();
        invalidate();
    }

    public final void v(MotionEvent motionEvent, int i) {
        boolean z = i < 0;
        int abs = Math.abs(i);
        for (int i2 = 0; i2 < abs; i2++) {
            if (this.f2428R.N()) {
                Z(motionEvent, z ? 64 : 65, true);
            } else {
                gje gje = this.f2428R;
                idE ide = gje.f3905c;
                if (ide == gje.f3910v) {
                    e(z ? 19 : 20, 0);
                } else {
                    this.e = Math.min(0, Math.max(-ide.e, this.e + (z ? -1 : 1)));
                    if (!awakenScrollBars()) {
                        invalidate();
                    }
                }
            }
        }
    }

    public final void x(MotionEvent motionEvent) {
        if (getTextSelectionActionMode() != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return;
                    }
                } else if (getTextSelectionActionMode() != null) {
                    removeCallbacks(this.f2429R);
                    getTextSelectionActionMode().hide(-1);
                    return;
                } else {
                    return;
                }
            }
            if (getTextSelectionActionMode() != null) {
                postDelayed(this.f2429R, (long) ViewConfiguration.getDoubleTapTimeout());
            }
        }
    }
}
