package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends lYU implements _z {
    public static final /* synthetic */ int g = 0;
    public final int C;
    public boolean L;
    public final int N;
    public boolean O;
    public int P;
    public SearchableInfo R;

    /* renamed from: R  reason: collision with other field name */
    public final Intent f1097R;

    /* renamed from: R  reason: collision with other field name */
    public Rect f1098R;

    /* renamed from: R  reason: collision with other field name */
    public Bundle f1099R;

    /* renamed from: R  reason: collision with other field name */
    public View.OnClickListener f1100R;

    /* renamed from: R  reason: collision with other field name */
    public View.OnFocusChangeListener f1101R;

    /* renamed from: R  reason: collision with other field name */
    public final View f1102R;

    /* renamed from: R  reason: collision with other field name */
    public final ImageView f1103R;

    /* renamed from: R  reason: collision with other field name */
    public final SearchAutoComplete f1104R;

    /* renamed from: R  reason: collision with other field name */
    public c f1105R;

    /* renamed from: R  reason: collision with other field name */
    public eQg f1106R;

    /* renamed from: R  reason: collision with other field name */
    public fIj f1107R;

    /* renamed from: R  reason: collision with other field name */
    public jG2 f1108R;

    /* renamed from: R  reason: collision with other field name */
    public final CharSequence f1109R;

    /* renamed from: R  reason: collision with other field name */
    public String f1110R;

    /* renamed from: R  reason: collision with other field name */
    public final WeakHashMap f1111R;

    /* renamed from: R  reason: collision with other field name */
    public final ljY f1112R;
    public final ImageView X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f1113X;
    public boolean Z;
    public final View c;

    /* renamed from: c  reason: collision with other field name */
    public final ImageView f1114c;

    /* renamed from: c  reason: collision with other field name */
    public CharSequence f1115c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1116c;

    /* renamed from: c  reason: collision with other field name */
    public int[] f1117c;
    public final View e;

    /* renamed from: e  reason: collision with other field name */
    public final ImageView f1118e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f1119e;

    /* renamed from: e  reason: collision with other field name */
    public int[] f1120e;
    public int j;
    public boolean m;
    public final Intent v;

    /* renamed from: v  reason: collision with other field name */
    public Rect f1121v;

    /* renamed from: v  reason: collision with other field name */
    public final Drawable f1122v;

    /* renamed from: v  reason: collision with other field name */
    public final View f1123v;

    /* renamed from: v  reason: collision with other field name */
    public final ImageView f1124v;

    /* renamed from: v  reason: collision with other field name */
    public CharSequence f1125v;

    /* renamed from: v  reason: collision with other field name */
    public ljY f1126v;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends yp {
        public SearchView R;

        /* renamed from: R  reason: collision with other field name */
        public boolean f1128R;

        /* renamed from: R  reason: collision with other field name */
        public final e f1127R = new e(this);
        public int e = getThreshold();

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        @Override // defpackage.yp, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1128R) {
                removeCallbacks(this.f1127R);
                post(this.f1127R);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.R;
            searchView.o(searchView.f1119e);
            searchView.post(searchView.f1112R);
            if (searchView.f1104R.hasFocus()) {
                Y.R(searchView.f1104R);
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.R.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.R.hasFocus() && getVisibility() == 0) {
                this.f1128R = true;
                Context context = getContext();
                int i = SearchView.g;
                if (context.getResources().getConfiguration().orientation == 2) {
                    Y.v(this, 1);
                    if (enoughToFilter()) {
                        showDropDown();
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1128R = false;
                removeCallbacks(this.f1127R);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1128R = false;
                removeCallbacks(this.f1127R);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1128R = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.R = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1104R.setText(charSequence);
        this.f1104R.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final boolean C(int i) {
        int i2;
        String Z;
        Cursor cursor = this.f1106R.R;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                int i3 = lmc.P;
                String Z2 = lmc.Z(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (Z2 == null) {
                    Z2 = this.R.getSuggestIntentAction();
                }
                if (Z2 == null) {
                    Z2 = "android.intent.action.SEARCH";
                }
                String Z3 = lmc.Z(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (Z3 == null) {
                    Z3 = this.R.getSuggestIntentData();
                }
                if (!(Z3 == null || (Z = lmc.Z(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    Z3 = Z3 + "/" + Uri.encode(Z);
                }
                intent = x(Z2, Z3 == null ? null : Uri.parse(Z3), lmc.Z(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), lmc.Z(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    i2 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i2 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e2);
                }
            }
        }
        this.f1104R.setImeVisibility(false);
        this.f1104R.dismissDropDown();
        return true;
    }

    public final Intent H(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1099R;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void N(int i) {
        Editable text = this.f1104R.getText();
        Cursor cursor = this.f1106R.R;
        if (cursor != null) {
            if (cursor.moveToPosition(i)) {
                String c = this.f1106R.c(cursor);
                if (c != null) {
                    setQuery(c);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    public final void P(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void U() {
        if (!TextUtils.isEmpty(this.f1104R.getText())) {
            this.f1104R.setText("");
            this.f1104R.requestFocus();
            this.f1104R.setImeVisibility(true);
        } else if (this.f1116c) {
            clearFocus();
            o(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r2.Z == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f1113X
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.Z
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.f1119e
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.Z
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r2 = r2.f1124v
            r2.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.V(boolean):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.L = true;
        super.clearFocus();
        this.f1104R.clearFocus();
        this.f1104R.setImeVisibility(false);
        this.L = false;
    }

    public final void g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1104R.getText());
        int i = 0;
        if (!z2 && (!this.f1116c || this.m)) {
            z = false;
        }
        ImageView imageView = this.f1114c;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1114c.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public int getImeOptions() {
        return this.f1104R.getImeOptions();
    }

    public int getInputType() {
        return this.f1104R.getInputType();
    }

    public int getMaxWidth() {
        return this.P;
    }

    public CharSequence getQuery() {
        return this.f1104R.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1125v;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.R;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1109R : getContext().getText(this.R.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.N;
    }

    public int getSuggestionRowLayout() {
        return this.C;
    }

    public eQg getSuggestionsAdapter() {
        return this.f1106R;
    }

    public final void i() {
        int i = 0;
        if (!((this.f1113X || this.Z) && !this.f1119e) || !(this.f1124v.getVisibility() == 0 || this.f1118e.getVisibility() == 0)) {
            i = 8;
        }
        this.c.setVisibility(i);
    }

    public final void j() {
        Editable text = this.f1104R.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.R != null) {
                getContext().startActivity(x("android.intent.action.SEARCH", null, null, text.toString()));
            }
            this.f1104R.setImeVisibility(false);
            this.f1104R.dismissDropDown();
        }
    }

    public final void o(boolean z) {
        this.f1119e = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1104R.getText());
        this.f1103R.setVisibility(i2);
        V(z2);
        this.f1102R.setVisibility(z ? 8 : 0);
        this.X.setVisibility((this.X.getDrawable() == null || this.f1116c) ? 8 : 0);
        g();
        boolean z3 = !z2;
        if (this.Z && !this.f1119e && z3) {
            this.f1124v.setVisibility(8);
            i = 0;
        }
        this.f1118e.setVisibility(i);
        i();
    }

    @Override // defpackage._z
    public final void onActionViewCollapsed() {
        this.f1104R.setText("");
        SearchAutoComplete searchAutoComplete = this.f1104R;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f1115c = "";
        clearFocus();
        o(true);
        this.f1104R.setImeOptions(this.j);
        this.m = false;
    }

    @Override // defpackage._z
    public final void onActionViewExpanded() {
        if (!this.m) {
            this.m = true;
            int imeOptions = this.f1104R.getImeOptions();
            this.j = imeOptions;
            this.f1104R.setImeOptions(imeOptions | 33554432);
            this.f1104R.setText("");
            setIconified(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1112R);
        post(this.f1126v);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.lYU, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f1104R;
            Rect rect = this.f1098R;
            searchAutoComplete.getLocationInWindow(this.f1117c);
            getLocationInWindow(this.f1120e);
            int[] iArr = this.f1117c;
            int i5 = iArr[1];
            int[] iArr2 = this.f1120e;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.f1121v;
            Rect rect3 = this.f1098R;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            fIj fij = this.f1107R;
            if (fij == null) {
                fIj fij2 = new fIj(this.f1121v, this.f1098R, this.f1104R);
                this.f1107R = fij2;
                setTouchDelegate(fij2);
                return;
            }
            Rect rect4 = this.f1121v;
            Rect rect5 = this.f1098R;
            fij.f3375R.set(rect4);
            fij.c.set(rect4);
            Rect rect6 = fij.c;
            int i8 = -fij.R;
            rect6.inset(i8, i8);
            fij.v.set(rect5);
        }
    }

    @Override // defpackage.lYU, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f1119e) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.P;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.P;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.P) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof iB2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        iB2 ib2 = (iB2) parcelable;
        super.onRestoreInstanceState(((OG) ib2).f327R);
        o(ib2.R);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        iB2 ib2 = new iB2(super.onSaveInstanceState());
        ib2.R = this.f1119e;
        return ib2;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f1112R);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.L || !isFocusable()) {
            return false;
        }
        if (this.f1119e) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1104R.requestFocus(i, rect);
        if (requestFocus) {
            o(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1099R = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            U();
            return;
        }
        o(false);
        this.f1104R.requestFocus();
        this.f1104R.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1100R;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1116c != z) {
            this.f1116c = z;
            o(z);
            t();
        }
    }

    public void setImeOptions(int i) {
        this.f1104R.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1104R.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.P = i;
        requestLayout();
    }

    public void setOnCloseListener(j1O j1o) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1101R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(epX epx) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1100R = onClickListener;
    }

    public void setOnSuggestionListener(oi2 oi2) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1125v = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.O = z;
        eQg eqg = this.f1106R;
        if (eqg instanceof lmc) {
            ((lmc) eqg).Z = z ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.R = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1104R
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1104R
            android.app.SearchableInfo r3 = r6.R
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.R
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.R
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1104R
            r3.setInputType(r7)
            eQg r7 = r6.f1106R
            if (r7 == 0) goto L_0x0042
            r7.v(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.R
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            lmc r7 = new lmc
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.R
            java.util.WeakHashMap r5 = r6.f1111R
            r7.<init>(r3, r6, r4, r5)
            r6.f1106R = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1104R
            r3.setAdapter(r7)
            eQg r7 = r6.f1106R
            lmc r7 = (defpackage.lmc) r7
            boolean r3 = r6.O
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = r0
        L_0x0069:
            r7.Z = r3
        L_0x006b:
            r6.t()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.R
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.R
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.f1097R
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.R
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.v
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = r3
        L_0x00a0:
            r6.Z = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1104R
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.f1119e
            r6.o(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1113X = z;
        o(this.f1119e);
    }

    public void setSuggestionsAdapter(eQg eqg) {
        this.f1106R = eqg;
        this.f1104R.setAdapter(eqg);
    }

    public final void t() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1104R;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.f1116c && this.f1122v != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.f1122v.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f1122v), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final Intent x(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1115c);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1099R;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.R.getSearchActivity());
        return intent;
    }

    public final void y() {
        int[] iArr = this.f1104R.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1123v.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.c.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1098R = new Rect();
        this.f1121v = new Rect();
        this.f1117c = new int[2];
        this.f1120e = new int[2];
        this.f1112R = new ljY(this, 0);
        this.f1126v = new ljY(this, 1);
        this.f1111R = new WeakHashMap();
        d dVar = new d(this);
        this.f1105R = new c(this);
        iRx irx = new iRx(this);
        kmV kmv = new kmV(this, 0);
        hJU hju = new hJU(1, this);
        this.f1108R = new jG2(this, 0);
        int[] iArr = iTI.V;
        CV h = CV.h(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = (TypedArray) h.v;
        WeakHashMap weakHashMap = of5.f6887R;
        hpL.c(this, context, iArr, attributeSet, typedArray, i, 0);
        LayoutInflater.from(context).inflate(h.y(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1104R = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1102R = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f1123v = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.c = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f1103R = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1124v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f1114c = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1118e = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.X = imageView5;
        mHC.g(findViewById, h.U(10));
        mHC.g(findViewById2, h.U(14));
        imageView.setImageDrawable(h.U(13));
        imageView2.setImageDrawable(h.U(7));
        imageView3.setImageDrawable(h.U(4));
        imageView4.setImageDrawable(h.U(16));
        imageView5.setImageDrawable(h.U(13));
        this.f1122v = h.U(12);
        cFY.R(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.C = h.y(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.N = h.y(5, 0);
        imageView.setOnClickListener(dVar);
        imageView3.setOnClickListener(dVar);
        imageView2.setOnClickListener(dVar);
        imageView4.setOnClickListener(dVar);
        searchAutoComplete.setOnClickListener(dVar);
        searchAutoComplete.addTextChangedListener(this.f1108R);
        searchAutoComplete.setOnEditorActionListener(irx);
        searchAutoComplete.setOnItemClickListener(kmv);
        searchAutoComplete.setOnItemSelectedListener(hju);
        searchAutoComplete.setOnKeyListener(this.f1105R);
        searchAutoComplete.setOnFocusChangeListener(new p4S(this));
        setIconifiedByDefault(h.Z(8, true));
        int H = h.H(1, -1);
        if (H != -1) {
            setMaxWidth(H);
        }
        this.f1109R = h.V(6);
        this.f1125v = h.V(11);
        int P = h.P(3, -1);
        if (P != -1) {
            setImeOptions(P);
        }
        int P2 = h.P(2, -1);
        if (P2 != -1) {
            setInputType(P2);
        }
        setFocusable(h.Z(0, true));
        h.z();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1097R = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.v = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.e = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new pgs(0, this));
        }
        o(this.f1116c);
        t();
    }
}
