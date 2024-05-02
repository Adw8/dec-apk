package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* renamed from: n8l  reason: default package */
/* loaded from: classes.dex */
public final class n8l {
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public int f6318R;

    /* renamed from: R  reason: collision with other field name */
    public String f6319R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6320R;
    public int c;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f6321v;

    public n8l(String str, int i, Object obj, boolean z) {
        this.f6318R = i;
        this.f6320R = z;
        v(obj);
    }

    public static void R(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), gvP.e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z = false;
        Object obj = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            i = 7;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else if (index == 3) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i = 3;
            } else if (index == 2) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i = 4;
            } else if (index == 7) {
                obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
            } else if (index == 4) {
                obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
            } else if (index == 5) {
                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                i = 2;
            } else if (index == 6) {
                obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                i = 1;
            } else if (index == 9) {
                obj = obtainStyledAttributes.getString(index);
                i = 5;
            } else {
                i = 8;
                if (index == 8) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    obj = Integer.valueOf(resourceId);
                }
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new n8l(str, i, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    public final void v(Object obj) {
        switch (jQ.I(this.f6318R)) {
            case 0:
            case 7:
                this.v = ((Integer) obj).intValue();
                return;
            case 1:
                this.R = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.c = ((Integer) obj).intValue();
                return;
            case 4:
                this.f6319R = (String) obj;
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                this.f6321v = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.R = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public n8l(n8l n8l, Object obj) {
        this.f6320R = false;
        n8l.getClass();
        this.f6318R = n8l.f6318R;
        v(obj);
    }
}
