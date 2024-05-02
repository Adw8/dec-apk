package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static glG R;

    /* renamed from: R  reason: collision with other field name */
    public SparseArray f1250R = new SparseArray();

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f1251R = new ArrayList(4);

    /* renamed from: R  reason: collision with other field name */
    public m_b f1254R = new m_b();
    public int e = 0;
    public int X = 0;
    public int O = Integer.MAX_VALUE;
    public int L = Integer.MAX_VALUE;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1257R = true;
    public int Z = 257;

    /* renamed from: R  reason: collision with other field name */
    public nsw f1255R = null;

    /* renamed from: R  reason: collision with other field name */
    public nul f1256R = null;
    public int m = -1;

    /* renamed from: R  reason: collision with other field name */
    public HashMap f1252R = new HashMap();
    public SparseArray v = new SparseArray();

    /* renamed from: R  reason: collision with other field name */
    public kQB f1253R = new kQB(this, this);

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Z(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static glG getSharedValues() {
        if (R == null) {
            R = new glG();
        }
        return R;
    }

    public final void H(kwo kwo, nki nki, SparseArray sparseArray, int i, icY icy) {
        View view = (View) this.f1250R.get(i);
        kwo kwo2 = (kwo) sparseArray.get(i);
        if (kwo2 != null && view != null && (view.getLayoutParams() instanceof nki)) {
            nki.f6541O = true;
            icY icy2 = icY.BASELINE;
            if (icy == icy2) {
                nki nki2 = (nki) view.getLayoutParams();
                nki2.f6541O = true;
                nki2.f6544R.f5484L = true;
            }
            kwo.L(icy2).R(kwo2.L(icy), nki.I, nki.h);
            kwo.f5484L = true;
            kwo.L(icY.TOP).L();
            kwo.L(icY.BOTTOM).L();
        }
    }

    public final kwo L(View view) {
        if (view == this) {
            return this.f1254R;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof nki) {
            return ((nki) view.getLayoutParams()).f6544R;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof nki) {
            return ((nki) view.getLayoutParams()).f6544R;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean U() {
        /*
        // Method dump skipped, instructions count: 1396
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.U():boolean");
    }

    public final void Z(AttributeSet attributeSet, int i) {
        m_b m_b = this.f1254R;
        ((kwo) m_b).f5492R = this;
        kQB kqb = this.f1253R;
        m_b.f6064R = kqb;
        m_b.f6065R.f5750R = kqb;
        this.f1250R.put(getId(), this);
        this.f1255R = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gvP.v, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 17) {
                    this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                } else if (index == 14) {
                    this.O = obtainStyledAttributes.getDimensionPixelOffset(index, this.O);
                } else if (index == 15) {
                    this.L = obtainStyledAttributes.getDimensionPixelOffset(index, this.L);
                } else if (index == 113) {
                    this.Z = obtainStyledAttributes.getInt(index, this.Z);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.f1256R = new nul(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1256R = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        nsw nsw = new nsw();
                        this.f1255R = nsw;
                        nsw.X(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1255R = null;
                    }
                    this.m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        m_b m_b2 = this.f1254R;
        m_b2.S = this.Z;
        fhh.c = m_b2.E(512);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof nki;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1251R;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((nYC) this.f1251R.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) i4;
                        float f3 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1257R = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new nki();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new nki(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.L;
    }

    public int getMaxWidth() {
        return this.O;
    }

    public int getMinHeight() {
        return this.X;
    }

    public int getMinWidth() {
        return this.e;
    }

    public int getOptimizationLevel() {
        return this.f1254R.S;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (((kwo) this.f1254R).f5493R == null) {
            int id2 = getId();
            if (id2 != -1) {
                ((kwo) this.f1254R).f5493R = getContext().getResources().getResourceEntryName(id2);
            } else {
                ((kwo) this.f1254R).f5493R = "parent";
            }
        }
        m_b m_b = this.f1254R;
        if (((kwo) m_b).f5517v == null) {
            ((kwo) m_b).f5517v = ((kwo) m_b).f5493R;
            StringBuilder U = opT.U(" setDebugName ");
            U.append(((kwo) this.f1254R).f5517v);
            Log.v("ConstraintLayout", U.toString());
        }
        Iterator it = ((hqD) this.f1254R).v.iterator();
        while (it.hasNext()) {
            kwo kwo = (kwo) it.next();
            View view = (View) kwo.f5492R;
            if (view != null) {
                if (kwo.f5493R == null && (id = view.getId()) != -1) {
                    kwo.f5493R = getContext().getResources().getResourceEntryName(id);
                }
                if (kwo.f5517v == null) {
                    kwo.f5517v = kwo.f5493R;
                    StringBuilder U2 = opT.U(" setDebugName ");
                    U2.append(kwo.f5517v);
                    Log.v("ConstraintLayout", U2.toString());
                }
            }
        }
        this.f1254R.U(sb);
        return sb.toString();
    }

    public final boolean m() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            nki nki = (nki) childAt.getLayoutParams();
            kwo kwo = nki.f6544R;
            if (childAt.getVisibility() != 8 || nki.f6539L || nki.f6549Z || isInEditMode) {
                int j = kwo.j();
                int g = kwo.g();
                childAt.layout(j, g, kwo.P() + j, kwo.m() + g);
            }
        }
        int size = this.f1251R.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((nYC) this.f1251R.get(i6)).getClass();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0582  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x070c  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x070f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018f  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r23, int r24) {
        /*
        // Method dump skipped, instructions count: 1812
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        kwo L = L(view);
        if ((view instanceof Guideline) && !(L instanceof gOm)) {
            nki nki = (nki) view.getLayoutParams();
            gOm gom = new gOm();
            nki.f6544R = gom;
            nki.f6539L = true;
            gom.G(nki.r);
        }
        if (view instanceof nYC) {
            nYC nyc = (nYC) view;
            nyc.O();
            ((nki) view.getLayoutParams()).f6549Z = true;
            if (!this.f1251R.contains(nyc)) {
                this.f1251R.add(nyc);
            }
        }
        this.f1250R.put(view.getId(), view);
        this.f1257R = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1250R.remove(view.getId());
        kwo L = L(view);
        ((hqD) this.f1254R).v.remove(L);
        L.I();
        this.f1251R.remove(view);
        this.f1257R = true;
    }

    @Override // android.view.ViewParent, android.view.View
    public final void requestLayout() {
        this.f1257R = true;
        super.requestLayout();
    }

    public void setConstraintSet(nsw nsw) {
        this.f1255R = nsw;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f1250R.remove(getId());
        super.setId(i);
        this.f1250R.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.L) {
            this.L = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.O) {
            this.O = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.X) {
            this.X = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.e) {
            this.e = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(jzf jzf) {
        nul nul = this.f1256R;
        if (nul != null) {
            nul.e = jzf;
        }
    }

    public void setOptimizationLevel(int i) {
        this.Z = i;
        m_b m_b = this.f1254R;
        m_b.S = i;
        fhh.c = m_b.E(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void x(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f1252R == null) {
                this.f1252R = new HashMap();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1252R.put(str, Integer.valueOf(num.intValue()));
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new nki(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Z(attributeSet, i);
    }
}
