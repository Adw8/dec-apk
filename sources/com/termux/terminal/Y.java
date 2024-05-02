package com.termux.terminal;

import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes.dex */
public final class Y {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public gje f2413R;

    /* renamed from: R  reason: collision with other field name */
    public final Integer f2414R;

    /* renamed from: R  reason: collision with other field name */
    public nAq f2416R;

    /* renamed from: R  reason: collision with other field name */
    public final String[] f2418R;
    public final String c;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public final String f2420v;

    /* renamed from: v  reason: collision with other field name */
    public final String[] f2421v;

    /* renamed from: R  reason: collision with other field name */
    public final String f2415R = UUID.randomUUID().toString();

    /* renamed from: R  reason: collision with other field name */
    public final _K f2411R = new _K();

    /* renamed from: v  reason: collision with other field name */
    public final _K f2419v = new _K();

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f2417R = new byte[5];

    /* renamed from: R  reason: collision with other field name */
    public final c f2412R = new c(this);

    public Y(String str, String str2, String[] strArr, String[] strArr2, Integer num, B3 b3) {
        this.f2420v = str;
        this.c = str2;
        this.f2418R = strArr;
        this.f2421v = strArr2;
        this.f2414R = num;
        this.f2416R = b3;
    }

    public final void R() {
        this.f2416R.x();
    }

    public final void c(String str) {
        if (str != null) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            if (this.R > 0) {
                this.f2419v.v(bytes, length);
            }
        }
    }

    public final void v(int i, int i2) {
        Field field;
        if (this.f2413R == null) {
            this.f2413R = new gje(this, i, i2, this.f2414R, this.f2416R);
            int[] iArr = new int[1];
            this.v = JNI.createSubprocess(this.f2420v, this.c, this.f2418R, this.f2421v, iArr, i2, i);
            this.R = iArr[0];
            this.f2416R.Z();
            int i3 = this.v;
            nAq naq = this.f2416R;
            FileDescriptor fileDescriptor = new FileDescriptor();
            try {
                try {
                    field = FileDescriptor.class.getDeclaredField("descriptor");
                } catch (NoSuchFieldException unused) {
                    field = FileDescriptor.class.getDeclaredField("fd");
                }
                field.setAccessible(true);
                field.set(fileDescriptor, Integer.valueOf(i3));
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
                lTs.y(naq, "TerminalSession", "Error accessing FileDescriptor#descriptor private field", e);
                System.exit(1);
            }
            new mdr(this, jQ.j(opT.U("TermSessionInputReader[pid="), this.R, "]"), fileDescriptor, 0).start();
            new mdr(this, jQ.j(opT.U("TermSessionOutputWriter[pid="), this.R, "]"), fileDescriptor, 1).start();
            new d(this, jQ.j(opT.U("TermSessionWaiter[pid="), this.R, "]")).start();
            return;
        }
        JNI.setPtyWindowSize(this.v, i2, i);
        gje gje = this.f2413R;
        int i4 = gje.c;
        if (i4 != i2 || gje.e != i) {
            if (i < 2 || i2 < 2) {
                throw new IllegalArgumentException(jQ.U("rows=", i2, ", columns=", i));
            }
            if (i4 != i2) {
                gje.c = i2;
                gje.x = 0;
                gje.H = i2;
            }
            int i5 = gje.e;
            if (i5 != i) {
                gje.e = i;
                boolean[] zArr = gje.f3902R;
                gje.f3902R = new boolean[i];
                int i6 = 0;
                while (i6 < gje.e) {
                    gje.f3902R[i6] = (i6 & 7) == 0 && i6 != 0;
                    i6++;
                }
                System.arraycopy(zArr, 0, gje.f3902R, 0, Math.min(i5, i));
                gje.U = 0;
                gje.C = gje.e;
            }
            gje.o();
        }
    }
}
