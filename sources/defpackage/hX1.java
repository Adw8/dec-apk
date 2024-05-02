package defpackage;

import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: hX1  reason: default package */
/* loaded from: classes.dex */
public final class hX1 implements Comparator {

    /* renamed from: R  reason: collision with other field name */
    public final dq f4293R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4294R;
    public final Rect R = new Rect();
    public final Rect v = new Rect();

    public hX1(boolean z, dq dqVar) {
        this.f4294R = z;
        this.f4293R = dqVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Rect rect = this.R;
        Rect rect2 = this.v;
        this.f4293R.getClass();
        ((jG) obj).e(rect);
        this.f4293R.getClass();
        ((jG) obj2).e(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        if (i3 < i4) {
            return this.f4294R ? 1 : -1;
        }
        if (i3 > i4) {
            return this.f4294R ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return this.f4294R ? 1 : -1;
        }
        if (i7 > i8) {
            return this.f4294R ? -1 : 1;
        }
        return 0;
    }
}
