package de.Maxr1998.modernpreferences.preferences;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.Editable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import de.Maxr1998.modernpreferences.PreferencesAdapter;
import de.Maxr1998.modernpreferences.preferences.EditTextPreference;

/* loaded from: classes.dex */
public final class EditTextPreference extends DialogPreference {
    public CharSequence X;

    @Override // defpackage.e1q
    public final void R() {
        if (this.X == null) {
            SharedPreferences sharedPreferences = ((e1q) this).R;
            String str = null;
            if (sharedPreferences != null) {
                str = sharedPreferences.getString(((UW) this).f566R, null);
            }
            this.X = str;
        }
    }

    @Override // de.Maxr1998.modernpreferences.preferences.DialogPreference
    public final Db X(Context context) {
        s6 s6Var = (s6) g5M.Z.x(context);
        int i = ((UW) this).e;
        if (i != -1) {
            B_ b_ = s6Var.f7406R;
            b_.f30R = b_.f23R.getText(i);
        } else {
            s6Var.f7406R.f30R = ((UW) this).f565R;
        }
        Fx fx = new Fx(context, null, 0);
        fx.setHint(0);
        fx.setText(this.X);
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int i2 = (int) (((float) 10) * context.getResources().getDisplayMetrics().density);
        int i3 = i2 * 2;
        marginLayoutParams.setMarginStart(i3);
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.topMargin = i2;
        frameLayout.addView(fx, marginLayoutParams);
        B_ b_2 = s6Var.f7406R;
        b_2.f33v = frameLayout;
        b_2.f31R = false;
        aVx avx = new DialogInterface.OnClickListener(fx, this, 0) { // from class: aVx
            public final /* synthetic */ Fx R;

            /* renamed from: R  reason: collision with other field name */
            public final /* synthetic */ EditTextPreference f902R;
            public final /* synthetic */ int e;

            {
                this.e = r3;
                this.R = r1;
                this.f902R = r2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                switch (this.e) {
                    case 0:
                        Fx fx2 = this.R;
                        EditTextPreference editTextPreference = this.f902R;
                        Editable text = fx2.getText();
                        if (text != null) {
                            editTextPreference.X = text;
                            String obj = text.toString();
                            SharedPreferences sharedPreferences = ((e1q) editTextPreference).R;
                            if (sharedPreferences != null) {
                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                edit.putString(((UW) editTextPreference).f566R, obj);
                                edit.apply();
                            }
                        }
                        mkC mkc = ((e1q) editTextPreference).f2941R;
                        if (mkc != null) {
                            int i5 = editTextPreference.m;
                            PreferencesAdapter preferencesAdapter = mkc.R;
                            if (preferencesAdapter != null) {
                                ((gEY) preferencesAdapter).R.c(i5, 1);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.R.setText(this.f902R.X);
                        return;
                }
            }
        };
        b_2.f34v = b_2.f23R.getText(17039370);
        B_ b_3 = s6Var.f7406R;
        b_3.f24R = avx;
        aVx avx2 = new DialogInterface.OnClickListener(fx, this, 1) { // from class: aVx
            public final /* synthetic */ Fx R;

            /* renamed from: R  reason: collision with other field name */
            public final /* synthetic */ EditTextPreference f902R;
            public final /* synthetic */ int e;

            {
                this.e = r3;
                this.R = r1;
                this.f902R = r2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                switch (this.e) {
                    case 0:
                        Fx fx2 = this.R;
                        EditTextPreference editTextPreference = this.f902R;
                        Editable text = fx2.getText();
                        if (text != null) {
                            editTextPreference.X = text;
                            String obj = text.toString();
                            SharedPreferences sharedPreferences = ((e1q) editTextPreference).R;
                            if (sharedPreferences != null) {
                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                edit.putString(((UW) editTextPreference).f566R, obj);
                                edit.apply();
                            }
                        }
                        mkC mkc = ((e1q) editTextPreference).f2941R;
                        if (mkc != null) {
                            int i5 = editTextPreference.m;
                            PreferencesAdapter preferencesAdapter = mkc.R;
                            if (preferencesAdapter != null) {
                                ((gEY) preferencesAdapter).R.c(i5, 1);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.R.setText(this.f902R.X);
                        return;
                }
            }
        };
        b_3.f32c = b_3.f23R.getText(17039360);
        s6Var.f7406R.v = avx2;
        return s6Var.R();
    }

    @Override // defpackage.e1q
    public final CharSequence c(Context context) {
        throw null;
    }
}
