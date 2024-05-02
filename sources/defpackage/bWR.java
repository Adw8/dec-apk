package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* renamed from: bWR  reason: default package */
/* loaded from: classes.dex */
public final class bWR extends G5 {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ View f1718R;

    public /* synthetic */ bWR(View view, int i) {
        this.R = i;
        this.f1718R = view;
    }

    @Override // defpackage.G5
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.R) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1718R).isChecked());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // defpackage.G5
    public final void e(View view, jG jGVar) {
        switch (this.R) {
            case 0:
                ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f1718R;
                int i = MaterialButtonToggleGroup.X;
                materialButtonToggleGroup.getClass();
                int i2 = -1;
                if (view instanceof MaterialButton) {
                    i2 = 0;
                    for (int i3 = 0; i3 < materialButtonToggleGroup.getChildCount(); i3++) {
                        if (materialButtonToggleGroup.getChildAt(i3) == view) {
                            jGVar.f4895R.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i2, 1, false, ((MaterialButton) view).isChecked()));
                            return;
                        }
                        if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.e(i3)) {
                            i2++;
                        }
                    }
                }
                jGVar.f4895R.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i2, 1, false, ((MaterialButton) view).isChecked()));
                return;
            case 1:
                ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
                jGVar.f4895R.setCheckable(((CheckableImageButton) this.f1718R).c);
                jGVar.f4895R.setChecked(((CheckableImageButton) this.f1718R).isChecked());
                return;
            default:
                ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
                jGVar.f4895R.setCheckable(((NavigationMenuItemView) this.f1718R).O);
                return;
        }
    }
}
