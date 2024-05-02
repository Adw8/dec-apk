package defpackage;

import java.io.File;
import java.util.Iterator;

/* renamed from: kSQ  reason: default package */
/* loaded from: classes.dex */
public final class kSQ implements pvc {
    public final int R = 2;

    /* renamed from: R  reason: collision with other field name */
    public final File f5298R;

    public kSQ(File file) {
        this.f5298R = file;
    }

    @Override // defpackage.pvc
    public final Iterator iterator() {
        return new fAG(this);
    }
}
