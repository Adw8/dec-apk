package defpackage;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: k  reason: default package */
/* loaded from: classes.dex */
public final class k implements Enumeration {
    public int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ q f5177R;

    public k(q qVar) {
        this.f5177R = qVar;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.R < this.f5177R.f7346R.length;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        int i = this.R;
        b[] bVarArr = this.f5177R.f7346R;
        if (i < bVarArr.length) {
            this.R = i + 1;
            return bVarArr[i];
        }
        throw new NoSuchElementException();
    }
}
