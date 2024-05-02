package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* renamed from: hwc  reason: default package */
/* loaded from: classes.dex */
public final class hwc implements lF5, AdapterView.OnItemClickListener {
    public Context R;

    /* renamed from: R  reason: collision with other field name */
    public LayoutInflater f4424R;

    /* renamed from: R  reason: collision with other field name */
    public ExpandedMenuView f4425R;

    /* renamed from: R  reason: collision with other field name */
    public lRG f4426R;

    /* renamed from: R  reason: collision with other field name */
    public lnm f4427R;

    /* renamed from: R  reason: collision with other field name */
    public ovy f4428R;

    public hwc(Context context) {
        this.R = context;
        this.f4424R = LayoutInflater.from(context);
    }

    @Override // defpackage.lF5
    public final boolean H(go1 go1) {
        if (!go1.hasVisibleItems()) {
            return false;
        }
        ahV ahv = new ahV(go1);
        s6 s6Var = new s6(((lRG) go1).f5727R);
        hwc hwc = new hwc(s6Var.f7406R.f23R);
        ahv.f977R = hwc;
        hwc.f4428R = ahv;
        lRG lrg = ahv.f978R;
        lrg.v(hwc, lrg.f5727R);
        hwc hwc2 = ahv.f977R;
        if (hwc2.f4427R == null) {
            hwc2.f4427R = new lnm(hwc2);
        }
        lnm lnm = hwc2.f4427R;
        B_ b_ = s6Var.f7406R;
        b_.f29R = lnm;
        b_.c = ahv;
        View view = ((lRG) go1).f5730R;
        if (view != null) {
            b_.f28R = view;
        } else {
            b_.f26R = ((lRG) go1).f5729R;
            b_.f30R = ((lRG) go1).f5732R;
        }
        b_.f25R = ahv;
        Db R = s6Var.R();
        ahv.R = R;
        R.setOnDismissListener(ahv);
        WindowManager.LayoutParams attributes = ahv.R.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        ahv.R.show();
        ovy ovy = this.f4428R;
        if (ovy == null) {
            return true;
        }
        ovy.e(go1);
        return true;
    }

    @Override // defpackage.lF5
    public final void L(ovy ovy) {
        this.f4428R = ovy;
    }

    @Override // defpackage.lF5
    public final void O(Context context, lRG lrg) {
        if (this.R != null) {
            this.R = context;
            if (this.f4424R == null) {
                this.f4424R = LayoutInflater.from(context);
            }
        }
        this.f4426R = lrg;
        lnm lnm = this.f4427R;
        if (lnm != null) {
            lnm.notifyDataSetChanged();
        }
    }

    @Override // defpackage.lF5
    public final void R(lRG lrg, boolean z) {
        ovy ovy = this.f4428R;
        if (ovy != null) {
            ovy.R(lrg, z);
        }
    }

    @Override // defpackage.lF5
    public final boolean X(pce pce) {
        return false;
    }

    @Override // defpackage.lF5
    public final boolean c() {
        return false;
    }

    @Override // defpackage.lF5
    public final void m() {
        lnm lnm = this.f4427R;
        if (lnm != null) {
            lnm.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f4426R.g(this.f4427R.getItem(i), this, 0);
    }

    @Override // defpackage.lF5
    public final boolean x(pce pce) {
        return false;
    }
}
