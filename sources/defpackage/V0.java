package defpackage;

import android.content.Context;
import android.widget.ArrayAdapter;

/* renamed from: V0  reason: default package */
/* loaded from: classes.dex */
public final class V0 extends ArrayAdapter {
    public V0(Context context, int i) {
        super(context, i, 16908308, (Object[]) null);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return (long) i;
    }

    @Override // android.widget.Adapter, android.widget.BaseAdapter
    public final boolean hasStableIds() {
        return true;
    }
}
