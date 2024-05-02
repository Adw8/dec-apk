package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Y;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: jcp  reason: default package */
/* loaded from: classes.dex */
public class jcp extends pm2 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: R  reason: collision with other field name */
    public Dialog f4978R;

    /* renamed from: R  reason: collision with other field name */
    public Handler f4979R;
    public boolean V;
    public boolean i;
    public boolean o;
    public boolean t;

    /* renamed from: R  reason: collision with other field name */
    public kvW f4982R = new kvW(1, this);

    /* renamed from: R  reason: collision with other field name */
    public at9 f4980R = new at9(this);

    /* renamed from: R  reason: collision with other field name */
    public hoW f4981R = new hoW(this);
    public int m = 0;
    public int x = 0;
    public boolean g = true;
    public boolean y = true;
    public int H = -1;
    public Zz R = new Zz(this);
    public boolean K = false;

    @Override // defpackage.pm2
    public void A(Bundle bundle) {
        Dialog dialog = this.f4978R;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.m;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.x;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.g;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.y;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.H;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public Dialog E() {
        if (hAW.W(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new bEF(k(), this.x);
    }

    @Override // defpackage.pm2
    public final void I() {
        this.U = true;
        if (!this.o && !this.V) {
            this.V = true;
        }
        Y y = ((pm2) this).f7230R;
        Zz zz = this.R;
        y.getClass();
        Y.R("removeObserver");
        obI obi = (obI) y.f1335R.v(zz);
        if (obi != null) {
            obi.v();
            obi.R(false);
        }
    }

    @Override // defpackage.pm2
    public void K(Bundle bundle) {
        super.K(bundle);
        this.f4979R = new Handler();
        this.y = ((pm2) this).Z == 0;
        if (bundle != null) {
            this.m = bundle.getInt("android:style", 0);
            this.x = bundle.getInt("android:theme", 0);
            this.g = bundle.getBoolean("android:cancelable", true);
            this.y = bundle.getBoolean("android:showsDialog", this.y);
            this.H = bundle.getInt("android:backStackId", -1);
        }
    }

    public final void M(boolean z, boolean z2) {
        if (!this.V) {
            this.V = true;
            this.o = false;
            Dialog dialog = this.f4978R;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.f4978R.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f4979R.getLooper()) {
                        onDismiss(this.f4978R);
                    } else {
                        this.f4979R.post(this.f4982R);
                    }
                }
            }
            this.i = true;
            if (this.H >= 0) {
                hAW C = C();
                int i = this.H;
                if (i >= 0) {
                    C.o(new oyF(C, null, i), z);
                    this.H = -1;
                    return;
                }
                throw new IllegalArgumentException(opT.Z("Bad id: ", i));
            }
            KP kp = new KP(C());
            kp.f255c = true;
            hAW haw = ((pm2) this).f7234R;
            if (haw == null || haw == kp.f248R) {
                kp.v(new dJb(3, this));
                if (z) {
                    kp.e(true);
                } else {
                    kp.e(false);
                }
            } else {
                StringBuilder U = opT.U("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
                U.append(toString());
                U.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(U.toString());
            }
        }
    }

    @Override // defpackage.pm2
    public void S() {
        this.U = true;
        Dialog dialog = this.f4978R;
        if (dialog != null) {
            this.i = false;
            dialog.show();
            View decorView = this.f4978R.getWindow().getDecorView();
            aH9.vr(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            aH9.cr(decorView, this);
        }
    }

    @Override // defpackage.pm2
    public final void T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.T(layoutInflater, viewGroup, bundle);
        if (((pm2) this).f7228R == null && this.f4978R != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f4978R.onRestoreInstanceState(bundle2);
        }
    }

    @Override // defpackage.pm2
    public void d() {
        this.U = true;
        Dialog dialog = this.f4978R;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final Dialog f() {
        Dialog dialog = this.f4978R;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // defpackage.pm2
    public final void h() {
        this.U = true;
        Dialog dialog = this.f4978R;
        if (dialog != null) {
            this.i = true;
            dialog.setOnDismissListener(null);
            this.f4978R.dismiss();
            if (!this.V) {
                onDismiss(this.f4978R);
            }
            this.f4978R = null;
            this.K = false;
        }
    }

    @Override // defpackage.pm2
    public final void o(Context context) {
        super.o(context);
        ((pm2) this).f7230R.e(this.R);
        if (!this.o) {
            this.V = false;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.i) {
            if (hAW.W(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            M(true, true);
        }
    }

    @Override // defpackage.pm2
    public final void s(Bundle bundle) {
        Bundle bundle2;
        this.U = true;
        if (this.f4978R != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f4978R.onRestoreInstanceState(bundle2);
        }
    }

    @Override // defpackage.pm2
    public final void t() {
        this.U = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x0030, B:20:0x0036, B:21:0x003b, B:22:0x003e, B:24:0x0046, B:25:0x004d, B:26:0x0065), top: B:45:0x001a }] */
    @Override // defpackage.pm2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.LayoutInflater u(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.u(r8)
            boolean r0 = r7.y
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L_0x009b
            boolean r3 = r7.t
            if (r3 == 0) goto L_0x0011
            goto L_0x009b
        L_0x0011:
            if (r0 != 0) goto L_0x0014
            goto L_0x006f
        L_0x0014:
            boolean r0 = r7.K
            if (r0 != 0) goto L_0x006f
            r0 = 0
            r3 = 1
            r7.t = r3     // Catch: all -> 0x006b
            android.app.Dialog r4 = r7.E()     // Catch: all -> 0x006b
            r7.f4978R = r4     // Catch: all -> 0x006b
            boolean r5 = r7.y     // Catch: all -> 0x006b
            if (r5 == 0) goto L_0x0065
            int r5 = r7.m     // Catch: all -> 0x006b
            if (r5 == r3) goto L_0x003b
            if (r5 == r2) goto L_0x003b
            r6 = 3
            if (r5 == r6) goto L_0x0030
            goto L_0x003e
        L_0x0030:
            android.view.Window r5 = r4.getWindow()     // Catch: all -> 0x006b
            if (r5 == 0) goto L_0x003b
            r6 = 24
            r5.addFlags(r6)     // Catch: all -> 0x006b
        L_0x003b:
            r4.requestWindowFeature(r3)     // Catch: all -> 0x006b
        L_0x003e:
            android.content.Context r4 = r7.H()     // Catch: all -> 0x006b
            boolean r5 = r4 instanceof android.app.Activity     // Catch: all -> 0x006b
            if (r5 == 0) goto L_0x004d
            android.app.Dialog r5 = r7.f4978R     // Catch: all -> 0x006b
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: all -> 0x006b
            r5.setOwnerActivity(r4)     // Catch: all -> 0x006b
        L_0x004d:
            android.app.Dialog r4 = r7.f4978R     // Catch: all -> 0x006b
            boolean r5 = r7.g     // Catch: all -> 0x006b
            r4.setCancelable(r5)     // Catch: all -> 0x006b
            android.app.Dialog r4 = r7.f4978R     // Catch: all -> 0x006b
            at9 r5 = r7.f4980R     // Catch: all -> 0x006b
            r4.setOnCancelListener(r5)     // Catch: all -> 0x006b
            android.app.Dialog r4 = r7.f4978R     // Catch: all -> 0x006b
            hoW r5 = r7.f4981R     // Catch: all -> 0x006b
            r4.setOnDismissListener(r5)     // Catch: all -> 0x006b
            r7.K = r3     // Catch: all -> 0x006b
            goto L_0x0068
        L_0x0065:
            r3 = 0
            r7.f4978R = r3     // Catch: all -> 0x006b
        L_0x0068:
            r7.t = r0
            goto L_0x006f
        L_0x006b:
            r8 = move-exception
            r7.t = r0
            throw r8
        L_0x006f:
            boolean r0 = defpackage.hAW.W(r2)
            if (r0 == 0) goto L_0x008e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L_0x008e:
            android.app.Dialog r7 = r7.f4978R
            if (r7 == 0) goto L_0x009a
            android.content.Context r7 = r7.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r7)
        L_0x009a:
            return r8
        L_0x009b:
            boolean r0 = defpackage.hAW.W(r2)
            if (r0 == 0) goto L_0x00df
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r7 = r7.y
            if (r7 != 0) goto L_0x00cb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "mShowsDialog = false: "
            r7.append(r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r1, r7)
            goto L_0x00df
        L_0x00cb:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "mCreatingDialog = true: "
            r7.append(r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r1, r7)
        L_0x00df:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jcp.u(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // defpackage.pm2
    public final pdD v() {
        return new kDR(this, new dYS(this));
    }
}
