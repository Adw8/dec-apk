package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: h9X  reason: default package */
/* loaded from: classes.dex */
public abstract class h9X {
    public static final List v = Collections.emptyList();

    /* renamed from: R  reason: collision with other field name */
    public final View f4097R;

    /* renamed from: R  reason: collision with other field name */
    public RecyclerView f4098R;

    /* renamed from: R  reason: collision with other field name */
    public gEY f4100R;

    /* renamed from: R  reason: collision with other field name */
    public WeakReference f4102R;
    public int X;
    public int R = -1;

    /* renamed from: v  reason: collision with other field name */
    public int f4106v = -1;

    /* renamed from: R  reason: collision with other field name */
    public long f4096R = -1;
    public int c = -1;
    public int e = -1;

    /* renamed from: R  reason: collision with other field name */
    public h9X f4101R = null;

    /* renamed from: v  reason: collision with other field name */
    public h9X f4107v = null;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f4103R = null;

    /* renamed from: R  reason: collision with other field name */
    public List f4104R = null;
    public int O = 0;

    /* renamed from: R  reason: collision with other field name */
    public fgh f4099R = null;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4105R = false;
    public int L = 0;
    public int Z = -1;

    public h9X(View view) {
        if (view != null) {
            this.f4097R = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void C() {
        this.X = 0;
        this.R = -1;
        this.f4106v = -1;
        this.f4096R = -1;
        this.e = -1;
        this.O = 0;
        this.f4101R = null;
        this.f4107v = null;
        ArrayList arrayList = this.f4103R;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.X &= -1025;
        this.L = 0;
        this.Z = -1;
        RecyclerView.x(this);
    }

    public final boolean H() {
        return (this.X & 256) != 0;
    }

    public final boolean L() {
        return (this.X & 4) != 0;
    }

    public final void N(boolean z) {
        int i = this.O;
        int i2 = z ? i - 1 : i + 1;
        this.O = i2;
        if (i2 < 0) {
            this.O = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i2 == 1) {
            this.X |= 16;
        } else if (z && i2 == 0) {
            this.X &= -17;
        }
    }

    public final boolean O() {
        return (this.X & 1) != 0;
    }

    public final boolean P() {
        return (this.X & 128) != 0;
    }

    public final void R(Object obj) {
        if (obj == null) {
            v(1024);
        } else if ((1024 & this.X) == 0) {
            if (this.f4103R == null) {
                ArrayList arrayList = new ArrayList();
                this.f4103R = arrayList;
                this.f4104R = Collections.unmodifiableList(arrayList);
            }
            this.f4103R.add(obj);
        }
    }

    public final void U(int i, boolean z) {
        if (this.f4106v == -1) {
            this.f4106v = this.R;
        }
        if (this.e == -1) {
            this.e = this.R;
        }
        if (z) {
            this.e += i;
        }
        this.R += i;
        if (this.f4097R.getLayoutParams() != null) {
            ((l88) this.f4097R.getLayoutParams()).f5602R = true;
        }
    }

    public final boolean X() {
        return (this.f4097R.getParent() == null || this.f4097R.getParent() == this.f4098R) ? false : true;
    }

    public final boolean Z() {
        if ((this.X & 16) == 0) {
            View view = this.f4097R;
            WeakHashMap weakHashMap = of5.f6887R;
            if (!mHC.m(view)) {
                return true;
            }
        }
        return false;
    }

    public final int c() {
        int i = this.e;
        return i == -1 ? this.R : i;
    }

    public final List e() {
        if ((this.X & 1024) != 0) {
            return v;
        }
        ArrayList arrayList = this.f4103R;
        return (arrayList == null || arrayList.size() == 0) ? v : this.f4104R;
    }

    public final boolean j() {
        return (this.X & 32) != 0;
    }

    public final boolean m() {
        return (this.X & 8) != 0;
    }

    public final String toString() {
        StringBuilder t = jQ.t(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        t.append(Integer.toHexString(hashCode()));
        t.append(" position=");
        t.append(this.R);
        t.append(" id=");
        t.append(this.f4096R);
        t.append(", oldPos=");
        t.append(this.f4106v);
        t.append(", pLpos:");
        t.append(this.e);
        StringBuilder sb = new StringBuilder(t.toString());
        if (x()) {
            sb.append(" scrap ");
            sb.append(this.f4105R ? "[changeScrap]" : "[attachedScrap]");
        }
        if (L()) {
            sb.append(" invalid");
        }
        if (!O()) {
            sb.append(" unbound");
        }
        boolean z = true;
        if ((this.X & 2) != 0) {
            sb.append(" update");
        }
        if (m()) {
            sb.append(" removed");
        }
        if (P()) {
            sb.append(" ignored");
        }
        if (H()) {
            sb.append(" tmpDetached");
        }
        if (!Z()) {
            StringBuilder U = opT.U(" not recyclable(");
            U.append(this.O);
            U.append(")");
            sb.append(U.toString());
        }
        if ((this.X & 512) == 0 && !L()) {
            z = false;
        }
        if (z) {
            sb.append(" undefined adapter position");
        }
        if (this.f4097R.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void v(int i) {
        this.X = i | this.X;
    }

    public final boolean x() {
        return this.f4099R != null;
    }
}
