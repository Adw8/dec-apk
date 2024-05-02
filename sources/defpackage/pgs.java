package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: pgs  reason: default package */
/* loaded from: classes.dex */
public final class pgs implements View.OnLayoutChangeListener {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f7162R;

    public /* synthetic */ pgs(int i, Object obj) {
        this.R = i;
        this.f7162R = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        switch (this.R) {
            case 0:
                SearchView searchView = (SearchView) this.f7162R;
                if (searchView.e.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f1123v.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean R = oJF.R(searchView);
                    if (searchView.f1116c) {
                        i9 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left);
                    }
                    searchView.f1104R.getDropDownBackground().getPadding(rect);
                    searchView.f1104R.setDropDownHorizontalOffset(R ? -rect.left : paddingLeft - (rect.left + i9));
                    searchView.f1104R.setDropDownWidth((((searchView.e.getWidth() + rect.left) + rect.right) + i9) - paddingLeft);
                    return;
                }
                return;
            case 1:
                ((BottomAppBar$Behavior) this.f7162R).getClass();
                throw null;
            default:
                j3y j3y = (j3y) this.f7162R;
                int i10 = j3y.H;
                j3y.getClass();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                j3y.x = iArr[0];
                view.getWindowVisibleDisplayFrame(j3y.f4813R);
                return;
        }
    }
}
