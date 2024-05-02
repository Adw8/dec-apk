package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* renamed from: wI  reason: default package */
/* loaded from: classes.dex */
public final class wI extends e9E {
    public Intent R;
    public String e;

    public wI(jFk jfk) {
        super(jfk);
    }

    @Override // defpackage.e9E
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof wI) || !super.equals(obj)) {
            return false;
        }
        Intent intent = this.R;
        return (intent != null ? intent.filterEquals(((wI) obj).R) : ((wI) obj).R == null) && n3x.v(this.e, ((wI) obj).e);
    }

    @Override // defpackage.e9E
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Intent intent = this.R;
        int i = 0;
        int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return filterHashCode + i;
    }

    @Override // defpackage.e9E
    public final void t(Context context, AttributeSet attributeSet) {
        super.t(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, o02.f6651R);
        String string = obtainAttributes.getString(4);
        if (string != null) {
            string = iH_.a(string, "${applicationId}", context.getPackageName());
        }
        if (this.R == null) {
            this.R = new Intent();
        }
        this.R.setPackage(string);
        String string2 = obtainAttributes.getString(0);
        if (string2 != null) {
            if (string2.charAt(0) == '.') {
                string2 = context.getPackageName() + string2;
            }
            ComponentName componentName = new ComponentName(context, string2);
            if (this.R == null) {
                this.R = new Intent();
            }
            this.R.setComponent(componentName);
        }
        String string3 = obtainAttributes.getString(1);
        if (this.R == null) {
            this.R = new Intent();
        }
        this.R.setAction(string3);
        String string4 = obtainAttributes.getString(2);
        if (string4 != null) {
            Uri parse = Uri.parse(string4);
            if (this.R == null) {
                this.R = new Intent();
            }
            this.R.setData(parse);
        }
        this.e = obtainAttributes.getString(3);
        obtainAttributes.recycle();
    }

    @Override // defpackage.e9E
    public final String toString() {
        Intent intent = this.R;
        String str = null;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.R;
            if (intent2 != null) {
                str = intent2.getAction();
            }
            if (str != null) {
                sb.append(" action=");
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
