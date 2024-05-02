package de.Maxr1998.modernpreferences.preferences.choice;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class MultiChoiceDialogPreference extends AbstractChoiceDialogPreference {
    @Override // de.Maxr1998.modernpreferences.preferences.choice.AbstractChoiceDialogPreference
    public final void L() {
        new HashSet();
        throw null;
    }

    @Override // de.Maxr1998.modernpreferences.preferences.choice.AbstractChoiceDialogPreference
    public final boolean O() {
        throw null;
    }

    @Override // defpackage.e1q
    public final void R() {
        throw null;
    }

    @Override // de.Maxr1998.modernpreferences.preferences.choice.AbstractChoiceDialogPreference
    public final void Z() {
        SharedPreferences sharedPreferences = ((e1q) this).R;
        if (sharedPreferences != null) {
            sharedPreferences.getStringSet(((UW) this).f566R, null);
        }
        throw null;
    }

    @Override // defpackage.e1q
    public final CharSequence c(Context context) {
        return super.c(context);
    }
}
