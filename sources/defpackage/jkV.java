package defpackage;

/* renamed from: jkV  reason: default package */
/* loaded from: classes.dex */
public final class jkV extends Uk {
    public final /* synthetic */ dqt R;

    public jkV(dqt dqt) {
        this.R = dqt;
    }

    @Override // defpackage.U1
    public final int R() {
        return this.R.f2900R.groupCount() + 1;
    }

    @Override // defpackage.U1, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.contains((String) obj);
    }

    @Override // defpackage.Uk, java.util.List
    public final Object get(int i) {
        String group = this.R.f2900R.group(i);
        return group == null ? "" : group;
    }

    @Override // defpackage.Uk, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.indexOf((String) obj);
    }

    @Override // defpackage.Uk, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.lastIndexOf((String) obj);
    }
}
