package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: iRx  reason: default package */
/* loaded from: classes.dex */
public final class iRx implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView R;

    public iRx(SearchView searchView) {
        this.R = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.R.j();
        return true;
    }
}
