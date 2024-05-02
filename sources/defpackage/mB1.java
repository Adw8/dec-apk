package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: mB1  reason: default package */
/* loaded from: classes.dex */
public final class mB1 implements kDd {
    public final Jd R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f5963R;

    /* renamed from: R  reason: collision with other field name */
    public Handler f5964R;

    /* renamed from: R  reason: collision with other field name */
    public cUF f5965R;

    /* renamed from: R  reason: collision with other field name */
    public fJ4 f5966R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f5967R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public Executor f5968R;

    /* renamed from: R  reason: collision with other field name */
    public ThreadPoolExecutor f5969R;
    public final dq v;

    public mB1(Context context, Jd jd) {
        dq dqVar = hYY.R;
        if (context != null) {
            this.f5963R = context.getApplicationContext();
            this.R = jd;
            this.v = dqVar;
            return;
        }
        throw new NullPointerException("Context cannot be null");
    }

    @Override // defpackage.kDd
    public final void R(cUF cuf) {
        synchronized (this.f5967R) {
            this.f5965R = cuf;
        }
        c();
    }

    public final void c() {
        synchronized (this.f5967R) {
            if (this.f5965R != null) {
                if (this.f5968R == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new fz0("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f5969R = threadPoolExecutor;
                    this.f5968R = threadPoolExecutor;
                }
                this.f5968R.execute(new Runnable(this, 0) { // from class: lCx
                    public final /* synthetic */ mB1 R;
                    public final /* synthetic */ int e;

                    {
                        this.e = r2;
                        this.R = r1;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (this.e) {
                            case 0:
                                mB1 mb1 = this.R;
                                synchronized (mb1.f5967R) {
                                    try {
                                        if (mb1.f5965R != null) {
                                            try {
                                                ec7 e = mb1.e();
                                                int i = e.c;
                                                if (i == 2) {
                                                    synchronized (mb1.f5967R) {
                                                    }
                                                }
                                                if (i == 0) {
                                                    eug.R("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                                    dq dqVar = mb1.v;
                                                    Context context = mb1.f5963R;
                                                    dqVar.getClass();
                                                    Typeface s = bIw.R.s(context, new ec7[]{e}, 0);
                                                    MappedByteBuffer Z = cU5.Z(mb1.f5963R, e.f3164R);
                                                    if (Z == null || s == null) {
                                                        throw new RuntimeException("Unable to open file.");
                                                    }
                                                    eug.R("EmojiCompat.MetadataRepo.create");
                                                    piu piu = new piu(s, me6.c(Z));
                                                    eug.v();
                                                    eug.v();
                                                    synchronized (mb1.f5967R) {
                                                        cUF cuf = mb1.f5965R;
                                                        if (cuf != null) {
                                                            cuf.U(piu);
                                                        }
                                                    }
                                                    mb1.v();
                                                    return;
                                                }
                                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                                            } catch (Throwable th) {
                                                synchronized (mb1.f5967R) {
                                                    try {
                                                        cUF cuf2 = mb1.f5965R;
                                                        if (cuf2 != null) {
                                                            cuf2.H(th);
                                                        }
                                                        mb1.v();
                                                        return;
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            default:
                                this.R.c();
                                return;
                        }
                    }
                });
            }
        }
    }

    public final ec7 e() {
        try {
            dq dqVar = this.v;
            Context context = this.f5963R;
            Jd jd = this.R;
            dqVar.getClass();
            c85 R = aJV.R(context, jd);
            if (R.e == 0) {
                ec7[] ec7Arr = (ec7[]) R.R;
                if (ec7Arr != null && ec7Arr.length != 0) {
                    return ec7Arr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(jQ.j(opT.U("fetchFonts failed ("), R.e, ")"));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    public final void v() {
        synchronized (this.f5967R) {
            this.f5965R = null;
            fJ4 fj4 = this.f5966R;
            if (fj4 != null) {
                dq dqVar = this.v;
                Context context = this.f5963R;
                dqVar.getClass();
                context.getContentResolver().unregisterContentObserver(fj4);
                this.f5966R = null;
            }
            Handler handler = this.f5964R;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.f5964R = null;
            ThreadPoolExecutor threadPoolExecutor = this.f5969R;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.f5968R = null;
            this.f5969R = null;
        }
    }
}
