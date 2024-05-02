package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import de.Maxr1998.modernpreferences.preferences.choice.AbstractChoiceDialogPreference;
import dev.kdrag0n.virtcontainer.R;
import java.util.List;

/* renamed from: hvR  reason: default package */
/* loaded from: classes.dex */
public final class hvR extends gEY {
    public final AbstractChoiceDialogPreference R;

    /* renamed from: R  reason: collision with other field name */
    public final List f4416R = null;
    public final boolean v = false;

    public hvR(AbstractChoiceDialogPreference abstractChoiceDialogPreference) {
        this.R = abstractChoiceDialogPreference;
    }

    @Override // defpackage.gEY
    public final h9X L(RecyclerView recyclerView, int i) {
        return new cI4(LayoutInflater.from(recyclerView.getContext()).inflate(this.v ? R.layout.map_dialog_multi_choice_item : R.layout.map_dialog_single_choice_item, (ViewGroup) recyclerView, false));
    }

    @Override // defpackage.gEY
    public final void O(h9X h9x, int i) {
        jQ.Y(this.f4416R.get(i));
        ((cI4) h9x).R.setChecked(this.R.O());
        throw null;
    }

    @Override // defpackage.gEY
    public final int R() {
        return this.f4416R.size();
    }
}
