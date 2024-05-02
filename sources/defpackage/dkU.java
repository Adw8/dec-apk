package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* renamed from: dkU  reason: default package */
/* loaded from: classes.dex */
public abstract class dkU extends ConstraintLayout {
    public c18 R;

    /* renamed from: R  reason: collision with other field name */
    public final mBn f2852R = new mBn(11, this);
    public int x;

    public dkU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        c18 c18 = new c18();
        this.R = c18;
        nFv nfv = new nFv(0.5f);
        dOE doe = c18.f1920R.f6907R;
        doe.getClass();
        nBP nbp = new nBP(doe);
        nbp.f6342R = nfv;
        nbp.f6348v = nfv;
        nbp.f6344c = nfv;
        nbp.f6346e = nfv;
        c18.setShapeAppearanceModel(new dOE(nbp));
        this.R.C(ColorStateList.valueOf(-1));
        c18 c182 = this.R;
        WeakHashMap weakHashMap = of5.f6887R;
        mHC.g(this, c182);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hDC.A, R.attr.materialClockStyle, 0);
        this.x = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void C() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        nsw nsw = new nsw();
        nsw.v(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.x;
                if (!nsw.f6616v.containsKey(Integer.valueOf(id))) {
                    nsw.f6616v.put(Integer.valueOf(id), new djn());
                }
                fay fay = ((djn) nsw.f6616v.get(Integer.valueOf(id))).f2847R;
                fay.i = R.id.circle_center;
                fay.V = i4;
                fay.e = f;
                f = (360.0f / ((float) (childCount - i))) + f;
            }
        }
        nsw.R(this);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = of5.f6887R;
            view.setId(eHQ.R());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f2852R);
            handler.post(this.f2852R);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        C();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f2852R);
            handler.post(this.f2852R);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.R.C(ColorStateList.valueOf(i));
    }
}
