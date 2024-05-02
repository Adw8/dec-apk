package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: c5L  reason: default package */
/* loaded from: classes.dex */
public final class c5L {
    public static final HashMap R = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public final File f1962R;

    /* renamed from: R  reason: collision with other field name */
    public FileChannel f1963R;

    /* renamed from: R  reason: collision with other field name */
    public final Lock f1964R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f1965R;

    public c5L(String str, File file, boolean z) {
        Lock lock;
        File file2 = new File(file, opT.H(str, ".lck"));
        this.f1962R = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap hashMap = R;
        synchronized (hashMap) {
            lock = (Lock) hashMap.get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                hashMap.put(absolutePath, lock);
            }
        }
        this.f1964R = lock;
        this.f1965R = z;
    }

    public final void R() {
        FileChannel fileChannel = this.f1963R;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f1964R.unlock();
    }
}
