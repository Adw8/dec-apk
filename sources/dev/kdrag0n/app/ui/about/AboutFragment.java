package dev.kdrag0n.app.ui.about;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import dev.kdrag0n.app.ui.about.AboutFragment;
import dev.kdrag0n.virtcontainer.R;

/* loaded from: classes.dex */
public final class AboutFragment extends eA9 {
    public static final /* synthetic */ int U = 0;
    public F4 R;

    /* renamed from: R  reason: collision with other field name */
    public kI2 f2716R;

    public AboutFragment() {
        super(0);
    }

    @Override // defpackage.gE
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.content_about, viewGroup, false);
        int i = R.id.app_description;
        TextView textView = (TextView) iTI.O(inflate, R.id.app_description);
        if (textView != null) {
            i = R.id.contact_button;
            Button button = (Button) iTI.O(inflate, R.id.contact_button);
            if (button != null) {
                i = R.id.legal_button;
                Button button2 = (Button) iTI.O(inflate, R.id.legal_button);
                if (button2 != null) {
                    i = R.id.licenses_button;
                    Button button3 = (Button) iTI.O(inflate, R.id.licenses_button);
                    if (button3 != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                        i = R.id.support_button;
                        Button button4 = (Button) iTI.O(inflate, R.id.support_button);
                        if (button4 != null) {
                            i = R.id.version_text;
                            TextView textView2 = (TextView) iTI.O(inflate, R.id.version_text);
                            if (textView2 != null) {
                                i = R.id.website_button;
                                Button button5 = (Button) iTI.O(inflate, R.id.website_button);
                                if (button5 != null) {
                                    this.f2716R = new kI2(nestedScrollView, textView, button, button2, button3, button4, textView2, button5);
                                    return nestedScrollView;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.gE, defpackage.pm2
    public final void W(View view, Bundle bundle) {
        super.W(view, bundle);
        this.f2716R.X.setOnClickListener(new View.OnClickListener(this, 0) { // from class: Bf
            public final /* synthetic */ AboutFragment R;
            public final /* synthetic */ int e;

            {
                this.e = r2;
                this.R = r1;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                F4 f4 = null;
                switch (this.e) {
                    case 0:
                        AboutFragment aboutFragment = this.R;
                        int i = AboutFragment.U;
                        mxC.J(aboutFragment.k(), "https://kdrag0n.dev/");
                        return;
                    case 1:
                        AboutFragment aboutFragment2 = this.R;
                        int i2 = AboutFragment.U;
                        mxC.J(aboutFragment2.k(), "mailto:apps+repainter@kdrag0n.dev");
                        return;
                    case 2:
                        F4 f42 = this.R.R;
                        if (f42 != null) {
                            f4 = f42;
                        }
                        f4.getClass();
                        return;
                    case 3:
                        AboutFragment aboutFragment3 = this.R;
                        int i3 = AboutFragment.U;
                        mxC.J(aboutFragment3.k(), aboutFragment3.k().getResources().getString(R.string.about_url_legal));
                        return;
                    default:
                        AboutFragment aboutFragment4 = this.R;
                        int i4 = AboutFragment.U;
                        iTI.Z(aboutFragment4).H(R.id.action_about_to_licenses, null, null);
                        return;
                }
            }
        });
        this.f2716R.R.setOnClickListener(new View.OnClickListener(this, 1) { // from class: Bf
            public final /* synthetic */ AboutFragment R;
            public final /* synthetic */ int e;

            {
                this.e = r2;
                this.R = r1;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                F4 f4 = null;
                switch (this.e) {
                    case 0:
                        AboutFragment aboutFragment = this.R;
                        int i = AboutFragment.U;
                        mxC.J(aboutFragment.k(), "https://kdrag0n.dev/");
                        return;
                    case 1:
                        AboutFragment aboutFragment2 = this.R;
                        int i2 = AboutFragment.U;
                        mxC.J(aboutFragment2.k(), "mailto:apps+repainter@kdrag0n.dev");
                        return;
                    case 2:
                        F4 f42 = this.R.R;
                        if (f42 != null) {
                            f4 = f42;
                        }
                        f4.getClass();
                        return;
                    case 3:
                        AboutFragment aboutFragment3 = this.R;
                        int i3 = AboutFragment.U;
                        mxC.J(aboutFragment3.k(), aboutFragment3.k().getResources().getString(R.string.about_url_legal));
                        return;
                    default:
                        AboutFragment aboutFragment4 = this.R;
                        int i4 = AboutFragment.U;
                        iTI.Z(aboutFragment4).H(R.id.action_about_to_licenses, null, null);
                        return;
                }
            }
        });
        this.f2716R.e.setOnClickListener(new View.OnClickListener(this, 2) { // from class: Bf
            public final /* synthetic */ AboutFragment R;
            public final /* synthetic */ int e;

            {
                this.e = r2;
                this.R = r1;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                F4 f4 = null;
                switch (this.e) {
                    case 0:
                        AboutFragment aboutFragment = this.R;
                        int i = AboutFragment.U;
                        mxC.J(aboutFragment.k(), "https://kdrag0n.dev/");
                        return;
                    case 1:
                        AboutFragment aboutFragment2 = this.R;
                        int i2 = AboutFragment.U;
                        mxC.J(aboutFragment2.k(), "mailto:apps+repainter@kdrag0n.dev");
                        return;
                    case 2:
                        F4 f42 = this.R.R;
                        if (f42 != null) {
                            f4 = f42;
                        }
                        f4.getClass();
                        return;
                    case 3:
                        AboutFragment aboutFragment3 = this.R;
                        int i3 = AboutFragment.U;
                        mxC.J(aboutFragment3.k(), aboutFragment3.k().getResources().getString(R.string.about_url_legal));
                        return;
                    default:
                        AboutFragment aboutFragment4 = this.R;
                        int i4 = AboutFragment.U;
                        iTI.Z(aboutFragment4).H(R.id.action_about_to_licenses, null, null);
                        return;
                }
            }
        });
        this.f2716R.v.setOnClickListener(new View.OnClickListener(this, 3) { // from class: Bf
            public final /* synthetic */ AboutFragment R;
            public final /* synthetic */ int e;

            {
                this.e = r2;
                this.R = r1;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                F4 f4 = null;
                switch (this.e) {
                    case 0:
                        AboutFragment aboutFragment = this.R;
                        int i = AboutFragment.U;
                        mxC.J(aboutFragment.k(), "https://kdrag0n.dev/");
                        return;
                    case 1:
                        AboutFragment aboutFragment2 = this.R;
                        int i2 = AboutFragment.U;
                        mxC.J(aboutFragment2.k(), "mailto:apps+repainter@kdrag0n.dev");
                        return;
                    case 2:
                        F4 f42 = this.R.R;
                        if (f42 != null) {
                            f4 = f42;
                        }
                        f4.getClass();
                        return;
                    case 3:
                        AboutFragment aboutFragment3 = this.R;
                        int i3 = AboutFragment.U;
                        mxC.J(aboutFragment3.k(), aboutFragment3.k().getResources().getString(R.string.about_url_legal));
                        return;
                    default:
                        AboutFragment aboutFragment4 = this.R;
                        int i4 = AboutFragment.U;
                        iTI.Z(aboutFragment4).H(R.id.action_about_to_licenses, null, null);
                        return;
                }
            }
        });
        this.f2716R.c.setOnClickListener(new View.OnClickListener(this, 4) { // from class: Bf
            public final /* synthetic */ AboutFragment R;
            public final /* synthetic */ int e;

            {
                this.e = r2;
                this.R = r1;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                F4 f4 = null;
                switch (this.e) {
                    case 0:
                        AboutFragment aboutFragment = this.R;
                        int i = AboutFragment.U;
                        mxC.J(aboutFragment.k(), "https://kdrag0n.dev/");
                        return;
                    case 1:
                        AboutFragment aboutFragment2 = this.R;
                        int i2 = AboutFragment.U;
                        mxC.J(aboutFragment2.k(), "mailto:apps+repainter@kdrag0n.dev");
                        return;
                    case 2:
                        F4 f42 = this.R.R;
                        if (f42 != null) {
                            f4 = f42;
                        }
                        f4.getClass();
                        return;
                    case 3:
                        AboutFragment aboutFragment3 = this.R;
                        int i3 = AboutFragment.U;
                        mxC.J(aboutFragment3.k(), aboutFragment3.k().getResources().getString(R.string.about_url_legal));
                        return;
                    default:
                        AboutFragment aboutFragment4 = this.R;
                        int i4 = AboutFragment.U;
                        iTI.Z(aboutFragment4).H(R.id.action_about_to_licenses, null, null);
                        return;
                }
            }
        });
        PackageInfo packageInfo = k().getPackageManager().getPackageInfo(k().getPackageName(), 0);
        TextView textView = this.f2716R.f5248v;
        Object[] objArr = new Object[2];
        objArr[0] = packageInfo.versionName;
        objArr[1] = Long.valueOf(Y5.c ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode);
        textView.setText(k().getResources().getString(R.string.about_app_version, objArr));
        cpc.i(this.f2716R.f5247R, R.string.about_app_description, new String[0]);
    }
}
