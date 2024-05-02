package defpackage;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import dev.kdrag0n.virtcontainer.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: lmc  reason: default package */
/* loaded from: classes.dex */
public final class lmc extends eQg implements View.OnClickListener {
    public static final /* synthetic */ int P = 0;
    public final int L;
    public int O;
    public final SearchableInfo R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f5829R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f5830R;

    /* renamed from: R  reason: collision with other field name */
    public LayoutInflater f5831R;

    /* renamed from: R  reason: collision with other field name */
    public final SearchView f5832R;

    /* renamed from: R  reason: collision with other field name */
    public final WeakHashMap f5833R;
    public int X;
    public int Z = 1;
    public int m = -1;
    public int x = -1;
    public int H = -1;
    public int U = -1;
    public int C = -1;
    public int N = -1;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lmc(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context);
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.O = suggestionRowLayout;
        this.X = suggestionRowLayout;
        this.f5831R = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f5832R = searchView;
        this.R = searchableInfo;
        this.L = searchView.getSuggestionCommitIconResId();
        this.f5829R = context;
        this.f5833R = weakHashMap;
    }

    public static String Z(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    public final Cursor L(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f5829R.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable O(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmc.O(java.lang.String):android.graphics.drawable.Drawable");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v9, resolved type: android.text.SpannableString */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0146  */
    @Override // defpackage.eQg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(android.view.View r18, android.database.Cursor r19) {
        /*
        // Method dump skipped, instructions count: 448
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmc.R(android.view.View, android.database.Cursor):void");
    }

    public final Drawable X(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f5829R.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    @Override // defpackage.eQg
    public final String c(Cursor cursor) {
        String Z;
        String Z2;
        if (cursor == null) {
            return null;
        }
        String Z3 = Z(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (Z3 != null) {
            return Z3;
        }
        if (this.R.shouldRewriteQueryFromData() && (Z2 = Z(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return Z2;
        }
        if (!this.R.shouldRewriteQueryFromText() || (Z = Z(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return Z;
    }

    @Override // defpackage.eQg
    public final View e(ViewGroup viewGroup) {
        View inflate = this.f5831R.inflate(this.X, viewGroup, false);
        inflate.setTag(new cff(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.L);
        return inflate;
    }

    @Override // defpackage.eQg, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.f5831R.inflate(this.O, viewGroup, false);
            if (inflate != null) {
                ((cff) inflate.getTag()).f2172R.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // defpackage.eQg, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View e2 = this.e(viewGroup);
            ((cff) e2.getTag()).f2172R.setText(e.toString());
            return e2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = ((eQg) this).R;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = ((eQg) this).R;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f5832R.P((CharSequence) tag);
        }
    }

    @Override // defpackage.eQg
    public final void v(Cursor cursor) {
        try {
            super.v(cursor);
            if (cursor != null) {
                this.m = cursor.getColumnIndex("suggest_text_1");
                this.x = cursor.getColumnIndex("suggest_text_2");
                this.H = cursor.getColumnIndex("suggest_text_2_url");
                this.U = cursor.getColumnIndex("suggest_icon_1");
                this.C = cursor.getColumnIndex("suggest_icon_2");
                this.N = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }
}
