package defpackage;

import java.io.File;
import java.util.ArrayDeque;

/* renamed from: fAG  reason: default package */
/* loaded from: classes.dex */
public final class fAG extends h6 {
    public final ArrayDeque R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kSQ f3333R;

    public fAG(kSQ ksq) {
        this.f3333R = ksq;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.R = arrayDeque;
        if (ksq.f5298R.isDirectory()) {
            arrayDeque.push(v(ksq.f5298R));
        } else if (ksq.f5298R.isFile()) {
            arrayDeque.push(new cr_(ksq.f5298R));
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.h6
    public final void R() {
        File file;
        File R;
        while (true) {
            ciy ciy = (ciy) this.R.peek();
            if (ciy != null) {
                R = ciy.R();
                if (R != null) {
                    if (n3x.v(R, ciy.R) || !R.isDirectory()) {
                        break;
                    }
                    int size = this.R.size();
                    this.f3333R.getClass();
                    if (size >= Integer.MAX_VALUE) {
                        break;
                    }
                    this.R.push(v(R));
                } else {
                    this.R.pop();
                }
            } else {
                file = null;
                break;
            }
        }
        file = R;
        if (file != null) {
            ((h6) this).R = file;
            this.e = 1;
            return;
        }
        this.e = 3;
    }

    public final ku2 v(File file) {
        int I = jQ.I(this.f3333R.R);
        if (I == 0) {
            return new dDB(this, file);
        }
        if (I == 1) {
            return new cnl(this, file);
        }
        throw new j8f((Object) null);
    }
}
