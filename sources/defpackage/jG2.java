package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: jG2  reason: default package */
/* loaded from: classes.dex */
public final class jG2 implements TextWatcher {
    public final /* synthetic */ ViewGroup R;
    public final /* synthetic */ int e;

    public /* synthetic */ jG2(ViewGroup viewGroup, int i) {
        this.e = i;
        this.R = viewGroup;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.e) {
            case 0:
                return;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) this.R;
                textInputLayout.t(!textInputLayout.f2368U, false);
                TextInputLayout textInputLayout2 = (TextInputLayout) this.R;
                if (textInputLayout2.f2367R) {
                    textInputLayout2.C(editable);
                }
                TextInputLayout textInputLayout3 = (TextInputLayout) this.R;
                if (textInputLayout3.f2374c) {
                    textInputLayout3.i(editable);
                    return;
                }
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.e) {
            case 0:
                SearchView searchView = (SearchView) this.R;
                Editable text = searchView.f1104R.getText();
                searchView.f1115c = text;
                boolean z = !TextUtils.isEmpty(text);
                searchView.V(z);
                boolean z2 = !z;
                int i4 = 8;
                if (searchView.Z && !searchView.f1119e && z2) {
                    i4 = 0;
                    searchView.f1124v.setVisibility(8);
                }
                searchView.f1118e.setVisibility(i4);
                searchView.g();
                searchView.i();
                searchView.getClass();
                searchView.f1110R = charSequence.toString();
                return;
            default:
                return;
        }
    }
}
