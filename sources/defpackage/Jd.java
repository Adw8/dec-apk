package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: Jd  reason: default package */
/* loaded from: classes.dex */
public final class Jd {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f205R;
    public Object X;
    public Object c;
    public Object e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public final Object f206v;

    public Jd(View view) {
        this.R = 0;
        this.v = -1;
        this.f205R = view;
        this.f206v = pp.R();
    }

    public static Jd v(Context context, int i) {
        gvP.x("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, hDC.K);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList m = lTs.m(context, obtainStyledAttributes, 4);
        ColorStateList m2 = lTs.m(context, obtainStyledAttributes, 9);
        ColorStateList m3 = lTs.m(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        dOE doe = new dOE(dOE.R(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new SO((float) 0)));
        obtainStyledAttributes.recycle();
        return new Jd(m, m2, m3, dimensionPixelSize, doe, rect);
    }

    public final void H(TextView textView) {
        c18 c18 = new c18();
        c18 c182 = new c18();
        c18.setShapeAppearanceModel((dOE) this.X);
        c182.setShapeAppearanceModel((dOE) this.X);
        c18.C((ColorStateList) this.c);
        c18.f1920R.c = (float) this.v;
        c18.invalidateSelf();
        c18.g((ColorStateList) this.e);
        textView.setTextColor((ColorStateList) this.f206v);
        RippleDrawable rippleDrawable = new RippleDrawable(((ColorStateList) this.f206v).withAlpha(30), c18, c182);
        Rect rect = (Rect) this.f205R;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap weakHashMap = of5.f6887R;
        mHC.g(textView, insetDrawable);
    }

    public final void L(int i) {
        ColorStateList colorStateList;
        this.v = i;
        pp ppVar = (pp) this.f206v;
        if (ppVar != null) {
            Context context = ((View) this.f205R).getContext();
            synchronized (ppVar) {
                colorStateList = ppVar.f7286R.Z(context, i);
            }
        } else {
            colorStateList = null;
        }
        Z(colorStateList);
        R();
    }

    public final void O() {
        this.v = -1;
        Z(null);
        R();
    }

    public final void R() {
        Drawable background = ((View) this.f205R).getBackground();
        if (background != null) {
            boolean z = true;
            if (((epC) this.c) != null) {
                if (((epC) this.X) == null) {
                    this.X = new epC(0);
                }
                epC epc = (epC) this.X;
                epc.R = null;
                epc.f3213v = false;
                epc.v = null;
                epc.f3212R = false;
                WeakHashMap weakHashMap = of5.f6887R;
                ColorStateList L = m18.L((View) this.f205R);
                if (L != null) {
                    epc.f3213v = true;
                    epc.R = L;
                }
                PorterDuff.Mode Z = m18.Z((View) this.f205R);
                if (Z != null) {
                    epc.f3212R = true;
                    epc.v = Z;
                }
                if (epc.f3213v || epc.f3212R) {
                    pp.e(background, epc, ((View) this.f205R).getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            epC epc2 = (epC) this.e;
            if (epc2 != null) {
                pp.e(background, epc2, ((View) this.f205R).getDrawableState());
                return;
            }
            epC epc3 = (epC) this.c;
            if (epc3 != null) {
                pp.e(background, epc3, ((View) this.f205R).getDrawableState());
            }
        }
    }

    public final void X(AttributeSet attributeSet, int i) {
        ColorStateList Z;
        Context context = ((View) this.f205R).getContext();
        int[] iArr = iTI.I;
        CV h = CV.h(context, attributeSet, iArr, i, 0);
        View view = (View) this.f205R;
        Context context2 = view.getContext();
        TypedArray typedArray = (TypedArray) h.v;
        WeakHashMap weakHashMap = of5.f6887R;
        hpL.c(view, context2, iArr, attributeSet, typedArray, i, 0);
        try {
            if (h.o(0)) {
                this.v = h.y(0, -1);
                pp ppVar = (pp) this.f206v;
                Context context3 = ((View) this.f205R).getContext();
                int i2 = this.v;
                synchronized (ppVar) {
                    Z = ppVar.f7286R.Z(context3, i2);
                }
                if (Z != null) {
                    Z(Z);
                }
            }
            if (h.o(1)) {
                m18.g((View) this.f205R, h.m(1));
            }
            if (h.o(2)) {
                m18.y((View) this.f205R, mTA.v(h.P(2, -1), null));
            }
        } finally {
            h.z();
        }
    }

    public final void Z(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((epC) this.c) == null) {
                this.c = new epC(0);
            }
            epC epc = (epC) this.c;
            epc.R = colorStateList;
            epc.f3213v = true;
        } else {
            this.c = null;
        }
        R();
    }

    public final ColorStateList c() {
        Object obj = this.e;
        if (((epC) obj) != null) {
            return (ColorStateList) ((epC) obj).R;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        Object obj = this.e;
        if (((epC) obj) != null) {
            return (PorterDuff.Mode) ((epC) obj).v;
        }
        return null;
    }

    public final void m(ColorStateList colorStateList) {
        if (((epC) this.e) == null) {
            this.e = new epC(0);
        }
        epC epc = (epC) this.e;
        epc.R = colorStateList;
        epc.f3213v = true;
        R();
    }

    public final String toString() {
        switch (this.R) {
            case 1:
                StringBuilder sb = new StringBuilder();
                StringBuilder U = opT.U("FontRequest {mProviderAuthority: ");
                U.append((String) this.f205R);
                U.append(", mProviderPackage: ");
                U.append((String) this.f206v);
                U.append(", mQuery: ");
                U.append((String) this.c);
                U.append(", mCertificates:");
                sb.append(U.toString());
                for (int i = 0; i < ((List) this.e).size(); i++) {
                    sb.append(" [");
                    List list = (List) ((List) this.e).get(i);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.v);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final void x(PorterDuff.Mode mode) {
        if (((epC) this.e) == null) {
            this.e = new epC(0);
        }
        epC epc = (epC) this.e;
        epc.v = mode;
        epc.f3212R = true;
        R();
    }

    public Jd(String str, String str2, String str3, List list) {
        this.R = 1;
        str.getClass();
        this.f205R = str;
        str2.getClass();
        this.f206v = str2;
        this.c = str3;
        list.getClass();
        this.e = list;
        this.v = 0;
        this.X = str + "-" + str2 + "-" + str3;
    }

    public Jd(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, dOE doe, Rect rect) {
        this.R = 2;
        gvP.H(rect.left);
        gvP.H(rect.top);
        gvP.H(rect.right);
        gvP.H(rect.bottom);
        this.f205R = rect;
        this.f206v = colorStateList2;
        this.c = colorStateList;
        this.e = colorStateList3;
        this.v = i;
        this.X = doe;
    }
}
