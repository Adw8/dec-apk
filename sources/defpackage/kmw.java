package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.io.Serializable;
import java.io.Writer;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: kmw  reason: default package */
/* loaded from: classes.dex */
public final class kmw extends jy3 {
    public final /* synthetic */ int v;

    public /* synthetic */ kmw(int i) {
        this.v = i;
    }

    public static lkt e(afC afc) {
        int I = jQ.I(afc.a());
        if (I == 0) {
            itC itc = new itC();
            afc.R();
            while (afc.j()) {
                itc.R.add(e(afc));
            }
            afc.Z();
            return itc;
        } else if (I == 2) {
            jRo jro = new jRo();
            afc.c();
            while (afc.j()) {
                jro.R.put(afc.k(), e(afc));
            }
            afc.H();
            return jro;
        } else if (I == 5) {
            return new gh4(afc.M());
        } else {
            if (I == 6) {
                return new gh4(new hSd(afc.M()));
            }
            if (I == 7) {
                return new gh4(Boolean.valueOf(afc.d()));
            }
            if (I == 8) {
                afc.B();
                return jQR.R;
            }
            throw new IllegalArgumentException();
        }
    }

    public static void m(lkt lkt, p12 p12) {
        if (lkt == null || (lkt instanceof jQR)) {
            p12.O();
            return;
        }
        boolean z = lkt instanceof gh4;
        if (!z) {
            boolean z2 = lkt instanceof itC;
            if (z2) {
                p12.o();
                p12.R();
                int i = p12.e;
                int[] iArr = p12.f7055R;
                if (i == iArr.length) {
                    p12.f7055R = Arrays.copyOf(iArr, i * 2);
                }
                int[] iArr2 = p12.f7055R;
                int i2 = p12.e;
                p12.e = i2 + 1;
                iArr2[i2] = 1;
                p12.f7052R.write(91);
                if (z2) {
                    Iterator it = ((itC) lkt).iterator();
                    while (it.hasNext()) {
                        m((lkt) it.next(), p12);
                    }
                    p12.c(1, 2, ']');
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + lkt);
            } else if (lkt instanceof jRo) {
                p12.o();
                p12.R();
                int i3 = p12.e;
                int[] iArr3 = p12.f7055R;
                if (i3 == iArr3.length) {
                    p12.f7055R = Arrays.copyOf(iArr3, i3 * 2);
                }
                int[] iArr4 = p12.f7055R;
                int i4 = p12.e;
                p12.e = i4 + 1;
                iArr4[i4] = 3;
                p12.f7052R.write(123);
                for (Map.Entry entry : lkt.v().R.entrySet()) {
                    p12.X((String) entry.getKey());
                    m((lkt) entry.getValue(), p12);
                }
                p12.c(3, 5, '}');
            } else {
                StringBuilder U = opT.U("Couldn't write ");
                U.append(lkt.getClass());
                throw new IllegalArgumentException(U.toString());
            }
        } else if (z) {
            gh4 gh4 = (gh4) lkt;
            Serializable serializable = gh4.R;
            if (serializable instanceof Number) {
                p12.j(gh4.H());
                return;
            }
            boolean z3 = serializable instanceof Boolean;
            if (z3) {
                boolean booleanValue = z3 ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(gh4.c());
                p12.o();
                p12.R();
                p12.f7052R.write(booleanValue ? "true" : "false");
                return;
            }
            p12.t(gh4.c());
        } else {
            throw new IllegalStateException("Not a JSON Primitive: " + lkt);
        }
    }

    public final void L(p12 p12, Number number) {
        switch (this.v) {
            case 22:
                p12.j(number);
                return;
            case 23:
                p12.j(number);
                return;
            default:
                p12.j(number);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a4, code lost:
        if (r15.W() != 0) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00af, code lost:
        if (java.lang.Integer.parseInt(r0) != 0) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(defpackage.afC r15) {
        /*
        // Method dump skipped, instructions count: 760
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmw.O(afC):java.lang.Object");
    }

    public final Number X(afC afc) {
        switch (this.v) {
            case 22:
                if (afc.a() == 9) {
                    afc.B();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) afc.W());
                } catch (NumberFormatException e) {
                    throw new gnq(e);
                }
            case 23:
                if (afc.a() == 9) {
                    afc.B();
                    return null;
                }
                try {
                    return Short.valueOf((short) afc.W());
                } catch (NumberFormatException e2) {
                    throw new gnq(e2);
                }
            default:
                if (afc.a() == 9) {
                    afc.B();
                    return null;
                }
                try {
                    return Integer.valueOf(afc.W());
                } catch (NumberFormatException e3) {
                    throw new gnq(e3);
                }
        }
    }

    public final void Z(p12 p12, Object obj) {
        int i = this.v;
        String str = "true";
        int i2 = 0;
        String str2 = null;
        switch (i) {
            case 0:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                p12.o();
                p12.R();
                int i3 = p12.e;
                int[] iArr = p12.f7055R;
                if (i3 == iArr.length) {
                    p12.f7055R = Arrays.copyOf(iArr, i3 * 2);
                }
                int[] iArr2 = p12.f7055R;
                int i4 = p12.e;
                p12.e = i4 + 1;
                iArr2[i4] = 1;
                p12.f7052R.write(91);
                int length = atomicIntegerArray.length();
                while (i2 < length) {
                    p12.C((long) atomicIntegerArray.get(i2));
                    i2++;
                }
                p12.c(1, 2, ']');
                return;
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 21:
            default:
                boolean z = ((AtomicBoolean) obj).get();
                p12.o();
                p12.R();
                Writer writer = p12.f7052R;
                if (!z) {
                    str = "false";
                }
                writer.write(str);
                return;
            case 4:
                Character ch = (Character) obj;
                if (ch != null) {
                    str2 = String.valueOf(ch);
                }
                p12.t(str2);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                p12.t((String) obj);
                return;
            case VmNativeCallback.$stable:
                StringBuilder sb = (StringBuilder) obj;
                if (sb != null) {
                    str2 = sb.toString();
                }
                p12.t(str2);
                return;
            case 9:
                StringBuffer stringBuffer = (StringBuffer) obj;
                if (stringBuffer != null) {
                    str2 = stringBuffer.toString();
                }
                p12.t(str2);
                return;
            case 10:
                StringBuilder U = opT.U("Attempted to serialize java.lang.Class: ");
                U.append(((Class) obj).getName());
                U.append(". Forgot to register a type adapter?");
                throw new UnsupportedOperationException(U.toString());
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                URL url = (URL) obj;
                if (url != null) {
                    str2 = url.toExternalForm();
                }
                p12.t(str2);
                return;
            case 12:
                URI uri = (URI) obj;
                if (uri != null) {
                    str2 = uri.toASCIIString();
                }
                p12.t(str2);
                return;
            case 13:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress != null) {
                    str2 = inetAddress.getHostAddress();
                }
                p12.t(str2);
                return;
            case 14:
                UUID uuid = (UUID) obj;
                if (uuid != null) {
                    str2 = uuid.toString();
                }
                p12.t(str2);
                return;
            case 15:
                p12.t(((Currency) obj).getCurrencyCode());
                return;
            case 16:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    p12.O();
                    return;
                }
                p12.o();
                p12.R();
                int i5 = p12.e;
                int[] iArr3 = p12.f7055R;
                if (i5 == iArr3.length) {
                    p12.f7055R = Arrays.copyOf(iArr3, i5 * 2);
                }
                int[] iArr4 = p12.f7055R;
                int i6 = p12.e;
                p12.e = i6 + 1;
                iArr4[i6] = 3;
                p12.f7052R.write(123);
                p12.X("year");
                p12.C((long) calendar.get(1));
                p12.X("month");
                p12.C((long) calendar.get(2));
                p12.X("dayOfMonth");
                p12.C((long) calendar.get(5));
                p12.X("hourOfDay");
                p12.C((long) calendar.get(11));
                p12.X("minute");
                p12.C((long) calendar.get(12));
                p12.X("second");
                p12.C((long) calendar.get(13));
                p12.c(3, 5, '}');
                return;
            case 17:
                Locale locale = (Locale) obj;
                if (locale != null) {
                    str2 = locale.toString();
                }
                p12.t(str2);
                return;
            case 18:
                m((lkt) obj, p12);
                return;
            case 19:
                BitSet bitSet = (BitSet) obj;
                p12.o();
                p12.R();
                int i7 = p12.e;
                int[] iArr5 = p12.f7055R;
                if (i7 == iArr5.length) {
                    p12.f7055R = Arrays.copyOf(iArr5, i7 * 2);
                }
                int[] iArr6 = p12.f7055R;
                int i8 = p12.e;
                p12.e = i8 + 1;
                iArr6[i8] = 1;
                p12.f7052R.write(91);
                int length2 = bitSet.length();
                while (i2 < length2) {
                    p12.C(bitSet.get(i2) ? 1 : 0);
                    i2++;
                }
                p12.c(1, 2, ']');
                return;
            case 20:
                Boolean bool = (Boolean) obj;
                switch (i) {
                    case 20:
                        if (bool == null) {
                            p12.O();
                            return;
                        }
                        p12.o();
                        p12.R();
                        Writer writer2 = p12.f7052R;
                        if (!bool.booleanValue()) {
                            str = "false";
                        }
                        writer2.write(str);
                        return;
                    default:
                        p12.t(bool == null ? "null" : bool.toString());
                        return;
                }
            case 22:
                L(p12, (Number) obj);
                return;
            case 23:
                L(p12, (Number) obj);
                return;
            case 24:
                L(p12, (Number) obj);
                return;
            case 25:
                p12.C((long) ((AtomicInteger) obj).get());
                return;
        }
    }
}
