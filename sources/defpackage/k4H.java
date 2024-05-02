package defpackage;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: k4H  reason: default package */
/* loaded from: classes.dex */
public final class k4H extends gQ7 {
    public final bEu R;

    /* renamed from: R  reason: collision with other field name */
    public final chG f5188R;

    /* renamed from: R  reason: collision with other field name */
    public final jSL f5189R;

    /* renamed from: R  reason: collision with other field name */
    public final Process f5190R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5191R;
    public int e;
    public final bEu v;

    public k4H(atb atb, Process process) {
        this.e = -1;
        try {
            this.f5191R = (atb.R & 8) == 8;
            this.f5190R = process;
            this.f5188R = new chG(process.getOutputStream());
            this.R = new bEu(process.getInputStream());
            this.v = new bEu(process.getErrorStream());
            jSL jsl = new jSL();
            this.f5189R = jsl;
            try {
                try {
                    try {
                        this.e = ((Integer) jsl.submit(new Callable(0, this) { // from class: j4v
                            public final /* synthetic */ Object R;
                            public final /* synthetic */ int e;

                            {
                                this.e = r1;
                                this.R = r2;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i = 0;
                                switch (this.e) {
                                    case 0:
                                        k4H k4h = (k4H) this.R;
                                        k4h.getClass();
                                        try {
                                            k4h.f5190R.exitValue();
                                            throw new IOException("Created process has terminated");
                                        } catch (IllegalThreadStateException unused) {
                                            biy.Z(k4h.R);
                                            biy.Z(k4h.v);
                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(k4h.R));
                                            try {
                                                k4h.f5188R.write("echo SHELL_TEST\n".getBytes(StandardCharsets.UTF_8));
                                                k4h.f5188R.flush();
                                                String readLine = bufferedReader.readLine();
                                                if (TextUtils.isEmpty(readLine) || !readLine.contains("SHELL_TEST")) {
                                                    throw new IOException("Created process is not a shell");
                                                }
                                                k4h.f5188R.write("id\n".getBytes(StandardCharsets.UTF_8));
                                                k4h.f5188R.flush();
                                                String readLine2 = bufferedReader.readLine();
                                                if (!TextUtils.isEmpty(readLine2) && readLine2.contains("uid=0")) {
                                                    synchronized (pdD.class) {
                                                        String property = System.getProperty("user.dir");
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append('\'');
                                                        int length = property.length();
                                                        while (i < length) {
                                                            char charAt = property.charAt(i);
                                                            if (charAt == '\'') {
                                                                sb.append("'\\''");
                                                            } else {
                                                                sb.append(charAt);
                                                            }
                                                            i++;
                                                        }
                                                        sb.append('\'');
                                                        String sb2 = sb.toString();
                                                        chG chg = k4h.f5188R;
                                                        chg.write(("cd " + sb2 + "\n").getBytes(StandardCharsets.UTF_8));
                                                        k4h.f5188R.flush();
                                                        i = 1;
                                                    }
                                                }
                                                if (i == 1) {
                                                    k4h.f5188R.write("readlink /proc/self/ns/mnt\n".getBytes(StandardCharsets.UTF_8));
                                                    k4h.f5188R.flush();
                                                    String readLine3 = bufferedReader.readLine();
                                                    k4h.f5188R.write("readlink /proc/1/ns/mnt\n".getBytes(StandardCharsets.UTF_8));
                                                    k4h.f5188R.flush();
                                                    String readLine4 = bufferedReader.readLine();
                                                    if (!TextUtils.isEmpty(readLine3) && !TextUtils.isEmpty(readLine4) && TextUtils.equals(readLine3, readLine4)) {
                                                        i = 2;
                                                    }
                                                }
                                                bufferedReader.close();
                                                return Integer.valueOf(i);
                                            } catch (Throwable th) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                                throw th;
                                            }
                                        }
                                    case 1:
                                        d2J d2j = (d2J) this.R;
                                        int i2 = d2J.R;
                                        d2j.getClass();
                                        d2j.getClass();
                                        throw null;
                                    default:
                                        biy biy = (biy) this.R;
                                        biy.getClass();
                                        new HashMap();
                                        biy.getClass();
                                        throw null;
                                }
                            }
                        }).get(20, TimeUnit.SECONDS)).intValue();
                    } catch (ExecutionException e) {
                        Throwable cause = e.getCause();
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        throw new IOException("Unknown ExecutionException", cause);
                    }
                } catch (TimeoutException e2) {
                    throw new IOException("Shell check timeout", e2);
                }
            } catch (InterruptedException e3) {
                throw new IOException("Shell check interrupted", e3);
            }
        } catch (IOException e4) {
            this.f5189R.shutdownNow();
            c();
            throw e4;
        }
    }

    public final synchronized void R(jfr jfr) {
        if (this.e >= 0) {
            biy.Z(this.R);
            biy.Z(this.v);
            try {
                this.f5188R.write(10);
                this.f5188R.flush();
                jfr.R(this.f5188R, this.R, this.v);
            } catch (IOException unused) {
                c();
                throw new pyp();
            }
        } else {
            throw new pyp();
        }
    }

    public final void c() {
        this.e = -1;
        try {
            this.f5188R.R();
        } catch (IOException unused) {
        }
        try {
            this.v.R();
        } catch (IOException unused2) {
        }
        try {
            this.R.R();
        } catch (IOException unused3) {
        }
        this.f5190R.destroy();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e >= 0) {
            this.f5189R.shutdownNow();
            c();
        }
    }
}
