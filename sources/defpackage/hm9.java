package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: hm9  reason: default package */
/* loaded from: classes.dex */
public abstract class hm9 extends d implements By, B1 {
    public static final /* synthetic */ int e = 0;

    /* renamed from: c  reason: collision with other field name */
    public boolean f4375c;

    /* renamed from: e  reason: collision with other field name */
    public boolean f4376e;
    public final Zz R = new Zz(new eAj((pJ) this));
    public final m4i c = new m4i(this);
    public boolean X = true;

    public hm9() {
        ((d) this).f1015R.f4264R.c("android:support:lifecycle", new fy7(1, this));
        ((d) this).f1016R.add(new mgE(0, this));
        ((d) this).c.add(new mgE(1, this));
        C(new mGt(this, 1));
    }

    public static boolean t(hAW haw) {
        iMP imp = iMP.CREATED;
        iMP imp2 = iMP.STARTED;
        boolean z = false;
        for (pm2 pm2 : haw.f4127R.j()) {
            if (pm2 != null) {
                eAj eaj = pm2.f7232R;
                if ((eaj == null ? null : eaj.f3007R) != null) {
                    z |= t(pm2.m());
                }
                kGM kgm = pm2.f7241R;
                if (kgm != null) {
                    kgm.v();
                    if (kgm.f5229R.f5900R.R(imp2)) {
                        pm2.f7241R.f5229R.L(imp);
                        z = true;
                    }
                }
                if (pm2.f7242R.f5900R.R(imp2)) {
                    pm2.f7242R.L(imp);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        boolean z = false;
        if (strArr != null && strArr.length > 0) {
            String str2 = strArr[0];
            str2.getClass();
            char c = 65535;
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation")) {
                        c = 0;
                        break;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        c = 1;
                        break;
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    z = true;
                    break;
            }
        }
        if (!z) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str3 = str + "  ";
            printWriter.print(str3);
            printWriter.print("mCreated=");
            printWriter.print(this.f4375c);
            printWriter.print(" mResumed=");
            printWriter.print(this.f4376e);
            printWriter.print(" mStopped=");
            printWriter.print(this.X);
            if (getApplication() != null) {
                new ebj(this, e()).S(str3, printWriter);
            }
            ((eAj) this.R.R).f3006R.V(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.activity.d, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.R.H();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.d, defpackage.cMB, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c.X(alX.ON_CREATE);
        hAW haw = ((eAj) this.R.R).f3006R;
        haw.f4133c = false;
        haw.f4135e = false;
        haw.f4124R.f6474e = false;
        haw.i(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((eAj) this.R.R).f3006R.f4125R.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((eAj) this.R.R).f3006R.H();
        this.c.X(alX.ON_DESTROY);
    }

    @Override // androidx.activity.d, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((eAj) this.R.R).f3006R.m();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f4376e = false;
        ((eAj) this.R.R).f3006R.i(5);
        this.c.X(alX.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.c.X(alX.ON_RESUME);
        hAW haw = ((eAj) this.R.R).f3006R;
        haw.f4133c = false;
        haw.f4135e = false;
        haw.f4124R.f6474e = false;
        haw.i(7);
    }

    @Override // androidx.activity.d, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.R.H();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.R.H();
        super.onResume();
        this.f4376e = true;
        ((eAj) this.R.R).f3006R.J(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.R.H();
        super.onStart();
        this.X = false;
        if (!this.f4375c) {
            this.f4375c = true;
            hAW haw = ((eAj) this.R.R).f3006R;
            haw.f4133c = false;
            haw.f4135e = false;
            haw.f4124R.f6474e = false;
            haw.i(4);
        }
        ((eAj) this.R.R).f3006R.J(true);
        this.c.X(alX.ON_START);
        hAW haw2 = ((eAj) this.R.R).f3006R;
        haw2.f4133c = false;
        haw2.f4135e = false;
        haw2.f4124R.f6474e = false;
        haw2.i(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.R.H();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.X = true;
        do {
        } while (t(((eAj) this.R.R).f3006R));
        hAW haw = ((eAj) this.R.R).f3006R;
        haw.f4135e = true;
        haw.f4124R.f6474e = true;
        haw.i(4);
        this.c.X(alX.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((eAj) this.R.R).f3006R.f4125R.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
