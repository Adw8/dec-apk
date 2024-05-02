package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class d extends gPo {
    public final /* synthetic */ ChipTextInputComboView R;

    public d(ChipTextInputComboView chipTextInputComboView) {
        this.R = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty(editable)) {
            ChipTextInputComboView chipTextInputComboView = this.R;
            chipTextInputComboView.f2388R.setText(ChipTextInputComboView.R(chipTextInputComboView, "00"));
            return;
        }
        ChipTextInputComboView chipTextInputComboView2 = this.R;
        chipTextInputComboView2.f2388R.setText(ChipTextInputComboView.R(chipTextInputComboView2, editable));
    }
}
