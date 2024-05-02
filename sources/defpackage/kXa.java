package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* renamed from: kXa  reason: default package */
/* loaded from: classes.dex */
public final class kXa extends ArrayAdapter {
    public ColorStateList R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h6c f5331R;
    public ColorStateList v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kXa(h6c h6c, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f5331R = h6c;
        R();
    }

    public final void R() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f5331R.f4058R;
        ColorStateList colorStateList3 = null;
        if (!(colorStateList2 != null)) {
            colorStateList = null;
        } else {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.v = colorStateList;
        h6c h6c = this.f5331R;
        if (h6c.X != 0) {
            ColorStateList colorStateList4 = h6c.f4058R;
            if (colorStateList4 != null) {
                int[] iArr2 = {16843623, -16842919};
                int[] iArr3 = {16842913, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{B7.v(colorStateList4.getColorForState(iArr3, 0), this.f5331R.X), B7.v(this.f5331R.f4058R.getColorForState(iArr2, 0), this.f5331R.X), this.f5331R.X});
            }
        }
        this.R = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            Drawable drawable = null;
            if (this.f5331R.getText().toString().contentEquals(textView.getText())) {
                if (this.f5331R.X != 0) {
                    Drawable colorDrawable = new ColorDrawable(this.f5331R.X);
                    if (this.v != null) {
                        cAO.Z(colorDrawable, this.R);
                        drawable = new RippleDrawable(this.v, colorDrawable, null);
                    } else {
                        drawable = colorDrawable;
                    }
                }
            }
            WeakHashMap weakHashMap = of5.f6887R;
            mHC.g(textView, drawable);
        }
        return view2;
    }
}
