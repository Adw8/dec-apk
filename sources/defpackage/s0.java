package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: s0  reason: default package */
/* loaded from: classes.dex */
public final class s0 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f7405R;
    public final int c;
    public final int e;
    public final int v;

    public s0(int i, int i2, int i3, int i4, byte[] bArr) {
        this.R = i;
        this.v = i2;
        this.c = i3;
        this.e = i4;
        this.f7405R = bArr;
    }

    public final String toString() {
        String str;
        String str2;
        byte readByte;
        switch (this.R) {
            case 1163086915:
                str = "CLSE";
                break;
            case 1163154007:
                str = "WRTE";
                break;
            case 1213486401:
                str = "AUTH";
                break;
            case 1313165391:
                str = "OPEN";
                break;
            case 1314410051:
                str = "CNXN";
                break;
            case 1497451343:
                str = "OKAY";
                break;
            default:
                str = "????";
                break;
        }
        String format = String.format("%X", Arrays.copyOf(new Object[]{Integer.valueOf(this.v)}, 1));
        String format2 = String.format("%X", Arrays.copyOf(new Object[]{Integer.valueOf(this.c)}, 1));
        int i = this.e;
        if (i == 0) {
            str2 = "";
        } else {
            int i2 = this.R;
            if (i2 == 1163154007) {
                ME me = new ME();
                me.write(this.f7405R, 0, i);
                String str3 = null;
                str2 = (me.R >= 5 && (readByte = me.readByte()) >= 0 && readByte <= 3 && me.g() == ((int) me.R)) ? readByte == 3 ? opT.m("[shell] exit(", me.readByte(), ")") : opT.H("[shell] ", new String(this.f7405R, 5, this.e - 5, O1.R)) : null;
                if (str2 == null) {
                    ME me2 = new ME();
                    me2.write(this.f7405R, 0, this.e);
                    if (me2.R >= 8) {
                        String k = me2.k(4, StandardCharsets.UTF_8);
                        if (k_.R.contains(k)) {
                            str3 = "[sync] " + k + "(" + me2.g() + ")";
                        }
                    }
                    str2 = str3 != null ? str3 : opT.m("payload[", this.e, "]");
                }
            } else if (i2 != 1213486401) {
                str2 = i2 != 1313165391 ? opT.m("payload[", i, "]") : new String(this.f7405R, 0, i - 1, O1.R);
            } else if (this.v == 3) {
                str2 = new String(this.f7405R, O1.R);
            } else {
                str2 = opT.m("auth[", i, "]");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("[");
        sb.append(format);
        sb.append(", ");
        sb.append(format2);
        return jQ.g(sb, "] ", str2);
    }
}
