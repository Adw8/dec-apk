package com.termux.terminal;

/* access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class JNI {
    public static native void close(int i);

    public static native int createSubprocess(String str, String str2, String[] strArr, String[] strArr2, int[] iArr, int i, int i2);

    public static native void setPtyWindowSize(int i, int i2, int i3);

    public static native int waitFor(int i);
}
