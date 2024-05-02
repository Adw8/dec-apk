package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: h1W  reason: default package */
/* loaded from: classes.dex */
public final class h1W {

    /* renamed from: R  reason: collision with other field name */
    public final Set f4022R;
    public final ArrayList R = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList c = new ArrayList();

    public h1W(HashSet hashSet) {
        this.f4022R = hashSet;
    }

    public final void R() {
        if (!this.f4022R.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = this.f4022R.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((ddq) it.next()).c();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void X(ddq ddq) {
        int lastIndexOf = this.v.lastIndexOf(ddq);
        if (lastIndexOf >= 0) {
            this.v.remove(lastIndexOf);
            this.f4022R.remove(ddq);
            return;
        }
        this.R.add(ddq);
    }

    public final void c() {
        if (!this.c.isEmpty()) {
            Trace.beginSection("Compose:sideeffects");
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((f_c) arrayList.get(i)).g();
                }
                this.c.clear();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(ddq ddq) {
        int lastIndexOf = this.R.lastIndexOf(ddq);
        if (lastIndexOf >= 0) {
            this.R.remove(lastIndexOf);
            this.f4022R.remove(ddq);
            return;
        }
        this.v.add(ddq);
    }

    public final void v() {
        if (!this.v.isEmpty()) {
            Trace.beginSection("Compose:onForgotten");
            try {
                for (int size = this.v.size() - 1; -1 < size; size--) {
                    ddq ddq = (ddq) this.v.get(size);
                    if (!this.f4022R.contains(ddq)) {
                        ddq.R();
                    }
                }
            } finally {
            }
        }
        if (!this.R.isEmpty()) {
            Trace.beginSection("Compose:onRemembered");
            try {
                ArrayList arrayList = this.R;
                int size2 = arrayList.size();
                for (int i = 0; i < size2; i++) {
                    ddq ddq2 = (ddq) arrayList.get(i);
                    this.f4022R.remove(ddq2);
                    ddq2.v();
                }
            } finally {
            }
        }
    }
}
