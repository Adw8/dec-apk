package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: b1t  reason: default package */
/* loaded from: classes.dex */
public final class b1t {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1511R;
    public Object c;
    public Object e;
    public Object v;

    public b1t() {
        this.R = new Object();
        this.v = new aAx();
    }

    public static boolean R(Editable editable, KeyEvent keyEvent, boolean z) {
        cLN[] clnArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (clnArr = (cLN[]) editable.getSpans(selectionStart, selectionEnd, cLN.class)) != null && clnArr.length > 0) {
            for (cLN cln : clnArr) {
                int spanStart = editable.getSpanStart(cln);
                int spanEnd = editable.getSpanEnd(cln);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final void L() {
        if (!this.f1511R) {
            ((pve) this.c).R.clear();
            h5 h5Var = (h5) this.v;
            ((orf) h5Var.v).c();
            ((orf) h5Var.v).R.L();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0042 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int O(defpackage.pcs r12, defpackage.oaS r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1t.O(pcs, oaS, boolean):int");
    }

    public final boolean X() {
        boolean z;
        synchronized (this.R) {
            try {
                z = false;
                if (this.f1511R && ((Exception) this.e) == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void Z(Exception exc) {
        synchronized (this.R) {
            if (!this.f1511R) {
                this.f1511R = true;
                this.e = exc;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        ((aAx) this.v).c(this);
    }

    public final Object c() {
        Object obj;
        synchronized (this.R) {
            if (this.f1511R) {
                Exception exc = (Exception) this.e;
                if (exc == null) {
                    obj = this.c;
                } else {
                    throw new oZ(exc);
                }
            } else {
                throw new IllegalStateException("Task is not yet complete");
            }
        }
        return obj;
    }

    public final boolean e(CharSequence charSequence, int i, int i2, iYb iyb) {
        if (iyb.v == 0) {
            gUj guj = (gUj) this.c;
            a8Z e = iyb.e();
            int R = e.R(8);
            if (R != 0) {
                ((kY7) e).f5345R.getShort(R + ((kY7) e).R);
            }
            h3S h3s = (h3S) guj;
            h3s.getClass();
            ThreadLocal threadLocal = h3S.R;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = h3s.f4030R;
            String sb2 = sb.toString();
            int i3 = nBE.R;
            iyb.v = eFV.R(textPaint, sb2) ? 2 : 1;
        }
        return iyb.v == 2;
    }

    public final void m() {
        synchronized (this.R) {
            if (this.f1511R) {
                ((aAx) this.v).c(this);
            }
        }
    }

    public final List v(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.R).get(new owK(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public b1t(fue fue) {
        this.R = fue;
        this.v = new h5(fue.f3600R.f4974R);
        this.c = new pve(0);
        this.e = new pfJ();
    }

    public /* synthetic */ b1t(piu piu, hw1 hw1, h3S h3s) {
        this.R = hw1;
        this.v = piu;
        this.c = h3s;
        this.f1511R = false;
        this.e = null;
    }

    public /* synthetic */ b1t(ConcurrentMap concurrentMap, npR npr, imB imb, Class cls) {
        this.R = concurrentMap;
        this.v = npr;
        this.c = cls;
        this.e = imb;
        this.f1511R = false;
    }

    public /* synthetic */ b1t(h0T h0t, boolean z) {
        this.f1511R = z;
        this.R = h0t;
        this.v = o02.R(0.0f);
        this.c = new ArrayList();
    }
}
