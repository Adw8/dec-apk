package defpackage;

/* renamed from: nvD  reason: default package */
/* loaded from: classes.dex */
public final class nvD extends k49 {
    public final /* synthetic */ k49 R;

    public nvD(k49 k49) {
        this.R = k49;
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        this.R.O(mot, obj);
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        if (csz.W() != 7) {
            return this.R.R(csz);
        }
        String d = csz.d();
        return iH_.h(d, '.') ? Double.valueOf(Double.parseDouble(d)) : Long.valueOf(Long.parseLong(d));
    }
}
