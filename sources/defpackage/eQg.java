package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: eQg  reason: default package */
/* loaded from: classes.dex */
public abstract class eQg extends BaseAdapter implements Filterable, hrs {

    /* renamed from: R  reason: collision with other field name */
    public nYV f3083R;
    public boolean v = true;
    public Cursor R = null;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3084R = false;
    public int e = -1;

    /* renamed from: R  reason: collision with other field name */
    public fJ4 f3081R = new fJ4(this);

    /* renamed from: R  reason: collision with other field name */
    public lHB f3082R = new lHB(1, this);

    public eQg(Context context) {
    }

    public abstract void R(View view, Cursor cursor);

    public abstract String c(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f3084R || (cursor = this.R) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f3084R) {
            return null;
        }
        this.R.moveToPosition(i);
        if (view == null) {
            lmc lmc = (lmc) this;
            view = lmc.f5831R.inflate(lmc.O, viewGroup, false);
        }
        R(view, this.R);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f3083R == null) {
            this.f3083R = new nYV(this);
        }
        return this.f3083R;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f3084R || (cursor = this.R) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.R;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.f3084R || (cursor = this.R) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.R.getLong(this.e);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f3084R) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.R.moveToPosition(i)) {
            if (view == null) {
                view = e(viewGroup);
            }
            R(view, this.R);
            return view;
        } else {
            throw new IllegalStateException(opT.Z("couldn't move cursor to position ", i));
        }
    }

    public void v(Cursor cursor) {
        Cursor cursor2 = this.R;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                fJ4 fj4 = this.f3081R;
                if (fj4 != null) {
                    cursor2.unregisterContentObserver(fj4);
                }
                lHB lhb = this.f3082R;
                if (lhb != null) {
                    cursor2.unregisterDataSetObserver(lhb);
                }
            }
            this.R = cursor;
            if (cursor != null) {
                fJ4 fj42 = this.f3081R;
                if (fj42 != null) {
                    cursor.registerContentObserver(fj42);
                }
                lHB lhb2 = this.f3082R;
                if (lhb2 != null) {
                    cursor.registerDataSetObserver(lhb2);
                }
                this.e = cursor.getColumnIndexOrThrow("_id");
                this.f3084R = true;
                notifyDataSetChanged();
            } else {
                this.e = -1;
                this.f3084R = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }
}
