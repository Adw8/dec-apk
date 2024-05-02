package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: nYC  reason: default package */
/* loaded from: classes.dex */
public abstract class nYC extends View {
    public Context R;

    /* renamed from: R  reason: collision with other field name */
    public String f6427R;

    /* renamed from: R  reason: collision with other field name */
    public HashMap f6428R;

    /* renamed from: R  reason: collision with other field name */
    public xP f6429R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f6430R;
    public int e;
    public String v;

    public nYC(Context context) {
        super(context);
        this.f6430R = new int[32];
        this.f6428R = new HashMap();
        this.R = context;
        X(null);
    }

    public final void O() {
        if (this.f6429R != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof nki) {
                ((nki) layoutParams).f6544R = this.f6429R;
            }
        }
    }

    public final void R(String str) {
        HashMap hashMap;
        if (str != null && str.length() != 0 && this.R != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            ConstraintLayout constraintLayout2 = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            int i = 0;
            if (isInEditMode() && constraintLayout2 != null) {
                Object obj = (!(trim instanceof String) || (hashMap = constraintLayout2.f1252R) == null || !hashMap.containsKey(trim)) ? null : constraintLayout2.f1252R.get(trim);
                if (obj instanceof Integer) {
                    i = ((Integer) obj).intValue();
                }
            }
            if (i == 0 && constraintLayout2 != null) {
                i = e(constraintLayout2, trim);
            }
            if (i == 0) {
                try {
                    i = n1P.class.getField(trim).getInt(null);
                } catch (Exception unused) {
                }
            }
            if (i == 0) {
                i = this.R.getResources().getIdentifier(trim, "id", this.R.getPackageName());
            }
            if (i != 0) {
                this.f6428R.put(Integer.valueOf(i), trim);
                v(i);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public abstract void X(AttributeSet attributeSet);

    public final void c(String str) {
        if (!(str == null || str.length() == 0 || this.R == null)) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof nki) && trim.equals(((nki) layoutParams).f6556v)) {
                    if (childAt.getId() == -1) {
                        StringBuilder U = opT.U("to use ConstraintTag view ");
                        U.append(childAt.getClass().getSimpleName());
                        U.append(" must have an ID");
                        Log.w("ConstraintHelper", U.toString());
                    } else {
                        v(childAt.getId());
                    }
                }
            }
        }
    }

    public final int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.R.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f6430R, this.e);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f6427R;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.v;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f6427R = str;
        if (str != null) {
            int i = 0;
            this.e = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    R(str.substring(i));
                    return;
                } else {
                    R(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.v = str;
        if (str != null) {
            int i = 0;
            this.e = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    c(str.substring(i));
                    return;
                } else {
                    c(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f6427R = null;
        this.e = 0;
        for (int i : iArr) {
            v(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f6427R == null) {
            v(i);
        }
    }

    public final void v(int i) {
        if (i != getId()) {
            int i2 = this.e + 1;
            int[] iArr = this.f6430R;
            if (i2 > iArr.length) {
                this.f6430R = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f6430R;
            int i3 = this.e;
            iArr2[i3] = i;
            this.e = i3 + 1;
        }
    }

    public nYC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6430R = new int[32];
        this.f6428R = new HashMap();
        this.R = context;
        X(attributeSet);
    }
}
