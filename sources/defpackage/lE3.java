package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: lE3  reason: default package */
/* loaded from: classes.dex */
public final class lE3 extends e9E implements hVC {
    public String e;

    public lE3(jFk jfk) {
        super(jfk);
    }

    @Override // defpackage.e9E
    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof lE3) && super.equals(obj) && n3x.v(this.e, ((lE3) obj).e);
    }

    @Override // defpackage.e9E
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.e9E
    public final void t(Context context, AttributeSet attributeSet) {
        super.t(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, l1r.f5541R);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.e = string;
        }
        obtainAttributes.recycle();
    }
}
