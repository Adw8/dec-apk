package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ SearchView.SearchAutoComplete R;

    public e(SearchView.SearchAutoComplete searchAutoComplete) {
        this.R = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.R;
        if (searchAutoComplete.f1128R) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f1128R = false;
        }
    }
}
