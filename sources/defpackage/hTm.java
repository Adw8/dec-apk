package defpackage;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* renamed from: hTm  reason: default package */
/* loaded from: classes.dex */
public final class hTm implements Comparator {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f4272R;

    public /* synthetic */ hTm(int i, Object obj) {
        this.R = i;
        this.f4272R = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.R) {
            case 0:
                return ((aLq) obj).e - ((aLq) obj2).e;
            default:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return compareTo2 != 0 ? compareTo2 : Integer.valueOf(((MaterialButtonToggleGroup) this.f4272R).indexOfChild(materialButton)).compareTo(Integer.valueOf(((MaterialButtonToggleGroup) this.f4272R).indexOfChild(materialButton2)));
        }
    }
}
