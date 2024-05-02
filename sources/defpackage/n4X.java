package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* renamed from: n4X  reason: default package */
/* loaded from: classes.dex */
public final class n4X implements fIY {
    public aDq R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f6288R;

    /* renamed from: R  reason: collision with other field name */
    public final fIY f6289R;

    /* renamed from: R  reason: collision with other field name */
    public final File f6290R;

    /* renamed from: R  reason: collision with other field name */
    public final String f6291R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6292R;
    public final int e;

    public n4X(Context context, String str, File file, int i, fIY fiy) {
        this.f6288R = context;
        this.f6291R = str;
        this.f6290R = file;
        this.e = i;
        this.f6289R = fiy;
    }

    @Override // defpackage.fIY
    public final synchronized gEL L() {
        if (!this.f6292R) {
            c();
            this.f6292R = true;
        }
        return this.f6289R.L();
    }

    /* JADX INFO: finally extract failed */
    public final void R(File file) {
        ReadableByteChannel readableByteChannel;
        if (this.f6291R != null) {
            readableByteChannel = Channels.newChannel(this.f6288R.getAssets().open(this.f6291R));
        } else if (this.f6290R != null) {
            readableByteChannel = new FileInputStream(this.f6290R).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f6288R.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        try {
            channel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            channel.force(false);
            readableByteChannel.close();
            channel.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                StringBuilder U = opT.U("Failed to create directories for ");
                U.append(file.getAbsolutePath());
                throw new IOException(U.toString());
            } else if (!createTempFile.renameTo(file)) {
                StringBuilder U2 = opT.U("Failed to move intermediate file (");
                U2.append(createTempFile.getAbsolutePath());
                U2.append(") to destination (");
                U2.append(file.getAbsolutePath());
                U2.append(").");
                throw new IOException(U2.toString());
            }
        } catch (Throwable th) {
            readableByteChannel.close();
            channel.close();
            throw th;
        }
    }

    public final void c() {
        String databaseName = getDatabaseName();
        File databasePath = this.f6288R.getDatabasePath(databaseName);
        c5L c5l = new c5L(databaseName, this.f6288R.getFilesDir(), this.R == null);
        try {
            c5l.f1964R.lock();
            if (c5l.f1965R) {
                try {
                    FileChannel channel = new FileOutputStream(c5l.f1962R).getChannel();
                    c5l.f1963R = channel;
                    channel.lock();
                } catch (IOException e) {
                    throw new IllegalStateException("Unable to grab copy lock.", e);
                }
            }
            if (!databasePath.exists()) {
                try {
                    R(databasePath);
                    c5l.R();
                    return;
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to copy database file.", e2);
                }
            } else if (this.R == null) {
                c5l.R();
                return;
            } else {
                try {
                    int S = hDC.S(databasePath);
                    int i = this.e;
                    if (S == i) {
                        c5l.R();
                        return;
                    } else if (this.R.R(S, i)) {
                        c5l.R();
                        return;
                    } else {
                        if (this.f6288R.deleteDatabase(databaseName)) {
                            try {
                                R(databasePath);
                            } catch (IOException e3) {
                                Log.w("ROOM", "Unable to copy database file.", e3);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        c5l.R();
                        return;
                    }
                } catch (IOException e4) {
                    Log.w("ROOM", "Unable to read database version.", e4);
                    c5l.R();
                    return;
                }
            }
        } catch (Throwable th) {
            c5l.R();
            throw th;
        }
        c5l.R();
        throw th;
    }

    @Override // defpackage.fIY, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f6289R.close();
        this.f6292R = false;
    }

    @Override // defpackage.fIY
    public final String getDatabaseName() {
        return this.f6289R.getDatabaseName();
    }

    @Override // defpackage.fIY
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.f6289R.setWriteAheadLoggingEnabled(z);
    }
}
