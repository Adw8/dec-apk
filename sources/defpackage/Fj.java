package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: Fj  reason: default package */
/* loaded from: classes.dex */
public final class Fj {
    public int L;
    public int O;
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Db f119R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f120R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f121R;

    /* renamed from: R  reason: collision with other field name */
    public Message f122R;

    /* renamed from: R  reason: collision with other field name */
    public View f123R;

    /* renamed from: R  reason: collision with other field name */
    public final Window f124R;

    /* renamed from: R  reason: collision with other field name */
    public Button f125R;

    /* renamed from: R  reason: collision with other field name */
    public ImageView f126R;

    /* renamed from: R  reason: collision with other field name */
    public ListAdapter f127R;

    /* renamed from: R  reason: collision with other field name */
    public TextView f128R;

    /* renamed from: R  reason: collision with other field name */
    public AlertController$RecycleListView f129R;

    /* renamed from: R  reason: collision with other field name */
    public NestedScrollView f130R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f131R;

    /* renamed from: R  reason: collision with other field name */
    public pI f132R;
    public int X;
    public int Z;

    /* renamed from: c  reason: collision with other field name */
    public Drawable f135c;

    /* renamed from: c  reason: collision with other field name */
    public Message f136c;

    /* renamed from: c  reason: collision with other field name */
    public Button f137c;

    /* renamed from: c  reason: collision with other field name */
    public CharSequence f138c;

    /* renamed from: e  reason: collision with other field name */
    public Drawable f139e;

    /* renamed from: e  reason: collision with other field name */
    public CharSequence f140e;
    public int m;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public Drawable f141v;

    /* renamed from: v  reason: collision with other field name */
    public Message f142v;

    /* renamed from: v  reason: collision with other field name */
    public View f143v;

    /* renamed from: v  reason: collision with other field name */
    public Button f144v;

    /* renamed from: v  reason: collision with other field name */
    public TextView f145v;

    /* renamed from: v  reason: collision with other field name */
    public CharSequence f146v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f147v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f134R = false;
    public int c = 0;
    public int e = -1;

    /* renamed from: R  reason: collision with other field name */
    public final pS f133R = new pS(0, this);

    public Fj(Context context, Db db, Window window) {
        this.f120R = context;
        this.f119R = db;
        this.f124R = window;
        this.f132R = new pI(db);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iTI.X, R.attr.alertDialogStyle, 0);
        this.X = obtainStyledAttributes.getResourceId(0, 0);
        this.O = obtainStyledAttributes.getResourceId(2, 0);
        this.L = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.Z = obtainStyledAttributes.getResourceId(7, 0);
        this.m = obtainStyledAttributes.getResourceId(3, 0);
        this.f147v = obtainStyledAttributes.getBoolean(6, true);
        this.R = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        db.C().Z(1);
    }

    public static boolean R(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (R(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void c(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    public static ViewGroup e(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public static void v(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final void X(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.f132R.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f140e = charSequence;
            this.f136c = obtainMessage;
            this.f135c = null;
        } else if (i == -2) {
            this.f138c = charSequence;
            this.f142v = obtainMessage;
            this.f141v = null;
        } else if (i == -1) {
            this.f146v = charSequence;
            this.f122R = obtainMessage;
            this.f121R = null;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
