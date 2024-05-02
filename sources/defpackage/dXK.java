package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: dXK  reason: default package */
/* loaded from: classes.dex */
public final class dXK extends oC1 {
    public final int O;
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final InputStream f2659R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2660R;
    public final int X;
    public final int c;
    public final int e;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final long f2661v;

    /* renamed from: v  reason: collision with other field name */
    public final String f2662v;

    public dXK(int i, String str, int i2, long j, String str2, String str3, int i3, int i4, int i5, long j2, int i6, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(i, str);
        this.v = i2;
        this.R = j;
        this.f2660R = str2;
        this.f2662v = str3;
        this.c = i3;
        this.e = i4;
        this.X = i5;
        this.f2661v = j2;
        this.O = i6;
        this.f2659R = autoCloseInputStream;
    }
}
