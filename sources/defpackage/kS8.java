package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: kS8  reason: default package */
/* loaded from: classes.dex */
public final class kS8 extends h9X {
    public final ViewGroup R;

    /* renamed from: R  reason: collision with other field name */
    public final ImageView f5292R;

    /* renamed from: R  reason: collision with other field name */
    public final TextView f5293R;
    public final TextView c;
    public final View v;

    /* renamed from: v  reason: collision with other field name */
    public final TextView f5294v;

    public kS8(View view, int i) {
        super(view);
        this.v = view.findViewById(R.id.map_icon_frame);
        this.f5292R = (ImageView) view.findViewById(16908294);
        TextView textView = (TextView) view.findViewById(16908310);
        this.f5293R = textView;
        this.f5294v = (TextView) view.findViewById(16908304);
        TextView textView2 = (TextView) view.findViewById(R.id.map_badge);
        this.c = textView2;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.map_widget_frame);
        this.R = viewGroup;
        if (viewGroup != null) {
            viewGroup.getChildAt(0);
        }
        TypedArray obtainStyledAttributes = view.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.mapAccentTextColor, R.attr.colorAccent});
        ColorStateList colorStateList = obtainStyledAttributes.getIndexCount() > 0 ? obtainStyledAttributes.getColorStateList(obtainStyledAttributes.getIndex(0)) : null;
        obtainStyledAttributes.recycle();
        colorStateList = colorStateList == null ? ColorStateList.valueOf(-16777216) : colorStateList;
        if (i == -3 || i == -2) {
            textView.setTextColor(colorStateList);
        }
        if (textView2 != null) {
            textView2.setTextColor(colorStateList);
            textView2.setBackgroundTintList(colorStateList);
            textView2.setBackgroundTintMode(PorterDuff.Mode.SRC_ATOP);
        }
    }

    public static void g(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount() - 1;
            if (childCount >= 0) {
                while (true) {
                    int i = childCount - 1;
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt != null) {
                        g(childAt, z);
                        if (i >= 0) {
                            childCount = i;
                        } else {
                            return;
                        }
                    } else {
                        StringBuilder C = opT.C("Index: ", childCount, ", Size: ");
                        C.append(viewGroup.getChildCount());
                        throw new IndexOutOfBoundsException(C.toString());
                    }
                }
            }
        }
    }
}
