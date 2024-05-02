package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int X;
    public final int e;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iTI.i);
        this.X = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.e = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
