package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: Bu  reason: default package */
/* loaded from: classes.dex */
public final class Bu {
    public int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public final XmlPullParser f45R;

    public Bu(XmlResourceParser xmlResourceParser) {
        this.f45R = xmlResourceParser;
    }

    public final float R(TypedArray typedArray, String str, int i, float f) {
        float V = hDC.V(typedArray, this.f45R, str, i, f);
        c(typedArray.getChangingConfigurations());
        return V;
    }

    public final void c(int i) {
        this.R = i | this.R;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bu)) {
            return false;
        }
        Bu bu = (Bu) obj;
        return n3x.v(this.f45R, bu.f45R) && this.R == bu.R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R) + (this.f45R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("AndroidVectorParser(xmlParser=");
        U.append(this.f45R);
        U.append(", config=");
        return jQ.P(U, this.R, ')');
    }

    public final String v(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        c(typedArray.getChangingConfigurations());
        return string;
    }
}
