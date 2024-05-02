package defpackage;

import android.content.Context;
import android.content.Intent;
import dev.kdrag0n.virtcontainer.ui.onboarding.OnboardingActivity;
import dev.kdrag0n.virtcontainer.ui.settings.debug.DebugSettingsFragment;

/* renamed from: l7h  reason: default package */
/* loaded from: classes.dex */
public final class l7h implements h2V {
    public final /* synthetic */ DebugSettingsFragment R;
    public final /* synthetic */ int e;

    public /* synthetic */ l7h(DebugSettingsFragment debugSettingsFragment, int i) {
        this.e = i;
        this.R = debugSettingsFragment;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        switch (this.e) {
            case 0:
                Context k = this.R.k();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", (String) obj);
                intent.setType("text/plain");
                k.startActivity(Intent.createChooser(intent, null));
                break;
            case 1:
                o8s o8s = (o8s) obj;
                this.R.l(new Intent(this.R.k(), OnboardingActivity.class));
                this.R.r().finish();
                break;
            default:
                ((kg9) obj).x((pJ) this.R.r());
                break;
        }
        return o8s.R;
    }
}
