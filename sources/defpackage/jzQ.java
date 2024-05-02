package defpackage;

/* renamed from: jzQ  reason: default package */
/* loaded from: classes.dex */
public final class jzQ {
    public static final jzQ R = new jzQ();
    public static final jzQ v = new jzQ();

    /* renamed from: R  reason: collision with other field name */
    public final biT f5170R = new biT(new mkt[16]);

    public final Boolean R(kg9 kg9) {
        if (n3x.v(this, v)) {
            return Boolean.FALSE;
        }
        if (n3x.v(this, R)) {
            return null;
        }
        biT bit = this.f5170R;
        int i = bit.e;
        boolean z = false;
        if (i > 0) {
            Object[] objArr = bit.f1772R;
            int i2 = 0;
            boolean z2 = false;
            do {
                pi1 x = ((mkt) objArr[i2]).x();
                if (x != null) {
                    z2 = ((Boolean) kg9.x(x)).booleanValue() || z2;
                }
                i2++;
            } while (i2 < i);
            z = z2;
        }
        return Boolean.valueOf(z);
    }

    public final void v() {
        if (this.f5170R.H()) {
            R(nqF.j);
            return;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }
}
