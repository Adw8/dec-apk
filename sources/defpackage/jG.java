package defpackage;

import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;

/* renamed from: jG  reason: default package */
/* loaded from: classes.dex */
public final class jG {

    /* renamed from: R  reason: collision with other field name */
    public final AccessibilityNodeInfo f4895R;
    public int R = -1;
    public int v = -1;

    public jG(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f4895R = accessibilityNodeInfo;
    }

    public final void H(CharSequence charSequence) {
        this.f4895R.setText(charSequence);
    }

    public final void L(CharSequence charSequence) {
        this.f4895R.setClassName(charSequence);
    }

    public final CharSequence O() {
        if (!(!c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f4895R.getText();
        }
        ArrayList c = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList c2 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList c3 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList c4 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f4895R.getText(), 0, this.f4895R.getText().length()));
        for (int i = 0; i < c.size(); i++) {
            spannableString.setSpan(new It(((Integer) c4.get(i)).intValue(), this, this.f4895R.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c.get(i)).intValue(), ((Integer) c2.get(i)).intValue(), ((Integer) c3.get(i)).intValue());
        }
        return spannableString;
    }

    public final void R(int i) {
        this.f4895R.addAction(i);
    }

    public final CharSequence X() {
        return this.f4895R.getStateDescription();
    }

    public final void Z(iWF iwf) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4895R;
        if (iwf == null) {
            collectionInfo = null;
        } else {
            iwf.getClass();
            collectionInfo = null;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public final ArrayList c(String str) {
        ArrayList<Integer> integerArrayList = this.f4895R.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f4895R.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final void e(Rect rect) {
        this.f4895R.getBoundsInParent(rect);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jG)) {
            return false;
        }
        jG jGVar = (jG) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4895R;
        if (accessibilityNodeInfo == null) {
            if (jGVar.f4895R != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(jGVar.f4895R)) {
            return false;
        }
        return this.v == jGVar.v && this.R == jGVar.R;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4895R;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void m(boolean z) {
        this.f4895R.setScrollable(z);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x015d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 708
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jG.toString():java.lang.String");
    }

    public final void v(Ex ex) {
        this.f4895R.addAction((AccessibilityNodeInfo.AccessibilityAction) ex.f111R);
    }

    public final void x(CharSequence charSequence) {
        this.f4895R.setStateDescription(charSequence);
    }
}
