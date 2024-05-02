package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: iH7  reason: default package */
/* loaded from: classes.dex */
public final class iH7 extends IOException {
    public /* synthetic */ iH7(String str) {
        super(str);
    }

    public /* synthetic */ iH7(int i) {
        super(String.format("ADB stream is closed for localId: %x", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
    }
}
