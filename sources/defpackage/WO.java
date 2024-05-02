package defpackage;

import android.widget.Button;
import android.widget.TextView;

/* renamed from: WO  reason: default package */
/* loaded from: classes.dex */
public final class WO {
    public final /* synthetic */ iG9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ rB f606R;

    public WO(iG9 ig9, rB rBVar) {
        this.R = ig9;
        this.f606R = rBVar;
    }

    public final void R(e9E e9e) {
        int i = 8;
        rt rtVar = null;
        if (e9e.e == this.R.v) {
            rB rBVar = this.f606R;
            rBVar.O = false;
            rt rtVar2 = rBVar.f7383R;
            if (rtVar2 == null) {
                rtVar2 = null;
            }
            rtVar2.R.setVisibility(4);
            rt rtVar3 = this.f606R.f7383R;
            if (rtVar3 == null) {
                rtVar3 = null;
            }
            TextView textView = rtVar3.f7399R;
            if (this.R.f4520R) {
                i = 0;
            }
            textView.setVisibility(i);
        } else {
            rB rBVar2 = this.f606R;
            rBVar2.O = true;
            rt rtVar4 = rBVar2.f7383R;
            if (rtVar4 == null) {
                rtVar4 = null;
            }
            rtVar4.R.setVisibility(0);
            rt rtVar5 = this.f606R.f7383R;
            if (rtVar5 == null) {
                rtVar5 = null;
            }
            rtVar5.f7399R.setVisibility(8);
        }
        rB rBVar3 = this.f606R;
        rt rtVar6 = rBVar3.f7383R;
        if (rtVar6 != null) {
            rtVar = rtVar6;
        }
        Button button = rtVar.v;
        button.setText(((Number) this.R.f4519R.x(Integer.valueOf(e9e.e))).intValue());
        if (e9e.e != -1) {
            button.setOnClickListener(new wV(rBVar3, 1));
        } else {
            button.setOnClickListener(new wV(rBVar3, 2));
        }
    }
}
