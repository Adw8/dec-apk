package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;

/* renamed from: lnm  reason: default package */
/* loaded from: classes.dex */
public final class lnm extends BaseAdapter {
    public final /* synthetic */ hwc R;
    public int e = -1;

    public lnm(hwc hwc) {
        this.R = hwc;
        R();
    }

    public final void R() {
        lRG lrg = this.R.f4426R;
        pce pce = lrg.f5735R;
        if (pce != null) {
            lrg.m();
            ArrayList arrayList = lrg.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((pce) arrayList.get(i)) == pce) {
                    this.e = i;
                    return;
                }
            }
        }
        this.e = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        lRG lrg = this.R.f4426R;
        lrg.m();
        int size = lrg.e.size();
        this.R.getClass();
        int i = size + 0;
        return this.e < 0 ? i : i - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return (long) i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.R.f4424R.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((jd5) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        R();
        super.notifyDataSetChanged();
    }

    /* renamed from: v */
    public final pce getItem(int i) {
        lRG lrg = this.R.f4426R;
        lrg.m();
        ArrayList arrayList = lrg.e;
        this.R.getClass();
        int i2 = i + 0;
        int i3 = this.e;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (pce) arrayList.get(i2);
    }
}
