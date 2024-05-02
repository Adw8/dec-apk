package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: kI  reason: default package */
/* loaded from: classes.dex */
public final class kI implements G6, DialogInterface.OnClickListener {
    public Db R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ _Q f5244R;

    /* renamed from: R  reason: collision with other field name */
    public ListAdapter f5245R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f5246R;

    public kI(_Q _q) {
        this.f5244R = _q;
    }

    @Override // defpackage.G6
    public final void C(CharSequence charSequence) {
        this.f5246R = charSequence;
    }

    @Override // defpackage.G6
    public final void H(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.G6
    public final void L(ListAdapter listAdapter) {
        this.f5245R = listAdapter;
    }

    @Override // defpackage.G6
    public final int N() {
        return 0;
    }

    @Override // defpackage.G6
    public final int O() {
        return 0;
    }

    @Override // defpackage.G6
    public final void P(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.G6
    public final void U(int i, int i2) {
        if (this.f5245R != null) {
            s6 s6Var = new s6(this.f5244R.getPopupContext());
            CharSequence charSequence = this.f5246R;
            if (charSequence != null) {
                s6Var.f7406R.f30R = charSequence;
            }
            ListAdapter listAdapter = this.f5245R;
            int selectedItemPosition = this.f5244R.getSelectedItemPosition();
            B_ b_ = s6Var.f7406R;
            b_.f29R = listAdapter;
            b_.c = this;
            b_.R = selectedItemPosition;
            b_.f35v = true;
            Db R = s6Var.R();
            this.R = R;
            AlertController$RecycleListView alertController$RecycleListView = R.R.f129R;
            M9.e(alertController$RecycleListView, i);
            M9.c(alertController$RecycleListView, i2);
            this.R.show();
        }
    }

    @Override // defpackage.G6
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.G6
    public final void dismiss() {
        Db db = this.R;
        if (db != null) {
            db.dismiss();
            this.R = null;
        }
    }

    @Override // defpackage.G6
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.G6
    public final CharSequence m() {
        return this.f5246R;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5244R.setSelection(i);
        if (this.f5244R.getOnItemClickListener() != null) {
            this.f5244R.performItemClick(null, i, this.f5245R.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.G6
    public final boolean v() {
        Db db = this.R;
        if (db != null) {
            return db.isShowing();
        }
        return false;
    }

    @Override // defpackage.G6
    public final Drawable x() {
        return null;
    }
}
