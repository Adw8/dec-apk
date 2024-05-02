package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: dgk  reason: default package */
/* loaded from: classes.dex */
public abstract class dgk {

    /* renamed from: R  reason: collision with other field name */
    public static nUO f2820R;

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f2821R = {16842752, R.attr.theme};

    /* renamed from: v  reason: collision with other field name */
    public static final int[] f2825v = {R.attr.materialThemeOverlay};

    /* renamed from: c  reason: collision with other field name */
    public static final int[] f2823c = {16842960, R.attr.destination, R.attr.enterAnim, R.attr.exitAnim, R.attr.launchSingleTop, R.attr.popEnterAnim, R.attr.popExitAnim, R.attr.popUpTo, R.attr.popUpToInclusive, R.attr.popUpToSaveState, R.attr.restoreState};

    /* renamed from: e  reason: collision with other field name */
    public static final int[] f2824e = {16842755, 16843245, R.attr.argType, R.attr.nullable};

    /* renamed from: X  reason: collision with other field name */
    public static final int[] f2822X = {16844014, R.attr.action, R.attr.mimeType, R.attr.uri};

    /* renamed from: O  reason: collision with other field name */
    public static final int[] f2819O = {R.attr.startDestination};

    /* renamed from: L  reason: collision with other field name */
    public static final int[] f2818L = {16842753, 16842960, R.attr.route};
    public static cQP R = new cQP(1, 2, 0);
    public static cQP v = new cQP(3, 4, 1);
    public static cQP c = new cQP(4, 5, 2);
    public static cQP e = new cQP(6, 7, 3);
    public static cQP X = new cQP(7, 8, 4);
    public static cQP O = new cQP(8, 9, 5);
    public static cQP L = new cQP(11, 12, 6);

    public static Context R(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2825v, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof iOa) && ((iOa) context).R == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        iOa ioa = new iOa(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f2821R);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        resourceId2 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
        }
        if (resourceId2 != 0) {
            ioa.getTheme().applyStyle(resourceId2, true);
        }
        return ioa;
    }
}
