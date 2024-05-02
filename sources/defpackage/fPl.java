package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: fPl  reason: default package */
/* loaded from: classes.dex */
public final class fPl implements Iterator, dsi {
    public String R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pn f3417R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3418R;

    public fPl(pn pnVar) {
        this.f3417R = pnVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.R == null && !this.f3418R) {
            String readLine = ((BufferedReader) this.f3417R.f7262R).readLine();
            this.R = readLine;
            if (readLine == null) {
                this.f3418R = true;
            }
        }
        return this.R != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            String str = this.R;
            this.R = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
