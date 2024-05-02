package defpackage;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: nYV  reason: default package */
/* loaded from: classes.dex */
public final class nYV extends Filter {
    public hrs R;

    public nYV(hrs hrs) {
        this.R = hrs;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((lmc) this.R).c((Cursor) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    @Override // android.widget.Filter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r3) {
        /*
            r2 = this;
            hrs r2 = r2.R
            lmc r2 = (defpackage.lmc) r2
            if (r3 != 0) goto L_0x0009
            java.lang.String r3 = ""
            goto L_0x0010
        L_0x0009:
            r2.getClass()
            java.lang.String r3 = r3.toString()
        L_0x0010:
            androidx.appcompat.widget.SearchView r0 = r2.f5832R
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L_0x0036
            androidx.appcompat.widget.SearchView r0 = r2.f5832R
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L_0x0022
            goto L_0x0036
        L_0x0022:
            android.app.SearchableInfo r0 = r2.R     // Catch: RuntimeException -> 0x002e
            android.database.Cursor r2 = r2.L(r0, r3)     // Catch: RuntimeException -> 0x002e
            if (r2 == 0) goto L_0x0036
            r2.getCount()     // Catch: RuntimeException -> 0x002e
            goto L_0x0037
        L_0x002e:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions query threw an exception."
            android.util.Log.w(r3, r0, r2)
        L_0x0036:
            r2 = r1
        L_0x0037:
            android.widget.Filter$FilterResults r3 = new android.widget.Filter$FilterResults
            r3.<init>()
            if (r2 == 0) goto L_0x0047
            int r0 = r2.getCount()
            r3.count = r0
            r3.values = r2
            goto L_0x004c
        L_0x0047:
            r2 = 0
            r3.count = r2
            r3.values = r1
        L_0x004c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nYV.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        hrs hrs = this.R;
        Cursor cursor = ((eQg) hrs).R;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((lmc) hrs).v((Cursor) obj);
        }
    }
}
