package dev.kdrag0n.virt;

import dev.kdrag0n.virt.vm.VmNativeCallback;

/* loaded from: classes.dex */
public abstract class NativeLib {
    public static final /* synthetic */ int R = 0;

    static {
        System.loadLibrary("usb");
        System.loadLibrary("virtcontainer");
    }

    public static final native int a(String str, int i, String str2, String str3);

    public static final native int c(VmNativeCallback vmNativeCallback, String str, int i);

    public static final native int d(VmNativeCallback vmNativeCallback, int i, int i2, boolean z);

    public static final native int e(String str);

    public static final native int g(long j);

    public static final native int h(int i);

    public static final native int i(int i);

    public static final native int k(int i, int i2, String str);

    public static final native int l(int i, String str);

    public static final native int m(int i);
}
