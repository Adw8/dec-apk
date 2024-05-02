package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: j5N  reason: default package */
/* loaded from: classes.dex */
public final class j5N {
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public int f4830R;
    public float c;
    public float e;
    public float v;

    public j5N(Context context, XmlResourceParser xmlResourceParser) {
        this.R = Float.NaN;
        this.v = Float.NaN;
        this.c = Float.NaN;
        this.e = Float.NaN;
        this.f4830R = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), gvP.x);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f4830R = obtainStyledAttributes.getResourceId(index, this.f4830R);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f4830R);
                context.getResources().getResourceName(this.f4830R);
                if ("layout".equals(resourceTypeName)) {
                    new nsw().v((ConstraintLayout) LayoutInflater.from(context).inflate(this.f4830R, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.e = obtainStyledAttributes.getDimension(index, this.e);
            } else if (index == 2) {
                this.v = obtainStyledAttributes.getDimension(index, this.v);
            } else if (index == 3) {
                this.c = obtainStyledAttributes.getDimension(index, this.c);
            } else if (index == 4) {
                this.R = obtainStyledAttributes.getDimension(index, this.R);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
