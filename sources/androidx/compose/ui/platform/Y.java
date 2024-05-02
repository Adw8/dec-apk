package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import dev.kdrag0n.virtcontainer.R;
import java.util.Set;

/* loaded from: classes.dex */
public final class Y extends k8G implements iv7 {
    public final /* synthetic */ WrappedComposition R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f1249R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(WrappedComposition wrappedComposition, iv7 iv7, int i) {
        super(2);
        this.X = i;
        this.R = wrappedComposition;
        this.f1249R = iv7;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                ur.R(this.R.f1245R, this.f1249R, m88, 8);
                return;
            default:
                if ((i & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                Object tag = this.R.f1245R.getTag(R.id.inspection_slot_table_set);
                Set set = (tag instanceof Set) && (!(tag instanceof dsi) || (tag instanceof j7G)) ? (Set) tag : null;
                if (set == null) {
                    ViewParent parent = this.R.f1245R.getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                    set = (tag2 instanceof Set) && (!(tag2 instanceof dsi) || (tag2 instanceof j7G)) ? (Set) tag2 : null;
                }
                if (set != null) {
                    jr_ jr_3 = (jr_) m88;
                    set.add(jr_3.f5066R);
                    jr_3.f5067R = true;
                }
                WrappedComposition wrappedComposition = this.R;
                caw.e(wrappedComposition.f1245R, new d(wrappedComposition, null), m88);
                WrappedComposition wrappedComposition2 = this.R;
                caw.e(wrappedComposition2.f1245R, new c(wrappedComposition2, null), m88);
                l6.R(new bkv[]{ntS.R.v(set)}, aH9.I(m88, -1193460702, new Y(this.R, this.f1249R, 0)), m88, 56);
                return;
        }
    }
}
