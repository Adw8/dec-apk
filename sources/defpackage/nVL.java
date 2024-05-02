package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: nVL  reason: default package */
/* loaded from: classes.dex */
public final class nVL extends aYp {
    public hJT R;

    /* renamed from: R  reason: collision with other field name */
    public pce f6420R;
    public final int m;
    public final int x;

    public nVL(Context context, boolean z) {
        super(context, z);
        if (1 == eVJ.R(context.getResources().getConfiguration())) {
            this.m = 21;
            this.x = 22;
            return;
        }
        this.m = 22;
        this.x = 21;
    }

    @Override // defpackage.aYp, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        jMp jmp;
        int pointToPosition;
        int i2;
        if (this.R != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                jmp = (jMp) headerViewListAdapter.getWrappedAdapter();
            } else {
                i = 0;
                jmp = (jMp) adapter;
            }
            pce pce = null;
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < jmp.getCount()) {
                pce = jmp.getItem(i2);
            }
            pce pce2 = this.f6420R;
            if (pce2 != pce) {
                lRG lrg = jmp.f4913R;
                if (pce2 != null) {
                    this.R.X(lrg, pce2);
                }
                this.f6420R = pce;
                if (pce != null) {
                    this.R.g(lrg, pce);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.view.KeyEvent.Callback, android.widget.AbsListView, android.view.View
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.x) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (jMp) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (jMp) adapter).f4913R.c(false);
            return true;
        }
    }

    public void setHoverListener(hJT hjt) {
        this.R = hjt;
    }

    @Override // defpackage.aYp, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
