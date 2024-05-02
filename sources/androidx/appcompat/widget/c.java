package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class c implements View.OnKeyListener {
    public final /* synthetic */ SearchView R;

    public c(SearchView searchView) {
        this.R = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.R;
        if (searchView.R == null) {
            return false;
        }
        if (!searchView.f1104R.isPopupShowing() || this.R.f1104R.getListSelection() == -1) {
            if ((TextUtils.getTrimmedLength(this.R.f1104R.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = this.R;
            searchView2.getContext().startActivity(searchView2.x("android.intent.action.SEARCH", null, null, searchView2.f1104R.getText().toString()));
            return true;
        }
        SearchView searchView3 = this.R;
        if (searchView3.R == null || searchView3.f1106R == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i == 66 || i == 84 || i == 61) {
            return searchView3.C(searchView3.f1104R.getListSelection());
        }
        if (i == 21 || i == 22) {
            searchView3.f1104R.setSelection(i == 21 ? 0 : searchView3.f1104R.length());
            searchView3.f1104R.setListSelection(0);
            searchView3.f1104R.clearListSelection();
            SearchView.SearchAutoComplete searchAutoComplete = searchView3.f1104R;
            searchAutoComplete.getClass();
            Y.v(searchAutoComplete, 1);
            if (searchAutoComplete.enoughToFilter()) {
                searchAutoComplete.showDropDown();
            }
            return true;
        } else if (i != 19) {
            return false;
        } else {
            searchView3.f1104R.getListSelection();
            return false;
        }
    }
}
