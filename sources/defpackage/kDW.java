package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: kDW  reason: default package */
/* loaded from: classes.dex */
public final class kDW extends oC1 {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final InputStream f5213R;

    /* renamed from: R  reason: collision with other field name */
    public final String f5214R;
    public final int c;

    /* renamed from: c  reason: collision with other field name */
    public final long f5215c;
    public final int e;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final long f5216v;

    public kDW(int i, String str, int i2, long j, int i3, long j2, int i4, String str2, long j3, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(i, str);
        this.v = i2;
        this.R = j;
        this.c = i3;
        this.f5216v = j2;
        this.e = i4;
        this.f5214R = str2;
        this.f5215c = j3;
        this.f5213R = autoCloseInputStream;
    }
}
