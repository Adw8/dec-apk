package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: dfg  reason: default package */
/* loaded from: classes.dex */
public final class dfg {
    public static volatile dfg R;

    /* renamed from: R  reason: collision with other field name */
    public static final Object f2803R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public volatile int f2804R;

    /* renamed from: R  reason: collision with other field name */
    public final h3S f2807R;

    /* renamed from: R  reason: collision with other field name */
    public final i37 f2808R;

    /* renamed from: R  reason: collision with other field name */
    public final ReentrantReadWriteLock f2809R;

    /* renamed from: R  reason: collision with other field name */
    public final kDd f2810R;
    public final int v;

    /* renamed from: R  reason: collision with other field name */
    public final Handler f2806R = new Handler(Looper.getMainLooper());

    /* renamed from: R  reason: collision with other field name */
    public final L5 f2805R = new L5();

    public dfg(hYY hyy) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f2809R = reentrantReadWriteLock;
        this.f2804R = 3;
        this.f2810R = ((k3T) hyy).f5187R;
        int i = ((k3T) hyy).R;
        this.v = i;
        this.f2807R = ((k3T) hyy).f5186R;
        i37 i37 = new i37(this);
        this.f2808R = i37;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f2804R = 0;
            } catch (Throwable th) {
                this.f2809R.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (v() == 0) {
            try {
                ((dfg) ((gL6) i37).R).f2810R.R(new kCi(i37));
            } catch (Throwable th2) {
                ((dfg) ((gL6) i37).R).e(th2);
            }
        }
    }

    public static dfg R() {
        dfg dfg;
        synchronized (f2803R) {
            dfg = R;
            if (!(dfg != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return dfg;
    }

    public final void L(jbB jbb) {
        if (jbb != null) {
            this.f2809R.writeLock().lock();
            try {
                if (!(this.f2804R == 1 || this.f2804R == 2)) {
                    this.f2805R.add(jbb);
                }
                this.f2806R.post(new kBb(jbb, this.f2804R));
            } finally {
                this.f2809R.writeLock().unlock();
            }
        } else {
            throw new NullPointerException("initCallback cannot be null");
        }
    }

    public final CharSequence O(int i, int i2, CharSequence charSequence) {
        boolean z = true;
        if (!(v() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        } else if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        } else if (i2 >= 0) {
            gvP.x("start should be <= than end", i <= i2);
            if (charSequence == null) {
                return null;
            }
            gvP.x("start should be < than charSequence length", i <= charSequence.length());
            if (i2 > charSequence.length()) {
                z = false;
            }
            gvP.x("end should be < than charSequence length", z);
            return (charSequence.length() == 0 || i == i2) ? charSequence : this.f2808R.s(charSequence, i, i2, false);
        } else {
            throw new IllegalArgumentException("end cannot be negative");
        }
    }

    /* JADX INFO: finally extract failed */
    public final void X() {
        ArrayList arrayList = new ArrayList();
        this.f2809R.writeLock().lock();
        try {
            this.f2804R = 1;
            arrayList.addAll(this.f2805R);
            this.f2805R.clear();
            this.f2809R.writeLock().unlock();
            this.f2806R.post(new kBb(this.f2804R, arrayList));
        } catch (Throwable th) {
            this.f2809R.writeLock().unlock();
            throw th;
        }
    }

    public final void c() {
        boolean z = true;
        if (this.v == 1) {
            if (v() != 1) {
                z = false;
            }
            if (!z) {
                this.f2809R.writeLock().lock();
                try {
                    if (this.f2804R != 0) {
                        this.f2804R = 0;
                        this.f2809R.writeLock().unlock();
                        i37 i37 = this.f2808R;
                        i37.getClass();
                        try {
                            ((dfg) ((gL6) i37).R).f2810R.R(new kCi(i37));
                        } catch (Throwable th) {
                            ((dfg) ((gL6) i37).R).e(th);
                        }
                    }
                } finally {
                    this.f2809R.writeLock().unlock();
                }
            }
        } else {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2809R.writeLock().lock();
        try {
            this.f2804R = 2;
            arrayList.addAll(this.f2805R);
            this.f2805R.clear();
            this.f2809R.writeLock().unlock();
            this.f2806R.post(new kBb(arrayList, this.f2804R, th));
        } catch (Throwable th2) {
            this.f2809R.writeLock().unlock();
            throw th2;
        }
    }

    public final int v() {
        this.f2809R.readLock().lock();
        try {
            return this.f2804R;
        } finally {
            this.f2809R.readLock().unlock();
        }
    }
}
