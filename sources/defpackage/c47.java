package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: c47  reason: default package */
/* loaded from: classes.dex */
public final class c47 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final ColorStateList f1956R;

    /* renamed from: R  reason: collision with other field name */
    public final Configuration f1957R;

    public c47(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f1956R = colorStateList;
        this.f1957R = configuration;
        this.R = theme == null ? 0 : theme.hashCode();
    }
}
