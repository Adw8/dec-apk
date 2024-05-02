package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.timepicker.e;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int X = 0;

    /* renamed from: R  reason: collision with other field name */
    public Integer[] f2302R;
    public boolean c;
    public final int e;
    public boolean v;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f2298R = new ArrayList();
    public final gL6 R = new gL6(this);

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f2300R = new LinkedHashSet();

    /* renamed from: R  reason: collision with other field name */
    public final hTm f2297R = new hTm(1, this);

    /* renamed from: R  reason: collision with other field name */
    public boolean f2301R = false;

    /* renamed from: R  reason: collision with other field name */
    public HashSet f2299R = new HashSet();

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(dgk.R(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2132018184), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray w = aH9.w(getContext(), attributeSet, hDC.V, R.attr.materialButtonToggleGroupStyle, 2132018184, new int[0]);
        setSingleSelection(w.getBoolean(2, false));
        this.e = w.getResourceId(0, -1);
        this.c = w.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        w.recycle();
        WeakHashMap weakHashMap = of5.f6887R;
        mHC.t(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (e(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (e(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && e(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = of5.f6887R;
            materialButton.setId(eHQ.R());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.R);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void O() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton c = c(i);
            if (c.getVisibility() != 8) {
                dOE shapeAppearanceModel = c.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                nBP nbp = new nBP(shapeAppearanceModel);
                lV1 lv1 = (lV1) this.f2298R.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i == firstVisibleChildIndex) {
                        if (!z) {
                            jfq jfq = lv1.f5757R;
                            SO so = lV1.R;
                            lv1 = new lV1(jfq, so, lv1.v, so);
                        } else if (vd.J(this)) {
                            SO so2 = lV1.R;
                            lv1 = new lV1(so2, so2, lv1.v, lv1.c);
                        } else {
                            jfq jfq2 = lv1.f5757R;
                            jfq jfq3 = lv1.e;
                            SO so3 = lV1.R;
                            lv1 = new lV1(jfq2, jfq3, so3, so3);
                        }
                    } else if (i != lastVisibleChildIndex) {
                        lv1 = null;
                    } else if (!z) {
                        SO so4 = lV1.R;
                        lv1 = new lV1(so4, lv1.e, so4, lv1.c);
                    } else if (vd.J(this)) {
                        jfq jfq4 = lv1.f5757R;
                        jfq jfq5 = lv1.e;
                        SO so5 = lV1.R;
                        lv1 = new lV1(jfq4, jfq5, so5, so5);
                    } else {
                        SO so6 = lV1.R;
                        lv1 = new lV1(so6, so6, lv1.v, lv1.c);
                    }
                }
                if (lv1 == null) {
                    nbp.c(0.0f);
                } else {
                    nbp.f6342R = lv1.f5757R;
                    nbp.f6346e = lv1.e;
                    nbp.f6348v = lv1.v;
                    nbp.f6344c = lv1.c;
                }
                c.setShapeAppearanceModel(new dOE(nbp));
            }
        }
    }

    public final void R() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton c = c(i);
                int min = Math.min(c.getStrokeWidth(), c(i - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
                if (getOrientation() == 0) {
                    j2q.L(layoutParams2, 0);
                    j2q.Z(layoutParams2, -min);
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.bottomMargin = 0;
                    layoutParams2.topMargin = -min;
                    j2q.Z(layoutParams2, 0);
                }
                c.setLayoutParams(layoutParams2);
            }
            if (!(getChildCount() == 0 || firstVisibleChildIndex == -1)) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                j2q.L(layoutParams3, 0);
                j2q.Z(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public final void X(Set set) {
        HashSet hashSet = this.f2299R;
        this.f2299R = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = c(i).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f2301R = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f2301R = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f2300R.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).R();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        v(materialButton.getId(), materialButton.isChecked());
        dOE shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f2298R.add(new lV1(shapeAppearanceModel.f2591R, shapeAppearanceModel.f2595e, shapeAppearanceModel.f2597v, shapeAppearanceModel.f2593c));
        of5.O(materialButton, new bWR(this, 0));
    }

    public final MaterialButton c(int i) {
        return (MaterialButton) getChildAt(i);
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2297R);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(c(i), Integer.valueOf(i));
        }
        this.f2302R = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final boolean e(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public int getCheckedButtonId() {
        if (!this.v || this.f2299R.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f2299R.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = c(i).getId();
            if (this.f2299R.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f2302R;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.e;
        if (i != -1) {
            X(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.v ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        O();
        R();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f2298R.remove(indexOfChild);
        }
        O();
        R();
    }

    public void setSelectionRequired(boolean z) {
        this.c = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.v != z) {
            this.v = z;
            X(new HashSet());
        }
    }

    public final void v(int i, boolean z) {
        if (i == -1) {
            Log.e("MaterialButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f2299R);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.v && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (!z && hashSet.contains(Integer.valueOf(i))) {
            if (!this.c || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        } else {
            return;
        }
        X(hashSet);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
