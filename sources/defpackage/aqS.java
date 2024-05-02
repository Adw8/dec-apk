package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* renamed from: aqS  reason: default package */
/* loaded from: classes.dex */
public final class aqS extends U1 {
    public final /* synthetic */ dqt R;

    public aqS(dqt dqt) {
        this.R = dqt;
    }

    @Override // defpackage.U1
    public final int R() {
        return this.R.f2900R.groupCount() + 1;
    }

    @Override // defpackage.U1, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj == null ? true : obj instanceof ixT)) {
            return false;
        }
        return super.contains((ixT) obj);
    }

    @Override // defpackage.U1, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return iOY.a(dF.a(new heu(0, R() - 1)), new mox(22, this)).iterator();
    }

    public final ixT v(int i) {
        Matcher matcher = this.R.f2900R;
        heu V = caw.V(matcher.start(i), matcher.end(i));
        if (Integer.valueOf(V.e).intValue() >= 0) {
            return new ixT(this.R.f2900R.group(i), V);
        }
        return null;
    }
}
