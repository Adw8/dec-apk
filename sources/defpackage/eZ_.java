package defpackage;

import java.net.Proxy;

/* renamed from: eZ_  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class eZ_ {
    public static final /* synthetic */ int[] R;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        iArr[Proxy.Type.HTTP.ordinal()] = 2;
        R = iArr;
    }
}
