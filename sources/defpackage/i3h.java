package defpackage;

/* renamed from: i3h  reason: default package */
/* loaded from: classes.dex */
public final class i3h extends mjG implements cNa {
    public final vV R;

    public i3h(vV vVVar) {
        this.R = vVVar;
    }

    @Override // defpackage.cNa
    public final Object b(Object obj) {
        oG1 og1 = obj instanceof oG1 ? (oG1) obj : null;
        if (og1 == null) {
            og1 = new oG1();
        }
        og1.f6718R = new lpN(this.R);
        return og1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i3h i3h = obj instanceof i3h ? (i3h) obj : null;
        if (i3h == null) {
            return false;
        }
        return n3x.v(this.R, i3h.R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        StringBuilder U = opT.U("HorizontalAlignModifier(horizontal=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
