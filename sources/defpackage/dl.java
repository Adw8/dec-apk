package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: dl  reason: default package */
/* loaded from: classes.dex */
public abstract class dl extends Ms {
    public ntZ R;
    public final int x = 0;

    public View E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = this.x;
        if (i == 0) {
            return null;
        }
        return layoutInflater.inflate(i, viewGroup, false);
    }

    @Override // defpackage.Ms, defpackage.pm2
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.onboarding_fragment, viewGroup, false);
        int i = R.id.content_frame;
        NestedScrollView nestedScrollView = (NestedScrollView) iTI.O(inflate, R.id.content_frame);
        if (nestedScrollView != null) {
            i = R.id.header_text;
            TextView textView = (TextView) iTI.O(inflate, R.id.header_text);
            if (textView != null) {
                this.R = new ntZ((LinearLayout) inflate, nestedScrollView, textView, 1);
                ((NestedScrollView) this.R.v).addView(E(layoutInflater, nestedScrollView));
                return (LinearLayout) this.R.f6625R;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.Ms
    public final void M() {
    }

    @Override // defpackage.pm2
    public void W(View view, Bundle bundle) {
        ((TextView) this.R.f6624R).setText(iTI.Z(this).O().f2985R);
    }

    @Override // defpackage.pm2
    public final void h() {
        this.U = true;
        this.R = null;
    }
}
