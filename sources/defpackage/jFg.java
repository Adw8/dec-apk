package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: jFg  reason: default package */
/* loaded from: classes.dex */
public final class jFg implements j5I {
    public final f53 R;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f4893R = new LinkedHashMap();

    public jFg(f53 f53) {
        this.R = f53;
    }

    @Override // defpackage.j5I
    public final boolean Z(Object obj, Object obj2) {
        return n3x.v(this.R.v(obj), this.R.v(obj2));
    }

    @Override // defpackage.j5I
    public final void c(dMX dmx) {
        this.f4893R.clear();
        Iterator it = dmx.iterator();
        while (it.hasNext()) {
            Object v = this.R.v(it.next());
            Integer num = (Integer) this.f4893R.get(v);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                this.f4893R.put(v, Integer.valueOf(intValue + 1));
            }
        }
    }
}
