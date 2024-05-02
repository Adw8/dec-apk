package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: hJU  reason: default package */
/* loaded from: classes.dex */
public final class hJU implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ hJU(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        aYp ayp;
        switch (this.e) {
            case 0:
                if (i != -1 && (ayp = ((olv) this.R).f6917R) != null) {
                    ayp.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.R).N(i);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
