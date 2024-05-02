package defpackage;

import java.security.SecureRandom;

/* renamed from: fjr  reason: default package */
/* loaded from: classes.dex */
public final class fjr {
    public static final /* synthetic */ fjr R = new fjr();

    /* renamed from: R  reason: collision with other field name */
    public static final String f3539R;

    static {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        f3539R = fPS.R(bArr);
    }
}
