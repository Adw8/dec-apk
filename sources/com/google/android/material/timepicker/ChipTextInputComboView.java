package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final EditText R;

    /* renamed from: R  reason: collision with other field name */
    public TextView f2387R = (TextView) findViewById(R.id.material_label);

    /* renamed from: R  reason: collision with other field name */
    public final Chip f2388R;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f2388R = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.R = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new d(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        WeakHashMap weakHashMap = of5.f6887R;
        editText.setId(eHQ.R());
        eHQ.Z(this.f2387R, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String R(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2388R.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.R.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        this.f2388R.setChecked(z);
        int i = 0;
        this.R.setVisibility(z ? 0 : 4);
        Chip chip = this.f2388R;
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            EditText editText = this.R;
            editText.requestFocus();
            editText.post(new k0f(15, editText));
            if (!TextUtils.isEmpty(this.R.getText())) {
                EditText editText2 = this.R;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2388R.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f2388R.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f2388R.toggle();
    }
}
