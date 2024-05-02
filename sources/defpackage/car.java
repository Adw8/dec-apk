package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* renamed from: car  reason: default package */
/* loaded from: classes.dex */
public final class car {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public Object f2152R;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public Object f2153v;

    public car(Context context, XmlResourceParser xmlResourceParser) {
        this.f2152R = new ArrayList();
        this.v = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), gvP.Z);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.R = obtainStyledAttributes.getResourceId(index, this.R);
            } else if (index == 1) {
                this.v = obtainStyledAttributes.getResourceId(index, this.v);
                String resourceTypeName = context.getResources().getResourceTypeName(this.v);
                context.getResources().getResourceName(this.v);
                if ("layout".equals(resourceTypeName)) {
                    nsw nsw = new nsw();
                    this.f2153v = nsw;
                    nsw.v((ConstraintLayout) LayoutInflater.from(context).inflate(this.v, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ car(iOp iop, CV cv) {
        this.f2152R = new SparseArray();
        this.f2153v = iop;
        this.R = cv.y(26, 0);
        this.v = cv.y(47, 0);
    }
}
