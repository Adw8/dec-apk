package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: jMp  reason: default package */
/* loaded from: classes.dex */
public final class jMp extends BaseAdapter {
    public final LayoutInflater R;

    /* renamed from: R  reason: collision with other field name */
    public lRG f4913R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4914R;
    public final int X;
    public int e = -1;
    public final boolean v;

    public jMp(lRG lrg, LayoutInflater layoutInflater, boolean z, int i) {
        this.v = z;
        this.R = layoutInflater;
        this.f4913R = lrg;
        this.X = i;
        R();
    }

    public final void R() {
        lRG lrg = this.f4913R;
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
        ArrayList arrayList;
        if (this.v) {
            lRG lrg = this.f4913R;
            lrg.m();
            arrayList = lrg.e;
        } else {
            arrayList = this.f4913R.U();
        }
        return this.e < 0 ? arrayList.size() : arrayList.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return (long) i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.R.inflate(this.X, viewGroup, false);
        }
        int i2 = getItem(i).f7123v;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f7123v : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f4913R.C() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        jd5 jd5 = (jd5) view;
        if (this.f4914R) {
            listMenuItemView.setForceShowIcon(true);
        }
        jd5.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        R();
        super.notifyDataSetChanged();
    }

    /* renamed from: v */
    public final pce getItem(int i) {
        ArrayList arrayList;
        if (this.v) {
            lRG lrg = this.f4913R;
            lrg.m();
            arrayList = lrg.e;
        } else {
            arrayList = this.f4913R.U();
        }
        int i2 = this.e;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (pce) arrayList.get(i);
    }
}
