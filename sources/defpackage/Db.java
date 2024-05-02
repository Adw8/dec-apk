package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* renamed from: Db  reason: default package */
/* loaded from: classes.dex */
public final class Db extends bEF implements Lb {

    /* renamed from: R  reason: collision with other field name */
    public Q8 f78R;

    /* renamed from: R  reason: collision with other field name */
    public final OI f77R = new OI(this);
    public final Fj R = new Fj(getContext(), this, getWindow());

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Db(android.content.Context r2, int r3) {
        /*
            r1 = this;
            int r3 = y(r2, r3)
            int r0 = N(r2, r3)
            r1.<init>(r2, r0)
            OI r0 = new OI
            r0.<init>(r1)
            r1.f77R = r0
            j7 r0 = r1.C()
            int r2 = N(r2, r3)
            r3 = r0
            Q8 r3 = (defpackage.Q8) r3
            r3.X = r2
            r0.X()
            Fj r2 = new Fj
            android.content.Context r3 = r1.getContext()
            android.view.Window r0 = r1.getWindow()
            r2.<init>(r3, r1, r0)
            r1.R = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Db.<init>(android.content.Context, int):void");
    }

    public static int N(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public static int y(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final j7 C() {
        if (this.f78R == null) {
            L5 l5 = j7.R;
            this.f78R = new Q8(getContext(), getWindow(), this, this);
        }
        return this.f78R;
    }

    /* renamed from: H */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        OI oi = this.f77R;
        if (oi == null) {
            return false;
        }
        return oi.R(keyEvent);
    }

    public final boolean J(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void K(CharSequence charSequence) {
        super.setTitle(charSequence);
        C().U(charSequence);
    }

    /* renamed from: L */
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C().v(view, layoutParams);
    }

    /* renamed from: P */
    public final void invalidateOptionsMenu() {
        Q8 q8 = (Q8) C();
        if (q8.f409R != null) {
            q8.h();
            q8.f409R.getClass();
            q8.O |= 1;
            if (!q8.j) {
                View decorView = q8.f405R.getDecorView();
                Fz fz = q8.v;
                WeakHashMap weakHashMap = of5.f6887R;
                mHC.C(decorView, fz);
                q8.j = true;
            }
        }
    }

    /* renamed from: U */
    public final View findViewById(int i) {
        Q8 q8 = (Q8) C();
        q8.V();
        return q8.f405R.findViewById(i);
    }

    /* renamed from: V */
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C().H(view, layoutParams);
    }

    @Override // defpackage.Lb
    public final /* bridge */ /* synthetic */ void X() {
    }

    /* renamed from: Z */
    public final void dismiss() {
        super.dismiss();
        C().O();
    }

    /* renamed from: g */
    public final void onStop() {
        super.onStop();
        Q8 q8 = (Q8) C();
        q8.h();
        b_R b_r = q8.f409R;
        if (b_r != null) {
            b_r.L = false;
            hYl hyl = b_r.f1740R;
            if (hyl != null) {
                hyl.R();
            }
        }
    }

    /* renamed from: i */
    public final void setContentView(View view) {
        C().x(view);
    }

    public final void j(Bundle bundle) {
        C().e();
        super.onCreate(bundle);
        C().X();
    }

    @Override // defpackage.Lb
    public final /* bridge */ /* synthetic */ void m() {
    }

    /* renamed from: o */
    public final void setTitle(int i) {
        super.setTitle(i);
        C().U(getContext().getString(i));
    }

    @Override // defpackage.bEF, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z;
        ListAdapter listAdapter;
        View findViewById;
        j(bundle);
        Fj fj = this.R;
        fj.f119R.setContentView(fj.O == 0 ? fj.X : fj.X);
        View findViewById2 = fj.f124R.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view = fj.f123R;
        View view2 = null;
        int i = 0;
        if (view == null) {
            view = fj.v != 0 ? LayoutInflater.from(fj.f120R).inflate(fj.v, viewGroup, false) : null;
        }
        boolean z2 = view != null;
        if (!z2 || !Fj.R(view)) {
            fj.f124R.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) fj.f124R.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (fj.f134R) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (fj.f129R != null) {
                ((LinearLayout.LayoutParams) ((eGR) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup e = Fj.e(findViewById6, findViewById3);
        ViewGroup e2 = Fj.e(findViewById7, findViewById4);
        ViewGroup e3 = Fj.e(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) fj.f124R.findViewById(R.id.scrollView);
        fj.f130R = nestedScrollView;
        nestedScrollView.setFocusable(false);
        fj.f130R.setNestedScrollingEnabled(false);
        TextView textView = (TextView) e2.findViewById(16908299);
        fj.f145v = textView;
        if (textView != null) {
            textView.setVisibility(8);
            fj.f130R.removeView(fj.f145v);
            if (fj.f129R != null) {
                ViewGroup viewGroup2 = (ViewGroup) fj.f130R.getParent();
                int indexOfChild = viewGroup2.indexOfChild(fj.f130R);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(fj.f129R, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                e2.setVisibility(8);
            }
        }
        Button button = (Button) e3.findViewById(16908313);
        fj.f125R = button;
        button.setOnClickListener(fj.f133R);
        if (!TextUtils.isEmpty(fj.f146v) || fj.f121R != null) {
            fj.f125R.setText(fj.f146v);
            Drawable drawable = fj.f121R;
            if (drawable != null) {
                int i2 = fj.R;
                drawable.setBounds(0, 0, i2, i2);
                fj.f125R.setCompoundDrawables(fj.f121R, null, null, null);
            }
            fj.f125R.setVisibility(0);
            z = true;
        } else {
            fj.f125R.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) e3.findViewById(16908314);
        fj.f144v = button2;
        button2.setOnClickListener(fj.f133R);
        if (!TextUtils.isEmpty(fj.f138c) || fj.f141v != null) {
            fj.f144v.setText(fj.f138c);
            Drawable drawable2 = fj.f141v;
            if (drawable2 != null) {
                int i3 = fj.R;
                drawable2.setBounds(0, 0, i3, i3);
                fj.f144v.setCompoundDrawables(fj.f141v, null, null, null);
            }
            fj.f144v.setVisibility(0);
            z |= true;
        } else {
            fj.f144v.setVisibility(8);
        }
        Button button3 = (Button) e3.findViewById(16908315);
        fj.f137c = button3;
        button3.setOnClickListener(fj.f133R);
        if (!TextUtils.isEmpty(fj.f140e) || fj.f135c != null) {
            fj.f137c.setText(fj.f140e);
            Drawable drawable3 = fj.f135c;
            if (drawable3 != null) {
                int i4 = fj.R;
                drawable3.setBounds(0, 0, i4, i4);
                fj.f137c.setCompoundDrawables(fj.f135c, null, null, null);
            }
            fj.f137c.setVisibility(0);
            z |= true;
        } else {
            fj.f137c.setVisibility(8);
        }
        Context context = fj.f120R;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                Fj.v(fj.f125R);
            } else if (z) {
                Fj.v(fj.f144v);
            } else if (z) {
                Fj.v(fj.f137c);
            }
        }
        if (!(z)) {
            e3.setVisibility(8);
        }
        if (fj.f143v != null) {
            e.addView(fj.f143v, 0, new ViewGroup.LayoutParams(-1, -2));
            fj.f124R.findViewById(R.id.title_template).setVisibility(8);
        } else {
            fj.f126R = (ImageView) fj.f124R.findViewById(16908294);
            if (!(!TextUtils.isEmpty(fj.f131R)) || !fj.f147v) {
                fj.f124R.findViewById(R.id.title_template).setVisibility(8);
                fj.f126R.setVisibility(8);
                e.setVisibility(8);
            } else {
                TextView textView2 = (TextView) fj.f124R.findViewById(R.id.alertTitle);
                fj.f128R = textView2;
                textView2.setText(fj.f131R);
                int i5 = fj.c;
                if (i5 != 0) {
                    fj.f126R.setImageResource(i5);
                } else {
                    Drawable drawable4 = fj.f139e;
                    if (drawable4 != null) {
                        fj.f126R.setImageDrawable(drawable4);
                    } else {
                        fj.f128R.setPadding(fj.f126R.getPaddingLeft(), fj.f126R.getPaddingTop(), fj.f126R.getPaddingRight(), fj.f126R.getPaddingBottom());
                        fj.f126R.setVisibility(8);
                    }
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i6 = (e == null || e.getVisibility() == 8) ? 0 : 1;
        boolean z4 = e3.getVisibility() != 8;
        if (!z4 && (findViewById = e2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i6 != 0) {
            NestedScrollView nestedScrollView2 = fj.f130R;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (fj.f129R != null) {
                view2 = e.findViewById(R.id.titleDividerNoCustom);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            View findViewById9 = e2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = fj.f129R;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            if (!z4 || i6 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i6 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.e, alertController$RecycleListView.getPaddingRight(), z4 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.X);
            } else {
                alertController$RecycleListView.getClass();
            }
        }
        if (!z3) {
            View view3 = fj.f129R;
            if (view3 == null) {
                view3 = fj.f130R;
            }
            if (view3 != null) {
                if (z4) {
                    i = 2;
                }
                int i7 = i6 | i;
                View findViewById10 = fj.f124R.findViewById(R.id.scrollIndicatorUp);
                View findViewById11 = fj.f124R.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = of5.f6887R;
                jUJ.e(view3, i7, 3);
                if (findViewById10 != null) {
                    e2.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    e2.removeView(findViewById11);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = fj.f129R;
        if (alertController$RecycleListView2 != null && (listAdapter = fj.f127R) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i8 = fj.e;
            if (i8 > -1) {
                alertController$RecycleListView2.setItemChecked(i8, true);
                alertController$RecycleListView2.setSelection(i8);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.R.f130R;
        if (nestedScrollView != null && nestedScrollView.x(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.R.f130R;
        if (nestedScrollView != null && nestedScrollView.x(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        K(charSequence);
        Fj fj = this.R;
        fj.f131R = charSequence;
        TextView textView = fj.f128R;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: t */
    public final void setContentView(int i) {
        C().m(i);
    }

    @Override // defpackage.Lb
    public final /* bridge */ /* synthetic */ void v() {
    }
}
