package de.Maxr1998.modernpreferences.preferences.choice;

import android.content.Context;
import android.content.DialogInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import de.Maxr1998.modernpreferences.PreferencesAdapter;
import de.Maxr1998.modernpreferences.preferences.DialogPreference;
import de.Maxr1998.modernpreferences.preferences.choice.AbstractChoiceDialogPreference;

/* loaded from: classes.dex */
public abstract class AbstractChoiceDialogPreference extends DialogPreference {
    public hvR R;

    public abstract void L();

    public abstract boolean O();

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
        RecyclerView recyclerView = new RecyclerView(context, null);
        hvR hvr = new hvR(this);
        this.R = hvr;
        recyclerView.setAdapter(hvr);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        B_ b_2 = s6Var.f7406R;
        b_2.f33v = recyclerView;
        b_2.f31R = false;
        sp spVar = new DialogInterface.OnClickListener(this, 0) { // from class: sp
            public final /* synthetic */ AbstractChoiceDialogPreference R;
            public final /* synthetic */ int e;

            {
                this.e = r2;
                this.R = r1;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                switch (this.e) {
                    case 0:
                        AbstractChoiceDialogPreference abstractChoiceDialogPreference = this.R;
                        abstractChoiceDialogPreference.L();
                        mkC mkc = ((e1q) abstractChoiceDialogPreference).f2941R;
                        if (mkc != null) {
                            int i3 = abstractChoiceDialogPreference.m;
                            PreferencesAdapter preferencesAdapter = mkc.R;
                            if (preferencesAdapter != null) {
                                ((gEY) preferencesAdapter).R.c(i3, 1);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.R.Z();
                        return;
                }
            }
        };
        b_2.f34v = b_2.f23R.getText(17039370);
        B_ b_3 = s6Var.f7406R;
        b_3.f24R = spVar;
        sp spVar2 = new DialogInterface.OnClickListener(this, 1) { // from class: sp
            public final /* synthetic */ AbstractChoiceDialogPreference R;
            public final /* synthetic */ int e;

            {
                this.e = r2;
                this.R = r1;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                switch (this.e) {
                    case 0:
                        AbstractChoiceDialogPreference abstractChoiceDialogPreference = this.R;
                        abstractChoiceDialogPreference.L();
                        mkC mkc = ((e1q) abstractChoiceDialogPreference).f2941R;
                        if (mkc != null) {
                            int i3 = abstractChoiceDialogPreference.m;
                            PreferencesAdapter preferencesAdapter = mkc.R;
                            if (preferencesAdapter != null) {
                                ((gEY) preferencesAdapter).R.c(i3, 1);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.R.Z();
                        return;
                }
            }
        };
        b_3.f32c = b_3.f23R.getText(17039360);
        s6Var.f7406R.v = spVar2;
        return s6Var.R();
    }

    public abstract void Z();

    @Override // de.Maxr1998.modernpreferences.preferences.DialogPreference, defpackage.k3P
    public final void e(nu_ nu_, alX alx) {
        super.e(nu_, alx);
        if (alx == alX.ON_DESTROY) {
            this.R = null;
        }
    }
}
