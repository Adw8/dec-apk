package defpackage;

import java.util.Iterator;

/* renamed from: gzK  reason: default package */
/* loaded from: classes.dex */
public final class gzK implements pvc {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final iv7 f4009R;

    /* renamed from: R  reason: collision with other field name */
    public final CharSequence f4010R;
    public final int v;

    public gzK(CharSequence charSequence, int i, int i2, jgi jgi) {
        this.f4010R = charSequence;
        this.R = i;
        this.v = i2;
        this.f4009R = jgi;
    }

    @Override // defpackage.pvc
    public final Iterator iterator() {
        return new kd_(this);
    }
}
