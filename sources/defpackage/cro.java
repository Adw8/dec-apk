package defpackage;

/* renamed from: cro  reason: default package */
/* loaded from: classes.dex */
public final class cro extends bLS implements hUt {
    public cro(int i) {
        super(1, Integer.MAX_VALUE, h9.DROP_OLDEST);
        c(Integer.valueOf(i));
    }

    @Override // defpackage.hUt
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = ((bLS) this).f1608R;
            valueOf = Integer.valueOf(((Number) objArr[((int) ((((bLS) this).R + ((long) ((int) ((j() + ((long) this.Z)) - ((bLS) this).R)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }
}
