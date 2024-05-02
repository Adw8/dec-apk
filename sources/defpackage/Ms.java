package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Ms  reason: default package */
/* loaded from: classes.dex */
public abstract class Ms extends pm2 {
    public final int m;

    public Ms(int i) {
        this.m = i;
    }

    @Override // defpackage.pm2
    public View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.m;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    @Override // defpackage.pm2
    public final void K(Bundle bundle) {
        super.K(bundle);
        M();
        vd.x(0, this);
    }

    public void M() {
    }

    public Ms() {
        this(0);
    }
}
