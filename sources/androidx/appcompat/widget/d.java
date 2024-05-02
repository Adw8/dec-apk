package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class d implements View.OnClickListener {
    public final /* synthetic */ SearchView R;

    public d(SearchView searchView) {
        this.R = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.R;
        if (view == searchView.f1103R) {
            searchView.o(false);
            searchView.f1104R.requestFocus();
            searchView.f1104R.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f1100R;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
            }
        } else if (view == searchView.f1114c) {
            searchView.U();
        } else if (view == searchView.f1124v) {
            searchView.j();
        } else if (view == searchView.f1118e) {
            SearchableInfo searchableInfo = searchView.R;
            if (searchableInfo != null) {
                try {
                    if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        Intent intent = new Intent(searchView.f1097R);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                        searchView.getContext().startActivity(intent);
                    } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.H(searchView.v, searchableInfo));
                    }
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            }
        } else {
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1104R;
            if (view == searchAutoComplete) {
                Y.R(searchAutoComplete);
            }
        }
    }
}
