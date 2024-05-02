package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import dev.kdrag0n.virtcontainer.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* renamed from: ajY  reason: default package */
/* loaded from: classes.dex */
public final class ajY<S> extends jcp {
    public static final /* synthetic */ int g = 0;
    public int C;
    public boolean J;
    public int N;
    public int P;
    public BD R;

    /* renamed from: R  reason: collision with other field name */
    public Button f984R;

    /* renamed from: R  reason: collision with other field name */
    public TextView f985R;

    /* renamed from: R  reason: collision with other field name */
    public c18 f986R;

    /* renamed from: R  reason: collision with other field name */
    public CheckableImageButton f987R;

    /* renamed from: R  reason: collision with other field name */
    public hSy f988R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f989R;

    /* renamed from: R  reason: collision with other field name */
    public l6q f991R;
    public int U;
    public boolean Y;
    public CharSequence c;
    public int j;
    public CharSequence v;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f990R = new LinkedHashSet();

    /* renamed from: v  reason: collision with other field name */
    public final LinkedHashSet f993v = new LinkedHashSet();

    /* renamed from: c  reason: collision with other field name */
    public final LinkedHashSet f992c = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();

    public static boolean D(Context context) {
        return b(context, 16843277);
    }

    public static int F(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        int i = new fhy(dGb.c()).O;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * i;
        return ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean b(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(hDC.r(R.attr.materialCalendarStyle, context, hSy.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // defpackage.jcp, defpackage.pm2
    public final void A(Bundle bundle) {
        super.A(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.U);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        Yg yg = new Yg(this.R);
        fhy fhy = this.f988R.f4270R;
        if (fhy != null) {
            yg.f638R = Long.valueOf(fhy.R);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", yg.f637R);
        fhy v = fhy.v(yg.f636R);
        fhy v2 = fhy.v(yg.v);
        Ke ke = (Ke) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = yg.f638R;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new BD(v, v2, ke, l == null ? null : fhy.v(l.longValue()), yg.R));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.C);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f989R);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.P);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.v);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.j);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.c);
    }

    @Override // defpackage.jcp
    public final Dialog E() {
        Context k = k();
        k();
        int i = this.U;
        if (i == 0) {
            i = a().L();
        }
        Dialog dialog = new Dialog(k, i);
        Context context = dialog.getContext();
        this.J = D(context);
        int i2 = hDC.r(R.attr.colorSurface, context, ajY.class.getCanonicalName()).data;
        c18 c18 = new c18(context, null, R.attr.materialCalendarStyle, 2132018185);
        this.f986R = c18;
        c18.x(context);
        this.f986R.C(ColorStateList.valueOf(i2));
        c18 c182 = this.f986R;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = of5.f6887R;
        c182.U(m18.m(decorView));
        return dialog;
    }

    @Override // defpackage.pm2
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.J ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.J) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(F(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(F(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f985R = textView;
        WeakHashMap weakHashMap = of5.f6887R;
        d6y.O(textView, 1);
        this.f987R = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f989R;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.C);
        }
        this.f987R.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f987R;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, aH9.p(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], aH9.p(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f987R.setChecked(this.N != 0);
        of5.O(this.f987R, null);
        _(this.f987R);
        this.f987R.setOnClickListener(new h6g(this, 2));
        this.f984R = (Button) inflate.findViewById(R.id.confirm_button);
        if (a().x()) {
            this.f984R.setEnabled(true);
        } else {
            this.f984R.setEnabled(false);
        }
        this.f984R.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence2 = this.v;
        if (charSequence2 != null) {
            this.f984R.setText(charSequence2);
        } else {
            int i = this.P;
            if (i != 0) {
                this.f984R.setText(i);
            }
        }
        this.f984R.setOnClickListener(new h6g(this, 0));
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.j;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        button.setOnClickListener(new h6g(this, 1));
        return inflate;
    }

    @Override // defpackage.jcp, defpackage.pm2
    public final void K(Bundle bundle) {
        super.K(bundle);
        if (bundle == null) {
            bundle = ((pm2) this).c;
        }
        this.U = bundle.getInt("OVERRIDE_THEME_RES_ID");
        hIm him = (hIm) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.R = (BD) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.C = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f989R = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.N = bundle.getInt("INPUT_MODE_KEY");
        this.P = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.v = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.j = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.c = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // defpackage.jcp, defpackage.pm2
    public final void S() {
        super.S();
        Window window = f().getWindow();
        if (this.J) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f986R);
            if (!this.Y) {
                View findViewById = p().findViewById(R.id.fullscreen_header);
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int y = vd.y(window.getContext(), 16842801, -16777216);
                if (z2) {
                    valueOf = Integer.valueOf(y);
                }
                Integer valueOf2 = Integer.valueOf(y);
                hiu.R(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z3 = vd.K(0) || vd.K(valueOf.intValue());
                window.getDecorView();
                ((hw1) new gL6(window).R).K(z3);
                boolean K = vd.K(valueOf2.intValue());
                if (vd.K(0) || K) {
                    z = true;
                }
                window.getDecorView();
                ((hw1) new gL6(window).R).o(z);
                m_D m_d = new m_D(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = of5.f6887R;
                m18.V(findViewById, m_d);
                this.Y = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = k().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f986R, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new h9J(f(), rect));
        }
        w();
    }

    public final void _(CheckableImageButton checkableImageButton) {
        this.f987R.setContentDescription(this.f987R.isChecked() ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    public final hIm a() {
        hIm him = (hIm) ((pm2) this).c.getParcelable("DATE_SELECTOR_KEY");
        return null;
    }

    @Override // defpackage.jcp, defpackage.pm2
    public final void d() {
        this.f991R.R.clear();
        super.d();
    }

    @Override // defpackage.jcp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f992c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.jcp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) ((pm2) this).f7228R;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void q() {
        hIm a = a();
        H();
        String c = a.c();
        this.f985R.setContentDescription(String.format(k().getResources().getString(R.string.mtrl_picker_announce_current_selection), c));
        this.f985R.setText(c);
    }

    public final void w() {
        l6q l6q;
        k();
        int i = this.U;
        if (i == 0) {
            i = a().L();
        }
        hIm a = a();
        BD bd = this.R;
        hSy hsy = new hSy();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bd);
        bundle.putParcelable("CURRENT_MONTH_KEY", bd.c);
        hsy.B(bundle);
        this.f988R = hsy;
        if (this.f987R.isChecked()) {
            hIm a2 = a();
            BD bd2 = this.R;
            l6q = new pwG();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", a2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bd2);
            l6q.B(bundle2);
        } else {
            l6q = this.f988R;
        }
        this.f991R = l6q;
        q();
        hAW m = m();
        m.getClass();
        KP kp = new KP(m);
        kp.X(R.id.mtrl_calendar_frame, this.f991R, null, 2);
        if (!kp.f252R) {
            kp.f259v = false;
            kp.f248R.Y(kp, false);
            this.f991R.M(new kT5(0, this));
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
}
