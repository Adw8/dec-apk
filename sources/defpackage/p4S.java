package defpackage;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: p4S  reason: default package */
/* loaded from: classes.dex */
public final class p4S implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView R;

    public p4S(SearchView searchView) {
        this.R = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.R;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f1101R;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
