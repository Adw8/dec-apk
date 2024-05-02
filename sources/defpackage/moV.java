package defpackage;

import android.view.inputmethod.InputMethodManager;
import com.termux.view.TerminalView;
import java.util.WeakHashMap;

/* renamed from: moV  reason: default package */
/* loaded from: classes.dex */
public final class moV extends aFk implements iv7 {
    public final /* synthetic */ InputMethodManager R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f6155R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f6156R;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public moV(boolean z, boolean z2, h0T h0t, InputMethodManager inputMethodManager, aOO aoo) {
        super(2, aoo);
        this.f6156R = z;
        this.v = z2;
        this.f6155R = h0t;
        this.R = inputMethodManager;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((moV) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        h0T h0t = this.f6155R;
        float f = iqx.R;
        TerminalView terminalView = (TerminalView) h0t.getValue();
        if (terminalView != null && this.f6156R) {
            if (this.v) {
                InputMethodManager inputMethodManager = this.R;
                WeakHashMap weakHashMap = of5.f6887R;
                if (d6y.v(terminalView)) {
                    terminalView.requestFocus();
                    inputMethodManager.showSoftInput(terminalView, 0);
                } else {
                    terminalView.addOnAttachStateChangeListener(new gcC(terminalView, terminalView, inputMethodManager));
                }
            }
            return o8s.R;
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new moV(this.f6156R, this.v, this.f6155R, this.R, aoo);
    }
}
