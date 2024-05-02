package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: ck  reason: default package */
/* loaded from: classes.dex */
public final class ck implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object v;

    public /* synthetic */ ck(Object obj, int i, Object obj2) {
        this.e = i;
        this.v = obj;
        this.R = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.e) {
            case 0:
                ((B_) this.v).c.onClick(((Fj) this.R).f119R, i);
                if (!((B_) this.v).f35v) {
                    ((Fj) this.R).f119R.dismiss();
                    return;
                }
                return;
            default:
                ((j3) this.v).R.setSelection(i);
                if (((j3) this.v).R.getOnItemClickListener() != null) {
                    j3 j3Var = (j3) this.v;
                    j3Var.R.performItemClick(view, i, j3Var.v.getItemId(i));
                }
                ((j3) this.v).dismiss();
                return;
        }
    }
}
