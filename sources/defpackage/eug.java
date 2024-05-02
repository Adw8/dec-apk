package defpackage;

import android.os.Trace;

/* renamed from: eug  reason: default package */
/* loaded from: classes.dex */
public abstract class eug {
    public static void R(String str) {
        Trace.beginSection(str);
    }

    public static void v() {
        Trace.endSection();
    }
}
