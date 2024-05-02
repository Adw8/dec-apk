package defpackage;

import com.termux.terminal.Y;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: mdr  reason: default package */
/* loaded from: classes.dex */
public final class mdr extends Thread {
    public final /* synthetic */ Y R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ FileDescriptor f6096R;
    public final /* synthetic */ int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mdr(Y y, String str, FileDescriptor fileDescriptor, int i) {
        super(str);
        this.e = i;
        this.R = y;
        this.f6096R = fileDescriptor;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                try {
                    FileInputStream fileInputStream = new FileInputStream(this.f6096R);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read != -1 && this.R.f2411R.v(bArr, read)) {
                            this.R.f2412R.sendEmptyMessage(1);
                        }
                    }
                    fileInputStream.close();
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                byte[] bArr2 = new byte[4096];
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f6096R);
                    while (true) {
                        int R = this.R.f2419v.R(true, bArr2);
                        if (R == -1) {
                            fileOutputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr2, 0, R);
                    }
                } catch (IOException unused2) {
                    return;
                }
        }
    }
}
