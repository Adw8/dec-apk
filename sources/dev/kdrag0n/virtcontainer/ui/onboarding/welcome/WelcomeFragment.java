package dev.kdrag0n.virtcontainer.ui.onboarding.welcome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import dev.kdrag0n.virtcontainer.R;

/* loaded from: classes.dex */
public final class WelcomeFragment extends bqi {
    public iKP R;

    /* renamed from: R  reason: collision with other field name */
    public oLT f2765R;

    /* renamed from: R  reason: collision with other field name */
    public final pr9 f2766R = new pr9(g8d.R(jke.class), new csm(12, this), new csm(13, this), new pL(this, 4));

    public WelcomeFragment() {
        super(2);
    }

    @Override // defpackage.dl
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.content_onboarding_welcome, viewGroup, false);
        if (inflate != null) {
            return (ImageView) inflate;
        }
        throw new NullPointerException("rootView");
    }

    @Override // defpackage.dl, defpackage.pm2
    public final void W(View view, Bundle bundle) {
        super.W(view, bundle);
        mxC.i(this, new kc7(this, null));
    }
}
