package de.Maxr1998.modernpreferences;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dev.kdrag0n.virtcontainer.R;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes.dex */
public final class PreferencesAdapter extends gEY implements k3P {
    public static final bV5 R = new bV5(mY_.Z);

    /* renamed from: R  reason: collision with other field name */
    public final gcA f2692R;

    /* renamed from: R  reason: collision with other field name */
    public final Stack f2693R;

    static {
        new ppN();
    }

    public PreferencesAdapter(mkC mkc) {
        Stack stack = new Stack();
        stack.push((mkC) R.getValue());
        this.f2693R = stack;
        if (!((gEY) this).R.R()) {
            ((gEY) this).f3695R = true;
            Z().R = null;
            while (!n3x.v(this.f2693R.peek(), (mkC) R.getValue())) {
                this.f2693R.pop();
            }
            this.f2693R.push(mkc);
            ((gEY) this).R.v();
            Z().R = this;
            this.f2692R = new gcA(1, this);
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    @Override // defpackage.gEY
    public final h9X L(RecyclerView recyclerView, int i) {
        LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
        View inflate = from.inflate(i != -100 ? i != -4 ? i != -3 ? i != -2 ? R.layout.map_preference : R.layout.map_preference_category : R.layout.map_accent_button_preference : R.layout.map_image_preference : R.layout.map_preference_switch_bar, (ViewGroup) recyclerView, false);
        inflate.setStateListAnimator(null);
        if (i > 0) {
            from.inflate(i, (ViewGroup) inflate.findViewById(R.id.map_widget_frame), true);
        }
        return new kS8(inflate, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d3  */
    @Override // defpackage.gEY
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(defpackage.h9X r9, int r10) {
        /*
        // Method dump skipped, instructions count: 289
        */
        throw new UnsupportedOperationException("Method not decompiled: de.Maxr1998.modernpreferences.PreferencesAdapter.O(h9X, int):void");
    }

    @Override // defpackage.gEY
    public final int R() {
        return Z().f6146R.size();
    }

    @Override // defpackage.gEY
    public final void X(RecyclerView recyclerView) {
        m4i O;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            nu_ s = aH9.s(recyclerView);
            if (s != null && (O = s.O()) != null) {
                O.R(this);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("ModernAndroidPreferences requires a LinearLayoutManager");
    }

    public final mkC Z() {
        return (mkC) this.f2693R.peek();
    }

    @Override // defpackage.gEY
    public final int c(int i) {
        ((e1q) Z().f6146R.get(i)).getClass();
        return -1;
    }

    @Override // defpackage.k3P
    public final void e(nu_ nu_, alX alx) {
        Iterator it = Z().f6147v.iterator();
        while (it.hasNext()) {
            ((k3P) it.next()).e(nu_, alx);
        }
    }

    @Override // defpackage.gEY
    public final long v(int i) {
        return (long) ((e1q) Z().f6146R.get(i)).hashCode();
    }
}
