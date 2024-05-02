package defpackage;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* renamed from: A8  reason: default package */
/* loaded from: classes.dex */
public abstract class A8 {
    public static final void R(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void v(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
