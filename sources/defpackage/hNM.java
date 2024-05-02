package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: hNM  reason: default package */
/* loaded from: classes.dex */
public final class hNM extends WindowInsetsAnimation.Callback {
    public ArrayList R;

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f4223R = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public final n6E f4224R;

    public hNM(n6E n6e) {
        super(n6e.e);
        this.f4224R = n6e;
    }

    public final oyr R(WindowInsetsAnimation windowInsetsAnimation) {
        oyr oyr = (oyr) this.f4223R.get(windowInsetsAnimation);
        if (oyr != null) {
            return oyr;
        }
        oyr oyr2 = new oyr(0, null, 0);
        oyr2.R = new mbq(windowInsetsAnimation);
        this.f4223R.put(windowInsetsAnimation, oyr2);
        return oyr2;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f4224R.R(R(windowInsetsAnimation));
        this.f4223R.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        n6E n6e = this.f4224R;
        R(windowInsetsAnimation);
        n6e.f6306R = true;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.R;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.R = arrayList2;
            Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            oyr R = R(windowInsetsAnimation);
            R.R.z(windowInsetsAnimation.getFraction());
            this.R.add(R);
        }
        n6E n6e = this.f4224R;
        gWM Z = gWM.Z(null, windowInsets);
        n6e.f6305R.R(Z, 0);
        if (n6e.f6305R.f5239R) {
            Z = gWM.R;
        }
        return Z.L();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        n6E n6e = this.f4224R;
        R(windowInsetsAnimation);
        h5 h5Var = new h5(bounds);
        n6e.f6306R = false;
        return new WindowInsetsAnimation.Bounds(((ojk) h5Var.R).e(), ((ojk) h5Var.v).e());
    }
}
