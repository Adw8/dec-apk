package defpackage;

import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* renamed from: NV  reason: default package */
/* loaded from: classes.dex */
public interface NV extends axx, WritableByteChannel {
    NV A(long j);

    NV F(String str, Charset charset);

    NV I(int i);

    NV V(int i);

    @Override // defpackage.axx, java.io.Flushable
    void flush();

    NV i(byte[] bArr);

    NV m(int i);

    NV s(int i, int i2, String str);

    ME v();

    NV w(String str);

    NV x(byte[] bArr, int i, int i2);

    NV y(F6 f6);

    NV z(int i);
}
