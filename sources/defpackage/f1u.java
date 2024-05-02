package defpackage;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: f1u  reason: default package */
/* loaded from: classes.dex */
public final class f1u implements TextWatcher, SpanWatcher {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public final AtomicInteger f3280R = new AtomicInteger(0);

    public f1u(Object obj) {
        this.R = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.R).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.R).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f3280R.get() <= 0 || !(obj instanceof cLN)) {
            ((SpanWatcher) this.R).onSpanAdded(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (this.f3280R.get() <= 0 || !(obj instanceof cLN)) {
            ((SpanWatcher) this.R).onSpanChanged(spannable, obj, i, i2, i3, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f3280R.get() <= 0 || !(obj instanceof cLN)) {
            ((SpanWatcher) this.R).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.R).onTextChanged(charSequence, i, i2, i3);
    }
}
