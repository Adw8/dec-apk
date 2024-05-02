package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: eiV  reason: default package */
/* loaded from: classes.dex */
public final class eiV extends e9E {
    public String e;

    public eiV(jFk jfk) {
        super(jfk);
    }

    @Override // defpackage.e9E
    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof eiV) && super.equals(obj) && n3x.v(this.e, ((eiV) obj).e);
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
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, l1r.v);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.e = string;
        }
        obtainAttributes.recycle();
    }

    @Override // defpackage.e9E
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.e;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
