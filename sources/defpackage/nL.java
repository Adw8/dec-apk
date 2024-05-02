package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: nL  reason: default package */
/* loaded from: classes.dex */
public final class nL {

    /* renamed from: R  reason: collision with other field name */
    public static final nL f6370R;

    /* renamed from: v  reason: collision with other field name */
    public static final nL f6371v;

    /* renamed from: R  reason: collision with other field name */
    public final int f6372R;

    /* renamed from: R  reason: collision with other field name */
    public final imt f6373R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f6374R;
    public static final String R = Character.toString(8206);
    public static final String v = Character.toString(8207);

    static {
        m8j m8j = iRg.c;
        f6370R = new nL(false, 2, m8j);
        f6371v = new nL(true, 2, m8j);
    }

    public nL(boolean z, int i, m8j m8j) {
        this.f6374R = z;
        this.f6372R = i;
        this.f6373R = m8j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (r3 != 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r4 == 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r0.v <= 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        switch(r0.R()) {
            case 14: goto L_0x008a;
            case 15: goto L_0x008a;
            case 16: goto L_0x0086;
            case 17: goto L_0x0086;
            case 18: goto L_0x0083;
            default: goto L_0x0082;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r3 != r5) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        if (r3 != r5) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int R(java.lang.CharSequence r9) {
        /*
            h1 r0 = new h1
            r0.<init>(r9)
            r9 = 0
            r0.v = r9
            r1 = -1
            r2 = 1
            r3 = r9
            r4 = r3
            r5 = r4
        L_0x000d:
            int r6 = r0.v
            int r7 = r0.f4014R
            if (r6 >= r7) goto L_0x0070
            if (r3 != 0) goto L_0x0070
            java.lang.CharSequence r7 = r0.f4015R
            char r6 = r7.charAt(r6)
            r0.f4013R = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x0039
            java.lang.CharSequence r6 = r0.f4015R
            int r7 = r0.v
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.v
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.v = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x004d
        L_0x0039:
            int r6 = r0.v
            int r6 = r6 + r2
            r0.v = r6
            char r6 = r0.f4013R
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L_0x0049
            byte[] r7 = defpackage.h1.R
            byte r6 = r7[r6]
            goto L_0x004d
        L_0x0049:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L_0x004d:
            if (r6 == 0) goto L_0x006b
            if (r6 == r2) goto L_0x0068
            r7 = 2
            if (r6 == r7) goto L_0x0068
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0060;
                case 17: goto L_0x0060;
                case 18: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x006e
        L_0x005c:
            int r5 = r5 + -1
            r4 = r9
            goto L_0x000d
        L_0x0060:
            int r5 = r5 + 1
            r4 = r2
            goto L_0x000d
        L_0x0064:
            int r5 = r5 + 1
            r4 = r1
            goto L_0x000d
        L_0x0068:
            if (r5 != 0) goto L_0x006e
            goto L_0x0088
        L_0x006b:
            if (r5 != 0) goto L_0x006e
            goto L_0x008c
        L_0x006e:
            r3 = r5
            goto L_0x000d
        L_0x0070:
            if (r3 != 0) goto L_0x0073
            goto L_0x0091
        L_0x0073:
            if (r4 == 0) goto L_0x0077
            r9 = r4
            goto L_0x0091
        L_0x0077:
            int r4 = r0.v
            if (r4 <= 0) goto L_0x0091
            byte r4 = r0.R()
            switch(r4) {
                case 14: goto L_0x008a;
                case 15: goto L_0x008a;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0077
        L_0x0086:
            if (r3 != r5) goto L_0x008e
        L_0x0088:
            r9 = r2
            goto L_0x0091
        L_0x008a:
            if (r3 != r5) goto L_0x008e
        L_0x008c:
            r9 = r1
            goto L_0x0091
        L_0x008e:
            int r5 = r5 + -1
            goto L_0x0077
        L_0x0091:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nL.R(java.lang.CharSequence):int");
    }

    public static nL c() {
        Locale locale = Locale.getDefault();
        int i = llz.R;
        boolean z = true;
        if (gjp.R(locale) != 1) {
            z = false;
        }
        return z ? f6371v : f6370R;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int v(java.lang.CharSequence r6) {
        /*
            h1 r0 = new h1
            r0.<init>(r6)
            int r6 = r0.f4014R
            r0.v = r6
            r6 = 0
            r1 = r6
        L_0x000b:
            r2 = r1
        L_0x000c:
            int r3 = r0.v
            r4 = 1
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.R()
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0029:
            if (r1 != r2) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r1 != r2) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r2 = r2 + -1
            goto L_0x000c
        L_0x0032:
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            r6 = r4
            goto L_0x0041
        L_0x0036:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r2 != 0) goto L_0x003d
        L_0x003b:
            r6 = -1
            goto L_0x0041
        L_0x003d:
            if (r1 != 0) goto L_0x000c
        L_0x003f:
            r1 = r2
            goto L_0x000b
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nL.v(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder e(CharSequence charSequence, imt imt) {
        if (charSequence == null) {
            return null;
        }
        boolean z = false;
        boolean c = imt.c(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f6372R & 2) != 0) {
            z = true;
        }
        String str = "";
        if (z) {
            boolean c2 = (c ? iRg.v : iRg.R).c(charSequence, charSequence.length());
            spannableStringBuilder.append((CharSequence) ((this.f6374R || (!c2 && R(charSequence) != 1)) ? (!this.f6374R || (c2 && R(charSequence) != -1)) ? str : v : R));
        }
        if (c != this.f6374R) {
            spannableStringBuilder.append(c ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean c3 = (c ? iRg.v : iRg.R).c(charSequence, charSequence.length());
        if (!this.f6374R && (c3 || v(charSequence) == 1)) {
            str = R;
        } else if (this.f6374R && (!c3 || v(charSequence) == -1)) {
            str = v;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
