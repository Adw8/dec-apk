package defpackage;

import java.util.Arrays;

/* renamed from: npR  reason: default package */
/* loaded from: classes.dex */
public final class npR {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final aLF f6604R;

    /* renamed from: R  reason: collision with other field name */
    public final dtx f6605R;

    /* renamed from: R  reason: collision with other field name */
    public final hPF f6606R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f6607R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f6608R;

    public npR(Object obj, byte[] bArr, aLF alf, hPF hpf, int i, dtx dtx) {
        this.f6607R = obj;
        this.f6608R = Arrays.copyOf(bArr, bArr.length);
        this.f6604R = alf;
        this.f6606R = hpf;
        this.R = i;
        this.f6605R = dtx;
    }

    public final byte[] R() {
        byte[] bArr = this.f6608R;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
