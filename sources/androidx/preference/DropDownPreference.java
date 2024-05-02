package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import dev.kdrag0n.virtcontainer.R;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter R;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.R = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).R;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.R.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void v() {
        ArrayAdapter arrayAdapter = this.R;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
