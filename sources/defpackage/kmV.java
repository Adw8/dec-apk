package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: kmV  reason: default package */
/* loaded from: classes.dex */
public final class kmV implements AdapterView.OnItemClickListener {
    public final /* synthetic */ View R;
    public final /* synthetic */ int e;

    public /* synthetic */ kmV(View view, int i) {
        this.e = i;
        this.R = view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        switch (this.e) {
            case 0:
                ((SearchView) this.R).C(i);
                return;
            default:
                h6c h6c = (h6c) this.R;
                if (i < 0) {
                    olv olv = h6c.f4061R;
                    obj = !olv.v() ? null : olv.f6917R.getSelectedItem();
                } else {
                    obj = h6c.getAdapter().getItem(i);
                }
                h6c.R((h6c) this.R, obj);
                AdapterView.OnItemClickListener onItemClickListener = ((h6c) this.R).getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        olv olv2 = ((h6c) this.R).f4061R;
                        view = !olv2.v() ? null : olv2.f6917R.getSelectedView();
                        olv olv3 = ((h6c) this.R).f4061R;
                        i = !olv3.v() ? -1 : olv3.f6917R.getSelectedItemPosition();
                        olv olv4 = ((h6c) this.R).f4061R;
                        j = !olv4.v() ? Long.MIN_VALUE : olv4.f6917R.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(((h6c) this.R).f4061R.f6917R, view, i, j);
                }
                ((h6c) this.R).f4061R.dismiss();
                return;
        }
    }
}
