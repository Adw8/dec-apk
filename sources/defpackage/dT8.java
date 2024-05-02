package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@mEz("navigation")
/* renamed from: dT8  reason: default package */
/* loaded from: classes.dex */
public class dT8 extends jFk {
    public final hFh R;

    public dT8(hFh hfh) {
        this.R = hfh;
    }

    @Override // defpackage.jFk
    public final e9E R() {
        return new f25(this);
    }

    @Override // defpackage.jFk
    public final void e(List list, ixU ixu) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j5B j5b = (j5B) it.next();
            f25 f25 = (f25) j5b.f4822R;
            Bundle bundle = j5b.f4820R;
            int i = f25.O;
            String str2 = f25.X;
            if (!((i == 0 && str2 == null) ? false : true)) {
                StringBuilder U = opT.U("no start destination defined via app:startDestination for ");
                int i2 = ((e9E) f25).e;
                if (i2 != 0) {
                    str = ((e9E) f25).v;
                    if (str == null) {
                        str = String.valueOf(i2);
                    }
                } else {
                    str = "the root navigation";
                }
                U.append(str);
                throw new IllegalStateException(U.toString().toString());
            }
            e9E o = str2 != null ? f25.o(str2, false) : f25.V(i, false);
            if (o == null) {
                if (f25.e == null) {
                    String str3 = f25.X;
                    if (str3 == null) {
                        str3 = String.valueOf(f25.O);
                    }
                    f25.e = str3;
                }
                throw new IllegalArgumentException(jQ.C("navigation destination ", f25.e, " is not a direct child of this NavGraph"));
            }
            jFk v = this.R.v(o.f2986R);
            ebT v2 = v();
            Bundle v3 = o.v(bundle);
            int i3 = j5B.e;
            mpr mpr = v2.f3159R;
            v.e(Collections.singletonList(aYa.m(mpr.f6176R, o, v3, mpr.m(), v2.f3159R.f6179R)), ixu);
        }
    }
}
