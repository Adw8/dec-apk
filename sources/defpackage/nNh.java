package defpackage;

import android.text.Editable;

/* renamed from: nNh  reason: default package */
/* loaded from: classes.dex */
public final class nNh extends Editable.Factory {
    public static Class R;

    /* renamed from: R  reason: collision with other field name */
    public static final Object f6379R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public static volatile nNh f6380R;

    public nNh() {
        try {
            R = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, nNh.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = R;
        return cls != null ? new aVn(cls, charSequence) : super.newEditable(charSequence);
    }
}
