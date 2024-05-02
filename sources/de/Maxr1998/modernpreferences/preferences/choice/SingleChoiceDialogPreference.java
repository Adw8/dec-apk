package de.Maxr1998.modernpreferences.preferences.choice;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class SingleChoiceDialogPreference extends AbstractChoiceDialogPreference {
    @Override // de.Maxr1998.modernpreferences.preferences.choice.AbstractChoiceDialogPreference
    public final void L() {
    }

    @Override // de.Maxr1998.modernpreferences.preferences.choice.AbstractChoiceDialogPreference
    public final boolean O() {
        throw null;
    }

    @Override // defpackage.e1q
    public final void R() {
        Z();
    }

    @Override // de.Maxr1998.modernpreferences.preferences.choice.AbstractChoiceDialogPreference
    public final void Z() {
        SharedPreferences sharedPreferences = ((e1q) this).R;
        String string = sharedPreferences == null ? null : sharedPreferences.getString(((UW) this).f566R, null);
        if (string == null) {
            string = null;
        }
        if (string == null) {
            hvR hvr = ((AbstractChoiceDialogPreference) this).R;
            if (hvr != null) {
                ((gEY) hvr).R.c(0, hvr.R());
                return;
            }
            return;
        }
        throw null;
    }

    @Override // defpackage.e1q
    public final CharSequence c(Context context) {
        return super.c(context);
    }
}
