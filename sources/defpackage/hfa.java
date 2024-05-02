package defpackage;

import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import dev.kdrag0n.virtcontainer.R;
import java.util.UUID;

/* renamed from: hfa  reason: default package */
/* loaded from: classes.dex */
public final class hfa extends bEF {
    public final View R;

    /* renamed from: R  reason: collision with other field name */
    public f_c f4340R;

    /* renamed from: R  reason: collision with other field name */
    public gRa f4341R;

    /* renamed from: R  reason: collision with other field name */
    public final nk3 f4342R;

    public hfa(f_c f_c, gRa gra, View view, mdz mdz, jJj jjj, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (int) R.style.DialogWindowTheme), 0);
        this.f4340R = f_c;
        this.f4341R = gra;
        this.R = view;
        float f = (float) 8;
        Window window = getWindow();
        if (window != null) {
            int i = window.getAttributes().softInputMode;
            window.requestFeature(1);
            window.setBackgroundDrawableResource(17170445);
            this.f4341R.getClass();
            hiu.R(window, true);
            nk3 nk3 = new nk3(getContext(), window);
            nk3.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
            nk3.setClipChildren(false);
            nk3.setElevation(jjj.mZ(f));
            nk3.setOutlineProvider(new kX7(2));
            this.f4342R = nk3;
            View decorView = window.getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                L(viewGroup);
            }
            setContentView(nk3);
            nk3.setTag(R.id.view_tree_lifecycle_owner, aH9.s(view));
            nk3.setTag(R.id.view_tree_view_model_store_owner, iTI.H(view));
            aH9.cr(nk3, aH9.T(view));
            Z(this.f4340R, this.f4341R, mdz);
            ((bEF) this).R.R(this, new hSO(new tt(this, 1), true));
            return;
        }
        throw new IllegalStateException("Dialog has no window".toString());
    }

    public static final void L(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof nk3)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                if (viewGroup2 != null) {
                    L(viewGroup2);
                }
            }
        }
    }

    public final void Z(f_c f_c, gRa gra, mdz mdz) {
        this.f4340R = f_c;
        this.f4341R = gra;
        axi axi = gra.R;
        View view = this.R;
        kPU kpu = Gm.R;
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 0;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int ordinal = axi.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z = true;
            } else if (ordinal == 2) {
                z = false;
            } else {
                throw new j8f((Object) null);
            }
        }
        getWindow().setFlags(z ? 8192 : -8193, 8192);
        nk3 nk3 = this.f4342R;
        int ordinal2 = mdz.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                i = 1;
            } else {
                throw new j8f((Object) null);
            }
        }
        nk3.setLayoutDirection(i);
        this.f4342R.c = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.f4341R.v) {
            this.f4340R.g();
        }
        return onTouchEvent;
    }
}
