package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* renamed from: _3  reason: default package */
/* loaded from: classes.dex */
public final class _3 extends k8G implements f_c {
    public final /* synthetic */ Context R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ e9w f673R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ eGS f674R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hYA f675R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f676R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f677R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lh8 f678R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public _3(Context context, ngM ngm, lh8 lh8, kg9 kg9, e9w e9w, String str, eGS egs) {
        super(0);
        this.R = context;
        this.f675R = ngm;
        this.f678R = lh8;
        this.f677R = kg9;
        this.f673R = e9w;
        this.f676R = str;
        this.f674R = egs;
    }

    @Override // defpackage.f_c
    public final Object g() {
        View typedView$ui_release;
        gJ8 gj8 = new gJ8(this.R, this.f675R, this.f678R);
        gj8.setFactory(this.f677R);
        e9w e9w = this.f673R;
        SparseArray<Parcelable> sparseArray = null;
        Object X = e9w != null ? e9w.X(this.f676R) : null;
        if (X instanceof SparseArray) {
            sparseArray = (SparseArray) X;
        }
        if (!(sparseArray == null || (typedView$ui_release = gj8.getTypedView$ui_release()) == null)) {
            typedView$ui_release.restoreHierarchyState(sparseArray);
        }
        this.f674R.R = gj8;
        return gj8.getLayoutNode();
    }
}
