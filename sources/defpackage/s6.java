package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: s6  reason: default package */
/* loaded from: classes.dex */
public final class s6 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final B_ f7406R;

    public s6(Context context) {
        int y = Db.y(context, 0);
        this.f7406R = new B_(new ContextThemeWrapper(context, Db.y(context, y)));
        this.R = y;
    }

    public final Db R() {
        Db db = new Db(this.f7406R.f23R, this.R);
        B_ b_ = this.f7406R;
        Fj fj = db.R;
        View view = b_.f28R;
        if (view != null) {
            fj.f143v = view;
        } else {
            CharSequence charSequence = b_.f30R;
            if (charSequence != null) {
                fj.f131R = charSequence;
                TextView textView = fj.f128R;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = b_.f26R;
            if (drawable != null) {
                fj.f139e = drawable;
                fj.c = 0;
                ImageView imageView = fj.f126R;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    fj.f126R.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = b_.f34v;
        if (charSequence2 != null) {
            fj.X(-1, charSequence2, b_.f24R);
        }
        CharSequence charSequence3 = b_.f32c;
        if (charSequence3 != null) {
            fj.X(-2, charSequence3, b_.v);
        }
        if (b_.f29R != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) b_.f27R.inflate(fj.L, (ViewGroup) null);
            int i = b_.f35v ? fj.Z : fj.m;
            ListAdapter listAdapter = b_.f29R;
            if (listAdapter == null) {
                listAdapter = new V0(b_.f23R, i);
            }
            fj.f127R = listAdapter;
            fj.e = b_.R;
            if (b_.c != null) {
                alertController$RecycleListView.setOnItemClickListener(new ck(b_, 0, fj));
            }
            if (b_.f35v) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            fj.f129R = alertController$RecycleListView;
        }
        View view2 = b_.f33v;
        if (view2 != null) {
            fj.f123R = view2;
            fj.v = 0;
            fj.f134R = false;
        }
        db.setCancelable(this.f7406R.f31R);
        if (this.f7406R.f31R) {
            db.setCanceledOnTouchOutside(true);
        }
        this.f7406R.getClass();
        db.setOnCancelListener(null);
        this.f7406R.getClass();
        db.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = this.f7406R.f25R;
        if (onKeyListener != null) {
            db.setOnKeyListener(onKeyListener);
        }
        return db;
    }
}
